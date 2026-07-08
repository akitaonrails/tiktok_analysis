package com.ss.android.ugc.profile.business.message;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class MessageData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @C09CT("show_messaging_entrance_on_profile")
    public boolean isShowMessageEntrance;

    @C09CT("new_message_in_inbox_follow_status_list")
    public final List<Integer> newMessageInInboxFollowStatusList;

    @C09CT("user_tags")
    public IMUserTags userTags;

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final List<Integer> getNewMessageInInboxFollowStatusList() {
        return this.newMessageInInboxFollowStatusList;
    }

    public final IMUserTags getUserTags() {
        return this.userTags;
    }

    public final boolean isShowMessageEntrance() {
        return this.isShowMessageEntrance;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setShowMessageEntrance(boolean z) {
        this.isShowMessageEntrance = z;
    }

    public final void setUserTags(IMUserTags iMUserTags) {
        this.userTags = iMUserTags;
    }
}
