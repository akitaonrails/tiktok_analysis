package com.tiktok.strategycenterengineimpl.utils;

import com.tiktok.strategycenterengine.utils.PSPFeedUtils;

/* JADX INFO: loaded from: classes36.dex */
public class PSPFeedUtilsImpl {
    public static PSPFeedUtils instance;

    public static long nativeGetFeedPauseTime(String str) {
        PSPFeedUtils pSPFeedUtils = instance;
        if (pSPFeedUtils == null) {
            return 0L;
        }
        return pSPFeedUtils.feePauseTime(str);
    }

    public static long nativeGetFeedStopTime(String str) {
        PSPFeedUtils pSPFeedUtils = instance;
        if (pSPFeedUtils == null) {
            return 0L;
        }
        return pSPFeedUtils.feeStopTime(str);
    }

    public static void setInstance(PSPFeedUtils pSPFeedUtils) {
        instance = pSPFeedUtils;
    }

    public static long nativeGetFeedStartTime(String str, long j, boolean z) {
        PSPFeedUtils pSPFeedUtils = instance;
        if (pSPFeedUtils == null) {
            return 0L;
        }
        return pSPFeedUtils.feedStartTime(str, j, z);
    }
}
