package com.ss.ttlivestreamer.livestreamv2.videoquality.controler;

import X.EnumC804650VhP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class VideoQualityStrategyManagerV2$setNetworkTypeCode$1$WhenMappings {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC804650VhP.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC804650VhP.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        LIZ = iArr;
    }
}
