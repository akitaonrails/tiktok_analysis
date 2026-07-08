package com.bytedance.pumbaa.utility.service;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class BPEATransmitConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enableAsyncTaskHook")
    public final boolean enableAsyncTaskHook;

    @C09CT("enableCoW")
    public final boolean enableCoW;

    @C09CT("enableCoroutineHook")
    public final boolean enableCoroutineHook;

    @C09CT("enableHandlerHook")
    public final boolean enableHandlerHook;

    @C09CT("enableHandlerReflectHook")
    public final boolean enableHandlerReflectHook;

    @C09CT("enableHandlerThreadHook")
    public final boolean enableHandlerThreadHook;

    @C09CT("enableIntentServiceHook")
    public final boolean enableIntentServiceHook;

    @C09CT("enableJobIntentServiceHook")
    public final boolean enableJobIntentServiceHook;

    @C09CT("enableMsgObjHook")
    public final boolean enableMsgObjHook;

    @C09CT("enableObjPool")
    public final boolean enableObjPool;

    @C09CT("enableThreadHook")
    public final boolean enableThreadHook;

    @C09CT("enableThreadPoolHook")
    public final boolean enableThreadPoolHook;

    @C09CT("enableTimerHook")
    public final boolean enableTimerHook;

    @C09CT("enableWorkManagerHook")
    public final boolean enableWorkManagerHook;

    @C09CT("handlerOptimizeMode")
    public final int handlerOptimizeMode;

    @C09CT("objPoolSize")
    public final int objPoolSize;

    public BPEATransmitConfig() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, 0, false, true, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BPEATransmitConfig)) {
            return false;
        }
        BPEATransmitConfig bPEATransmitConfig = (BPEATransmitConfig) obj;
        return this.enable == bPEATransmitConfig.enable && this.enableThreadHook == bPEATransmitConfig.enableThreadHook && this.enableHandlerThreadHook == bPEATransmitConfig.enableHandlerThreadHook && this.enableAsyncTaskHook == bPEATransmitConfig.enableAsyncTaskHook && this.enableHandlerHook == bPEATransmitConfig.enableHandlerHook && this.enableThreadPoolHook == bPEATransmitConfig.enableThreadPoolHook && this.enableCoroutineHook == bPEATransmitConfig.enableCoroutineHook && this.enableTimerHook == bPEATransmitConfig.enableTimerHook && this.enableIntentServiceHook == bPEATransmitConfig.enableIntentServiceHook && this.enableJobIntentServiceHook == bPEATransmitConfig.enableJobIntentServiceHook && this.enableWorkManagerHook == bPEATransmitConfig.enableWorkManagerHook && this.enableHandlerReflectHook == bPEATransmitConfig.enableHandlerReflectHook && this.handlerOptimizeMode == bPEATransmitConfig.handlerOptimizeMode && this.enableObjPool == bPEATransmitConfig.enableObjPool && this.enableMsgObjHook == bPEATransmitConfig.enableMsgObjHook && this.objPoolSize == bPEATransmitConfig.objPoolSize && this.enableCoW == bPEATransmitConfig.enableCoW;
    }

    public BPEATransmitConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, boolean z13, boolean z14, int i2, boolean z15) {
        this.enable = z;
        this.enableThreadHook = z2;
        this.enableHandlerThreadHook = z3;
        this.enableAsyncTaskHook = z4;
        this.enableHandlerHook = z5;
        this.enableThreadPoolHook = z6;
        this.enableCoroutineHook = z7;
        this.enableTimerHook = z8;
        this.enableIntentServiceHook = z9;
        this.enableJobIntentServiceHook = z10;
        this.enableWorkManagerHook = z11;
        this.enableHandlerReflectHook = z12;
        this.handlerOptimizeMode = i;
        this.enableObjPool = z13;
        this.enableMsgObjHook = z14;
        this.objPoolSize = i2;
        this.enableCoW = z15;
    }
}
