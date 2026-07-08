package com.ss.android.ugc.aweme.ecommerce.service;

import X.C1365705Wd;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes3.dex */
public interface ContentLinkshareReportApi {
    public static final C1365705Wd LIZ = C1365705Wd.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/creator_union/chain_collector/content_linkshare/report")
    Object reportChainKey(@InterfaceC1485405rg ContentLinkshareReportRequest contentLinkshareReportRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn);
}
