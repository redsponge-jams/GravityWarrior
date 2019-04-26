package com.redsponge.upsidedownbb.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

import java.lang.reflect.Field;

public class FieldSlider extends Slider {

    private Object connectedObject;
    private Field connectedField;

    public FieldSlider(float min, float max, float stepSize, boolean vertical, Skin skin, Class<?> connectedClass, Object connectedObject, String fieldName) {
        super(min, max, stepSize, vertical, skin);

        this.connectedObject = connectedObject;
        try {
            this.connectedField = connectedClass.getField(fieldName);
            int val = (int) connectedField.get(connectedObject);
            setValue(val);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            Gdx.app.exit();
        }

        addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                setValue((int) getValue());
            }
        });

    }

    private void setValue(int value) {
        try {
            connectedField.set(connectedObject, value);
            super.setValue(value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            Gdx.app.exit();
        }
    }
}