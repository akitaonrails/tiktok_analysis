package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationDynamicSettings {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(357));
    public static final DynamicSetting LIZIZ = new DynamicSetting(null, null, null);

    public static final class DynamicSetting {

        @C09CT("location_permission_click_outside_to_cancel")
        public final Integer locationPermissionClickOutsideToCancel;

        @C09CT("publish_page_poi_show_count")
        public final Integer publishPagePoiShowCount;

        @C09CT("refine_searchplace_api_cost_time")
        public final Integer refineSearchPlaceApiCostTime;

        public DynamicSetting() {
            this(null, null, null);
        }

        public DynamicSetting(Integer num, Integer num2, Integer num3) {
            this.locationPermissionClickOutsideToCancel = num;
            this.publishPagePoiShowCount = num2;
            this.refineSearchPlaceApiCostTime = num3;
        }
    }
}
