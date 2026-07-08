package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupElementsConfig implements Serializable {

    @C09CT("banner_button_title")
    public String bannerButtonTitle;

    @C09CT("banner_title")
    public String bannerTitle;

    @C09CT("panel_buttons")
    public PanelButtons buttons;

    @C09CT("description")
    public String description;

    @C09CT("dynamic_description")
    public String dynamicDescription;

    @C09CT("dynamic_subtitle")
    public String dynamicSubtitle;

    @C09CT("dynamic_text_enabled")
    public boolean dynamicTextEnabled;

    @C09CT("dynamic_title")
    public String dynamicTitle;

    @C09CT("dynamic_use_fallback")
    public boolean dynamicUseFallback;

    @C09CT("dynamic_values")
    public List<String> dynamicValues;

    @C09CT("header_view")
    public HeaderView header;

    @C09CT("hide_detail_icon")
    public boolean hideDetailIcon;

    @C09CT("show_close_icon")
    public boolean showCloseIcon;

    @C09CT("switches")
    public List<SubSwitch> subSwitches;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    @C09CT("toast_bottom_margin")
    public int toastBottomMargin;

    @C09CT("users_list")
    public UserList usersList;

    public PopupElementsConfig() {
        this(null, null, null, false, null, null, null, null, true, null, false, false, null, null, null, -1, null, null);
    }

    public final PopupElementsConfig copy(String str, String str2, String str3, boolean z, List<String> list, String str4, String str5, String str6, boolean z2, HeaderView headerView, boolean z3, boolean z4, UserList userList, PanelButtons panelButtons, List<SubSwitch> list2, int i, String str7, String str8) {
        return new PopupElementsConfig(str, str2, str3, z, list, str4, str5, str6, z2, headerView, z3, z4, userList, panelButtons, list2, i, str7, str8);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.dynamicTextEnabled)) * 31;
        List<String> list = this.dynamicValues;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.dynamicTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dynamicSubtitle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dynamicDescription;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.dynamicUseFallback)) * 31;
        HeaderView headerView = this.header;
        int iHashCode8 = (((((iHashCode7 + (headerView == null ? 0 : headerView.hashCode())) * 31) + C786410Ut5.Z2(this.hideDetailIcon)) * 31) + C786410Ut5.Z2(this.showCloseIcon)) * 31;
        UserList userList = this.usersList;
        int iHashCode9 = (iHashCode8 + (userList == null ? 0 : userList.hashCode())) * 31;
        PanelButtons panelButtons = this.buttons;
        int iHashCode10 = (iHashCode9 + (panelButtons == null ? 0 : panelButtons.hashCode())) * 31;
        List<SubSwitch> list2 = this.subSwitches;
        int iHashCode11 = (((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.toastBottomMargin) * 31;
        String str7 = this.bannerTitle;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bannerButtonTitle;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PopupElementsConfig(title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", dynamicTextEnabled=" + this.dynamicTextEnabled + ", dynamicValues=" + this.dynamicValues + ", dynamicTitle=" + this.dynamicTitle + ", dynamicSubtitle=" + this.dynamicSubtitle + ", dynamicDescription=" + this.dynamicDescription + ", dynamicUseFallback=" + this.dynamicUseFallback + ", header=" + this.header + ", hideDetailIcon=" + this.hideDetailIcon + ", showCloseIcon=" + this.showCloseIcon + ", usersList=" + this.usersList + ", buttons=" + this.buttons + ", subSwitches=" + this.subSwitches + ", toastBottomMargin=" + this.toastBottomMargin + ", bannerTitle=" + this.bannerTitle + ", bannerButtonTitle=" + this.bannerButtonTitle + ')';
    }

    public final void setBannerButtonTitle(String str) {
        this.bannerButtonTitle = str;
    }

    public final void setBannerTitle(String str) {
        this.bannerTitle = str;
    }

    public final void setButtons(PanelButtons panelButtons) {
        this.buttons = panelButtons;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDynamicDescription(String str) {
        this.dynamicDescription = str;
    }

    public final void setDynamicSubtitle(String str) {
        this.dynamicSubtitle = str;
    }

    public final void setDynamicTextEnabled(boolean z) {
        this.dynamicTextEnabled = z;
    }

    public final void setDynamicTitle(String str) {
        this.dynamicTitle = str;
    }

    public final void setDynamicUseFallback(boolean z) {
        this.dynamicUseFallback = z;
    }

    public final void setDynamicValues(List<String> list) {
        this.dynamicValues = list;
    }

    public final void setHeader(HeaderView headerView) {
        this.header = headerView;
    }

    public final void setHideDetailIcon(boolean z) {
        this.hideDetailIcon = z;
    }

    public final void setShowCloseIcon(boolean z) {
        this.showCloseIcon = z;
    }

    public final void setSubSwitches(List<SubSwitch> list) {
        this.subSwitches = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setToastBottomMargin(int i) {
        this.toastBottomMargin = i;
    }

    public final void setUsersList(UserList userList) {
        this.usersList = userList;
    }

    public PopupElementsConfig(String str, String str2, String str3, boolean z, List<String> list, String str4, String str5, String str6, boolean z2, HeaderView headerView, boolean z3, boolean z4, UserList userList, PanelButtons panelButtons, List<SubSwitch> list2, int i, String str7, String str8) {
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.dynamicTextEnabled = z;
        this.dynamicValues = list;
        this.dynamicTitle = str4;
        this.dynamicSubtitle = str5;
        this.dynamicDescription = str6;
        this.dynamicUseFallback = z2;
        this.header = headerView;
        this.hideDetailIcon = z3;
        this.showCloseIcon = z4;
        this.usersList = userList;
        this.buttons = panelButtons;
        this.subSwitches = list2;
        this.toastBottomMargin = i;
        this.bannerTitle = str7;
        this.bannerButtonTitle = str8;
    }
}
