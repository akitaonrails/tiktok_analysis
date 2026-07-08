package com.ss.android.ugc.aweme.ad.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPageConfig implements Serializable {

    @C09CT("ad_landing_page_auto_jump_allow_list")
    public List<String> autoJumpAllowList;

    @C09CT("ad_landing_page_auto_jump_intercept_list")
    public List<String> autoJumpInterceptList;

    @C09CT("ad_landing_page_click_jump_interval")
    public int autoJumpInterval;

    @C09CT("ad_landing_page_click_jump_interval_tips")
    public String autoJumpIntervalTips;

    @C09CT("ad_landing_page_click_jump_allow_list")
    public List<String> clickJumpAllowList;

    @C09CT("ad_landing_page_pause_list")
    public List<String> pauseList;

    @C09CT("ad_splash_landing_page_auto_jump_allow_list")
    public List<String> splashAdAutoJumpAllowList;

    @C09CT("ad_landing_page_auto_jump_control_enabled")
    public boolean isJumpControlEnabled = true;

    @C09CT("ad_landing_page_click_jump_control_enabled")
    public boolean isClickControlEnabled = true;

    public final List<String> getAutoJumpInterceptList() {
        return this.autoJumpInterceptList;
    }

    public final int getAutoJumpInterval() {
        return this.autoJumpInterval;
    }

    public final String getAutoJumpIntervalTips() {
        return this.autoJumpIntervalTips;
    }

    public final List<String> getPauseList() {
        return this.pauseList;
    }

    public final List<String> getSplashAdAutoJumpAllowList() {
        return this.splashAdAutoJumpAllowList;
    }

    public final boolean isClickControlEnabled() {
        return this.isClickControlEnabled;
    }

    public final boolean isJumpControlEnabled() {
        return this.isJumpControlEnabled;
    }

    public final void setAutoJumpInterceptList(List<String> list) {
        this.autoJumpInterceptList = list;
    }

    public final void setAutoJumpInterval(int i) {
        this.autoJumpInterval = i;
    }

    public final void setAutoJumpIntervalTips(String str) {
        this.autoJumpIntervalTips = str;
    }

    public final void setClickControlEnabled(boolean z) {
        this.isClickControlEnabled = z;
    }

    public final void setJumpControlEnabled(boolean z) {
        this.isJumpControlEnabled = z;
    }

    public final void setPauseList(List<String> list) {
        this.pauseList = list;
    }

    public final void setSplashAdAutoJumpAllowList(List<String> list) {
        this.splashAdAutoJumpAllowList = list;
    }
}
