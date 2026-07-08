package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_team_match_animation_rule")
public final class TeamMatchAnimationRuleSetting {
    public static final TeamMatchAnimationRuleSetting INSTANCE = new TeamMatchAnimationRuleSetting();
    public static final Configs DEFAULT = new Configs(INSTANCE.defaultRules());

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new TeamMatchAnimationRuleSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rules")
        public Map<String, TeamRuleConfig> rules;

        public Configs() {
            this(TeamMatchAnimationRuleSetting.INSTANCE.defaultRules());
        }

        public Configs(Map<String, TeamRuleConfig> map) {
            this.rules = map;
        }
    }

    public final Map<String, TeamRuleConfig> defaultRules() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(Collections.singletonList("L-user 2"), Collections.singletonList("user-L"), Collections.singletonList("user-L 3"));
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(Collections.singletonList("R-user 2"), Collections.singletonList("user-R"), Collections.singletonList("user-R 3"));
        List listLJIIJJI3 = C1697810uHb.LJIIJJI(Collections.singletonList("image_2"), C1697810uHb.LJIIJJI("image_8", "image_10"), C1697810uHb.LJIIJJI("image_8", "image_10", "image_10_2"));
        List[] listArr = {Collections.singletonList("image_0"), C1697810uHb.LJIIJJI("image_4", "image_6"), C1697810uHb.LJIIJJI("image_4", "image_6", "image_6_2")};
        List listLJIIJJI4 = C1697810uHb.LJIIJJI(Collections.singletonList("android-L-user1"), Collections.singletonList("android-L-user2"), Collections.singletonList("android-L-user3"));
        List listLJIIJJI5 = C1697810uHb.LJIIJJI(Collections.singletonList("android-R-user1"), Collections.singletonList("android-R-user2"), Collections.singletonList("android-R-user3"));
        List listLJIIJJI6 = C1697810uHb.LJIIJJI(Collections.singletonList("image_1"), C1697810uHb.LJIIJJI("image_7", "image_4"), C1697810uHb.LJIIJJI("image_9", "image_11", "image_13"));
        List listLJIIJJI7 = C1697810uHb.LJIIJJI(Collections.singletonList("image_16"), C1697810uHb.LJIIJJI("image_20", "image_22"), C1697810uHb.LJIIJJI("image_24", "image_26", "image_28"));
        List listLJIIJJI8 = C1697810uHb.LJIIJJI(Collections.singletonList("image_0"), C1697810uHb.LJIIJJI("image_6", "image_3"));
        List[] listArr2 = {Collections.singletonList("image_15"), C1697810uHb.LJIIJJI("image_19", "image_18")};
        List listLJIIJJI9 = C1697810uHb.LJIIJJI(Collections.singletonList("android-L-user1"), Collections.singletonList("android-L-user2"), Collections.singletonList("android-L-user3"));
        List listLJIIJJI10 = C1697810uHb.LJIIJJI(Collections.singletonList("android-R-user1"), Collections.singletonList("android-R-user2"), Collections.singletonList("android-R-user3"));
        List listLJIIJJI11 = C1697810uHb.LJIIJJI(Collections.singletonList("image_1"), C1697810uHb.LJIIJJI("image_7", "image_4"), C1697810uHb.LJIIJJI("image_9", "image_11", "image_13"));
        List listLJIIJJI12 = C1697810uHb.LJIIJJI(Collections.singletonList("image_16"), C1697810uHb.LJIIJJI("image_20", "image_22"), C1697810uHb.LJIIJJI("image_24", "image_26", "image_28"));
        List listLJIIJJI13 = C1697810uHb.LJIIJJI(Collections.singletonList("image_0"), C1697810uHb.LJIIJJI("image_6", "image_3"));
        List[] listArr3 = {Collections.singletonList("image_15"), C1697810uHb.LJIIJJI("image_19", "image_18")};
        List listLJIIJJI14 = C1697810uHb.LJIIJJI(Collections.singletonList("L-user 2"), Collections.singletonList("user-L"), Collections.singletonList("user-L 3"));
        List listLJIIJJI15 = C1697810uHb.LJIIJJI(Collections.singletonList("R-user 2"), Collections.singletonList("user-R"), Collections.singletonList("user-R 3"));
        List listLJIIJJI16 = C1697810uHb.LJIIJJI(Collections.singletonList("image_2"), C1697810uHb.LJIIJJI("image_8", "image_10"), C1697810uHb.LJIIJJI("image_8", "image_10", "image_10_2"));
        List[] listArr4 = {Collections.singletonList("image_0"), C1697810uHb.LJIIJJI("image_4", "image_6"), C1697810uHb.LJIIJJI("image_4", "image_6", "image_6_2")};
        List listLJIIJJI17 = C1697810uHb.LJIIJJI(Collections.singletonList("android-L-user1"), Collections.singletonList("android-L-user2"), Collections.singletonList("android-L-user3"));
        List listLJIIJJI18 = C1697810uHb.LJIIJJI(Collections.singletonList("android-R-user1"), Collections.singletonList("android-R-user2"), Collections.singletonList("android-R-user3"));
        List listLJIIJJI19 = C1697810uHb.LJIIJJI(Collections.singletonList("image_1"), C1697810uHb.LJIIJJI("image_4", "image_7"), C1697810uHb.LJIIJJI("image_9", "image_11", "image_13"));
        List listLJIIJJI20 = C1697810uHb.LJIIJJI(Collections.singletonList("image_16"), C1697810uHb.LJIIJJI("image_20", "image_22"), C1697810uHb.LJIIJJI("image_24", "image_26", "image_28"));
        C13BV c13bv = C13BV.INSTANCE;
        return C2097608Jq.LJIIIIZZ(new Pair("team_league", new TeamRuleConfig("tiktok_live_interaction_demand_21", "league_team_match_start.zip", listLJIIJJI, listLJIIJJI2, listLJIIJJI3, C1697810uHb.LJIIJJI(listArr), null, null, false, 448, null)), new Pair("team_normal_badge", new TeamRuleConfig("tiktok_live_interaction_demand_25", "team_match_start_with_badge.zip", listLJIIJJI4, listLJIIJJI5, listLJIIJJI6, listLJIIJJI7, listLJIIJJI8, C1697810uHb.LJIIJJI(listArr2), true)), new Pair("team_normal_badge_no_badge", new TeamRuleConfig("tiktok_live_interaction_demand_25", "team_match_start_with_badge.zip", listLJIIJJI9, listLJIIJJI10, listLJIIJJI11, listLJIIJJI12, listLJIIJJI13, C1697810uHb.LJIIJJI(listArr3), false)), new Pair("team_normal", new TeamRuleConfig("tiktok_live_interaction_demand_9", "team_match_start.zip", listLJIIJJI14, listLJIIJJI15, listLJIIJJI16, C1697810uHb.LJIIJJI(listArr4), null, null, false, 448, null)), new Pair("team_match_mania", new TeamRuleConfig("tiktok_live_interaction_demand_27", "team-MatchMania-Android.zip", listLJIIJJI17, listLJIIJJI18, listLJIIJJI19, listLJIIJJI20, c13bv, c13bv, false, 256, null)));
    }

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("live_team_match_animation_rule", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final TeamRuleConfig getRuleConfig(String str) {
        return getValue().rules.get(str);
    }

    public static final class TeamRuleConfig {
        public static final TypeAdapter ADAPTER = new TeamMatchAnimationRuleSetting_TeamRuleConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("blue_layer_names")
        public List<? extends List<String>> blueLayerNames;

        @C09CT("blue_team_badge_arrays")
        public List<? extends List<String>> blueTeamBadgeArrays;

        @C09CT("blue_team_image_arrays")
        public List<? extends List<String>> blueTeamImageArrays;

        @C09CT("file_name")
        public String fileName;

        @C09CT("gecko_channel")
        public String geckoChannel;

        @C09CT("red_layer_names")
        public List<? extends List<String>> redLayerNames;

        @C09CT("red_team_badge_arrays")
        public List<? extends List<String>> redTeamBadgeArrays;

        @C09CT("red_team_image_arrays")
        public List<? extends List<String>> redTeamImageArrays;

        @C09CT("show_badge")
        public boolean showBadge;

        public TeamRuleConfig() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        public TeamRuleConfig(String str, String str2, List<? extends List<String>> list, List<? extends List<String>> list2, List<? extends List<String>> list3, List<? extends List<String>> list4, List<? extends List<String>> list5, List<? extends List<String>> list6, boolean z) {
            this.geckoChannel = str;
            this.fileName = str2;
            this.redLayerNames = list;
            this.blueLayerNames = list2;
            this.redTeamImageArrays = list3;
            this.blueTeamImageArrays = list4;
            this.redTeamBadgeArrays = list5;
            this.blueTeamBadgeArrays = list6;
            this.showBadge = z;
        }

        public TeamRuleConfig(String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? C13BV.INSTANCE : list3, (i & 32) != 0 ? C13BV.INSTANCE : list4, (i & 64) != 0 ? C13BV.INSTANCE : list5, (i & 128) != 0 ? C13BV.INSTANCE : list6, (i & 256) != 0 ? false : z);
        }
    }
}
