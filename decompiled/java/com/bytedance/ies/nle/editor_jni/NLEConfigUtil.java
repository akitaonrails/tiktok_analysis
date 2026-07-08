package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEConfigUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEConfigUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEConfigUtil() {
        this(NLEMediaPublicJniJNI.new_NLEConfigUtil(), true);
    }

    public static boolean enableFixCallback() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableFixCallback();
    }

    public static boolean enableInvalidParamMonitor() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableInvalidParamMonitor();
    }

    public static boolean enableSeekDoneAndRenderCallbackOpt() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt();
    }

    public static boolean enableSetDataSourceOptFix() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSetDataSourceOptFix();
    }

    public static boolean enableSetDataSourceOptFix2() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSetDataSourceOptFix2();
    }

    public static boolean enableSetDataSourceOptIgnoreEditorMode() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSetDataSourceOptIgnoreEditorMode();
    }

    public static boolean enableSetDataSourceOptSkipMultiPhoto() {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSetDataSourceOptSkipMultiPhoto();
    }

    public void finalize() {
        delete();
    }

    public static void disableSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t) {
        NLEMediaPublicJniJNI.NLEConfigUtil_disableSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t.getCPtr(sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t));
    }

    public static boolean enableSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t) {
        return NLEMediaPublicJniJNI.NLEConfigUtil_enableSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t.getCPtr(sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t));
    }

    public static long getCPtr(NLEConfigUtil nLEConfigUtil) {
        if (nLEConfigUtil == null) {
            return 0L;
        }
        return nLEConfigUtil.swigCPtr;
    }

    public static void restoreSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t) {
        NLEMediaPublicJniJNI.NLEConfigUtil_restoreSetDataSourceOpt(SWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t.getCPtr(sWIGTYPE_p_std__shared_ptrT_vesdk__IVELocalEnvConfig_t));
    }

    public NLEConfigUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
