package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class VoiceRecordingConfiguration {
    public static final int $stable = 0;

    @C09CT("bitrate")
    public final int bitRate;

    @C09CT("bitrate_sw")
    public final int bitRateSw;

    @C09CT("enable_hw_encode")
    public final boolean enableHwEncode;

    @C09CT("encode_timeout_ms")
    public final long encodeTimeoutMs;

    @C09CT("max_recording_duration_ms")
    public final long maxRecordingDurationMs;

    @C09CT("sample_rate")
    public final int sampleRate;

    @C09CT("sample_rate_sw")
    public final int sampleRateSw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceRecordingConfiguration)) {
            return false;
        }
        VoiceRecordingConfiguration voiceRecordingConfiguration = (VoiceRecordingConfiguration) obj;
        return this.sampleRate == voiceRecordingConfiguration.sampleRate && this.bitRate == voiceRecordingConfiguration.bitRate && this.sampleRateSw == voiceRecordingConfiguration.sampleRateSw && this.bitRateSw == voiceRecordingConfiguration.bitRateSw && this.encodeTimeoutMs == voiceRecordingConfiguration.encodeTimeoutMs && this.enableHwEncode == voiceRecordingConfiguration.enableHwEncode && this.maxRecordingDurationMs == voiceRecordingConfiguration.maxRecordingDurationMs;
    }

    public int hashCode() {
        return (((((((((((this.sampleRate * 31) + this.bitRate) * 31) + this.sampleRateSw) * 31) + this.bitRateSw) * 31) + C786410Ut5.Y2(this.encodeTimeoutMs)) * 31) + C786410Ut5.Z2(this.enableHwEncode)) * 31) + C786410Ut5.Y2(this.maxRecordingDurationMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceRecordingConfiguration(sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", sampleRateSw=");
        sbLIZ.append(this.sampleRateSw);
        sbLIZ.append(", bitRateSw=");
        sbLIZ.append(this.bitRateSw);
        sbLIZ.append(", encodeTimeoutMs=");
        sbLIZ.append(this.encodeTimeoutMs);
        sbLIZ.append(", enableHwEncode=");
        sbLIZ.append(this.enableHwEncode);
        sbLIZ.append(", maxRecordingDurationMs=");
        sbLIZ.append(this.maxRecordingDurationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoiceRecordingConfiguration() {
        this(44100, 32000, 22050, 24000, 60000L, true, 180000L);
    }

    public VoiceRecordingConfiguration(int i, int i2, int i3, int i4, long j, boolean z, long j2) {
        this.sampleRate = i;
        this.bitRate = i2;
        this.sampleRateSw = i3;
        this.bitRateSw = i4;
        this.encodeTimeoutMs = j;
        this.enableHwEncode = z;
        this.maxRecordingDurationMs = j2;
    }
}
