package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgAwemeActivitySetting {

    @C09CT("activity_end_time")
    public Long activityEndTime;

    @C09CT("activity_id")
    public String activityId;

    @C09CT("activity_start_time")
    public Long activityStartTime;

    @C09CT("activity_tasks")
    public List<UgActivityTasks> activityTasks = new ArrayList();

    @C09CT("channel_popup")
    public UgChannelPopup channelPopup;

    @C09CT("is_new_user")
    public Boolean isNewUser;

    @C09CT("login_banner")
    public UgLoginBanner loginBanner;

    @C09CT("new_feed_pendant")
    public UgNewFeedPendant newFeedPendant;

    @C09CT("overall_switch")
    public Boolean overallSwitch;

    @C09CT("pendant_version")
    public Integer pendantVersion;

    @C09CT("profile_activity_button")
    public UgProfileActivityButton profileActivityButton;

    @C09CT("profile_activity_icon")
    public UgProfileActivityIcon profileActivityIcon;

    @C09CT("profile_tab_guide")
    public UgProfileTabGuide profileTabGuide;

    @C09CT("shortcut_info")
    public UgShortcutInfo shortcutInfo;

    @C09CT("feed_bottom_notice_bar")
    public UgFeedBottomNoticeBar ugFeedBottomNoticeBar;

    @C09CT("touchpoint_upload_switch")
    public boolean uploadSwitch;

    @C09CT("use_touchpoint_widget")
    public boolean useTouchPointWidget;

    @C09CT("use_touch_points")
    public boolean useTouchPoints;

    public Long getActivityEndTime() throws C316660CbA {
        Long l = this.activityEndTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public String getActivityId() throws C316660CbA {
        String str = this.activityId;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Long getActivityStartTime() throws C316660CbA {
        Long l = this.activityStartTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public UgChannelPopup getChannelPopup() {
        UgChannelPopup ugChannelPopup = this.channelPopup;
        if (ugChannelPopup != null) {
            return ugChannelPopup;
        }
        throw new C316660CbA();
    }

    public Boolean getIsNewUser() {
        Boolean bool = this.isNewUser;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public UgLoginBanner getLoginBanner() throws C316660CbA {
        UgLoginBanner ugLoginBanner = this.loginBanner;
        if (ugLoginBanner != null) {
            return ugLoginBanner;
        }
        throw new C316660CbA();
    }

    public UgNewFeedPendant getNewFeedPendant() throws C316660CbA {
        UgNewFeedPendant ugNewFeedPendant = this.newFeedPendant;
        if (ugNewFeedPendant != null) {
            return ugNewFeedPendant;
        }
        throw new C316660CbA();
    }

    public Boolean getOverallSwitch() {
        Boolean bool = this.overallSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getPendantVersion() throws C316660CbA {
        Integer num = this.pendantVersion;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public UgProfileActivityButton getProfileActivityButton() {
        UgProfileActivityButton ugProfileActivityButton = this.profileActivityButton;
        if (ugProfileActivityButton != null) {
            return ugProfileActivityButton;
        }
        throw new C316660CbA();
    }

    public UgProfileActivityIcon getProfileActivityIcon() throws C316660CbA {
        UgProfileActivityIcon ugProfileActivityIcon = this.profileActivityIcon;
        if (ugProfileActivityIcon != null) {
            return ugProfileActivityIcon;
        }
        throw new C316660CbA();
    }

    public UgProfileTabGuide getProfileTabGuide() {
        UgProfileTabGuide ugProfileTabGuide = this.profileTabGuide;
        if (ugProfileTabGuide != null) {
            return ugProfileTabGuide;
        }
        throw new C316660CbA();
    }

    public UgShortcutInfo getShortcutInfo() throws C316660CbA {
        UgShortcutInfo ugShortcutInfo = this.shortcutInfo;
        if (ugShortcutInfo != null) {
            return ugShortcutInfo;
        }
        throw new C316660CbA();
    }

    public List<UgActivityTasks> getActivityTasks() {
        return this.activityTasks;
    }

    public UgFeedBottomNoticeBar getUgFeedBottomNoticeBar() {
        return this.ugFeedBottomNoticeBar;
    }

    public boolean isUploadSwitch() {
        return this.uploadSwitch;
    }

    public boolean isUseTouchPointWidget() {
        return this.useTouchPointWidget;
    }

    public boolean isUseTouchPoints() {
        return this.useTouchPoints;
    }

    public void setUgFeedBottomNoticeBar(UgFeedBottomNoticeBar ugFeedBottomNoticeBar) {
        this.ugFeedBottomNoticeBar = ugFeedBottomNoticeBar;
    }

    public void setUploadSwitch(boolean z) {
        this.uploadSwitch = z;
    }

    public void setUseTouchPointWidget(boolean z) {
        this.useTouchPointWidget = z;
    }

    public void setUseTouchPoints(boolean z) {
        this.useTouchPoints = z;
    }
}
