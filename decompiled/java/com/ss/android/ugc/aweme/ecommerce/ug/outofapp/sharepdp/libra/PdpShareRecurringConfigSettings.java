package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.sharepdp.libra;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpShareRecurringConfigSettings {
    public static final PdpShareRecurringConfigModel LIZ = new PdpShareRecurringConfigModel(0, 0, null, null, null);

    public static final class PdpShareRecurringConfigModel {

        @C09CT("enable_open_graph")
        public final Integer enableOpenGraph;

        @C09CT("enable_shop_tab_popup")
        public final Integer enableShopTabPopup;

        @C09CT("shop_tab_schema")
        public final String shopTabSchema;

        @C09CT("shop_tab_schema_for_search")
        public final String shopTabSchemaForSearch;

        @C09CT("trackParams")
        public final n trackParams;

        public PdpShareRecurringConfigModel() {
            this(0, 0, null, null, null);
        }

        public PdpShareRecurringConfigModel(Integer num, Integer num2, String str, String str2, n nVar) {
            this.enableOpenGraph = num;
            this.enableShopTabPopup = num2;
            this.shopTabSchema = str;
            this.shopTabSchemaForSearch = str2;
            this.trackParams = nVar;
        }
    }
}
