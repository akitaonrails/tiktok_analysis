package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcAddressEditFixConfig {
    public static final Config LIZ = new Config(true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(158));

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final class Config {

        @C09CT("enable_geo_associated_validation")
        public boolean enableGeoAssociatedValidation;

        @C09CT("enable_region_search_edit_fix")
        public boolean enableRegionSearchEditFix;

        @C09CT("eu_new_country_launch")
        public boolean euNewCountryLaunch;

        public Config() {
            this(true, true, true);
        }

        public Config(boolean z, boolean z2, boolean z3) {
            this.enableGeoAssociatedValidation = z;
            this.enableRegionSearchEditFix = z2;
            this.euNewCountryLaunch = z3;
        }
    }
}
