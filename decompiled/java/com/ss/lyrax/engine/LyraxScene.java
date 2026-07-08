package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxScene {
    NONE(0),
    LIVE(1),
    LINKMIC(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxScene fromId(int i) {
        for (LyraxScene lyraxScene : values()) {
            if (lyraxScene.value() == i) {
                return lyraxScene;
            }
        }
        return LIVE;
    }

    public static LyraxScene valueOf(String str) {
        return (LyraxScene) C08FF.LIZ(LyraxScene.class, str);
    }

    LyraxScene(int i) {
        this.val = i;
    }
}
