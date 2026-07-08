package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEAIMatting extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEAIMatting(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEAIMatting_clone = NLEEditorJniJNI.NLEAIMatting_clone(this.swigCPtr, this);
        if (jNLEAIMatting_clone == 0) {
            return null;
        }
        return new NLENode(jNLEAIMatting_clone, true);
    }

    public NLESegmentAIMatting getSegment() {
        long jNLEAIMatting_getSegment = NLEEditorJniJNI.NLEAIMatting_getSegment(this.swigCPtr, this);
        if (jNLEAIMatting_getSegment == 0) {
            return null;
        }
        return new NLESegmentAIMatting(jNLEAIMatting_getSegment, true);
    }

    public NLEAIMatting() {
        this(NLEEditorJniJNI.new_NLEAIMatting(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEAIMatting dynamicCast(NLENode nLENode) {
        long jNLEAIMatting_dynamicCast = NLEEditorJniJNI.NLEAIMatting_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEAIMatting_dynamicCast == 0) {
            return null;
        }
        return new NLEAIMatting(jNLEAIMatting_dynamicCast, true);
    }

    public static long getCPtr(NLEAIMatting nLEAIMatting) {
        if (nLEAIMatting == null) {
            return 0L;
        }
        return nLEAIMatting.swigCPtr;
    }

    public void setSegment(NLESegmentAIMatting nLESegmentAIMatting) {
        NLEEditorJniJNI.NLEAIMatting_setSegment(this.swigCPtr, this, NLESegmentAIMatting.getCPtr(nLESegmentAIMatting), nLESegmentAIMatting);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEAIMatting(long j, boolean z) {
        super(NLEEditorJniJNI.NLEAIMatting_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
