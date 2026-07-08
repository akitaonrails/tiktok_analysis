package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("advanced_feature_display_order")
    public List<AdvancedOrderData> advancedOrderList;

    @C09CT("hide_lemon8_edit_link")
    public Boolean hideLemon8EditLink;

    @C09CT("lemon8_account_type")
    public Integer lemon8AccountType;

    @C09CT("lemon8_profile_settings")
    public Integer lemon8ProfileSettings;

    @C09CT("profile_link_priority")
    public List<Integer> profileLinkOrderList;

    public final List<AdvancedOrderData> getAdvancedOrderList() {
        return this.advancedOrderList;
    }

    public final Boolean getHideLemon8EditLink() {
        return this.hideLemon8EditLink;
    }

    public final Integer getLemon8AccountType() {
        return this.lemon8AccountType;
    }

    public final Integer getLemon8ProfileSettings() {
        return this.lemon8ProfileSettings;
    }

    public final List<Integer> getProfileLinkOrderList() {
        return this.profileLinkOrderList;
    }

    public final void setAdvancedOrderList(List<AdvancedOrderData> list) {
        this.advancedOrderList = list;
    }

    public final void setHideLemon8EditLink(Boolean bool) {
        this.hideLemon8EditLink = bool;
    }

    public final void setLemon8AccountType(Integer num) {
        this.lemon8AccountType = num;
    }

    public final void setLemon8ProfileSettings(Integer num) {
        this.lemon8ProfileSettings = num;
    }

    public final void setProfileLinkOrderList(List<Integer> list) {
        this.profileLinkOrderList = list;
    }
}
