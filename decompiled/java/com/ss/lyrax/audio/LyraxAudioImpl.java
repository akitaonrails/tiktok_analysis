package com.ss.lyrax.audio;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.utils.LyraxValue;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioImpl implements ILyraxAudio {
    public final long handle;

    public static native long nativeCreateAudioPlayer(long j);

    public static native void nativeDispose(long j);

    public static native boolean nativeEquals(long j, long j2);

    public static native LyraxAudioRoute nativeGetAudioRoute(long j);

    public static native long nativeGetDestroyAudio();

    public static native LyraxErrorCode nativePushExternalAudioFrame(long j, LyraxAudioFrame lyraxAudioFrame);

    public static native LyraxErrorCode nativePushScreenAudioFrame(long j, LyraxAudioFrame lyraxAudioFrame);

    public static native LyraxErrorCode nativeSetAudioProperty(long j, LyraxAudioOptionKey lyraxAudioOptionKey, LyraxValue lyraxValue);

    public static native LyraxErrorCode nativeSetAudioRenderType(long j, LyraxAudioRenderType lyraxAudioRenderType);

    public static native LyraxErrorCode nativeSetAudioRoute(long j, LyraxAudioRoute lyraxAudioRoute);

    public static native LyraxErrorCode nativeSetAudioScenario(long j, LyraxAudioScenarioType lyraxAudioScenarioType);

    public static native LyraxErrorCode nativeSetAudioScene(long j, LyraxAudioSceneType lyraxAudioSceneType);

    public static native LyraxErrorCode nativeSetAudioSourceType(long j, LyraxAudioSourceType lyraxAudioSourceType);

    public static native LyraxErrorCode nativeSetCaptureVolume(long j, int i);

    public static native LyraxErrorCode nativeSetDefaultAudioRoute(long j, LyraxAudioRoute lyraxAudioRoute);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxAudioListener iLyraxAudioListener);

    public static native LyraxErrorCode nativeSetPlaybackVolume(long j, int i);

    public static native LyraxErrorCode nativeSetScreenAudioSourceType(long j, LyraxAudioSourceType lyraxAudioSourceType);

    public static native LyraxErrorCode nativeStartAudioCapture(long j);

    public static native LyraxErrorCode nativeStopAudioCapture(long j);

    @Override // com.ss.lyrax.ILyraxAudio
    public ILyraxAudioPlayer createAudioPlayer() {
        return new LyraxAudioPlayerImpl(nativeCreateAudioPlayer(this.handle));
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public void dispose() {
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyAudio(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxAudioRoute getAudioRoute() {
        return nativeGetAudioRoute(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode startAudioCapture() {
        return nativeStartAudioCapture(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode stopAudioCapture() {
        return nativeStopAudioCapture(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxAudioImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyAudio());
            }
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxAudioImpl)) {
            return nativeEquals(this.handle, ((LyraxAudioImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode pushExternalAudioFrame(LyraxAudioFrame lyraxAudioFrame) {
        return nativePushExternalAudioFrame(this.handle, lyraxAudioFrame);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode pushScreenAudioFrame(LyraxAudioFrame lyraxAudioFrame) {
        return nativePushScreenAudioFrame(this.handle, lyraxAudioFrame);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioRenderType(LyraxAudioRenderType lyraxAudioRenderType) {
        return nativeSetAudioRenderType(this.handle, lyraxAudioRenderType);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioRoute(LyraxAudioRoute lyraxAudioRoute) {
        return nativeSetAudioRoute(this.handle, lyraxAudioRoute);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioScenario(LyraxAudioScenarioType lyraxAudioScenarioType) {
        return nativeSetAudioScenario(this.handle, lyraxAudioScenarioType);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioScene(LyraxAudioSceneType lyraxAudioSceneType) {
        return nativeSetAudioScene(this.handle, lyraxAudioSceneType);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioSourceType(LyraxAudioSourceType lyraxAudioSourceType) {
        return nativeSetAudioSourceType(this.handle, lyraxAudioSourceType);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setCaptureVolume(int i) {
        return nativeSetCaptureVolume(this.handle, i);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setDefaultAudioRoute(LyraxAudioRoute lyraxAudioRoute) {
        return nativeSetDefaultAudioRoute(this.handle, lyraxAudioRoute);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setListener(ILyraxAudioListener iLyraxAudioListener) {
        return nativeSetListener(this.handle, iLyraxAudioListener);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setPlaybackVolume(int i) {
        return nativeSetPlaybackVolume(this.handle, i);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setScreenAudioSourceType(LyraxAudioSourceType lyraxAudioSourceType) {
        return nativeSetScreenAudioSourceType(this.handle, lyraxAudioSourceType);
    }

    @Override // com.ss.lyrax.ILyraxAudio
    public LyraxErrorCode setAudioProperty(LyraxAudioOptionKey lyraxAudioOptionKey, LyraxValue lyraxValue) {
        return nativeSetAudioProperty(this.handle, lyraxAudioOptionKey, lyraxValue);
    }
}
