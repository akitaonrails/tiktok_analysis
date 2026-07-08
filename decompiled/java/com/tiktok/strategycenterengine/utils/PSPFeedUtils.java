package com.tiktok.strategycenterengine.utils;

import X.C04TD;
import com.tiktok.strategycenterengineimpl.utils.PSPFeedUtilsDelegate;

/* JADX INFO: loaded from: classes36.dex */
public abstract class PSPFeedUtils {
    public static IFeedUtils delegate;

    public abstract long feePauseTime(String str);

    public abstract long feeStopTime(String str);

    public abstract long feedStartTime(String str, long j, boolean z);

    static {
        IFeedUtils iFeedUtils;
        Object objLIZ = C04TD.LIZ(IFeedUtils.class, false);
        if (objLIZ != null) {
            iFeedUtils = (IFeedUtils) objLIZ;
        } else {
            if (C04TD.i7 == null) {
                synchronized (IFeedUtils.class) {
                    if (C04TD.i7 == null) {
                        C04TD.i7 = new PSPFeedUtilsDelegate();
                    }
                }
            }
            iFeedUtils = C04TD.i7;
        }
        delegate = iFeedUtils;
    }

    public static void setInstance(PSPFeedUtils pSPFeedUtils) {
        delegate.LIZ(pSPFeedUtils);
    }
}
