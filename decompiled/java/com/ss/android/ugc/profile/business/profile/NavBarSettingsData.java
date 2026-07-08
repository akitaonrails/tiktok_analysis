package com.ss.android.ugc.profile.business.profile;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class NavBarSettingsData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("is_potential_ba")
    public Boolean isPotentialBA;

    @C09CT("notice_bubbles")
    public List<PopData> popDataList;

    @C09CT("pro_account_update_notification_status")
    public Integer proAccountUpdateNotificationStatus;

    public final List<PopData> getPopDataList() {
        return this.popDataList;
    }

    public final Integer getProAccountUpdateNotificationStatus() {
        return this.proAccountUpdateNotificationStatus;
    }

    public final Boolean isPotentialBA() {
        return this.isPotentialBA;
    }

    public final void setPopDataList(List<PopData> list) {
        this.popDataList = list;
    }

    public final void setPotentialBA(Boolean bool) {
        this.isPotentialBA = bool;
    }

    public final void setProAccountUpdateNotificationStatus(Integer num) {
        this.proAccountUpdateNotificationStatus = num;
    }
}
