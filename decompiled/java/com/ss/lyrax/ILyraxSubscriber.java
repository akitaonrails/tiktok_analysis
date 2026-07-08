package com.ss.lyrax;

import com.ss.lyrax.audio.LyraxAudioAlignmentMode;
import com.ss.lyrax.audio.LyraxAudioStallDetectConfig;
import com.ss.lyrax.room.LyraxVideoRemoteConfig;
import com.ss.lyrax.stream.LyraxCredential;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.subscriber.ILyraxSubscriberListener;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoDecoderConfig;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxSubscriber extends ILyraxObject {
    LyraxErrorCode addVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat);

    void dispose();

    LyraxErrorCode enableAudioRenderStallDetect(LyraxAudioStallDetectConfig lyraxAudioStallDetectConfig);

    LyraxSubscriberStats getStats();

    String getStreamId();

    LyraxErrorCode mute(LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode removeVideoFrameSink(ILyraxVideoFrameSink iLyraxVideoFrameSink);

    LyraxErrorCode requestVideoKeyFrame();

    LyraxErrorCode setAudioAlignmentProperty(LyraxAudioAlignmentMode lyraxAudioAlignmentMode);

    LyraxErrorCode setAudioPlaybackVolume(int i);

    LyraxErrorCode setListener(ILyraxSubscriberListener iLyraxSubscriberListener);

    LyraxErrorCode setSubscriberCredential(LyraxCredential lyraxCredential);

    LyraxErrorCode setSubscriberExtraInfo(String str);

    LyraxErrorCode setVideoDecoderConfig(LyraxVideoDecoderConfig lyraxVideoDecoderConfig);

    LyraxErrorCode setVideoRemoteConfig(LyraxVideoRemoteConfig lyraxVideoRemoteConfig);

    LyraxErrorCode setVideoRenderConfig(LyraxVideoRenderConfig lyraxVideoRenderConfig);

    LyraxErrorCode setVideoSuperResolution(LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode);

    LyraxErrorCode subscribe();

    LyraxErrorCode unmute(LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode unsubscribe();
}
