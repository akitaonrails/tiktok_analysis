package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum RtcScene {
    RTC_SCENE_NONE(0),
    RTC_SCENE_LIVE(1),
    RTC_SCENE_LINK_MIC(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static RtcScene valueOf(String str) {
        return (RtcScene) C08FF.LIZ(RtcScene.class, str);
    }

    RtcScene(int i) {
        this.value = i;
    }
}
