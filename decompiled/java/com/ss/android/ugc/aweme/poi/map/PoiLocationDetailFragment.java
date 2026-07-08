package com.ss.android.ugc.aweme.poi.map;

import X.AbstractC2361009My;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C036E;
import X.C03H5;
import X.C098200Yq;
import X.C0TVI;
import X.C0ZP4;
import X.C1174730gfv;
import X.C1175290ggp;
import X.C1181430gqj;
import X.C1188440h22;
import X.C1188530h2B;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1388190mED;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C18JG;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C286740BLs;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1179630gnp;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiLocationDetailFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1740760vOs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE+HELIOSKTViGSA6BCovKDs6JysILDsyISkKOy40JSAiPQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(364), "poi_id", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(438), "enter_from", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(439), "enter_method", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(440), "mob_param", LocationDetailMobParam.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(443), "poi_collect_mob_data", C1188530h2B.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(444), "source_btm_token", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(363), "poi_common_mob_params", PoiCommonMobParams.class);
    public View LLJILLL;
    public FrameLayout LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public C1749280vcc LLJJJ;
    public C1188440h22 LLJJJIL;
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiLocationDetailFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/map/PoiMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b6238";
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

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public PoiLocationDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1353);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(445);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1354), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1355), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1356), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy;
    }

    public final PoiMapViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiMapViewModel) assemVMLazy.getValue();
    }

    public final void UR() {
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 383), 3);
        View view = this.LLJILLL;
        if (view == null) {
            view = null;
        }
        this.LLJJ = (FrameLayout) view.findViewById(R.id.i7l);
        View view2 = this.LLJILLL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJJI = view2.findViewById(R.id.view_bg_bottom);
        View view3 = this.LLJILLL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJJIII = view3.findViewById(R.id.l_a);
        View view4 = this.LLJILLL;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJJIJI = view4.findViewById(R.id.lek);
        View view5 = this.LLJILLL;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJJIJIIJIL = view5.findViewById(R.id.dz8);
        View view6 = this.LLJILLL;
        if (view6 == null) {
            view6 = null;
        }
        this.LLJJIJIL = view6.findViewById(R.id.dvg);
        View view7 = this.LLJILLL;
        if (view7 == null) {
            view7 = null;
        }
        this.LLJJJ = (C1749280vcc) view7.findViewById(R.id.w28);
        View view8 = this.LLJJIII;
        if (view8 == null) {
            view8 = null;
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 62), view8);
        View view9 = this.LLJJIJI;
        if (view9 == null) {
            view9 = null;
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 25, 42), view9);
        View view10 = this.LLJJI;
        if (view10 == null) {
            view10 = null;
        }
        C786410Ut5.LJLLLLLL(0, view10);
        View view11 = this.LLJJIJIIJIL;
        if (view11 == null) {
            view11 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view11.getLayoutParams();
        View view12 = this.LLJILLL;
        marginLayoutParams.topMargin = C497820Jfg.LIZJ((view12 != null ? view12 : null).getContext());
        SR().vQ2(EnumC1179630gnp.STATUS_PAGE_INIT);
    }

    public final String getPoiId() {
        return (String) this.LLIZ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJI("poi_map", new AbstractC2361009My() { // from class: X.0goI
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                String poiId = this.LL.getPoiId();
                C1188440h22 c1188440h22 = this.LL.LLJJJIL;
                c1185430gxB.getClass();
                return C1185430gxB.LIZ("poi_map", poiId, c1188440h22, null);
            }
        });
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SR().setState(new AwS32S0001000_18(configuration.orientation, 10));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(441));
        activityConfiguration(AFwS256S0000000_18.get$arr$(442));
        C18JG.LJII(this, "a4257.b6238", (String) this.LLJILJIL.getValue());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        C19EG c19egLIZIZ;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0J0c
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJILJILJ.getValue();
        if (poiCommonMobParams != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), new PoiCommonMobParams(poiCommonMobParams.getPoiGeneralCommonParams(), new PoiPageMobCommonParams((String) this.LLIZLLLIL.getValue(), null, "poi_secondary_map_static_page", null), new PoiModuleMobCommonParams((String) this.LLIZLLLIL.getValue(), "poi_secondary_map_static_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175290ggp(this));
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0goJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179620gno) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 132), 6);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0gns
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179620gno) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 133), 6);
        getContext();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            C1749280vcc c1749280vcc = this.LLJJJ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            HandlerHook.viewPost(c1749280vcc, new ARunnableS102S0100000_2(this, 93));
            SR().vQ2(EnumC1179630gnp.STATUS_POI_DETAIL_FAIL);
        } else {
            PoiMapViewModel poiMapViewModelSR = SR();
            poiMapViewModelSR.withState(new AwS132S1100000_18(poiMapViewModelSR, getPoiId(), 21));
        }
        C2211631BhB.LJIIL(this, getActivity());
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        Boolean bool = Boolean.TRUE;
        C1174730gfv.LJIIJ(c1174730gfv, null, null, interfaceC665370Q7zLJFF, "poi_detail", bool, pageFinderVia, 7);
        C1174730gfv.LJIIIZ(c1174730gfv, null, null, null, null, null, null, null, null, bool, C1558360qeg.LJFF(this, null), PageFinder.via((Fragment) this), 510);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context context;
        C19EG c19egLIZIZ;
        Intent intent;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null) {
            long longExtra = intent.getLongExtra("page_start_ts", -1L);
            if (longExtra > 0) {
                SR().LLILLJJLI = Long.valueOf(longExtra);
                C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                C1199450hJn c1199450hJn = new C1199450hJn("poi_map");
                c1199450hJn.LIZLLL = "page_open";
                c1199450hJn.LIZ(System.currentTimeMillis() - longExtra);
                c1199460hJo.getClass();
                C1199460hJo.LIZ(c1199450hJn);
            }
        }
        if (C286740BLs.LIZ()) {
            Context context2 = getContext();
            if (context2 == null) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.e4n, viewGroup, false);
            } else {
                viewTd = C1181430gqj.LIZIZ(context2, R.layout.e4n, viewGroup, false);
            }
            this.LLJILLL = viewTd;
            UR();
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.e4n, viewGroup, false);
            this.LLJILLL = viewTd;
            UR();
        }
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
