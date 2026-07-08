package com.ss.android.ugc.aweme.pipo.cashier.refund;

import com.ss.android.ugc.aweme.pipo.cashier.IPIPORefundCashierService;
import com.ss.android.ugc.aweme.pipo.cashier.refund.lynx.LynxRefundCashierShadowNode;
import com.ss.android.ugc.aweme.pipo.cashier.refund.lynx.LynxRefundCashierView;
import j27.s;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPORefundCashierServiceImpl implements IPIPORefundCashierService {
    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPORefundCashierService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPORefundCashierService
    public final LynxRefundCashierShadowNode LJIILJJIL() {
        return new LynxRefundCashierShadowNode();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.IPIPORefundCashierService
    public final LynxRefundCashierView LJIILL(s sVar) {
        return new LynxRefundCashierView(sVar);
    }
}
