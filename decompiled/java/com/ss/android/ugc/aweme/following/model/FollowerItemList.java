package com.ss.android.ugc.aweme.following.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class FollowerItemList extends BaseResponse {

    @C09CT("alias_permissions")
    public List<AliasPermissionUserData> aliasPermissions;

    @C09CT("mplatform_follower_count")
    public int fansCount;

    @C09CT("followers_detail")
    public List<FollowerDetail> followerDetailList;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("hotsoon_has_more")
    public int hotSoonHasMore;

    @C09CT("hotsoon_text")
    public String hotSoonText;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("min_time")
    public long minTime;

    @C09CT("offset")
    public int offset;

    @C09CT("total")
    public int total;

    @C09CT("vcd_count")
    public int vcdCount;

    @C09CT("followers")
    public List<User> items = new ArrayList();

    @C09CT("rec_has_more")
    public boolean recommendHasMore = true;

    @C09CT("next_page_token")
    public String nextPageToken = "";
}
