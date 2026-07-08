package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoUnDelete {
    public static final TypeAdapter ADAPTER = new GeckoUnDelete_OptTypeAdapter(NormalGson.singleton());

    @C09CT("gecko_resource_list")
    public List<String> resourceList = new ArrayList();
}
