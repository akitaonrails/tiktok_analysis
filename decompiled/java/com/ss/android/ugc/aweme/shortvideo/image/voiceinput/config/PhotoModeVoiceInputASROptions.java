package com.ss.android.ugc.aweme.shortvideo.image.voiceinput.config;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PhotoModeVoiceInputASROptions implements Serializable {

    @C09CT("address")
    public final String address;

    @C09CT("app_id")
    public final String appId;

    @C09CT("app_key")
    public final String appKey;

    @C09CT("app_token")
    public final String appToken;

    @C09CT("cluster")
    public final String cluster;

    @C09CT("connect_timeout_ms")
    public final int connectTimeoutMs;

    @C09CT("end_window_size")
    public final int endWindowSize;

    @C09CT("final_text_wait_timeout_ms")
    public final long finalTextWaitTimeoutMs;

    @C09CT("language")
    public final List<String> language;

    @C09CT("max_recording_duration_ms")
    public final long maxRecordingDurationMs;

    @C09CT("model_name")
    public final String modelName;

    @C09CT("no_voice_threshold_ms")
    public final long noVoiceThresholdMs;

    @C09CT("receive_timeout_ms")
    public final int receiveTimeoutMs;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("uri")
    public final String uri;

    public PhotoModeVoiceInputASROptions() {
        this(0L, 0L, 0L, 0, 0, null, null, null, null, null, null, null, 0, null, null, 32767, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeVoiceInputASROptions)) {
            return false;
        }
        PhotoModeVoiceInputASROptions photoModeVoiceInputASROptions = (PhotoModeVoiceInputASROptions) obj;
        return this.maxRecordingDurationMs == photoModeVoiceInputASROptions.maxRecordingDurationMs && this.noVoiceThresholdMs == photoModeVoiceInputASROptions.noVoiceThresholdMs && this.finalTextWaitTimeoutMs == photoModeVoiceInputASROptions.finalTextWaitTimeoutMs && this.connectTimeoutMs == photoModeVoiceInputASROptions.connectTimeoutMs && this.receiveTimeoutMs == photoModeVoiceInputASROptions.receiveTimeoutMs && Intrinsics.LJFF(this.appId, photoModeVoiceInputASROptions.appId) && Intrinsics.LJFF(this.cluster, photoModeVoiceInputASROptions.cluster) && Intrinsics.LJFF(this.address, photoModeVoiceInputASROptions.address) && Intrinsics.LJFF(this.uri, photoModeVoiceInputASROptions.uri) && Intrinsics.LJFF(this.appKey, photoModeVoiceInputASROptions.appKey) && Intrinsics.LJFF(this.appToken, photoModeVoiceInputASROptions.appToken) && Intrinsics.LJFF(this.resourceId, photoModeVoiceInputASROptions.resourceId) && this.endWindowSize == photoModeVoiceInputASROptions.endWindowSize && Intrinsics.LJFF(this.language, photoModeVoiceInputASROptions.language) && Intrinsics.LJFF(this.modelName, photoModeVoiceInputASROptions.modelName);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((C786410Ut5.Y2(this.maxRecordingDurationMs) * 31) + C786410Ut5.Y2(this.noVoiceThresholdMs)) * 31) + C786410Ut5.Y2(this.finalTextWaitTimeoutMs)) * 31) + this.connectTimeoutMs) * 31) + this.receiveTimeoutMs) * 31) + this.appId.hashCode()) * 31) + this.cluster.hashCode()) * 31) + this.address.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.appKey.hashCode()) * 31) + this.appToken.hashCode()) * 31) + this.resourceId.hashCode()) * 31) + this.endWindowSize) * 31) + this.language.hashCode()) * 31) + this.modelName.hashCode();
    }

    public String toString() {
        return "PhotoModeVoiceInputASROptions(maxRecordingDurationMs=" + this.maxRecordingDurationMs + ", noVoiceThresholdMs=" + this.noVoiceThresholdMs + ", finalTextWaitTimeoutMs=" + this.finalTextWaitTimeoutMs + ", connectTimeoutMs=" + this.connectTimeoutMs + ", receiveTimeoutMs=" + this.receiveTimeoutMs + ", appId=" + this.appId + ", cluster=" + this.cluster + ", address=" + this.address + ", uri=" + this.uri + ", appKey=" + this.appKey + ", appToken=" + this.appToken + ", resourceId=" + this.resourceId + ", endWindowSize=" + this.endWindowSize + ", language=" + this.language + ", modelName=" + this.modelName + ')';
    }

    public PhotoModeVoiceInputASROptions(long j, long j2, long j3, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, List<String> list, String str8) {
        this.maxRecordingDurationMs = j;
        this.noVoiceThresholdMs = j2;
        this.finalTextWaitTimeoutMs = j3;
        this.connectTimeoutMs = i;
        this.receiveTimeoutMs = i2;
        this.appId = str;
        this.cluster = str2;
        this.address = str3;
        this.uri = str4;
        this.appKey = str5;
        this.appToken = str6;
        this.resourceId = str7;
        this.endWindowSize = i3;
        this.language = list;
        this.modelName = str8;
    }

    public PhotoModeVoiceInputASROptions(long j, long j2, long j3, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, List list, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 300000L : j, (i4 & 2) != 0 ? 60000L : j2, (i4 & 4) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j3, (i4 & 8) != 0 ? LivePreCreateNextRoomPlayer.ENABLE : i, (i4 & 16) != 0 ? 5000 : i2, (i4 & 32) != 0 ? "vs_tt_photo_mode" : str, (i4 & 64) != 0 ? "vs_tt_tako_all_in_one" : str2, (i4 & 128) != 0 ? "wss://speech.tiktokv.com" : str3, (i4 & 256) != 0 ? "/api/v1/sauc" : str4, (i4 & 512) != 0 ? "IcXBEchuvp" : str5, (i4 & 1024) != 0 ? "" : str6, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str7 : "", (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 100 : i3, (i4 & 8192) != 0 ? C13BV.INSTANCE : list, (i4 & 16384) != 0 ? "bigmodel" : str8);
    }
}
