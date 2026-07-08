package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C1710990ucr;
import X.C1712460ufE;
import X.C1713160ugM;
import X.C2097608Jq;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictCell extends PowerCell<C1712460ufE> implements InterfaceC20631915oL {
    public Map<String, String> LL = C2097608Jq.LJ();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dvn;
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        C1710990ucr.LIZ("CASHIER").LIZ("rd_pipo_district_select_sub_leave", this.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1712460ufE c1712460ufE = (C1712460ufE) interfaceC1891350zJl;
        super.onBindItemView(c1712460ufE);
        this.LL = c1712460ufE.LLILLJJLI;
        ((C1713160ugM) this.itemView.findViewById(R.id.t3p)).LIZ(c1712460ufE.LL, c1712460ufE.LLILZ, c1712460ufE.LLILLL);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        C1710990ucr.LIZ("CASHIER").LIZ("rd_pipo_district_select_sub_show", this.LL);
    }
}
