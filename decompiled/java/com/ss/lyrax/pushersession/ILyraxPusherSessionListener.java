package com.ss.lyrax.pushersession;

import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxPusherSessionListener {
    void onAudioProfanityDetectedCallback(String str);

    void onEncodeBitrateChanged(int i);

    void onError(int i, int i2, String str);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onFirstFrame(boolean z, boolean z2);

    void onLiveStreamChange(int i, int i2, LyraxLiveStreamResult lyraxLiveStreamResult);

    void onLogMonitor(String str);

    void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats);

    void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i);

    void onStatistics(LyraxPusherStatistics lyraxPusherStatistics);

    void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol);
}
