package irm;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0PEM;
import X.C0XF1;
import X.C0XQ7;
import X.C1173890geZ;
import X.C1180010goR;
import X.C1180020goS;
import X.C1180040goU;
import X.C1180050goV;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1193930hAt;
import X.C1389890mGx;
import X.C1519805xE;
import X.C1558520qew;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1519705xD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.content.poicampaign.HashtagInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PhoneInfo;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsNpsItemCell;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AkS9S0400000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS9S0400000_18 akS9S0400000_18, View view) {
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        Context context = ((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = ((PhoneInfo) akS9S0400000_18.l1).phonePrefix;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(((PhoneInfo) akS9S0400000_18.l1).phoneNumber);
        C1193930hAt.LIZ(context, C2188811AlT.LIZIZ(sbLIZ));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = ((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) akS9S0400000_18.l2).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0).Oo();
        String initialEnterFrom = null;
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) akS9S0400000_18.l3;
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailFoodHeaderAssem) akS9S0400000_18.l0).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIJLIJ(str4, collectInfo, str, str2, initialEnterFrom, interfaceC665370Q7zLJIIL, pageFinderZo);
    }

    public static final void LIZ$1(AkS9S0400000_18 akS9S0400000_18, View view) {
        HashtagInfo hashtagInfo;
        String str;
        MyMomentsData myMomentsData = (MyMomentsData) akS9S0400000_18.l0;
        if (myMomentsData != null && (hashtagInfo = myMomentsData.hashtagInfo) != null && (str = hashtagInfo.hashtagName) != null) {
            MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) akS9S0400000_18.l1;
            Context context = ((TuxTextView) akS9S0400000_18.l2).getContext();
            myMomentsMainElementsAssem.getClass();
            MyMomentsMainElementsAssem.ap(context, str);
            C1389890mGx c1389890mGx = new C1389890mGx(FragmentManager.LJJJJLL((View) akS9S0400000_18.l3));
            c1389890mGx.LJIIIZ(2131823060);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$2(AkS9S0400000_18 akS9S0400000_18, View view) {
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        Context context = ((PoiDetailHeaderAssem) akS9S0400000_18.l0).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = ((PhoneInfo) akS9S0400000_18.l1).phonePrefix;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(((PhoneInfo) akS9S0400000_18.l1).phoneNumber);
        C1193930hAt.LIZ(context, C2188811AlT.LIZIZ(sbLIZ));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = ((PoiDetailHeaderAssem) akS9S0400000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) akS9S0400000_18.l2).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS9S0400000_18.l0).Oo();
        String initialEnterFrom = null;
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS9S0400000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) akS9S0400000_18.l3;
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS9S0400000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) akS9S0400000_18.l0).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIJLIJ(str4, collectInfo, str, str2, initialEnterFrom, interfaceC665370Q7zLJIIL, pageFinderZo);
    }

    public static final void LIZ$3(AkS9S0400000_18 akS9S0400000_18, View view) {
        int iIntValue;
        if (((C1180050goV) akS9S0400000_18.l0).getContext() != null) {
            C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
            Context context = ((C1180050goV) akS9S0400000_18.l0).getContext();
            c1519805xE.getClass();
            if (!C0XF1.LIZLLL(context)) {
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiReviewsNpsItemCell) akS9S0400000_18.l1);
                if (fragmentLJIIJ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJIIJ);
                    c1389890mGx.LJIIIZ(2131830001);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
        }
        ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).N5();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        C1180040goU.LIZ(curUserId, true);
        if (((PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2).getStoreNpsInfo().hasDoClick) {
            return;
        }
        ((PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2).getStoreNpsInfo().setHasDoClick(true);
        ((C1180050goV) akS9S0400000_18.l0).setUrl(((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).selectedUrl);
        ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).getClass();
        TuxTextView tuxTextView = ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).LL;
        if (tuxTextView != null) {
            tuxTextView.setText(((PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2).getResponseTitle());
        }
        ((PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2).getStoreNpsInfo().setSelectedScore(((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).score);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).N5();
        String str = ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).N5().LL;
        String strZZ1 = ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).N5().ZZ1();
        String strXQ2 = ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).N5().xQ2();
        String strValueOf = String.valueOf(((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).score);
        PageFinder pageFinderI5 = ((PoiReviewsNpsItemCell) akS9S0400000_18.l1).I5();
        c1185430gxB.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LJJ("reviews_id", strXQ2, linkedHashMap);
        C1189060h32.LJJ("star_level", strValueOf, linkedHashMap);
        C1189060h32.LIZ(strZZ1, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderI5);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_reviews_csat_click", linkedHashMap, c1185050gwZ);
        PoiReviewsNpsItemCell poiReviewsNpsItemCell = (PoiReviewsNpsItemCell) akS9S0400000_18.l1;
        poiReviewsNpsItemCell.T5(new AwS419S0200000_18(poiReviewsNpsItemCell, (PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3, 120));
        Integer positiveScore = ((PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2).getPositiveScore();
        if (positiveScore != null) {
            iIntValue = positiveScore.intValue();
        } else {
            iIntValue = 4;
        }
        Integer num = ((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).score;
        if (num != null && num.intValue() > 0 && ((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).score.intValue() < iIntValue) {
            PoiReviewsNpsItemCell poiReviewsNpsItemCell2 = (PoiReviewsNpsItemCell) akS9S0400000_18.l1;
            PoiReviewsApi.PoiNpsInfo poiNpsInfo = (PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2;
            poiReviewsNpsItemCell2.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1180010goR(poiNpsInfo, poiReviewsNpsItemCell2, null), 3);
            return;
        }
        Integer num2 = ((PoiReviewsApi.ScoreInfo) akS9S0400000_18.l3).score;
        if (num2 == null || num2.intValue() < iIntValue) {
            return;
        }
        PoiReviewsNpsItemCell poiReviewsNpsItemCell3 = (PoiReviewsNpsItemCell) akS9S0400000_18.l1;
        PoiReviewsApi.PoiNpsInfo poiNpsInfo2 = (PoiReviewsApi.PoiNpsInfo) akS9S0400000_18.l2;
        poiReviewsNpsItemCell3.getClass();
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1180020goS(poiNpsInfo2, poiReviewsNpsItemCell3, null), 3);
    }

    public static final void LIZ$4(AkS9S0400000_18 akS9S0400000_18, View view) {
        ((C1173890geZ) akS9S0400000_18.l0).LIZ((Aweme) akS9S0400000_18.l1, ((GetStoryOnThisDayInfoResponse) akS9S0400000_18.l2).getAwemes(), (Function1) akS9S0400000_18.l3);
    }

    public static final void LIZ$5(AkS9S0400000_18 akS9S0400000_18, View view) {
        ((C1173890geZ) akS9S0400000_18.l0).LIZ((Aweme) akS9S0400000_18.l1, ((GetStoryOnThisDayInfoResponse) akS9S0400000_18.l2).getAwemes(), (Function1) akS9S0400000_18.l3);
    }

    public static final void LIZ$6(AkS9S0400000_18 akS9S0400000_18, View view) {
        ((C1173890geZ) akS9S0400000_18.l0).LIZ((Aweme) akS9S0400000_18.l1, ((GetStoryOnThisDayInfoResponse) akS9S0400000_18.l2).getAwemes(), (Function1) akS9S0400000_18.l3);
    }

    public static final void LIZ$7(AkS9S0400000_18 akS9S0400000_18, View view) {
        String str;
        String str2;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        Context context = ((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = ((PhoneInfo) akS9S0400000_18.l1).phonePrefix;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(((PhoneInfo) akS9S0400000_18.l1).phoneNumber);
        C1193930hAt.LIZ(context, C2188811AlT.LIZIZ(sbLIZ));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = ((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0).cp().LL;
        String collectInfo = ((PoiListApi.PoiDetailResponse) akS9S0400000_18.l2).getCollectInfo();
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0).Oo();
        String initialEnterFrom = null;
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) akS9S0400000_18.l3;
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0);
        PageFinder pageFinderZo = ((PoiDetailTravelHeaderAssemV2) akS9S0400000_18.l0).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIJLIJ(str4, collectInfo, str, str2, initialEnterFrom, interfaceC665370Q7zLJIIL, pageFinderZo);
    }

    public AkS9S0400000_18(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
