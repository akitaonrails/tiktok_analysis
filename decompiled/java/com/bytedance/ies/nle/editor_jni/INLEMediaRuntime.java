package com.bytedance.ies.nle.editor_jni;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEMediaRuntime {
    void addAndroidImageHolder(String str, Bitmap bitmap);

    int addMetadata(String str, String str2);

    int cancelGetVideoFrames();

    void cancelPreprocessI2V();

    void clearAndroidImageHolder();

    int enableWatermarkMetadata(Boolean bool);

    String findVEParentIdByNLESlotUUID(String str);

    PairIntInt getCanvasSize();

    Bitmap getCurrDecodeImage(String str);

    Bitmap getCurrDecodeImage(String str, int i, int i2);

    Bitmap getCurrDisplayImage();

    Bitmap getCurrDisplayImage(int i);

    long getEffectHandlerPtr();

    String getFileInfo(String str, String str2);

    int getHighLightResult(VecLongLong vecLongLong);

    long[] getHighLightResult();

    MapStrInt getHighLightResultByPts(int i);

    int getImages(VecLongLong vecLongLong, int i, int i2, NLE_GET_FRAME_FLAGS nle_get_frame_flags, INLEListenerGetImage iNLEListenerGetImage);

    PairIntInt getInitSize();

    PairIntInt getInitSize(int i, int i2);

    String getKeyFrameParam(String str, long j);

    String getMetadata(String str);

    float getPlayFps();

    NLEPlayerPreviewMode getPreviewFillMode();

    String getUniqueKey();

    int getVEColorSpace();

    PairIntInt getVideoResolution();

    boolean isUseFilterProcess();

    int lockSeekVideoClip(String str);

    double mapOriginalPositionToTimeEffectPosition(double d, int i);

    double mapTimeEffectPositionToOriginalPosition(double d);

    String preprocessI2V(String str, String str2, long j, int i);

    int sendEffectMsg(int i, long j, long j2, String str);

    void setBackgroundColor(int i);

    void setCanvasColor(String str);

    int setCanvasMinDuration(long j, boolean z);

    void setCanvasSize(int i, int i2);

    void setCompileTargetFileInfoPredictListener(INLEListenerCompileTargetFileInfoPredict iNLEListenerCompileTargetFileInfoPredict);

    void setDisplayPos(int i, int i2, int i3, int i4);

    void setDisplayState(float f, float f2, float f3, int i, int i2);

    void setEncoderByteBufferListener(INLEListenerByteBufferEncoder iNLEListenerByteBufferEncoder);

    void setEncoderListener(INLEListenerEncoder iNLEListenerEncoder);

    int setHeightWidthRatio(float f);

    void setMagnifierDisplayState(float f, float f2, float f3);

    int setMaxWidthAndHeight(long j, long j2);

    int setMetadata(MapStrStr mapStrStr);

    void setPlayFps(float f);

    NLEError setPreviewFillMode(NLEPlayerPreviewMode nLEPlayerPreviewMode);

    void setPreviewOffScreen(boolean z);

    int setPreviewSurfaceImage(Bitmap bitmap);

    int setPreviewSurfaceImage(Bitmap bitmap, boolean z);

    int setPreviewSurfaceTexDesc(String str);

    int setPreviewSurfaceTexDesc(String str, Boolean bool);

    void setSurfaceStatusListener(INLEListenerSurfaceStatus iNLEListenerSurfaceStatus);

    int unlockSeekVideoClip();
}
