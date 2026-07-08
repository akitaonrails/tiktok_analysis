package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgNewFeedPendant {

    @C09CT("cap_color1")
    public String capsuleBackgroundColor;

    @C09CT("cap_color2")
    public String capsuleParallelogramColor;

    @C09CT("clock_color")
    public String clockColor;

    @C09CT("disappear_after")
    public Integer disappearAfter;

    @C09CT("dismiss_after")
    public Integer dismissAfter;

    @C09CT("frequent_limit")
    public UgFrequentLimit frequentLimit;

    @C09CT("h5_link")
    public String h5Link;

    @C09CT("k_capsule")
    public Boolean kCapsule;

    @C09CT("lottie_file_md5")
    public String lottieFileMd5;

    @C09CT("mini_pendant_closable")
    public Boolean miniPendantClosable;

    @C09CT("mini_pendant_switchable")
    public Boolean miniPendantSwitchable;

    @C09CT("text_color")
    public String newDayColor;

    @C09CT("new_user")
    public UgNewUser newUser;

    @C09CT("promotion_hashtag_ids")
    public List<String> promotionIds;

    @C09CT("router_url")
    public String routerUrl;

    @C09CT("second_h5_link")
    public String secondH5Link;

    @C09CT("show_in_follow")
    public Boolean showInFollow;

    @C09CT("show_times")
    public Integer showTimes;

    @C09CT("teenager_mode_enable")
    public Boolean teenagerModeEnable;

    @C09CT("right_color")
    public String tickColor;

    @C09CT("text")
    public String tickText;

    @C09CT("timer_link")
    public String timerLink;

    @C09CT("clock_lottie_file_md5")
    public String timerLottieFileMd5;

    @C09CT("use_origin_pendant")
    public Boolean useOriginPendant;

    @C09CT("user_limit")
    public UgUserLimit userLimit;

    @C09CT("resource_url")
    public List<UrlModel> resourceUrl = new ArrayList();

    @C09CT("pendant_type")
    public Integer pendantType = 0;

    @C09CT("clock_lottie_file_zip")
    public List<String> timerLottieFileZip = new ArrayList();

    @C09CT("bar_color")
    public List<String> barColor = new ArrayList();

    @C09CT("bg_color")
    public List<String> bgColor = new ArrayList();

    @C09CT("lottie_file_zip")
    public List<String> lottieFileZip = new ArrayList();

    @C09CT("fragment_lottie_frame_list")
    public List<Integer> fragmentLottieFrameList = new ArrayList();

    @C09CT("big_png_fragments_urls")
    public List<String> bigPngFragmentsUrls = new ArrayList();

    @C09CT("small_png_fragments_urls")
    public List<String> smallPngFragmentsUrls = new ArrayList();

    @C09CT("k_capsule_content")
    public List<String> kCapsuleContent = new ArrayList();

    @C09CT("capsule_color")
    public List<String> capsuleColor = new ArrayList();

    @C09CT("expanded_pendant_frame_list")
    public List<Integer> expandedPendantFrameList = new ArrayList();

    @C09CT("folded_pendant_frame_list")
    public List<Integer> foldedPendantFrameList = new ArrayList();

    @C09CT("second_lottie_time")
    public List<IntArray> secondLottieTime = new ArrayList();

    public Integer getDisappearAfter() throws C316660CbA {
        Integer num = this.disappearAfter;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public UgFrequentLimit getFrequentLimit() throws C316660CbA {
        UgFrequentLimit ugFrequentLimit = this.frequentLimit;
        if (ugFrequentLimit != null) {
            return ugFrequentLimit;
        }
        throw new C316660CbA();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getKCapsule() throws C316660CbA {
        Boolean bool = this.kCapsule;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public String getLottieFileMd5() throws C316660CbA {
        String str = this.lottieFileMd5;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getMiniPendantClosable() throws C316660CbA {
        Boolean bool = this.miniPendantClosable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getMiniPendantSwitchable() throws C316660CbA {
        Boolean bool = this.miniPendantSwitchable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public UgNewUser getNewUser() throws C316660CbA {
        UgNewUser ugNewUser = this.newUser;
        if (ugNewUser != null) {
            return ugNewUser;
        }
        throw new C316660CbA();
    }

    public Integer getPendantType() throws C316660CbA {
        Integer num = this.pendantType;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getSecondH5Link() throws C316660CbA {
        String str = this.secondH5Link;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getShowInFollow() throws C316660CbA {
        Boolean bool = this.showInFollow;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getShowTimes() throws C316660CbA {
        Integer num = this.showTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getTeenagerModeEnable() throws C316660CbA {
        Boolean bool = this.teenagerModeEnable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public UgUserLimit getUserLimit() throws C316660CbA {
        UgUserLimit ugUserLimit = this.userLimit;
        if (ugUserLimit != null) {
            return ugUserLimit;
        }
        throw new C316660CbA();
    }

    public List<String> getBarColor() {
        return this.barColor;
    }

    public List<String> getBgColor() {
        return this.bgColor;
    }

    public List<String> getBigPngFragmentsUrls() {
        return this.bigPngFragmentsUrls;
    }

    public String getCapsuleBackgroundColor() {
        return this.capsuleBackgroundColor;
    }

    public List<String> getCapsuleColor() {
        return this.capsuleColor;
    }

    public String getCapsuleParallelogramColor() {
        return this.capsuleParallelogramColor;
    }

    public String getClockColor() {
        return this.clockColor;
    }

    public Integer getDismissAfter() {
        return this.dismissAfter;
    }

    public List<Integer> getExpandedPendantFrameList() {
        return this.expandedPendantFrameList;
    }

    public List<Integer> getFoldedPendantFrameList() {
        return this.foldedPendantFrameList;
    }

    public List<Integer> getFragmentLottieFrameList() {
        return this.fragmentLottieFrameList;
    }

    public List<String> getKCapsuleContent() {
        return this.kCapsuleContent;
    }

    public List<String> getLottieFileZip() {
        return this.lottieFileZip;
    }

    public String getNewDayColor() {
        return this.newDayColor;
    }

    public List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public List<UrlModel> getResourceUrl() {
        return this.resourceUrl;
    }

    public String getRouterUrl() {
        return this.routerUrl;
    }

    public List<IntArray> getSecondLottieTime() {
        return this.secondLottieTime;
    }

    public List<String> getSmallPngFragmentsUrls() {
        return this.smallPngFragmentsUrls;
    }

    public String getTickColor() {
        return this.tickColor;
    }

    public String getTickText() {
        return this.tickText;
    }

    public String getTimerLink() {
        return this.timerLink;
    }

    public String getTimerLottieFileMd5() {
        return this.timerLottieFileMd5;
    }

    public List<String> getTimerLottieFileZip() {
        return this.timerLottieFileZip;
    }

    public Boolean getUseOriginPendant() {
        return this.useOriginPendant;
    }

    public void setBarColor(List<String> list) {
        this.barColor = list;
    }

    public void setBgColor(List<String> list) {
        this.bgColor = list;
    }

    public void setCapsuleBackgroundColor(String str) {
        this.capsuleBackgroundColor = str;
    }

    public void setCapsuleParallelogramColor(String str) {
        this.capsuleParallelogramColor = str;
    }

    public void setClockColor(String str) {
        this.clockColor = str;
    }

    public void setDismissAfter(Integer num) {
        this.dismissAfter = num;
    }

    public void setNewDayColor(String str) {
        this.newDayColor = str;
    }

    public void setPromotionIds(List<String> list) {
        this.promotionIds = list;
    }

    public void setRouterUrl(String str) {
        this.routerUrl = str;
    }

    public void setTickColor(String str) {
        this.tickColor = str;
    }

    public void setTickText(String str) {
        this.tickText = str;
    }

    public void setTimerLink(String str) {
        this.timerLink = str;
    }

    public void setTimerLottieFileMd5(String str) {
        this.timerLottieFileMd5 = str;
    }

    public void setTimerLottieFileZip(List<String> list) {
        this.timerLottieFileZip = list;
    }

    public void setUseOriginPendant(Boolean bool) {
        this.useOriginPendant = bool;
    }
}
