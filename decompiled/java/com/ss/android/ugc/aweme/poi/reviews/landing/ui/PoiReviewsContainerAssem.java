package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.C019F;
import X.C1190460h5I;
import X.C1208670hYf;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsContentCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsContainerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIII;
    public C1846060y8i LLJJIJI;
    public boolean LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1190460h5I.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
    public final Queue<Integer> LLJJIJIIJIL = new LinkedList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsContainerAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewsContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 750), AFwS256S0000000_18.get$arr$(579), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e7u;
    }

    public final PoiReviewsLandingViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.view_pager);
        this.LLJJIJI = (C1846060y8i) view.findViewById(R.id.wx3);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1846060y8i c1846060y8i = this.LLJJIJI;
            if (c1846060y8i != null) {
                c1846060y8i.setBackgroundColor(iIntValue);
            }
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PoiReviewsContentCell.class);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0h5w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190280h50) obj).LLILZ;
            }
        }, null, new AwS454S0200000_18(this, view, 16), 6);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.registerOnPageChangeCallback(new C1208670hYf(this, 3));
        }
        C1846060y8i c1846060y8i2 = this.LLJJIJI;
        if (c1846060y8i2 != null) {
            c1846060y8i2.LIZ(new InterfaceC1846110y8n() { // from class: X.0h5x
                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    String str;
                    PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ;
                    List<PoiReviewsApi.PoiReviewsTabInfoModel> reviewTabInfos;
                    PoiReviewsApi.PoiReviewsTabInfoModel poiReviewsTabInfoModel;
                    AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> abstractC1623806Xk = this.LIZ.hp().getState().LLILZ;
                    Integer num = null;
                    if (abstractC1623806Xk != null && (poiReviewListResponseLIZ = abstractC1623806Xk.LIZ()) != null && (reviewTabInfos = poiReviewListResponseLIZ.getReviewTabInfos()) != null && (poiReviewsTabInfoModel = (PoiReviewsApi.PoiReviewsTabInfoModel) C13LP.LJJJLZIJ(c1845940y8W.LIZLLL, reviewTabInfos)) != null) {
                        num = poiReviewsTabInfoModel.reviewTab;
                    }
                    int value = EnumC1156340gCG.POI_REVIEW_TRIPADVISOR_TAB.getValue();
                    if (num != null && num.intValue() == value) {
                        str = "tripadvisor";
                    } else {
                        int value2 = EnumC1156340gCG.POI_REVIEW_TABELOG_TAB.getValue();
                        if (num != null && num.intValue() == value2) {
                            str = "tabelog";
                        } else {
                            str = "tiktok";
                        }
                    }
                    if (((LinkedList) this.LIZ.LLJJIJIIJIL).contains(1)) {
                        this.LIZ.hp().wQ2(C1558520qew.LJIIL(this.LIZ), str, "slide");
                    } else {
                        if (((LinkedList) this.LIZ.LLJJIJIIJIL).size() <= 0) {
                            return;
                        }
                        this.LIZ.hp().wQ2(C1558520qew.LJIIL(this.LIZ), str, "click");
                    }
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                    String str;
                    PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ;
                    List<PoiReviewsApi.PoiReviewsTabInfoModel> reviewTabInfos;
                    PoiReviewsApi.PoiReviewsTabInfoModel poiReviewsTabInfoModel;
                    AbstractC1623806Xk<PoiReviewsApi.PoiReviewListResponse> abstractC1623806Xk = this.LIZ.hp().getState().LLILZ;
                    Integer num = null;
                    if (abstractC1623806Xk != null && (poiReviewListResponseLIZ = abstractC1623806Xk.LIZ()) != null && (reviewTabInfos = poiReviewListResponseLIZ.getReviewTabInfos()) != null && (poiReviewsTabInfoModel = (PoiReviewsApi.PoiReviewsTabInfoModel) C13LP.LJJJLZIJ(c1845940y8W.LIZLLL, reviewTabInfos)) != null) {
                        num = poiReviewsTabInfoModel.reviewTab;
                    }
                    int value = EnumC1156340gCG.POI_REVIEW_TRIPADVISOR_TAB.getValue();
                    if (num != null && num.intValue() == value) {
                        str = "tripadvisor";
                    } else {
                        int value2 = EnumC1156340gCG.POI_REVIEW_TABELOG_TAB.getValue();
                        if (num != null && num.intValue() == value2) {
                            str = "tabelog";
                        } else {
                            str = "tiktok";
                        }
                    }
                    this.LIZ.hp().LLJJJJLIIL += System.currentTimeMillis() - this.LIZ.hp().LLJJL;
                    this.LIZ.hp().xQ2(C1558520qew.LJIIL(this.LIZ), str);
                }
            });
        }
    }
}
