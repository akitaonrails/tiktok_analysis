package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class CtaDisplayConfig implements Serializable {

    @C09CT("cta_free_tag_text")
    public String ctaFreeTagText;

    @C09CT("cta_new_style")
    public Boolean ctaNewStyle;

    @C09CT("cta_show_icon")
    public Boolean ctaShowIcon;

    @C09CT("cta_target_color")
    public String ctaTargetColor;

    @C09CT("breathing_light_text")
    public String immersiveModeButtonText;

    @C09CT("cta_play_next_text")
    public String playNextText;

    @C09CT("cta_play_next_video_id")
    public String playNextVideoId;

    @C09CT("is_info_title_joint")
    public Boolean shouldJointTitleToDesc;

    @C09CT("is_info_show_cover")
    public Boolean shouldShouldCover;

    @C09CT("cta_show_double_cta")
    public Boolean shouldShowDoubleButton;

    @C09CT("is_info_show_free_tag")
    public Boolean shouldShowFreeLabelBeforeTags;

    @C09CT("is_show_breathing_light")
    public Boolean shouldShowImmersiveMode;

    @C09CT("cta_watch_all_text")
    public String watchAllText;

    public final String getCtaFreeTagText() {
        return this.ctaFreeTagText;
    }

    public final Boolean getCtaNewStyle() {
        return this.ctaNewStyle;
    }

    public final Boolean getCtaShowIcon() {
        return this.ctaShowIcon;
    }

    public final String getCtaTargetColor() {
        return this.ctaTargetColor;
    }

    public final String getImmersiveModeButtonText() {
        return this.immersiveModeButtonText;
    }

    public final String getPlayNextText() {
        return this.playNextText;
    }

    public final String getPlayNextVideoId() {
        return this.playNextVideoId;
    }

    public final Boolean getShouldJointTitleToDesc() {
        return this.shouldJointTitleToDesc;
    }

    public final Boolean getShouldShouldCover() {
        return this.shouldShouldCover;
    }

    public final Boolean getShouldShowDoubleButton() {
        return this.shouldShowDoubleButton;
    }

    public final Boolean getShouldShowFreeLabelBeforeTags() {
        return this.shouldShowFreeLabelBeforeTags;
    }

    public final Boolean getShouldShowImmersiveMode() {
        return this.shouldShowImmersiveMode;
    }

    public final String getWatchAllText() {
        return this.watchAllText;
    }

    public final void setCtaFreeTagText(String str) {
        this.ctaFreeTagText = str;
    }

    public final void setCtaNewStyle(Boolean bool) {
        this.ctaNewStyle = bool;
    }

    public final void setCtaShowIcon(Boolean bool) {
        this.ctaShowIcon = bool;
    }

    public final void setCtaTargetColor(String str) {
        this.ctaTargetColor = str;
    }

    public final void setImmersiveModeButtonText(String str) {
        this.immersiveModeButtonText = str;
    }

    public final void setPlayNextText(String str) {
        this.playNextText = str;
    }

    public final void setPlayNextVideoId(String str) {
        this.playNextVideoId = str;
    }

    public final void setShouldJointTitleToDesc(Boolean bool) {
        this.shouldJointTitleToDesc = bool;
    }

    public final void setShouldShouldCover(Boolean bool) {
        this.shouldShouldCover = bool;
    }

    public final void setShouldShowDoubleButton(Boolean bool) {
        this.shouldShowDoubleButton = bool;
    }

    public final void setShouldShowFreeLabelBeforeTags(Boolean bool) {
        this.shouldShowFreeLabelBeforeTags = bool;
    }

    public final void setShouldShowImmersiveMode(Boolean bool) {
        this.shouldShowImmersiveMode = bool;
    }

    public final void setWatchAllText(String str) {
        this.watchAllText = str;
    }
}
