package com.ss.lyrax.publisher;

import X.C1C7U;
import android.os.Build;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioContentConfig;
import com.ss.lyrax.audio.LyraxAudioDownLinkSelectionPriority;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.publisher.LyraxPublisherImpl;
import com.ss.lyrax.stream.LyraxCredential;
import com.ss.lyrax.stream.LyraxLayoutConfig;
import com.ss.lyrax.stream.LyraxPublisherConfig;
import com.ss.lyrax.stream.LyraxPublisherStats;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoColorSpace;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFramePool;
import com.ss.lyrax.video.LyraxVideoFrameType;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoPooledFrame;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.lyrax.video.LyraxVideoSeiParamV1;
import com.ss.lyrax.video.LyraxVideoSeiParamV2;
import com.ss.lyrax.video.LyraxVideoSourceConfig;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherImpl implements ILyraxPublisher {
    public final long handle;
    public boolean mIsLyraxVideoFramePoolFeatureReady;
    public LyraxVideoFramePool mLyraxVideoFramePool;

    public static native LyraxErrorCode nativeAddVideoFrameSink(long j, ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat);

    public static native void nativeDispose(long j);

    public static native LyraxErrorCode nativeEnableAudioToAvatarMode(long j, boolean z);

    public static native LyraxErrorCode nativeEnableCalculateAudioLoudness(long j, boolean z);

    public static native LyraxErrorCode nativeEnablePushStream(long j);

    public static native LyraxErrorCode nativeEnableSendE2EInfoSEIV2(long j, boolean z, int i);

    public static native LyraxErrorCode nativeEnableSendSEIV2(long j, boolean z);

    public static native boolean nativeEquals(long j, long j2);

    public static native long nativeGetDestroyPublisher();

    public static native LyraxPublisherStats nativeGetStats(long j);

    public static native LyraxStreamProtocol nativeGetStreamProtocol(long j);

    public static native LyraxVideoEncoderConfig nativeGetVideoEncoderConfig(long j);

    public static native boolean nativeIsLyraxVideoPooledFrameEnabled(long j);

    public static native LyraxErrorCode nativeMute(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativePublish(long j);

    public static native LyraxErrorCode nativePushVideoFrame(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native LyraxErrorCode nativePushVideoPooledFrame(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native LyraxErrorCode nativeRemoveVideoFrameSink(long j, ILyraxVideoFrameSink iLyraxVideoFrameSink);

    public static native LyraxErrorCode nativeResetVideoPerfDegradeLimit(long j);

    public static native LyraxErrorCode nativeSendSEIV1(long j, LyraxVideoSeiParamV1 lyraxVideoSeiParamV1);

    public static native LyraxErrorCode nativeSendSEIV2(long j, LyraxVideoSeiParamV2 lyraxVideoSeiParamV2);

    public static native LyraxErrorCode nativeSetAudioCaptureVolume(long j, int i);

    public static native LyraxErrorCode nativeSetAudioContentConfig(long j, LyraxAudioContentConfig lyraxAudioContentConfig);

    public static native LyraxErrorCode nativeSetAudioDownLinkSelectionPriority(long j, LyraxAudioDownLinkSelectionPriority lyraxAudioDownLinkSelectionPriority);

    public static native LyraxErrorCode nativeSetAudioEncoderConfig(long j, LyraxAudioEncoderConfig lyraxAudioEncoderConfig);

    public static native LyraxErrorCode nativeSetCurrentShiftDiffTimeSEIV2(long j, long j2);

    public static native LyraxErrorCode nativeSetE2EAnchorLinkmicIdSEIV2(long j, String str);

    public static native LyraxErrorCode nativeSetFeaturesConfig(long j, LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig);

    public static native LyraxErrorCode nativeSetLayoutConfig(long j, LyraxLayoutConfig lyraxLayoutConfig);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxPublisherListener iLyraxPublisherListener);

    public static native LyraxErrorCode nativeSetListenerInternal(long j, ILyraxPublisherListener iLyraxPublisherListener);

    public static native LyraxErrorCode nativeSetPublisherConfig(long j, LyraxPublisherConfig lyraxPublisherConfig);

    public static native LyraxErrorCode nativeSetPublisherCredential(long j, String str);

    public static native LyraxErrorCode nativeSetVideoEncoderConfig(long j, LyraxVideoEncoderConfig lyraxVideoEncoderConfig);

    public static native LyraxErrorCode nativeSetVideoPerfDegradeLimit(long j, LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit);

    public static native LyraxErrorCode nativeSetVideoSource(long j, ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    public static native LyraxErrorCode nativeSetVideoSourceConfig(long j, LyraxVideoSourceConfig lyraxVideoSourceConfig);

    public static native LyraxErrorCode nativeSetVideoStandardDowngradeTier(long j, int i, int i2, int i3, int i4);

    public static native LyraxErrorCode nativeStartPushVideoFile(long j, String str, boolean z);

    public static native LyraxErrorCode nativeStopPushVideoFile(long j);

    public static native LyraxErrorCode nativeUnmute(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativeUnpublish(long j);

    public static native LyraxErrorCode nativeUpdateLyraxExternalStats(long j, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    public static native LyraxErrorCode nativeUpdatePublishedTask(long j);

    @Override // com.ss.lyrax.ILyraxPublisher
    public void dispose() {
        Logging.e("LyraxPublisherImpl", "lyrax publisher dispose");
        nativeDispose(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode enablePushStream() {
        return nativeEnablePushStream(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyPublisher(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxPublisherStats getStats() {
        return nativeGetStats(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxStreamProtocol getStreamProtocol() {
        return nativeGetStreamProtocol(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxVideoEncoderConfig getVideoEncoderConfig() {
        return nativeGetVideoEncoderConfig(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public boolean isLyraxVideoPooledFrameEnabled() {
        if (this.mIsLyraxVideoFramePoolFeatureReady) {
            return nativeIsLyraxVideoPooledFrameEnabled(this.handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode publish() {
        return nativePublish(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode resetVideoPerfDegradeLimit() {
        return nativeResetVideoPerfDegradeLimit(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode stopPushVideoFile() {
        return nativeStopPushVideoFile(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode unpublish() {
        return nativeUnpublish(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode updatePublishedTask() {
        return nativeUpdatePublishedTask(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxPublisherImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyPublisher());
            }
            Logging.e("LyraxPublisherImpl", "lyrax publisher create");
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode enableAudioToAvatarMode(boolean z) {
        return nativeEnableAudioToAvatarMode(this.handle, z);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode enableCalculateAudioLoudness(boolean z) {
        return nativeEnableCalculateAudioLoudness(this.handle, z);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode enableSendSEIV2(boolean z) {
        return nativeEnableSendSEIV2(this.handle, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxPublisherImpl)) {
            return nativeEquals(this.handle, ((LyraxPublisherImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode mute(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeMute(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode pushVideoFrame(final LyraxVideoFrame lyraxVideoFrame) {
        if (lyraxVideoFrame == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        if (lyraxVideoFrame instanceof LyraxVideoPooledFrame) {
            return nativePushVideoPooledFrame(this.handle, lyraxVideoFrame);
        }
        if (lyraxVideoFrame.getFrameType() != LyraxVideoFrameType.RAW_MEMORY && !lyraxVideoFrame.hasReleaseCallback()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            lyraxVideoFrame.retain();
            LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(lyraxVideoFrame.getPixelFormat());
            lyraxVideoGLTextureFrameBuilder.setTextureID(lyraxVideoFrame.getTextureID());
            lyraxVideoGLTextureFrameBuilder.setTextureMatrix(lyraxVideoFrame.getTextureMatrix());
            lyraxVideoGLTextureFrameBuilder.setEGLContext(lyraxVideoFrame.getEGLContext());
            lyraxVideoGLTextureFrameBuilder.setColorSpace(lyraxVideoFrame.getColorSpace());
            lyraxVideoGLTextureFrameBuilder.setWidth(lyraxVideoFrame.getWidth());
            lyraxVideoGLTextureFrameBuilder.setHeight(lyraxVideoFrame.getHeight());
            lyraxVideoGLTextureFrameBuilder.setRotation(lyraxVideoFrame.getRotation());
            lyraxVideoGLTextureFrameBuilder.setExtraDataInfo(lyraxVideoFrame.getExtraDataInfo());
            lyraxVideoGLTextureFrameBuilder.setExtraDataArray(lyraxVideoFrame.getExtraDataArray());
            lyraxVideoGLTextureFrameBuilder.setSupplementaryInfo(lyraxVideoFrame.getSupplementaryInfo());
            lyraxVideoGLTextureFrameBuilder.setTimeStampUs(lyraxVideoFrame.getTimeStampUs());
            lyraxVideoGLTextureFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.0jMx
                @Override // java.lang.Runnable
                public final void run() {
                    LyraxPublisherImpl.lambda$pushVideoFrame$0(lyraxVideoFrame, countDownLatch);
                }
            });
            LyraxVideoFrame lyraxVideoFrameBuild = lyraxVideoGLTextureFrameBuilder.build();
            LyraxErrorCode lyraxErrorCodeNativePushVideoFrame = nativePushVideoFrame(this.handle, lyraxVideoFrameBuild);
            lyraxVideoFrameBuild.release();
            ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L);
            return lyraxErrorCodeNativePushVideoFrame;
        }
        return nativePushVideoFrame(this.handle, lyraxVideoFrame);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode removeVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink) {
        if (iLyraxVideoFrameSink == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativeRemoveVideoFrameSink(this.handle, iLyraxVideoFrameSink);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode sendSEIV1(LyraxVideoSeiParamV1 lyraxVideoSeiParamV1) {
        return nativeSendSEIV1(this.handle, lyraxVideoSeiParamV1);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode sendSEIV2(LyraxVideoSeiParamV2 lyraxVideoSeiParamV2) {
        return nativeSendSEIV2(this.handle, lyraxVideoSeiParamV2);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setAudioCaptureVolume(int i) {
        return nativeSetAudioCaptureVolume(this.handle, i);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setAudioContentConfig(LyraxAudioContentConfig lyraxAudioContentConfig) {
        return nativeSetAudioContentConfig(this.handle, lyraxAudioContentConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setAudioDownLinkSelectionPriority(LyraxAudioDownLinkSelectionPriority lyraxAudioDownLinkSelectionPriority) {
        return nativeSetAudioDownLinkSelectionPriority(this.handle, lyraxAudioDownLinkSelectionPriority);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setAudioEncoderConfig(LyraxAudioEncoderConfig lyraxAudioEncoderConfig) {
        return nativeSetAudioEncoderConfig(this.handle, lyraxAudioEncoderConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setCurrentShiftDiffTimeSEIV2(long j) {
        return nativeSetCurrentShiftDiffTimeSEIV2(this.handle, j);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setE2EAnchorLinkmicIdSEIV2(String str) {
        return nativeSetE2EAnchorLinkmicIdSEIV2(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setFeaturesConfig(LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig) {
        return nativeSetFeaturesConfig(this.handle, lyraxTranscoderFeaturesConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setLayoutConfig(LyraxLayoutConfig lyraxLayoutConfig) {
        return nativeSetLayoutConfig(this.handle, lyraxLayoutConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setListener(ILyraxPublisherListener iLyraxPublisherListener) {
        return nativeSetListener(this.handle, iLyraxPublisherListener);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setListenerInternal(ILyraxPublisherListener iLyraxPublisherListener) {
        return nativeSetListenerInternal(this.handle, iLyraxPublisherListener);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setPublisherConfig(LyraxPublisherConfig lyraxPublisherConfig) {
        return nativeSetPublisherConfig(this.handle, lyraxPublisherConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setPublisherCredential(LyraxCredential lyraxCredential) {
        return nativeSetPublisherCredential(this.handle, lyraxCredential.token);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setVideoEncoderConfig(LyraxVideoEncoderConfig lyraxVideoEncoderConfig) {
        return nativeSetVideoEncoderConfig(this.handle, lyraxVideoEncoderConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setVideoPerfDegradeLimit(LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit) {
        return nativeSetVideoPerfDegradeLimit(this.handle, lyraxVideoPerfDegradeLimit);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        return nativeSetVideoSource(this.handle, iLyraxVideoPlatformWrapper);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setVideoSourceConfig(LyraxVideoSourceConfig lyraxVideoSourceConfig) {
        return nativeSetVideoSourceConfig(this.handle, lyraxVideoSourceConfig);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode unmute(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeUnmute(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode updateLyraxExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        return nativeUpdateLyraxExternalStats(this.handle, lyraxPreProcessVideoNodeStats);
    }

    public static /* synthetic */ void lambda$pushVideoFrame$0(LyraxVideoFrame lyraxVideoFrame, CountDownLatch countDownLatch) {
        C1C7U.LIZ("LyraxPublisherImpl@bf80.pushVideoFrame$1L");
        try {
            lyraxVideoFrame.release();
            countDownLatch.countDown();
            C1C7U.LIZIZ("LyraxPublisherImpl@bf80.pushVideoFrame$1L");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode addVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        if (iLyraxVideoFrameSink == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativeAddVideoFrameSink(this.handle, iLyraxVideoFrameSink, lyraxVideoPixelFormat);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode enableSendE2EInfoSEIV2(boolean z, int i) {
        return nativeEnableSendE2EInfoSEIV2(this.handle, z, i);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode startPushVideoFile(String str, boolean z) {
        return nativeStartPushVideoFile(this.handle, str, z);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public LyraxErrorCode setVideoStandardDowngradeTier(int i, int i2, int i3, int i4) {
        return nativeSetVideoStandardDowngradeTier(this.handle, i, i2, i3, i4);
    }

    @Override // com.ss.lyrax.ILyraxPublisher
    public synchronized LyraxVideoPooledFrame getLyraxVideoPooledFrame(LyraxVideoPixelFormat lyraxVideoPixelFormat, int i, int i2, int i3, LyraxVideoRotation lyraxVideoRotation, LyraxVideoColorSpace lyraxVideoColorSpace) {
        if (!this.mIsLyraxVideoFramePoolFeatureReady) {
            return null;
        }
        LyraxVideoFramePool lyraxVideoFramePool = this.mLyraxVideoFramePool;
        if (lyraxVideoFramePool == null) {
            LyraxVideoFramePool lyraxVideoFramePool2 = new LyraxVideoFramePool(1, 3, lyraxVideoPixelFormat, i, i2, i3, lyraxVideoRotation, lyraxVideoColorSpace);
            this.mLyraxVideoFramePool = lyraxVideoFramePool2;
            return lyraxVideoFramePool2.acquireFrame();
        }
        if (lyraxVideoFramePool.isFramePoolEligible(lyraxVideoPixelFormat, i, i2, i3, lyraxVideoRotation, lyraxVideoColorSpace)) {
            return this.mLyraxVideoFramePool.acquireFrame();
        }
        this.mLyraxVideoFramePool.release();
        LyraxVideoFramePool lyraxVideoFramePool3 = new LyraxVideoFramePool(1, 3, lyraxVideoPixelFormat, i, i2, i3, lyraxVideoRotation, lyraxVideoColorSpace);
        this.mLyraxVideoFramePool = lyraxVideoFramePool3;
        return lyraxVideoFramePool3.acquireFrame();
    }
}
