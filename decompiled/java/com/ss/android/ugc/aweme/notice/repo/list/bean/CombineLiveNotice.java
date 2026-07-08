package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes25.dex */
public final class CombineLiveNotice {

    @C09CT("room_info")
    public final n roomInfo;

    @C09CT("type")
    public final int type;

    @C09CT("owner")
    public final User user;

    public CombineLiveNotice() {
        this(null, 0, null);
    }

    public CombineLiveNotice(User user, int i, n nVar) {
        this.user = user;
        this.type = i;
        this.roomInfo = nVar;
    }
}
