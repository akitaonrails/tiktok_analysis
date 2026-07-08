package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C07MI;
import X.C098200Yq;
import X.C0OM1;
import X.C0XQ7;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1190200h4s;
import X.C1190230h4v;
import X.C1191160h6Q;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1191710h7J;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
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
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsFoldedReviewsSheetViewModel;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsFoldedReviewsSheetFragment extends BasePage implements InterfaceC344240DeY, PoiReviewsFoldedReviewCell.PoiReviewCellVAbility {
    public static final C1190200h4s LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhLTMlLDggZiktJys6HELIOSJiJiPCZ9GColGyolISA7Ogk8JCEpLR02PiwpPjwAICApPQkhKSIhLCEn";
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C1749280vcc LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public PoiReviewsApi.PoiReviewsFoldedReviewsResponse LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsFoldedReviewsSheetFragment.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsFoldedReviewsSheetViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new C1190200h4s();
    }

    public PoiReviewsFoldedReviewsSheetFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsFoldedReviewsSheetViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1840);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(592);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1841), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1842), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1843), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(590), "reviews_poi_id", String.class);
        this.LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(591), "reviews_review_id", String.class);
        this.LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(593), "reviews_user_id", String.class);
        this.LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(594), "reviews_user_name", String.class);
        this.LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(582), "reviews_extra_info", String.class);
        this.LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(587), "reviews_landing_params", String.class);
        this.LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(589), "reviews_operation_enter_from", String.class);
        this.LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(588), "reviews_log_id", String.class);
        this.LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(583), "reviews_from_group_id", String.class);
        this.LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(586), "is_top", Boolean.class);
        this.LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(584), "reviews_from_review", PoiReviewsApi.PoiReviewModel.class);
        this.LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(585), "reviews_from_review_order", Integer.class);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell.PoiReviewCellVAbility
    public final C1190230h4v G1() {
        return new C1190230h4v(false);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        String string2;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        String strJ4 = "";
        if (Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), WR())) {
            Context context = getContext();
            if (context != null && (string2 = context.getString(2131846602)) != null) {
                strJ4 = string2;
            }
        } else {
            Context context2 = getContext();
            if (context2 != null && (string = context2.getString(2131846601)) != null) {
                strJ4 = string;
            }
            strJ4 = C786410Ut5.j4(strJ4, Arrays.copyOf(new Object[]{this.LLJILLL.getValue()}, 1));
        }
        c1250250idj.LIZJ = strJ4;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 1838));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final PoiReviewsApi.PoiReviewModel UR() {
        return (PoiReviewsApi.PoiReviewModel) this.LLJJJ.getValue();
    }

    public final PoiReviewsFoldedReviewsSheetViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PoiReviewsFoldedReviewsSheetViewModel) assemVMLazy.getValue();
    }

    public final String WR() {
        return (String) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String string;
        PoiReviewsApi.PoiReviewContentModel content;
        String str;
        Integer source;
        PoiReviewsApi.PoiReviewContentModel content2;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content3;
        PoiReviewsApi.PoiReviewContentModel content4;
        super.onDestroy();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String strValueOf = String.valueOf(this.LLJILJIL.getValue());
        String strValueOf2 = String.valueOf(WR());
        String strValueOf3 = String.valueOf(this.LLJIJIL.getValue());
        PoiReviewsApi.PoiReviewsFoldedReviewsResponse poiReviewsFoldedReviewsResponse = this.LLJJJJ;
        String str2 = poiReviewsFoldedReviewsResponse != null ? poiReviewsFoldedReviewsResponse.collectInfo : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        PoiReviewsApi.PoiReviewModel poiReviewModelUR = UR();
        Double d = (poiReviewModelUR == null || (content4 = poiReviewModelUR.getContent()) == null) ? null : content4.rating;
        PoiReviewsApi.PoiReviewModel poiReviewModelUR2 = UR();
        String str4 = (poiReviewModelUR2 == null || (content3 = poiReviewModelUR2.getContent()) == null) ? null : content3.text;
        int iIntValue = 0;
        int i = ((str4 == null || str4.length() == 0) ? 1 : 0) ^ 1;
        Object value = this.LLJJJIL.getValue();
        PoiReviewsApi.PoiReviewModel poiReviewModelUR3 = UR();
        Integer numValueOf = (poiReviewModelUR3 == null || (statistics = poiReviewModelUR3.getStatistics()) == null || (l = statistics.likeCount) == null) ? null : Integer.valueOf((int) l.longValue());
        PoiReviewsApi.PoiReviewModel poiReviewModelUR4 = UR();
        int size = (poiReviewModelUR4 == null || (content2 = poiReviewModelUR4.getContent()) == null || (list = content2.images) == null) ? 0 : list.size();
        boolean zLJFF = Intrinsics.LJFF(this.LLJJIJIL.getValue(), Boolean.TRUE);
        PoiReviewsApi.PoiReviewModel poiReviewModelUR5 = UR();
        if (poiReviewModelUR5 != null && (source = poiReviewModelUR5.getSource()) != null) {
            iIntValue = source.intValue();
        }
        PoiReviewsApi.PoiReviewModel poiReviewModelUR6 = UR();
        Integer numValueOf2 = (poiReviewModelUR6 == null || (content = poiReviewModelUR6.getContent()) == null || (str = content.text) == null) ? null : Integer.valueOf(str.length());
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        Integer numValueOf3 = Integer.valueOf(zLJFF ? 1 : 0);
        Integer numValueOf4 = Integer.valueOf(i);
        Integer numValueOf5 = Integer.valueOf(size);
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        linkedHashMap.put("enter_from", "poi_reviews");
        if (numValueOf3 != null && (string = numValueOf3.toString()) != null) {
            str3 = string;
        }
        linkedHashMap.put("is_top", str3);
        linkedHashMap.put("review_id", strValueOf);
        linkedHashMap.put("source", String.valueOf(iIntValue));
        linkedHashMap.put("author_id", strValueOf2);
        linkedHashMap.put("poi_id", strValueOf3);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(d));
        linkedHashMap.put("has_text", String.valueOf(numValueOf4));
        linkedHashMap.put("order", String.valueOf(value));
        linkedHashMap.put("like_cnt", String.valueOf(numValueOf));
        linkedHashMap.put("image_cnt", String.valueOf(numValueOf5));
        linkedHashMap.put("char_len", String.valueOf(numValueOf2));
        linkedHashMap.put("exit_type", "click");
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_reviews_folding_panel_exit", linkedHashMap, c1185050gwZ);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell.PoiReviewCellVAbility
    public final InterfaceC1191710h7J r0() {
        return VR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view, bundle);
        VR();
        this.LLJIJIL.getValue();
        VR();
        this.LLJILJIL.getValue();
        VR();
        WR();
        VR();
        this.LLJILLL.getValue();
        VR().LL = (String) this.LLJJ.getValue();
        VR().LLILLJJLI = (String) this.LLJJI.getValue();
        VR().LLILLL = (String) this.LLJJIII.getValue();
        VR().LLILZ = (String) this.LLJJIJI.getValue();
        VR().LLILZIL = (String) this.LLJJIJIIJIL.getValue();
        VR().LLIZLLLIL = Intrinsics.LJFF(this.LLJJIJIL.getValue(), Boolean.TRUE);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, PoiReviewsFoldedReviewCell.PoiReviewCellVAbility.class, null, null);
        }
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tgu);
        this.LLJI = (C1749280vcc) view.findViewById(R.id.w28);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            if (C07MI.LIZ(RefactorTTReviewCell.class)) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RefactorTTReviewCell.class);
            } else {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiReviewsFoldedReviewCell.class);
            }
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(1);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
        VR().vQ2(String.valueOf(this.LLJIJIL.getValue()), String.valueOf(WR()));
        AssemViewModel.asyncSubscribe$default(VR(), new C2217371BqR() { // from class: X.0h4D
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158860gGK) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1158860gGK) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, null, new AwS597S0100000_18(this, 467), new AwS562S0100000_18(this, 1839), new AwS597S0100000_18(this, 468), 4, null);
        PoiReviewsFoldedReviewsSheetViewModel poiReviewsFoldedReviewsSheetViewModelVR = VR();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            poiReviewsFoldedReviewsSheetViewModelVR.LLJ = state;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e7w, viewGroup, false);
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
