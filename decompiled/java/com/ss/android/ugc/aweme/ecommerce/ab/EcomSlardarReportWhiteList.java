package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C01GW;
import X.C05D3;
import X.C09CT;
import X.C452501pT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSlardarReportWhiteList {
    public static final EcomSlardarReportWhiteItem[] LIZ = new EcomSlardarReportWhiteItem[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C05D3());

    public static final class EcomSlardarReportWhiteItem {

        @C09CT("category")
        public final List<String> category;

        @C09CT("metric")
        public final List<String> metric;

        @C09CT("name")
        public final String name;

        public EcomSlardarReportWhiteItem(String str, List<String> list, List<String> list2) {
            this.name = str;
            this.metric = list;
            this.category = list2;
        }
    }
}
