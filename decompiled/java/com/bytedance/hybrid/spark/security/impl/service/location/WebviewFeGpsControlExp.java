package com.bytedance.hybrid.spark.security.impl.service.location;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WebviewFeGpsControlExp {
    public static final WebviewFeGpsControlModel LIZ = new WebviewFeGpsControlModel(false, null);

    public static final class WebviewFeGpsControlModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enableDfids")
        public final List<Integer> enableDfids;

        public WebviewFeGpsControlModel() {
            this(false, null, 3, null);
        }

        public WebviewFeGpsControlModel(boolean z, List<Integer> list) {
            this.enable = z;
            this.enableDfids = list;
        }

        public WebviewFeGpsControlModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
