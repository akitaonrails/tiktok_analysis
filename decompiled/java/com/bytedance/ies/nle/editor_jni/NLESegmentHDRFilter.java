package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentHDRFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentHDRFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentHDRFilter_clone = NLEEditorJniJNI.NLESegmentHDRFilter_clone(this.swigCPtr, this);
        if (jNLESegmentHDRFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentHDRFilter_clone, true);
    }

    public int getAsfMode() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_getAsfMode(this.swigCPtr, this);
    }

    public boolean getDenoise() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_getDenoise(this.swigCPtr, this);
    }

    public String getFilePath() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_getFilePath(this.swigCPtr, this);
    }

    public int getFrameType() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_getFrameType(this.swigCPtr, this);
    }

    public int getHdrMode() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_getHdrMode(this.swigCPtr, this);
    }

    public boolean hasAsfMode() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_hasAsfMode(this.swigCPtr, this);
    }

    public boolean hasDenoise() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_hasDenoise(this.swigCPtr, this);
    }

    public boolean hasFilePath() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_hasFilePath(this.swigCPtr, this);
    }

    public boolean hasFrameType() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_hasFrameType(this.swigCPtr, this);
    }

    public boolean hasHdrMode() {
        return NLEEditorJniJNI.NLESegmentHDRFilter_hasHdrMode(this.swigCPtr, this);
    }

    public NLESegmentHDRFilter() {
        this(NLEEditorJniJNI.new_NLESegmentHDRFilter(), true);
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

    public static NLESegmentHDRFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentHDRFilter_dynamicCast = NLEEditorJniJNI.NLESegmentHDRFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentHDRFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentHDRFilter(jNLESegmentHDRFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentHDRFilter nLESegmentHDRFilter) {
        if (nLESegmentHDRFilter == null) {
            return 0L;
        }
        return nLESegmentHDRFilter.swigCPtr;
    }

    public void setAsfMode(int i) {
        NLEEditorJniJNI.NLESegmentHDRFilter_setAsfMode(this.swigCPtr, this, i);
    }

    public void setDenoise(boolean z) {
        NLEEditorJniJNI.NLESegmentHDRFilter_setDenoise(this.swigCPtr, this, z);
    }

    public void setFilePath(String str) {
        NLEEditorJniJNI.NLESegmentHDRFilter_setFilePath(this.swigCPtr, this, str);
    }

    public void setFrameType(int i) {
        NLEEditorJniJNI.NLESegmentHDRFilter_setFrameType(this.swigCPtr, this, i);
    }

    public void setHdrMode(int i) {
        NLEEditorJniJNI.NLESegmentHDRFilter_setHdrMode(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentHDRFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentHDRFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
