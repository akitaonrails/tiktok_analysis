package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyLoadingViewOpt {
    public static final Config LIZ = new Config(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(329));

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("white_list")
        public final List<String> list;

        public Config() {
            this(false, null);
        }

        public Config(boolean z, List<String> list) {
            this.enable = z;
            this.list = list;
        }
    }
}
