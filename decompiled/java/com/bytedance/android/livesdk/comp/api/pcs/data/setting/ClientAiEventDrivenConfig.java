package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.EventDrivenConfig;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class ClientAiEventDrivenConfig {
    public static final TypeAdapter ADAPTER = new ClientAiEventDrivenConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled_strategies")
    public List<String> enabledStrategies;

    @C09CT("event_config_list")
    public List<EventDrivenConfig> eventConfigList;

    public ClientAiEventDrivenConfig() {
        this(null, null, 3, null);
    }

    public ClientAiEventDrivenConfig(List<EventDrivenConfig> list, List<String> list2) {
        this.eventConfigList = list;
        this.enabledStrategies = list2;
    }

    public ClientAiEventDrivenConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
