package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class RouterConfig {
    public static final TypeAdapter ADAPTER = new RouterConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enter_from_list")
    public List<String> enterFromList;

    public RouterConfig() {
        this(null, 1, null);
    }

    public RouterConfig(List<String> list) {
        this.enterFromList = list;
    }

    public RouterConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList("anchor_crm_page") : list);
    }
}
