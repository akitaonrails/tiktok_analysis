package com.ss.lyrax.subscriber;

import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.stream.LyraxFirstFramePlayState;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.lyrax.video.LyraxVideoFrameInfo;
import com.ss.lyrax.video.LyraxVideoSEIStreamEvent;
import com.ss.lyrax.video.LyraxVideoSimulcastSubscribeFallbackInfo;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;
import com.ss.lyrax.video.LyraxVideoSuperResolutionModeChangedReason;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxSubscriberListener {
    void onAudioFramePlayStateChanged(String str, LyraxFirstFramePlayState lyraxFirstFramePlayState);

    void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo);

    void onAudioRenderStallEnd(long j);

    void onAudioRenderStallStart(long j);

    void onFirstAudioFrameDecoded();

    void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats);

    void onStatsReport(LyraxSubscriberStats lyraxSubscriberStats);

    void onSubscribeSignalingSent(long j);

    void onSubscriberStateChanged(LyraxSubscriberState lyraxSubscriberState, String str, LyraxErrorCode lyraxErrorCode);

    void onVideoDecodeStallHappened(long j);

    void onVideoDecoderError(int i, String str);

    void onVideoFirstFrameDecoded(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoFirstFrameDemuxed(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoFirstFrameRealRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoFirstFrameRenderedEnd(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoFirstPacketReceived(long j);

    void onVideoFramePlayStateChanged(LyraxFirstFramePlayState lyraxFirstFramePlayState);

    void onVideoFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoPreDecodeStallHappened(long j);

    void onVideoSEIReceived(LyraxVideoExtraData lyraxVideoExtraData);

    void onVideoSEIStreamChanged(LyraxVideoSEIStreamEvent lyraxVideoSEIStreamEvent);

    void onVideoSimulcastFallback(LyraxVideoSimulcastSubscribeFallbackInfo lyraxVideoSimulcastSubscribeFallbackInfo);

    void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoSuperResolutionModeChanged(LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode, LyraxVideoSuperResolutionModeChangedReason lyraxVideoSuperResolutionModeChangedReason);
}
