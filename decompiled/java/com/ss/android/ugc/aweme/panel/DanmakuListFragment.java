package com.ss.android.ugc.aweme.panel;

import X.AbstractC329610Cw3;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0XPD;
import X.C0XQ7;
import X.C0ZP4;
import X.C1158140gFA;
import X.C1164280gP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1361150lWb;
import X.C1383850m7D;
import X.C1383870m7F;
import X.C1384030m7V;
import X.C1384300m7w;
import X.C13LE;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C338490DOt;
import X.C418440Gaw;
import X.C419910GdJ;
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
import X.EnumC1361130lWZ;
import X.EnumC255700yp;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1384020m7U;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC849390XTt;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.DanmakuListViewModel;
import com.ss.android.ugc.aweme.panel.DanmakuListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuListFragment extends Fragment implements InterfaceC1058150ddt, InterfaceC724530SbT, InterfaceC1384020m7U {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSUtJyo/ZgEtJyIyIzAAIDwnDjctLiI2JjE=";
    public TuxNavBar LL;
    public C1749280vcc LLILLJJLI;
    public View LLILLL;
    public final AssemVMLazy LLILZ;
    public Aweme LLILZIL;
    public String LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/model/DanmakuListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public DanmakuListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuListViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 736);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(208);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 737), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 738), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 739), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
        this.LLILZLL = "";
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 734));
    }

    public final C1722300uv6 MR() {
        String string;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_danmu;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        Context context = getContext();
        if (context == null || (string = context.getString(2131838776)) == null) {
            string = "";
        }
        c1722300uv6.LJIIIIZZ = string;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        return c1722300uv6;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv OR() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZ.getValue();
    }

    public final TuxNavBar PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C1749280vcc RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLJJLI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final DanmakuListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (DanmakuListViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1384020m7U
    public final void eL0(C1158140gFA c1158140gFA) {
        if (c1158140gFA == null) {
            return;
        }
        DanmakuListViewModel danmakuListViewModelSR = SR();
        C1384300m7w c1384300m7w = c1158140gFA.LL;
        C1383850m7D c1383850m7D = danmakuListViewModelSR.LLILZIL;
        if (c1383850m7D != null) {
            c1383850m7D.LIZ(c1384300m7w);
        }
        danmakuListViewModelSR.xQ2(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String aid;
        super.onSaveInstanceState(bundle);
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C786410Ut5.LJJJI("aid", aid, bundle);
        C786410Ut5.LJJJI("enterFrom", this.LLILZLL, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Aweme awemeLLILZ;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            String string = bundle.getString("enterFrom");
            if (string != null) {
                this.LLILZLL = string;
            }
            String string2 = bundle.getString("aid");
            if (string2 != null && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(string2)) != null) {
                this.LLILZIL = awemeLLILZ;
            }
            SR().wQ2(this.LLILZIL, this.LLILZLL);
        }
    }

    public final void NR(C1384300m7w c1384300m7w, View view) {
        C1384030m7V c1384030m7V;
        if (c1384300m7w == null) {
            return;
        }
        c1384300m7w.LJJI = !c1384300m7w.LJJI;
        if ((view instanceof C1384030m7V) && (c1384030m7V = (C1384030m7V) view) != null) {
            c1384030m7V.LIZ();
        }
        if (c1384300m7w.LJJI) {
            c1384300m7w.LJIIL++;
            if (SR().LLILLL != null) {
                C1383870m7F.LIZ(c1384300m7w);
            }
        } else {
            long j = c1384300m7w.LJIIL;
            if (j > 0) {
                c1384300m7w.LJIIL = j - 1;
            }
            if (SR().LLILLL != null) {
                C1383870m7F.LIZ(c1384300m7w);
            }
        }
        C1440005kM.LIZ(new C1164280gP4(c1384300m7w));
        C1361150lWb c1361150lWb = C1361150lWb.LIZ;
        Aweme aweme = this.LLILZIL;
        String str = this.LLILZLL;
        String str2 = c1384300m7w.LJIIJJI;
        if (str2 == null) {
            str2 = "";
        }
        boolean zLJFF = Intrinsics.LJFF(c1384300m7w.LJIIZILJ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        boolean z = c1384300m7w.LJJI;
        String value = EnumC1361130lWZ.DANMAKU_LIST.getValue();
        EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
        c1361150lWb.getClass();
        C1361150lWb.LIZ(aweme, str, str2, zLJFF, z, value, enumC255700yp);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    @Override // X.InterfaceC1384020m7U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RO0(X.C1158140gFA r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.panel.DanmakuListFragment.RO0(X.0gFA, android.view.View):void");
    }

    @Override // X.InterfaceC1384020m7U
    public final void bt2(final C1158140gFA c1158140gFA, final View view) {
        C1384300m7w c1384300m7w = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(getActivity(), this.LLILZLL, "like_danmaku", null, new InterfaceC849390XTt() { // from class: X.0m79
                @Override // X.InterfaceC849390XTt
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    DanmakuListFragment danmakuListFragment = this;
                    C1158140gFA c1158140gFA2 = c1158140gFA;
                    danmakuListFragment.NR(c1158140gFA2 != null ? c1158140gFA2.LL : null, view);
                }
            });
            return;
        }
        if (c1158140gFA != null) {
            c1384300m7w = c1158140gFA.LL;
        }
        NR(c1384300m7w, view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR().wQ2(this.LLILZIL, this.LLILZLL);
        TuxNavBar tuxNavBarPR = PR();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = view.getContext().getString(2131838777, 0);
        c1250250idj.LIZIZ = "title";
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS565S0100000_21(this, 735));
        c0om1.LIZIZ(c1251150ifB);
        tuxNavBarPR.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, view.getContext());
        if (numLIZJ != null) {
            PR().setNavBackground(numLIZJ.intValue());
        }
        RR().LJ();
        final DanmakuListViewModel danmakuListViewModelSR = SR();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOR = OR();
        if (viewOnAttachStateChangeListenerC20604515jvOR != null) {
            danmakuListViewModelSR.setListState(viewOnAttachStateChangeListenerC20604515jvOR.getState());
            viewOnAttachStateChangeListenerC20604515jvOR.LJIIL((AbstractC329610Cw3) new C2217401BqU(danmakuListViewModelSR) { // from class: X.0m76
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        SR().manualListRefresh();
        AssemViewModel.asyncSubscribe$default(SR(), new C2217381BqS() { // from class: X.0m77
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1383820m7A c1383820m7A = (C1383820m7A) obj;
                c1383820m7A.getClass();
                return C627260Oiy.LIZLLL(c1383820m7A);
            }
        }, null, new AwS600S0100000_21(this, 161), null, new AwS600S0100000_21(this, 162), 10, null);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217371BqR() { // from class: X.0m78
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1383820m7A) obj).LLILLJJLI);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1383820m7A) obj).LLILLJJLI = ((Number) obj2).longValue();
            }
        }, C736820SvI.LIZLLL(), new AwS456S0200000_21(this, view, 9), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bj6, viewGroup, false);
        this.LLILLL = viewTd;
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
