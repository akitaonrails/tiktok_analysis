package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes23.dex */
public final class DetectionPathResult {
    public final VoiceDetectionResult detectionResult;
    public final String path;

    public DetectionPathResult(String str, VoiceDetectionResult voiceDetectionResult) {
        this.path = str;
        this.detectionResult = voiceDetectionResult;
    }
}
