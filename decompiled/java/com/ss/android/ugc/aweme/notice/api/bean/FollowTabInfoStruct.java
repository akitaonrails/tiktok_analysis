package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowTabInfoStruct {

    @C09CT("followee_info")
    public List<? extends User> followeeInfo;

    @C09CT("level")
    public Integer level;

    @C09CT("prioritized_item_id")
    public String prioritizedItemId;

    @C09CT("triggered_at_s")
    public Long serverTriggerTime;

    public FollowTabInfoStruct(Integer num, String str, List<? extends User> list, Long l) {
        this.level = num;
        this.prioritizedItemId = str;
        this.followeeInfo = list;
        this.serverTriggerTime = l;
    }
}
