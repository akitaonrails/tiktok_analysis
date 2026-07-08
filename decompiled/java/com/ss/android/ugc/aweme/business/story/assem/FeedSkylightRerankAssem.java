package com.ss.android.ugc.aweme.business.story.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1572090r0p;
import X.C1575790r6n;
import X.C1620910sHZ;
import X.C2217371BqR;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS110S0100000_10;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightRerankAssem extends AbstractC738140SxQ {
    public final C630740Ooa LL = C628500Oky.LIZ(new AwS568S0100000_24(this, 219));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(87));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 218));
    public final C736950SvV LLILZ = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 222), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(46), new AwS568S0100000_24((AbstractC738140SxQ) this, 221), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C1620910sHZ LLILZIL = new C1620910sHZ(this, 8);
    public final C1620910sHZ LLILZLL = new C1620910sHZ(this, 7);
    public final C1559260qg8 LLIZ = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLIZLLLIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 220));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) this.LLILZ.getValue();
        AssemViewModel.selectSubscribe$default(feedSkylightListViewModel, new C2217371BqR() { // from class: X.0r0o
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLILZLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1573030r2L) obj).LLILZLL = (C291001Au) obj2;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(feedSkylightListViewModel, 526), 12, null);
        ((List) this.LLILLJJLI.getValue()).add(AssemViewModel.selectSubscribe$default((AssemViewModel) this.LLILZ.getValue(), C1572090r0p.LL, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(new AwS603S0100000_24(this, 704), (Function1<? super C1575790r6n, Unit>) 527), 12, null));
        HomeTabAbility homeTabAbilityBo = bo();
        if (homeTabAbilityBo != null) {
            homeTabAbilityBo.ao(this.LLILZIL);
        }
        HomeTabAbility homeTabAbilityBo2 = bo();
        if (homeTabAbilityBo2 != null) {
            homeTabAbilityBo2.UC1(this.LLILZLL);
        }
    }

    public final void LJJJJLI() {
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LL.getValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility != null ? iSkylightListAbility.Wl() : null;
        if (!(viewOnAttachStateChangeListenerC20604515jvWl instanceof ViewOnAttachStateChangeListenerC20604515jv) || viewOnAttachStateChangeListenerC20604515jvWl == null) {
            return;
        }
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvWl, new ARunnableS110S0100000_10(viewOnAttachStateChangeListenerC20604515jvWl, 9));
    }

    public final HomeTabAbility bo() {
        return (HomeTabAbility) this.LLILLL.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m166do() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((List) this.LLILLJJLI.getValue()).clear();
        HomeTabAbility homeTabAbilityBo = bo();
        if (homeTabAbilityBo != null) {
            homeTabAbilityBo.tx0(this.LLILZIL);
        }
        HomeTabAbility homeTabAbilityBo2 = bo();
        if (homeTabAbilityBo2 != null) {
            homeTabAbilityBo2.Ik0(this.LLILZLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }
}
