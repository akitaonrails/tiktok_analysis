package com.ss.android.ugc.feed.platform.panel.signalcollect;

import X.C01GW;
import X.C0RD6;
import X.C1559660qgm;
import X.C1563470qmv;
import X.C1566140qrE;
import X.C1603950rqD;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class EcomSignalCollectComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new C1563470qmv(this));
    public final C01GW LLILLJJLI;

    public EcomSignalCollectComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1571), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559660qgm(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_play_pause", new C1603950rqD(this));
    }
}
