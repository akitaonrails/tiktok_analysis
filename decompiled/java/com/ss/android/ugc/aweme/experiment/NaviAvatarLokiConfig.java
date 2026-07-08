package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class NaviAvatarLokiConfig {
    public static final NaviAvatarLokiConfigData LIZ = new NaviAvatarLokiConfigData("21189044", "navi", "navi-ab");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(77));

    public static final class NaviAvatarLokiConfigData {

        @C09CT("asset_loki_panel_name")
        public final String AssetLokiPanelName;

        @C09CT("head_loki_panel_name")
        public final String headLokiPanelName;

        @C09CT("plugin_effect_id")
        public final String pluginEffectId;

        public NaviAvatarLokiConfigData() {
            this("21189044", "navi", "navi-ab");
        }

        public NaviAvatarLokiConfigData(String str, String str2, String str3) {
            this.pluginEffectId = str;
            this.headLokiPanelName = str2;
            this.AssetLokiPanelName = str3;
        }
    }

    public static final NaviAvatarLokiConfigData LIZ() {
        return (NaviAvatarLokiConfigData) LIZIZ.getValue();
    }
}
