package com.tiktok.strategycenter.feature;

import com.tiktok.ttm.TTMContext;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureCenterManager {
    public static final FeatureCenterManager INSTANCE = new FeatureCenterManager();
    public static IFeatureCenterDataManager instance;

    public final IFeatureCenterDataManager getInstance$ttm_strategy_center_release() {
        return instance;
    }

    public final void setInstance$ttm_strategy_center_release(IFeatureCenterDataManager iFeatureCenterDataManager) {
        instance = iFeatureCenterDataManager;
    }

    public static final long nativeGetBooleanFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LIZIZ(str, str2, tTMContext);
        }
        return Long.MAX_VALUE;
    }

    public static final Object nativeGetDictFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LIZLLL(str, str2, str3, tTMContext);
        }
        return null;
    }

    public static final double nativeGetDoubleFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LIZ(str, str2, str3, tTMContext);
        }
        return Double.MAX_VALUE;
    }

    public static final long nativeGetIntFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LJI(str, str2, str3, tTMContext);
        }
        return Long.MAX_VALUE;
    }

    public static final Object nativeGetListFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LIZJ(str, str2, str3, tTMContext);
        }
        return null;
    }

    public static final Object nativeGetObjectFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LJ(str, str2, str3, tTMContext);
        }
        return null;
    }

    public static final String nativeGetStringFeature(String str, String str2, String str3, TTMContext tTMContext) {
        IFeatureCenterDataManager iFeatureCenterDataManager = instance;
        if (iFeatureCenterDataManager != null) {
            return iFeatureCenterDataManager.LJFF(str, str2, str3, tTMContext);
        }
        return null;
    }
}
