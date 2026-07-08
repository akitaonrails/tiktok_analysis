package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSlotSettings implements Serializable {
    public static final TypeAdapter ADAPTER = new LiveSlotSettings_OptTypeAdapter(NormalGson.singleton());

    @C09CT("biz_type_disallow")
    public Map<String, SlotBizTypeDisallow> bizTypeDisallow;

    public LiveSlotSettings() {
        this(null);
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        return this.bizTypeDisallow;
    }

    public LiveSlotSettings(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }

    public final void setBizTypeDisallow(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }
}
