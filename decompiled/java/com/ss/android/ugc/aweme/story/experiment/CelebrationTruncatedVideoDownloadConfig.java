package com.ss.android.ugc.aweme.story.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class CelebrationTruncatedVideoDownloadConfig {
    public static final CelebrationTruncatedVideoDownloadSettings LIZ = new CelebrationTruncatedVideoDownloadSettings(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(559));

    public static final class CelebrationTruncatedVideoDownloadSettings {

        @C09CT("allow_truncated_download")
        public final boolean allowTruncatedDownload;

        @C09CT("download_duration_ms")
        public final long downloadDurationMs;

        public CelebrationTruncatedVideoDownloadSettings() {
            this(false, 0L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CelebrationTruncatedVideoDownloadSettings)) {
                return false;
            }
            CelebrationTruncatedVideoDownloadSettings celebrationTruncatedVideoDownloadSettings = (CelebrationTruncatedVideoDownloadSettings) obj;
            return this.allowTruncatedDownload == celebrationTruncatedVideoDownloadSettings.allowTruncatedDownload && this.downloadDurationMs == celebrationTruncatedVideoDownloadSettings.downloadDurationMs;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.allowTruncatedDownload) * 31) + C786410Ut5.Y2(this.downloadDurationMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CelebrationTruncatedVideoDownloadSettings(allowTruncatedDownload=");
            sbLIZ.append(this.allowTruncatedDownload);
            sbLIZ.append(", downloadDurationMs=");
            sbLIZ.append(this.downloadDurationMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CelebrationTruncatedVideoDownloadSettings(boolean z, long j) {
            this.allowTruncatedDownload = z;
            this.downloadDurationMs = j;
        }
    }
}
