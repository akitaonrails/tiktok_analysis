package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WebResponseContentTypeModifySettings {
    public static final WebResponseContentTypeModifyModel LIZ = new WebResponseContentTypeModifyModel(false, null, 3, null);

    public static final class WebResponseContentTypeModifyModel {

        @C09CT("allowList")
        public final List<String> allowList;

        @C09CT("enabled")
        public final boolean enabled;

        public WebResponseContentTypeModifyModel() {
            this(false, null, 3, null);
        }

        public WebResponseContentTypeModifyModel(boolean z, List<String> list) {
            this.enabled = z;
            this.allowList = list;
        }

        public WebResponseContentTypeModifyModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
