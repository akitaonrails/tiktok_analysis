package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C09DE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    public String anchorId;

    @C09CT("awesome_splash_id")
    public String awesomeSplashId;

    @C09CT("clickable_area")
    public ClickableAreaInfo clickableArea;
    public transient boolean contextTrackSent;

    @C09CT("disable_hotstart_show")
    public boolean disableHotStartShow;

    @C09CT("enable_splash_open")
    public boolean enableSplashOpen;

    @C09CT("end_time")
    public int endTime;

    @C09CT("enter_app_text")
    public String enterAppText;
    public transient boolean hasUpdateLiving;

    @C09CT("hot_show_type")
    public int hotShowType;

    @C09CT("is_invalid_ad")
    public boolean isInvalidAd;

    @C09DE(deserialize = false, serialize = false)
    public transient boolean isLogTopViewBreak;

    @C09DE(deserialize = false, serialize = false)
    public transient boolean isShown;

    @C09CT("label_info")
    public LabelInfo labelInfo;

    @C09CT("logo_color")
    public int logoColor;

    @C09CT("predownload_text")
    public String predownloadText;

    @C09CT("preload_type")
    public int preloadType;

    @C09CT("show_live_info")
    public int showLiveInfo;

    @C09CT("skip_info")
    public SkipInfo skipInfo;

    @C09CT("skip_open_screen")
    public boolean skipOpenScreen;

    @C09CT("splash_button_text")
    public String splashButtonText;

    @C09CT("splash_feed_type")
    public int splashFeedType;

    @C09CT("splash_show_time")
    public float splashShowTime = 3000.0f;

    @C09CT("start_time")
    public int startTime;

    @C09CT("swipe_up_delay")
    public long swipeUpDelay;

    @C09CT("swipe_up_type")
    public int swipeUpType;

    @C09CT("topfeed_ad_id")
    public Long topFeedAdId;
    public transient TopViewLiveInfo topViewLiveInfo;

    @C09CT("topview_test_order_type")
    public int topViewTestOrderType;

    public static class ClickableAreaInfo implements Serializable {

        @C09CT("margin_bottom")
        public int marginBottom;

        @C09CT("margin_left")
        public int marginLeft;

        @C09CT("margin_right")
        public int marginRight;

        @C09CT("margin_top")
        public int marginTop;
    }

    public static class SkipInfo implements Serializable {

        @C09CT("background_color")
        public String backgroundColor;

        @C09CT("button_extra_style")
        public int buttonExtraStyle;

        @C09CT("countdown_unit")
        public String countdownUnit;

        @C09CT("countdown_enable")
        public int countdown_enable;

        @C09CT("height_extra_size")
        public int heightExtraSize;

        @C09CT("position")
        public int position;

        @C09CT("text")
        public String text;

        @C09CT("text_color")
        public String textColor;

        @C09CT("width_extra_size")
        public int widthExtraSize;

        public boolean isCountdown_enable() {
            return this.countdown_enable == 1;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getButtonExtraStyle() {
            return this.buttonExtraStyle;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }
    }

    public static class LabelInfo implements Serializable {

        @C09CT("background_color")
        public String backgroundColor;

        @C09CT("position")
        public int position;

        @C09CT("text")
        public String text;

        @C09CT("text_color")
        public String textColor;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public ClickableAreaInfo getClickableArea() {
        return this.clickableArea;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getEnterAppText() {
        return this.enterAppText;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public int getLogoColor() {
        return this.logoColor;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public int getShowLiveInfo() {
        return this.showLiveInfo;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public String getSplashButtonText() {
        return this.splashButtonText;
    }

    public int getSplashFeedType() {
        return this.splashFeedType;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public long getSwipeUpDelay() {
        return this.swipeUpDelay;
    }

    public int getSwipeUpType() {
        return this.swipeUpType;
    }

    public Long getTopFeedAdId() {
        return this.topFeedAdId;
    }

    public int getTopViewTestOrderType() {
        return this.topViewTestOrderType;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isLogTopViewBreak() {
        return this.isLogTopViewBreak;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public boolean isSkipOpenScreen() {
        return this.skipOpenScreen;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setLogTopViewBreak(boolean z) {
        this.isLogTopViewBreak = z;
    }

    public void setLogoColor(int i) {
        this.logoColor = i;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShowLiveInfo(int i) {
        this.showLiveInfo = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSkipOpenScreen(boolean z) {
        this.skipOpenScreen = z;
    }

    public void setSplashButtonText(String str) {
        this.splashButtonText = str;
    }

    public void setSplashFeedType(int i) {
        this.splashFeedType = i;
    }

    public void setSplashShowTime(float f) {
        this.splashShowTime = f;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public void setTopFeedAdId(Long l) {
        this.topFeedAdId = l;
    }

    public void setTopViewTestOrderType(int i) {
        this.topViewTestOrderType = i;
    }
}
