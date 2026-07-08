package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpFilterOnCacheModuleList {
    public static final EcPdpFilterOnCacheModuleList LIZ = new EcPdpFilterOnCacheModuleList();
    public static final PdpOnCacheList LIZIZ = new PdpOnCacheList(false, null, 3, null);

    public static final class PdpOnCacheList {

        @C09CT("enable_switch")
        public final boolean enable;

        @C09CT("allow_list")
        public final List<String> pageList;

        public PdpOnCacheList() {
            this(false, null, 3, null);
        }

        public PdpOnCacheList(boolean z, List<String> list) {
            this.enable = z;
            this.pageList = list;
        }

        public PdpOnCacheList(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
