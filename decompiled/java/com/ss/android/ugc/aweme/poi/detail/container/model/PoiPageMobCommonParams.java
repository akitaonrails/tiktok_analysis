package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPageMobCommonParams implements Serializable {
    public Map<String, String> btmReportParams;

    @C09CT("current_page")
    public final String currentPage;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("ttls_rd_poi_data_source")
    public String ttlsRdDataSource;

    public PoiPageMobCommonParams() {
        this(null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPageMobCommonParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", currentPage=");
        sbLIZ.append(this.currentPage);
        sbLIZ.append(", ttlsRdDataSource=");
        sbLIZ.append(this.ttlsRdDataSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBtmReportParams(Map<String, String> map) {
        this.btmReportParams = map;
    }

    public final void setTtlsRdDataSource(String str) {
        this.ttlsRdDataSource = str;
    }

    public PoiPageMobCommonParams(String str, String str2, String str3, String str4) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.currentPage = str3;
        this.ttlsRdDataSource = str4;
    }
}
