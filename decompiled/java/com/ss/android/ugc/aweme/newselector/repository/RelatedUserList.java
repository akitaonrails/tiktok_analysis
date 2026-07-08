package com.ss.android.ugc.aweme.newselector.repository;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RelatedUserList implements Serializable {

    @C09CT("users")
    public final List<RelatedFriendStruct> userList;

    public RelatedUserList() {
        this(null);
    }

    public RelatedUserList(List<RelatedFriendStruct> list) {
        this.userList = list;
    }
}
