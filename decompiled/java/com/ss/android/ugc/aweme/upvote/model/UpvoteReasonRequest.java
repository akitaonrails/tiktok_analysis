package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class UpvoteReasonRequest implements Serializable {

    @C09CT("friend_type_str")
    public final String friendTypeStr;

    @C09CT("item_id")
    public String itemId;

    @C09CT("middle_count")
    public final Integer middleCount;

    @C09CT("middle_info")
    public final List<String> middleInfo;

    @C09CT("reason_type")
    public final Integer reasonType;

    @C09CT("sub_type")
    public final Integer subType;

    @C09CT("user_id")
    public final String userId;

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public UpvoteReasonRequest(Integer num, Integer num2, List<String> list, Integer num3, String str, String str2, String str3) {
        this.reasonType = num;
        this.subType = num2;
        this.middleInfo = list;
        this.middleCount = num3;
        this.userId = str;
        this.itemId = str2;
        this.friendTypeStr = str3;
    }
}
