package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class SystemCardContent extends BaseContent {

    @C09CT("business_id")
    public String businessId;

    @C09CT("extract")
    public final String extract;

    @C09CT("link_cards")
    public final List<LinkCard> linkCards;

    @C09CT("link_info")
    public LinkInfo linkInfo;

    @C09CT("text_info")
    public TextInfo textInfo;

    @C09CT("title")
    public Title title;

    @C09CT("video_info")
    public VideoInfo videoInfo;

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getExtract() {
        return this.extract;
    }

    public final List<LinkCard> getLinkCards() {
        return this.linkCards;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final TextInfo getTextInfo() {
        return this.textInfo;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setLinkInfo(LinkInfo linkInfo) {
        this.linkInfo = linkInfo;
    }

    public final void setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
    }

    public final void setTitle(Title title) {
        this.title = title;
    }

    public final void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }
}
