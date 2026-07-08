package com.bytedance.android.livesdk.livesetting.level;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_common_param_config_android")
public final class FansClubCommonParamConfig {
    public static final FansClubCommonParamConfig INSTANCE = new FansClubCommonParamConfig();
    public static final SchemaConfig DEFAULT = new SchemaConfig(null, "aweme://roma_redirect/?spark_page=fan_club_user_join&roma_group_key=spark_page_fan_club_user_join&roma_page_key=p", true);

    public final SchemaConfig getSwitchConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SchemaConfig schemaConfig = DEFAULT;
        SchemaConfig schemaConfig2 = (SchemaConfig) settingsManager.getValueSafely("live_fans_club_common_param_config_android", schemaConfig);
        return schemaConfig2 != null ? schemaConfig2 : schemaConfig;
    }

    public final String getFansClubJoinDialogSchema() {
        return getSwitchConfig().joinDialogSchema;
    }

    public final boolean getSwitch() {
        return getSwitchConfig().f32switch;
    }

    public final SchemaConfig getDEFAULT() {
        return DEFAULT;
    }

    public final ParamConfig getCommonParamsConfig(String str) {
        String str2;
        List<ParamConfig> list = getSwitchConfig().configs;
        if (list != null) {
            for (ParamConfig paramConfig : list) {
                if (paramConfig != null && (str2 = paramConfig.fanClubPage) != null && Intrinsics.LJFF(str, str2)) {
                    return paramConfig;
                }
            }
        }
        return new ParamConfig("", false, false, C13BV.INSTANCE);
    }
}
