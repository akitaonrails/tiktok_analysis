package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimCountryConfig {
    public static final PoiClaimCountryModel LIZ = new PoiClaimCountryModel(null, 1643084);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(358));

    public static final class PoiClaimCountryItem {

        @C09CT("code")
        public final Integer code;

        @C09CT("country")
        public final String country;

        public PoiClaimCountryItem() {
            this(null, null);
        }

        public PoiClaimCountryItem(String str, Integer num) {
            this.country = str;
            this.code = num;
        }
    }

    public static final class PoiClaimCountryModel {

        @C09CT("country_list")
        public final List<PoiClaimCountryItem> countryList;

        /* JADX INFO: renamed from: default, reason: not valid java name */
        @C09CT("default")
        public final int f74default;

        public PoiClaimCountryModel() {
            this(null, 1643084);
        }

        public PoiClaimCountryModel(List<PoiClaimCountryItem> list, int i) {
            this.countryList = list;
            this.f74default = i;
        }
    }
}
