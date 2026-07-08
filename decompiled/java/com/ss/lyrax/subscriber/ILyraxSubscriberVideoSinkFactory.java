package com.ss.lyrax.subscriber;

import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoPixelFormat;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxSubscriberVideoSinkFactory {
    LyraxVideoPixelFormat getRequiredPixelFormat(LyraxStreamKey lyraxStreamKey);

    ILyraxVideoFrameSink getVideoFrameSink(LyraxStreamKey lyraxStreamKey);
}
