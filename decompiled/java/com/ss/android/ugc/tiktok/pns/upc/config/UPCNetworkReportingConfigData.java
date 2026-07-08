package com.ss.android.ugc.tiktok.pns.upc.config;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UPCNetworkReportingConfigData {

    @C09CT("enable_upc_network_reporting")
    public final boolean enableUpcNetworkReporting;

    @C09CT("upc_network_path_block_list")
    public final List<String> upcNetworkPathBlockList;

    public UPCNetworkReportingConfigData() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UPCNetworkReportingConfigData)) {
            return false;
        }
        UPCNetworkReportingConfigData uPCNetworkReportingConfigData = (UPCNetworkReportingConfigData) obj;
        return this.enableUpcNetworkReporting == uPCNetworkReportingConfigData.enableUpcNetworkReporting && Intrinsics.LJFF(this.upcNetworkPathBlockList, uPCNetworkReportingConfigData.upcNetworkPathBlockList);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableUpcNetworkReporting) * 31) + this.upcNetworkPathBlockList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UPCNetworkReportingConfigData(enableUpcNetworkReporting=");
        sbLIZ.append(this.enableUpcNetworkReporting);
        sbLIZ.append(", upcNetworkPathBlockList=");
        sbLIZ.append(this.upcNetworkPathBlockList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UPCNetworkReportingConfigData(boolean z, List<String> list) {
        this.enableUpcNetworkReporting = z;
        this.upcNetworkPathBlockList = list;
    }

    public UPCNetworkReportingConfigData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
