package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEEverPhotoResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEEverPhotoResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEEverPhotoResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String KEY_EXTENSION() {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_KEY_EXTENSION();
    }

    public static String KEY_MD5() {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_KEY_MD5();
    }

    public static String KEY_SIZE() {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_KEY_SIZE();
    }

    public static String PLATFORM_STRING() {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEverPhotoResourceProtocol nLEEverPhotoResourceProtocol) {
        if (nLEEverPhotoResourceProtocol == null) {
            return 0L;
        }
        return nLEEverPhotoResourceProtocol.swigCPtr;
    }

    public static boolean isEverPhotoResource(String str) {
        return NLEEditorJniJNI.NLEEverPhotoResourceProtocol_isEverPhotoResource(str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEEverPhotoResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLEEverPhotoResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public NLEEverPhotoResourceProtocol(String str, long j, String str2) {
        this(NLEEditorJniJNI.new_NLEEverPhotoResourceProtocol(str, j, str2), true);
    }
}
