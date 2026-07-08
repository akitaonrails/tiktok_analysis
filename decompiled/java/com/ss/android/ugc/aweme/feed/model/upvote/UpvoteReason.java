package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UpvoteReason implements Serializable {

    @C09CT("friend_type_str")
    public String friendTypeStr;

    @C09CT("item_id")
    public String itemId;

    @C09CT("middle_count")
    public Integer middleCount;

    @C09CT("middle_info")
    public long[] middleInfo;

    @C09CT("reason_type")
    public Integer reasonType;

    @C09CT("sub_type")
    public Integer subType;

    @C09CT("user_id")
    public String userId;

    public UpvoteReason() {
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public UpvoteReason(Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2, String str3) {
        this.reasonType = num;
        this.subType = num2;
        this.middleInfo = jArr;
        this.middleCount = num3;
        this.userId = str;
        this.itemId = str2;
        this.friendTypeStr = str3;
    }
}
