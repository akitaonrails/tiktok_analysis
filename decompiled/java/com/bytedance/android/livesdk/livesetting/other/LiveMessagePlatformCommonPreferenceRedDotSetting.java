package com.bytedance.android.livesdk.livesetting.other;

import X.C09AJ;
import X.C19748512Ol;
import X.C20441214yg;
import X.C782710Un7;
import X.C782850UnL;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_message_platform_common_preference_red_dot")
public final class LiveMessagePlatformCommonPreferenceRedDotSetting {
    public static final String DEFAULT = "";
    public static final LiveMessagePlatformCommonPreferenceRedDotSetting INSTANCE = new LiveMessagePlatformCommonPreferenceRedDotSetting();
    public static Map<String, LiveMessagePlatformRedDotConfig> configMap;
    public static boolean useSetting;

    private final void initConfig() {
        Map<String, LiveMessagePlatformRedDotConfig> mapInitSettingConfig;
        if (configMap == null || useSetting) {
            LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
            MessageNotifyConfig messageNotifyConfigLIZ = C782850UnL.LIZ();
            if ((messageNotifyConfigLIZ == null || (mapInitSettingConfig = messageNotifyConfigLIZ.redDotConfig) == null) && (mapInitSettingConfig = initSettingConfig()) == null) {
                return;
            }
            HashMap map = new HashMap(mapInitSettingConfig);
            for (String str : LiveRedDotBlockListSetting.INSTANCE.getValue()) {
                map.remove(str);
                C782710Un7.LIZ.getClass();
                C782710Un7.LJFF(null, "redDot is blocked, it in LiveRedDotBlockListSetting", "BLOCK", str);
            }
            configMap = map;
            LinkedList<C09AJ<Unit>> linkedList2 = C782850UnL.LIZ;
            if (C782850UnL.LIZIZ()) {
                useSetting = false;
            }
        }
    }

    private final Map<String, LiveMessagePlatformRedDotConfig> initSettingConfig() {
        C20441214yg.LJ("[Message]", "redDot use setting value");
        useSetting = true;
        try {
            return (Map) C19748512Ol.LIZIZ.LJIIIIZZ(SettingsManager.INSTANCE.getStringValue("live_message_platform_common_preference_red_dot", DEFAULT), new TypeToken<Map<String, ? extends LiveMessagePlatformRedDotConfig>>() { // from class: X.0UnG
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveMessagePlatformCommonPreferenceRedDotSetting", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig getValue(X.C0UX6 r7) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonPreferenceRedDotSetting.getValue(X.0UX6):com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig");
    }

    public final LiveMessagePlatformRedDotConfig getValue(String str) {
        initConfig();
        Map<String, LiveMessagePlatformRedDotConfig> map = configMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
