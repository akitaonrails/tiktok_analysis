package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class SlrDiamondsPreload {
    public static final TypeAdapter ADAPTER = new SlrDiamondsPreload_OptTypeAdapter(NormalGson.singleton());

    @C09CT("expired_time_in_seconds")
    public int expiredTimeInSeconds;

    @C09CT("preload_allow_list")
    public List<String> preloadAllowList;

    @C09CT("preload_schema")
    public String preloadSchema;

    @C09CT("reuse_allow_list")
    public List<String> reuseAllowList;

    public SlrDiamondsPreload() {
        this(null, null, null, 0, 15, null);
    }

    public final int getExpiredTimeInSeconds() {
        return this.expiredTimeInSeconds;
    }

    public final List<String> getPreloadAllowList() {
        return this.preloadAllowList;
    }

    public final String getPreloadSchema() {
        return this.preloadSchema;
    }

    public final List<String> getReuseAllowList() {
        return this.reuseAllowList;
    }

    public final void setExpiredTimeInSeconds(int i) {
        this.expiredTimeInSeconds = i;
    }

    public final void setPreloadAllowList(List<String> list) {
        this.preloadAllowList = list;
    }

    public final void setPreloadSchema(String str) {
        this.preloadSchema = str;
    }

    public final void setReuseAllowList(List<String> list) {
        this.reuseAllowList = list;
    }

    public SlrDiamondsPreload(String str, List<String> list, List<String> list2, int i) {
        this.preloadSchema = str;
        this.preloadAllowList = list;
        this.reuseAllowList = list2;
        this.expiredTimeInSeconds = i;
    }

    public SlrDiamondsPreload(String str, List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "sslocal://webcast_lynxview_card?force_theme_style=dark&radius=8&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Flive_rewards_card%2Freal_time.js" : str, (i2 & 2) != 0 ? Collections.singletonList("sslocal://webcast_lynxview_card?force_theme_style=dark&radius=8&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Flive_rewards_card%2Freal_time.js") : list, (i2 & 4) != 0 ? new ArrayList() : list2, (i2 & 8) != 0 ? -1 : i);
    }
}
