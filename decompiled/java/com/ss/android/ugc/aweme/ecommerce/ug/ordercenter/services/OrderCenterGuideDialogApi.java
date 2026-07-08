package com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services;

import X.C0X52;
import X.C324020Cn2;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes5.dex */
public interface OrderCenterGuideDialogApi {
    public static final C324020Cn2 LIZ = C324020Cn2.LIZ;

    @InterfaceC1501170pAR("/api/v1/trade/entrance/report")
    Object getInboxEntranceInfo(@InterfaceC1485405rg ReportTradeEntranceRequest reportTradeEntranceRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
