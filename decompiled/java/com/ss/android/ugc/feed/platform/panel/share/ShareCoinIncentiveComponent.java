package com.ss.android.ugc.feed.platform.panel.share;

import X.C01GW;
import X.C0PEM;
import X.C0RD6;
import X.C1566140qrE;
import X.C2296808zG;
import X.C23250099c;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C733620Sq8;
import X.C733630Sq9;
import X.C733910Sqb;
import X.C733930Sqd;
import X.C733950Sqf;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ShareCoinIncentiveComponent extends BasePanelComponent {
    public final C01GW LL;
    public final int LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public ShareCoinIncentiveComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS555S0100000_11((InterfaceC1565950qqv) this, 1303), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C733910Sqb(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = 38;
        this.LLILLL = C452501pT.LIZIZ(new C733930Sqd(this));
        this.LLILZ = C452501pT.LIZIZ(new C733950Sqf(this));
    }

    public final void bo(int i) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C733630Sq9(this, i, null), 3);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new C733620Sq8(this));
    }
}
