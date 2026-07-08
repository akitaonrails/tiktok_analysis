package com.ss.android.ugc.aweme.share.config;

import X.C1362230lYL;
import X.C1371600lnS;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import X.InterfaceC1364520lc2;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareConfiguration$getCustomSharePanelBar$1;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class TTCustomSharePanelBarProtocol implements CustomSharePanelBarProtocol {
    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public InterfaceC1364520lc2 Ca2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public boolean PK1() {
        return this instanceof QrCodeShareConfiguration$getCustomSharePanelBar$1;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public C1362230lYL zA1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public EnumC1369720lkQ FM() {
        return EnumC1369720lkQ.HORIZONTAL;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public EnumC1369720lkQ Mq1() {
        return EnumC1369720lkQ.VERTICAL;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public EnumC1369700lkO nz() {
        return EnumC1369700lkO.BOTTOM;
    }

    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public EnumC1369700lkO sG() {
        return EnumC1369700lkO.TOP;
    }

    @Override // X.InterfaceC1372360log
    public final void tu(C1371600lnS c1371600lnS) {
        c1371600lnS.LJJIIJZLJL = !PK1();
        c1371600lnS.LJIIJJI = Mq1();
        c1371600lnS.LJIIL = FM();
        c1371600lnS.LJIILIIL = nz();
        c1371600lnS.LJIILJJIL = sG();
    }
}
