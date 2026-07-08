package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMVExternalAlgorithmResult extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEMVExternalAlgorithmResult(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEMVExternalAlgorithmResult_clone = NLEEditorJniJNI.NLEMVExternalAlgorithmResult_clone(this.swigCPtr, this);
        if (jNLEMVExternalAlgorithmResult_clone == 0) {
            return null;
        }
        return new NLENode(jNLEMVExternalAlgorithmResult_clone, true);
    }

    public String getAlgorithmName() {
        return NLEEditorJniJNI.NLEMVExternalAlgorithmResult_getAlgorithmName(this.swigCPtr, this);
    }

    public NLEResourceNode getMask() {
        long jNLEMVExternalAlgorithmResult_getMask = NLEEditorJniJNI.NLEMVExternalAlgorithmResult_getMask(this.swigCPtr, this);
        if (jNLEMVExternalAlgorithmResult_getMask == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEMVExternalAlgorithmResult_getMask, true);
    }

    public NLEResourceNode getPhoto() {
        long jNLEMVExternalAlgorithmResult_getPhoto = NLEEditorJniJNI.NLEMVExternalAlgorithmResult_getPhoto(this.swigCPtr, this);
        if (jNLEMVExternalAlgorithmResult_getPhoto == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEMVExternalAlgorithmResult_getPhoto, true);
    }

    public int getResultInType() {
        return NLEEditorJniJNI.NLEMVExternalAlgorithmResult_getResultInType(this.swigCPtr, this);
    }

    public boolean hasAlgorithmName() {
        return NLEEditorJniJNI.NLEMVExternalAlgorithmResult_hasAlgorithmName(this.swigCPtr, this);
    }

    public boolean hasResultInType() {
        return NLEEditorJniJNI.NLEMVExternalAlgorithmResult_hasResultInType(this.swigCPtr, this);
    }

    public NLEMVExternalAlgorithmResult() {
        this(NLEEditorJniJNI.new_NLEMVExternalAlgorithmResult(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEMVExternalAlgorithmResult dynamicCast(NLENode nLENode) {
        long jNLEMVExternalAlgorithmResult_dynamicCast = NLEEditorJniJNI.NLEMVExternalAlgorithmResult_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEMVExternalAlgorithmResult_dynamicCast == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(jNLEMVExternalAlgorithmResult_dynamicCast, true);
    }

    public static long getCPtr(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        if (nLEMVExternalAlgorithmResult == null) {
            return 0L;
        }
        return nLEMVExternalAlgorithmResult.swigCPtr;
    }

    public void setAlgorithmName(String str) {
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setAlgorithmName(this.swigCPtr, this, str);
    }

    public void setMask(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setMask(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setPhoto(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setPhoto(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setResultInType(int i) {
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setResultInType(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMVExternalAlgorithmResult(long j, boolean z) {
        super(NLEEditorJniJNI.NLEMVExternalAlgorithmResult_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
