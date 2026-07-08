package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ASRSpeechOptions implements Serializable {

    @C09CT("address")
    public final String address;

    @C09CT("app_id")
    public final String appId;

    @C09CT("cluster")
    public final String cluster;

    @C09CT("start_silence_milliseconds")
    public final long connectTimeOut;

    @C09CT("post_speech_silence_timeout_milliseconds")
    public final long postSpeechSilenceTimeoutMilliseconds;

    @C09CT("max_speech_duration_milliseconds")
    public final long totalTimeOut;

    @C09CT("uri")
    public final String uri;

    @C09CT("detected_volume_threshold")
    public final float volumeThreshold;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ASRSpeechOptions)) {
            return false;
        }
        ASRSpeechOptions aSRSpeechOptions = (ASRSpeechOptions) obj;
        return Intrinsics.LJFF(this.address, aSRSpeechOptions.address) && Intrinsics.LJFF(this.uri, aSRSpeechOptions.uri) && Intrinsics.LJFF(this.cluster, aSRSpeechOptions.cluster) && Intrinsics.LJFF(this.appId, aSRSpeechOptions.appId) && this.totalTimeOut == aSRSpeechOptions.totalTimeOut && this.connectTimeOut == aSRSpeechOptions.connectTimeOut && this.postSpeechSilenceTimeoutMilliseconds == aSRSpeechOptions.postSpeechSilenceTimeoutMilliseconds && Float.compare(this.volumeThreshold, aSRSpeechOptions.volumeThreshold) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASRSpeechOptions(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", cluster=");
        sbLIZ.append(this.cluster);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", totalTimeOut=");
        sbLIZ.append(this.totalTimeOut);
        sbLIZ.append(", connectTimeOut=");
        sbLIZ.append(this.connectTimeOut);
        sbLIZ.append(", postSpeechSilenceTimeoutMilliseconds=");
        sbLIZ.append(this.postSpeechSilenceTimeoutMilliseconds);
        sbLIZ.append(", volumeThreshold=");
        sbLIZ.append(this.volumeThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ASRSpeechOptions() {
        this("wss://speech.tiktokv.com", "/api/v1/sauc", "vs_tt_tako_all_in_one", "gec_ai_search", 60000L, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, 0.05f);
    }

    public int hashCode() {
        return (((((((((((((this.address.hashCode() * 31) + this.uri.hashCode()) * 31) + this.cluster.hashCode()) * 31) + this.appId.hashCode()) * 31) + C786410Ut5.Y2(this.totalTimeOut)) * 31) + C786410Ut5.Y2(this.connectTimeOut)) * 31) + C786410Ut5.Y2(this.postSpeechSilenceTimeoutMilliseconds)) * 31) + Float.floatToIntBits(this.volumeThreshold);
    }

    public ASRSpeechOptions(String str, String str2, String str3, String str4, long j, long j2, long j3, float f) {
        this.address = str;
        this.uri = str2;
        this.cluster = str3;
        this.appId = str4;
        this.totalTimeOut = j;
        this.connectTimeOut = j2;
        this.postSpeechSilenceTimeoutMilliseconds = j3;
        this.volumeThreshold = f;
    }
}
