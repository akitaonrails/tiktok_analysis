package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomTraceInterceptor {
    public static final EcomNetworkTraceInterceptorSwitch LIZ = new EcomNetworkTraceInterceptorSwitch(null, null, 3, null);

    public static final class EcomNetworkTraceInterceptorSwitch {

        @C09CT("hosts")
        public final List<String> hosts;

        @C09CT("paths")
        public final List<String> paths;

        public EcomNetworkTraceInterceptorSwitch() {
            this(null, null, 3, null);
        }

        public EcomNetworkTraceInterceptorSwitch(List<String> list, List<String> list2) {
            this.hosts = list;
            this.paths = list2;
        }

        public EcomNetworkTraceInterceptorSwitch(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
