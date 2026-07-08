package com.ss.lyrax.subscriber;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioAlignmentMode;
import com.ss.lyrax.audio.LyraxAudioStallDetectConfig;
import com.ss.lyrax.room.LyraxVideoRemoteConfig;
import com.ss.lyrax.stream.LyraxCredential;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoDecoderConfig;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxSubscriberImpl implements ILyraxSubscriber {
    public final long handle;

    public static native LyraxErrorCode nativeAddVideoFrameSink(long j, ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat);

    public static native void nativeDispose(long j);

    public static native LyraxErrorCode nativeEnableAudioRenderStallDetect(long j, boolean z, int i);

    public static native boolean nativeEquals(long j, long j2);

    public static native long nativeGetDestroySubscriber();

    public static native LyraxSubscriberStats nativeGetStats(long j);

    public static native String nativeGetStreamId(long j);

    public static native LyraxErrorCode nativeMute(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativeRemoveVideoFrameSink(long j, ILyraxVideoFrameSink iLyraxVideoFrameSink);

    public static native LyraxErrorCode nativeRequestVideoKeyFrame(long j);

    public static native LyraxErrorCode nativeSetAudioAlignmentProperty(long j, LyraxAudioAlignmentMode lyraxAudioAlignmentMode);

    public static native LyraxErrorCode nativeSetAudioPlaybackVolume(long j, int i);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxSubscriberListener iLyraxSubscriberListener);

    public static native LyraxErrorCode nativeSetSubscriberCredential(long j, String str);

    public static native LyraxErrorCode nativeSetSubscriberExtraInfo(long j, String str);

    public static native LyraxErrorCode nativeSetVideoDecoderConfig(long j, LyraxVideoDecoderConfig lyraxVideoDecoderConfig);

    public static native LyraxErrorCode nativeSetVideoRemoteConfig(long j, LyraxVideoRemoteConfig lyraxVideoRemoteConfig);

    public static native LyraxErrorCode nativeSetVideoRenderConfig(long j, LyraxVideoRenderConfig lyraxVideoRenderConfig);

    public static native LyraxErrorCode nativeSetVideoSuperResolution(long j, LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode);

    public static native LyraxErrorCode nativeSubsribe(long j);

    public static native LyraxErrorCode nativeUnmute(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativeUnsubscribe(long j);

    @Override // com.ss.lyrax.ILyraxSubscriber
    public void dispose() {
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroySubscriber(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxSubscriberStats getStats() {
        return nativeGetStats(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public String getStreamId() {
        return nativeGetStreamId(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode requestVideoKeyFrame() {
        return nativeRequestVideoKeyFrame(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode subscribe() {
        return nativeSubsribe(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode unsubscribe() {
        return nativeUnsubscribe(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxSubscriberImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroySubscriber());
            }
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public static ILyraxSubscriber createSubscriber(long j) {
        if (j == 0) {
            return null;
        }
        return new LyraxSubscriberImpl(j);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode enableAudioRenderStallDetect(LyraxAudioStallDetectConfig lyraxAudioStallDetectConfig) {
        if (lyraxAudioStallDetectConfig == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativeEnableAudioRenderStallDetect(this.handle, lyraxAudioStallDetectConfig.enable, lyraxAudioStallDetectConfig.thresholdMs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxSubscriberImpl)) {
            return nativeEquals(this.handle, ((LyraxSubscriberImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode mute(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeMute(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode removeVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink) {
        if (iLyraxVideoFrameSink != null) {
            return nativeRemoveVideoFrameSink(this.handle, iLyraxVideoFrameSink);
        }
        return LyraxErrorCode.INVALID_PARAMS;
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setAudioAlignmentProperty(LyraxAudioAlignmentMode lyraxAudioAlignmentMode) {
        return nativeSetAudioAlignmentProperty(this.handle, lyraxAudioAlignmentMode);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setAudioPlaybackVolume(int i) {
        return nativeSetAudioPlaybackVolume(this.handle, i);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setListener(ILyraxSubscriberListener iLyraxSubscriberListener) {
        return nativeSetListener(this.handle, iLyraxSubscriberListener);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setSubscriberCredential(LyraxCredential lyraxCredential) {
        return nativeSetSubscriberCredential(this.handle, lyraxCredential.token);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setSubscriberExtraInfo(String str) {
        return nativeSetSubscriberExtraInfo(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setVideoDecoderConfig(LyraxVideoDecoderConfig lyraxVideoDecoderConfig) {
        return nativeSetVideoDecoderConfig(this.handle, lyraxVideoDecoderConfig);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setVideoRemoteConfig(LyraxVideoRemoteConfig lyraxVideoRemoteConfig) {
        return nativeSetVideoRemoteConfig(this.handle, lyraxVideoRemoteConfig);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setVideoRenderConfig(LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        if (lyraxVideoRenderConfig == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativeSetVideoRenderConfig(this.handle, lyraxVideoRenderConfig);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode setVideoSuperResolution(LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode) {
        return nativeSetVideoSuperResolution(this.handle, lyraxVideoSuperResolutionMode);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode unmute(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeUnmute(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxSubscriber
    public LyraxErrorCode addVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        if (iLyraxVideoFrameSink != null) {
            return nativeAddVideoFrameSink(this.handle, iLyraxVideoFrameSink, lyraxVideoPixelFormat);
        }
        return LyraxErrorCode.INVALID_PARAMS;
    }
}
