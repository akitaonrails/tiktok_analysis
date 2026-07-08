package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class LikeConfig {
    public static final TypeAdapter ADAPTER = new LikeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("digg_show_easteregg_direct")
    public int diggShowEastereggDirect;

    @C09CT("digg_threshold_adjust_enable")
    public int diggThresholdAdjustEnable;

    @C09CT("digg_progress_max_tap_count")
    public int fullProgressTapCount;

    @C09CT("digg_icon_force_heart")
    public boolean iconForceHeart;

    @C09CT("like_style")
    public int likeStyle;

    @C09CT("digg_others_flow_anim_delay")
    public long othersFlowAnimDelay;

    @C09CT("digg_others_flow_anim_repeat_count")
    public int othersFlowAnimRepeatCount;

    @C09CT("digg_send_likes_tap_count")
    public int sendLikesTapCount;

    @C09CT("digg_show_progress_tap_count")
    public int showProgressTapCount;

    @C09CT("digg_tap_interval")
    public long tapInterval;

    public static LikeConfig LIZ() {
        LikeConfig likeConfig = new LikeConfig();
        likeConfig.likeStyle = 0;
        likeConfig.tapInterval = 500L;
        likeConfig.sendLikesTapCount = 15;
        likeConfig.showProgressTapCount = 15;
        likeConfig.fullProgressTapCount = 80;
        likeConfig.othersFlowAnimRepeatCount = 1;
        likeConfig.iconForceHeart = false;
        likeConfig.othersFlowAnimDelay = 300L;
        likeConfig.diggShowEastereggDirect = 0;
        likeConfig.diggThresholdAdjustEnable = 0;
        return likeConfig;
    }
}
