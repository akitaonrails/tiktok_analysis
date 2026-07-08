package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class CampusGroup implements Serializable {
    public static final int $stable = 8;

    @C09CT("conv_short_id")
    public final Long convShortId;

    @C09CT("conv_id")
    public final String conversationId;

    @C09CT("avatar_url")
    public final String groupAvatar;

    @C09CT("group_desc")
    public final String groupDescription;

    @C09CT("group_member_count")
    public Integer groupMemberCount;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_owner_id")
    public final Long groupOwnerId;

    @C09CT("is_customized_avatar")
    public final Boolean isCustomized;

    @C09CT("is_new")
    public final Boolean isNew;

    @C09CT("is_unseen")
    public final Boolean isUnseen;

    @C09CT("verify_status")
    public Integer verifyStatus;

    public CampusGroup() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Boolean isCustomized() {
        return this.isCustomized;
    }

    public final Boolean isNew() {
        return this.isNew;
    }

    public final Boolean isUnseen() {
        return this.isUnseen;
    }

    public final void setGroupMemberCount(Integer num) {
        this.groupMemberCount = num;
    }

    public final void setVerifyStatus(Integer num) {
        this.verifyStatus = num;
    }

    public CampusGroup(Long l, String str, String str2, String str3, Boolean bool, Integer num, Long l2, String str4, Integer num2, Boolean bool2, Boolean bool3) {
        this.convShortId = l;
        this.conversationId = str;
        this.groupName = str2;
        this.groupAvatar = str3;
        this.isCustomized = bool;
        this.groupMemberCount = num;
        this.groupOwnerId = l2;
        this.groupDescription = str4;
        this.verifyStatus = num2;
        this.isNew = bool2;
        this.isUnseen = bool3;
    }
}
