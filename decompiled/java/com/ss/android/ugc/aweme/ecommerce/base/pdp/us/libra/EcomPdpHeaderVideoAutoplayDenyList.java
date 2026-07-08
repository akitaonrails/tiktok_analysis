package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPdpHeaderVideoAutoplayDenyList {
    public static final PdpAddVideosToHeaderImageDenyList LIZ;

    static {
        new EcomPdpHeaderVideoAutoplayDenyList();
        LIZ = new PdpAddVideosToHeaderImageDenyList(null);
    }

    public static final class PdpAddVideosToHeaderImageDenyList {

        @C09CT("deny_list")
        public final Set<String> denyList;

        public PdpAddVideosToHeaderImageDenyList() {
            this(null);
        }

        public PdpAddVideosToHeaderImageDenyList(Set<String> set) {
            this.denyList = set;
        }
    }
}
