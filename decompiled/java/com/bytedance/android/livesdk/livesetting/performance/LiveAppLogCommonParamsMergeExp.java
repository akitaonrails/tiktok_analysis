package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_app_log_common_params")
public final class LiveAppLogCommonParamsMergeExp {
    public static final LiveAppLogCommonParamsMergeExp INSTANCE = new LiveAppLogCommonParamsMergeExp();
    public static final CommonParamsMergeConfig DEFAULT = new CommonParamsMergeConfig(false, null, null, 7, null);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(50));
    public static final C01GW mergeEventBlackList$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(49));

    public final Set<String> getMergeEventBlackList() {
        return (Set) mergeEventBlackList$delegate.getValue();
    }

    public final CommonParamsMergeConfig getValue() {
        return (CommonParamsMergeConfig) value$delegate.getValue();
    }

    public final List<String> commonParamsListRoom() {
        return getValue().getCommonParamsRoom();
    }

    public final boolean enable() {
        return getValue().getEnable();
    }

    public static final class CommonParamsMergeConfig {
        public static final TypeAdapter ADAPTER = new LiveAppLogCommonParamsMergeExp_CommonParamsMergeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("common_params_list_room")
        public List<String> commonParamsRoom;

        @C09CT("enable")
        public boolean enable;

        @C09CT("merge_event_black_list")
        public List<String> mergeEventBlackList;

        public CommonParamsMergeConfig() {
            this(false, null, null, 7, null);
        }

        public final List<String> getCommonParamsRoom() {
            return this.commonParamsRoom;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final List<String> getMergeEventBlackList() {
            return this.mergeEventBlackList;
        }

        public final void setCommonParamsRoom(List<String> list) {
            this.commonParamsRoom = list;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setMergeEventBlackList(List<String> list) {
            this.mergeEventBlackList = list;
        }

        public CommonParamsMergeConfig(boolean z, List<String> list, List<String> list2) {
            this.enable = z;
            this.mergeEventBlackList = list;
            this.commonParamsRoom = list2;
        }

        public CommonParamsMergeConfig(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    public final boolean enableMergeForKey(String str) {
        if (enable() && !getMergeEventBlackList().contains(str)) {
            return true;
        }
        return false;
    }
}
