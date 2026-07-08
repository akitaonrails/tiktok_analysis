package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1572230r13;
import X.C1572270r17;
import X.C1620910sHZ;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1595940rdI;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS93S0200000_24;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxToFollowGuideAssem extends AbstractC738140SxQ {
    public boolean LLILLJJLI;
    public boolean LL = true;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 136));
    public final C736950SvV LLILZIL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 138), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(43), new AwS568S0100000_24((AbstractC738140SxQ) this, 139), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(82));
    public final C630740Ooa LLIZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 134));
    public final C630740Ooa LLIZLLLIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 137));
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 135));
    public final C630740Ooa LLJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 133));
    public final C1620910sHZ LLJIJIL = new C1620910sHZ(this, 4);
    public final C1620910sHZ LLJILJIL = new C1620910sHZ(this, 3);

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLIZ.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao(this.LLJIJIL);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLIZ.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.UC1(this.LLJILJIL);
        }
        ((List) this.LLILZLL.getValue()).add(AssemViewModel.asyncSubscribe$default(this.LLILZIL.getValue(), new C2217381BqS() { // from class: X.0r0y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, this, null, new AwS603S0100000_24(this, 595), null, new AwS603S0100000_24(this, 596), 20, null));
    }

    public final void bo() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl2;
        if (!this.LL) {
            ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLIZLLLIL.getValue();
            if (iSkylightListAbility == null || (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) == null) {
                return;
            }
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jvWl, new ARunnableS93S0200000_24(this, viewOnAttachStateChangeListenerC20604515jvWl, 55), 0L);
            return;
        }
        this.LL = false;
        ISkylightListAbility iSkylightListAbility2 = (ISkylightListAbility) this.LLIZLLLIL.getValue();
        if (iSkylightListAbility2 == null || (viewOnAttachStateChangeListenerC20604515jvWl2 = iSkylightListAbility2.Wl()) == null) {
            return;
        }
        HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jvWl2, new ARunnableS93S0200000_24(this, viewOnAttachStateChangeListenerC20604515jvWl2, 57), 0L);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C1572270r17 m165do() {
        return (C1572270r17) this.LLJI.getValue();
    }

    public final void fo() {
        ISkylightListAbility iSkylightListAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        InterfaceC1891350zJl next;
        List<FollowingInterestUser> listLLJJJ;
        TuxTextView tuxTextView;
        LinearLayout linearLayout;
        InterfaceC1595940rdI interfaceC1595940rdI;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (iSkylightListAbility = (ISkylightListAbility) this.LLIZLLLIL.getValue()) == null || (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) == null || !this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = false;
        C614770O9j.LIZIZ.LJ().LJIILL(fragmentLJI, true, "unknown", 2, false, false, null);
        Iterator<InterfaceC1891350zJl> it2 = viewOnAttachStateChangeListenerC20604515jvWl.getListItems().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!(next instanceof InterfaceC1595940rdI));
        if (!(next instanceof InterfaceC1595940rdI) || (interfaceC1595940rdI = (InterfaceC1595940rdI) next) == null || (listLLJJJ = interfaceC1595940rdI.LLJJJ()) == null) {
            listLLJJJ = C13BV.INSTANCE;
        }
        C20684815ws.LJIILLIIL("livesdk_followtab_guide_show", C2097908Jt.LIZJ(new Pair("is_live", listLLJJJ.isEmpty() ^ true ? "1" : CardStruct.IStatusCode.DEFAULT)));
        if (!listLLJJJ.isEmpty()) {
            C1572270r17 c1572270r17M165do = m165do();
            if (c1572270r17M165do != null && (linearLayout = c1572270r17M165do.LJI) != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        } else {
            C1572270r17 c1572270r17M165do2 = m165do();
            if (c1572270r17M165do2 != null && (tuxTextView = c1572270r17M165do2.LJIIIIZZ) != null) {
                tuxTextView.setText(2131843174);
            }
        }
        C1572270r17 c1572270r17M165do3 = m165do();
        if (c1572270r17M165do3 != null) {
            c1572270r17M165do3.LIZIZ(2600L);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLIZ.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.tx0(this.LLJIJIL);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLIZ.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.Ik0(this.LLJILJIL);
        }
        C1572230r13.LIZ((List) this.LLILZLL.getValue());
    }
}
