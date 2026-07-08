package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class AwemeUnreadInfo implements Serializable {

    @C09CT("unread_id_list")
    public final List<String> unreadIdList;

    public AwemeUnreadInfo(List<String> list) {
        this.unreadIdList = list;
    }
}
