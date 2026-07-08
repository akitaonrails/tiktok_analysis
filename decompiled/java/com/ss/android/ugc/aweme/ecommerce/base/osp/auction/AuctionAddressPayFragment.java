package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C01GW;
import X.C03H5;
import X.C03O0;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C1026303zp;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C1391190mJ3;
import X.C13LE;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C343970De7;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C785410UrT;
import X.C786410Ut5;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS136S0100000_1;
import Y.ARunnableS101S0100000_1;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AuctionAddressPayFragment extends ECBaseFragment implements InterfaceC724530SbT, InterfaceC1164530gPT {
    public static final C1026303zp LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZyAgOGstPCwnISoiZw4mKzElJiESLCE+LDwgGCQ1Dz0yLygpJzs=";
    public final AssemVMLazy LLILLL;
    public C197039127h LLILZ;
    public ConstraintLayout LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public C1749280vcc LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxNavBar LLJI;
    public TuxTextView LLJIJIL;
    public long LLJILJIL;
    public GetAuctionInfoRequest LLJILJILJ;
    public HashMap<String, Object> LLJILLL;
    public final C01GW LLJJ;
    public String LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuctionAddressPayFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/auction/AuctionAddressPayVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new C1026303zp();
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

    public final AuctionAddressPayVM VR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (AuctionAddressPayVM) assemVMLazy.getValue();
    }

    public AuctionAddressPayFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuctionAddressPayVM.class);
        this.LLILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 101), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 102), AFwS228S0000000_1.get$arr$(57));
        this.LLJILJIL = -1L;
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 100));
        this.LLJJI = "close";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AuctionAddressPayVM auctionAddressPayVMVR = VR();
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        iEventCenter.LIZJ("ec_address_change", auctionAddressPayVMVR);
        iEventCenter.LIZJ("ec_address_select", auctionAddressPayVMVR);
        iEventCenter.LIZJ("payment_open_bind_card_result", auctionAddressPayVMVR);
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZ("ec_auction_checkout_info_completed", "{}");
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_live_end_event", this);
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_auction_tax_refresh", this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AuctionAddressPayFragment.class.getName());
        }
        super.onResume();
        VR();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Dialog dialog = (Dialog) this.LLJJ.getValue();
        if (dialog != null && dialog.isShowing()) {
            try {
                DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LLJJ.getValue();
                if (dialogC1389620mGW != null) {
                    dialogC1389620mGW.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS101S0100000_1(this, 33));
        }
        if (Intrinsics.LJFF(this.LLJJI, "close")) {
            VR().LLJJIII = VR().LLJJ;
            VR().LLJJIJI = VR().LLJJI;
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "close"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
        }
        VR().xQ2(this.LLJJI, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJILJIL = System.currentTimeMillis();
        AuctionAddressPayVM auctionAddressPayVMVR = VR();
        GetAuctionInfoRequest getAuctionInfoRequest = this.LLJILJILJ;
        HashMap<String, Object> map = this.LLJILLL;
        long j = this.LLJILJIL;
        auctionAddressPayVMVR.LLILLJJLI = map;
        auctionAddressPayVMVR.LLJILJILJ = j;
        auctionAddressPayVMVR.LLJILLL = true;
        auctionAddressPayVMVR.BQ2(getAuctionInfoRequest);
        AuctionAddressPayVM auctionAddressPayVMVR2 = VR();
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        iEventCenter.LIZLLL("ec_address_select", auctionAddressPayVMVR2);
        iEventCenter.LIZLLL("ec_address_change", auctionAddressPayVMVR2);
        iEventCenter.LIZLLL("payment_open_bind_card_result", auctionAddressPayVMVR2);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_live_end_event", this);
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_auction_tax_refresh", this);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_live_end_event")) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            this.LLJJI = "close";
        } else {
            if (!Intrinsics.LJFF(str, "ec_auction_tax_refresh")) {
                return;
            }
            VR().BQ2(null);
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
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZ = (C197039127h) view.findViewById(R.id.cbx);
        this.LLILZIL = (ConstraintLayout) view.findViewById(R.id.ccd);
        this.LLILZLL = view.findViewById(R.id.fyx);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.nx2);
        this.LLIZLLLIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJ = (TuxTextView) view.findViewById(R.id.text);
        this.LLJI = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.pvs);
        TuxNavBar tuxNavBar = this.LLJI;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            c0om1.LIZJ(C960203pA.LIZ(R.attr.a1e, view.getContext()));
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1512));
            c0om1.LIZIZ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        }
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS136S0100000_1(this, 15));
        }
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03zw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AuctionAddressPayState) obj).getShowDialogState());
            }
        }, null, new AwS615S0100000_1(this, 83), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03zx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((AuctionAddressPayState) obj).getPageLoadStatus());
            }
        }, null, new AwS615S0100000_1(this, 84), 6);
        C736680Sv4.LJIIIZ(this, VR(), new C2217381BqS() { // from class: X.0400
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AuctionAddressPayState) obj).getAddress();
            }
        }, new C2217371BqR() { // from class: X.03zz
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AuctionAddressPayState) obj).getPayment();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((AuctionAddressPayState) obj).setPayment((PaymentInfo) obj2);
            }
        }, null, new AwS650S0100000_1(this, 13), 12);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03zy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AuctionAddressPayState) obj).getLoadSuccess());
            }
        }, null, new AwS615S0100000_1(this, 85), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0401
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AuctionAddressPayState) obj).getOtpString();
            }
        }, null, new AwS615S0100000_1(this, 82), 6);
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 84), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.b1a, viewGroup, false);
        } else {
            viewTd = null;
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
