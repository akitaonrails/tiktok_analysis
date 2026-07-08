package com.ss.android.ugc.profile.business.commerce;

import X.C0X52;
import X.C481010Itf;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes8.dex */
public interface OrderCenterGuideDialogApi {
    public static final C481010Itf LIZ = C481010Itf.LIZ;

    @InterfaceC1501170pAR("/api/v1/trade/entrance/report")
    Object getInboxEntranceInfo(@InterfaceC1485405rg ReportTradeEntranceRequest reportTradeEntranceRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
