package com.redsponge.upsidedownbb.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Holds all asset descriptors for the project
 */
public class AssetDescBin {

    public static final class SplashScreen {
        public static final AssetDescriptor<TextureAtlas> atlas = new AssetDescriptor<TextureAtlas>("splashscreen/splashscreen.atlas", TextureAtlas.class);
    }

    public static final class Fonts {
        public static final AssetDescriptor<BitmapFont> pixelmix = new AssetDescriptor<BitmapFont>("fonts/pixelmix.fnt", BitmapFont.class);
    }

    public static final class Boss {
        public static final AssetDescriptor<TextureAtlas> frames = new AssetDescriptor<TextureAtlas>("textures/boss/frames.atlas", TextureAtlas.class);
        public static final AssetDescriptor<TextureAtlas> powers = new AssetDescriptor<TextureAtlas>("textures/boss/powers.atlas", TextureAtlas.class);
    }

    public static final class Enemy {
        public static final AssetDescriptor<TextureAtlas> unpowered = new AssetDescriptor<TextureAtlas>("textures/enemy/unpowered.atlas", TextureAtlas.class);
        public static final AssetDescriptor<TextureAtlas> poweredOverlay = new AssetDescriptor<TextureAtlas>("textures/enemy/powered.atlas", TextureAtlas.class);
    }

    public static final class Background {
        public static final AssetDescriptor<Texture> arena = new AssetDescriptor<Texture>("textures/background/arena.png", Texture.class);
        public static final AssetDescriptor<Texture> sky = new AssetDescriptor<Texture>("textures/background/sky.png", Texture.class);
    }

}
