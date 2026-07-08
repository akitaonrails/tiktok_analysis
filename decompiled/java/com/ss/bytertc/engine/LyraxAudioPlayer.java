package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.LyraxAudioPlayerAudioFrameObserver;
import com.ss.bytertc.engine.handler.LyraxAudioPlayerCustomSourceProvider;
import com.ss.bytertc.engine.handler.LyraxAudioPlayerListener;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.audio.ILyraxAudioPlayerAudioFrameObserver;
import com.ss.lyrax.audio.ILyraxAudioPlayerListener;
import com.ss.lyrax.audio.LyraxAudioFrame;
import com.ss.lyrax.audio.LyraxAudioMixingDualMonoMode;
import com.ss.lyrax.audio.LyraxAudioMixingType;
import com.ss.lyrax.audio.LyraxAudioPlayerConfig;
import com.ss.lyrax.audio.LyraxAudioPlayerCustomSource;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayer extends ILyraxAudioPlayer {
    public LyraxAudioPlayerAudioFrameObserver mAudioFrameObserver;
    public LyraxAudioPlayerCustomSourceProvider mLyraxAudioPlayerCustomSourceProvider;
    public LyraxAudioPlayerListener mLyraxAudioPlayerListener;
    public long mNativeLyraxAudioPlayer;
    public long mNativeRTCEngine;

    public synchronized void destroy() {
        NativeLyraxAudioPlayerFunctions.nativeDestory(this.mNativeLyraxAudioPlayer);
        this.mNativeLyraxAudioPlayer = 0L;
        this.mNativeRTCEngine = 0L;
        this.mAudioFrameObserver = null;
        this.mLyraxAudioPlayerListener = null;
        this.mLyraxAudioPlayerCustomSourceProvider = null;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized int getAudioTrackCount() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, getAudioTrackCount failed.");
            return -1;
        }
        return NativeLyraxAudioPlayerFunctions.nativeGetAudioTrackCount(j);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized int getPlaybackDuration() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, getPlaybackDuration failed.");
            return -1;
        }
        return NativeLyraxAudioPlayerFunctions.nativeGetPlaybackDuration(j);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized int getPosition() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, getPosition failed.");
            return -1;
        }
        return NativeLyraxAudioPlayerFunctions.nativeGetPosition(j);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized int getTotalDuration() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, getTotalDuration failed.");
            return -1;
        }
        return NativeLyraxAudioPlayerFunctions.nativeGetTotalDuration(j);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode pause() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j != 0) {
            return NativeLyraxAudioPlayerFunctions.nativePause(j) == 0 ? LyraxErrorCode.SUCCESS : LyraxErrorCode.FAILURE;
        }
        LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, pause failed.");
        return LyraxErrorCode.INVALID_STATE;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode resume() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j != 0) {
            return NativeLyraxAudioPlayerFunctions.nativeResume(j) == 0 ? LyraxErrorCode.SUCCESS : LyraxErrorCode.FAILURE;
        }
        LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, resume failed.");
        return LyraxErrorCode.INVALID_STATE;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode start() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j != 0) {
            return NativeLyraxAudioPlayerFunctions.nativeStart(j) == 0 ? LyraxErrorCode.SUCCESS : LyraxErrorCode.FAILURE;
        }
        LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, start failed.");
        return LyraxErrorCode.INVALID_STATE;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode stop() {
        long j = this.mNativeLyraxAudioPlayer;
        if (j != 0) {
            return NativeLyraxAudioPlayerFunctions.nativeStop(j) == 0 ? LyraxErrorCode.SUCCESS : LyraxErrorCode.FAILURE;
        }
        LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, stop failed.");
        return LyraxErrorCode.INVALID_STATE;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public void dispose() {
        destroy();
    }

    public LyraxAudioPlayer(long j) {
        this(j, 0L);
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized int getVolume(LyraxAudioMixingType lyraxAudioMixingType) {
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, getVolume failed.");
            return -1;
        }
        return NativeLyraxAudioPlayerFunctions.nativeGetVolume(j, lyraxAudioMixingType.value());
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode pushExternalAudioFrame(LyraxAudioFrame lyraxAudioFrame) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, pushExternalAudioFrame failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativePushExternalAudioFrame(j, lyraxAudioFrame.getBuffer(), lyraxAudioFrame.getSamples(), lyraxAudioFrame.getSampleRate().value(), lyraxAudioFrame.getChannel().value()) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode registerAudioFrameObserver(ILyraxAudioPlayerAudioFrameObserver iLyraxAudioPlayerAudioFrameObserver) {
        LyraxErrorCode lyraxErrorCode;
        LyraxErrorCode lyraxErrorCode2;
        if (this.mNativeLyraxAudioPlayer == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, registerAudioFrameObserver failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        this.mAudioFrameObserver.setAudioFrameObserver(iLyraxAudioPlayerAudioFrameObserver);
        if (iLyraxAudioPlayerAudioFrameObserver == null) {
            if (NativeLyraxAudioPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeLyraxAudioPlayer, null) == 0) {
                lyraxErrorCode2 = LyraxErrorCode.SUCCESS;
            } else {
                lyraxErrorCode2 = LyraxErrorCode.FAILURE;
            }
            return lyraxErrorCode2;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeLyraxAudioPlayer, this.mAudioFrameObserver) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode selectAudioTrack(int i) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, selectAudioTrack failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSelectAudioTrack(j, i) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setAudioDualMonoMode(LyraxAudioMixingDualMonoMode lyraxAudioMixingDualMonoMode) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setAudioDualMonoMode failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetAudioDualMonoMode(j, lyraxAudioMixingDualMonoMode.value()) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setAudioPitch(int i) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setAudioPitch failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetAudioPitch(j, i) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setListener(ILyraxAudioPlayerListener iLyraxAudioPlayerListener) {
        LyraxErrorCode lyraxErrorCode;
        LyraxErrorCode lyraxErrorCode2;
        if (this.mNativeLyraxAudioPlayer == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setListener failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        this.mLyraxAudioPlayerListener.setLyraxAudioPlayerListener(iLyraxAudioPlayerListener);
        if (iLyraxAudioPlayerListener == null) {
            if (NativeLyraxAudioPlayerFunctions.nativeSetListener(this.mNativeLyraxAudioPlayer, null) == 0) {
                lyraxErrorCode2 = LyraxErrorCode.SUCCESS;
            } else {
                lyraxErrorCode2 = LyraxErrorCode.FAILURE;
            }
            return lyraxErrorCode2;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetListener(this.mNativeLyraxAudioPlayer, this.mLyraxAudioPlayerListener) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setLoudness(float f) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setLoudness failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetLoudness(j, f) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setPlaybackSpeed(int i) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setPlaybackSpeed failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetPlaybackSpeed(j, i) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setPosition(int i) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setPosition failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetPosition(j, i) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setProgressInterval(long j) {
        LyraxErrorCode lyraxErrorCode;
        long j2 = this.mNativeLyraxAudioPlayer;
        if (j2 == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setProgressInterval failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetProgressInterval(j2, j) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    public LyraxAudioPlayer(long j, long j2) {
        this.mNativeLyraxAudioPlayer = j;
        this.mNativeRTCEngine = j2;
        this.mAudioFrameObserver = new LyraxAudioPlayerAudioFrameObserver(this);
        this.mLyraxAudioPlayerListener = new LyraxAudioPlayerListener(this);
        this.mLyraxAudioPlayerCustomSourceProvider = new LyraxAudioPlayerCustomSourceProvider();
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode open(String str, LyraxAudioPlayerConfig lyraxAudioPlayerConfig) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, open failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeOpen(j, str, lyraxAudioPlayerConfig.type.value(), lyraxAudioPlayerConfig.playCount, lyraxAudioPlayerConfig.startPos, lyraxAudioPlayerConfig.autoPlay, lyraxAudioPlayerConfig.callbackOnProgressInterval, lyraxAudioPlayerConfig.syncProgressToRecordFrame) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode openWithCustomSource(LyraxAudioPlayerCustomSource lyraxAudioPlayerCustomSource, LyraxAudioPlayerConfig lyraxAudioPlayerConfig) {
        LyraxErrorCode lyraxErrorCode;
        if (this.mNativeLyraxAudioPlayer == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, openWithCustomSource failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        this.mLyraxAudioPlayerCustomSourceProvider.setCustomSourceProvider(lyraxAudioPlayerCustomSource.provider);
        if (NativeLyraxAudioPlayerFunctions.nativeOpenWithCustomSource(this.mNativeLyraxAudioPlayer, lyraxAudioPlayerCustomSource.mode.value(), lyraxAudioPlayerCustomSource.type.value(), this.mLyraxAudioPlayerCustomSourceProvider, lyraxAudioPlayerConfig.type.value(), lyraxAudioPlayerConfig.playCount, lyraxAudioPlayerConfig.startPos, lyraxAudioPlayerConfig.autoPlay, lyraxAudioPlayerConfig.callbackOnProgressInterval, lyraxAudioPlayerConfig.syncProgressToRecordFrame) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }

    @Override // com.ss.lyrax.audio.ILyraxAudioPlayer
    public synchronized LyraxErrorCode setVolume(int i, LyraxAudioMixingType lyraxAudioMixingType) {
        LyraxErrorCode lyraxErrorCode;
        long j = this.mNativeLyraxAudioPlayer;
        if (j == 0) {
            LogUtil.e("LyraxAudioPlayer", "native LyraxAudioPlayer is invalid, setVolume failed.");
            return LyraxErrorCode.INVALID_STATE;
        }
        if (NativeLyraxAudioPlayerFunctions.nativeSetVolume(j, i, lyraxAudioMixingType.value()) == 0) {
            lyraxErrorCode = LyraxErrorCode.SUCCESS;
        } else {
            lyraxErrorCode = LyraxErrorCode.FAILURE;
        }
        return lyraxErrorCode;
    }
}
