package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class NativeTriggerConfig {
    public static final TypeAdapter ADAPTER = new NativeTriggerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_pitaya_filter_list")
    public List<String> enablePitayaFilterList;

    @C09CT("trigger_type_disable_list")
    public List<String> triggerTypeDisableList;

    public NativeTriggerConfig() {
        this(null, null, 3, null);
    }

    public NativeTriggerConfig(List<String> list, List<String> list2) {
        this.triggerTypeDisableList = list;
        this.enablePitayaFilterList = list2;
    }

    public NativeTriggerConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
