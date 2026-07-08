package com.bytedance.android.livesdk.livesetting.level;

import X.C1697810uHb;
import X.C2097908Jt;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "fansclub_community_guide_trigger_configuration")
public final class FansClubCommunityGuideTriggerConfigurationSetting {
    public static final FansClubCommunityGuideTriggerConfigurationSetting INSTANCE = new FansClubCommunityGuideTriggerConfigurationSetting();
    public static final FansClubCommunityGuideConfig DEFAULT = new FansClubCommunityGuideConfig(C1697810uHb.LJIIJJI(new FansClubCommunityGuideItem(new FansClubCommunityGuideDisplayConfiguration("tiktok_live_fans_club_guidance_resources", "live_fans_club_room_info_guidance_lottie.zip"), C2097908Jt.LIZJ(new Pair("trigger_type", "community_gameplay_levelup")), 50), new FansClubCommunityGuideItem(new FansClubCommunityGuideDisplayConfiguration("tiktok_live_fans_club_guidance_resources", "live_fans_club_room_info_guidance_lottie.zip"), C2097908Jt.LIZJ(new Pair("trigger_type", "community_highvalue_dressup")), 51)));

    public final FansClubCommunityGuideConfig getValue() {
        FansClubCommunityGuideConfig fansClubCommunityGuideConfig = (FansClubCommunityGuideConfig) SettingsManager.INSTANCE.getValueSafely(FansClubCommunityGuideTriggerConfigurationSetting.class);
        return fansClubCommunityGuideConfig == null ? DEFAULT : fansClubCommunityGuideConfig;
    }

    public final FansClubCommunityGuideItem getGuideByType(int i) {
        FansClubCommunityGuideItem next;
        Iterator<FansClubCommunityGuideItem> it2 = getValue().getLiveCommunityGuidance().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getGuidanceType() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
