package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_claim_points_optimisatoin")
public final class LiveFansClubClaimPointsOptSetting {
    public static final LiveFansClubClaimPointsOptSetting INSTANCE = new LiveFansClubClaimPointsOptSetting();
    public static final Config DEFAULT = new Config(true, true, true, true, null, null, 600, 60);

    public final boolean enableFansClubPointOpt() {
        return LiveCreatorTeamManuallyCollectModeOpt.INSTANCE.isManualCollectOPTMode();
    }

    public final Config getSwitchConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_enable_claim_points_optimisatoin", config);
        return config2 != null ? config2 : config;
    }

    public final boolean enableExpirePointMessage() {
        return getSwitchConfig().expirePointSwitch && enableFansClubPointOpt();
    }

    public final boolean enableFansPointsAnim() {
        return getSwitchConfig().newClaimAnimationSwitch && enableFansClubPointOpt();
    }

    public final boolean enableFirstTimeClaimMessage() {
        return getSwitchConfig().firstTimeClaimMessage && enableFansClubPointOpt();
    }

    public final boolean enableNewJoinCompleteTaskMessage() {
        return getSwitchConfig().newJoinCompleteTaskSwitch && enableFansClubPointOpt();
    }

    public final long getSystemMessageBlockIntervalMillis() {
        return getSwitchConfig().systemMessageBlockInterval * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final Config getDEFAULT() {
        return DEFAULT;
    }

    public final FansClaimResConfig getFansClubAnimResConfig(int i, Room room) {
        int i2;
        List<FansClaimResConfig> list;
        int i3;
        Config switchConfig = getSwitchConfig();
        FansClaimResConfig fansClaimResConfig = null;
        if (switchConfig != null && (list = switchConfig.newFansClaimWebpResConfig) != null && !list.isEmpty()) {
            List<FansClaimResConfig> list2 = getSwitchConfig().newFansClaimWebpResConfig;
            if (list2 == null || !(!list2.isEmpty())) {
                return null;
            }
            Iterator<FansClaimResConfig> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FansClaimResConfig next = it2.next();
                FansClaimResConfig fansClaimResConfig2 = next;
                if (fansClaimResConfig2 != null) {
                    i3 = fansClaimResConfig2.fansGrade;
                } else {
                    i3 = 0;
                }
                if (i <= i3) {
                    fansClaimResConfig = next;
                    break;
                }
            }
            return fansClaimResConfig;
        }
        List<FansClaimResConfig> list3 = getSwitchConfig().fansClaimWebpResConfig;
        if (list3 == null || !(!list3.isEmpty())) {
            return null;
        }
        Iterator<FansClaimResConfig> it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            FansClaimResConfig next2 = it3.next();
            FansClaimResConfig fansClaimResConfig3 = next2;
            if (fansClaimResConfig3 != null) {
                i2 = fansClaimResConfig3.fansGrade;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                fansClaimResConfig = next2;
                break;
            }
        }
        return fansClaimResConfig;
    }
}
