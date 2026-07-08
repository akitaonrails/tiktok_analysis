package com.tiktok.strategycenter.business;

import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public abstract class ITTMStarShipCommon {
    public static long sBdiFunctionAddress;
    public static ITTMStarShipCommon sInstance;

    public static native long nativeGetTTMStarShipBdiFunctionAddress();

    public abstract TTMParamData ttmStarShipRunPitayaTask(String str, Map<String, Object> map, long j);

    public static long getTTMStarShipBdiFunctionAddress() {
        return sBdiFunctionAddress;
    }

    public static long registerTTMStartShipCommon(ITTMStarShipCommon iTTMStarShipCommon) {
        if (!TTMStrategyCenter.getIsEnable()) {
            return 0L;
        }
        sInstance = iTTMStarShipCommon;
        long jNativeGetTTMStarShipBdiFunctionAddress = nativeGetTTMStarShipBdiFunctionAddress();
        sBdiFunctionAddress = jNativeGetTTMStarShipBdiFunctionAddress;
        return jNativeGetTTMStarShipBdiFunctionAddress;
    }

    public static TTMParamData nativeRunPitayaTask(String str, Map<String, Object> map, long j) {
        ITTMStarShipCommon iTTMStarShipCommon = sInstance;
        if (iTTMStarShipCommon != null) {
            return iTTMStarShipCommon.ttmStarShipRunPitayaTask(str, map, j);
        }
        return null;
    }
}
