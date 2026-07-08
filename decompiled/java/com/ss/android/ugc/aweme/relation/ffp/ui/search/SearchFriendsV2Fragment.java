package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0HTI;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C296060Bj2;
import X.C338490DOt;
import X.C418440Gaw;
import X.C444910HcX;
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
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS43S0100000_16;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchFriendsV2Fragment extends FFPBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiZyk1HELIOSOGs5IGEgLSQ+Kid9GyAtOyw7DjclLCE3OxN+Dz0yLygpJzs=";
    public final int LLIZLLLIL = R.layout.c_n;
    public C1749280vcc LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchFriendsV2Fragment.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/relation/ffp/ui/search/SearchFriendListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0dwn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069910dwr) obj).LLILLL;
            }
        }, C736820SvI.LIZJ(), new AwS630S0100000_16(this, 31), 4);
        C736680Sv4.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.0dwo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069890dwp) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 32), 4);
    }

    public SearchFriendsV2Fragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchFriendListVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 539);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(322);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 540), aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS560S0100000_16((Fragment) this, 541), aFwS252S0000000_16, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 542), aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 538));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 537));
    }

    public final SearchFriendListVM dS() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (SearchFriendListVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void ZR() {
        dS().setState(AFwS252S0000000_16.get$arr$(694));
    }

    public final void gS() {
        Context context = getContext();
        if (context != null) {
            C1749280vcc c1749280vcc = this.LLJ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C786410Ut5.LJLLLLLL(0, c1749280vcc);
            TuxTextView tuxTextView = (TuxTextView) c1749280vcc.findViewById(R.id.y3j);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.ng;
            Drawable drawableLIZ = c0hti.LIZ(context);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            C444910HcX c444910HcX = new C444910HcX(getString(2131839072));
            c444910HcX.LIZ(42);
            c1722300uv6.LJIIIIZZ = c444910HcX;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1749280vcc.setStatus(c1722300uv6);
            c1749280vcc.setTopMargin((float) (((double) ((Number) this.LLJILJIL.getValue()).intValue()) * 0.05d));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        this.LLJ = (C1749280vcc) view.findViewById(R.id.w28);
        C01GW c01gw = C296060Bj2.LIZ;
        if (C296060Bj2.LIZIZ) {
            gS();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJI = viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchTitleCell.class, SearchFriendCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv3;
        }
        viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS43S0100000_16(this, 2));
    }
}
