package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_privilege_config")
public final class FansClubPrivilegeConfigSetting {
    public static final LiveFansPrivilegeConfig DEFAULT;
    public static final FansClubPrivilegeConfigSetting INSTANCE;

    public static final class LiveFansPrivilegeKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubPrivilegeConfigSetting_LiveFansPrivilegeKey_OptTypeAdapter();
        }

        public LiveFansPrivilegeKey() {
            this("", "");
        }

        public LiveFansPrivilegeKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    static {
        FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = new FansClubPrivilegeConfigSetting();
        INSTANCE = fansClubPrivilegeConfigSetting;
        DEFAULT = fansClubPrivilegeConfigSetting.constructDefaultConfig();
    }

    private final List<LiveFansPrivilegeElementConfig> buildPrivilegeGiftElementsList() {
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig.iconFileName = "ttlive_icon_new_fans_club_gift_dialog_v2_fan_badge.png";
        liveFansPrivilegeElementConfig.positionName = "badge";
        liveFansPrivilegeElementConfig.content = new LiveFansPrivilegeKey("Fan badge", "ttlive_fanClub_viewer_joinFanClubPanel_fanBadge_perkName");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig2 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig2.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig2.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_sticker.png";
        liveFansPrivilegeElementConfig2.positionName = "sticker";
        liveFansPrivilegeElementConfig2.content = new LiveFansPrivilegeKey("Fan Club stickers", "ttlive_fanClub_viewer_joinFanClubPanel_fanClubStickers_perkName");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig3 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig3.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig3.iconFileName = "ttlive_icon_new_fans_club_dialog_v2_style_entrance_spotlight.png";
        liveFansPrivilegeElementConfig3.positionName = "entrance_spotlight";
        liveFansPrivilegeElementConfig3.content = new LiveFansPrivilegeKey("Entrance spotlight", "ttlive_joinTeam_fromIcon_entranceSpotlight_desc");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig4 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig4.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig4.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_new_exclusive_gifts.png";
        liveFansPrivilegeElementConfig4.positionName = "exclusive_gift";
        liveFansPrivilegeElementConfig4.content = new LiveFansPrivilegeKey("Exclusive Gifts", "ttlive_joinTeam_fromIcon_exclusiveGifts_desc");
        return C1697810uHb.LJIILJJIL(liveFansPrivilegeElementConfig, liveFansPrivilegeElementConfig2, liveFansPrivilegeElementConfig3, liveFansPrivilegeElementConfig4);
    }

    private final LiveFansPrivilegeConfig constructDefaultConfig() {
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_text_badge_background.png";
        liveFansPrivilegeElementConfig.positionName = "member_badge";
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig2 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig2.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig2.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_text_badge.png";
        liveFansPrivilegeElementConfig2.positionName = "member_badge";
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig3 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig3.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig3.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_sticker.png";
        liveFansPrivilegeElementConfig3.positionName = "sticker";
        liveFansPrivilegeElementConfig3.content = new LiveFansPrivilegeKey("Fan Club Stickers", "ttlive_fanClub_viewer_joinFanClubPanel_fanClubStickers_perkName");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig4 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig4.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig4.iconFileName = "ttlive_icon_new_fans_club_dialog_v2_style_entrance_spotlight.png";
        liveFansPrivilegeElementConfig4.positionName = "entrance_spotlight";
        liveFansPrivilegeElementConfig4.content = new LiveFansPrivilegeKey("Entrance spotlight", "ttlive_joinTeam_fromIcon_entranceSpotlight_desc");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig5 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig5.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig5.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_new_exclusive_gifts.png";
        liveFansPrivilegeElementConfig5.positionName = "exclusive_gift";
        liveFansPrivilegeElementConfig5.content = new LiveFansPrivilegeKey("Exclusive Gifts", "ttlive_joinTeam_fromIcon_exclusiveGifts_desc");
        LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig6 = new LiveFansPrivilegeElementConfig("", "", "", null);
        liveFansPrivilegeElementConfig6.channel = "tiktok_live_fans_club_join_dialog";
        liveFansPrivilegeElementConfig6.iconFileName = "ttlive_icon_new_fans_club_dialog_v3_level_up.png";
        liveFansPrivilegeElementConfig6.positionName = "level_up_celebration";
        liveFansPrivilegeElementConfig6.content = new LiveFansPrivilegeKey("Level-up celebration", "ttlive_joinTeam_fromIcon_levelUpCelebration_desc");
        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("7747176548090138211", "7747176548093415022", "7747176548096691833", "7747176548099968644", "7747176548099968655", "7747176548099968666", "7747176548099968677", "7747176548099968688", "7747176548099968699", "7747176548099968612");
        LiveFansPrivilegeConfig liveFansPrivilegeConfig = new LiveFansPrivilegeConfig(null, 0, 1, null, null, null, null, null);
        liveFansPrivilegeConfig.showNewIcon = Boolean.TRUE;
        liveFansPrivilegeConfig.showNewIconPos = 0;
        liveFansPrivilegeConfig.badgeIconBgConfig = liveFansPrivilegeElementConfig;
        liveFansPrivilegeConfig.badgeIconConfig = liveFansPrivilegeElementConfig2;
        liveFansPrivilegeConfig.privilegeElements = C1697810uHb.LJIILJJIL(liveFansPrivilegeElementConfig3, liveFansPrivilegeElementConfig4, liveFansPrivilegeElementConfig5, liveFansPrivilegeElementConfig6);
        liveFansPrivilegeConfig.privilegeGiftElements = INSTANCE.buildPrivilegeGiftElementsList();
        liveFansPrivilegeConfig.defaultStickerIds = listLJIILJJIL;
        return liveFansPrivilegeConfig;
    }

    public final LiveFansPrivilegeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansPrivilegeConfig liveFansPrivilegeConfig = DEFAULT;
        LiveFansPrivilegeConfig liveFansPrivilegeConfig2 = (LiveFansPrivilegeConfig) settingsManager.getValueSafely("fans_club_privilege_config", liveFansPrivilegeConfig);
        return liveFansPrivilegeConfig2 != null ? liveFansPrivilegeConfig2 : liveFansPrivilegeConfig;
    }

    public static final class LiveFansPrivilegeElementConfig {
        public static final TypeAdapter ADAPTER = new FansClubPrivilegeConfigSetting_LiveFansPrivilegeElementConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("channel")
        public String channel;

        @C09CT("content")
        public LiveFansPrivilegeKey content;

        @C09CT("icon_file_name")
        public String iconFileName;

        @C09CT("position_name")
        public String positionName;

        public LiveFansPrivilegeElementConfig() {
            this("", "", "", null);
        }

        public LiveFansPrivilegeElementConfig(String str, String str2, String str3, LiveFansPrivilegeKey liveFansPrivilegeKey) {
            this.channel = str;
            this.iconFileName = str2;
            this.positionName = str3;
            this.content = liveFansPrivilegeKey;
        }
    }

    public static final class LiveFansPrivilegeConfig {
        public static final TypeAdapter ADAPTER = new FansClubPrivilegeConfigSetting_LiveFansPrivilegeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("badge_icon_bg_config")
        public LiveFansPrivilegeElementConfig badgeIconBgConfig;

        @C09CT("badge_icon_config")
        public LiveFansPrivilegeElementConfig badgeIconConfig;

        @C09CT("default_emote_ids")
        public List<String> defaultStickerIds;

        @C09CT("privilege_elements")
        public List<LiveFansPrivilegeElementConfig> privilegeElements;

        @C09CT("privilege_gift_elements")
        public List<LiveFansPrivilegeElementConfig> privilegeGiftElements;

        @C09CT("show_fans_club_privilege_gift_new_icon_pos")
        public int showGiftNewIconPos;

        @C09CT("show_fans_club_privilege_new_icon")
        public Boolean showNewIcon;

        @C09CT("show_fans_club_privilege_new_icon_pos")
        public int showNewIconPos;

        public LiveFansPrivilegeConfig() {
            this(null, 0, 1, null, null, null, null, null);
        }

        public LiveFansPrivilegeConfig(Boolean bool, int i, int i2, LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig, LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig2, List<LiveFansPrivilegeElementConfig> list, List<LiveFansPrivilegeElementConfig> list2, List<String> list3) {
            this.showNewIcon = bool;
            this.showNewIconPos = i;
            this.showGiftNewIconPos = i2;
            this.badgeIconBgConfig = liveFansPrivilegeElementConfig;
            this.badgeIconConfig = liveFansPrivilegeElementConfig2;
            this.privilegeElements = list;
            this.privilegeGiftElements = list2;
            this.defaultStickerIds = list3;
        }
    }
}
