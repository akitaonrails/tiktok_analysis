package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0XF1;
import X.C0ZP4;
import X.C1183600guE;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1200000hKg;
import X.C1201620hNI;
import X.C1201660hNM;
import X.C1204850hSV;
import X.C1207450hWh;
import X.C13LE;
import X.C1504890pGR;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C292380Bd6;
import X.C338490DOt;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444540Hbw;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C987103tV;
import X.EnumC1201670hNN;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC687820QyS;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS153S0100000_18;
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
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;
import com.ss.android.ugc.nearby.settings.NearbyTabConfig;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyRegionListFragment extends BaseFragment implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZispKD0xMWs+Ji4+HELIOSISsrZwE2KTcuMB02LywjJwM6OzEKOy40JSAiPQ==";
    public final String LLIZ;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public Long LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyRegionListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NearbyRegionListFragment() {
        this(null);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{NearbyRegionScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NearbyRegionScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NearbyRegionScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void SR() {
        if (C292380Bd6.LIZ) {
            RegionSearchViewModel regionSearchViewModelWR = WR();
            LocationRegion locationRegion = C1204850hSV.LIZ() ? NearbyTabConfig.LIZ().contentRegion : NearbyTabConfig.LIZ().currentRegion;
            String l0Code = locationRegion != null ? locationRegion.getL0Code() : null;
            C1504890pGR.LIZ.getClass();
            if (C1504890pGR.LIZIZ == null) {
                synchronized (C1504890pGR.LIZJ) {
                    try {
                        if (C1504890pGR.LIZIZ == null) {
                            C1504890pGR.LIZIZ = C1504890pGR.LIZIZ(l0Code);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            NearbyRegionListV1Response nearbyRegionListV1Response = C1504890pGR.LIZIZ;
            if (nearbyRegionListV1Response != null) {
                C844470XAv.LIZ.getClass();
                if (C0XF1.LIZLLL(C844470XAv.LIZ())) {
                    regionSearchViewModelWR.LLILLJJLI = true;
                    regionSearchViewModelWR.setState(new AwS597S0100000_18(nearbyRegionListV1Response, 25));
                } else {
                    C1201620hNI c1201620hNI = C1201620hNI.LIZ;
                    c1201620hNI.getClass();
                    c1201620hNI.LIZJ("nearby_revamp_change_region", new C1183600guE(false, -1, 0));
                    regionSearchViewModelWR.setState(AFwS256S0000000_18.get$arr$(9));
                }
            }
        }
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        if (!WR().LLILLJJLI) {
            C1749280vcc c1749280vcc2 = this.LLIZLLLIL;
            (c1749280vcc2 != null ? c1749280vcc2 : null).LJ();
        }
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-nearby_region_list_show");
        tokenCertWith.auth("mttu");
        C1207450hWh.LIZ.LJIIL("poi", "nearby", tokenCertWith, null, new InterfaceC687820QyS() { // from class: X.0hNL
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                boolean zLJ;
                String str = locationData.encryptedLatitude;
                String str2 = locationData.encryptedLongitude;
                boolean zLJJIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ();
                C1749280vcc c1749280vcc3 = this.LIZ.LLIZLLLIL;
                if (c1749280vcc3 == null) {
                    c1749280vcc3 = null;
                }
                Context context = c1749280vcc3.getContext();
                boolean z = false;
                if (context != null) {
                    zLJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJ(context);
                } else {
                    zLJ = false;
                }
                RegionSearchViewModel regionSearchViewModelWR2 = this.LIZ.WR();
                if (!zLJJIJ || !zLJ) {
                    z = true;
                }
                regionSearchViewModelWR2.vQ2(str, str2, z);
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                this.LIZ.WR().vQ2(null, null, false);
            }
        }, -1L);
    }

    public final RegionSearchViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (RegionSearchViewModel) assemVMLazy.getValue();
    }

    public final void refresh() {
        CertProviderManagerKt.findCert("bpea-nearby_region_list_show", 1476395008, "mttu");
        try {
            SR();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public NearbyRegionListFragment(String str) {
        AssemVMLazy assemVMLazy;
        this.LLIZ = str;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2362);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(804);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2363), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 2364), aFwS256S0000000_18, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2365), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJ = assemVMLazy;
    }

    public final C1722300uv6 UR(EnumC1201670hNN enumC1201670hNN) {
        Pair pair;
        int i = C1201660hNM.LIZ[enumC1201670hNN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pair = new Pair(2131829996, 2131829995);
            } else {
                throw new C1954807lC();
            }
        } else {
            pair = new Pair(2131829437, Integer.valueOf(R.string.f8c));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_refresh;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        C844470XAv.LIZ.getClass();
        c1722300uv6.LJI = C844470XAv.LIZ().getString(iIntValue);
        c1722300uv6.LJIIIIZZ = C844470XAv.LIZ().getString(iIntValue2);
        c1722300uv6.LJIIIZ = new AwS597S0100000_18(this, 607);
        return c1722300uv6;
    }

    public final C1722300uv6 VR(C1749280vcc c1749280vcc, EnumC1201670hNN enumC1201670hNN) {
        EnumC444680HcA enumC444680HcA;
        int i = C1201660hNM.LIZ[enumC1201670hNN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC444680HcA = EnumC444680HcA.SOMETHING_WRONG;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC444680HcA = EnumC444680HcA.NO_NETWORK;
        }
        return C444600Hc2.LIZ(getContext(), c1749280vcc, C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), null, null, null, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, 2131833882, null, new AwS562S0100000_18(this, 2361)), new C444590Hc1(3)));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 135), view.findViewById(R.id.lc0));
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.tq2);
        this.LLIZLLLIL = c1749280vcc;
        C1749280vcc c1749280vcc2 = null;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(205)));
        C1749280vcc c1749280vcc3 = this.LLIZLLLIL;
        if (c1749280vcc3 != null) {
            c1749280vcc2 = c1749280vcc3;
        }
        c1749280vcc2.setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(121)));
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0hNS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1201730hNT) obj).LLILZ;
            }
        }, null, new AwS454S0200000_18(this, view, 20), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0hNQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1201730hNT) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 202), 4);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0hNU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1201730hNT) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 203), 4);
        refresh();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1200000hKg.LIZIZ(this.LLIZ).LJIL(this);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dsg, viewGroup, false);
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
