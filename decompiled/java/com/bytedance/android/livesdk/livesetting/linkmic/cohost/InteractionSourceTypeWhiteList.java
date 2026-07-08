package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("interaction_source_type_white_list")
public final class InteractionSourceTypeWhiteList {
    public static final InteractionSourceTypeWhiteList INSTANCE = new InteractionSourceTypeWhiteList();
    public static final Configs DEFAULT = new Configs(false, null, null, null, null, null, 63, null);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("interaction_source_type_white_list", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isNormalCohostAllowed(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().whiteList.contains(Integer.valueOf(i));
    }

    public final boolean skipOpenPanel(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().skipOpenPanelBack.contains(Integer.valueOf(i));
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new InteractionSourceTypeWhiteList_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("quick_pair_white_list")
        public List<Integer> quickPairWhiteList;

        @C09CT("quick_recommend_during_cohost_white_list")
        public List<Integer> quickRecommendDuringCohostWhiteList;

        @C09CT("quick_recommend_white_list")
        public List<Integer> quickRecommendWhiteList;

        @C09CT("normal_cohost_skip_open_panel_back")
        public List<Integer> skipOpenPanelBack;

        @C09CT("normal_cohost_white_list")
        public List<Integer> whiteList;

        public Configs() {
            this(false, null, null, null, null, null, 63, null);
        }

        public Configs(boolean z, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5) {
            this.isEnabled = z;
            this.whiteList = list;
            this.skipOpenPanelBack = list2;
            this.quickPairWhiteList = list3;
            this.quickRecommendWhiteList = list4;
            this.quickRecommendDuringCohostWhiteList = list5;
        }

        public Configs(boolean z, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C1697810uHb.LJIIJJI(61, 64, 67) : list, (i & 4) != 0 ? C1697810uHb.LJIIJJI(61, 60) : list2, (i & 8) != 0 ? Collections.singletonList(62) : list3, (i & 16) != 0 ? Collections.singletonList(63) : list4, (i & 32) != 0 ? C13BV.INSTANCE : list5);
        }
    }
}
