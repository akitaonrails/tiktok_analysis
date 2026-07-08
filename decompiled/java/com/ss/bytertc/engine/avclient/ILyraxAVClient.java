package com.ss.bytertc.engine.avclient;

import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAVClient {
    LyraxAVAudioPlayer createAudioPlayer(LyraxAVAudioSource lyraxAVAudioSource);

    void destroyClient();

    void enableAudioPropertiesMonitor(LyraxAudioPropertiesConfig lyraxAudioPropertiesConfig);

    void muteAllRemoteUsers();

    void muteLocalAudio();

    int muteLocalVideoStream(boolean z);

    int pushExternalVideo(LyraxVideoFrame lyraxVideoFrame);

    void sendSEI(String str, Object obj, int i, boolean z, boolean z2);

    long sendUserMessage(String str, String str2);

    void setAudioRoute(LyraxAVAudioRoute lyraxAVAudioRoute);

    void setDefaultAudioRoute(LyraxAVAudioRoute lyraxAVAudioRoute);

    void setFeature(String str, LyraxTranscoderFeature lyraxTranscoderFeature);

    void startAudioCapture();

    void startVoiceCall();

    void stopAudioCapture();

    void stopVoiceCall();

    void unmuteAllRemoteUsers();

    void unmuteLocalAudio();
}
