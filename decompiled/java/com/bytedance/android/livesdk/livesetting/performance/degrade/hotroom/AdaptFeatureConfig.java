package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class AdaptFeatureConfig {
    public static final TypeAdapter ADAPTER = new AdaptFeatureConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("adapt_key_list")
    public List<String> adaptKeyList;

    @C09CT("enable")
    public boolean enable;

    public AdaptFeatureConfig() {
        this(false, null, 3, null);
    }

    public final List<String> getAdaptKeyList() {
        return this.adaptKeyList;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setAdaptKeyList(List<String> list) {
        this.adaptKeyList = list;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public AdaptFeatureConfig(boolean z, List<String> list) {
        this.enable = z;
        this.adaptKeyList = list;
    }

    public AdaptFeatureConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
