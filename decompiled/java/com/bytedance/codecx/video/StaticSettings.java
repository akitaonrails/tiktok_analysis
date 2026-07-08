package com.bytedance.codecx.video;

import com.bytedance.codecx.video.EglBase;
import com.bytedance.codecx.video.EglBase14;
import com.bytedance.codecx.video.VideoEncoder;

/* JADX INFO: loaded from: classes21.dex */
public class StaticSettings {
    public final int bFrameNum;
    public final VideoEncoder.BitrateMode bitrateMode;
    public final boolean closeSetProfile;
    public final boolean enableAlignment;
    public final boolean enableAsyncMode;
    public final boolean enableColorSpaceSetting;
    public final boolean enableQpSetting;
    public final boolean enableROI;
    public final VideoEncoder.EncodeMode encodeMode;
    public final int height;
    public final boolean isStatisticsEnabled;
    public final int matrixId;
    public final int maxIQp;
    public final int maxQp;
    public final int minIQp;
    public final int minQp;
    public final int primaryId;
    public final int rangeId;
    public final VideoEncoder.ScaleMode scaleMode;
    public final EglBase14.Context sharedContext;
    public int targetBps;
    public final int targetFps;
    public final int targetKeyFrameIntervalMs;
    public final int temporalLayerNum;
    public final int transferId;
    public final boolean useSurfaceMode;
    public final int width;

    public StaticSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z, int i14, int i15, int i16, boolean z2, boolean z3, boolean z4, int i17, int i18, EglBase.Context context, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.width = i;
        this.height = i2;
        this.scaleMode = VideoEncoder.ScaleMode.fromValue(i3);
        this.targetBps = i4;
        this.targetFps = i5;
        this.primaryId = i6;
        this.transferId = i7;
        this.matrixId = i8;
        this.rangeId = i9;
        this.maxQp = i10;
        this.minQp = i11;
        this.temporalLayerNum = i14;
        this.bitrateMode = VideoEncoder.BitrateMode.fromValue(i15);
        this.targetKeyFrameIntervalMs = i16;
        this.closeSetProfile = z2;
        this.useSurfaceMode = z3;
        this.enableAlignment = z4;
        this.maxIQp = i12;
        this.minIQp = i13;
        this.bFrameNum = i18;
        this.enableQpSetting = z;
        this.encodeMode = VideoEncoder.EncodeMode.fromValue(i17);
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        } else {
            this.sharedContext = null;
        }
        this.enableAsyncMode = z5;
        this.isStatisticsEnabled = z6;
        this.enableColorSpaceSetting = z7;
        this.enableROI = z8;
    }
}
