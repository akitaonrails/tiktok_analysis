package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1188600h2I;
import X.C1188610h2J;
import X.C1188620h2K;
import X.C1188630h2L;
import X.C1189360h3W;
import X.C1226204qy;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C14EU;
import X.C1559260qg8;
import X.C1849470yED;
import X.C337180DJs;
import X.C418440Gaw;
import X.C614900O9w;
import X.C621450OZb;
import X.C622680Oba;
import X.C723580SZw;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1338240kve;
import Y.ACListenerS153S0100000_18;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryBottomAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, PoiGalleryBottomBarData.class, "PoiGalleryBottomBarData"), checkSupervisorPrepared());
    public C1188600h2I LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1188610h2J LLJJIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e61;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        C1188610h2J c1188610h2J;
        C1188600h2I c1188600h2I;
        String str;
        long j;
        Boolean bool;
        PoiGalleryBottomBarData poiGalleryBottomBarData = (PoiGalleryBottomBarData) this.LLJJI.getValue();
        if (poiGalleryBottomBarData != null && (c1188610h2J = this.LLJJIJIL) != null && (c1188600h2I = this.LLJJIII) != null && (str = c614900O9w.LIZIZ) != null && str.length() != 0 && Intrinsics.LJFF(c614900O9w.LIZIZ, poiGalleryBottomBarData.getPoiId())) {
            boolean z = this.LLJJIJIIJIL;
            boolean z2 = c614900O9w.LIZ;
            if (z == z2) {
                j = this.LLJJIJI;
            } else if (!z && z2) {
                j = this.LLJJIJI + 1;
            } else {
                j = this.LLJJIJI - 1;
                if (j < 0) {
                    j = 0;
                }
            }
            if (C1226204qy.LIZ()) {
                C1849470yED c1849470yED = c1188600h2I.LJIIJJI;
                View view = c1188600h2I.LJFF;
                TuxIconView tuxIconView = c1188600h2I.LJI;
                TuxTextView tuxTextView = c1188600h2I.LJII;
                PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = c1188610h2J.LIZJ;
                Double d = null;
                if (poiReviewSummaryModel != null) {
                    d = poiReviewSummaryModel.score;
                    bool = poiReviewSummaryModel.noRating;
                } else {
                    bool = null;
                }
                C621450OZb.LJ(c1849470yED, view, tuxIconView, tuxTextView, d, bool, c1188610h2J.LJI, c1188610h2J.LJFF, c1188610h2J.LJ, j, c1188600h2I.LIZ.getResources(), new C1188620h2K(c1188600h2I));
                return;
            }
            c1188600h2I.LIZ(c1188610h2J);
            C621450OZb.LIZIZ(c1188600h2I.LJIIJJI, Long.valueOf(j), c1188610h2J.LJFF, c1188610h2J.LJ, c1188610h2J.LJI, c1188600h2I.LIZ.getResources());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long jLongValue;
        long jLongValue2;
        Boolean bool;
        super.onViewCreated(view);
        C1188600h2I c1188600h2I = new C1188600h2I(view);
        this.LLJJIII = c1188600h2I;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.y0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, contextThemeWrapper);
        if (numLIZJ != null) {
            c1188600h2I.LJ.setTextColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, contextThemeWrapper);
        if (numLIZJ2 != null) {
            c1188600h2I.LJIIJ.setTextColor(numLIZJ2.intValue());
        }
        View viewFindViewById = view.findViewById(R.id.view_deals_btn);
        if (viewFindViewById != null) {
            C337180DJs.LIZ(viewFindViewById);
        }
        PoiGalleryBottomBarData poiGalleryBottomBarData = (PoiGalleryBottomBarData) this.LLJJI.getValue();
        if (poiGalleryBottomBarData == null) {
            return;
        }
        Long favCnt = poiGalleryBottomBarData.getFavCnt();
        if (favCnt != null) {
            jLongValue = favCnt.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLJJIJI = jLongValue;
        this.LLJJIJIIJIL = poiGalleryBottomBarData.isCollected();
        String poiName = poiGalleryBottomBarData.getPoiName();
        String headImgUrl = poiGalleryBottomBarData.getHeadImgUrl();
        PoiReviewsApi.PoiReviewSummaryModel reviewSummary = poiGalleryBottomBarData.getReviewSummary();
        Long favCnt2 = poiGalleryBottomBarData.getFavCnt();
        String categoryName = poiGalleryBottomBarData.getCategoryName();
        String locationDesc = poiGalleryBottomBarData.getLocationDesc();
        int bottomBarStyle = poiGalleryBottomBarData.getBottomBarStyle();
        C1188610h2J c1188610h2J = new C1188610h2J(poiName, headImgUrl, reviewSummary, favCnt2, categoryName, locationDesc, bottomBarStyle);
        this.LLJJIJIL = c1188610h2J;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_post_detail", "poi_header_img", new C1180560gpK(new ContextThemeWrapper(view.getContext(), R.style.y0), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(6))), new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))))));
        if (headImgUrl == null) {
            headImgUrl = "";
        }
        C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(headImgUrl);
        c1189360h3WLIZIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(6);
        c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZIZ.LIZLLL(c1188600h2I.LIZIZ);
        c1189360h3WLIZIZ.LIZIZ();
        c1188600h2I.LJ.setText(poiName);
        if (bottomBarStyle == 3) {
            C337180DJs.LIZJ(c1188600h2I.LIZJ);
            C337180DJs.LIZJ(c1188600h2I.LIZLLL);
        } else {
            C337180DJs.LIZ(c1188600h2I.LIZJ);
            C337180DJs.LIZ(c1188600h2I.LIZLLL);
        }
        if (favCnt2 != null) {
            jLongValue2 = favCnt2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (C1226204qy.LIZ()) {
            C1849470yED c1849470yED = c1188600h2I.LJIIJJI;
            View view2 = c1188600h2I.LJFF;
            TuxIconView tuxIconView = c1188600h2I.LJI;
            TuxTextView tuxTextView = c1188600h2I.LJII;
            Double d = null;
            if (reviewSummary != null) {
                d = reviewSummary.score;
                bool = reviewSummary.noRating;
            } else {
                bool = null;
            }
            C621450OZb.LJ(c1849470yED, view2, tuxIconView, tuxTextView, d, bool, bottomBarStyle, locationDesc, categoryName, jLongValue2, view.getResources(), new C1188630h2L(c1188600h2I));
        } else {
            c1188600h2I.LIZ(c1188610h2J);
            C621450OZb.LIZIZ(c1188600h2I.LJIIJJI, Long.valueOf(jLongValue2), c1188610h2J.LJFF, c1188610h2J.LJ, c1188610h2J.LJI, view.getResources());
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 58), view.findViewById(R.id.view_poi_click_area));
        PoiGalleryBottomBarData poiGalleryBottomBarData2 = (PoiGalleryBottomBarData) this.LLJJI.getValue();
        if (poiGalleryBottomBarData2 != null) {
            C723850SaN.LIZLLL(this, new AwS384S0200000_18(this, poiGalleryBottomBarData2, 205));
        }
    }
}
