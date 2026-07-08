package com.ss.android.ugc.aweme.poi.osp.preload;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitPreloadExp {
    public static final PoiOrderSubmitPreloadConfigModel LIZ = new PoiOrderSubmitPreloadConfigModel(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(434));

    public static final class PoiOrderSubmitPreloadConfigModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("net_preload")
        public final Boolean netPreload;

        @C09CT("xml_preload")
        public final Boolean xmlPreload;

        public PoiOrderSubmitPreloadConfigModel() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public PoiOrderSubmitPreloadConfigModel(Boolean bool, Boolean bool2, Boolean bool3) {
            this.enable = bool;
            this.netPreload = bool2;
            this.xmlPreload = bool3;
        }
    }
}
