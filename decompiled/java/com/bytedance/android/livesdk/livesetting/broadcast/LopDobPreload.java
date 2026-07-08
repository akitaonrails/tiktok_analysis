package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LopDobPreload {
    public static final TypeAdapter ADAPTER = new LopDobPreload_OptTypeAdapter(NormalGson.singleton());

    @C09CT("expired_time_in_seconds")
    public int expiredTimeInSeconds;

    @C09CT("preload_allow_list")
    public List<String> preloadAllowList;

    @C09CT("preload_schema")
    public String preloadSchema;

    @C09CT("reuse_allow_list")
    public List<String> reuseAllowList;

    public LopDobPreload() {
        this("", new ArrayList(), new ArrayList(), 120);
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

    public LopDobPreload(String str, List<String> list, List<String> list2, int i) {
        this.preloadSchema = str;
        this.preloadAllowList = list;
        this.reuseAllowList = list2;
        this.expiredTimeInSeconds = i;
    }
}
