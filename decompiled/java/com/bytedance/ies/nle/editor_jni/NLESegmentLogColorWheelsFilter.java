package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentLogColorWheelsFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentLogColorWheelsFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentLogColorWheelsFilter_clone = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_clone(this.swigCPtr, this);
        if (jNLESegmentLogColorWheelsFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentLogColorWheelsFilter_clone, true);
    }

    public NLEStyColor getHighlight() {
        long jNLESegmentLogColorWheelsFilter_getHighlight = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_getHighlight(this.swigCPtr, this);
        if (jNLESegmentLogColorWheelsFilter_getHighlight == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentLogColorWheelsFilter_getHighlight, true);
    }

    public NLEStyColor getMidtone() {
        long jNLESegmentLogColorWheelsFilter_getMidtone = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_getMidtone(this.swigCPtr, this);
        if (jNLESegmentLogColorWheelsFilter_getMidtone == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentLogColorWheelsFilter_getMidtone, true);
    }

    public NLEStyColor getOffset() {
        long jNLESegmentLogColorWheelsFilter_getOffset = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_getOffset(this.swigCPtr, this);
        if (jNLESegmentLogColorWheelsFilter_getOffset == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentLogColorWheelsFilter_getOffset, true);
    }

    public NLEStyColor getShadow() {
        long jNLESegmentLogColorWheelsFilter_getShadow = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_getShadow(this.swigCPtr, this);
        if (jNLESegmentLogColorWheelsFilter_getShadow == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentLogColorWheelsFilter_getShadow, true);
    }

    public String toEffectJsonString() {
        return NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_toEffectJsonString(this.swigCPtr, this);
    }

    public NLESegmentLogColorWheelsFilter() {
        this(NLEEditorJniJNI.new_NLESegmentLogColorWheelsFilter(), true);
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

    public static NLESegmentLogColorWheelsFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentLogColorWheelsFilter_dynamicCast = NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentLogColorWheelsFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentLogColorWheelsFilter(jNLESegmentLogColorWheelsFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter) {
        if (nLESegmentLogColorWheelsFilter == null) {
            return 0L;
        }
        return nLESegmentLogColorWheelsFilter.swigCPtr;
    }

    public void setHighlight(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_setHighlight(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setMidtone(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_setMidtone(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setOffset(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_setOffset(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setShadow(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_setShadow(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentLogColorWheelsFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentLogColorWheelsFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
