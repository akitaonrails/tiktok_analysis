package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "service_sku_routing_config")
public final class ServiceSkuRoutingConfigSetting {
    public static final ServiceSkuRoutingConfigSetting INSTANCE = new ServiceSkuRoutingConfigSetting();
    public static final ServiceSkuRoutingConfig DEFAULT = new ServiceSkuRoutingConfig(false, 0.5f, 2, 3, false);

    public final ServiceSkuRoutingConfig getValue() {
        ServiceSkuRoutingConfig serviceSkuRoutingConfig = (ServiceSkuRoutingConfig) SettingsManager.INSTANCE.getValueSafely(ServiceSkuRoutingConfigSetting.class);
        return serviceSkuRoutingConfig == null ? DEFAULT : serviceSkuRoutingConfig;
    }

    public final float getGlobalThreshold() {
        return getValue().getGlobalThreshold();
    }

    public final int getMaxShowPerDay() {
        return getValue().getMaxShowPerDay();
    }

    public final int getMaxShowPerSession() {
        return getValue().getMaxShowPerSession();
    }

    public final boolean ignoreFrequencyForTest() {
        return getValue().getIgnoreFrequencyForTest();
    }

    public final boolean isEnabled() {
        return getValue().getEnabled();
    }
}
