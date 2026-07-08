package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("interaction_source_type_match_status_map")
public final class InteractionSourceTypeMatchStatusMap {
    public static final InteractionSourceTypeMatchStatusMap INSTANCE = new InteractionSourceTypeMatchStatusMap();
    public static final Configs DEFAULT = new Configs(false, null, null, null, null, null, 63, null);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("interaction_source_type_match_status_map", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isAutoMatchInviterFromJsb(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        if (!getValue().autoMatchInviterPair.contains(Integer.valueOf(i)) && !getValue().autoMatchInviterRecommend.contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }

    public final boolean isInviterFromFriendRank(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().inviterFromFriendRank.contains(Integer.valueOf(i));
    }

    public final boolean isInviterFromProfile(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().inviterFromProfile.contains(Integer.valueOf(i));
    }

    public final boolean isQuickPairSourceType(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().autoMatchInviterPair.contains(Integer.valueOf(i));
    }

    public final boolean isQuickRecommendSourceType(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().autoMatchInviterRecommend.contains(Integer.valueOf(i));
    }

    public final boolean isSoloInviterFromJSB(int i) {
        if (!getValue().isEnabled) {
            return false;
        }
        return getValue().soloInviterFromJSB.contains(Integer.valueOf(i));
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new InteractionSourceTypeMatchStatusMap_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("auto_match_inviter_quick_pair")
        public List<Integer> autoMatchInviterPair;

        @C09CT("auto_match_inviter_quick_recommend")
        public List<Integer> autoMatchInviterRecommend;

        @C09CT("inviter_from_friend_rank")
        public List<Integer> inviterFromFriendRank;

        @C09CT("inviter_from_profile")
        public List<Integer> inviterFromProfile;

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("solo_inviter_from_jsb")
        public List<Integer> soloInviterFromJSB;

        public Configs() {
            this(false, null, null, null, null, null, 63, null);
        }

        public Configs(boolean z, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5) {
            this.isEnabled = z;
            this.soloInviterFromJSB = list;
            this.autoMatchInviterPair = list2;
            this.autoMatchInviterRecommend = list3;
            this.inviterFromProfile = list4;
            this.inviterFromFriendRank = list5;
        }

        public Configs(boolean z, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? Collections.singletonList(64) : list, (i & 4) != 0 ? Collections.singletonList(65) : list2, (i & 8) != 0 ? C1697810uHb.LJIIJJI(66, 75) : list3, (i & 16) != 0 ? C1697810uHb.LJIIJJI(67, 68) : list4, (i & 32) != 0 ? C1697810uHb.LJIIJJI(70, 71) : list5);
        }
    }
}
