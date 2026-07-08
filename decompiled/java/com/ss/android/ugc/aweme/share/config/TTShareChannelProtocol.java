package com.ss.android.ugc.aweme.share.config;

import X.C0M7Y;
import X.C1369610lkF;
import X.C1371600lnS;
import X.C13LP;
import X.EnumC1369700lkO;
import X.EnumC1371620lnU;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.tako.share.panel.TakoInAppOnlyChannelProtocol;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class TTShareChannelProtocol implements ShareChannelProtocol {
    public final BaseSharePackage LL;
    public final Comparator<InterfaceC1369790lkX> LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Drawable DC() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public InterfaceC1371860lns LK0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Function1<C0M7Y, Unit> UR1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Set<String> V41(List<? extends InterfaceC1369790lkX> list) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public C1369610lkF getUiConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public String jv0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public boolean oM() {
        return this instanceof TakoInAppOnlyChannelProtocol;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final void tD() {
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public List<String> Ay2() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public List<InterfaceC1369790lkX> KB0() {
        return ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJIJ(this.LL.shareContentTypes);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Comparator<InterfaceC1369790lkX> Pz0() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Boolean Vv2() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public EnumC1369700lkO tC2() {
        return EnumC1369700lkO.MIDDLE;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public EnumC1371620lnU xc0() {
        return EnumC1371620lnU.SYNC;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Boolean z72() {
        return Boolean.FALSE;
    }

    public TTShareChannelProtocol(BaseSharePackage baseSharePackage) {
        this.LL = baseSharePackage;
        this.LLILLJJLI = ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJLL(baseSharePackage, xc0());
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol, X.InterfaceC1372360log
    public final void tu(C1371600lnS c1371600lnS) {
        c1371600lnS.LIZ.addAll(KB0());
        c1371600lnS.LIZJ = tC2();
        c1371600lnS.LJ = Ay2();
        if (oM()) {
            c1371600lnS.LJIILLIIL = true;
        }
        Set<String> setV41 = V41(KB0());
        if (setV41 != null) {
            ((ArrayList) c1371600lnS.LJIILL).addAll(C13LP.LLIIJI(setV41));
        }
        String strJv0 = jv0();
        if (strJv0 != null && strJv0.length() > 0) {
            c1371600lnS.LJJJLL = strJv0;
        }
        Drawable drawableDC = DC();
        if (drawableDC != null) {
            c1371600lnS.LJJJJZI = drawableDC;
        }
        Function1<C0M7Y, Unit> function1UR1 = UR1();
        if (function1UR1 != null) {
            c1371600lnS.LJJJLZIJ = function1UR1;
        }
        Comparator<InterfaceC1369790lkX> comparatorPz0 = Pz0();
        if (comparatorPz0 != null) {
            c1371600lnS.LJFF(comparatorPz0);
        }
        Boolean boolVv2 = Vv2();
        if (boolVv2 != null) {
            c1371600lnS.LJJJZ = Boolean.valueOf(boolVv2.booleanValue());
        }
        Boolean boolZ72 = z72();
        if (boolZ72 != null) {
            c1371600lnS.LJJL = Boolean.valueOf(boolZ72.booleanValue());
        }
        EnumC1371620lnU enumC1371620lnUXc0 = xc0();
        if (enumC1371620lnUXc0 != null) {
            c1371600lnS.LIZLLL = enumC1371620lnUXc0;
        }
    }
}
