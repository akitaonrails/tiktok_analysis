package com.ss.lyrax;

import com.ss.lyrax.audio.ILyraxAudioListener;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.audio.LyraxAudioFrame;
import com.ss.lyrax.audio.LyraxAudioOptionKey;
import com.ss.lyrax.audio.LyraxAudioRenderType;
import com.ss.lyrax.audio.LyraxAudioRoute;
import com.ss.lyrax.audio.LyraxAudioScenarioType;
import com.ss.lyrax.audio.LyraxAudioSceneType;
import com.ss.lyrax.audio.LyraxAudioSourceType;
import com.ss.lyrax.utils.LyraxValue;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAudio extends ILyraxObject {
    ILyraxAudioPlayer createAudioPlayer();

    void dispose();

    LyraxAudioRoute getAudioRoute();

    LyraxErrorCode pushExternalAudioFrame(LyraxAudioFrame lyraxAudioFrame);

    LyraxErrorCode pushScreenAudioFrame(LyraxAudioFrame lyraxAudioFrame);

    LyraxErrorCode setAudioProperty(LyraxAudioOptionKey lyraxAudioOptionKey, LyraxValue lyraxValue);

    LyraxErrorCode setAudioRenderType(LyraxAudioRenderType lyraxAudioRenderType);

    LyraxErrorCode setAudioRoute(LyraxAudioRoute lyraxAudioRoute);

    LyraxErrorCode setAudioScenario(LyraxAudioScenarioType lyraxAudioScenarioType);

    LyraxErrorCode setAudioScene(LyraxAudioSceneType lyraxAudioSceneType);

    LyraxErrorCode setAudioSourceType(LyraxAudioSourceType lyraxAudioSourceType);

    LyraxErrorCode setCaptureVolume(int i);

    LyraxErrorCode setDefaultAudioRoute(LyraxAudioRoute lyraxAudioRoute);

    LyraxErrorCode setListener(ILyraxAudioListener iLyraxAudioListener);

    LyraxErrorCode setPlaybackVolume(int i);

    LyraxErrorCode setScreenAudioSourceType(LyraxAudioSourceType lyraxAudioSourceType);

    LyraxErrorCode startAudioCapture();

    LyraxErrorCode stopAudioCapture();
}
