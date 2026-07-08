package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class OneToNInfo implements Serializable {

    @C09CT("auto_switch_to_next_ad_on_play_end")
    public Boolean autoSwitchToNextAdOnPlayEnd;

    @C09CT("bubble_text")
    public String bubbleText;

    @C09CT("can_show_skip_button")
    public Boolean canShowSkipButton;

    @C09CT("skip_button_text")
    public String skipButtonText;

    @C09CT("video_first_show")
    public VideoFirstShow videoFirstShow;

    @C09CT("video_re_show")
    public VideoReShow videoReshow;

    public final Boolean getAutoSwitchToNextAdOnPlayEnd() {
        return this.autoSwitchToNextAdOnPlayEnd;
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final Boolean getCanShowSkipButton() {
        return this.canShowSkipButton;
    }

    public final String getSkipButtonText() {
        return this.skipButtonText;
    }

    public final VideoFirstShow getVideoFirstShow() {
        return this.videoFirstShow;
    }

    public final VideoReShow getVideoReshow() {
        return this.videoReshow;
    }

    public final void setAutoSwitchToNextAdOnPlayEnd(Boolean bool) {
        this.autoSwitchToNextAdOnPlayEnd = bool;
    }

    public final void setBubbleText(String str) {
        this.bubbleText = str;
    }

    public final void setCanShowSkipButton(Boolean bool) {
        this.canShowSkipButton = bool;
    }

    public final void setSkipButtonText(String str) {
        this.skipButtonText = str;
    }

    public final void setVideoFirstShow(VideoFirstShow videoFirstShow) {
        this.videoFirstShow = videoFirstShow;
    }

    public final void setVideoReshow(VideoReShow videoReShow) {
        this.videoReshow = videoReShow;
    }
}
