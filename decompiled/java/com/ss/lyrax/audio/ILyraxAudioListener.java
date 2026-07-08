package com.ss.lyrax.audio;

import com.ss.lyrax.LyraxErrorCode;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxAudioListener {
    void onApiCall(String str, LyraxErrorCode lyraxErrorCode, String str2);

    void onDeviceEventInfo(LyraxAudioDeviceEventInfo lyraxAudioDeviceEventInfo);

    void onEngineInfo(String str);
}
