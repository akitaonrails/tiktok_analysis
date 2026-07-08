package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEAutoFillFrame extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEAutoFillFrame(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEAutoFillFrame_clone = NLEEditorJniJNI.NLEAutoFillFrame_clone(this.swigCPtr, this);
        if (jNLEAutoFillFrame_clone == 0) {
            return null;
        }
        return new NLENode(jNLEAutoFillFrame_clone, true);
    }

    public NLESegmentAutoFillFrame getSegment() {
        long jNLEAutoFillFrame_getSegment = NLEEditorJniJNI.NLEAutoFillFrame_getSegment(this.swigCPtr, this);
        if (jNLEAutoFillFrame_getSegment == 0) {
            return null;
        }
        return new NLESegmentAutoFillFrame(jNLEAutoFillFrame_getSegment, true);
    }

    public NLEAutoFillFrame() {
        this(NLEEditorJniJNI.new_NLEAutoFillFrame(), true);
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

    public static NLEAutoFillFrame dynamicCast(NLENode nLENode) {
        long jNLEAutoFillFrame_dynamicCast = NLEEditorJniJNI.NLEAutoFillFrame_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEAutoFillFrame_dynamicCast == 0) {
            return null;
        }
        return new NLEAutoFillFrame(jNLEAutoFillFrame_dynamicCast, true);
    }

    public static long getCPtr(NLEAutoFillFrame nLEAutoFillFrame) {
        if (nLEAutoFillFrame == null) {
            return 0L;
        }
        return nLEAutoFillFrame.swigCPtr;
    }

    public void setSegment(NLESegmentAutoFillFrame nLESegmentAutoFillFrame) {
        NLEEditorJniJNI.NLEAutoFillFrame_setSegment(this.swigCPtr, this, NLESegmentAutoFillFrame.getCPtr(nLESegmentAutoFillFrame), nLESegmentAutoFillFrame);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEAutoFillFrame(long j, boolean z) {
        super(NLEEditorJniJNI.NLEAutoFillFrame_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
