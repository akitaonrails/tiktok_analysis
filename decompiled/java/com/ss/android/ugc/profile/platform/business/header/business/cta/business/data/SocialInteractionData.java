package com.ss.android.ugc.profile.platform.business.header.business.cta.business.data;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialInteractionData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @C09CT("show_messaging_entrance_on_profile")
    public boolean isShowMessageEntrance;

    @C09CT("new_message_in_inbox_follow_status_list")
    public List<Integer> newMessageInInboxFollowStatusList;

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final List<Integer> getNewMessageInInboxFollowStatusList() {
        return this.newMessageInInboxFollowStatusList;
    }

    public final boolean isShowMessageEntrance() {
        return this.isShowMessageEntrance;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setNewMessageInInboxFollowStatusList(List<Integer> list) {
        this.newMessageInInboxFollowStatusList = list;
    }

    public final void setShowMessageEntrance(boolean z) {
        this.isShowMessageEntrance = z;
    }
}
