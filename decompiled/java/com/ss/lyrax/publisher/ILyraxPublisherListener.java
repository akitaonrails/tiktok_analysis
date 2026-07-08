package com.ss.lyrax.publisher;

import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.stream.LyraxAudioLocalState;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.stream.LyraxVideoLocalState;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.video.LyraxVideoFrameInfo;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason;
import com.ss.lyrax.video.LyraxVideoSourceWantedData;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxPublisherListener {
    void onAudioLocalStateChanged(LyraxAudioLocalState lyraxAudioLocalState);

    void onAudioProfanityDetectedCallback(String str);

    void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onFirstAudioFrameCaptured();

    void onHardwareROISupportStateUpdated(boolean z);

    void onLogMonitor(String str);

    void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats);

    void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i);

    void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol);

    void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo);

    void onVideoLocalStateChanged(LyraxVideoLocalState lyraxVideoLocalState);

    void onVideoPerformanceAlarms(LyraxVideoPerformanceAlarmMode lyraxVideoPerformanceAlarmMode, LyraxVideoPerformanceAlarmReason lyraxVideoPerformanceAlarmReason, LyraxVideoSourceWantedData lyraxVideoSourceWantedData);

    void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo);
}
