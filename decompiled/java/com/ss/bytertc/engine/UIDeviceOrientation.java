package com.ss.bytertc.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum UIDeviceOrientation {
    Portrait(0),
    LandscapeLeft(90),
    PortraitUpsidedown(180),
    LandscapeRight(270);

    public int value;

    public int value() {
        return this.value;
    }

    public static UIDeviceOrientation valueOf(String str) {
        return (UIDeviceOrientation) C08FF.LIZ(UIDeviceOrientation.class, str);
    }

    UIDeviceOrientation(int i) {
        this.value = i;
    }
}
