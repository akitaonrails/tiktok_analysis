package com.ss.android.ugc.aweme.services.audio;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceDetectionResultForServer {
    public final Double avgLoudnessValue;
    public int isVoiceServerJudgeTimeout;
    public final Long musicServerCost;
    public final Double peakLoudnessValue;
    public final int recError;
    public final int recReturnResult;
    public final Long recServerJudgeDuration;
    public final long voiceServerJudgeDuration;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceDetectionResultForServer(isVoiceServerJudgeTimeout=");
        sbLIZ.append(this.isVoiceServerJudgeTimeout);
        sbLIZ.append(", recReturnResult=");
        sbLIZ.append(this.recReturnResult);
        sbLIZ.append(", recError=");
        sbLIZ.append(this.recError);
        sbLIZ.append(", voiceServerJudgeDuration=");
        sbLIZ.append(this.voiceServerJudgeDuration);
        sbLIZ.append(", peakLoudnessValue=");
        sbLIZ.append(this.peakLoudnessValue);
        sbLIZ.append(", avgLoudnessValue=");
        sbLIZ.append(this.avgLoudnessValue);
        sbLIZ.append(", musicServerCost=");
        sbLIZ.append(this.musicServerCost);
        sbLIZ.append(", recServerJudgeDuration=");
        sbLIZ.append(this.recServerJudgeDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int isVoiceServerJudgeTimeout() {
        return this.isVoiceServerJudgeTimeout;
    }

    public final void setVoiceServerJudgeTimeout(int i) {
        this.isVoiceServerJudgeTimeout = i;
    }

    public VoiceDetectionResultForServer(int i, int i2, int i3, long j, Double d, Double d2, Long l, Long l2) {
        this.isVoiceServerJudgeTimeout = i;
        this.recReturnResult = i2;
        this.recError = i3;
        this.voiceServerJudgeDuration = j;
        this.peakLoudnessValue = d;
        this.avgLoudnessValue = d2;
        this.musicServerCost = l;
        this.recServerJudgeDuration = l2;
    }
}
