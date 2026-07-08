package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiHistorySettingParams {
    public static final TypeAdapter ADAPTER = new ApiHistorySettingParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("allowlist")
    public List<String> allowlist;

    @C09CT("enabled")
    public boolean enabled;

    public ApiHistorySettingParams() {
        this(false, null, 3, null);
    }

    public ApiHistorySettingParams(boolean z, List<String> list) {
        this.enabled = z;
        this.allowlist = list;
    }

    public ApiHistorySettingParams(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
