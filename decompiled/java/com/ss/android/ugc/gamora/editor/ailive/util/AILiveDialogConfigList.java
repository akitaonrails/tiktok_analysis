package com.ss.android.ugc.gamora.editor.ailive.util;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class AILiveDialogConfigList {
    public static final Map<String, Map<String, String>> LIZ = C2097608Jq.LJ();

    public static final class AILiveDialogConfig {

        @C09CT("action")
        public final String action;

        @C09CT("btnVertical")
        public boolean btnVertical;

        @C09CT("cancelBtn")
        public String cancelBtn;

        @C09CT("confirmBtn")
        public String confirmBtn;

        @C09CT("subtitle")
        public String subtitle;

        @C09CT("title")
        public String title;

        @C09CT("topIcon")
        public int topIcon;

        public AILiveDialogConfig() {
            this("", "", "", "", "", 0, true);
        }

        public AILiveDialogConfig(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
            this.action = str;
            this.title = str2;
            this.subtitle = str3;
            this.confirmBtn = str4;
            this.cancelBtn = str5;
            this.topIcon = i;
            this.btnVertical = z;
        }
    }
}
