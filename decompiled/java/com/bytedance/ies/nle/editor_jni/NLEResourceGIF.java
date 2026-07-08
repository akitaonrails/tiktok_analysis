package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceGIF extends NLEResourceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEResourceGIF(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEResourceGIF_clone = NLEEditorJniJNI.NLEResourceGIF_clone(this.swigCPtr, this);
        if (jNLEResourceGIF_clone == 0) {
            return null;
        }
        return new NLENode(jNLEResourceGIF_clone, true);
    }

    public VecString getResourceFiles() {
        return new VecString(NLEEditorJniJNI.NLEResourceGIF_getResourceFiles(this.swigCPtr, this), true);
    }

    public boolean hasResourceFiles() {
        return NLEEditorJniJNI.NLEResourceGIF_hasResourceFiles(this.swigCPtr, this);
    }

    public NLEResourceGIF() {
        this(NLEEditorJniJNI.new_NLEResourceGIF(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEResourceGIF dynamicCast(NLENode nLENode) {
        long jNLEResourceGIF_dynamicCast = NLEEditorJniJNI.NLEResourceGIF_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEResourceGIF_dynamicCast == 0) {
            return null;
        }
        return new NLEResourceGIF(jNLEResourceGIF_dynamicCast, true);
    }

    public static long getCPtr(NLEResourceGIF nLEResourceGIF) {
        if (nLEResourceGIF == null) {
            return 0L;
        }
        return nLEResourceGIF.swigCPtr;
    }

    public void setResourceFiles(VecString vecString) {
        NLEEditorJniJNI.NLEResourceGIF_setResourceFiles(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEResourceGIF(long j, boolean z) {
        super(NLEEditorJniJNI.NLEResourceGIF_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
