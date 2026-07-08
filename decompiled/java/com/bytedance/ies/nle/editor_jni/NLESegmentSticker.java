package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentSticker extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearStickerAnimation() {
        NLEEditorJniJNI.NLESegmentSticker_clearStickerAnimation(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentSticker_clone = NLEEditorJniJNI.NLESegmentSticker_clone(this.swigCPtr, this);
        if (jNLESegmentSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentSticker_clone, true);
    }

    public float getAlpha() {
        return NLEEditorJniJNI.NLESegmentSticker_getAlpha(this.swigCPtr, this);
    }

    public NLEStyStickerAnim getAnimation() {
        long jNLESegmentSticker_getAnimation = NLEEditorJniJNI.NLESegmentSticker_getAnimation(this.swigCPtr, this);
        if (jNLESegmentSticker_getAnimation == 0) {
            return null;
        }
        return new NLEStyStickerAnim(jNLESegmentSticker_getAnimation, true);
    }

    public NLECompositeTimeAdjustType getCompositeTimeAdjustType() {
        return NLECompositeTimeAdjustType.swigToEnum(NLEEditorJniJNI.NLESegmentSticker_getCompositeTimeAdjustType(this.swigCPtr, this));
    }

    public String getEffectInfo() {
        return NLEEditorJniJNI.NLESegmentSticker_getEffectInfo(this.swigCPtr, this);
    }

    public VecString getInfoStringList() {
        return new VecString(NLEEditorJniJNI.NLESegmentSticker_getInfoStringList(this.swigCPtr, this), true);
    }

    public VecNLEStyStickerAnim getStickerAnimations() {
        return new VecNLEStyStickerAnim(NLEEditorJniJNI.NLESegmentSticker_getStickerAnimations(this.swigCPtr, this), true);
    }

    public boolean hasAlpha() {
        return NLEEditorJniJNI.NLESegmentSticker_hasAlpha(this.swigCPtr, this);
    }

    public boolean hasCompositeTimeAdjustType() {
        return NLEEditorJniJNI.NLESegmentSticker_hasCompositeTimeAdjustType(this.swigCPtr, this);
    }

    public boolean hasEffectInfo() {
        return NLEEditorJniJNI.NLESegmentSticker_hasEffectInfo(this.swigCPtr, this);
    }

    public NLESegmentSticker() {
        this(NLEEditorJniJNI.new_NLESegmentSticker(), true);
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

    public static NLESegmentSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentSticker_dynamicCast = NLEEditorJniJNI.NLESegmentSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentSticker(jNLESegmentSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentSticker nLESegmentSticker) {
        if (nLESegmentSticker == null) {
            return 0L;
        }
        return nLESegmentSticker.swigCPtr;
    }

    public void addStickerAnimation(NLEStyStickerAnim nLEStyStickerAnim) {
        NLEEditorJniJNI.NLESegmentSticker_addStickerAnimation(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    public boolean removeStickerAnimation(NLEStyStickerAnim nLEStyStickerAnim) {
        return NLEEditorJniJNI.NLESegmentSticker_removeStickerAnimation(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    public void setAlpha(float f) {
        NLEEditorJniJNI.NLESegmentSticker_setAlpha(this.swigCPtr, this, f);
    }

    public void setAnimation(NLEStyStickerAnim nLEStyStickerAnim) {
        NLEEditorJniJNI.NLESegmentSticker_setAnimation(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    public void setCompositeTimeAdjustType(NLECompositeTimeAdjustType nLECompositeTimeAdjustType) {
        NLEEditorJniJNI.NLESegmentSticker_setCompositeTimeAdjustType(this.swigCPtr, this, nLECompositeTimeAdjustType.swigValue());
    }

    public void setEffectInfo(String str) {
        NLEEditorJniJNI.NLESegmentSticker_setEffectInfo(this.swigCPtr, this, str);
    }

    public void setInfoStringList(VecString vecString) {
        NLEEditorJniJNI.NLESegmentSticker_setInfoStringList(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
