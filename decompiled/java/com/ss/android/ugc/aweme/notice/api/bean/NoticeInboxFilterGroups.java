package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeInboxFilterGroups {

    @C09CT("filter_type")
    public int filterType;

    @C09CT("groups")
    public List<Integer> groups;

    public NoticeInboxFilterGroups(List<Integer> list, int i, int i2) {
        this.groups = list;
        this.filterType = i;
    }
}
