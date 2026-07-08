package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class ParamConfig {
    public static final TypeAdapter ADAPTER = new ParamConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fan_club_page")
    public String fanClubPage;

    @C09CT("need_common_param")
    public boolean needCommonParam;

    @C09CT("need_preload_storage_key")
    public boolean needPreloadStorageKey;

    @C09CT("preload_storage_keys")
    public List<String> preloadStorageKeys;

    public ParamConfig() {
        this(null, false, false, null, 15, null);
    }

    public ParamConfig(String str, boolean z, boolean z2, List<String> list) {
        this.fanClubPage = str;
        this.needCommonParam = z;
        this.needPreloadStorageKey = z2;
        this.preloadStorageKeys = list;
    }

    public ParamConfig(String str, boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
