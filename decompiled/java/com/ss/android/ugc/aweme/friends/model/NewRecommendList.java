package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NewRecommendList extends RecommendList {

    @C09CT("next_cursor")
    public int nextCursor;

    @C09CT("users")
    public List<User> users;

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public List<User> getUserList() {
        List<User> list = this.users;
        return list == null ? new ArrayList() : list;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public int getCursor() {
        return this.nextCursor;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public void setCursor(int i) {
        this.nextCursor = i;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public void setUserList(List<User> list) {
        this.users = list;
    }
}
