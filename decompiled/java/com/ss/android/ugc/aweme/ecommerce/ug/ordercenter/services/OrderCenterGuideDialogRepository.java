package com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services;

import X.C01GW;
import X.C0X52;
import X.C324010Cn1;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC149400hg;
import X.InterfaceC1501170pAR;
import X.InterfaceC736910SvR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderCenterGuideDialogRepository implements InterfaceC736910SvR<OrderCenterGuideDialogOperator> {
    public static final C01GW<OrderCenterGuideDialogRepository> LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(983));
    public final C324010Cn1 LL = new C324010Cn1();

    public interface OrderCenterGuideDialogOperator extends InterfaceC149400hg {
        @InterfaceC1501170pAR("/api/v1/trade/entrance/report")
        Object getInboxEntranceInfo(@InterfaceC1485405rg ReportTradeEntranceRequest reportTradeEntranceRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
    }

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
