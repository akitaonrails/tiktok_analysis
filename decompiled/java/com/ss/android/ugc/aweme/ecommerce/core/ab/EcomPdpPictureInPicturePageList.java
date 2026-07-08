package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPdpPictureInPicturePageList {
    public static final PdpPictureInPictureList LIZ = new PdpPictureInPictureList(null);

    public static final class PdpPictureInPictureList {

        @C09CT("allow_list")
        public final List<String> pageList;

        public PdpPictureInPictureList() {
            this(null);
        }

        public PdpPictureInPictureList(List<String> list) {
            this.pageList = list;
        }
    }
}
