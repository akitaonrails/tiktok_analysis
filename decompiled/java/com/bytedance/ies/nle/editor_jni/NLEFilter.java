package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEFilter extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEFilter_clone = NLEEditorJniJNI.NLEFilter_clone(this.swigCPtr, this);
        if (jNLEFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLEFilter_clone, true);
    }

    public NLESegmentFilter getSegment() {
        long jNLEFilter_getSegment = NLEEditorJniJNI.NLEFilter_getSegment(this.swigCPtr, this);
        if (jNLEFilter_getSegment == 0) {
            return null;
        }
        return new NLESegmentFilter(jNLEFilter_getSegment, true);
    }

    public NLEFilter() {
        this(NLEEditorJniJNI.new_NLEFilter(), true);
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

    public static NLEFilter dynamicCast(NLENode nLENode) {
        long jNLEFilter_dynamicCast = NLEEditorJniJNI.NLEFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEFilter_dynamicCast == 0) {
            return null;
        }
        return new NLEFilter(jNLEFilter_dynamicCast, true);
    }

    public static long getCPtr(NLEFilter nLEFilter) {
        if (nLEFilter == null) {
            return 0L;
        }
        return nLEFilter.swigCPtr;
    }

    public void setSegment(NLESegmentFilter nLESegmentFilter) {
        NLEEditorJniJNI.NLEFilter_setSegment(this.swigCPtr, this, NLESegmentFilter.getCPtr(nLESegmentFilter), nLESegmentFilter);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLEFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
