package com.redsponge.upsidedownbb.game.intro;

public enum IntroState {

    PART_1("{SLOW}This is {VAR=playerName} the great,{WAIT} They posses a very{COLOR=CYAN}{WAVE} powerful item"),
    PART_2("{SLOW}A {WAVE}{COLOR=CYAN}gravity shirt{ENDWAVE}{CLEARCOLOR},\n which gives its owner the ability to switch gravity!{WAIT} (kinda self explanatory :P)"),
    PART_3("{SLOW}They searched the land looking for worthy foes{WAIT}.{WAIT}.{WAIT}."),
    PART_4("{SLOW}And finally{WAIT}.{WAIT}.{WAIT}. they found one.")
    ;

    private final String caption;

    IntroState(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }
}
