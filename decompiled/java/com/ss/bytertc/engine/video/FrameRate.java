package com.ss.bytertc.engine.video;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum FrameRate {
    FRAME_RATE_FPS_1(1),
    FRAME_RATE_FPS_7(7),
    FRAME_RATE_FPS_10(10),
    FRAME_RATE_FPS_15(15),
    FRAME_RATE_FPS_24(24),
    FRAME_RATE_FPS_30(30);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static FrameRate valueOf(String str) {
        return (FrameRate) C08FF.LIZ(FrameRate.class, str);
    }

    FrameRate(int i) {
        this.value = i;
    }
}
