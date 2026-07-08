package com.ss.android.ugc.aweme.share.config;

import X.C1370200llC;
import X.C1371600lnS;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import X.InterfaceC1370310llN;
import X.InterfaceC1371910lnx;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareConfiguration$getSheetActionProtocol$1;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TTSheetActionProtocol implements SheetActionProtocol {
    public final BaseSharePackage LL;

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public boolean getHideShareItems() {
        return this instanceof QrCodeShareConfiguration$getSheetActionProtocol$1;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public C1370200llC getUiConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public InterfaceC1371910lnx hF0() {
        return null;
    }

    public final Comparator<InterfaceC1370310llN> LIZ() {
        String string = this.LL.extras.getString("panel_source");
        if (string == null) {
            string = "share_panel";
        }
        return ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJLJ(string);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public EnumC1369720lkQ O12() {
        return EnumC1369720lkQ.HORIZONTAL;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public EnumC1369700lkO P82() {
        return EnumC1369700lkO.TOP;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public EnumC1369700lkO zT0() {
        return EnumC1369700lkO.BOTTOM;
    }

    public TTSheetActionProtocol(BaseSharePackage baseSharePackage) {
        this.LL = baseSharePackage;
    }

    @Override // X.InterfaceC1372360log
    public final void tu(C1371600lnS c1371600lnS) {
        BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
        if (baseSharePackage != null) {
            c1371600lnS.LJFF.addAll(uO1(baseSharePackage));
        }
        c1371600lnS.LJJJJI = getHideShareItems();
        Comparator<InterfaceC1370310llN> comparatorLIZ = LIZ();
        if (comparatorLIZ != null) {
            c1371600lnS.LIZ(comparatorLIZ);
        }
        c1371600lnS.LJIIIIZZ = O12();
        c1371600lnS.LJIIIZ = P82();
        c1371600lnS.LJIIJ = zT0();
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage) {
        return new ArrayList();
    }
}
