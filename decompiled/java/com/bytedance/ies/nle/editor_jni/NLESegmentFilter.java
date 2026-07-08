package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentFilter extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearAdjustParams() {
        NLEEditorJniJNI.NLESegmentFilter_clearAdjustParams(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentFilter_clone = NLEEditorJniJNI.NLESegmentFilter_clone(this.swigCPtr, this);
        if (jNLESegmentFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentFilter_clone, true);
    }

    public VecNLEStringFloatPairSPtr getAdjustParamss() {
        return new VecNLEStringFloatPairSPtr(NLEEditorJniJNI.NLESegmentFilter_getAdjustParamss(this.swigCPtr, this), true);
    }

    public int getApplyTargetType() {
        return NLEEditorJniJNI.NLESegmentFilter_getApplyTargetType(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKFilter() {
        long jNLESegmentFilter_getEffectSDKFilter = NLEEditorJniJNI.NLESegmentFilter_getEffectSDKFilter(this.swigCPtr, this);
        if (jNLESegmentFilter_getEffectSDKFilter == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentFilter_getEffectSDKFilter, true);
    }

    public String getFilterName() {
        return NLEEditorJniJNI.NLESegmentFilter_getFilterName(this.swigCPtr, this);
    }

    public float getFilterPosition() {
        return NLEEditorJniJNI.NLESegmentFilter_getFilterPosition(this.swigCPtr, this);
    }

    public float getIntensity() {
        return NLEEditorJniJNI.NLESegmentFilter_getIntensity(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentFilter_getResource = NLEEditorJniJNI.NLESegmentFilter_getResource(this.swigCPtr, this);
        if (jNLESegmentFilter_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentFilter_getResource, true);
    }

    public NLEResourceNode getRightFilter() {
        long jNLESegmentFilter_getRightFilter = NLEEditorJniJNI.NLESegmentFilter_getRightFilter(this.swigCPtr, this);
        if (jNLESegmentFilter_getRightFilter == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentFilter_getRightFilter, true);
    }

    public float getRightIntensity() {
        return NLEEditorJniJNI.NLESegmentFilter_getRightIntensity(this.swigCPtr, this);
    }

    public boolean getUseFilterV3() {
        return NLEEditorJniJNI.NLESegmentFilter_getUseFilterV3(this.swigCPtr, this);
    }

    public boolean hasApplyTargetType() {
        return NLEEditorJniJNI.NLESegmentFilter_hasApplyTargetType(this.swigCPtr, this);
    }

    public boolean hasFilterName() {
        return NLEEditorJniJNI.NLESegmentFilter_hasFilterName(this.swigCPtr, this);
    }

    public boolean hasFilterPosition() {
        return NLEEditorJniJNI.NLESegmentFilter_hasFilterPosition(this.swigCPtr, this);
    }

    public boolean hasIntensity() {
        return NLEEditorJniJNI.NLESegmentFilter_hasIntensity(this.swigCPtr, this);
    }

    public boolean hasRightIntensity() {
        return NLEEditorJniJNI.NLESegmentFilter_hasRightIntensity(this.swigCPtr, this);
    }

    public boolean hasUseFilterV3() {
        return NLEEditorJniJNI.NLESegmentFilter_hasUseFilterV3(this.swigCPtr, this);
    }

    public NLESegmentFilter() {
        this(NLEEditorJniJNI.new_NLESegmentFilter(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentFilter_dynamicCast = NLEEditorJniJNI.NLESegmentFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentFilter(jNLESegmentFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentFilter nLESegmentFilter) {
        if (nLESegmentFilter == null) {
            return 0L;
        }
        return nLESegmentFilter.swigCPtr;
    }

    public void addAdjustParams(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.NLESegmentFilter_addAdjustParams(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public boolean removeAdjustParams(NLEStringFloatPair nLEStringFloatPair) {
        return NLEEditorJniJNI.NLESegmentFilter_removeAdjustParams(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public void setApplyTargetType(int i) {
        NLEEditorJniJNI.NLESegmentFilter_setApplyTargetType(this.swigCPtr, this, i);
    }

    public void setEffectSDKFilter(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentFilter_setEffectSDKFilter(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setFilterName(String str) {
        NLEEditorJniJNI.NLESegmentFilter_setFilterName(this.swigCPtr, this, str);
    }

    public void setFilterPosition(float f) {
        NLEEditorJniJNI.NLESegmentFilter_setFilterPosition(this.swigCPtr, this, f);
    }

    public void setIntensity(float f) {
        NLEEditorJniJNI.NLESegmentFilter_setIntensity(this.swigCPtr, this, f);
    }

    public void setRightFilter(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentFilter_setRightFilter(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setRightIntensity(float f) {
        NLEEditorJniJNI.NLESegmentFilter_setRightIntensity(this.swigCPtr, this, f);
    }

    public void setUseFilterV3(boolean z) {
        NLEEditorJniJNI.NLESegmentFilter_setUseFilterV3(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
