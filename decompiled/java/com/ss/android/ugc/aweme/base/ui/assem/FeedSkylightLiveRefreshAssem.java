package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01D1;
import X.C01GW;
import X.C054G;
import X.C0ABI;
import X.C0ABU;
import X.C0DMM;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1569180qw8;
import X.C1572190r0z;
import X.C1572230r13;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C258550ABh;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1582650rHr;
import X.InterfaceC1585190rLx;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightLiveRefreshAssem extends AbstractC738140SxQ implements InterfaceC1585190rLx {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(71));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 84));
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 82));
    public final C736950SvV LLILZIL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 86), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(26), new AwS568S0100000_24((AbstractC738140SxQ) this, 85), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final AssemVMLazy LLILZLL;
    public long LLIZ;
    public final long LLIZLLLIL;
    public final long LLJ;
    public AnonymousClass0956 LLJI;
    public final C054G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightLiveRefreshAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public FeedSkylightLiveRefreshAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 81);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(25), null, true);
        this.LLIZLLLIL = ((long) ((Number) C258550ABh.LIZ.getValue()).intValue()) * 1000;
        this.LLJ = ((long) ((Number) C0ABI.LIZ.getValue()).intValue()) * 1000;
        this.LLJIJIL = C2296808zG.LIZ(C0PEM.LIZJ);
    }

    public final int bo() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m161do() {
        if (isEnabled() && this.LLIZ == 0) {
            this.LLIZ = System.currentTimeMillis();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void fo() {
        if (isEnabled() && this.LLIZ > 0) {
            if (System.currentTimeMillis() - this.LLIZ > this.LLIZLLLIL) {
                FeedSkylightListViewModel.OQ2((FeedSkylightListViewModel) this.LLILZIL.getValue(), EnumC1582650rHr.AUTO_REFRESH, "auto", true, null, null, 24);
            }
            this.LLIZ = 0L;
        }
        ho();
    }

    public final void ho() {
        if (!isEnabled() || this.LLIZ > 0) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = C23250099c.LIZLLL(this.LLJIJIL, null, null, new C1572190r0z(this, null), 3);
    }

    public final boolean isEnabled() {
        if (C1569180qw8.LIZ(bo())) {
            return false;
        }
        return ((Boolean) C0ABU.LIZ.getValue()).booleanValue();
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
        ((List) this.LLILLJJLI.getValue()).add(AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILZIL.getValue(), new C2217381BqS() { // from class: X.0r10
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, null, null, new AwS568S0100000_24(this, 83), null, 22, null));
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
        C1572230r13.LIZ((List) this.LLILLJJLI.getValue());
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        Hox hox;
        super.onPause();
        if (bo() == 1 && (hox = (Hox) this.LLILZ.getValue()) != null && hox.KQ2("For You")) {
            m161do();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Hox hox;
        super.onResume();
        if (bo() == 1 && (hox = (Hox) this.LLILZ.getValue()) != null && hox.KQ2("For You")) {
            fo();
        }
    }

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        if (bo() == 1) {
            Hox hox = (Hox) this.LLILZ.getValue();
            if (hox != null && hox.KQ2("For You")) {
                fo();
            } else {
                m161do();
            }
        }
    }
}
