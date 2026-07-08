package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("interaction_source_type_tracking_setting")
public final class InteractionSourceTypeTrackingSetting {
    public static final InteractionSourceTypeTrackingSetting INSTANCE = new InteractionSourceTypeTrackingSetting();
    public static final Configs DEFAULT = new Configs(false, null, null, null, null, null, 63, null);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("interaction_source_type_tracking_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    private final <T> T enableCheck(Function0<? extends T> function0) {
        if (!getValue().isEnabled) {
            return null;
        }
        return function0.invoke();
    }

    public final String getEnterFromForSourceType(Integer num) {
        if (num == null) {
            return null;
        }
        return (String) enableCheck(new AwS579S0100000_35(num, 72));
    }

    public final String getInviteeListValue(Integer num) {
        return (String) enableCheck(new AwS579S0100000_35(num, 73));
    }

    public final String getQuickPairTypeString(Integer num) {
        return (String) enableCheck(new AwS579S0100000_35(num, 74));
    }

    public final Integer getSourceTypeFromAutoMatchEntrance(Integer num) {
        return (Integer) enableCheck(new AwS579S0100000_35(num, 75));
    }

    public final String getSourceTypeString(Integer num) {
        return (String) enableCheck(new AwS579S0100000_35(num, 76));
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new InteractionSourceTypeTrackingSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("auto_match_entrance_to_source_type")
        public Map<String, String> autoMatchEntranceToSourceTypeMap;

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("quick_pair_type")
        public Map<String, String> quickPairType;

        @C09CT("source_type_string_map")
        public Map<String, String> sourceTypeStringMap;

        @C09CT("source_type_to_enter_from")
        public Map<String, String> sourceTypeToEnterFromMap;

        @C09CT("invitee_list_map")
        public Map<String, String> sourceTypeToInviteeListMap;

        public Configs() {
            this(false, null, null, null, null, null, 63, null);
        }

        public Configs(boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5) {
            this.isEnabled = z;
            this.sourceTypeToInviteeListMap = map;
            this.sourceTypeStringMap = map2;
            this.quickPairType = map3;
            this.autoMatchEntranceToSourceTypeMap = map4;
            this.sourceTypeToEnterFromMap = map5;
        }

        public Configs(boolean z, Map map, Map map2, Map map3, Map map4, Map map5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C2097608Jq.LJIIJ(new Pair("60", "live_support_campaign"), new Pair("61", "ccpk_single_invite"), new Pair("62", "ccpk_quick_invite"), new Pair("63", "ccpk_quick_recommend"), new Pair("75", "full_screen_quick_invite")) : map, (i & 4) != 0 ? C2097608Jq.LJIIJ(new Pair("60", "SOURCE_TYPE_BIG_EVENT_PLATFORM"), new Pair("61", "SOURCE_TYPE_CCPK_ACTIVITY_PAGE"), new Pair("62", "SOURCE_TYPE_CCPK_QUICK_PAIR"), new Pair("63", "SOURCE_TYPE_CCPK_QUICK_RECOMMEND"), new Pair("75", "SOURCE_TYPE_COMPANION_QUICK_COHOST_QUICK_RECOMMAND")) : map2, (i & 8) != 0 ? C2097608Jq.LJIIJ(new Pair("62", "ccpk_quick_match"), new Pair("63", "ccpk_quick_recommend"), new Pair("75", "quick_recommend")) : map3, (i & 16) != 0 ? C2097608Jq.LJIIJ(new Pair("4", "62")) : map4, (i & 32) != 0 ? C2097608Jq.LJIIJ(new Pair("60", "live_support_campaign"), new Pair("62", "cross_crew_pk_campaign"), new Pair("63", "cross_crew_pk_campaign")) : map5);
        }
    }
}
