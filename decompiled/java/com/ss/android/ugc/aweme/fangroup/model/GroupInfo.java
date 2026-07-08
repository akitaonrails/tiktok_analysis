package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;
import X.EnumC1219960hqs;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInfo implements Serializable {

    @C09CT("avatar_thumb")
    public final String avatarThumb;

    @C09CT("business_type")
    public final int businessType;

    @C09CT("conv_short_id")
    public final long convShortId;

    @C09CT("conv_id")
    public final String conversationId;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("group_desc")
    public final String groupDesc;

    @C09CT("group_member_count")
    public final int groupMemberCount;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_status")
    public final int groupStatus;

    @C09CT("threshold_message")
    public final String thresholdMsg;

    public GroupInfo() {
        this(0L, "", "", "", 0, "", 2, "", EnumC1219960hqs.UNKNOWN.getValue(), null);
    }

    public GroupInfo(long j, String str, String str2, String str3, int i, String str4, int i2, String str5, int i3, Map<String, String> map) {
        this.convShortId = j;
        this.conversationId = str;
        this.groupName = str2;
        this.avatarThumb = str3;
        this.groupMemberCount = i;
        this.groupDesc = str4;
        this.groupStatus = i2;
        this.thresholdMsg = str5;
        this.businessType = i3;
        this.eventTracking = map;
    }
}
