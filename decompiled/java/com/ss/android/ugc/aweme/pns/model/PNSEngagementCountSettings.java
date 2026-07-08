package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PNSEngagementCountSettings implements Serializable {

    @C09CT("engagement_count_status")
    public final int engagementCountStatus;

    @C09CT("show_request_permission_entry")
    public final boolean showRequestPermissionEntry;

    public PNSEngagementCountSettings() {
        this(1, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSEngagementCountSettings)) {
            return false;
        }
        PNSEngagementCountSettings pNSEngagementCountSettings = (PNSEngagementCountSettings) obj;
        return this.engagementCountStatus == pNSEngagementCountSettings.engagementCountStatus && this.showRequestPermissionEntry == pNSEngagementCountSettings.showRequestPermissionEntry;
    }

    public int hashCode() {
        return (this.engagementCountStatus * 31) + C786410Ut5.Z2(this.showRequestPermissionEntry);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSEngagementCountSettings(engagementCountStatus=");
        sbLIZ.append(this.engagementCountStatus);
        sbLIZ.append(", showRequestPermissionEntry=");
        sbLIZ.append(this.showRequestPermissionEntry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSEngagementCountSettings(int i, boolean z) {
        this.engagementCountStatus = i;
        this.showRequestPermissionEntry = z;
    }
}
