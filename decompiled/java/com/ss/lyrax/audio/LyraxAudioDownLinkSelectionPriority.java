package com.ss.lyrax.audio;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum LyraxAudioDownLinkSelectionPriority {
    NORMAL(0),
    MEDIUM(1),
    HIGH(2),
    CRITICAL(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxAudioDownLinkSelectionPriority fromId(int i) {
        for (LyraxAudioDownLinkSelectionPriority lyraxAudioDownLinkSelectionPriority : values()) {
            if (lyraxAudioDownLinkSelectionPriority.value() == i) {
                return lyraxAudioDownLinkSelectionPriority;
            }
        }
        return NORMAL;
    }

    public static LyraxAudioDownLinkSelectionPriority valueOf(String str) {
        return (LyraxAudioDownLinkSelectionPriority) C08FF.LIZ(LyraxAudioDownLinkSelectionPriority.class, str);
    }

    LyraxAudioDownLinkSelectionPriority(int i) {
        this.value = i;
    }
}
