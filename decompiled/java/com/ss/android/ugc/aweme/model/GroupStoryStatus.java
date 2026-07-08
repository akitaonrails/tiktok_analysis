package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class GroupStoryStatus implements Serializable {

    @C09CT("group_id")
    public final String groupId;

    @C09CT("group_story_status")
    public final int storyStatus;

    @C09CT("user_ids")
    public final List<Long> userIds;

    public GroupStoryStatus() {
        this(null, null, 0, 7, null);
    }

    public GroupStoryStatus(String str, List<Long> list, int i) {
        this.groupId = str;
        this.userIds = list;
        this.storyStatus = i;
    }

    public GroupStoryStatus(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? 0 : i);
    }
}
