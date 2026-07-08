package com.ss.lyrax.audio;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum LyraxAudioAlignmentMode {
    OFF(0),
    MIXING(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxAudioAlignmentMode fromId(int i) {
        for (LyraxAudioAlignmentMode lyraxAudioAlignmentMode : values()) {
            if (lyraxAudioAlignmentMode.value() == i) {
                return lyraxAudioAlignmentMode;
            }
        }
        return OFF;
    }

    public static LyraxAudioAlignmentMode valueOf(String str) {
        return (LyraxAudioAlignmentMode) C08FF.LIZ(LyraxAudioAlignmentMode.class, str);
    }

    LyraxAudioAlignmentMode(int i) {
        this.value = i;
    }
}
