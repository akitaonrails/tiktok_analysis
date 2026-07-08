package com.ss.lyrax.net;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LyraxNetProberLevel {
    K480p(1),
    K540p(2),
    K720p(3),
    K1080p(4);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetProberLevel valueOf(String str) {
        return (LyraxNetProberLevel) C08FF.LIZ(LyraxNetProberLevel.class, str);
    }

    LyraxNetProberLevel(int i) {
        this.val = i;
    }
}
