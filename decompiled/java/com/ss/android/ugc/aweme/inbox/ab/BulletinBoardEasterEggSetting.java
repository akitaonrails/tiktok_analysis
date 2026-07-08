package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.EnumC636800OyM;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardEasterEggSetting {
    public static final BulletinBoardEasterEggSettingConfig LIZ = new BulletinBoardEasterEggSettingConfig(null, 0, 0, 7, null);

    public static final class BulletinBoardEasterEggInfo {

        @C09CT("bulletin_board_id")
        public final String bulletinBoardId;

        @C09CT("campaign_id")
        public final String campaignId;

        @C09CT("easter_egg_info")
        public final String easterEggInfo;

        @C09CT("event_end_time")
        public final String eventEndTime;

        @C09CT("event_start_time")
        public final String eventStartTime;

        @C09CT("jump_url")
        public final String jumpUrl;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinBoardEasterEggInfo(bulletinBoardId=");
            sbLIZ.append(this.bulletinBoardId);
            sbLIZ.append(", campaignId=");
            sbLIZ.append(this.campaignId);
            sbLIZ.append(", easterEggInfo=");
            sbLIZ.append(this.easterEggInfo);
            sbLIZ.append(", jumpUrl=");
            sbLIZ.append(this.jumpUrl);
            sbLIZ.append(", eventStartTime=");
            sbLIZ.append(this.eventStartTime);
            sbLIZ.append(", eventEndTime=");
            sbLIZ.append(this.eventEndTime);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BulletinBoardEasterEggInfo() {
            this("", "", "", "", "", "");
        }

        public BulletinBoardEasterEggInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            this.bulletinBoardId = str;
            this.campaignId = str2;
            this.easterEggInfo = str3;
            this.jumpUrl = str4;
            this.eventStartTime = str5;
            this.eventEndTime = str6;
        }
    }

    public static BulletinBoardEasterEggSettingConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BulletinBoardEasterEggSettingConfig bulletinBoardEasterEggSettingConfig = LIZ;
        BulletinBoardEasterEggSettingConfig bulletinBoardEasterEggSettingConfig2 = (BulletinBoardEasterEggSettingConfig) settingsManagerLIZLLL.LJIIIIZZ("bulletin_board_easter_egg_settings", BulletinBoardEasterEggSettingConfig.class, bulletinBoardEasterEggSettingConfig);
        return bulletinBoardEasterEggSettingConfig2 != null ? bulletinBoardEasterEggSettingConfig2 : bulletinBoardEasterEggSettingConfig;
    }

    public static final class BulletinBoardEasterEggSettingConfig {

        @C09CT("easter_egg_infos")
        public final List<BulletinBoardEasterEggInfo> easterEggInfo;

        @C09CT("easter_egg_max_show_count")
        public final int easterEggMaxShowCount;

        @C09CT("easter_egg_trigger_way")
        public final int easterEggTriggerWay;

        public BulletinBoardEasterEggSettingConfig() {
            this(null, 0, 0, 7, null);
        }

        public BulletinBoardEasterEggSettingConfig(List<BulletinBoardEasterEggInfo> list, int i, int i2) {
            this.easterEggInfo = list;
            this.easterEggMaxShowCount = i;
            this.easterEggTriggerWay = i2;
        }

        public BulletinBoardEasterEggSettingConfig(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? EnumC636800OyM.UNKNOWN.getValue() : i2);
        }
    }
}
