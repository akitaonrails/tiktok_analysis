package com.ss.android.ugc.gamora.recorder.navi.featureflags;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class TiktokAvatarLokiConfig {
    public static final TiktokAvatarLokiConfigData LIZ = new TiktokAvatarLokiConfigData("navi", "head_dev_plugin", "navi_head_prefab", "head", "scan_tiktok", "scan");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(598));

    public static final class TiktokAvatarLokiConfigData {

        @C09CT("editor_head_effect_name")
        public final String editorHeadEffectName;

        @C09CT("head_category_key")
        public final String headCategoryKey;

        @C09CT("loki_panel_name")
        public final String lokiPanelName;

        @C09CT("record_head_effect_name")
        public final String recordHeadEffectName;

        @C09CT("scan_category_key")
        public final String scanCategoryKey;

        @C09CT("scan_effect_name")
        public final String scanEffectName;

        public TiktokAvatarLokiConfigData() {
            this("navi", "head_dev_plugin", "navi_head_prefab", "head", "scan_tiktok", "scan");
        }

        public TiktokAvatarLokiConfigData(String str, String str2, String str3, String str4, String str5, String str6) {
            this.lokiPanelName = str;
            this.editorHeadEffectName = str2;
            this.recordHeadEffectName = str3;
            this.headCategoryKey = str4;
            this.scanEffectName = str5;
            this.scanCategoryKey = str6;
        }
    }
}
