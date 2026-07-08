package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioMatrixFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioMatrixFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioMatrixFilter_clone = NLEEditorJniJNI.NLESegmentAudioMatrixFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioMatrixFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioMatrixFilter_clone, true);
    }

    public String getSamiParam() {
        return NLEEditorJniJNI.NLESegmentAudioMatrixFilter_getSamiParam(this.swigCPtr, this);
    }

    public boolean hasSamiParam() {
        return NLEEditorJniJNI.NLESegmentAudioMatrixFilter_hasSamiParam(this.swigCPtr, this);
    }

    public NLESegmentAudioMatrixFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioMatrixFilter(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentAudioMatrixFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioMatrixFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioMatrixFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioMatrixFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioMatrixFilter(jNLESegmentAudioMatrixFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter) {
        if (nLESegmentAudioMatrixFilter == null) {
            return 0L;
        }
        return nLESegmentAudioMatrixFilter.swigCPtr;
    }

    public void setSamiParam(String str) {
        NLEEditorJniJNI.NLESegmentAudioMatrixFilter_setSamiParam(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioMatrixFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioMatrixFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
