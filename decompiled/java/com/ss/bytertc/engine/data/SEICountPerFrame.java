package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum SEICountPerFrame {
    SEI_COUNT_PER_FRAME_SINGLE(0),
    SEI_COUNT_PER_FRAME_MULTI(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SEICountPerFrame fromId(int i) {
        for (SEICountPerFrame sEICountPerFrame : values()) {
            if (sEICountPerFrame.value() == i) {
                return sEICountPerFrame;
            }
        }
        return null;
    }

    public static SEICountPerFrame valueOf(String str) {
        return (SEICountPerFrame) C08FF.LIZ(SEICountPerFrame.class, str);
    }

    SEICountPerFrame(int i) {
        this.value = i;
    }
}
