package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class PollDetailResponse extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("offset")
    public int offset;

    @C09CT("user_list")
    public List<? extends User> users;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setUsers(List<? extends User> list) {
        this.users = list;
    }
}
