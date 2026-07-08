package com.ss.android.ugc.aweme.poi.albummix;

import X.C01GW;
import X.C098200Yq;
import X.C1175250ggl;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185440gxC;
import X.C1185450gxD;
import X.C1185490gxH;
import X.C1185640gxW;
import X.C1187230h05;
import X.C1187270h09;
import X.C1188440h22;
import X.C1189060h32;
import X.C1220000hqw;
import X.C1365870leD;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1685300txQ;
import X.C189200o6;
import X.C18JG;
import X.C19EG;
import X.C19GS;
import X.C2255108sX;
import X.C2344009Gk;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C622680Oba;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiAlbumMixFragment extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGHELIOSEyJCc5JCI6MGscJiYSJCc5JAI6MAM+KCg+LSs4";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(266), "poi_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(261), "fragment_id", Long.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(259), "enter_from", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(260), "enter_method", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(257), "collect_info", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(258), "current_poi_session_info", PoiCurrentSessionInfo.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(265), "poi_detail_response", PoiListApi.PoiDetailResponse.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(262), "poi_anchor_data", C1188440h22.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(264), "poi_detail_params", C1185410gx9.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(263), "poiAnchorMobData", C1185490gxH.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(257), "mob_data", PoiInnerPageMobData.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(259), "poi_common_mob_params", PoiCommonMobParams.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(261), "source_btm_token", String.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(267), "scroll_anchor_id", String.class);
    public final C01GW LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(260), "selected_tab_code", String.class);
    public final C736950SvV LLJJJJ;
    public C1185440gxC LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.poi.BasePage
    public final String SR() {
        return "poi_album_mix_page";
    }

    public PoiAlbumMixFragment() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2555);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(PoiHeaderTopVideosSharedViewModel.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(262), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 850));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C1185440gxC c1185440gxC = this.LLJJJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        NR(AFwS256S0000000_18.get$arr$(258));
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ((PageFinder) this.LLJJJJLIIL.getValue()));
        this.LLJJJJJIL = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
        ((PoiHeaderTopVideosSharedViewModel) this.LLJJJJ.getValue()).LLILZIL = new C1187230h05((String) this.LLIZLLLIL.getValue(), ((Number) this.LLJ.getValue()).longValue(), (C1185410gx9) this.LLJJI.getValue(), (PoiListApi.PoiDetailResponse) this.LLJILLL.getValue(), (C1188440h22) this.LLJJ.getValue(), (C1185490gxH) this.LLJJIII.getValue(), new C1185450gxD(((PoiCurrentSessionInfo) this.LLJILJILJ.getValue()).poiSessionId), (PoiListApi.PoiDetailResponse) this.LLJILLL.getValue(), (PoiCommonMobParams) this.LLJJIJIIJIL.getValue());
        ((PoiHeaderTopVideosSharedViewModel) this.LLJJJJ.getValue()).LLILZLL = (PoiInnerPageMobData) this.LLJJIJI.getValue();
        C18JG.LJII(this, "a4257.b90326", (String) this.LLJJIJIL.getValue());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "point_of_interest") && isActive()) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), getView(), c1365870leD);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiAnchorModule(C1185640gxW c1185640gxW) {
        Context context;
        C19EG c19egLIZIZ;
        if (((PoiCurrentSessionInfo) this.LLJILJILJ.getValue()).anchorModuleList != null && Intrinsics.LJFF(((PoiCurrentSessionInfo) this.LLJILJILJ.getValue()).poiId, c1185640gxW.LIZ) && Intrinsics.LJFF(((PoiCurrentSessionInfo) this.LLJILJILJ.getValue()).poiSessionId, c1185640gxW.LIZIZ) && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("abnormal_case_key", true);
        C1185440gxC c1185440gxC = this.LLJJJJJIL;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        C19EG c19egLIZIZ;
        PoiGeneralCommonParams poiGeneralCommonParams;
        String str;
        C19EG c19egLIZ;
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.getBoolean("abnormal_case_key", false) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            c19egLIZ.finish();
        }
        if (this.LLJJIJIIJIL.getValue() != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZIZ, null);
            PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJJIJIIJIL.getValue();
            if (poiCommonMobParams != null) {
                poiGeneralCommonParams = poiCommonMobParams.getPoiGeneralCommonParams();
            } else {
                poiGeneralCommonParams = null;
            }
            PoiInnerPageMobData poiInnerPageMobData = (PoiInnerPageMobData) this.LLJJIJI.getValue();
            if (poiInnerPageMobData != null) {
                str = poiInnerPageMobData.enterFrom;
            } else {
                str = null;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, new PoiCommonMobParams(poiGeneralCommonParams, new PoiPageMobCommonParams(str, null, "poi_secondary_gallery_page", null), new PoiModuleMobCommonParams("poi_secondary_gallery_page", "poi_secondary_gallery_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175250ggl(this));
        }
        C1185440gxC c1185440gxC = this.LLJJJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        IPoiAlbumMixPageAbility iPoiAlbumMixPageAbility = new IPoiAlbumMixPageAbility() { // from class: com.ss.android.ugc.aweme.poi.albummix.PoiAlbumMixFragment$loadAbility$1
            @Override // com.ss.android.ugc.aweme.poi.albummix.IPoiAlbumMixPageAbility
            public final PoiHeaderTopVideosSharedViewModel LLLLLLZ() {
                return (PoiHeaderTopVideosSharedViewModel) this.LL.LLJJJJ.getValue();
            }
        };
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiAlbumMixPageAbility.class, null);
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiAlbumMixPageAbility, IPoiAlbumMixPageAbility.class, null, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiAlbumMixPageAbility);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiAlbumMixPageAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiAlbumMixPageAbility.class.getClassLoader(), new Class[]{IPoiAlbumMixPageAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiAlbumMixPageAbility.class, null, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.albummix.IPoiAlbumMixPageAbility");
                }
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 861), 3);
        C1187270h09 c1187270h09 = C1187270h09.LIZ;
        String str2 = (String) this.LLIZLLLIL.getValue();
        String str3 = (String) this.LLJILJIL.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(this, null);
        PageFinder pageFinder = (PageFinder) this.LLJJJJLIIL.getValue();
        c1187270h09.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF2);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str2);
        C1189060h32.LIZJ(c2344009Gk, str3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_album_page", map, c1185050gwZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dye, viewGroup, false);
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
}
