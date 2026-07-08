package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomRegionSelectSearchBarConfig {
    public static final EcomRegionSelectSearchBarConfigModel LIZ = new EcomRegionSelectSearchBarConfigModel(Boolean.FALSE, 2, 0);

    public static final class EcomRegionSelectSearchBarConfigModel {

        @C09CT("enable_search_bar")
        public final Boolean enableSearchBar;

        @C09CT("get_district_type_for_list")
        public final Integer getDistrictTypeForList;

        @C09CT("get_district_type_for_search")
        public final Integer getDistrictTypeForSearch;

        public EcomRegionSelectSearchBarConfigModel() {
            this(Boolean.FALSE, 2, 0);
        }

        public EcomRegionSelectSearchBarConfigModel(Boolean bool, Integer num, Integer num2) {
            this.enableSearchBar = bool;
            this.getDistrictTypeForSearch = num;
            this.getDistrictTypeForList = num2;
        }
    }

    public static final EcomRegionSelectSearchBarConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel = LIZ;
        EcomRegionSelectSearchBarConfigModel ecomRegionSelectSearchBarConfigModel2 = (EcomRegionSelectSearchBarConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_region_select_search_bar_config", EcomRegionSelectSearchBarConfigModel.class, ecomRegionSelectSearchBarConfigModel);
        return ecomRegionSelectSearchBarConfigModel2 != null ? ecomRegionSelectSearchBarConfigModel2 : ecomRegionSelectSearchBarConfigModel;
    }
}
