package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WebviewInlineInjectJsSettings {
    public static final WebviewInlineInjectJsModel LIZ = new WebviewInlineInjectJsModel(false, false, null, null, 15, null);

    public static final class WebviewInlineInjectJsModel {

        @C09CT("allowList")
        public final List<String> allowList;

        @C09CT("denyList")
        public final List<String> denyList;

        @C09CT("enabled")
        public final boolean enabled;

        @C09CT("legacyEnable")
        public final boolean legacyEnable;

        public WebviewInlineInjectJsModel() {
            this(false, false, null, null, 15, null);
        }

        public WebviewInlineInjectJsModel(boolean z, boolean z2, List<String> list, List<String> list2) {
            this.enabled = z;
            this.legacyEnable = z2;
            this.allowList = list;
            this.denyList = list2;
        }

        public WebviewInlineInjectJsModel(boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
