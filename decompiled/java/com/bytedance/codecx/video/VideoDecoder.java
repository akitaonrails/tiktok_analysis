package com.bytedance.codecx.video;

import android.view.Surface;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;

/* JADX INFO: loaded from: classes21.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodedFrame(CodecXVideoFrameInterface codecXVideoFrameInterface);

        void onMediaCodecStatus(CodecXVideoCodecStatus codecXVideoCodecStatus, String str);
    }

    long createNativeVideoDecoder();

    CodecXVideoCodecStatus decode(EncodedImage encodedImage);

    void disableExternalSurface();

    CodecXVideoCodecStatus flush();

    String getImplementationName();

    boolean getPrefersLateDecoding();

    CodecXVideoCodecStatus initDecode(Settings settings, Callback callback);

    boolean isCacheDecoderWhenCreate();

    void onFrame(CodecXVideoFrameInterface codecXVideoFrameInterface);

    CodecXVideoCodecStatus release();

    CodecXVideoCodecStatus setDeliverParams(boolean z, int i, float f, float f2, int i2);

    void setExternalSurface(Surface surface);

    CodecXVideoCodecStatus setPrivateParam(String str, String str2);

    CodecXVideoCodecStatus updateSettings(Settings settings);

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public final int adaptivePlaybackMaxHeight;
        public final int adaptivePlaybackMaxWidth;
        public final int directRenderMode;
        public final boolean enableAGFXSurfaceTextureHelper;
        public final boolean enableAdaptivePlayback;
        public final boolean enableAsyncMode;
        public final boolean enableBFrameDecode;
        public final boolean enableRecreateByResolution;
        public final boolean enableSmoothOutput;
        public final boolean enableSurfaceTextureReuse;
        public final boolean enableYUVOutput;
        public final int height;
        public final boolean latencyInsensitiveMode;
        public final int numberOfCores;
        public final boolean outputByDts;
        public final EglBase.Context sharedContext;
        public final int superResolutionHeight;
        public final int superResolutionMode;
        public final float superResolutionRatio;
        public final int superResolutionWidth;
        public final int texturePlayoutMode;
        public final int width;

        public Settings(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, EglBase.Context context, boolean z9, int i4, int i5, int i6, float f, int i7, int i8, boolean z10, int i9, int i10) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.outputByDts = z;
            this.enableSmoothOutput = z2;
            this.enableYUVOutput = z3;
            this.latencyInsensitiveMode = z4;
            this.enableSurfaceTextureReuse = z5;
            this.enableRecreateByResolution = z6;
            this.enableBFrameDecode = z7;
            this.sharedContext = context;
            this.enableAGFXSurfaceTextureHelper = z8;
            this.enableAsyncMode = z9;
            this.directRenderMode = i4;
            this.texturePlayoutMode = i5;
            this.superResolutionMode = i6;
            this.superResolutionRatio = f;
            this.superResolutionWidth = i7;
            this.superResolutionHeight = i8;
            this.enableAdaptivePlayback = z10;
            this.adaptivePlaybackMaxWidth = i9;
            this.adaptivePlaybackMaxHeight = i10;
        }
    }
}
