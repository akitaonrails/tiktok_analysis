package com.bytedance.android.livesdk.performancetune.perfloadinfo;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePerfLoadInfo {
    public static final TypeAdapter ADAPTER = new LivePerfLoadInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("biz_scene")
    public String bizScene;

    @C09CT("biz_tags")
    public List<String> bizTags;

    public LivePerfLoadInfo() {
        this("unknown", new ArrayList());
    }

    public final String getBizScene() {
        return this.bizScene;
    }

    public final List<String> getBizTags() {
        return this.bizTags;
    }

    public final void setBizScene(String str) {
        this.bizScene = str;
    }

    public final void setBizTags(List<String> list) {
        this.bizTags = list;
    }

    public LivePerfLoadInfo(String str, List<String> list) {
        this.bizScene = str;
        this.bizTags = list;
    }
}
