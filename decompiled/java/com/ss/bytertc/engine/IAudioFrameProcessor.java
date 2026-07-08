package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IAudioFrameProcessor {
    int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame);

    int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame);

    int onProcessRecordAudioFrame(IAudioFrame iAudioFrame);

    int onProcessRemoteUserAudioFrame(StreamKey streamKey, IAudioFrame iAudioFrame);

    int onProcessScreenAudioFrame(IAudioFrame iAudioFrame);
}
