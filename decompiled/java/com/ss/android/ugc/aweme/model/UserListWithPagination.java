package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class UserListWithPagination {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("offset")
    public final long offset;

    @C09CT("user_list")
    public final List<User> userList;

    public UserListWithPagination() {
        this(null, 0L, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserListWithPagination(List<? extends User> list, long j, boolean z) {
        this.userList = list;
        this.offset = j;
        this.hasMore = z;
    }

    public UserListWithPagination(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
