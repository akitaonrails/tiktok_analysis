package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GraceInfo {

    @C09CT("grace_end_time")
    public Long graceEndTime;

    @C09CT("is_in_grace_period")
    public Boolean isInGracePeriod;

    @C09CT("is_package_deleted")
    public boolean isPackageDeleted;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isInGracePeriod != null) {
            sb.append(", is_in_grace_period=");
            sb.append(this.isInGracePeriod);
        }
        if (this.graceEndTime != null) {
            sb.append(", grace_end_time=");
            sb.append(this.graceEndTime);
        }
        sb.replace(0, 2, "GraceInfo{");
        sb.append('}');
        return sb.toString();
    }
}
