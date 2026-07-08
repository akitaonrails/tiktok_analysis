package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelDynamicConfig {
    public static final TypeAdapter ADAPTER = new UserLevelDynamicConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_grade_barrage_ninepatch_scale")
    public boolean enableGradeNinePatchScale;

    @C09CT("fetch_fe_gecko_delay_time")
    public int fetchFeGeckoDelayTime;

    @C09CT("fetch_client_gecko_delay_time")
    public int fetchNativeGeckoDelayTime;

    @C09CT("min_barrage_grade")
    public int minBarrageGrade;

    @C09CT("preload_badge_icon_delay_time")
    public int preloadBadgeIconDelayTime;

    public UserLevelDynamicConfig() {
        this(10, false, 7, 9, 4);
    }

    public UserLevelDynamicConfig(int i, boolean z, int i2, int i3, int i4) {
        this.minBarrageGrade = i;
        this.enableGradeNinePatchScale = z;
        this.fetchFeGeckoDelayTime = i2;
        this.preloadBadgeIconDelayTime = i3;
        this.fetchNativeGeckoDelayTime = i4;
    }
}
