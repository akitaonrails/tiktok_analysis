package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GuidanceConfig {
    public static final TypeAdapter ADAPTER = new GuidanceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("business_dependency_configuration")
    public List<BusinessDependency> businessDependencyConfiguration;

    @C09CT("display_configuration")
    public DisplayConfiguration displayConfiguration;

    @C09CT("frequency_configuration")
    public List<FrequencyConfiguration> frequencyConfiguration;

    @C09CT("guidance_key")
    public String guidanceKey;

    @C09CT("permission_configuration")
    public List<PermissionConfiguration> permissionConfiguration;

    @C09CT("trigger_configuration")
    public List<TriggerConfiguration> triggerConfiguration;

    public GuidanceConfig() {
        this("", null, null, null, null, null);
    }

    public GuidanceConfig(String str, DisplayConfiguration displayConfiguration, List<TriggerConfiguration> list, List<BusinessDependency> list2, List<PermissionConfiguration> list3, List<FrequencyConfiguration> list4) {
        this.guidanceKey = str;
        this.displayConfiguration = displayConfiguration;
        this.triggerConfiguration = list;
        this.businessDependencyConfiguration = list2;
        this.permissionConfiguration = list3;
        this.frequencyConfiguration = list4;
    }
}
