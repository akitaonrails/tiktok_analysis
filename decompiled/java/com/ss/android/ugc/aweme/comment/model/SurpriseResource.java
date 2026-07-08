package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class SurpriseResource implements Serializable {

    @C09CT("activity_id")
    public final Long activityId;

    @C09CT("autoplay")
    public final boolean autoplay;

    @C09CT("buttons")
    public final List<ButtonResource> buttons;

    @C09CT("display_type")
    public final Long displayType;

    @C09CT("effect_id")
    public final Integer effectId;

    @C09CT("has_voice")
    public final Boolean hasVoice;

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("last_frame_url")
    public final String lastFrameUrl;

    @C09CT("loop")
    public final Boolean loop;

    @C09CT("max_show_time")
    public final Integer maxShowTime;

    @C09CT("screen_type")
    public final Integer screenType;

    @C09CT("surprise_name")
    public final String surpriseName;

    @C09CT("surprise_type")
    public final Integer surpriseType;

    @C09CT("video_height")
    public final Integer videoHeight;

    @C09CT("video_src")
    public final String videoSrc;

    @C09CT("video_width")
    public final Integer videoWidth;

    public SurpriseResource() {
        this(null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SurpriseResource(Integer num, String str, Integer num2, Integer num3, boolean z, Integer num4, Integer num5, Integer num6, String str2, Boolean bool, String str3, List<ButtonResource> list, Boolean bool2, String str4, Long l, Long l2) {
        this.effectId = num;
        this.videoSrc = str;
        this.maxShowTime = num2;
        this.screenType = num3;
        this.autoplay = z;
        this.videoHeight = num4;
        this.videoWidth = num5;
        this.surpriseType = num6;
        this.surpriseName = str2;
        this.hasVoice = bool;
        this.jumpUrl = str3;
        this.buttons = list;
        this.loop = bool2;
        this.lastFrameUrl = str4;
        this.displayType = l;
        this.activityId = l2;
    }
}
