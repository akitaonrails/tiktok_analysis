package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMonitor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEMonitor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean hasListener() {
        return NLEEditorJniJNI.NLEMonitor_hasListener(this.swigCPtr, this);
    }

    public NLEMonitor() {
        this(NLEEditorJniJNI.new_NLEMonitor(), true);
    }

    public static String getKEY_API_MONITOR_CACHE_CLEAN() {
        return NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_CACHE_CLEAN_get();
    }

    public static String getKEY_API_MONITOR_CACHE_SAVE() {
        return NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_CACHE_SAVE_get();
    }

    public static String getKEY_API_MONITOR_COST() {
        return NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_COST_get();
    }

    public static String getKEY_API_MONITOR_THREAD() {
        return NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_THREAD_get();
    }

    public static String getKEY_NLEIMAGE_MEDIA_CONVERT() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLEIMAGE_MEDIA_CONVERT_get();
    }

    public static String getKEY_NLE_EDITOR_RESTORE() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_EDITOR_RESTORE_get();
    }

    public static String getKEY_NLE_EDITOR_STORE() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_EDITOR_STORE_get();
    }

    public static String getKEY_NLE_MEDIA_CONVERT() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_MEDIA_CONVERT_get();
    }

    public static String getKEY_NLE_MEDIA_PLAY() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_MEDIA_PLAY_get();
    }

    public static String getKEY_NLE_MEDIA_PLAY_FPS() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_MEDIA_PLAY_FPS_get();
    }

    public static String getKEY_NLE_SET_DATA_SOURCE() {
        return NLEEditorJniJNI.NLEMonitor_KEY_NLE_SET_DATA_SOURCE_get();
    }

    public static String getPARAM_API_COST_AVERAGE() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_API_COST_AVERAGE_get();
    }

    public static String getPARAM_API_COST_MAX() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_API_COST_MAX_get();
    }

    public static String getPARAM_API_COST_P90() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_API_COST_P90_get();
    }

    public static String getPARAM_API_NAME() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_API_NAME_get();
    }

    public static String getPARAM_API_THREAD_INFO() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_API_THREAD_INFO_get();
    }

    public static String getPARAM_ERROR_CODE() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_ERROR_CODE_get();
    }

    public static String getPARAM_ERROR_MSG() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_ERROR_MSG_get();
    }

    public static String getPARAM_NLE_JSON_SIZE() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_NLE_JSON_SIZE_get();
    }

    public static String getPARAM_TARGET_UUID() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_TARGET_UUID_get();
    }

    public static String getPARAM_UUID() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_UUID_get();
    }

    public static String getPARAM_VE_API() {
        return NLEEditorJniJNI.NLEMonitor_PARAM_VE_API_get();
    }

    public static NLEMonitor obtain() {
        long jNLEMonitor_obtain = NLEEditorJniJNI.NLEMonitor_obtain();
        if (jNLEMonitor_obtain == 0) {
            return null;
        }
        return new NLEMonitor(jNLEMonitor_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMonitor nLEMonitor) {
        if (nLEMonitor == null) {
            return 0L;
        }
        return nLEMonitor.swigCPtr;
    }

    public void setListener(INLEMonitor iNLEMonitor) {
        NLEEditorJniJNI.NLEMonitor_setListener(this.swigCPtr, this, INLEMonitor.getCPtr(iNLEMonitor), iNLEMonitor);
    }

    public NLEMonitor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onEvent(String str, int i, String str2) {
        NLEEditorJniJNI.NLEMonitor_onEvent__SWIG_1(this.swigCPtr, this, str, i, str2);
    }

    public void onEvent(String str, int i, String str2, long j) {
        NLEEditorJniJNI.NLEMonitor_onEvent__SWIG_0(this.swigCPtr, this, str, i, str2, j);
    }
}
