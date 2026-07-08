package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEStickerController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEStickerController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int stopStickerAnimationPreview() {
        return NLEMediaPublicJniJNI.NLEStickerController_stopStickerAnimationPreview(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEStickerController nLEStickerController) {
        if (nLEStickerController == null) {
            return 0L;
        }
        return nLEStickerController.swigCPtr;
    }

    public int beginInfoStickerPin(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_beginInfoStickerPin(this.swigCPtr, this, str);
    }

    public int cancelInfoStickerPin(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_cancelInfoStickerPin(this.swigCPtr, this, str);
    }

    public String getInfoStickerAssetInfo(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerAssetInfo(this.swigCPtr, this, str);
    }

    public String getInfoStickerNewTemplateParams(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerNewTemplateParams(this.swigCPtr, this, str);
    }

    public byte[] getInfoStickerPinData(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerPinData(this.swigCPtr, this, str);
    }

    public byte[] getInfoStickerPinMappingData(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerPinMappingData(this.swigCPtr, this, str);
    }

    public float getInfoStickerRotate(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerRotate(this.swigCPtr, this, str);
    }

    public float getInfoStickerScale(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerScale(this.swigCPtr, this, str);
    }

    public String getInfoStickerTemplateParams(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerTemplateParams(this.swigCPtr, this, str);
    }

    public boolean getInfoStickerVisible(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerVisible(this.swigCPtr, this, str);
    }

    public NLERectF getNewTextTemplateBoundingBox(NLETrackSlot nLETrackSlot) {
        return new NLERectF(NLEMediaPublicJniJNI.NLEStickerController_getNewTextTemplateBoundingBox(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public NLEPosition getSrtInfoStickerInitPosition(String str) {
        return new NLEPosition(NLEMediaPublicJniJNI.NLEStickerController_getSrtInfoStickerInitPosition(this.swigCPtr, this, str), true);
    }

    public boolean getStickerIsDynamic(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_getStickerIsDynamic(this.swigCPtr, this, str);
    }

    public NLERectF getTextCanvasBoundingBox(String str) {
        return new NLERectF(NLEMediaPublicJniJNI.NLEStickerController_getTextCanvasBoundingBox(this.swigCPtr, this, str), true);
    }

    public boolean isInfoStickerAnimatable(String str) {
        return NLEMediaPublicJniJNI.NLEStickerController_isInfoStickerAnimatable(this.swigCPtr, this, str);
    }

    public int setInfoStickerRestoreMode(int i) {
        return NLEMediaPublicJniJNI.NLEStickerController_setInfoStickerRestoreMode(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEStickerController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int enableStickerAnimationPreview(String str, boolean z) {
        return NLEMediaPublicJniJNI.NLEStickerController_enableStickerAnimationPreview(this.swigCPtr, this, str, z);
    }

    public NLERectF getInfoStickerBoundingBox(String str, boolean z) {
        return new NLERectF(NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerBoundingBox(this.swigCPtr, this, str, z), true);
    }

    public NLERectF getNewTextTemplateChildElementBoundingBox(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        return new NLERectF(NLEMediaPublicJniJNI.NLEStickerController_getNewTextTemplateChildElementBoundingBox(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLETrackSlot.getCPtr(nLETrackSlot2), nLETrackSlot2), true);
    }

    public int startStickerAnimationPreview(long j, int i) {
        return NLEMediaPublicJniJNI.NLEStickerController_startStickerAnimationPreview(this.swigCPtr, this, j, i);
    }

    public NLEError getStickerBoundingBox(NLETrackSlot nLETrackSlot, NLERectF nLERectF, boolean z) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEStickerController_getStickerBoundingBox(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLERectF.getCPtr(nLERectF), nLERectF, z));
    }
}
