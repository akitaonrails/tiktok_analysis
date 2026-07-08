package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioVolumeFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioVolumeFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioVolumeFilter_clone = NLEEditorJniJNI.NLESegmentAudioVolumeFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioVolumeFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioVolumeFilter_clone, true);
    }

    public double getBalancedGain() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_getBalancedGain(this.swigCPtr, this);
    }

    public double getDbRange() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_getDbRange(this.swigCPtr, this);
    }

    public float getVolume() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_getVolume(this.swigCPtr, this);
    }

    public boolean hasBalancedGain() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_hasBalancedGain(this.swigCPtr, this);
    }

    public boolean hasDbRange() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_hasDbRange(this.swigCPtr, this);
    }

    public boolean hasVolume() {
        return NLEEditorJniJNI.NLESegmentAudioVolumeFilter_hasVolume(this.swigCPtr, this);
    }

    public NLESegmentAudioVolumeFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioVolumeFilter(), true);
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

    public static NLESegmentAudioVolumeFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioVolumeFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioVolumeFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioVolumeFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioVolumeFilter(jNLESegmentAudioVolumeFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter) {
        if (nLESegmentAudioVolumeFilter == null) {
            return 0L;
        }
        return nLESegmentAudioVolumeFilter.swigCPtr;
    }

    public void setBalancedGain(double d) {
        NLEEditorJniJNI.NLESegmentAudioVolumeFilter_setBalancedGain(this.swigCPtr, this, d);
    }

    public void setDbRange(double d) {
        NLEEditorJniJNI.NLESegmentAudioVolumeFilter_setDbRange(this.swigCPtr, this, d);
    }

    public void setVolume(float f) {
        NLEEditorJniJNI.NLESegmentAudioVolumeFilter_setVolume(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioVolumeFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioVolumeFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
