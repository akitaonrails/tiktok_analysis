package com.bytedance.android.livesdk.broadcast.preview.animation.manager;

import X.C098200Yq;
import X.C189200o6;
import X.C19748512Ol;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "preview_animation_config")
public final class PreviewAnimationConfigSetting {
    public static final String DEFAULT = "";
    public static final PreviewAnimationConfigSetting INSTANCE = new PreviewAnimationConfigSetting();
    public static int abGroup;
    public static Map<String, PreviewAnimationConfig> activeConfigMap;
    public static final HashMap<String, PreviewAnimationConfig> defaultConfig;
    public static final HashMap<String, PreviewAnimationConfig> defaultConfig2;

    static {
        HashMap<String, PreviewAnimationConfig> map = new HashMap<>(4);
        map.put("LiveAcademyRewardAnimation", new PreviewAnimationConfig("PreviewLiveCenterWidget", 0, false));
        map.put("LiveCenterPromoteAnimation", new PreviewAnimationConfig("PreviewLiveCenterWidget", 1, true));
        map.put("LiveCampaignAnimation", new PreviewAnimationConfig("PreviewCampaignWidget", 2, true));
        map.put("InsertStickerAnimation", new PreviewAnimationConfig("PreviewStickerWidget", 3, true));
        defaultConfig = map;
        HashMap<String, PreviewAnimationConfig> map2 = new HashMap<>(4);
        map2.put("LiveAcademyRewardAnimation", new PreviewAnimationConfig("PreviewLiveCenterWidget", 0, false));
        map2.put("LiveCenterPromoteAnimation", new PreviewAnimationConfig("PreviewLiveCenterWidget", 1, true));
        map2.put("InsertStickerAnimation", new PreviewAnimationConfig("PreviewStickerWidget", 2, true));
        map2.put("LiveCampaignAnimation", new PreviewAnimationConfig("PreviewCampaignWidget", 3, true));
        defaultConfig2 = map2;
    }

    private final Map<String, PreviewAnimationConfig> getActiveConfig() {
        Map<String, PreviewAnimationConfig> map = activeConfigMap;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, PreviewAnimationConfig> settingConfig = getSettingConfig();
        if (settingConfig == null) {
            settingConfig = abGroup == 2 ? defaultConfig2 : defaultConfig;
        }
        for (Map.Entry<String, PreviewAnimationConfig> entry : settingConfig.entrySet()) {
            String key = entry.getKey();
            PreviewAnimationConfig value = entry.getValue();
            if (value.isActive()) {
                linkedHashMap.put(key, value);
            }
        }
        activeConfigMap = linkedHashMap;
        return linkedHashMap;
    }

    private final Map<String, PreviewAnimationConfig> getSettingConfig() {
        try {
            return (Map) C19748512Ol.LIZIZ.LJIIIIZZ(SettingsManager.INSTANCE.getStringValue("preview_animation_config", DEFAULT), new TypeToken<Map<String, ? extends PreviewAnimationConfig>>() { // from class: X.0UI8
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public final int activeAnimationSize() {
        return getActiveConfig().size();
    }

    public final PreviewAnimationConfig getConfig(String str) {
        if (getActiveConfig().containsKey(str)) {
            return getActiveConfig().get(str);
        }
        return null;
    }

    public final boolean isActive(String str) {
        return getActiveConfig().containsKey(str);
    }

    public final void setABGroup(long j) {
        abGroup = (int) j;
    }
}
