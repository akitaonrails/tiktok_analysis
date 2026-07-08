package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.AnonymousClass0378;
import X.C004I;
import X.C01GW;
import X.C03DZ;
import X.C03FA;
import X.C03FV;
import X.C098200Yq;
import X.C0HI3;
import X.C0OM1;
import X.C1018703yb;
import X.C1058220de0;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817603Hi;
import X.C960203pA;
import X.C968603qW;
import X.C970103ql;
import X.C970303qn;
import X.C973303rH;
import X.InterfaceC1075600e62;
import X.InterfaceC1164530gPT;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import tia.b;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressSelectFragment extends ECAnimDowngradeFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, c, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZys2HELIOSJCw6LD0qZjUtLip9KSEoOyogO2sNLSshLTY/Gio/LSY4Dz0yLygpJzs=";
    public C0HI3 LL;
    public C197039127h LLILLJJLI;
    public C197039127h LLILLL;
    public C1749280vcc LLILZ;
    public C197039127h LLILZIL;
    public TuxNavBar LLILZLL;
    public final C01GW LLIZ;
    public final lifecycleAwareLazy LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public final C01GW LLJIJIL;
    public final AwS545S0100000_1 LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    public AddressSelectFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLIZ = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 5));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AddressSelectViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ2, 90);
        this.LLIZLLLIL = new lifecycleAwareLazy(this, awS545S0100000_1, new AwS145S0400000_16(this, awS545S0100000_1, c19719912DlLIZ2, AFwS284S0000000_1.get$arr$(5), 3));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 87));
        this.LLJILJIL = new AwS545S0100000_1(this, 89);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 88));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 91));
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "logistics_address";
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

    @Override // p8b.c
    public final String getViewName() {
        return "AddressSelectFragment";
    }

    public final C197039127h PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b6x) : null;
            this.LLILZIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dn8) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.exd) : null;
            this.LLILLJJLI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final DeliveryPanelViewModel UR() {
        return (DeliveryPanelViewModel) this.LLIZ.getValue();
    }

    public final C0HI3 VR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LL = (C0HI3) viewFindViewById;
        }
        return (C0HI3) viewFindViewById;
    }

    public final AddressSelectViewModel WR() {
        return (AddressSelectViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLJILLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AddressSelectViewModel addressSelectViewModelWR = WR();
        if (addressSelectViewModelWR.FQ2().getStatus() == 0) {
            addressSelectViewModelWR.mR2(0L, "user_leave", false);
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LLD(new C970303qn(this.LLJILJIL));
        }
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_locate_address", this);
        AnonymousClass0378.LIZ().LIZJ("ec_address_change", this);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        int size;
        AddressSelectState addressSelectStateFQ2 = WR().FQ2();
        if (addressSelectStateFQ2.getStatus() != 0) {
            List<Object> renderDataList = addressSelectStateFQ2.getRenderDataList();
            if (renderDataList != null) {
                size = renderDataList.size();
            } else {
                size = 0;
            }
            HashMap map2 = (HashMap) map;
            map2.put("content_list_size", String.valueOf(size));
            if (addressSelectStateFQ2.getStatus() != 2 && addressSelectStateFQ2.getStatus() != 3) {
                List<Object> renderDataList2 = addressSelectStateFQ2.getRenderDataList();
                if (renderDataList2 == null || renderDataList2.isEmpty()) {
                    map2.put("blank_type", "no_meta_data");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS228S0000000_1.get$arr$(46));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", AFwS228S0000000_1.get$arr$(47));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress] */
    public final void ZR(AddressListData addressListData) {
        C03FV c03fvQR2;
        int size;
        ?? r6;
        Address address;
        String str;
        List<ReachableAddress> list;
        String str2;
        DeliveryData deliveryData = WR().LLIZ;
        if (deliveryData == null) {
            deliveryData = new DeliveryData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        DeliveryData deliveryDataLIZ = DeliveryData.LIZ(deliveryData, addressListData.addressList, addressListData.changeLocationData, addressListData.changeLocationSelections, 503803);
        WR().LLIZ = deliveryDataLIZ;
        C259800zU c259800zU = new C259800zU();
        DeliveryPanelStarter.EnterParam enterParam = WR().LLILZIL;
        int size2 = 0;
        if (enterParam != null && (str = enterParam.selectedAddressId) != null && (list = deliveryDataLIZ.addresses) != null) {
            Iterator<ReachableAddress> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ReachableAddress next = it2.next();
                ReachableAddress reachableAddress = next;
                Address address2 = reachableAddress.address;
                if (address2 != null) {
                    str2 = address2.id;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str) && Intrinsics.LJFF(reachableAddress.reachable, Boolean.TRUE)) {
                    if (next != null) {
                        c03fvQR2 = new C03FV(next);
                    }
                }
            }
            UR().getClass();
            c03fvQR2 = DeliveryPanelViewModel.qR2(deliveryDataLIZ, null, null);
        } else {
            UR().getClass();
            c03fvQR2 = DeliveryPanelViewModel.qR2(deliveryDataLIZ, null, null);
        }
        DeliveryPanelViewModel deliveryPanelViewModelUR = UR();
        List list2 = deliveryDataLIZ.addresses;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        deliveryPanelViewModelUR.getClass();
        List<? extends Object> listFR2 = DeliveryPanelViewModel.FR2(list2, c03fvQR2);
        WR().jR2(listFR2);
        c03fvQR2.LIZJ(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 69));
        if (c03fvQR2.LIZ == null) {
            for (Object obj : listFR2) {
                if ((obj instanceof ReachableAddress) && (r6 = (ReachableAddress) obj) != 0 && (address = r6.address) != null && address.LJII() && Intrinsics.LJFF(r6.reachable, Boolean.TRUE)) {
                    c259800zU.element = r6;
                }
            }
        }
        WR().qR2((ReachableAddress) c259800zU.element);
        c03fvQR2.LIZLLL(new AwS580S0100000_1(this, 70));
        DeliveryPanelViewModel deliveryPanelViewModelUR2 = UR();
        List<ReachableAddress> list3 = addressListData.addressList;
        if (list3 != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        deliveryPanelViewModelUR2.LLJJJIL = size;
        if (!this.LLJ) {
            this.LLJ = true;
            Set<String> set = C03FA.LIZ;
            List<ReachableAddress> list4 = addressListData.addressList;
            if (list4 != null) {
                size2 = list4.size();
            }
            C1018703yb.LIZLLL("tiktokec_enter_page", new AwS16S0001000_1(size2, 24));
        }
        AddressSelectViewModel addressSelectViewModelWR = WR();
        addressSelectViewModelWR.getClass();
        addressSelectViewModelWR.setState(AFwS228S0000000_1.get$arr$(859));
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        ArrayList arrayList;
        if (Intrinsics.LJFF(str, "ec_zipcode_locate_address")) {
            ZipcodeLocateAddress zipcodeLocateAddressLIZ = C970103ql.LIZ(str2);
            Integer num = zipcodeLocateAddressLIZ.type;
            if (num != null && num.intValue() == 1) {
                String str3 = zipcodeLocateAddressLIZ.zipcode;
                DeliveryPanelViewModel deliveryPanelViewModelUR = UR();
                deliveryPanelViewModelUR.LLJJJ = new SelectAddressInfo(deliveryPanelViewModelUR.LLJJJ.addressId, zipcodeLocateAddressLIZ.regions, 2);
                if (WR().LLILZLL == 3) {
                    DeliveryPanelStarter.EnterParam enterParam = WR().LLILZIL;
                    if (enterParam != null && Intrinsics.LJFF(enterParam.updateCache, Boolean.TRUE)) {
                        C973303rH c973303rH = C973303rH.LL;
                        List<Region> list = zipcodeLocateAddressLIZ.regions;
                        if (list != null) {
                            arrayList = new ArrayList(list);
                        } else {
                            arrayList = new ArrayList();
                        }
                        c973303rH.LIZJ(str3, arrayList);
                        C973303rH.LLILZLL = zipcodeLocateAddressLIZ.location;
                    }
                    DeliveryPanelViewModel deliveryPanelViewModelUR2 = UR();
                    deliveryPanelViewModelUR2.getClass();
                    deliveryPanelViewModelUR2.setState(AFwS228S0000000_1.get$arr$(411));
                    return;
                }
                UR().ER2(getContext(), zipcodeLocateAddressLIZ.regions, str3, zipcodeLocateAddressLIZ.location);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ec_address_change")) {
            if (WR().LLILZLL == 3) {
                WR().kR2(new AwS580S0100000_1(this, 71));
                return;
            }
            AddressSelectViewModel addressSelectViewModelWR = WR();
            addressSelectViewModelWR.SB1(0);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(addressSelectViewModelWR), null, null, new C968603qW(addressSelectViewModelWR, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage;
        super.onViewCreated(view, bundle);
        mG(view, null);
        WR().LLIZ = UR().LLJI;
        WR().LLJILJIL = UR().LLJJLIIIJLLLLLLLZ;
        WR().LLJILJILJ = UR().LLJIJIL;
        WR().LLJJ = SystemClock.elapsedRealtime();
        AddressSelectViewModel addressSelectViewModelWR = WR();
        C973303rH.LL.getClass();
        addressSelectViewModelWR.LLIZLLLIL = C973303rH.LLILZIL;
        Parcelable parcelable = UR().LLILZLL;
        if ((parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable) != null) {
            WR().LLJ = enterParamForProductDetailPage;
        }
        WR().LLILZLL = UR().LLIZ;
        WR().LLILZIL = UR().LLILZIL;
        VR().setAdapter((AbstractC21673619ry) this.LLJIJIL.getValue());
        VR().setLayoutManager(new LinearLayoutManager(getContext()));
        Context context = getContext();
        if (context != null) {
            VR().addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, context), 0, C12ES.LIZJ(16.0f, context), 2));
        }
        C0HI3 c0hi3VR = VR();
        ViewGroup.LayoutParams layoutParams = c0hi3VR.getLayoutParams();
        C426750GoL.LJIIIZ(c0hi3VR, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(((b) this.LLJILJILJ.getValue()).n2()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hi3VR);
        c0hi3VR.setLayoutParams(layoutParams);
        if (((b) this.LLJILJILJ.getValue()).LLIIJI()) {
            C03DZ.LIZJ(RR());
            C03DZ.LIZJ(SR());
            C03DZ.LIZ(PR());
        } else {
            C03DZ.LIZ(RR());
            C03DZ.LIZ(SR());
            C03DZ.LIZJ(PR());
        }
        String string = getString(((b) this.LLJILJILJ.getValue()).LJZ());
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1740));
        c0om1.LIZIZ(c1251150ifB);
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context2)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        if (WR().LLILZLL != 3) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB2.LJIIIIZZ = getString(2131823332);
            c1251150ifB2.LIZJ(new AwS545S0100000_1(this, 1739));
            c0om1.LJ(c1251150ifB2);
        }
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.xzl);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C786410Ut5.I7(new AjS60S0100000_1(this, 138), SR());
        C786410Ut5.I7(new AjS60S0100000_1(this, 139), RR());
        C786410Ut5.I7(new AjS60S0100000_1(this, 140), PR());
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJFF(new C970303qn(this.LLJILJIL));
        }
        if (WR().LLILZLL != 3) {
            withState(UR(), new AwS580S0100000_1(this, 964));
        } else {
            WR().kR2(new AwS580S0100000_1(this, 960));
        }
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getChooseLocation();
            }
        }, new AwS615S0100000_1(this, 223));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getSelectedAddress();
            }
        }, new AwS615S0100000_1(this, 224));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getReachableAddress();
            }
        }, new AwS615S0100000_1(this, 225));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03r0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getSelectCountry();
            }
        }, new AwS615S0100000_1(this, 226));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getRenderDataList();
            }
        }, new AwS615S0100000_1(this, 219));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getLogDuration();
            }
        }, new AwS615S0100000_1(this, 220));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressSelectState) obj).getStatus());
            }
        }, new AwS615S0100000_1(this, 221));
        C11EA.LJII(this, WR(), new C2217381BqS() { // from class: X.03qq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddressSelectState) obj).getApplyBtnEnable());
            }
        }, new AwS615S0100000_1(this, 222));
        AnonymousClass0378.LIZ().LIZLLL("ec_zipcode_locate_address", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_address_change", this);
        if (!WR().LLJJIII.LIZ) {
            C817603Hi c817603Hi = WR().LLJJIII;
            String str = this.LLJI;
            if (str == null) {
                DeliveryPanelStarter.EnterParam enterParam = WR().LLILZIL;
                if (enterParam != null) {
                    str = enterParam.btmToken;
                } else {
                    str = null;
                }
            }
            c817603Hi.LIZJ = str;
            WR().LLJJIII.LJIIL(this, "a2270.b0252", null);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.alr, viewGroup, false);
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
