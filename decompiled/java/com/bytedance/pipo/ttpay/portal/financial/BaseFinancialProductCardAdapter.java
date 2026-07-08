package com.bytedance.pipo.ttpay.portal.financial;

import X.AbstractC1720900usq;
import X.C1720760usc;
import X.InterfaceC1720550usH;
import X.InterfaceC1720620usO;
import X.InterfaceC1720700usW;
import android.view.View;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.ttpay.model.FinancialProductDO;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BaseFinancialProductCardAdapter<D extends InterfaceC1720620usO> extends StellarCardAdapter<D> {
    public abstract AbstractC1720900usq V5();

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return V5().LJ();
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void N5(View view, InterfaceC1720550usH interfaceC1720550usH) {
        C1720760usc c1720760uscKa1;
        FinancialProductDO data = ((InterfaceC1720620usO) interfaceC1720550usH).getData();
        if (data != null) {
            AbstractC1720900usq abstractC1720900usqV5 = V5();
            InterfaceC1720700usW interfaceC1720700usWR5 = R5();
            if (interfaceC1720700usWR5 != null) {
                c1720760uscKa1 = interfaceC1720700usWR5.Ka1();
            } else {
                c1720760uscKa1 = null;
            }
            abstractC1720900usqV5.LL = c1720760uscKa1;
            abstractC1720900usqV5.LJFF(view, data, null);
        }
    }
}
