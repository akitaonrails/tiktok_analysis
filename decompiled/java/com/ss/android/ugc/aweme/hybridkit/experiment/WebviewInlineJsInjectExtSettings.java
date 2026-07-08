package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WebviewInlineJsInjectExtSettings {
    public static final WebviewInlineJsInjectExtModel LIZ = new WebviewInlineJsInjectExtModel(false, null, null, 7, null);

    public static final class WebviewInlineJsInjectExtModel {

        @C09CT("denyList")
        public final List<String> denyList;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("ttnetDenyList")
        public final List<String> ttnetDenylist;

        public WebviewInlineJsInjectExtModel() {
            this(false, null, null, 7, null);
        }

        public WebviewInlineJsInjectExtModel(boolean z, List<String> list, List<String> list2) {
            this.enable = z;
            this.denyList = list;
            this.ttnetDenylist = list2;
        }

        public WebviewInlineJsInjectExtModel(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
