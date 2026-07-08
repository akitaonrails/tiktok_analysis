package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SuperEntranceConfig {

    @C09CT("valid_times")
    public List<ValidTimesConfig> validTimes = new ArrayList();

    @C09CT("video_url")
    public String videoUrl = "";

    @C09CT("video_md5")
    public String videoMd5 = "";

    @C09CT("loop_video_url")
    public String loopVideoUrl = "";

    @C09CT("loop_video_md5")
    public String loopVideoMd5 = "";

    @C09CT("effect_id")
    public String effectId = "";

    @C09CT("plus_icon_url")
    public String plusIconUrl = "";

    @C09CT("plus_icon_md5")
    public String plusIconMd5 = "";

    @C09CT("effect_ids")
    public List<String> effectIds = new ArrayList();

    @C09CT("video_back_img_url")
    public String videoBackImgUrl = "";

    @C09CT("video_back_img_md5")
    public String videoBackImgMd5 = "";

    @C09CT("try_tip")
    public String tryTip = "";

    @C09CT("effect_tip")
    public String effectTip = "";

    public String getEffectId() {
        return this.effectId;
    }

    public List<String> getEffectIds() {
        return this.effectIds;
    }

    public String getEffectTip() {
        return this.effectTip;
    }

    public String getLoopVideoMd5() {
        return this.loopVideoMd5;
    }

    public String getLoopVideoUrl() {
        return this.loopVideoUrl;
    }

    public String getPlusIconMd5() {
        return this.plusIconMd5;
    }

    public String getPlusIconUrl() {
        return this.plusIconUrl;
    }

    public String getTryTip() {
        return this.tryTip;
    }

    public List<ValidTimesConfig> getValidTimes() {
        return this.validTimes;
    }

    public String getVideoBackImgMd5() {
        return this.videoBackImgMd5;
    }

    public String getVideoBackImgUrl() {
        return this.videoBackImgUrl;
    }

    public String getVideoMd5() {
        return this.videoMd5;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
}
