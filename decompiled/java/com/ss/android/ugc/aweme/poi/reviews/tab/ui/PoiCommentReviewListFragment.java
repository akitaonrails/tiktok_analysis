package com.ss.android.ugc.aweme.poi.reviews.tab.ui;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1191050h6F;
import X.C1191160h6Q;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19348710mr;
import X.C19374310qz;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2187451AjH;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C295880Bik;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C523420Kfs;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC19356310o5;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommentReviewListFragment extends AmeBaseFragment implements InterfaceC1344590l5t, ICommentPageReusedProtocol, InterfaceC1349750lED, PoiNotifyTabTitleChangeAbility {
    public static final C1191050h6F LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhLTMlLDggHELIOSZjEtK2EmIWscJiYQJyghLCEnGiA6ICokBCw/PQkhKSIhLCEn";
    public Aweme LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public Long LLILLL;
    public final AssemVMLazy LLILZ;
    public boolean LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0h6F] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCommentReviewListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/reviews/tab/viewmodel/PoiCommentReviewListVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0h6F
        };
    }

    @Override // X.InterfaceC1349750lED
    public final void B7() {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable Cw(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Integer DJ() {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 10;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable aJ() {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "review_tab";
    }

    public PoiCommentReviewListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCommentReviewListVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 564);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(629);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1981), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS562S0100000_18((Fragment) this, 1982), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1983), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
    }

    public final PoiCommentReviewListVM MR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (PoiCommentReviewListVM) assemVMLazy.getValue();
    }

    public final void NR() {
        String str;
        PoiDataStruct poiDataStruct;
        if (MR().LLJIJIL) {
            MR().LLJI = System.currentTimeMillis() - MR().LLJ;
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str2 = MR().LLILZ;
            String strVQ2 = MR().vQ2();
            Aweme aweme = this.LL;
            String authorUid = aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null;
            String strWQ2 = MR().wQ2();
            Aweme aweme2 = this.LL;
            if (aweme2 == null || (poiDataStruct = aweme2.getPoiDataStruct()) == null || (str = poiDataStruct.poiId) == null) {
                str = "";
            }
            Integer numValueOf = Integer.valueOf(MR().LLIZ);
            Integer num = MR().LLILLJJLI;
            String str3 = MR().LL;
            String str4 = MR().LLILLL;
            Long l = this.LLILLL;
            Long l2 = MR().LLIZLLLIL;
            Long lValueOf = Long.valueOf(MR().LLJI);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            c1191160h6Q.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("enter_from", str2);
            if (strVQ2 == null) {
                strVQ2 = "";
            }
            linkedHashMap.put("from_group_id", strVQ2);
            if (authorUid == null) {
                authorUid = "";
            }
            linkedHashMap.put("author_id", authorUid);
            if (strWQ2 == null) {
                strWQ2 = "";
            }
            linkedHashMap.put("log_pb", strWQ2);
            linkedHashMap.put("poi_id", str);
            linkedHashMap.put("enable_location", String.valueOf(numValueOf));
            linkedHashMap.put("has_service", String.valueOf(num));
            C1189060h32.LIZ(str3, linkedHashMap);
            linkedHashMap.put("local_service_key_category", str4 != null ? str4 : "");
            linkedHashMap.put("review_cnt", String.valueOf(l));
            linkedHashMap.put("show_review_cnt", String.valueOf(l2));
            linkedHashMap.put("duration", String.valueOf(lValueOf));
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("reviews_tab_stay_time", linkedHashMap, c1185050gwZ);
            MR().LLIZLLLIL = 0L;
            MR().LLJIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.LLILZIL || MR().LLJILJIL) {
            return;
        }
        NR();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PoiCommentReviewListFragment.class.getName());
        }
        super.onResume();
        if (this.LLILZIL && !MR().LLJILJIL) {
            MR().yQ2(PageFinder.via((Fragment) this));
        }
        MR().LLJILJIL = false;
    }

    @Override // X.InterfaceC1349750lED
    public final void BC(boolean z) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (!z && (viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI) != null) {
            C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
        NR();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiNotifyTabTitleChangeAbility
    public final void KO2(Long l) {
        this.LLILLL = l;
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.K01();
        }
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
        MR().yQ2(PageFinder.via((Fragment) this));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        this.LL = aweme;
        this.LLILLL = null;
        PoiCommentReviewListVM poiCommentReviewListVMMR = MR();
        poiCommentReviewListVMMR.setState(new AwS597S0100000_18(this.LL, 1054));
        poiCommentReviewListVMMR.setState(AFwS256S0000000_18.get$arr$(1022));
        poiCommentReviewListVMMR.LLJIJIL = false;
        poiCommentReviewListVMMR.LLJILLL = 0L;
        poiCommentReviewListVMMR.LLJILJILJ = true;
        poiCommentReviewListVMMR.LLJILJIL = false;
        poiCommentReviewListVMMR.manualListRefresh();
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        Long l = this.LLILLL;
        if (l != null && l.longValue() != 0) {
            Long l2 = this.LLILLL;
            String strLJI = C20642515q3.LJI(2131844772);
            Object[] objArr = new Object[1];
            String strValueOf = null;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                if (jLongValue < 0) {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                } else if (jLongValue < 10000) {
                    strValueOf = String.valueOf(C19374310qz.LIZ(Long.valueOf(jLongValue), new C19348710mr(null, null, null, 15), null, 0, 28));
                } else {
                    strValueOf = String.valueOf(C19374310qz.LIZ(Long.valueOf(jLongValue), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
                }
            }
            objArr[0] = strValueOf;
            return C786410Ut5.j4(strLJI, Arrays.copyOf(objArr, 1));
        }
        return C786410Ut5.j4(C20642515q3.LJI(2131844772), Arrays.copyOf(new Object[]{""}, 1));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ms4);
        Aweme aweme = this.LL;
        if (aweme != null) {
            aweme.getPoiDataStruct();
        }
        MR().setState(new AwS597S0100000_18(this.LL, 1053));
        C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PoiNotifyTabTitleChangeAbility.class, null, null);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 491), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C295880Bik.LIZLLL) {
            CommentService.LIZ.getClass();
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(C523420Kfs.LIZ().getCommentThemeContext(layoutInflater.getContext())), R.layout.dyz, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.dyz, viewGroup, false);
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

    @Override // X.InterfaceC1349750lED
    public final void u5(String str, String str2, boolean z) {
        PoiNotifyAnchorTextChangeAbility poiNotifyAnchorTextChangeAbility;
        PoiNotifyAnchorTextChangeAbility poiNotifyAnchorTextChangeAbility2;
        InterfaceC665370Q7z interfaceC665370Q7zLJIILL;
        this.LLILZIL = z;
        CommentService commentService = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null);
        PoiNotifyAnchorTextChangeAbility poiNotifyAnchorTextChangeAbility3 = null;
        if (commentService != null && (interfaceC665370Q7zLJIILL = commentService.LJIILL(getActivity())) != null) {
            poiNotifyAnchorTextChangeAbility3 = (PoiNotifyAnchorTextChangeAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIILL, PoiNotifyAnchorTextChangeAbility.class, null);
        }
        if (z) {
            if (commentService != null && (poiNotifyAnchorTextChangeAbility2 = (PoiNotifyAnchorTextChangeAbility) commentService.LJJIJ(getActivity(), poiNotifyAnchorTextChangeAbility3)) != null) {
                poiNotifyAnchorTextChangeAbility2.lQ0();
            }
            MR().yQ2(PageFinder.via((Fragment) this));
        } else {
            NR();
        }
        CommentService commentService2 = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null);
        if (commentService2 != null && (poiNotifyAnchorTextChangeAbility = (PoiNotifyAnchorTextChangeAbility) commentService2.LJJIJ(getActivity(), poiNotifyAnchorTextChangeAbility3)) != null) {
            poiNotifyAnchorTextChangeAbility.iw1(z);
        }
    }
}
