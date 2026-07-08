package com.ss.android.ugc.aweme.minis.page.main.functions.session;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2195221Avo;
import X.C359501aT;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC359601aU;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisSessionMaintainAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, InterfaceC1146704e9 {
    public String LL;

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
        String str = this.LL;
        this.LL = str;
        C2195221Avo.LJIIIIZZ = str;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
        String str = this.LL;
        if (str != null) {
            C01GW c01gw = C359501aT.LIZ;
            InterfaceC359601aU interfaceC359601aU = (InterfaceC359601aU) ((Map) c01gw.getValue()).get(str);
            if (interfaceC359601aU != null) {
                interfaceC359601aU.clearCache();
            }
            ((Map) c01gw.getValue()).remove(str);
        }
        this.LL = null;
        C2195221Avo.LJIIIIZZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
        String string = UUID.randomUUID().toString();
        this.LL = string;
        C2195221Avo.LJIIIIZZ = string;
    }
}
