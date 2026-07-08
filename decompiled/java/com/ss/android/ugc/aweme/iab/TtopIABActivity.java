package com.ss.android.ugc.aweme.iab;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C127G;
import X.C13LE;
import X.C1554300qY8;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1BHX;
import X.C2202311BHh;
import X.C2217381BqS;
import X.C2442409he;
import X.C337180DJs;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ACListenerS161S0100000_27;
import Y.AObjectS401S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class TtopIABActivity extends BaseFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZiwtK2EHPCo8AA4RCSY4IDk6PDw=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "router_params", TtopIABRouterParams.class);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 263));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 259));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 260));
    public final AssemVMLazy LLJIJIL;
    public C1749280vcc LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxNavBar LLJILLL;
    public View LLJJ;
    public C127G LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TtopIABActivity.class, "iabReviewVM", "getIabReviewVM()Lcom/ss/android/ugc/aweme/iab/TtopIABVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final int SR() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final boolean UR() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final TtopIABVM VR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (TtopIABVM) assemVMLazy.getValue();
    }

    public final String WR() {
        return (String) this.LLIZLLLIL.getValue();
    }

    public TtopIABActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TtopIABVM.class);
        this.LLJIJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS571S0100000_27(c19719912DlLIZ, 261), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 262), AFwS269S0000000_27.get$arr$(63));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{TtopIABVM.class, new AObjectS401S0100000_27(this, 5)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2442409he c2442409he = C2442409he.LIZ;
        int type = VR().getState().LL.getType();
        int iSR = SR();
        String strWR = WR();
        boolean zUR = UR();
        c2442409he.getClass();
        C2442409he.LIZIZ(type, iSR, strWR, "exit", zUR);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VR().vQ2();
        NR(AFwS269S0000000_27.get$arr$(62));
    }

    public final void ZR(String str, boolean z) {
        View view;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (z && (view = this.LLJJ) != null) {
            C337180DJs.LIZJ(view);
        }
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            C337180DJs.LIZ(c1749280vcc);
        }
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = str;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402685961);
        sparkThirdContext.callback = new C2202311BHh() { // from class: X.0y0u
            @Override // X.C2202311BHh, X.InterfaceC2202301BHg
            public final void LIZJ(String str2) {
            }

            @Override // X.C2202311BHh, X.InterfaceC2202301BHg
            public final void LIZIZ(String str2) {
                this.LIZ.VR().wQ2("success");
            }
        };
        C1BHX c1bhxLIZ = C1554300qY8.LIZ(context, sparkThirdContext);
        if (c1bhxLIZ != null) {
            c1bhxLIZ.LIZ(sparkThirdContext);
        }
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout != null) {
            frameLayout.addView(c1bhxLIZ, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.eqx);
        this.LLJILLL = (TuxNavBar) view.findViewById(R.id.ju_);
        TuxNavBar tuxNavBar = this.LLJILLL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1340));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        }
        View viewFindViewById2 = view.findViewById(R.id.hii);
        this.LLJJ = viewFindViewById2;
        if (viewFindViewById2 != null && (viewFindViewById = viewFindViewById2.findViewById(R.id.br9)) != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 181), viewFindViewById);
        }
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.09hj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2442609hg) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 147), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.kg, viewGroup, false);
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
