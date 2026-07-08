package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupInfo implements Serializable {

    @C09CT("avatar_url")
    public String avatarUrl;

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("conversation_short_id")
    public String conversationShortId;

    @C09CT("follow_count")
    public Integer followCount;

    @C09CT("group_size")
    public Integer groupSize;

    @C09CT("group_type")
    public String groupType;

    @C09CT("name")
    public String name;

    @C09CT("conversation_audit_switch")
    public Boolean needApproval;

    public GroupInfo() {
        this(null, null, null, null, null, null, null, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        return Intrinsics.LJFF(this.conversationId, groupInfo.conversationId) && Intrinsics.LJFF(this.conversationShortId, groupInfo.conversationShortId) && Intrinsics.LJFF(this.name, groupInfo.name) && Intrinsics.LJFF(this.avatarUrl, groupInfo.avatarUrl) && Intrinsics.LJFF(this.groupSize, groupInfo.groupSize) && Intrinsics.LJFF(this.needApproval, groupInfo.needApproval) && Intrinsics.LJFF(this.followCount, groupInfo.followCount) && Intrinsics.LJFF(this.groupType, groupInfo.groupType);
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(String str) {
        this.conversationShortId = str;
    }

    public final void setFollowCount(Integer num) {
        this.followCount = num;
    }

    public final void setGroupSize(Integer num) {
        this.groupSize = num;
    }

    public final void setGroupType(String str) {
        this.groupType = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNeedApproval(Boolean bool) {
        this.needApproval = bool;
    }

    public GroupInfo(String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, String str5) {
        this.conversationId = str;
        this.conversationShortId = str2;
        this.name = str3;
        this.avatarUrl = str4;
        this.groupSize = num;
        this.needApproval = bool;
        this.followCount = num2;
        this.groupType = str5;
    }
}
