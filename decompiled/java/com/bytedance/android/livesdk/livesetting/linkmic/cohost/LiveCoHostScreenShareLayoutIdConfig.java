package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCoHostScreenShareLayoutIdConfig {
    public static final TypeAdapter ADAPTER = new LiveCoHostScreenShareLayoutIdConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("landscape")
    public Map<String, String> landscapeLayout;

    @C09CT("portrait")
    public Map<String, String> portraitLayout;

    public LiveCoHostScreenShareLayoutIdConfig() {
        this(null, null, 3, null);
    }

    public LiveCoHostScreenShareLayoutIdConfig(Map<String, String> map, Map<String, String> map2) {
        this.landscapeLayout = map;
        this.portraitLayout = map2;
    }

    public LiveCoHostScreenShareLayoutIdConfig(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("2", "2004"), new Pair("3", "2005"), new Pair("4", "2006")) : map, (i & 2) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("2", "2007"), new Pair("3", "2008"), new Pair("4", "2009")) : map2);
    }
}
