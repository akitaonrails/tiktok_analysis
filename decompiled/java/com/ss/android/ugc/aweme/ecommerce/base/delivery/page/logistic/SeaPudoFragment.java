package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.AnonymousClass0378;
import X.C004I;
import X.C01GW;
import X.C03FA;
import X.C04E4;
import X.C098200Yq;
import X.C0HI3;
import X.C1058220de0;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C12ES;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1756030vnV;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23271099x;
import X.C452501pT;
import X.C786410Ut5;
import X.C948503nH;
import X.C960203pA;
import X.C965703q3;
import X.C965903q5;
import X.InterfaceC1164530gPT;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.OrderData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPudoFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZys2JCw6LD0qZjUtLip9JCorIDwnISZiGioyGDAoJgkhKSIhLCEn";
    public C0HI3 LLILLL;
    public C04E4 LLILZ;
    public C1749280vcc LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

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
        return "sea_pudo";
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

    public final C04E4 ZR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cal) : null;
            this.LLILZ = (C04E4) viewFindViewById;
        }
        return (C04E4) viewFindViewById;
    }

    public final C0HI3 aS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qfc) : null;
            this.LLILLL = (C0HI3) viewFindViewById;
        }
        return (C0HI3) viewFindViewById;
    }

    public final DeliveryPanelViewModel bS() {
        return (DeliveryPanelViewModel) this.LLILZLL.getValue();
    }

    public SeaPudoFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLILZLL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 7));
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 97));
    }

    public final void WR() {
        DeliveryPanelStarter.OrderDetail orderDetail;
        DeliveryPanelStarter.EnterParam enterParam = bS().LLILZIL;
        if (enterParam == null || (orderDetail = enterParam.orderDetail) == null) {
            return;
        }
        DeliveryPanelViewModel deliveryPanelViewModelBS = bS();
        OrderData orderData = new OrderData(orderDetail.changeAddrOrderType, orderDetail.changeAddrOrderId);
        deliveryPanelViewModelBS.getClass();
        deliveryPanelViewModelBS.setState(AFwS228S0000000_1.get$arr$(412));
        C948503nH.LJFF(deliveryPanelViewModelBS, C23271099x.INSTANCE, new C965703q3(orderData, deliveryPanelViewModelBS, null));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass0378.LIZ().LIZJ("ec_resend_save_address", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        C0HI3 c0hi3AS = aS();
        if (c0hi3AS != null && c0hi3AS.getChildCount() > 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS228S0000000_1.get$arr$(51));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", AFwS228S0000000_1.get$arr$(52));
    }

    public final void VR(PudoAddress pudoAddress, Boolean bool) {
        DeliveryPanelStarter.OrderDetail orderDetail;
        DeliveryPanelStarter.EnterParam enterParam = bS().LLILZIL;
        if (enterParam != null && (orderDetail = enterParam.orderDetail) != null) {
            DeliveryPanelViewModel deliveryPanelViewModelBS = bS();
            Integer num = orderDetail.changeAddrOrderType;
            String str = orderDetail.changeAddrOrderId;
            Address address = pudoAddress.address;
            String str2 = orderDetail.addressId;
            deliveryPanelViewModelBS.getClass();
            deliveryPanelViewModelBS.setState(AFwS228S0000000_1.get$arr$(409));
            C948503nH.LJFF(deliveryPanelViewModelBS, C23271099x.INSTANCE, new C965903q5(num, str, address, str2, bool, deliveryPanelViewModelBS, null));
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_resend_save_address")) {
            withState(bS(), new AwS580S0100000_1(this, 74));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HashMap<String, Object> mapLJIIJ;
        String str;
        super.onViewCreated(view, bundle);
        IPageNodeMonitorService iPageNodeMonitorService = (IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class);
        DeliveryPanelStarter.EnterParam enterParam = bS().LLILZIL;
        if (enterParam != null && (str = enterParam.trackParams) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        } else {
            mapLJIIJ = null;
        }
        iPageNodeMonitorService.LJIIIIZZ("sea_pudo", mapLJIIJ, null, null, null);
        C1756030vnV.LIZ(this);
        C19EG activity = getActivity();
        if (activity != null) {
            C0HI3 c0hi3AS = aS();
            if (c0hi3AS != null) {
                c0hi3AS.setAdapter((AbstractC21673619ry) this.LLIZ.getValue());
            }
            C0HI3 c0hi3AS2 = aS();
            if (c0hi3AS2 != null) {
                c0hi3AS2.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.a02, activity), 0, C12ES.LIZJ(32.0f, activity), 2));
            }
            C0HI3 c0hi3AS3 = aS();
            if (c0hi3AS3 != null) {
                c0hi3AS3.setLayoutManager(new LinearLayoutManager(activity));
            }
            C0HI3 c0hi3AS4 = aS();
            if (c0hi3AS4 != null) {
                c0hi3AS4.setNestedScrollingEnabled(true);
            }
        }
        C04E4 c04e4ZR = ZR();
        if (c04e4ZR != null) {
            c04e4ZR.setStyle(1);
        }
        C04E4 c04e4ZR2 = ZR();
        if (c04e4ZR2 != null) {
            c04e4ZR2.setButtonVariant(0);
        }
        Set<String> set = C03FA.LIZ;
        C03FA.LJII("tiktokec_button_show", null, null, C03FA.LIZIZ("save_pickup_point", bS().sR2()), null, false, 54);
        C04E4 c04e4ZR3 = ZR();
        if (c04e4ZR3 != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 142), c04e4ZR3);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_resend_save_address", this);
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getPickUpList();
            }
        }, new AwS615S0100000_1(this, 227));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getPickupSelectAddress();
            }
        }, new AwS615S0100000_1(this, 228));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getSavePickUpStatus());
            }
        }, new AwS615S0100000_1(this, 229));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getSavePickUpToast();
            }
        }, new AwS615S0100000_1(this, 231));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getGetPudoAddressStatus());
            }
        }, new AwS615S0100000_1(this, 235));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getPickupSelectAddress();
            }
        }, new AwS615S0100000_1(this, 237));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03qS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getChangeAddressJumpSchema();
            }
        }, new AwS615S0100000_1(this, 238));
        C11EA.LJII(this, bS(), new C2217381BqS() { // from class: X.03po
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getTab());
            }
        }, new AwS615S0100000_1(this, 239));
        if (bS().zR2()) {
            WR();
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ans, viewGroup, false);
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
