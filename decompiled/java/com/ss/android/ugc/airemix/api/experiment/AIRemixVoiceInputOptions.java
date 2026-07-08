package com.ss.android.ugc.airemix.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C538540LAe;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIRemixVoiceInputOptions implements Serializable {

    @C09CT("app_id")
    public final String appId;

    @C09CT("asr_service_address")
    public final String asrServiceAddress;

    @C09CT("asr_service_uri")
    public final String asrServiceUri;

    @C09CT("cluster")
    public final String cluster;

    @C09CT("connection_timeout_interval")
    public final int connectionTimeoutIntervalMs;

    @C09CT("language_identifier")
    public final String languageIdentifier;

    @C09CT("max_speech_duration_limit")
    public final int maxSpeechDurationLimitMs;

    @C09CT("receiving_timeout_interval")
    public final int receivingTimeoutIntervalMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixVoiceInputOptions)) {
            return false;
        }
        AIRemixVoiceInputOptions aIRemixVoiceInputOptions = (AIRemixVoiceInputOptions) obj;
        return Intrinsics.LJFF(this.languageIdentifier, aIRemixVoiceInputOptions.languageIdentifier) && Intrinsics.LJFF(this.appId, aIRemixVoiceInputOptions.appId) && Intrinsics.LJFF(this.cluster, aIRemixVoiceInputOptions.cluster) && Intrinsics.LJFF(this.asrServiceAddress, aIRemixVoiceInputOptions.asrServiceAddress) && Intrinsics.LJFF(this.asrServiceUri, aIRemixVoiceInputOptions.asrServiceUri) && this.connectionTimeoutIntervalMs == aIRemixVoiceInputOptions.connectionTimeoutIntervalMs && this.receivingTimeoutIntervalMs == aIRemixVoiceInputOptions.receivingTimeoutIntervalMs && this.maxSpeechDurationLimitMs == aIRemixVoiceInputOptions.maxSpeechDurationLimitMs;
    }

    public int hashCode() {
        return (((((((((((((this.languageIdentifier.hashCode() * 31) + this.appId.hashCode()) * 31) + this.cluster.hashCode()) * 31) + this.asrServiceAddress.hashCode()) * 31) + this.asrServiceUri.hashCode()) * 31) + this.connectionTimeoutIntervalMs) * 31) + this.receivingTimeoutIntervalMs) * 31) + this.maxSpeechDurationLimitMs;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixVoiceInputOptions(languageIdentifier=");
        sbLIZ.append(this.languageIdentifier);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", cluster=");
        sbLIZ.append(this.cluster);
        sbLIZ.append(", asrServiceAddress=");
        sbLIZ.append(this.asrServiceAddress);
        sbLIZ.append(", asrServiceUri=");
        sbLIZ.append(this.asrServiceUri);
        sbLIZ.append(", connectionTimeoutIntervalMs=");
        sbLIZ.append(this.connectionTimeoutIntervalMs);
        sbLIZ.append(", receivingTimeoutIntervalMs=");
        sbLIZ.append(this.receivingTimeoutIntervalMs);
        sbLIZ.append(", maxSpeechDurationLimitMs=");
        sbLIZ.append(this.maxSpeechDurationLimitMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIRemixVoiceInputOptions() {
        this("en-US,zh-CN", "vs_ai_remix", "vs_tt_tako_all_in_one", "wss://speech.tiktokv.com", "/api/v1/sauc", LivePreCreateNextRoomPlayer.ENABLE, LivePreCreateNextRoomPlayer.ENABLE, C538540LAe.LLJJJIL);
    }

    public AIRemixVoiceInputOptions(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        this.languageIdentifier = str;
        this.appId = str2;
        this.cluster = str3;
        this.asrServiceAddress = str4;
        this.asrServiceUri = str5;
        this.connectionTimeoutIntervalMs = i;
        this.receivingTimeoutIntervalMs = i2;
        this.maxSpeechDurationLimitMs = i3;
    }
}
