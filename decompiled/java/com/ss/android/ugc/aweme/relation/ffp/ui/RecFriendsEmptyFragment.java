package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0HTI;
import X.C1069780dwe;
import X.C12ES;
import X.C13IQ;
import X.C13LE;
import X.C14LC;
import X.C1622206Wu;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1077260e8i;
import X.ViewTreeObserverOnPreDrawListenerC1077350e8r;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsEmptyFragment extends FFPBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiHELIOSZyk1OGs5IGEBLSYKOyY2JiE/DCIjPDwKOy40JSAiPQ==";
    public final int LLIZLLLIL = R.layout.c_k;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 503));
    public final C1069780dwe LLJI = new C1069780dwe();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 500));
    public int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final String LLJJ;
    public final AssemVMLazy LLJJI;
    public ViewOnLayoutChangeListenerC1077260e8i LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecFriendsEmptyFragment.class, "recFriendsVM", "getRecFriendsVM()Lcom/ss/android/ugc/aweme/relation/ffp/vm/RecFriendsVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C786410Ut5.LJLLLLLL(0, getPowerList());
        if (getPowerList().getAllChunks().size() <= 0) {
            getPowerList().LIZJ(this.LLJI);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0e3A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1056350daz) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 27), 4);
    }

    public RecFriendsEmptyFragment() {
        AssemVMLazy assemVMLazy;
        C844470XAv.LIZ.getClass();
        C12ES.LJIIIIZZ(C844470XAv.LIZ());
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        this.LLJJ = "empty_find_friends_page";
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 501);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecFriendsVM.class);
        AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 502);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(317);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), awS560S0100000_16, aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, awS560S0100000_16, aFwS252S0000000_16, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS560S0100000_16, aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
    }

    public final C1749280vcc dS() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    public final void gS() {
        Context context = getContext();
        if (context != null) {
            C1749280vcc c1749280vccDS = dS();
            C786410Ut5.LJLLLLLL(8, c1749280vccDS);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n1;
            Drawable drawableLIZ = c0hti.LIZ(context);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJIIIIZZ = getString(2131839077);
            if (C14LC.LJIIIZ) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(106));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
            } else {
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1722300uv6.LIZLLL = iLIZIZ3;
                c1722300uv6.LJ = iLIZIZ4;
            }
            c1749280vccDS.setStatus(c1722300uv6);
        }
        this.LLJJIII = new ViewOnLayoutChangeListenerC1077260e8i(this, 5);
        dS().addOnLayoutChangeListener(this.LLJJIII);
        C786410Ut5.y3(getPowerList().getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1077350e8r(this, 1));
    }

    public final void hS() {
        if (getPowerList().getHeight() <= 0 || this.LLJILJIL <= 0) {
            return;
        }
        C844470XAv.LIZ.getClass();
        dS().setTopMargin((C12ES.LJIIIIZZ(C844470XAv.LIZ()) * 0.07f) + (this.LLJILJIL * this.LLJILJILJ) + this.LLJILLL);
        C786410Ut5.LJLLLLLL(0, dS());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i = this.LLJJIII;
        if (viewOnLayoutChangeListenerC1077260e8i != null) {
            dS().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1077260e8i);
        }
        this.LLJJIII = null;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        RecFriendsVM recFriendsVM = (RecFriendsVM) assemVMLazy.getValue();
        recFriendsVM.setState(new AwS595S0100000_16(recFriendsVM, 2));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gS();
    }
}
