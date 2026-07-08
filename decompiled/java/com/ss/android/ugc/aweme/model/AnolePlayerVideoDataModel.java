package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnolePlayerVideoDataModel implements Serializable {

    @C09CT("aigc_tag_text")
    public final String aigcTagText;

    @C09CT("close")
    public final CloseInfo closeInfo;

    @C09CT("enable_aigc_tag")
    public final Boolean enableAigcTag;

    @C09CT("is_repeated")
    public final Boolean isRepeated;

    @C09CT("log_info")
    public final LogInfo logInfo;

    @C09CT("need_mask")
    public final Boolean needMask;

    @C09CT("need_skip_icon")
    public final Boolean needSkipIcon;

    @C09CT("sponsored")
    public final SponsoredInfo sponsoredInfo;

    @C09CT("video")
    public AlphaVideoData video;

    @C09CT("video_config")
    public final VideoConfigInfo videoConfigInfo;

    @C09CT("video_map")
    public final ExtraVideoMap videoMap;

    public AnolePlayerVideoDataModel() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Boolean isRepeated() {
        return this.isRepeated;
    }

    public final void setVideo(AlphaVideoData alphaVideoData) {
        this.video = alphaVideoData;
    }

    public AnolePlayerVideoDataModel(AlphaVideoData alphaVideoData, Boolean bool, Boolean bool2, Boolean bool3, LogInfo logInfo, ExtraVideoMap extraVideoMap, CloseInfo closeInfo, SponsoredInfo sponsoredInfo, VideoConfigInfo videoConfigInfo, Boolean bool4, String str) {
        this.video = alphaVideoData;
        this.isRepeated = bool;
        this.needSkipIcon = bool2;
        this.needMask = bool3;
        this.logInfo = logInfo;
        this.videoMap = extraVideoMap;
        this.closeInfo = closeInfo;
        this.sponsoredInfo = sponsoredInfo;
        this.videoConfigInfo = videoConfigInfo;
        this.enableAigcTag = bool4;
        this.aigcTagText = str;
    }
}
