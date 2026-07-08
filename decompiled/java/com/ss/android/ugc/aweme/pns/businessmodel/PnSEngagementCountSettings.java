package com.ss.android.ugc.aweme.pns.businessmodel;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PnSEngagementCountSettings implements Serializable {

    @C09CT("engagement_count_status")
    public final int engagementCountStatus;

    @C09CT("show_request_permission_entry")
    public final boolean showRequestPermissionEntry;

    public PnSEngagementCountSettings() {
        this(1, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnSEngagementCountSettings)) {
            return false;
        }
        PnSEngagementCountSettings pnSEngagementCountSettings = (PnSEngagementCountSettings) obj;
        return this.engagementCountStatus == pnSEngagementCountSettings.engagementCountStatus && this.showRequestPermissionEntry == pnSEngagementCountSettings.showRequestPermissionEntry;
    }

    public int hashCode() {
        return (this.engagementCountStatus * 31) + C786410Ut5.Z2(this.showRequestPermissionEntry);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnSEngagementCountSettings(engagementCountStatus=");
        sbLIZ.append(this.engagementCountStatus);
        sbLIZ.append(", showRequestPermissionEntry=");
        sbLIZ.append(this.showRequestPermissionEntry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnSEngagementCountSettings(int i, boolean z) {
        this.engagementCountStatus = i;
        this.showRequestPermissionEntry = z;
    }
}
