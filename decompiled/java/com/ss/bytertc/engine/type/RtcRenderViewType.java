package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum RtcRenderViewType {
    RTC_SURFACEVIEW,
    RTC_TEXTUREVIEW;

    public static RtcRenderViewType valueOf(String str) {
        return (RtcRenderViewType) C08FF.LIZ(RtcRenderViewType.class, str);
    }
}
