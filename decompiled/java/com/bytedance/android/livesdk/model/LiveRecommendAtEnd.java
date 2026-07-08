package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecommendAtEnd {
    public static final TypeAdapter ADAPTER = new LiveRecommendAtEnd_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_hide_guide")
    public boolean delayHideGuide;

    @C09CT("enable_show_recommend")
    public int enableShowRecommend;

    @C09CT("android_follow_unread_extra_list")
    public List<String> followUnreadExtraList;

    @C09CT("following_entrances")
    public List<String> followingEntrances;

    @C09CT("is_limit_player_width")
    public boolean isLimitPlayerWidth;

    @C09CT("recommend_button_show_time")
    public long recommendButtonShowTime = 10;

    @C09CT("live_to_recommend_distance")
    public float recommendDistance;

    public LiveRecommendAtEnd() {
        C13BV c13bv = C13BV.INSTANCE;
        this.followingEntrances = c13bv;
        this.recommendDistance = 0.5f;
        this.followUnreadExtraList = c13bv;
    }
}
