package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;

/* JADX INFO: loaded from: classes23.dex */
public interface IVoiceDetectorConfig {
    boolean disableVoiceDetect();

    AudioRatioInfo getVoiceDetectCacheResult();

    Object getVoiceDetectPath(InterfaceC1364105Vn<? super DetectionPathResult> interfaceC1364105Vn);

    void mobDetectEvent(VoiceDetectionParam voiceDetectionParam, VoiceDetectionResult voiceDetectionResult);

    void mobEvent(int i, long j, long j2, long j3, long j4, double d, VoiceDetectionResult voiceDetectionResult, long j5);

    void setVoiceDetectCacheResult(AudioRatioInfo audioRatioInfo);

    void setVoiceDetectionParam(VoiceDetectionParam voiceDetectionParam);
}
