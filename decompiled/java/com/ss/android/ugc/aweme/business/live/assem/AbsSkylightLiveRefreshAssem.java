package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DMM;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C481790Iuv;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1585190rLx;
import X.InterfaceC1602300rnY;
import X.InterfaceC481880Iv4;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class AbsSkylightLiveRefreshAssem extends AbstractC738140SxQ implements InterfaceC1585190rLx, InterfaceC481880Iv4 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(79));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 121));
    public final C736950SvV LLILZ = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 124), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(39), new AwS568S0100000_24((AbstractC738140SxQ) this, 122), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final String LLILZIL = "fyp_skylight_refresh";
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C630740Ooa LLIZLLLIL;
    public final C01GW LLJ;

    public boolean fo() {
        throw null;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() {
        Hox hox = (Hox) this.LLIZLLLIL.getValue();
        if (hox == null || !hox.KQ2((String) this.LLIZ.getValue())) {
            return;
        }
        ((InterfaceC1602300rnY) this.LLJ.getValue()).LIZLLL(this, this.LLILZIL);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m163do() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    public AbsSkylightLiveRefreshAssem() {
        C628500Oky.LIZ(new AwS568S0100000_24(this, 119));
        this.LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 120));
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 123));
        this.LLIZLLLIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 118));
        this.LLJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(80));
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ != null) {
            homeTabAbilityLIZIZ.ao(this);
        }
        HomeTabAbility homeTabAbilityLIZIZ2 = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ2 != null) {
            homeTabAbilityLIZIZ2.UC1(this);
        }
        bo();
        ((InterfaceC1602300rnY) this.LLJ.getValue()).LJIIJJI(this.LLILZIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ != null) {
            homeTabAbilityLIZIZ.tx0(this);
        }
        HomeTabAbility homeTabAbilityLIZIZ2 = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ2 != null) {
            homeTabAbilityLIZIZ2.Ik0(this);
        }
        ((InterfaceC1602300rnY) this.LLJ.getValue()).LJIILJJIL(this, this.LLILZIL);
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
        Hox hox = (Hox) this.LLIZLLLIL.getValue();
        if (hox == null || !hox.KQ2((String) this.LLIZ.getValue())) {
            return;
        }
        ((InterfaceC1602300rnY) this.LLJ.getValue()).LJIILJJIL(this, this.LLILZIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo();
    }

    @Override // X.InterfaceC481880Iv4
    public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        Hox hox = (Hox) this.LLIZLLLIL.getValue();
        if (hox != null && hox.KQ2((String) this.LLIZ.getValue())) {
            return new C481790Iuv(fo(), false, (String) this.LLILZLL.getValue());
        }
        return new C481790Iuv(false, false, (String) this.LLILZLL.getValue());
    }

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        Hox hox = (Hox) this.LLIZLLLIL.getValue();
        if (hox != null && hox.KQ2((String) this.LLIZ.getValue())) {
            bo();
        } else {
            ((InterfaceC1602300rnY) this.LLJ.getValue()).LJIILJJIL(this, this.LLILZIL);
        }
    }
}
