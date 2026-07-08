package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioFadeFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioFadeFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioFadeFilter_clone = NLEEditorJniJNI.NLESegmentAudioFadeFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioFadeFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioFadeFilter_clone, true);
    }

    public long getFadeInLength() {
        return NLEEditorJniJNI.NLESegmentAudioFadeFilter_getFadeInLength(this.swigCPtr, this);
    }

    public long getFadeOutLength() {
        return NLEEditorJniJNI.NLESegmentAudioFadeFilter_getFadeOutLength(this.swigCPtr, this);
    }

    public NLEAudioFadeType getFadeType() {
        return NLEAudioFadeType.swigToEnum(NLEEditorJniJNI.NLESegmentAudioFadeFilter_getFadeType(this.swigCPtr, this));
    }

    public boolean hasFadeInLength() {
        return NLEEditorJniJNI.NLESegmentAudioFadeFilter_hasFadeInLength(this.swigCPtr, this);
    }

    public boolean hasFadeOutLength() {
        return NLEEditorJniJNI.NLESegmentAudioFadeFilter_hasFadeOutLength(this.swigCPtr, this);
    }

    public boolean hasFadeType() {
        return NLEEditorJniJNI.NLESegmentAudioFadeFilter_hasFadeType(this.swigCPtr, this);
    }

    public NLESegmentAudioFadeFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioFadeFilter(), true);
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

    public static NLESegmentAudioFadeFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioFadeFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioFadeFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioFadeFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioFadeFilter(jNLESegmentAudioFadeFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter) {
        if (nLESegmentAudioFadeFilter == null) {
            return 0L;
        }
        return nLESegmentAudioFadeFilter.swigCPtr;
    }

    public void setFadeInLength(long j) {
        NLEEditorJniJNI.NLESegmentAudioFadeFilter_setFadeInLength(this.swigCPtr, this, j);
    }

    public void setFadeOutLength(long j) {
        NLEEditorJniJNI.NLESegmentAudioFadeFilter_setFadeOutLength(this.swigCPtr, this, j);
    }

    public void setFadeType(NLEAudioFadeType nLEAudioFadeType) {
        NLEEditorJniJNI.NLESegmentAudioFadeFilter_setFadeType(this.swigCPtr, this, nLEAudioFadeType.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioFadeFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioFadeFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
