package com.ss.android.ugc.aweme.services.audio;

import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceDetectionResult {
    public long algoDuration;
    public AudioRatioInfo audioRatioInfo;
    public long checkMuteDuration;
    public long compileAudioDuration;
    public long downloadModeDuration;
    public int errorCode;
    public String errorMsg;
    public long extractDuration;
    public long fileSize;
    public int isCache;
    public long lastDetectTime;
    public List<LoudnessDetectResult> loudnessList;
    public long mixTrackDuration;
    public long totalDuration;
    public Map<String, Long> waitHandlerDuration;
    public long waitThreadDuration;

    public VoiceDetectionResult() {
        this(-1, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, new ArrayList(), new LinkedHashMap());
    }

    public String toString() {
        return "VoiceDetectionResult(errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", audioRatioInfo=" + this.audioRatioInfo + ", extractDuration=" + this.extractDuration + ", algoDuration=" + this.algoDuration + ", downloadModeDuration=" + this.downloadModeDuration + ", totalDuration=" + this.totalDuration + ", fileSize=" + this.fileSize + ", lastDetectTime=" + this.lastDetectTime + ", mixTrackDuration=" + this.mixTrackDuration + ", compileAudioDuration=" + this.compileAudioDuration + ", checkMuteDuration=" + this.checkMuteDuration + ", waitThreadDuration=" + this.waitThreadDuration + ", isCache=" + this.isCache + ", loudnessList=" + this.loudnessList + ", waitHandlerDuration=" + this.waitHandlerDuration + ')';
    }

    public final int isCache() {
        return this.isCache;
    }

    public final void setAlgoDuration(long j) {
        this.algoDuration = j;
    }

    public final void setAudioRatioInfo(AudioRatioInfo audioRatioInfo) {
        this.audioRatioInfo = audioRatioInfo;
    }

    public final void setCache(int i) {
        this.isCache = i;
    }

    public final void setCheckMuteDuration(long j) {
        this.checkMuteDuration = j;
    }

    public final void setCompileAudioDuration(long j) {
        this.compileAudioDuration = j;
    }

    public final void setDownloadModeDuration(long j) {
        this.downloadModeDuration = j;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setExtractDuration(long j) {
        this.extractDuration = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setLastDetectTime(long j) {
        this.lastDetectTime = j;
    }

    public final void setLoudnessList(List<LoudnessDetectResult> list) {
        this.loudnessList = list;
    }

    public final void setMixTrackDuration(long j) {
        this.mixTrackDuration = j;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public final void setWaitHandlerDuration(Map<String, Long> map) {
        this.waitHandlerDuration = map;
    }

    public final void setWaitThreadDuration(long j) {
        this.waitThreadDuration = j;
    }

    public VoiceDetectionResult(int i, String str, AudioRatioInfo audioRatioInfo, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i2, List<LoudnessDetectResult> list, Map<String, Long> map) {
        this.errorCode = i;
        this.errorMsg = str;
        this.audioRatioInfo = audioRatioInfo;
        this.extractDuration = j;
        this.algoDuration = j2;
        this.downloadModeDuration = j3;
        this.totalDuration = j4;
        this.fileSize = j5;
        this.lastDetectTime = j6;
        this.mixTrackDuration = j7;
        this.compileAudioDuration = j8;
        this.checkMuteDuration = j9;
        this.waitThreadDuration = j10;
        this.isCache = i2;
        this.loudnessList = list;
        this.waitHandlerDuration = map;
    }
}
