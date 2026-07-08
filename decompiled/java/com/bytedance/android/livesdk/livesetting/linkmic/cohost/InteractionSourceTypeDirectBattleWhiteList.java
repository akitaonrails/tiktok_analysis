package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("interaction_source_type_direct_battle_white_list")
public final class InteractionSourceTypeDirectBattleWhiteList {
    public static final InteractionSourceTypeDirectBattleWhiteList INSTANCE = new InteractionSourceTypeDirectBattleWhiteList();
    public static final Configs DEFAULT = new Configs(false, null, null, null, 15, null);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("interaction_source_type_direct_battle_white_list", configs);
        return configs2 != null ? configs2 : configs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new InteractionSourceTypeDirectBattleWhiteList_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("quick_pair_white_list")
        public List<Integer> quickPairWhiteList;

        @C09CT("quick_recommend_during_cohost_white_list")
        public List<Integer> quickRecommendDuringCohostWhiteList;

        @C09CT("quick_recommend_white_list")
        public List<Integer> quickRecommendWhiteList;

        public Configs() {
            this(false, null, null, null, 15, null);
        }

        public Configs(boolean z, List<Integer> list, List<Integer> list2, List<Integer> list3) {
            this.isEnabled = z;
            this.quickPairWhiteList = list;
            this.quickRecommendWhiteList = list2;
            this.quickRecommendDuringCohostWhiteList = list3;
        }

        public Configs(boolean z, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? Collections.singletonList(65) : list, (i & 4) != 0 ? Collections.singletonList(66) : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
        }
    }
}
