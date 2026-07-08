package com.ss.android.ugc.aweme.poi.reviews;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0NBH;
import X.C1172760gck;
import X.C1175120ggY;
import X.C1175280ggo;
import X.C1181430gqj;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185440gxC;
import X.C1189060h32;
import X.C1190660h5c;
import X.C1191160h6Q;
import X.C1192290h8F;
import X.C123100dR;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C18JG;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C308370C6x;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C584930Mwt;
import X.C622680Oba;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import Y.AfS187S0100000_18;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS14S1210000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiReviewListFragment extends BasePage {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhHELIOSLTMlLDggZhUjIB02PiwpPgM6OzEKOy40JSAiPQ==";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(463), "poi_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(451), "enter_from", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(453), "enter_method", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(455), "initial_poi_enter_from", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(456), "initial_poi_enter_method", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(457), "initial_poi_from_group_id", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(458), "initial_poi_id", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(461), "poi_detail_enter_from", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(462), "poi_detail_enter_method", String.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(459), "poi_detail_in_sheet_mode", Boolean.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(464), "poi_reviews_mob_params", PoiReviewsMobParams.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(574), "source_btm_token", String.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(572), "pin_review_ids", List.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(570), "highlight_review_ids", List.class);
    public final C01GW LLJJJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(454), "from_group_id", String.class);
    public final C01GW LLJJJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(465), "from_review_id", String.class);
    public final C01GW LLJJJJJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(452), "tag_id", String.class);
    public final C01GW LLJJJJLIIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(460), "log_extra", String.class);
    public final C01GW LLJJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(573), "poi_common_mob_params", PoiCommonMobParams.class);
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C1185440gxC LLJL;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewListFragment.class, "globalVM", "getGlobalVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage
    public final String SR() {
        return "poi_review";
    }

    public PoiReviewListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1760);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(575);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1761), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1762), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1759), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy;
    }

    public final PoiReviewsLandingViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    public final String getPoiId() {
        return (String) this.LLIZLLLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLJLIL) {
            return;
        }
        this.LLJLL += System.currentTimeMillis() - this.LLJLILLLLZIIL;
        UR().LLJJJJLIIL += System.currentTimeMillis() - UR().LLJJL;
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = (String) this.LLJILLL.getValue();
        String str2 = (String) this.LLJIJIL.getValue();
        String str3 = (String) this.LLJILJIL.getValue();
        String str4 = (String) this.LLJJ.getValue();
        String str5 = (String) this.LLJJI.getValue();
        Object value = this.LLJ.getValue();
        Object value2 = this.LLJI.getValue();
        String poiId = getPoiId();
        String str6 = UR().LLJJI;
        if (str6 == null) {
            str6 = "";
        }
        int iLIZJ = C1175120ggY.LIZJ(UR().LLJJIII);
        Boolean bool = UR().LLJILLL;
        String str7 = ((PoiReviewsMobParams) this.LLJJIJI.getValue()).groupId;
        Object value3 = this.LLJJJIL.getValue();
        List list = (List) this.LLJJIJIL.getValue();
        Object objLJJJLL = list != null ? C13LP.LJJJLL(list) : null;
        long j = this.LLJLL;
        String str8 = (String) this.LLJJJJLIIL.getValue();
        String str9 = UR().LLJJLIIIJLLLLLLLZ;
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        c1191160h6Q.getClass();
        Map mapLIZ = C308370C6x.LIZ(null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        linkedHashMap.putAll(mapLIZ);
        C1189060h32.LJ(str8, linkedHashMap);
        C1189060h32.LJJ("initial_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str2, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str4, linkedHashMap);
        linkedHashMap.put("enter_from", value);
        linkedHashMap.put("enter_method", value2);
        linkedHashMap.put("poi_id", poiId);
        C1189060h32.LIZ(str6, linkedHashMap);
        linkedHashMap.put("review_cnt", String.valueOf(iLIZJ));
        linkedHashMap.put("page_model", Intrinsics.LJFF(bool, Boolean.TRUE) ? "panel" : "detail");
        if (value3 == null) {
            value3 = "";
        }
        linkedHashMap.put("from_group_id", value3);
        linkedHashMap.put("from_review_id", objLJJJLL != null ? objLJJJLL : "");
        C1189060h32.LJJ("group_id", str7, linkedHashMap);
        linkedHashMap.put("duration", String.valueOf(j));
        C1189060h32.LJJ("tab_name", str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_reviews_stay_time", linkedHashMap, c1185050gwZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (UR().LLJLIL && (str = UR().LLJJLIIIJLLLLLLLZ) != null) {
            UR().xQ2(C1558360qeg.LJFF(this, null), str);
        }
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LLJLIL) {
            this.LLJLILLLLZIIL = System.currentTimeMillis();
            UR().LLJJL = System.currentTimeMillis();
            C1185440gxC c1185440gxC = this.LLJL;
            if (c1185440gxC != null) {
                c1185440gxC.LJ();
            }
        }
        this.LLJLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1192290h8F.LIZ(this, "poi_reviews_main", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 447));
        NR(AFwS256S0000000_18.get$arr$(571));
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ(PageFinder.via((Fragment) this)));
        this.LLJL = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
        C18JG.LJII(this, "a4257.b9159", (String) this.LLJJIJIIJIL.getValue());
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiReviewPauseEvent(C584930Mwt c584930Mwt) {
        this.LLJLIL = c584930Mwt.LIZ;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Context context;
        C19EG c19egLIZIZ;
        super.onViewCreated(view, bundle);
        PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJJL.getValue();
        if (poiCommonMobParams != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), new PoiCommonMobParams(poiCommonMobParams.getPoiGeneralCommonParams(), new PoiPageMobCommonParams((String) this.LLJ.getValue(), null, "poi_secondary_reviews_page", null), new PoiModuleMobCommonParams(null, "poi_secondary_reviews_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175280ggo(this));
        }
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
        UR().LL = getPoiId();
        UR().LLILLJJLI = (String) this.LLJ.getValue();
        UR().LLILLL = (String) this.LLJI.getValue();
        UR().LLIZ = (String) this.LLJILLL.getValue();
        UR().LLILZ = (String) this.LLJIJIL.getValue();
        UR().LLILZIL = (String) this.LLJILJIL.getValue();
        UR().LLILZLL = (String) this.LLJILJILJ.getValue();
        UR().LLJ = (String) this.LLJJI.getValue();
        UR().LLIZLLLIL = (String) this.LLJJ.getValue();
        UR().LLJI = (String) this.LLJJJIL.getValue();
        UR().LLJIJIL = (List) this.LLJJIJIL.getValue();
        UR().LLJILJIL = (List) this.LLJJJ.getValue();
        UR();
        this.LLJJJJ.getValue();
        PoiReviewsLandingViewModel poiReviewsLandingViewModelUR = UR();
        if (C123100dR.LIZ((String) this.LLJJJJJIL.getValue())) {
            str = (String) this.LLJJJJJIL.getValue();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        poiReviewsLandingViewModelUR.LLJILJILJ = str;
        if (C123100dR.LIZ(str)) {
            str.toString();
            poiReviewsLandingViewModelUR.LLJJIJIIJIL = Collections.singletonList(str);
        }
        UR().LLJJIJI = (String) this.LLJJJJLIIL.getValue();
        UR().LLJL = PageFinder.via((Fragment) this);
        UR().LLJJ = ((PoiReviewsMobParams) this.LLJJIJI.getValue()).groupId;
        if (Intrinsics.LJFF(this.LLJ.getValue(), "poi_detail")) {
            UR().LLJILLL = Boolean.valueOf(((Boolean) this.LLJJIII.getValue()).booleanValue());
        }
        PoiReviewsLandingViewModel.vQ2(UR(), getPoiId());
        PoiReviewsLandingViewModel poiReviewsLandingViewModelUR2 = UR();
        String poiId = getPoiId();
        boolean zLIZ = C1190660h5c.LIZ();
        PoiReviewsApi.LIZ.getClass();
        C0NBH.LIZ(C1172760gck.LIZ().getPoiReviewUserStatistic(poiId, zLIZ)).LJJLL(new AfS187S0100000_18(poiReviewsLandingViewModelUR2, 68), new C09JN() { // from class: X.00Jf
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.fetchReviewStatistics$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchStatics - ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.fetchReviewStatistics$2");
            }
        });
        PoiReviewsLandingViewModel poiReviewsLandingViewModelUR3 = UR();
        poiReviewsLandingViewModelUR3.withState(new AwS14S1210000_18(false, poiReviewsLandingViewModelUR3, getPoiId(), C1558360qeg.LJFF(this, null), 2));
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 448), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context == null) {
            viewLIZIZ = null;
        } else {
            viewLIZIZ = C1181430gqj.LIZIZ(context, R.layout.e1g, viewGroup, false);
        }
        if (!(viewLIZIZ instanceof View)) {
            viewLIZIZ = null;
        }
        if (viewLIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
                viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZIZ;
    }
}
