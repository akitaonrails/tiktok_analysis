package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgFeedBottomNoticeBar {

    @C09CT("hashtag_ids")
    public List<String> hashTagIds;

    @C09CT("icon")
    public String icon;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("text")
    public String text;

    @C09CT("video_icon")
    public String videoIcon;

    @C09CT("video_ids")
    public List<String> videoIds;

    @C09CT("video_jump_link")
    public String videoJumpLink;

    @C09CT("video_text")
    public String videoText;

    public List<String> getHashTagIds() {
        return this.hashTagIds;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getJumpLink() {
        return this.jumpLink;
    }

    public String getText() {
        return this.text;
    }

    public String getVideoIcon() {
        return this.videoIcon;
    }

    public List<String> getVideoIds() {
        return this.videoIds;
    }

    public String getVideoJumpLink() {
        return this.videoJumpLink;
    }

    public String getVideoText() {
        return this.videoText;
    }

    public void setHashTagIds(List<String> list) {
        this.hashTagIds = list;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setJumpLink(String str) {
        this.jumpLink = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setVideoIcon(String str) {
        this.videoIcon = str;
    }

    public void setVideoIds(List<String> list) {
        this.videoIds = list;
    }

    public void setVideoJumpLink(String str) {
        this.videoJumpLink = str;
    }

    public void setVideoText(String str) {
        this.videoText = str;
    }
}
