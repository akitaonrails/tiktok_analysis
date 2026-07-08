package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentEffect extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentEffect(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearAdjustParams() {
        NLEEditorJniJNI.NLESegmentEffect_clearAdjustParams(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentEffect_clone = NLEEditorJniJNI.NLESegmentEffect_clone(this.swigCPtr, this);
        if (jNLESegmentEffect_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentEffect_clone, true);
    }

    public VecNLEStringFloatPairSPtr getAdjustParamss() {
        return new VecNLEStringFloatPairSPtr(NLEEditorJniJNI.NLESegmentEffect_getAdjustParamss(this.swigCPtr, this), true);
    }

    public int getApplyTargetType() {
        return NLEEditorJniJNI.NLESegmentEffect_getApplyTargetType(this.swigCPtr, this);
    }

    public String getCachePath() {
        return NLEEditorJniJNI.NLESegmentEffect_getCachePath(this.swigCPtr, this);
    }

    public String getEffectName() {
        return NLEEditorJniJNI.NLESegmentEffect_getEffectName(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKEffect() {
        long jNLESegmentEffect_getEffectSDKEffect = NLEEditorJniJNI.NLESegmentEffect_getEffectSDKEffect(this.swigCPtr, this);
        if (jNLESegmentEffect_getEffectSDKEffect == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentEffect_getEffectSDKEffect, true);
    }

    public String getEffectTag() {
        return NLEEditorJniJNI.NLESegmentEffect_getEffectTag(this.swigCPtr, this);
    }

    public String getJsonParam() {
        return NLEEditorJniJNI.NLESegmentEffect_getJsonParam(this.swigCPtr, this);
    }

    public boolean getNeedReload() {
        return NLEEditorJniJNI.NLESegmentEffect_getNeedReload(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentEffect_getResource = NLEEditorJniJNI.NLESegmentEffect_getResource(this.swigCPtr, this);
        if (jNLESegmentEffect_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentEffect_getResource, true);
    }

    public boolean hasApplyTargetType() {
        return NLEEditorJniJNI.NLESegmentEffect_hasApplyTargetType(this.swigCPtr, this);
    }

    public boolean hasCachePath() {
        return NLEEditorJniJNI.NLESegmentEffect_hasCachePath(this.swigCPtr, this);
    }

    public boolean hasEffectName() {
        return NLEEditorJniJNI.NLESegmentEffect_hasEffectName(this.swigCPtr, this);
    }

    public boolean hasEffectTag() {
        return NLEEditorJniJNI.NLESegmentEffect_hasEffectTag(this.swigCPtr, this);
    }

    public boolean hasJsonParam() {
        return NLEEditorJniJNI.NLESegmentEffect_hasJsonParam(this.swigCPtr, this);
    }

    public boolean hasNeedReload() {
        return NLEEditorJniJNI.NLESegmentEffect_hasNeedReload(this.swigCPtr, this);
    }

    public NLESegmentEffect() {
        this(NLEEditorJniJNI.new_NLESegmentEffect(), true);
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

    public static NLESegmentEffect dynamicCast(NLENode nLENode) {
        long jNLESegmentEffect_dynamicCast = NLEEditorJniJNI.NLESegmentEffect_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentEffect_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentEffect(jNLESegmentEffect_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentEffect nLESegmentEffect) {
        if (nLESegmentEffect == null) {
            return 0L;
        }
        return nLESegmentEffect.swigCPtr;
    }

    public void addAdjustParams(NLEStringFloatPair nLEStringFloatPair) {
        NLEEditorJniJNI.NLESegmentEffect_addAdjustParams(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public boolean removeAdjustParams(NLEStringFloatPair nLEStringFloatPair) {
        return NLEEditorJniJNI.NLESegmentEffect_removeAdjustParams(this.swigCPtr, this, NLEStringFloatPair.getCPtr(nLEStringFloatPair), nLEStringFloatPair);
    }

    public void setApplyTargetType(int i) {
        NLEEditorJniJNI.NLESegmentEffect_setApplyTargetType(this.swigCPtr, this, i);
    }

    public void setCachePath(String str) {
        NLEEditorJniJNI.NLESegmentEffect_setCachePath(this.swigCPtr, this, str);
    }

    public void setEffectName(String str) {
        NLEEditorJniJNI.NLESegmentEffect_setEffectName(this.swigCPtr, this, str);
    }

    public void setEffectSDKEffect(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentEffect_setEffectSDKEffect(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setEffectTag(String str) {
        NLEEditorJniJNI.NLESegmentEffect_setEffectTag(this.swigCPtr, this, str);
    }

    public void setJsonParam(String str) {
        NLEEditorJniJNI.NLESegmentEffect_setJsonParam(this.swigCPtr, this, str);
    }

    public void setNeedReload(boolean z) {
        NLEEditorJniJNI.NLESegmentEffect_setNeedReload(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentEffect(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentEffect_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
