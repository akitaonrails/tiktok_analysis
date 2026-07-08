package com.ss.lyrax.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAudioPlayerCustomSourceProvider {
    int onReadData(ByteBuffer byteBuffer, int i);

    long onSeek(long j, LyraxAudioPlayerCustomSourceSeekWhence lyraxAudioPlayerCustomSourceSeekWhence);
}
