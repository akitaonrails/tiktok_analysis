package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEBase64ResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEBase64ResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEBase64ResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEBase64ResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String KEY_BASE64() {
        return NLEEditorJniJNI.NLEBase64ResourceProtocol_KEY_BASE64();
    }

    public static String PLATFORM_STRING() {
        return NLEEditorJniJNI.NLEBase64ResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public NLEBase64ResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLEBase64ResourceProtocol(str), true);
    }

    public static long getCPtr(NLEBase64ResourceProtocol nLEBase64ResourceProtocol) {
        if (nLEBase64ResourceProtocol == null) {
            return 0L;
        }
        return nLEBase64ResourceProtocol.swigCPtr;
    }

    public static boolean isBase64Resource(String str) {
        return NLEEditorJniJNI.NLEBase64ResourceProtocol_isBase64Resource(str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEBase64ResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLEBase64ResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
