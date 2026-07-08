package com.ss.android.ugc.aweme.commercialize.model.promote;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PromoteModel implements Serializable {

    @C09CT("bottom_bar_button_text")
    public String bottomBarButtonText;

    @C09CT("disable_pre_create")
    public Boolean enableContainerStrategy;

    @C09CT("extra")
    public String extra;

    @C09CT("has_bottom_bar_button")
    public Boolean hasBottomBarButton;

    @C09CT("is_promote_ad_label")
    public boolean isPromoteAdLabel;

    @C09CT("is_show_video_view")
    public boolean isShowVideoView;

    @C09CT("label_click")
    public int labelClick = 2;

    @C09CT("label_color")
    public String labelColor;

    @C09CT("label_icon")
    public int labelIcon;

    @C09CT("label_text")
    public String labelText;

    @C09CT("promote_traffic_tag")
    public PromoteTraffic traffic;

    @C09CT("video_view_count")
    public Integer videoViewCount;

    @C09CT("video_view_schema")
    public String videoViewSchema;

    public PromoteModel() {
        Boolean bool = Boolean.FALSE;
        this.hasBottomBarButton = bool;
        this.enableContainerStrategy = bool;
    }

    public final String getBottomBarButtonText() {
        return this.bottomBarButtonText;
    }

    public final Boolean getEnableContainerStrategy() {
        return this.enableContainerStrategy;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getHasBottomBarButton() {
        return this.hasBottomBarButton;
    }

    public final int getLabelClick() {
        return this.labelClick;
    }

    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelIcon() {
        return this.labelIcon;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final PromoteTraffic getTraffic() {
        return this.traffic;
    }

    public final Integer getVideoViewCount() {
        return this.videoViewCount;
    }

    public final String getVideoViewSchema() {
        return this.videoViewSchema;
    }

    public final boolean isPromoteAdLabel() {
        return this.isPromoteAdLabel;
    }

    public final boolean isShowVideoView() {
        return this.isShowVideoView;
    }

    public final void setBottomBarButtonText(String str) {
        this.bottomBarButtonText = str;
    }

    public final void setEnableContainerStrategy(Boolean bool) {
        this.enableContainerStrategy = bool;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHasBottomBarButton(Boolean bool) {
        this.hasBottomBarButton = bool;
    }

    public final void setLabelClick(int i) {
        this.labelClick = i;
    }

    public final void setLabelColor(String str) {
        this.labelColor = str;
    }

    public final void setLabelIcon(int i) {
        this.labelIcon = i;
    }

    public final void setLabelText(String str) {
        this.labelText = str;
    }

    public final void setPromoteAdLabel(boolean z) {
        this.isPromoteAdLabel = z;
    }

    public final void setShowVideoView(boolean z) {
        this.isShowVideoView = z;
    }

    public final void setTraffic(PromoteTraffic promoteTraffic) {
        this.traffic = promoteTraffic;
    }

    public final void setVideoViewCount(Integer num) {
        this.videoViewCount = num;
    }

    public final void setVideoViewSchema(String str) {
        this.videoViewSchema = str;
    }
}
