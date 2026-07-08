package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentMask extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentMask(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentMask_clone = NLEEditorJniJNI.NLESegmentMask_clone(this.swigCPtr, this);
        if (jNLESegmentMask_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentMask_clone, true);
    }

    public float getAspectRatio() {
        return NLEEditorJniJNI.NLESegmentMask_getAspectRatio(this.swigCPtr, this);
    }

    public float getCenterX() {
        return NLEEditorJniJNI.NLESegmentMask_getCenterX(this.swigCPtr, this);
    }

    public float getCenterY() {
        return NLEEditorJniJNI.NLESegmentMask_getCenterY(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKMask() {
        long jNLESegmentMask_getEffectSDKMask = NLEEditorJniJNI.NLESegmentMask_getEffectSDKMask(this.swigCPtr, this);
        if (jNLESegmentMask_getEffectSDKMask == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentMask_getEffectSDKMask, true);
    }

    public float getFeather() {
        return NLEEditorJniJNI.NLESegmentMask_getFeather(this.swigCPtr, this);
    }

    public float getHeight() {
        return NLEEditorJniJNI.NLESegmentMask_getHeight(this.swigCPtr, this);
    }

    public boolean getInvert() {
        return NLEEditorJniJNI.NLESegmentMask_getInvert(this.swigCPtr, this);
    }

    public String getMaskType() {
        return NLEEditorJniJNI.NLESegmentMask_getMaskType(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentMask_getResource = NLEEditorJniJNI.NLESegmentMask_getResource(this.swigCPtr, this);
        if (jNLESegmentMask_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentMask_getResource, true);
    }

    public float getRotation() {
        return NLEEditorJniJNI.NLESegmentMask_getRotation(this.swigCPtr, this);
    }

    public float getRoundCorner() {
        return NLEEditorJniJNI.NLESegmentMask_getRoundCorner(this.swigCPtr, this);
    }

    public float getScaleX() {
        return NLEEditorJniJNI.NLESegmentMask_getScaleX(this.swigCPtr, this);
    }

    public float getScaleY() {
        return NLEEditorJniJNI.NLESegmentMask_getScaleY(this.swigCPtr, this);
    }

    public String getText() {
        return NLEEditorJniJNI.NLESegmentMask_getText(this.swigCPtr, this);
    }

    public float getWidth() {
        return NLEEditorJniJNI.NLESegmentMask_getWidth(this.swigCPtr, this);
    }

    public boolean hasAspectRatio() {
        return NLEEditorJniJNI.NLESegmentMask_hasAspectRatio(this.swigCPtr, this);
    }

    public boolean hasCenterX() {
        return NLEEditorJniJNI.NLESegmentMask_hasCenterX(this.swigCPtr, this);
    }

    public boolean hasCenterY() {
        return NLEEditorJniJNI.NLESegmentMask_hasCenterY(this.swigCPtr, this);
    }

    public boolean hasFeather() {
        return NLEEditorJniJNI.NLESegmentMask_hasFeather(this.swigCPtr, this);
    }

    public boolean hasHeight() {
        return NLEEditorJniJNI.NLESegmentMask_hasHeight(this.swigCPtr, this);
    }

    public boolean hasInvert() {
        return NLEEditorJniJNI.NLESegmentMask_hasInvert(this.swigCPtr, this);
    }

    public boolean hasMaskType() {
        return NLEEditorJniJNI.NLESegmentMask_hasMaskType(this.swigCPtr, this);
    }

    public boolean hasRotation() {
        return NLEEditorJniJNI.NLESegmentMask_hasRotation(this.swigCPtr, this);
    }

    public boolean hasRoundCorner() {
        return NLEEditorJniJNI.NLESegmentMask_hasRoundCorner(this.swigCPtr, this);
    }

    public boolean hasScaleX() {
        return NLEEditorJniJNI.NLESegmentMask_hasScaleX(this.swigCPtr, this);
    }

    public boolean hasScaleY() {
        return NLEEditorJniJNI.NLESegmentMask_hasScaleY(this.swigCPtr, this);
    }

    public boolean hasText() {
        return NLEEditorJniJNI.NLESegmentMask_hasText(this.swigCPtr, this);
    }

    public boolean hasWidth() {
        return NLEEditorJniJNI.NLESegmentMask_hasWidth(this.swigCPtr, this);
    }

    public NLESegmentMask() {
        this(NLEEditorJniJNI.new_NLESegmentMask(), true);
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

    public static NLESegmentMask dynamicCast(NLENode nLENode) {
        long jNLESegmentMask_dynamicCast = NLEEditorJniJNI.NLESegmentMask_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentMask_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentMask(jNLESegmentMask_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentMask nLESegmentMask) {
        if (nLESegmentMask == null) {
            return 0L;
        }
        return nLESegmentMask.swigCPtr;
    }

    public PairFloatFloat getActualSize(NLETrackSlot nLETrackSlot) {
        return new PairFloatFloat(NLEEditorJniJNI.NLESegmentMask_getActualSize__SWIG_1(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public void setAspectRatio(float f) {
        NLEEditorJniJNI.NLESegmentMask_setAspectRatio(this.swigCPtr, this, f);
    }

    public void setCenterX(float f) {
        NLEEditorJniJNI.NLESegmentMask_setCenterX(this.swigCPtr, this, f);
    }

    public void setCenterY(float f) {
        NLEEditorJniJNI.NLESegmentMask_setCenterY(this.swigCPtr, this, f);
    }

    public void setEffectSDKMask(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentMask_setEffectSDKMask(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setFeather(float f) {
        NLEEditorJniJNI.NLESegmentMask_setFeather(this.swigCPtr, this, f);
    }

    public void setHeight(float f) {
        NLEEditorJniJNI.NLESegmentMask_setHeight(this.swigCPtr, this, f);
    }

    public void setInvert(boolean z) {
        NLEEditorJniJNI.NLESegmentMask_setInvert(this.swigCPtr, this, z);
    }

    public void setMaskType(String str) {
        NLEEditorJniJNI.NLESegmentMask_setMaskType(this.swigCPtr, this, str);
    }

    public void setRotation(float f) {
        NLEEditorJniJNI.NLESegmentMask_setRotation(this.swigCPtr, this, f);
    }

    public void setRoundCorner(float f) {
        NLEEditorJniJNI.NLESegmentMask_setRoundCorner(this.swigCPtr, this, f);
    }

    public void setScaleX(float f) {
        NLEEditorJniJNI.NLESegmentMask_setScaleX(this.swigCPtr, this, f);
    }

    public void setScaleY(float f) {
        NLEEditorJniJNI.NLESegmentMask_setScaleY(this.swigCPtr, this, f);
    }

    public void setText(String str) {
        NLEEditorJniJNI.NLESegmentMask_setText(this.swigCPtr, this, str);
    }

    public void setWidth(float f) {
        NLEEditorJniJNI.NLESegmentMask_setWidth(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public String toEffectJson(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLESegmentMask_toEffectJson(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public NLESegmentMask(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentMask_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public PairFloatFloat getActualSize(NLETrackSlot nLETrackSlot, boolean z) {
        return new PairFloatFloat(NLEEditorJniJNI.NLESegmentMask_getActualSize__SWIG_0(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, z), true);
    }
}
