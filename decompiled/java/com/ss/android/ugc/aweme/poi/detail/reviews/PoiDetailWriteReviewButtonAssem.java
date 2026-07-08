package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.AbstractC1189550h3p;
import X.C1153950g8P;
import X.C1184850gwF;
import X.C1189520h3m;
import X.C1190160h4o;
import X.C123100dR;
import X.C1440005kM;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1871910yoP;
import X.C197039127h;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C262100zr;
import X.C586460MzM;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1871920yoQ;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailWriteReviewButtonAssem extends PoiDetailBaseUiSlotComponent<Object> implements InterfaceC1141530foN {
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723590SZx(this, C1153950g8P.class, "PoiWriteReviewButtonHierarchyData"), checkSupervisorPrepared());
    public AwS419S0200000_18 LLJJIJIIJIL;
    public C197039127h LLJJIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e12;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("syncReviewToNative", this);
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        AwS419S0200000_18 awS419S0200000_18;
        String strValueOf;
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        boolean zLIZIZ = false;
        String strLJFF2 = null;
        interfaceC1871920yoQLIZ = null;
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "syncReviewToNative")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                if (strLJFF3 != null && strLJFF3.length() != 0) {
                    strValueOf = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                } else {
                    strValueOf = String.valueOf(C1871910yoP.LIZJ(interfaceC1107590evd, "review_id", 0.0d));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceiveJsEvent - poi_id: ");
                sbLIZ.append(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", ""));
                sbLIZ.append(", review_id: ");
                sbLIZ.append(strValueOf);
                sbLIZ.append(", create_time: ");
                sbLIZ.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0));
                sbLIZ.append(", rating: ");
                sbLIZ.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0));
                sbLIZ.append(", review_text: ");
                sbLIZ.append(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""));
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                C1190160h4o c1190160h4o = C1190160h4o.LIZ;
                c1190160h4o.getClass();
                PoiReviewsApi.PoiReviewModel poiReviewModel = C1190160h4o.LIZJ;
                if ((poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), C1871910yoP.LJFF(interfaceC1107590evd, "review_id", ""))) || !C123100dR.LIZ(strValueOf) || C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0) <= 0) {
                    return;
                }
                if (C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0) <= 0 && !C123100dR.LIZ(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""))) {
                    return;
                }
                String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "");
                String strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                double dLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0);
                String strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd, "review_text", "");
                long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0);
                List listLIZJ = C1190160h4o.LIZJ(C1871910yoP.LIZ(interfaceC1107590evd, "review_images", null));
                InterfaceC1107590evd interfaceC1107590evdLJ2 = C1871910yoP.LJ(interfaceC1107590evd, "user_level_info");
                if (interfaceC1107590evdLJ2 != null) {
                    numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evdLJ2, "level", 0));
                } else {
                    numValueOf = null;
                }
                UrlModel urlModel = new UrlModel();
                InterfaceC1107590evd interfaceC1107590evdLJ3 = C1871910yoP.LJ(interfaceC1107590evd, "user_level_info");
                if (interfaceC1107590evdLJ3 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evdLJ3, "level_badge")) != null) {
                    interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evdLJ, "url_list", null);
                }
                urlModel.setUrlList(C1190160h4o.LIZJ(interfaceC1871920yoQLIZ));
                PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel = new PoiReviewsApi.PoiReviewUserLevelInfoModel(numValueOf, null, urlModel, null);
                c1190160h4o.getClass();
                PoiReviewsApi.PoiReviewModel poiReviewModelLIZ = C1190160h4o.LIZ(strLJFF4, strLJFF5, dLIZLLL, strLJFF6, jLIZLLL, listLIZJ, false, poiReviewUserLevelInfoModel);
                C1190160h4o.LIZJ = poiReviewModelLIZ;
                C1190160h4o.LIZIZ = poiReviewModelLIZ.getPoiId();
                C1440005kM.LIZ(new C586460MzM(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "")));
                this.LLJJIJIIJIL = new AwS419S0200000_18(this, interfaceC1107590evd, 68);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "originalPostSource", "")) == null) {
            strLJFF = "";
        }
        AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1189520h3m.class.newInstance();
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null) {
            boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd3, "isSubmitReviewSuccess", false));
        } else {
            boolValueOf = null;
        }
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd4, "isFinalPage", false);
        }
        if (!abstractC1189550h3p.LIZIZ(strLJFF)) {
            return;
        }
        if (!zLIZIZ) {
            this.LLJJIJIIJIL = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
        if (interfaceC1107590evd5 != null) {
            strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd5, "poiID", "");
        }
        C1440005kM.LIZ(new C586460MzM(strLJFF2));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1184850gwF.LIZ.getClass();
            C1184850gwF.LIZIZ(fragmentLJI);
        }
        if (!zLIZIZ || (awS419S0200000_18 = this.LLJJIJIIJIL) == null) {
            return;
        }
        awS419S0200000_18.invoke();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h;
        super.onViewCreated(view);
        if (so()) {
            this.LLJJIJIL = (C197039127h) LJJIJL().findViewById(R.id.r1r);
        }
        if (!((C1153950g8P) this.LLJJIJI.getValue()).LL && (c197039127h = this.LLJJIJIL) != null) {
            c197039127h.setButtonStartIcon(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        if (poiDetailResponse != null) {
            C197039127h c197039127h = this.LLJJIJIL;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
            C197039127h c197039127h2 = this.LLJJIJIL;
            if (c197039127h2 != null) {
                C786410Ut5.I7(new AkS57S0200000_18(this, poiDetailResponse, 29), c197039127h2);
            }
            C197039127h c197039127h3 = this.LLJJIJIL;
            if (c197039127h3 != null) {
                C2211631BhB.LJ(c197039127h3, new AwS384S0200000_18(this, poiDetailResponse, 214));
            }
        }
    }
}
