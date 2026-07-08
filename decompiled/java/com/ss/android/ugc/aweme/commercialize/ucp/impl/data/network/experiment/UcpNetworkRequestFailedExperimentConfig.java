package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UcpNetworkRequestFailedExperimentConfig {

    @C09CT("enable_full_subtitle")
    public final int enableFullSubtitle;

    @C09CT("upload_request_info_configs")
    public final List<UploadRequestInfoConfig> uploadRequestInfoConfigs;

    public UcpNetworkRequestFailedExperimentConfig() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpNetworkRequestFailedExperimentConfig)) {
            return false;
        }
        UcpNetworkRequestFailedExperimentConfig ucpNetworkRequestFailedExperimentConfig = (UcpNetworkRequestFailedExperimentConfig) obj;
        return this.enableFullSubtitle == ucpNetworkRequestFailedExperimentConfig.enableFullSubtitle && Intrinsics.LJFF(this.uploadRequestInfoConfigs, ucpNetworkRequestFailedExperimentConfig.uploadRequestInfoConfigs);
    }

    public final int hashCode() {
        return (this.enableFullSubtitle * 31) + this.uploadRequestInfoConfigs.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpNetworkRequestFailedExperimentConfig(enableFullSubtitle=");
        sbLIZ.append(this.enableFullSubtitle);
        sbLIZ.append(", uploadRequestInfoConfigs=");
        sbLIZ.append(this.uploadRequestInfoConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpNetworkRequestFailedExperimentConfig(int i, List<UploadRequestInfoConfig> list) {
        this.enableFullSubtitle = i;
        this.uploadRequestInfoConfigs = list;
    }

    public UcpNetworkRequestFailedExperimentConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
