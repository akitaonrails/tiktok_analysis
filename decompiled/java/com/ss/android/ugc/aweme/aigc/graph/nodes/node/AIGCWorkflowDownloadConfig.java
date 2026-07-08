package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowDownloadConfig implements Serializable {

    @C09CT("download_concurrency")
    public final Integer downloadConcurrency;

    @C09CT("download_dir")
    public final String downloadDir;

    @C09CT("download_retry_count")
    public final Integer downloadRetryCount;

    public AIGCWorkflowDownloadConfig() {
        this(null, 3, 3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowDownloadConfig)) {
            return false;
        }
        AIGCWorkflowDownloadConfig aIGCWorkflowDownloadConfig = (AIGCWorkflowDownloadConfig) obj;
        return Intrinsics.LJFF(this.downloadDir, aIGCWorkflowDownloadConfig.downloadDir) && Intrinsics.LJFF(this.downloadConcurrency, aIGCWorkflowDownloadConfig.downloadConcurrency) && Intrinsics.LJFF(this.downloadRetryCount, aIGCWorkflowDownloadConfig.downloadRetryCount);
    }

    public int hashCode() {
        String str = this.downloadDir;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.downloadConcurrency;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.downloadRetryCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowDownloadConfig(downloadDir=");
        sbLIZ.append(this.downloadDir);
        sbLIZ.append(", downloadConcurrency=");
        sbLIZ.append(this.downloadConcurrency);
        sbLIZ.append(", downloadRetryCount=");
        sbLIZ.append(this.downloadRetryCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowDownloadConfig(String str, Integer num, Integer num2) {
        this.downloadDir = str;
        this.downloadConcurrency = num;
        this.downloadRetryCount = num2;
    }
}
