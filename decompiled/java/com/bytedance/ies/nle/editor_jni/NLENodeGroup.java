package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLENodeGroup extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLENodeGroup(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLENodeGroup_clone = NLEEditorJniJNI.NLENodeGroup_clone(this.swigCPtr, this);
        if (jNLENodeGroup_clone == 0) {
            return null;
        }
        return new NLENode(jNLENodeGroup_clone, true);
    }

    public NLENodeGroup() {
        this(NLEEditorJniJNI.new_NLENodeGroup(), true);
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

    public static NLENodeGroup dynamicCast(NLENode nLENode) {
        long jNLENodeGroup_dynamicCast = NLEEditorJniJNI.NLENodeGroup_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLENodeGroup_dynamicCast == 0) {
            return null;
        }
        return new NLENodeGroup(jNLENodeGroup_dynamicCast, true);
    }

    public static long getCPtr(NLENodeGroup nLENodeGroup) {
        if (nLENodeGroup == null) {
            return 0L;
        }
        return nLENodeGroup.swigCPtr;
    }

    public void addObject(NLENode nLENode) {
        NLEEditorJniJNI.NLENodeGroup_addObject(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public boolean addToWorking(NLENode nLENode) {
        return NLEEditorJniJNI.NLENodeGroup_addToWorking(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
    }

    public boolean removeObject(NLENode nLENode) {
        return NLEEditorJniJNI.NLENodeGroup_removeObject(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLENodeGroup(long j, boolean z) {
        super(NLEEditorJniJNI.NLENodeGroup_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
