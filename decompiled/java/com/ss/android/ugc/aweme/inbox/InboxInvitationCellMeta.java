package com.ss.android.ugc.aweme.inbox;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxInvitationCellMeta {

    @C09CT("hide_days")
    public final int hideDays;

    @C09CT("max_delete_times")
    public final int maxDeleteTimes;

    @C09CT("max_no_action_times")
    public final int maxNoActionTimes;

    public final int hashCode() {
        return (((this.hideDays * 31) + this.maxDeleteTimes) * 31) + this.maxNoActionTimes;
    }

    public InboxInvitationCellMeta() {
        this(14, 3, 3);
    }

    public InboxInvitationCellMeta(int i, int i2, int i3) {
        this.hideDays = i;
        this.maxDeleteTimes = i2;
        this.maxNoActionTimes = i3;
    }
}
