package com.ss.android.ugc.aweme.assem;

import X.C01GW;
import X.C0S78;
import X.C0XE1;
import X.C1150504el;
import X.C1911640zqU;
import X.C1911730zqd;
import X.C1911750zqf;
import X.C19221710Hv;
import X.C201955140j;
import X.C201962140q;
import X.C2203431BLp;
import X.C452501pT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class TikTokToolsAssem extends BaseMainContainerAssem {
    public final C01GW LL = C452501pT.LIZIZ(new C1911750zqf(this));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"TikTokToolsAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C0S78.LJFF(true, new C19221710Hv(this));
        C1150504el.LIZ().LJI(strJ4, false);
    }

    public final void bo() {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
            C201955140j.LJIILL(C201962140q.LIZIZ, "ws", "try connect ws");
            c2203431BLp.LJ("remove_copyright_music");
        }
        c2203431BLp.LJI(20216, 1, (C1911730zqd) this.LL.getValue());
        c2203431BLp.LJI(20173, 1, (C1911730zqd) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2203431BLp.LIZIZ.LJIIIZ((C1911730zqd) this.LL.getValue());
        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
        C1911640zqU.LJIILIIL();
    }
}
