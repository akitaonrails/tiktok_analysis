package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceComposite extends NLEResourceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEResourceComposite(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEResourceComposite_clone = NLEEditorJniJNI.NLEResourceComposite_clone(this.swigCPtr, this);
        if (jNLEResourceComposite_clone == 0) {
            return null;
        }
        return new NLENode(jNLEResourceComposite_clone, true);
    }

    public NLENode getCompositeNode() {
        long jNLEResourceComposite_getCompositeNode = NLEEditorJniJNI.NLEResourceComposite_getCompositeNode(this.swigCPtr, this);
        if (jNLEResourceComposite_getCompositeNode == 0) {
            return null;
        }
        return new NLENode(jNLEResourceComposite_getCompositeNode, true);
    }

    public NLEResourceComposite() {
        this(NLEEditorJniJNI.new_NLEResourceComposite(), true);
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

    public static NLEResourceComposite dynamicCast(NLENode nLENode) {
        long jNLEResourceComposite_dynamicCast = NLEEditorJniJNI.NLEResourceComposite_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEResourceComposite_dynamicCast == 0) {
            return null;
        }
        return new NLEResourceComposite(jNLEResourceComposite_dynamicCast, true);
    }

    public static long getCPtr(NLEResourceComposite nLEResourceComposite) {
        if (nLEResourceComposite == null) {
            return 0L;
        }
        return nLEResourceComposite.swigCPtr;
    }

    public void setCompositeNode(NLENode nLENode) {
        NLEEditorJniJNI.NLEResourceComposite_setCompositeNode(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEResourceComposite(long j, boolean z) {
        super(NLEEditorJniJNI.NLEResourceComposite_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
