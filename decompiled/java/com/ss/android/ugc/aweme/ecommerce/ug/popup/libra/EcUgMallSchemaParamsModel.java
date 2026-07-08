package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgMallSchemaParamsModel {

    @C09CT("equal_landing_page_host")
    public final String equalLandingPageHost;

    @C09CT("equal_landing_page_path")
    public final String equalLandingPagePath;

    @C09CT("equal_landing_page_query")
    public final List<EcUgMallSchemaParamsQueryModel> equalLandingPageQuery;

    @C09CT("operate_params_from_mall")
    public final List<EcUgMallSchemaParamsOperateModel> operateParamsFromMall;

    public EcUgMallSchemaParamsModel() {
        this(null, null, null, null);
    }

    public EcUgMallSchemaParamsModel(String str, String str2, List<EcUgMallSchemaParamsQueryModel> list, List<EcUgMallSchemaParamsOperateModel> list2) {
        this.equalLandingPageHost = str;
        this.equalLandingPagePath = str2;
        this.equalLandingPageQuery = list;
        this.operateParamsFromMall = list2;
    }
}
