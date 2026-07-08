package com.ss.android.ugc.aweme.cache;

import X.C01GW;
import X.C01NK;
import X.C1513040pTa;
import X.C1588740rRg;
import X.C1BCA;
import X.C23250099c;
import X.C452501pT;
import X.C607610NsN;
import X.C607830Nsj;
import X.EnumC312610CNf;
import X.EnumC452301pR;
import X.InterfaceC1006670cIr;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.cache.FollowingRedDotJankFixExp;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingFeedAssem extends BaseMainContainerAssem {
    public final C01GW LL = C452501pT.LIZ(EnumC452301pR.NONE, new C1513040pTa(this));
    public final C1588740rRg LLILLJJLI = new C1588740rRg(this);

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C607610NsN.LIZ.getClass();
        C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C01NK(null), 3);
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, (InterfaceC1006670cIr) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, (InterfaceC1006670cIr) this.LL.getValue());
        if (!((FollowingRedDotJankFixExp.Config) FollowingRedDotJankFixExp.LIZIZ.getValue()).enable) {
            C607830Nsj.LIZ.LIZ();
        }
    }
}
