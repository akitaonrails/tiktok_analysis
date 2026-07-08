package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class HydrogenSettings {
    public static final HydrogenSettingModel LIZ = new HydrogenSettingModel(false, new HashMap());

    public static final class HydrogenSettingModel {

        @C09CT("action_map")
        public final HashMap<String, String> actionMap;

        @C09CT("enable")
        public final boolean enable;

        public HydrogenSettingModel(boolean z, HashMap<String, String> map) {
            this.enable = z;
            this.actionMap = map;
        }
    }
}
