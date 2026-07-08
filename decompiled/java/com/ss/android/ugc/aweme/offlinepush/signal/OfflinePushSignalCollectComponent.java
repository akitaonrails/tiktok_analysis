package com.ss.android.ugc.aweme.offlinepush.signal;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0OCC;
import X.C0RD6;
import X.C0S4J;
import X.C1564120qny;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.offlinepush.signal.OfflinePushSignalCollectComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class OfflinePushSignalCollectComponent extends BasePanelComponent {
    public final C0S4J LL = new C0S4J("OfflinePushSignal");
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public AnonymousClass0956 LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final C1564120qny LLILZLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0qny] */
    public OfflinePushSignalCollectComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 822), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 9));
        }
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 821));
        this.LLILZLL = new C0OCC() { // from class: X.0qny
            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onHide() {
                OfflinePushSignalCollectComponent offlinePushSignalCollectComponent = this.LL;
                AnonymousClass0956 anonymousClass0956 = offlinePushSignalCollectComponent.LLILZIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                offlinePushSignalCollectComponent.LLILZIL = null;
            }

            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onShow() {
                OfflinePushSignalCollectComponent offlinePushSignalCollectComponent = this.LL;
                if (offlinePushSignalCollectComponent.LLILZIL == null) {
                    C1575430r6D.LIZ.getClass();
                    int i = C1575430r6D.LIZ().strategy1BadSignalDurationSec;
                    if (i < 0) {
                        i = 0;
                    }
                    offlinePushSignalCollectComponent.LLILZIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(offlinePushSignalCollectComponent), null, null, new C1566280qrS(((long) i) * 1000, offlinePushSignalCollectComponent, null), 3);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZ = null;
        AnonymousClass0956 anonymousClass09562 = this.LLILZIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLILZIL = null;
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLILLL.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.jb1(this.LLILZLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLILLL.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.p41(this.LLILZLL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_play_failed", new AwS603S0100000_24(this, 164));
        c0rd6.LIZIZ("event_on_buffering", new AwS603S0100000_24(this, 165));
    }
}
