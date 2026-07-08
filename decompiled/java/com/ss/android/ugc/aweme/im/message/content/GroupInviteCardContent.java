package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupInviteCardContent extends BaseContent {

    @C09CT("event_extra")
    public Map<String, String> eventExtra;

    @C09CT("expired_at")
    public Long expiredAt;

    @C09CT("group")
    public GroupInfo group;

    @C09CT("group_type")
    public String groupType;

    @C09CT("invite_id")
    public String inviteId;

    @C09CT("inviter_name")
    public String inviterName;

    public final Map<String, String> getEventExtra() {
        return this.eventExtra;
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final GroupInfo getGroup() {
        return this.group;
    }

    public final String getGroupType() {
        return this.groupType;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    public final String getInviterName() {
        return this.inviterName;
    }

    public final void setEventExtra(Map<String, String> map) {
        this.eventExtra = map;
    }

    public final void setExpiredAt(Long l) {
        this.expiredAt = l;
    }

    public final void setGroup(GroupInfo groupInfo) {
        this.group = groupInfo;
    }

    public final void setGroupType(String str) {
        this.groupType = str;
    }

    public final void setInviteId(String str) {
        this.inviteId = str;
    }

    public final void setInviterName(String str) {
        this.inviterName = str;
    }
}
