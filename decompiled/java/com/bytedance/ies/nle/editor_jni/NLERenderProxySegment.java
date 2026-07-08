package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLERenderProxySegment extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLERenderProxySegment(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLERenderProxySegment_clone = NLEEditorJniJNI.NLERenderProxySegment_clone(this.swigCPtr, this);
        if (jNLERenderProxySegment_clone == 0) {
            return null;
        }
        return new NLENode(jNLERenderProxySegment_clone, true);
    }

    public NLEResourceAV getAVFile() {
        long jNLERenderProxySegment_getAVFile = NLEEditorJniJNI.NLERenderProxySegment_getAVFile(this.swigCPtr, this);
        if (jNLERenderProxySegment_getAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(jNLERenderProxySegment_getAVFile, true);
    }

    public NLEResourceNode getRenderConfigRes() {
        long jNLERenderProxySegment_getRenderConfigRes = NLEEditorJniJNI.NLERenderProxySegment_getRenderConfigRes(this.swigCPtr, this);
        if (jNLERenderProxySegment_getRenderConfigRes == 0) {
            return null;
        }
        return new NLEResourceNode(jNLERenderProxySegment_getRenderConfigRes, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLERenderProxySegment_getResource = NLEEditorJniJNI.NLERenderProxySegment_getResource(this.swigCPtr, this);
        if (jNLERenderProxySegment_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLERenderProxySegment_getResource, true);
    }

    public NLERenderProxySegment() {
        this(NLEEditorJniJNI.new_NLERenderProxySegment(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLERenderProxySegment dynamicCast(NLENode nLENode) {
        long jNLERenderProxySegment_dynamicCast = NLEEditorJniJNI.NLERenderProxySegment_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLERenderProxySegment_dynamicCast == 0) {
            return null;
        }
        return new NLERenderProxySegment(jNLERenderProxySegment_dynamicCast, true);
    }

    public static long getCPtr(NLERenderProxySegment nLERenderProxySegment) {
        if (nLERenderProxySegment == null) {
            return 0L;
        }
        return nLERenderProxySegment.swigCPtr;
    }

    public void setAVFile(NLEResourceAV nLEResourceAV) {
        NLEEditorJniJNI.NLERenderProxySegment_setAVFile(this.swigCPtr, this, NLEResourceAV.getCPtr(nLEResourceAV), nLEResourceAV);
    }

    public void setRenderConfigRes(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLERenderProxySegment_setRenderConfigRes(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLERenderProxySegment(long j, boolean z) {
        super(NLEEditorJniJNI.NLERenderProxySegment_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
