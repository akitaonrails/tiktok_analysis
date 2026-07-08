package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.C004I;
import X.C01GW;
import X.C049Z;
import X.C098200Yq;
import X.C0OM1;
import X.C10508049a;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1746570vYF;
import X.C1747010vYx;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C23271099x;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C948503nH;
import X.C992303uL;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775950wJd;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DeliveryInstructionFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, DialogInterface.OnDismissListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZy43LDcpHELIOSOjx9LSElPWE3LSklPyohMWsILCM6PiA+MAY9OzE+PCwnISoiDz0yLygpJzs=";
    public C197039127h LLILLL;
    public C1749280vcc LLILZ;
    public RecyclerView LLILZIL;
    public TuxNavBar LLILZLL;
    public C1747010vYx LLIZ;
    public String LLIZLLLIL = "close";
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 169));
    public final lifecycleAwareLazy LLJI;
    public ViewTreeObserverOnGlobalLayoutListenerC1775950wJd LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public Function1<? super DeliveryInstructionInfo, Unit> LLJILLL;

    public DeliveryInstructionFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryInstructionViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 168);
        this.LLJI = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(3), 3));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 167));
        this.LLJILLL = AFwS268S0000000_26.get$arr$(150);
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "delivery_instructions";
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ckh) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final RecyclerView WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final DeliveryInstructionViewModel ZR() {
        return (DeliveryInstructionViewModel) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        View view = getView();
        if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd = this.LLJIJIL;
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775950wJd, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(DeliveryInstructionFragment.class.getName());
        }
        super.onResume();
        ZR().LLIZLLLIL = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS605S0100000_26(this, 157));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        DeliveryInstructionState deliveryInstructionStateFQ2 = ZR().FQ2();
        if (deliveryInstructionStateFQ2.getPageStatus() != 0) {
            HashMap map2 = (HashMap) map;
            map2.put("content_list_size", String.valueOf(deliveryInstructionStateFQ2.getItemList().size()));
            if (deliveryInstructionStateFQ2.getPageStatus() != 2 && deliveryInstructionStateFQ2.getPageStatus() != 3) {
                if (deliveryInstructionStateFQ2.getItemList().isEmpty()) {
                    map2.put("blank_type", "no_meta_data");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        if (WR().getChildCount() > 0 && WR().getHeight() > 0) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26((HashMap) ZR().LLIZ, (HashMap<String, Object>) 156));
    }

    public final void aS(int i) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = WR().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Address address;
        HashMap<String, Object> map;
        List<DeliveryInstructionOption> list;
        int iIntValue;
        String str;
        View rootView;
        Integer numLIZJ;
        DeliveryInstruction deliveryInstruction;
        super.onActivityCreated(bundle);
        DeliveryInstructionViewModel deliveryInstructionViewModelZR = ZR();
        C1747010vYx c1747010vYx = this.LLIZ;
        deliveryInstructionViewModelZR.LLILZIL = c1747010vYx;
        if (c1747010vYx != null) {
            address = c1747010vYx.LIZIZ;
        } else {
            address = null;
        }
        deliveryInstructionViewModelZR.LLILZLL = address;
        if (c1747010vYx != null) {
            map = c1747010vYx.LJI;
        } else {
            map = null;
        }
        deliveryInstructionViewModelZR.LLIZ = map;
        DeliveryInstructionViewModel deliveryInstructionViewModelZR2 = ZR();
        C1747010vYx c1747010vYx2 = deliveryInstructionViewModelZR2.LLILZIL;
        if (c1747010vYx2 != null && (deliveryInstruction = c1747010vYx2.LIZ) != null) {
            list = deliveryInstruction.options;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            deliveryInstructionViewModelZR2.setState(new AwS605S0100000_26(deliveryInstructionViewModelZR2, 915));
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            deliveryInstructionViewModelZR2.setState(new AwS38S0001000_26(0, 20));
            C948503nH.LJFF(deliveryInstructionViewModelZR2, C23271099x.INSTANCE, new C1746570vYF(deliveryInstructionViewModelZR2, jElapsedRealtime, null));
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131832679);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = C20642515q3.LJI(2131823173);
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1621));
        c0om1.LIZIZ(c1251150ifB);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        c0om1.LIZLLL = true;
        C1747010vYx c1747010vYx3 = this.LLIZ;
        if (c1747010vYx3 != null) {
            str = c1747010vYx3.LIZLLL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "shipping_address")) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB2.LJIIIIZZ = C20642515q3.LJI(2131823332);
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1620));
            c0om1.LJ(c1251150ifB2);
        }
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.y4o);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        WR().setAdapter((AbstractC21673619ry) this.LLJILJILJ.getValue());
        WR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        View view2 = getView();
        if (view2 != null && (rootView = view2.getRootView()) != null) {
            this.LLJIJIL = new ViewTreeObserverOnGlobalLayoutListenerC1775950wJd(view2, new Rect(), rootView, this, 3);
            C786410Ut5.x3(rootView.getViewTreeObserver(), this.LLJIJIL);
        }
        C786410Ut5.U8(VR(), new ACListenerS160S0100000_26(this, 81));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getBackEvent();
            }
        }, new AwS640S0100000_26(this, 198));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getItemList();
            }
        }, new AwS640S0100000_26(this, 199));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getScrollerPos();
            }
        }, new AwS640S0100000_26(this, 191));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getCurSelectItem();
            }
        }, new AwS640S0100000_26(this, 192));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getLogDuration();
            }
        }, new AwS640S0100000_26(this, 193));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((DeliveryInstructionState) obj).getPageLoaded());
            }
        }, new AwS640S0100000_26(this, 194));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getToast();
            }
        }, new AwS640S0100000_26(this, 195));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryInstructionState) obj).getNetEvent();
            }
        }, new AwS640S0100000_26(this, 196));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZ4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryInstructionState) obj).getPageStatus());
            }
        }, new AwS640S0100000_26(this, 197));
        C1748720vbi.LIZIZ(this, new C049Z(), null);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (Intrinsics.LJFF(this.LLIZLLLIL, "close")) {
            this.LLIZLLLIL = "return";
        }
        Function1<? super DeliveryInstructionInfo, Unit> function1 = this.LLJILLL;
        if (function1 != null) {
            function1.invoke(null);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.ai_, viewGroup);
        } else {
            viewLIZ = null;
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
