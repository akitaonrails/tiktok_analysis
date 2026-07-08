package com.bytedance.lynx.service.trail;

import X.C1285920jZG;
import com.lynx.tasm.service.ILynxTrailService;

/* JADX INFO: loaded from: classes21.dex */
public class TrailServiceBridge {
    public static native void nativeCleanCache();

    public static String getValueByKey(String str) {
        ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
        if (iLynxTrailService != null) {
            return iLynxTrailService.stringValueForTrailKey(str);
        }
        return null;
    }
}
