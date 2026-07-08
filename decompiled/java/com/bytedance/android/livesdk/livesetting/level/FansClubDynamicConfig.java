package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubDynamicConfig {
    public static final TypeAdapter ADAPTER = new FansClubDynamicConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("badge_span_factor")
    public int badgeMarginSpanFactor;

    @C09CT("enable_fast_follow_by_fans")
    public boolean enableFastFollowByFansLevel;

    @C09CT("min_barrage_grade")
    public int minBarrageGrade;

    @C09CT("play_guide_anim_delay_time")
    public long playGuideAnimDelayTime;

    public FansClubDynamicConfig() {
        this(10, false, 4000L, 1);
    }

    public FansClubDynamicConfig(int i, boolean z, long j, int i2) {
        this.minBarrageGrade = i;
        this.enableFastFollowByFansLevel = z;
        this.playGuideAnimDelayTime = j;
        this.badgeMarginSpanFactor = i2;
    }
}
