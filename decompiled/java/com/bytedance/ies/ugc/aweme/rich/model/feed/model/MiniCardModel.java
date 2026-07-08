package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniCardModel implements Serializable {

    @C09CT("auto_download")
    public final boolean autoDownload;

    @C09CT("auto_show_seconds")
    public final int autoShowSecond;

    @C09CT("card_type")
    public final int cardType;

    @C09CT("deeplink")
    public final MiniCardDeeplinkModel deeplink;

    @C09CT("enable_auto_show")
    public final boolean enableAutoShow;

    @C09CT("left_slide_open_type")
    public final int miniCardLeftSlideOpenType;

    @C09CT("show_after_video_play_times")
    public final int showAfterVideoPlayTimes;

    public final boolean getAutoDownload() {
        return this.autoDownload;
    }

    public final int getAutoShowSecond() {
        return this.autoShowSecond;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final MiniCardDeeplinkModel getDeeplink() {
        return this.deeplink;
    }

    public final boolean getEnableAutoShow() {
        return this.enableAutoShow;
    }

    public final int getMiniCardLeftSlideOpenType() {
        return this.miniCardLeftSlideOpenType;
    }

    public final int getShowAfterVideoPlayTimes() {
        return this.showAfterVideoPlayTimes;
    }
}
