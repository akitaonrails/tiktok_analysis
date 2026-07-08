package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMask extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEMask(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEMask_clone = NLEEditorJniJNI.NLEMask_clone(this.swigCPtr, this);
        if (jNLEMask_clone == 0) {
            return null;
        }
        return new NLENode(jNLEMask_clone, true);
    }

    public NLESegmentMask getSegment() {
        long jNLEMask_getSegment = NLEEditorJniJNI.NLEMask_getSegment(this.swigCPtr, this);
        if (jNLEMask_getSegment == 0) {
            return null;
        }
        return new NLESegmentMask(jNLEMask_getSegment, true);
    }

    public NLEMask() {
        this(NLEEditorJniJNI.new_NLEMask(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEMask dynamicCast(NLENode nLENode) {
        long jNLEMask_dynamicCast = NLEEditorJniJNI.NLEMask_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEMask_dynamicCast == 0) {
            return null;
        }
        return new NLEMask(jNLEMask_dynamicCast, true);
    }

    public static long getCPtr(NLEMask nLEMask) {
        if (nLEMask == null) {
            return 0L;
        }
        return nLEMask.swigCPtr;
    }

    public void setSegment(NLESegmentMask nLESegmentMask) {
        NLEEditorJniJNI.NLEMask_setSegment(this.swigCPtr, this, NLESegmentMask.getCPtr(nLESegmentMask), nLESegmentMask);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMask(long j, boolean z) {
        super(NLEEditorJniJNI.NLEMask_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
