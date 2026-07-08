package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.landingpage.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0Q88;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1295950jpR;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C1839007Ie;
import X.C1860130yVP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C21419418s4;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C294780Bgy;
import X.C338490DOt;
import X.C341990Dav;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C661350Pwr;
import X.C682290QpX;
import X.C684280Qsk;
import X.C689240R1u;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC328600CuQ;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.landingpage.ui.SearchSimpleLandingPageFragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.landingpage.vm.SearchTextLandingPageContentViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public class SearchSimpleLandingPageFragment extends Fragment implements C0Q88, InterfaceC724530SbT {
    public static final C682290QpX LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String LLJILJILJ;
    public static final String LLJILLL;
    public static final int LLJJ;
    public static final int LLJJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGstOyw7ZjN+Zz8hJzEjKiA/ZiYtOyt9KyohOSHELIOSA9LSs4OmEnJzV9ZyMyJiElJygjKSIpZzo6ZhYpKD0wIBYlJD8/LQktJys6JiIcKCg2DjctLiI2JjE=";
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(151));
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public View LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public C684280Qsk LLJI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QpX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchSimpleLandingPageFragment.class, "textLandingPageContentVM", "getTextLandingPageContentVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/top1/landingpage/vm/SearchTextLandingPageContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0QpX
        };
        LLJILJILJ = "text";
        LLJILLL = "title";
        LLJJ = 1;
        LLJJI = 2;
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

    public SearchSimpleLandingPageFragment() {
        AssemVMLazy assemVMLazy;
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchTextLandingPageContentViewModel.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 267);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(168);
        if (Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 268), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760SbqLJJJIL instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760SbqLJJJIL, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 269), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 270), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 264));
        this.LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 265));
        this.LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 271));
        this.LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 272));
        this.LLJ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 17));
    }

    public final C1295950jpR MR() {
        return (C1295950jpR) this.LLJ.getValue();
    }

    public final SearchTextLandingPageContentViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SearchTextLandingPageContentViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0Q88
    public final void onBackPressed() {
        Fragment fragmentLJJJJZI;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG activity = getActivity();
        sAFHelper.getClass();
        FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(this, activity);
        if (fragmentManagerLJIILJJIL != null && (fragmentLJJJJZI = fragmentManagerLJIILJJIL.LJJJJZI("container")) != null) {
            C19EH c19ehLJIIJ = fragmentManagerLJIILJJIL.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            Context context = getContext();
            if (context == null || !C426750GoL.LIZLLL(context)) {
                c19ehLJIIJ.LJIJJ(R.anim.fm, R.anim.fp);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.fn, R.anim.fo);
            }
            c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI);
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, Lifecycle.State.RESUMED);
            c19ehLJIIJ.LJIIJ();
        }
        if (!SAFHelper.LJIIL()) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity2, ImmersionBar.LJIILJJIL(activity2));
                tuxImmersionBar.LJIIIIZZ(R.attr.uk);
                tuxImmersionBar.LIZLLL();
                return;
            }
            return;
        }
        Context context2 = getContext();
        ComponentCallbacks2 componentCallbacks2LJFF = context2 != null ? SAFExtensionKt.LJFF(context2) : null;
        if (C294780Bgy.LIZ()) {
            if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                return;
            }
        } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
            return;
        }
        Fragment parentFragment = this;
        while (!(parentFragment instanceof InterfaceC214902198i)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                return;
            }
        }
        Object obj = (InterfaceC214902198i) parentFragment;
        if (obj != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL((Fragment) obj);
            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.uk);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Function1<? super Integer, Unit> function1 = NR().LLILLL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(LLJJ));
        }
        C1295950jpR c1295950jpRMR = MR();
        c1295950jpRMR.stop();
        c1295950jpRMR.LIZLLL();
        c1295950jpRMR.setCallback(null);
        this.LLJI = null;
        super.onDestroy();
    }

    public final void OR(String str) {
        final C1860130yVP c1860130yVP = (C1860130yVP) this.LLILZLL.getValue();
        if (c1860130yVP != null) {
            C341990Dav.LIZ(c1860130yVP, c1860130yVP.getContext(), 0, 0, null, 14);
            C689240R1u c689240R1u = C689240R1u.LIZ;
            Context context = c1860130yVP.getContext();
            c689240R1u.getClass();
            C341990Dav.LIZLLL(c1860130yVP, str, C689240R1u.LIZ(c689240R1u, C21419418s4.LIZ(C689240R1u.LJ(context, null), null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), false, false, 0, false, null, null, C1839007Ie.LIZ(), null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -134217729, 16777207), true, null, false, null, 14), new InterfaceC328600CuQ() { // from class: X.0Qsg
                @Override // X.InterfaceC328600CuQ
                public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                }

                @Override // X.InterfaceC328600CuQ
                public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                    InterfaceC1631630sYr<? super Integer, ? super CharSequence, ? super Map<String, ? extends Object>, ? super Context, Unit> interfaceC1631630sYr;
                    Context context2 = c1860130yVP.getContext();
                    if (context2 != null && (interfaceC1631630sYr = this.NR().LL) != null) {
                        interfaceC1631630sYr.invoke(1001, charSequence, null, context2);
                    }
                }
            }, null, null, null, null, null, null, false, new AwS589S0100000_10(this, 135), null, 3064);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        C2211631BhB.LJ(view, new AwS376S0200000_10(view, this, 154));
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.ubn);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS554S0100000_10(this, 266));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        }
        Bundle arguments = getArguments();
        Object c098200Yq = null;
        if (arguments == null || (string = arguments.getString(LLJILJILJ)) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString(LLJILLL)) != null && string2.length() != 0) {
            try {
                boolean zLJJIIJZLJL = u.LJJIIJZLJL(string2, "#", false);
                String strSubSequence = string2;
                if (zLJJIIJZLJL) {
                    strSubSequence = string2.subSequence(2, string2.length());
                }
                if (tuxNavBar == null) {
                    viewFindViewById = null;
                } else {
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = strSubSequence;
                    tuxNavBar.LJIJJ(c1250250idj);
                    viewFindViewById = tuxNavBar.findViewById(R.id.p1k);
                }
                this.LLILZ = viewFindViewById;
                if (viewFindViewById != null) {
                    C786410Ut5.T4(viewFindViewById, 0.0f);
                }
                TuxTextView tuxTextView = (TuxTextView) this.LLIZ.getValue();
                if (tuxTextView != null) {
                    tuxTextView.setText(strSubSequence);
                }
                TuxTextView tuxTextView2 = (TuxTextView) this.LLIZ.getValue();
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                C1860130yVP c1860130yVP = (C1860130yVP) this.LLILZLL.getValue();
                if (c1860130yVP != null) {
                    c098200Yq = C661350Pwr.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), c1860130yVP);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) this.LLIZ.getValue();
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            View view2 = (View) this.LLILZLL.getValue();
            if (view2 != null) {
                C661350Pwr.LJIIJJI(0, view2);
            }
        }
        C736680Sv4.LJIJJ(NR(), new AwS124S1100000_10(this, string, 3));
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0Qsj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C682210QpP) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS624S0100000_10(this, 17), 4);
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0Qsi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C682210QpP) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS624S0100000_10(this, 18), 4);
        View view3 = (View) this.LLILLL.getValue();
        if (view3 != null) {
            view3.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0Qsh
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view4, int i, int i2, int i3, int i4) {
                    int measuredHeight;
                    SearchSimpleLandingPageFragment searchSimpleLandingPageFragment = this.LIZ;
                    View view5 = (View) searchSimpleLandingPageFragment.LLIZ.getValue();
                    if (view5 != null) {
                        measuredHeight = view5.getMeasuredHeight();
                    } else {
                        measuredHeight = 0;
                    }
                    int iLIZIZ = (i2 - measuredHeight) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    if (iLIZIZ < 0) {
                        iLIZIZ = 0;
                    }
                    float fLJ = C13LZ.LJ(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) / C418440Gaw.LIZIZ(10);
                    View view6 = searchSimpleLandingPageFragment.LLILZ;
                    if (view6 != null) {
                        C786410Ut5.T4(view6, fLJ);
                        float fLIZIZ = C418440Gaw.LIZIZ(10) - iLIZIZ;
                        if (fLIZIZ < 0.0f) {
                            fLIZIZ = 0.0f;
                        }
                        C786410Ut5.ed(view6, fLIZIZ);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Integer numLIZJ;
        int iIntValue = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f3k, viewGroup, false);
        Context context = viewTd.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        viewTd.setBackgroundColor(iIntValue);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
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
