package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IAudioFrameObserver {
    void onMixedAudioFrame(IAudioFrame iAudioFrame);

    void onPlaybackAudioFrame(IAudioFrame iAudioFrame);

    void onRecordAudioFrame(IAudioFrame iAudioFrame);

    void onRemoteUserAudioFrame(StreamKey streamKey, IAudioFrame iAudioFrame);
}
