package com.bytedance.android.livesdk.livesetting.other;

import X.C09AJ;
import X.C19748512Ol;
import X.C20441214yg;
import X.C782850UnL;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_message_platform_common_preference_bubble")
public final class LiveMessagePlatformCommonPreferenceBubbleSetting {
    public static final String DEFAULT = "";
    public static final LiveMessagePlatformCommonPreferenceBubbleSetting INSTANCE = new LiveMessagePlatformCommonPreferenceBubbleSetting();
    public static Map<String, LiveMessagePlatformBubbleConfig> configMap;
    public static boolean useSetting;

    private final Map<String, LiveMessagePlatformBubbleConfig> getSettingConfig() {
        C20441214yg.LJ("[Message]", "bubble use setting value");
        useSetting = true;
        try {
            return (Map) C19748512Ol.LIZIZ.LJIIIIZZ(SettingsManager.INSTANCE.getStringValue("live_message_platform_common_preference_bubble", DEFAULT), new TypeToken<Map<String, ? extends LiveMessagePlatformBubbleConfig>>() { // from class: X.0Urr
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveMessagePlatformCommonPreferenceBubbleSetting", e);
            return null;
        }
    }

    public final LiveMessagePlatformBubbleConfig getValue(String str) {
        Map<String, LiveMessagePlatformBubbleConfig> settingConfig;
        if (configMap == null || useSetting) {
            LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
            MessageNotifyConfig messageNotifyConfigLIZ = C782850UnL.LIZ();
            if ((messageNotifyConfigLIZ != null && (settingConfig = messageNotifyConfigLIZ.bubbleConfig) != null) || (settingConfig = getSettingConfig()) != null) {
                HashMap map = new HashMap(settingConfig);
                Iterator<String> it2 = LiveBubbleBlockListSetting.INSTANCE.getValue().iterator();
                while (it2.hasNext()) {
                    map.remove(it2.next());
                }
                configMap = map;
                LinkedList<C09AJ<Unit>> linkedList2 = C782850UnL.LIZ;
                if (C782850UnL.LIZIZ()) {
                    useSetting = false;
                }
            }
        }
        Map<String, LiveMessagePlatformBubbleConfig> map2 = configMap;
        if (map2 != null) {
            return map2.get(str);
        }
        return null;
    }
}
