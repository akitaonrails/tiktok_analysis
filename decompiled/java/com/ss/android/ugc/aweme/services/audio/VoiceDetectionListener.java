package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes23.dex */
public interface VoiceDetectionListener {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onExtractAudioPath(VoiceDetectionListener voiceDetectionListener, String str, int i, int i2) {
        }

        public static void onUpdateResult(VoiceDetectionListener voiceDetectionListener, VoiceDetectionResult voiceDetectionResult) {
        }
    }

    void onExtractAudioPath(String str, int i, int i2);

    void onUpdateResult(VoiceDetectionResult voiceDetectionResult);

    void onVoiceActivityDetected(VoiceDetectionResult voiceDetectionResult);
}
