package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class VoicePipelineConfiguration {
    public static final int $stable = 0;

    @C09CT("auth_key_max_attempts")
    public final int authKeyMaxAttempts;

    @C09CT("auth_key_timeout_ms")
    public final long authKeyTimeoutMs;

    @C09CT("create_api_timeout_ms")
    public final long createApiTimeoutMs;

    @C09CT("download_max_concurrent")
    public final int downloadMaxConcurrent;

    @C09CT("upload_max_attempts")
    public final int uploadMaxAttempts;

    @C09CT("upload_timeout_ms")
    public final long uploadTimeoutMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoicePipelineConfiguration)) {
            return false;
        }
        VoicePipelineConfiguration voicePipelineConfiguration = (VoicePipelineConfiguration) obj;
        return this.authKeyTimeoutMs == voicePipelineConfiguration.authKeyTimeoutMs && this.authKeyMaxAttempts == voicePipelineConfiguration.authKeyMaxAttempts && this.uploadTimeoutMs == voicePipelineConfiguration.uploadTimeoutMs && this.uploadMaxAttempts == voicePipelineConfiguration.uploadMaxAttempts && this.createApiTimeoutMs == voicePipelineConfiguration.createApiTimeoutMs && this.downloadMaxConcurrent == voicePipelineConfiguration.downloadMaxConcurrent;
    }

    public int hashCode() {
        return (((((((((C786410Ut5.Y2(this.authKeyTimeoutMs) * 31) + this.authKeyMaxAttempts) * 31) + C786410Ut5.Y2(this.uploadTimeoutMs)) * 31) + this.uploadMaxAttempts) * 31) + C786410Ut5.Y2(this.createApiTimeoutMs)) * 31) + this.downloadMaxConcurrent;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoicePipelineConfiguration(authKeyTimeoutMs=");
        sbLIZ.append(this.authKeyTimeoutMs);
        sbLIZ.append(", authKeyMaxAttempts=");
        sbLIZ.append(this.authKeyMaxAttempts);
        sbLIZ.append(", uploadTimeoutMs=");
        sbLIZ.append(this.uploadTimeoutMs);
        sbLIZ.append(", uploadMaxAttempts=");
        sbLIZ.append(this.uploadMaxAttempts);
        sbLIZ.append(", createApiTimeoutMs=");
        sbLIZ.append(this.createApiTimeoutMs);
        sbLIZ.append(", downloadMaxConcurrent=");
        sbLIZ.append(this.downloadMaxConcurrent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoicePipelineConfiguration() {
        this(15000L, 3, 15000L, 3, 15000L, 3);
    }

    public VoicePipelineConfiguration(long j, int i, long j2, int i2, long j3, int i3) {
        this.authKeyTimeoutMs = j;
        this.authKeyMaxAttempts = i;
        this.uploadTimeoutMs = j2;
        this.uploadMaxAttempts = i2;
        this.createApiTimeoutMs = j3;
        this.downloadMaxConcurrent = i3;
    }
}
