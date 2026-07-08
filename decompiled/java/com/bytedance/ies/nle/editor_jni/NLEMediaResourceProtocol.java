package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMediaResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEMediaResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEMediaResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String getEXTRA_AUTO_UNZIP() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_AUTO_UNZIP_get();
    }

    public static String getEXTRA_EXTRA_INFO() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_EXTRA_INFO_get();
    }

    public static String getEXTRA_FILE_URL() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_FILE_URL_get();
    }

    public static String getEXTRA_MD5() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_MD5_get();
    }

    public static String getEXTRA_MEDIA_EXTENSION() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_MEDIA_EXTENSION_get();
    }

    public static String getEXTRA_PARAM_CACHE_DIR() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_CACHE_DIR_get();
    }

    public static String getEXTRA_PARAM_CHANNEL_ID() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_CHANNEL_ID_get();
    }

    public static String getEXTRA_PARAM_DELETE_LOCAL_RES() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_get();
    }

    public static String getEXTRA_PARAM_DELETE_LOCAL_RES_RECORD() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_RECORD_get();
    }

    public static String getEXTRA_PARAM_DELETE_REMOTE_RES() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_REMOTE_RES_get();
    }

    public static String getEXTRA_PARAM_MEDIA_ITEM() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_MEDIA_ITEM_get();
    }

    public static String getEXTRA_PARAM_SOURCE_PATH() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_EXTRA_PARAM_SOURCE_PATH_get();
    }

    public static String getKEY_MEDIA_ID() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_KEY_MEDIA_ID_get();
    }

    public static String getKEY_STORE_ID() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_KEY_STORE_ID_get();
    }

    public static String getPLATFORM_STRING() {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_PLATFORM_STRING_get();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public NLEMediaResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLEMediaResourceProtocol__SWIG_0(str), true);
    }

    public static long getCPtr(NLEMediaResourceProtocol nLEMediaResourceProtocol) {
        if (nLEMediaResourceProtocol == null) {
            return 0L;
        }
        return nLEMediaResourceProtocol.swigCPtr;
    }

    public static boolean isMediaResource(String str) {
        return NLEEditorJniJNI.NLEMediaResourceProtocol_isMediaResource(str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMediaResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLEMediaResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public NLEMediaResourceProtocol(String str, String str2) {
        this(NLEEditorJniJNI.new_NLEMediaResourceProtocol__SWIG_1(str, str2), true);
    }
}
