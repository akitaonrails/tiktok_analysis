package com.ss.bytertc.engine.avclient;

import com.ss.solution.tako.TakoAudioFrameInfo;

/* JADX INFO: loaded from: classes21.dex */
public interface LyraxAVAudioPlayer {
    void pushAudioFrame(TakoAudioFrameInfo takoAudioFrameInfo);

    void start(LyraxAVAudioMediaInfo lyraxAVAudioMediaInfo);

    void stop();
}
