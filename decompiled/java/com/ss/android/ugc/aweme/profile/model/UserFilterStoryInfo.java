package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserFilterStoryInfo implements Serializable {

    @C09CT("filter_story_ids")
    public List<Long> filterStoryIds;

    @C09CT("user_id")
    public Long userId;

    public UserFilterStoryInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFilterStoryInfo)) {
            return false;
        }
        UserFilterStoryInfo userFilterStoryInfo = (UserFilterStoryInfo) obj;
        return Intrinsics.LJFF(this.userId, userFilterStoryInfo.userId) && Intrinsics.LJFF(this.filterStoryIds, userFilterStoryInfo.filterStoryIds);
    }

    public int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Long> list = this.filterStoryIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public UserFilterStoryInfo(Long l, List<Long> list) {
        this.userId = l;
        this.filterStoryIds = list;
    }
}
