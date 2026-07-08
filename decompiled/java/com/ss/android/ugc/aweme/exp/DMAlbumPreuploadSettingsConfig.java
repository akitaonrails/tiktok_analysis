package com.ss.android.ugc.aweme.exp;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class DMAlbumPreuploadSettingsConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("await_timeout_ms")
    public final long awaitTimeoutMs;

    @C09CT("max_concurrent_uploads")
    public final int maxConcurrentUploads;

    @C09CT("max_retry_count")
    public final int maxRetryCount;

    public DMAlbumPreuploadSettingsConfig() {
        this(3, 1, 60000L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMAlbumPreuploadSettingsConfig)) {
            return false;
        }
        DMAlbumPreuploadSettingsConfig dMAlbumPreuploadSettingsConfig = (DMAlbumPreuploadSettingsConfig) obj;
        return this.maxConcurrentUploads == dMAlbumPreuploadSettingsConfig.maxConcurrentUploads && this.maxRetryCount == dMAlbumPreuploadSettingsConfig.maxRetryCount && this.awaitTimeoutMs == dMAlbumPreuploadSettingsConfig.awaitTimeoutMs;
    }

    public int hashCode() {
        return (((this.maxConcurrentUploads * 31) + this.maxRetryCount) * 31) + C786410Ut5.Y2(this.awaitTimeoutMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMAlbumPreuploadSettingsConfig(maxConcurrentUploads=");
        sbLIZ.append(this.maxConcurrentUploads);
        sbLIZ.append(", maxRetryCount=");
        sbLIZ.append(this.maxRetryCount);
        sbLIZ.append(", awaitTimeoutMs=");
        sbLIZ.append(this.awaitTimeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DMAlbumPreuploadSettingsConfig(int i, int i2, long j) {
        this.maxConcurrentUploads = i;
        this.maxRetryCount = i2;
        this.awaitTimeoutMs = j;
    }
}
