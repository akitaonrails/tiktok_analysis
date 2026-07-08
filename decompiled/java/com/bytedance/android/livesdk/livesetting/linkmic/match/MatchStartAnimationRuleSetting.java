package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_match_start_animation_rule")
public final class MatchStartAnimationRuleSetting {
    public static final MatchStartAnimationRuleSetting INSTANCE = new MatchStartAnimationRuleSetting();
    public static final Configs DEFAULT = new Configs(INSTANCE.defaultRules());

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new MatchStartAnimationRuleSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rules")
        public Map<String, RuleConfig> rules;

        public Configs() {
            this(MatchStartAnimationRuleSetting.INSTANCE.defaultRules());
        }

        public Configs(Map<String, RuleConfig> map) {
            this.rules = map;
        }
    }

    public final Map<String, RuleConfig> defaultRules() {
        List listLJIIJJI = C1697810uHb.LJIIJJI("image_3", "image_6");
        C13BV c13bv = C13BV.INSTANCE;
        return C2097608Jq.LJIIIIZZ(new Pair("league_1v1", new RuleConfig("tiktok_live_interaction_demand_13", "ttlive_league_match_start_ani_two_tab.zip", listLJIIJJI, c13bv, C1697810uHb.LJIIJJI("image_1", "image_0"))), new Pair("league_individual_3", new RuleConfig("tiktok_live_interaction_demand_20", "ttlive_individual_league_3_tab.zip", C1697810uHb.LJIIJJI("image_5", "image_2", "image_8"), c13bv, C1697810uHb.LJIIJJI("image_4", "image_1", "image_7"))), new Pair("league_individual_4", new RuleConfig("tiktok_live_interaction_demand_19", "ttlive_individual_league_4_tab.zip", C1697810uHb.LJIIJJI("image_12", "image_2", "image_5", "image_8"), c13bv, C1697810uHb.LJIIJJI("image_10", "image_1", "image_4", "image_7"))), new Pair("normal_badge_1v1", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_match_start_ani_two_with_badge.zip", C1697810uHb.LJIIJJI("image_2", "image_6"), c13bv, C1697810uHb.LJIIJJI("image_1", "image_5"))), new Pair("normal_badge_individual_3", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_individual_match_start_ani_3_with_badge.zip", C1697810uHb.LJIIJJI("image_31", "image_34", "image_37"), c13bv, C1697810uHb.LJIIJJI("image_30", "image_33", "image_36"))), new Pair("normal_badge_individual_4", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_individual_match_start_ani_4_with_badge.zip", C1697810uHb.LJIIJJI("image_31", "image_34", "image_37", "image_40"), c13bv, C1697810uHb.LJIIJJI("image_30", "image_33", "image_36", "image_39"))), new Pair("normal_badge_no_badge_1v1", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_match_start_ani_two_with_badge.zip", C1697810uHb.LJIIJJI("image_2", "image_6"), C1697810uHb.LJIIJJI("image_0", "image_4"), c13bv)), new Pair("normal_badge_no_badge_individual_3", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_individual_match_start_ani_3_with_badge.zip", C1697810uHb.LJIIJJI("image_31", "image_34", "image_37"), c13bv, c13bv)), new Pair("normal_badge_no_badge_individual_4", new RuleConfig("tiktok_live_interaction_demand_24", "ttlive_individual_match_start_ani_4_with_badge.zip", C1697810uHb.LJIIJJI("image_31", "image_34", "image_37", "image_40"), c13bv, c13bv)), new Pair("normal_1v1", new RuleConfig("tiktok_live_match_redesign_resource_2", "ttlive_match_start_ani_two_opt.zip", C1697810uHb.LJIIJJI("image_4", "image_1"), C1697810uHb.LJIIJJI("image_3", "image_0"), c13bv)), new Pair("normal_individual_3", new RuleConfig("tiktok_live_interaction_demand_7", "ttlive_individual_match_start_ani_3.zip", C1697810uHb.LJIIJJI("image_0", "image_2", "image_4"), c13bv, c13bv)), new Pair("normal_individual_4", new RuleConfig("tiktok_live_interaction_demand_7", "ttlive_individual_match_start_ani_4.zip", C1697810uHb.LJIIJJI("image_0", "image_2", "image_6", "image_4"), c13bv, c13bv)), new Pair("match_mania_1v1", new RuleConfig("tiktok_live_interaction_demand_21", "1v1Android-matchmania-intro.zip", C1697810uHb.LJIIJJI("image_3", "image_7"), c13bv, c13bv)), new Pair("match_mania_individual_3", new RuleConfig("tiktok_live_interaction_demand_21", "1v1v1-Android-matchmania-intro.zip", C1697810uHb.LJIIJJI("image_1", "image_4", "image_7"), c13bv, c13bv)), new Pair("match_mania_individual_4", new RuleConfig("tiktok_live_interaction_demand_27", "1v1v1v1-Andriod-MatchMania-Intro.zip", C1697810uHb.LJIIJJI("image_2", "image_5", "image_8", "image_11"), c13bv, c13bv)));
    }

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("live_match_start_animation_rule", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final RuleConfig getRuleConfig(String str) {
        return getValue().rules.get(str);
    }

    public static final class RuleConfig {
        public static final TypeAdapter ADAPTER = new MatchStartAnimationRuleSetting_RuleConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("avatar_array")
        public List<String> avatarArray;

        @C09CT("file_name")
        public String fileName;

        @C09CT("gecko_channel")
        public String geckoChannel;

        @C09CT("league_array")
        public List<String> leagueArray;

        @C09CT("win_streak_array")
        public List<String> winStreakArray;

        public RuleConfig() {
            this(null, null, null, null, null, 31, null);
        }

        public RuleConfig(String str, String str2, List<String> list, List<String> list2, List<String> list3) {
            this.geckoChannel = str;
            this.fileName = str2;
            this.avatarArray = list;
            this.winStreakArray = list2;
            this.leagueArray = list3;
        }

        public RuleConfig(String str, String str2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? C13BV.INSTANCE : list3);
        }
    }
}
