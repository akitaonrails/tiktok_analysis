package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPdpSVFullScreenPageList {
    public static final PdpSVFullScreenList LIZ = new PdpSVFullScreenList(null);

    public static final class PdpSVFullScreenList {

        @C09CT("allow_list")
        public final List<String> pageList;

        public PdpSVFullScreenList() {
            this(null);
        }

        public PdpSVFullScreenList(List<String> list) {
            this.pageList = list;
        }
    }
}
