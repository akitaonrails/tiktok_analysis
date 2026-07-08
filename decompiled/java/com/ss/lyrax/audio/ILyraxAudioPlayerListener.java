package com.ss.lyrax.audio;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAudioPlayerListener {
    void onLyraxAudioPlayerPlayingProgress(ILyraxAudioPlayer iLyraxAudioPlayer, long j);

    void onLyraxAudioPlayerStateChanged(ILyraxAudioPlayer iLyraxAudioPlayer, LyraxPlayerState lyraxPlayerState, LyraxPlayerError lyraxPlayerError);
}
