package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEVidResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEVidResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEVidResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEVidResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public String getVid() {
        return NLEEditorJniJNI.NLEVidResourceProtocol_getVid(this.swigCPtr, this);
    }

    public static String KEY_VID() {
        return NLEEditorJniJNI.NLEVidResourceProtocol_KEY_VID();
    }

    public static String PLATFORM_STRING() {
        return NLEEditorJniJNI.NLEVidResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public NLEVidResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLEVidResourceProtocol(str), true);
    }

    public static NLEVidResourceProtocol constructFromResourceId(String str) {
        long jNLEVidResourceProtocol_constructFromResourceId = NLEEditorJniJNI.NLEVidResourceProtocol_constructFromResourceId(str);
        if (jNLEVidResourceProtocol_constructFromResourceId == 0) {
            return null;
        }
        return new NLEVidResourceProtocol(jNLEVidResourceProtocol_constructFromResourceId, true);
    }

    public static long getCPtr(NLEVidResourceProtocol nLEVidResourceProtocol) {
        if (nLEVidResourceProtocol == null) {
            return 0L;
        }
        return nLEVidResourceProtocol.swigCPtr;
    }

    public static boolean isVidResource(String str) {
        return NLEEditorJniJNI.NLEVidResourceProtocol_isVidResource(str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEVidResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLEVidResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
