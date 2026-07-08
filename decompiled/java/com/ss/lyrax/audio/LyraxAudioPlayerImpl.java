package com.ss.lyrax.audio;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerImpl extends ILyraxAudioPlayer {
    public final long handle;

    public static native void nativeDispose(long j);

    public static native long nativeGetDestroyAudioPlayer();

    public static native LyraxErrorCode nativeOpen(long j, String str, LyraxAudioPlayerConfig lyraxAudioPlayerConfig);

    public static native LyraxErrorCode nativeStart(long j);

    public static native LyraxErrorCode nativeStop(long j);

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public int getAudioTrackCount() {
        return -1;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public int getPlaybackDuration() {
        return -1;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public int getPosition() {
        return -1;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public int getTotalDuration() {
        return -1;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public int getVolume(LyraxAudioMixingType lyraxAudioMixingType) {
        return -1;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public void dispose() {
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyAudioPlayer(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode start() {
        return nativeStart(this.handle);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode stop() {
        return nativeStop(this.handle);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode pause() {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode resume() {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    public LyraxAudioPlayerImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyAudioPlayer());
            }
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode pushExternalAudioFrame(LyraxAudioFrame lyraxAudioFrame) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode registerAudioFrameObserver(ILyraxAudioPlayerAudioFrameObserver iLyraxAudioPlayerAudioFrameObserver) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode selectAudioTrack(int i) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setAudioDualMonoMode(LyraxAudioMixingDualMonoMode lyraxAudioMixingDualMonoMode) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setAudioPitch(int i) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setListener(ILyraxAudioPlayerListener iLyraxAudioPlayerListener) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setLoudness(float f) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setPlaybackSpeed(int i) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setPosition(int i) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setProgressInterval(long j) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode open(String str, LyraxAudioPlayerConfig lyraxAudioPlayerConfig) {
        return nativeOpen(this.handle, str, lyraxAudioPlayerConfig);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode openWithCustomSource(LyraxAudioPlayerCustomSource lyraxAudioPlayerCustomSource, LyraxAudioPlayerConfig lyraxAudioPlayerConfig) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public LyraxErrorCode setVolume(int i, LyraxAudioMixingType lyraxAudioMixingType) {
        return LyraxErrorCode.NOT_IMPLEMENT;
    }
}
