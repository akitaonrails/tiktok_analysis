package com.bytedance.ies.effecteditor.abtest.swig;

/* JADX INFO: loaded from: classes36.dex */
public class EffectEditorABTestJniJNI {
    public static final native boolean EEABTestGetter_ameAutoRenderEnable(long j, EEABTestGetter eEABTestGetter);

    public static final native boolean EEABTestGetter_ameDisableFeatureExportOverwrite(long j, EEABTestGetter eEABTestGetter);

    public static final native int EEABTestGetter_ameEEAssetLoadOptimizationType(long j, EEABTestGetter eEABTestGetter);

    public static final native boolean EEABTestGetter_ameEnableEditMode(long j, EEABTestGetter eEABTestGetter);

    public static final native boolean EEABTestGetter_ameMakeupMaterialMultiInstantiationViaAMG(long j, EEABTestGetter eEABTestGetter);

    public static final native boolean EEABTestGetter_ameSupportDynamicAsset(long j, EEABTestGetter eEABTestGetter);

    public static final native int EEABTestGetter_ameVFSOptimizationType(long j, EEABTestGetter eEABTestGetter);

    public static final native void EEABTestGetter_change_ownership(EEABTestGetter eEABTestGetter, long j, boolean z);

    public static final native void EEABTestGetter_director_connect(EEABTestGetter eEABTestGetter, long j, boolean z, boolean z2);

    public static final native boolean EEABTestGetter_enableExportStickerUseEffectForMET(long j, EEABTestGetter eEABTestGetter);

    public static final native void EEABTestManagerCore_registerABTestGetterPtr(long j, EEABTestGetter eEABTestGetter);

    public static final native void delete_EEABTestGetter(long j);

    public static final native void delete_EEABTestManagerCore(long j);

    public static final native long new_EEABTestGetter();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static boolean SwigDirector_EEABTestGetter_ameAutoRenderEnable(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameAutoRenderEnable();
    }

    public static boolean SwigDirector_EEABTestGetter_ameDisableFeatureExportOverwrite(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameDisableFeatureExportOverwrite();
    }

    public static int SwigDirector_EEABTestGetter_ameEEAssetLoadOptimizationType(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameEEAssetLoadOptimizationType();
    }

    public static boolean SwigDirector_EEABTestGetter_ameEnableEditMode(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameEnableEditMode();
    }

    public static boolean SwigDirector_EEABTestGetter_ameMakeupMaterialMultiInstantiationViaAMG(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameMakeupMaterialMultiInstantiationViaAMG();
    }

    public static boolean SwigDirector_EEABTestGetter_ameSupportDynamicAsset(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameSupportDynamicAsset();
    }

    public static int SwigDirector_EEABTestGetter_ameVFSOptimizationType(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.ameVFSOptimizationType();
    }

    public static boolean SwigDirector_EEABTestGetter_enableExportStickerUseEffectForMET(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.enableExportStickerUseEffectForMET();
    }
}
