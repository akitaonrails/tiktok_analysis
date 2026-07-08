package com.ss.android.ugc.aweme.sidebar.components;

import X.C13BV;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1580280rE2;
import X.C1580540rES;
import X.C1697810uHb;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC1580560rEU;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.RunnableC513901zN;
import android.view.View;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentProtocol;
import com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarRootComponent extends SideBarComponent<SideBarRootComponentConfig> implements ISideBarRootAbility, InterfaceC737790Swr {
    public final SideBarRootComponent LLJJIJIIJIL = this;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdw;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.ISideBarRootAbility
    public final void J11(SideBarRootComponentConfig sideBarRootComponentConfig) {
        if (sideBarRootComponentConfig != null) {
            mp().setState(new AwS603S0100000_24((InterfaceC1580560rEU) sideBarRootComponentConfig, 493));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).unbindAbility(this.LLJJIJIIJIL, ISideBarRootAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List<ISideBarComponentProtocol> listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ISideBarComponentProtocol.class, false);
        if (listLIZIZ == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        ((Map) C1580540rES.LIZ.getValue()).clear();
        for (ISideBarComponentProtocol iSideBarComponentProtocol : listLIZIZ) {
            ((Map) C1580540rES.LIZ.getValue()).put(iSideBarComponentProtocol.AP0(), iSideBarComponentProtocol.LW0());
        }
        super.onViewCreated(view);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).bindAbility(this.LLJJIJIIJIL, ISideBarRootAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.ISideBarRootAbility
    public final void WA2(Object obj, String str) {
        zp(obj, str, true);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void sp(InterfaceC1580560rEU interfaceC1580560rEU, List list) {
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        while (true) {
            Long lValueOf = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C723850SaN.LIZLLL(this, new AwS390S0200000_24(this, i, (InterfaceC1580560rEU) next, 76));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                Long l = (Long) lp("load_start_time");
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue != 0) {
                        lValueOf = Long.valueOf(System.currentTimeMillis() - jLongValue);
                    }
                }
                Integer num = (Integer) lp("is_coldlaunch");
                Integer num2 = (Integer) lp("is_first_feed_show");
                if (!C1580280rE2.LJI) {
                    C1580280rE2.LJI = true;
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC513901zN(num, num2, lValueOf, 1));
                    return;
                }
                return;
            }
        }
    }
}
