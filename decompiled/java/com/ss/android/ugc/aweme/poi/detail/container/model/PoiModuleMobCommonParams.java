package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiModuleMobCommonParams implements Serializable {
    public Map<String, String> btmReportParams;

    @C09CT("current_page")
    public final String currentPage;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("ttls_rd_data_source")
    public String ttlsRdDataSource;

    public PoiModuleMobCommonParams() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiModuleMobCommonParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
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

    public PoiModuleMobCommonParams(String str, String str2, String str3) {
        this.enterFrom = str;
        this.currentPage = str2;
        this.ttlsRdDataSource = str3;
    }
}
