package com.ss.android.ugc.profile.business.commerce;

import X.C01GW;
import X.C0X52;
import X.C452501pT;
import X.C481000Ite;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC149400hg;
import X.InterfaceC1501170pAR;
import X.InterfaceC736910SvR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class OrderCenterGuideDialogRepository implements InterfaceC736910SvR<OrderCenterGuideDialogOperator> {
    public static final C01GW<OrderCenterGuideDialogRepository> LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(203));
    public final C481000Ite LL = new C481000Ite();

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
