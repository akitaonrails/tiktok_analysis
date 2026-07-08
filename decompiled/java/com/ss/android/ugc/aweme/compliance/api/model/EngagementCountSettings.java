package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class EngagementCountSettings implements Serializable {
    public static final int $stable = 0;

    @C09CT("engagement_count_status")
    public final int engagementCountStatus;

    @C09CT("show_request_permission_entry")
    public final boolean showRequestPermissionEntry;

    public EngagementCountSettings() {
        this(1, false);
    }

    public EngagementCountSettings(int i, boolean z) {
        this.engagementCountStatus = i;
        this.showRequestPermissionEntry = z;
    }
}
