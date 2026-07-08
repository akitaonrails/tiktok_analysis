package com.ss.bytertc.engine.avclient;

import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAVListener {
    void onAudioRouteChanged(LyraxAVAudioRoute lyraxAVAudioRoute, LyraxAVAudioRoute lyraxAVAudioRoute2);

    void onError(int i);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onFirstAudioFrameDecoded(String str);

    void onLocalAudioProperties(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr);

    void onNetworkQuality(LyraxNetworkQuality lyraxNetworkQuality, LyraxNetworkQuality lyraxNetworkQuality2);

    void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState);

    void onRecordCallback(String str);

    void onRemoteAudioProperties(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr);

    void onUserJoined(String str);

    void onUserLeft(String str);

    void onUserMessageReceived(String str, String str2);
}
