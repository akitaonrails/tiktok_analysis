package com.ss.android.ugc.aweme.poi.detail.post;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0XQ7;
import X.C1175230ggj;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185450gxD;
import X.C1187610h0h;
import X.C1187970h1H;
import X.C1188090h1T;
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
import X.C280220Aya;
import X.C280230Ayb;
import X.C338520DOw;
import X.C339190DRl;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C622680Oba;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724640Sbe;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC836760Ws6;
import Y.AObserverS222S0100000_18;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS90S0110000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiPostPageFragment extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE3HELIOSLTEtICN9OCo/PWEDJywcJjwnGCQrLAkhKSIhLCEn";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(340), "data_params", C1187610h0h.class);
    public final C736950SvV LLJ;
    public View LLJI;
    public final C01GW LLJIJIL;
    public final ARunnableS118S0100000_18 LLJILJIL;
    public boolean LLJILJILJ;
    public final AObserverS222S0100000_18 LLJILLL;

    @Override // com.ss.android.ugc.aweme.poi.BasePage
    public final String SR() {
        return "poi_post_page";
    }

    public final C1187610h0h UR() {
        return (C1187610h0h) this.LLIZLLLIL.getValue();
    }

    public final PoiPostPageShareVM VR() {
        return (PoiPostPageShareVM) this.LLJ.getValue();
    }

    public PoiPostPageFragment() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2761);
        this.LLJ = new C736950SvV(C13LE.LIZ(PoiPostPageShareVM.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(421), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(341));
        this.LLJILJIL = new ARunnableS118S0100000_18(this, 38);
        this.LLJILJILJ = true;
        this.LLJILLL = new AObserverS222S0100000_18(this, 13);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PoiPostPageShareVM poiPostPageShareVMVR = VR();
        poiPostPageShareVMVR.getClass();
        poiPostPageShareVMVR.IQ2(null);
        C622680Oba.LIZLLL(this);
        C724640Sbe.LIZ().removeCallbacks(this.LLJILJIL);
        ((LiveData) this.LLJIJIL.getValue()).removeObservers(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((LiveData) this.LLJIJIL.getValue()).removeObservers(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        NR(AFwS256S0000000_18.get$arr$(420));
        C18JG.LJII(this, "a4257.b7598", UR().btmSourceToken);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "point_of_interest") && isActive()) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), getView(), c1365870leD);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("abnormal_case_key", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Integer poiPostTagStyle;
        Context context;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        PoiGeneralCommonParams poiGeneralCommonParams;
        String str2;
        PoiPageMobCommonParams poiPageMobCommonParams;
        C19EG c19egLIZ;
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.getBoolean("abnormal_case_key", false) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            c19egLIZ.finish();
        }
        view.findViewById(R.id.r6t);
        view.findViewById(R.id.r74);
        this.LLJI = view.findViewById(R.id.pg_);
        Context context2 = getContext();
        if (context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZIZ2, null);
            PoiCommonMobParams poiCommonMobParams = UR().poiCommonMobParams;
            if (poiCommonMobParams != null) {
                poiGeneralCommonParams = poiCommonMobParams.getPoiGeneralCommonParams();
            } else {
                poiGeneralCommonParams = null;
            }
            PoiCommonMobParams poiCommonMobParams2 = UR().poiCommonMobParams;
            if (poiCommonMobParams2 != null && (poiPageMobCommonParams = poiCommonMobParams2.getPoiPageMobCommonParams()) != null) {
                str2 = poiPageMobCommonParams.enterFrom;
            } else {
                str2 = null;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, new PoiCommonMobParams(poiGeneralCommonParams, new PoiPageMobCommonParams(str2, null, "poi_secondary_post_page", null), new PoiModuleMobCommonParams("poi_detail_page", "poi_secondary_post_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        C1185450gxD c1185450gxD = UR().poiDetailSessionModel;
        if (c1185450gxD != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), c1185450gxD, C1185450gxD.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175230ggj(this));
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        IPoiPostPageAbility iPoiPostPageAbility = new IPoiPostPageAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment$loadAbility$1
            @Override // com.ss.android.ugc.aweme.poi.detail.post.IPoiPostPageAbility
            public final PoiPostPageShareVM LLLLLLZ() {
                return this.LL.VR();
            }

            @Override // com.ss.android.ugc.aweme.poi.detail.post.IPoiPostPageAbility
            public final String Of2() {
                C1185450gxD c1185450gxD2 = this.LL.UR().poiDetailSessionModel;
                if (c1185450gxD2 != null) {
                    return c1185450gxD2.getSessionId();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.poi.detail.post.IPoiPostPageAbility
            public final String XP0() {
                return this.LL.UR().sourceInstanceId;
            }
        };
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiPostPageAbility.class, null);
        boolean z = true;
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiPostPageAbility, IPoiPostPageAbility.class, null, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiPostPageAbility);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiPostPageAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiPostPageAbility.class.getClassLoader(), new Class[]{IPoiPostPageAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiPostPageAbility.class, null, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.post.IPoiPostPageAbility");
                }
            }
        }
        VR().LLILZIL = UR();
        C1188090h1T c1188090h1T = ((C1187970h1H) VR().getState()).LLILLJJLI;
        if (c1188090h1T == null || (poiMergedListResponse = c1188090h1T.poiInitPostModule) == null || (poiPostTagStyle = poiMergedListResponse.getPoiPostTagStyle()) == null || poiPostTagStyle.intValue() != 1) {
            z = false;
        }
        C723850SaN.LIZ(this, false, null, new AwS90S0110000_2(this, z, 11), 3);
        if (C280220Aya.LIZ() && C280230Ayb.LIZ() && ComplianceServiceProvider.LJI().LJIIJ(false)) {
            if (!Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
                View view2 = this.LLJI;
                if (view2 != null) {
                    C339190DRl.LIZIZ(view2);
                    return;
                }
                return;
            }
            View view3 = this.LLJI;
            if (view3 != null) {
                C786410Ut5.I7(new AkS81S0100000_9(this, 14), view3);
            }
            View view4 = this.LLJI;
            if (view4 != null) {
                C339190DRl.LIZLLL(view4);
            }
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(this, null);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF2);
            c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("login_type", str);
            c2344009Gk.LJIIIIZZ("scenario", CardStruct.IStatusCode.DEFAULT);
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("show_feed_personalization_toast", map, c1185050gwZ);
            C724640Sbe.LIZ().removeCallbacks(this.LLJILJIL);
            C786410Ut5.LJLIIL(3000L, C724640Sbe.LIZ(), this.LLJILJIL);
            ((LiveData) this.LLJIJIL.getValue()).observe(this, this.LLJILLL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e68, viewGroup, false);
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
