package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEStickerRuntime {
    int beginInfoStickerPin(String str);

    int cancelInfoStickerPin(String str);

    int enableStickerAnimationPreview(String str, boolean z);

    String getInfoStickerAssetInfo(String str);

    NLERectF getInfoStickerBoundingBox(String str, boolean z);

    String getInfoStickerNewTemplateParams(String str);

    byte[] getInfoStickerPinData(String str);

    byte[] getInfoStickerPinMappingData(String str);

    float getInfoStickerRotate(String str);

    float getInfoStickerScale(String str);

    String getInfoStickerTemplateParams(String str);

    boolean getInfoStickerVisible(String str);

    NLERectF getNewTextTemplateBoundingBox(NLETrackSlot nLETrackSlot);

    NLERectF getNewTextTemplateChildElementBoundingBox(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);

    NLEPosition getSrtInfoStickerInitPosition(String str);

    boolean getStickerIsDynamic(String str);

    boolean isInfoStickerAnimatable(String str);

    int setInfoStickerRestoreMode(int i);

    int startStickerAnimationPreview(long j, int i);

    int stopStickerAnimationPreview();
}
