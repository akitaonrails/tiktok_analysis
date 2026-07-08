package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CheckProfileNotice {

    @C09CT("count")
    public final int countOfUser;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("users")
    public final List<User> users;

    public CheckProfileNotice() {
        this(0, null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckProfileNotice(int i, List<? extends User> list, long j) {
        this.countOfUser = i;
        this.users = list;
        this.createTime = j;
    }
}
