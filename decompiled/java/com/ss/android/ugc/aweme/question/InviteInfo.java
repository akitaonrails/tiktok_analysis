package com.ss.android.ugc.aweme.question;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InviteInfo implements Serializable {

    @C09CT("inviter_list")
    public final List<User> inviterList;

    @C09CT("total_inviter_count")
    public final Integer totalInviterCount;

    public InviteInfo() {
        this(null, null);
    }

    public final List<User> getInviterList() {
        return this.inviterList;
    }

    public final Integer getTotalInviterCount() {
        return this.totalInviterCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InviteInfo(List<? extends User> list, Integer num) {
        this.inviterList = list;
        this.totalInviterCount = num;
    }
}
