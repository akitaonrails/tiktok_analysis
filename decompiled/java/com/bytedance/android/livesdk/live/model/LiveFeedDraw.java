package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import X.C0ISY;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedDraw {
    public static final C0ISY Companion = new C0ISY();
    public static final TypeAdapter ADAPTER = new LiveFeedDraw_OptTypeAdapter(NormalGson.singleton());

    @C09CT("url")
    public String url = "";

    @C09CT("settings")
    public Map<String, LiveFeedSettings> settings = new HashMap();

    public static final String conventRequestFrom(String str, String str2) {
        Companion.getClass();
        return C0ISY.LIZ(str, str2);
    }

    public static final String getReqFrom(String str) {
        Companion.getClass();
        return C0ISY.LIZIZ(str);
    }

    public static final LiveFeedSettings getSettings(String str) {
        Companion.getClass();
        return C0ISY.LIZJ(str);
    }

    public static final LiveFeedSettings getSettings(String str, String str2) {
        Companion.getClass();
        return C0ISY.LIZLLL(str, str2);
    }

    public static final LiveFeedDraw defaultInstance() {
        Companion.getClass();
        return new LiveFeedDraw();
    }

    public final Map<String, LiveFeedSettings> getSettings() {
        return this.settings;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final String getChannelId(String str) {
        Companion.getClass();
        return String.valueOf(C0ISY.LIZJ(str).channel_id);
    }

    public static final boolean isEnable(String str) {
        Companion.getClass();
        return Intrinsics.LJFF(C0ISY.LIZJ(str).enable, "1");
    }

    public final void setSettings(Map<String, LiveFeedSettings> map) {
        this.settings = map;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public static final String getChannelId(String str, String str2) {
        Companion.getClass();
        return String.valueOf(C0ISY.LIZLLL(str, str2).channel_id);
    }

    public static final String getReqFrom(String str, String str2) {
        Companion.getClass();
        return C0ISY.LIZLLL(str, str2).param;
    }

    public static final boolean isEnable(String str, String str2) {
        Companion.getClass();
        return Intrinsics.LJFF(C0ISY.LIZLLL(str, str2).enable, "1");
    }

    public static final boolean isFollow(String str, String str2) {
        Companion.getClass();
        return C0ISY.LIZLLL(str, str2).isFollow;
    }
}
