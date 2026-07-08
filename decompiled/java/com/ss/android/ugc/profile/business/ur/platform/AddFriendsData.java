package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class AddFriendsData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("maf_count")
    public Integer mafRedCount;

    @C09CT("new_friend_count")
    public Integer newFriendsCount;

    public final Integer getMafRedCount() {
        return this.mafRedCount;
    }

    public final Integer getNewFriendsCount() {
        return this.newFriendsCount;
    }

    public final void setMafRedCount(Integer num) {
        this.mafRedCount = num;
    }

    public final void setNewFriendsCount(Integer num) {
        this.newFriendsCount = num;
    }
}
