package com.ss.android.ugc.nearby.container;

import X.AbstractC1204360hRi;
import X.AbstractC1591090rVT;
import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09JN;
import X.C0C64;
import X.C0GS6;
import X.C0NRY;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C11S5;
import X.C1200910hM9;
import X.C1201620hNI;
import X.C1203730hQh;
import X.C1203790hQn;
import X.C1203800hQo;
import X.C1203960hR4;
import X.C1204040hRC;
import X.C1204050hRD;
import X.C1204080hRG;
import X.C1204160hRO;
import X.C1204330hRf;
import X.C1204570hS3;
import X.C1204850hSV;
import X.C1204910hSb;
import X.C1205150hSz;
import X.C1205170hT1;
import X.C1308910kAL;
import X.C13LE;
import X.C1499850p8J;
import X.C14LC;
import X.C1504890pGR;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581510rG1;
import X.C1591880rWk;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20742916Ex;
import X.C2145808au;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C228700uT;
import X.C23250099c;
import X.C2524709uv;
import X.C266830Acz;
import X.C288440BSg;
import X.C292380Bd6;
import X.C338490DOt;
import X.C338910DQj;
import X.C339190DRl;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C629410OmR;
import X.C673150Qan;
import X.C686930Qx1;
import X.C686950Qx3;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C799520VXy;
import X.C987103tV;
import X.EnumC1204030hRB;
import X.EnumC1204140hRM;
import X.EnumC1204230hRV;
import X.EnumC1204260hRY;
import X.EnumC1589810rTP;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1204310hRd;
import X.InterfaceC1571610r03;
import X.InterfaceC1582030rGr;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS29S0101000_18;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.nearby.container.ability.IContainerAbility;
import com.ss.android.ugc.nearby.container.ability.IFeedContentAbility;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Request;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import com.ss.android.ugc.nearby.roaming.RegionListApi;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyPreloadTabTriggerExperiment;
import com.ss.android.ugc.nearby.status.FullPageStatusAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS33S0000100_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFragment extends FeedFragment implements InterfaceC724530SbT, InterfaceC1055110dYz, InterfaceC1582030rGr, InterfaceC1571610r03, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZispKD0xMWHELIOSsvJiEnKSwiLD19BiAtOy0qDjctLiI2JjE=";
    public FrameLayout LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public final NearbyFragment$nearbyFeedAbility$1 LLJILJIL;
    public final C01GW LLJILJILJ;
    public C1200910hM9 LLJILLL;
    public C0GS6 LLJJ;
    public Bundle LLJJI;
    public C11JF LLJJIII;
    public final C1203800hQo LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyFragment.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/container/vm/NearbyContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1582030rGr
    public final Aweme G3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a4257.b33349";
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{NearbyFragmentScope.class});
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

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String getEnterFrom() {
        return "homepage_nearby";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NearbyFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NearbyFragmentScope.class);
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

    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.nearby.container.NearbyFragment$nearbyFeedAbility$1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0hQo] */
    public NearbyFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NearbyContainerViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2351);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(792);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2352), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 2353), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2354), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJILJIL = new IContainerAbility() { // from class: com.ss.android.ugc.nearby.container.NearbyFragment$nearbyFeedAbility$1
            @Override // com.ss.android.ugc.nearby.container.ability.IContainerAbility
            public final C1200910hM9 n32() {
                return this.LL.LLJILLL;
            }

            @Override // com.ss.android.ugc.nearby.container.ability.IContainerAbility
            public final void U52(C1203960hR4 c1203960hR4) {
                this.LL.WR().DQ2(c1203960hR4);
            }
        };
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(629));
        this.LLJJIJI = new InterfaceC1204310hRd() { // from class: X.0hQo
            @Override // X.InterfaceC1204310hRd
            public final void onDestroy() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeHide(Bundle bundle) {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeShow(Bundle bundle) {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onPause() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onResume() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStart() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStop() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onCreate() {
                long j = C1203790hQn.LIZIZ;
                long jElapsedRealtime = j > 0 ? SystemClock.elapsedRealtime() - j : -1L;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preload() called, diff from first onTrigger=");
                sbLIZ.append(jElapsedRealtime);
                sbLIZ.append("ms");
                C2188811AlT.LIZIZ(sbLIZ);
                if (jElapsedRealtime > 0) {
                    C1201620hNI c1201620hNI = C1201620hNI.LIZ;
                    c1201620hNI.getClass();
                    c1201620hNI.LIZJ("nearby_on_trigger_to_preload_diff", new AwS33S0000100_18(jElapsedRealtime, 12));
                }
                Boolean bool = ((NearbyPreloadTabTriggerExperiment.NearbyPreloadTabTriggerConfig) NearbyPreloadTabTriggerExperiment.LIZIZ.getValue()).enable;
                if (bool == null || !bool.booleanValue()) {
                    C1203790hQn.LIZ(false);
                }
            }
        };
    }

    public final void VR() {
        AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(requireActivity()).y01();
        if (abstractC1591090rVTY01 != null) {
            abstractC1591090rVTY01.LJJIJIL("HOME");
        }
    }

    public final NearbyContainerViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (NearbyContainerViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1582030rGr
    public final boolean oe() {
        C19EG activity;
        if (C288440BSg.LIZ || (activity = getActivity()) == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1205150hSz.LIZ.getClass();
        return C1205150hSz.LIZJ(activity, jCurrentTimeMillis, "click_tab");
    }

    @Override // X.InterfaceC1571610r03
    public final Bundle Bd() {
        View viewFindViewById;
        View view = getView();
        ViewGroup.LayoutParams layoutParams = (view == null || (viewFindViewById = view.findViewById(R.id.p4e)) == null) ? null : viewFindViewById.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("nearby_top_margin", marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null);
        pairArr[1] = new Pair("nearby_bottom_margin", marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.bottomMargin) : null);
        return C799520VXy.LIZ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void RR() {
        C19EG activity = getActivity();
        if (activity != null && isVisible() && getUserVisibleHint() && Hox.LLJILJIL.LIZ(activity).KQ2("Nearby")) {
            super.RR();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        NearbyLifecycleManager nearbyLifecycleManager = NearbyLifecycleManager.LL;
        ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).remove(this.LLJJIJI);
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIII = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        UR();
    }

    @Override // X.InterfaceC1571610r03
    public final void Ai(Bundle bundle) {
        this.LLJJI = bundle;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        AbstractC1204360hRi<C1204080hRG> abstractC1204360hRi = WR().getState().LL;
        if (abstractC1204360hRi instanceof C1204160hRO) {
            C1204160hRO c1204160hRO = (C1204160hRO) abstractC1204360hRi;
            if (c1204160hRO.LIZ == EnumC1204260hRY.FULL_LOAD || c1204160hRO.LIZIZ == EnumC1204140hRM.LOC_UNAVAILABLE) {
                VR();
                return true;
            }
        }
        IFeedContentAbility iFeedContentAbility = (IFeedContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IFeedContentAbility.class, null);
        if (iFeedContentAbility != null) {
            iFeedContentAbility.C51(new C1203960hR4(EnumC1204030hRB.CLICK_HOME));
        }
        return true;
    }

    public final void ZR(EnumC1204230hRV enumC1204230hRV) {
        C629410OmR.LIZJ(this, this.LLIZ, Collections.singletonList(C13LE.LIZ(FullPageStatusAssem.class)));
        C339190DRl.LIZLLL(this.LLIZ);
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, enumC1204230hRV, 160), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C1203960hR4 c1203960hR4 = (C1203960hR4) this.LLJILJILJ.getValue();
        c1203960hR4.getClass();
        c1203960hR4.LIZIZ = SystemClock.elapsedRealtime();
        c1203960hR4.LJI();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLJI = jElapsedRealtime;
        C1203960hR4.LJIIZILJ = jElapsedRealtime;
        C1203790hQn.LIZIZ(EnumC1589810rTP.ON_ATTACH, null);
        if (((Boolean) C266830Acz.LIZ.getValue()).booleanValue()) {
            NearbyContainerViewModel nearbyContainerViewModelWR = WR();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(nearbyContainerViewModelWR), C0PEM.LIZJ, null, new C1204040hRC(nearbyContainerViewModelWR, (C1203960hR4) this.LLJILJILJ.getValue(), null), 2);
        }
        super.onAttach(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        C19EG activity;
        super.onCreate(bundle);
        C1204330hRf.LIZ.getClass();
        int iIntValue = 0;
        if (C1204330hRf.LIZJ == C1204330hRf.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFragment onCreate, enablePreciseExperiment=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        NearbyLifecycleManager nearbyLifecycleManager = NearbyLifecycleManager.LL;
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.nearby.container.NearbyLifecycleManager$init$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                switch (C2145808au.LIZ[event.ordinal()]) {
                    case 1:
                        NearbyLifecycleManager nearbyLifecycleManager2 = NearbyLifecycleManager.LL;
                        Iterator it2 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1204310hRd) it2.next()).onCreate();
                        }
                        break;
                    case 2:
                        NearbyLifecycleManager nearbyLifecycleManager3 = NearbyLifecycleManager.LL;
                        Iterator it3 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC1204310hRd) it3.next()).onStart();
                        }
                        break;
                    case 3:
                        NearbyLifecycleManager nearbyLifecycleManager4 = NearbyLifecycleManager.LL;
                        NearbyLifecycleManager.LLILLL = true;
                        Iterator it4 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it4.hasNext()) {
                            ((InterfaceC1204310hRd) it4.next()).onResume();
                        }
                        break;
                    case 4:
                        NearbyLifecycleManager nearbyLifecycleManager5 = NearbyLifecycleManager.LL;
                        NearbyLifecycleManager.LLILLL = false;
                        Iterator it5 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it5.hasNext()) {
                            ((InterfaceC1204310hRd) it5.next()).onPause();
                        }
                        break;
                    case 5:
                        NearbyLifecycleManager nearbyLifecycleManager6 = NearbyLifecycleManager.LL;
                        Iterator it6 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it6.hasNext()) {
                            ((InterfaceC1204310hRd) it6.next()).onStop();
                        }
                        break;
                    case 6:
                        NearbyLifecycleManager nearbyLifecycleManager7 = NearbyLifecycleManager.LL;
                        Iterator it7 = ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).iterator();
                        while (it7.hasNext()) {
                            ((InterfaceC1204310hRd) it7.next()).onDestroy();
                        }
                        break;
                }
            }
        });
        if (!C1581510rG1.LIZLLL()) {
            NearbyLifecycleManager.LIZ(this, new InterfaceC1204310hRd(this) { // from class: X.0qzl
                public final Fragment LIZ;

                @Override // X.InterfaceC1204310hRd
                public final void onCreate() {
                }

                @Override // X.InterfaceC1204310hRd
                public final void onDestroy() {
                }

                @Override // X.InterfaceC1204310hRd
                public final void onPause() {
                }

                @Override // X.InterfaceC1204310hRd
                public final void onResume() {
                }

                @Override // X.InterfaceC1204310hRd
                public final void onStart() {
                }

                @Override // X.InterfaceC1204310hRd
                public final void onStop() {
                }

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1204310hRd
                public final void onNodeHide(Bundle bundle2) {
                    Fragment fragment;
                    IMFToolBarAbility iMFToolBarAbilityLJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TabThemeObserver onNodeHide, args: ");
                    sbLIZ2.append(bundle2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C19EG activity2 = this.LIZ.getActivity();
                    if (activity2 != null && !C960203pA.LIZIZ(activity2) && Intrinsics.LJFF(bundle2.getString("fromStart"), "MainFragment") && !Intrinsics.LJFF(bundle2.getString("toPage"), "homepage_explore") && !Intrinsics.LJFF(bundle2.getString("toPage"), "Shop")) {
                        AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(activity2).y01();
                        if (abstractC1591090rVTY01 != null) {
                            abstractC1591090rVTY01.LJIILIIL(true);
                        }
                        Object objLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(activity2);
                        if (objLJIIIIZZ != null && (objLJIIIIZZ instanceof Fragment) && (fragment = (Fragment) objLJIIIIZZ) != null && (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragment)) != null) {
                            iMFToolBarAbilityLJ.ae0(null, true);
                        }
                    }
                }

                @Override // X.InterfaceC1204310hRd
                public final void onNodeShow(Bundle bundle2) {
                    Boolean boolValueOf;
                    TopTabAbility topTabAbilityLIZ;
                    Fragment fragment;
                    IMFToolBarAbility iMFToolBarAbilityLJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TabThemeObserver onNodeShow, args: ");
                    sbLIZ2.append(bundle2);
                    sbLIZ2.append(", dark: ");
                    Context context = this.LIZ.getContext();
                    if (context != null) {
                        boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ2.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C19EG activity2 = this.LIZ.getActivity();
                    if (activity2 != null && !C960203pA.LIZIZ(activity2)) {
                        Object objLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(activity2);
                        if (objLJIIIIZZ != null && (objLJIIIIZZ instanceof Fragment) && (fragment = (Fragment) objLJIIIIZZ) != null && (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragment)) != null) {
                            iMFToolBarAbilityLJ.Rt2(null, false);
                        }
                        EnumC1571190qzN enumC1571190qzN = EnumC1571190qzN.LIGHT;
                        AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(activity2).y01();
                        if (abstractC1591090rVTY01 != null) {
                            abstractC1591090rVTY01.LJJJLZIJ(null, enumC1571190qzN);
                            abstractC1591090rVTY01.LJIILIIL(false);
                        }
                        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(activity2);
                        if (mainActivityScopeLIZJ != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null) {
                            topTabAbilityLIZ.Tr0("Nearby", enumC1571190qzN, enumC1571190qzN);
                        }
                    }
                }
            });
        }
        NearbyLifecycleManager.LIZ(this, new InterfaceC1204310hRd(this) { // from class: X.0hRc
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(819));

            @Override // X.InterfaceC1204310hRd
            public final void onCreate() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onDestroy() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onPause() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onResume() {
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStart() {
                ((InterfaceC1602960roc) this.LIZ.getValue()).start();
            }

            @Override // X.InterfaceC1204310hRd
            public final void onStop() {
                ((InterfaceC1602960roc) this.LIZ.getValue()).stop();
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeHide(Bundle bundle2) {
                ((InterfaceC1602960roc) this.LIZ.getValue()).stop();
            }

            @Override // X.InterfaceC1204310hRd
            public final void onNodeShow(Bundle bundle2) {
                ((InterfaceC1602960roc) this.LIZ.getValue()).start();
            }
        });
        NearbyLifecycleManager.LIZ(this, this.LLJJIJI);
        this.LLJJIII = (C11JF) C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0hRX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NearbyFragment@706.listenLifecycle$1");
                if (((C606810Nr5) obj).LIZIZ) {
                    C1204910hSb.LIZ.getClass();
                    C1205170hT1.LIZ.getClass();
                    if (C1205170hT1.LIZIZ) {
                        C1204910hSb.LIZ();
                    }
                } else {
                    C1204910hSb.LIZ.getClass();
                    C1205170hT1.LIZ.getClass();
                    if (C1205170hT1.LIZIZ) {
                        C1204910hSb.LIZIZ();
                    }
                }
                C1C7U.LIZIZ("NearbyFragment@706.listenLifecycle$1");
            }
        });
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "nearby_preload", false, false) && (activity = getActivity()) != null) {
            C686930Qx1 c686930Qx1 = new C686930Qx1(activity);
            C1200910hM9 c1200910hM9 = new C1200910hM9(c686930Qx1);
            this.LLJILLL = c1200910hM9;
            Integer numLIZLLL = c686930Qx1.LIZLLL(R.layout.ds3);
            if (numLIZLLL != null) {
                iIntValue = numLIZLLL.intValue();
            }
            int i = 12 - iIntValue;
            if (i > 0) {
                C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS29S0101000_18(i, c1200910hM9, 14));
            }
        }
        C0NRY.LIZ.storeBoolean("enter_nearby", true);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        NearbyLifecycleManager.LL.onNodeHide(bundle);
        UR();
        C1204910hSb.LIZ.getClass();
        C1204910hSb.LIZ();
        C1204910hSb.LIZJ = null;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        NearbyLifecycleManager.LL.onNodeShow(bundle);
        RR();
        C1204910hSb.LIZ.getClass();
        C1204910hSb.LIZIZ();
    }

    public final Rect aS(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        int iLIZ;
        int iIntValue2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.p4e);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                Bundle bundle2 = this.LLJJI;
                if (bundle2 != null) {
                    Integer numValueOf2 = Integer.valueOf(bundle2.getInt("nearby_top_margin"));
                    if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                        numValueOf2 = null;
                    }
                    Bundle bundle3 = this.LLJJI;
                    if (bundle3 != null) {
                        numValueOf = Integer.valueOf(bundle3.getInt("nearby_bottom_margin"));
                        if (numValueOf != null && numValueOf.intValue() == 0) {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf2 != null) {
                        iLIZ = numValueOf2.intValue();
                    } else {
                        iLIZ = C338910DQj.LIZ(requireActivity());
                    }
                    marginLayoutParams.topMargin = iLIZ;
                    if (numValueOf != null) {
                        iIntValue2 = numValueOf.intValue();
                    } else {
                        requireActivity();
                        iIntValue2 = C14LC.LJIILLIIL;
                    }
                    marginLayoutParams.bottomMargin = iIntValue2;
                } else {
                    marginLayoutParams.topMargin = C338910DQj.LIZ(requireActivity());
                    requireActivity();
                    marginLayoutParams.bottomMargin = C14LC.LJIILLIIL;
                }
                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.p3w);
        this.LLILZLL = frameLayout;
        if (frameLayout != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            frameLayout.setBackgroundColor(iIntValue);
        }
        this.LLIZ = (FrameLayout) view.findViewById(R.id.unavailable_container);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.eux);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0hRe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1204130hRL) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 256), 6);
        C1201620hNI c1201620hNI = C1201620hNI.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJI;
        c1201620hNI.getClass();
        c1201620hNI.LIZJ("attach_to_create_duration", new AwS33S0000100_18(jElapsedRealtime, 10));
        if (!((Boolean) C266830Acz.LIZ.getValue()).booleanValue()) {
            NearbyContainerViewModel nearbyContainerViewModelWR = WR();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(nearbyContainerViewModelWR), C0PEM.LIZJ, null, new C1204040hRC(nearbyContainerViewModelWR, (C1203960hR4) this.LLJILJILJ.getValue(), null), 2);
        }
        C1203730hQh c1203730hQh = C1203730hQh.LIZ;
        C1204050hRD c1204050hRD = new C1204050hRD(this);
        c1203730hQh.getClass();
        MutableLiveData<RoamingLocationInfo> mutableLiveData = C1203730hQh.LIZIZ;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        C013C c013c = new C013C();
        c013c.element = true;
        mediatorLiveData.addSource(mutableLiveData, new C228700uT(mediatorLiveData, c013c));
        mediatorLiveData.observe(this, c1204050hRD);
        if (C292380Bd6.LIZ && C2524709uv.LIZ) {
            C1205170hT1.LIZ.getClass();
            if (C1205170hT1.LIZJ()) {
                C1504890pGR.LIZ.getClass();
                C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
                c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
                c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
                c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
                c1499850p8JCreateBuilder.LJIIIZ = 0;
                ((RegionListApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(RegionListApi.class)).fetchNearbyRegionList(new NearbyRegionListV1Request(null, null, false)).LJL(C11S5.LIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.08FY
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        if (((BaseResponse) obj).status_code == 0) {
                            return true;
                        }
                        return false;
                    }
                }).LJJLL(new C09JN() { // from class: X.0hNP
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("NearbyRegionListCacheManager@9e49.saveRegionListCache$2");
                        NearbyRegionListV1Response nearbyRegionListV1Response = (NearbyRegionListV1Response) obj;
                        C1504890pGR c1504890pGR = C1504890pGR.LIZ;
                        String str = nearbyRegionListV1Response.currentRegionL0Code;
                        c1504890pGR.getClass();
                        C1504890pGR.LIZ(nearbyRegionListV1Response, str);
                        C1C7U.LIZIZ("NearbyRegionListCacheManager@9e49.saveRegionListCache$2");
                    }
                }, new C09JN() { // from class: X.00Pc
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("NearbyRegionListCacheManager@9e49.saveRegionListCache$3");
                        C1C7U.LIZIZ("NearbyRegionListCacheManager@9e49.saveRegionListCache$3");
                    }
                });
            }
        }
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WR().LLILZIL = PageFinder.via((Fragment) this);
        if (C1204850hSV.LIZ()) {
            C1204570hS3 c1204570hS3 = C1204570hS3.LIZIZ;
            long jLJII = c1204570hS3.LJII();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LocationChangeCard set() enterNearbyTimeLastTime = ");
            sbLIZ.append(jLJII);
            C2188811AlT.LIZIZ(sbLIZ);
            C1204570hS3.LIZJ = jLJII;
            c1204570hS3.LJIIIZ();
        }
        C19GS c19gs = null;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this.LLJILJIL, IContainerAbility.class, null, this);
        View viewLIZ = C20742916Ex.LIZ(getContext(), R.layout.dsd, viewGroup, false, -1);
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
