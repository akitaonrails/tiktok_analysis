package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes25.dex */
public final class SharedFeedShareEntryLimitConfig {

    @C09CT("invite_accept_split")
    public final boolean inviteAcceptSplit;

    @C09CT("limit_per_day")
    public final int limitPerDay;

    @C09CT("limit_total")
    public final int limitTotal;

    public SharedFeedShareEntryLimitConfig() {
        this(false, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedFeedShareEntryLimitConfig)) {
            return false;
        }
        SharedFeedShareEntryLimitConfig sharedFeedShareEntryLimitConfig = (SharedFeedShareEntryLimitConfig) obj;
        return this.inviteAcceptSplit == sharedFeedShareEntryLimitConfig.inviteAcceptSplit && this.limitTotal == sharedFeedShareEntryLimitConfig.limitTotal && this.limitPerDay == sharedFeedShareEntryLimitConfig.limitPerDay;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.inviteAcceptSplit) * 31) + this.limitTotal) * 31) + this.limitPerDay;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedShareEntryLimitConfig(inviteAcceptSplit=");
        sbLIZ.append(this.inviteAcceptSplit);
        sbLIZ.append(", limitTotal=");
        sbLIZ.append(this.limitTotal);
        sbLIZ.append(", limitPerDay=");
        sbLIZ.append(this.limitPerDay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharedFeedShareEntryLimitConfig(boolean z, int i, int i2) {
        this.inviteAcceptSplit = z;
        this.limitTotal = i;
        this.limitPerDay = i2;
    }
}
