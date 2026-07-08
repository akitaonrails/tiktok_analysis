package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class ShouldDropLoadFinishInTypeExt {
    public static final DropTypeModel LIZ = new DropTypeModel(false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(302));

    public static final class DropTypeModel {

        @C09CT("online")
        public final boolean online;

        @C09CT("shopify")
        public final boolean shopify;

        @C09CT("ttclid")
        public final boolean ttclid;

        @C09CT("ttnet")
        public final boolean ttnet;

        public DropTypeModel() {
            this(false, false, false, false);
        }

        public DropTypeModel(boolean z, boolean z2, boolean z3, boolean z4) {
            this.ttclid = z;
            this.ttnet = z2;
            this.shopify = z3;
            this.online = z4;
        }
    }
}
