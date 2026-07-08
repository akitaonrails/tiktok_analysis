package com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel;

import X.C09JN;
import X.C0NBH;
import X.C1172760gck;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1189060h32;
import X.C1190280h50;
import X.C1191160h6Q;
import X.C2188811AlT;
import X.C2365509Or;
import X.EnumC1186570gz1;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import Y.AfS187S0100000_18;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsLandingViewModel extends AssemViewModel<C1190280h50> {
    public static final /* synthetic */ int LLJLL = 0;
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public List<String> LLJIJIL;
    public List<String> LLJILJIL;
    public String LLJILJILJ;
    public Boolean LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public Integer LLJJIII;
    public String LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public String LLJJIJIL = "default";
    public Integer LLJJJ;
    public String LLJJJIL;
    public n LLJJJJ;
    public String LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public PageFinder LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1190280h50(0);
    }

    public PoiReviewsLandingViewModel() {
        new Gson();
    }

    public static void vQ2(PoiReviewsLandingViewModel poiReviewsLandingViewModel, String str) {
        int value = EnumC1186570gz1.REVIEW_LANDING_PAGE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEligible - poiId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiReviewsApi.LIZ.getClass();
        C0NBH.LIZ(C1172760gck.LIZ().isReviewEligible(str, value, null)).LJJLL(new AfS187S0100000_18(poiReviewsLandingViewModel, 67), new C09JN() { // from class: X.00Qx
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.fetchEligible$2");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchEligible - ");
                sbLIZ2.append(obj);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.fetchEligible$2");
            }
        });
    }

    public final JSONObject rE(C1185410gx9 c1185410gx9, InterfaceC665370Q7z interfaceC665370Q7z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        if (str != null) {
            jSONObject.put("poi_id", str);
        }
        Boolean bool = this.LLJILLL;
        if (bool != null) {
            jSONObject.put("poi_detail_in_sheet_mode", bool.booleanValue());
        }
        String str2 = this.LLJI;
        if (str2 != null) {
            jSONObject.put("from_group_id", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            jSONObject.put("initial_poi_enter_from", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            jSONObject.put("initial_poi_enter_method", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            jSONObject.put("initial_poi_from_group_id", str5);
        }
        String str6 = this.LLIZ;
        if (str6 != null) {
            jSONObject.put("initial_poi_id", str6);
        }
        String str7 = this.LLIZLLLIL;
        if (str7 != null) {
            jSONObject.put("poi_detail_enter_from", str7);
        }
        String str8 = this.LLJ;
        if (str8 != null) {
            jSONObject.put("poi_detail_enter_method", str8);
        }
        String str9 = this.LLJJ;
        if (str9 != null) {
            jSONObject.put("poi_reviews_mob_params", C2365509Or.LJ(new PoiReviewsMobParams(str9)));
        }
        return jSONObject;
    }

    public final void xQ2(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        String str2;
        String str3 = this.LLJJJJJIL;
        if (str3 != null) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            Integer num = null;
            if (Intrinsics.LJFF(str, "tiktok")) {
                str2 = this.LLJJIJIL;
            } else {
                str2 = null;
            }
            String str4 = this.LL;
            Integer num2 = this.LLJJJ;
            if (Intrinsics.LJFF(str, "tiktok")) {
                num = this.LLJJIII;
            }
            String str5 = this.LLJJJIL;
            String str6 = this.LLJJI;
            Long lValueOf = Long.valueOf(this.LLJJJJLIIL);
            PageFinder pageFinder = this.LLJL;
            c1191160h6Q.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
            linkedHashMap.put("tab_name", str);
            linkedHashMap.put("enter_from", "poi_reviews");
            linkedHashMap.put("enter_method", str3);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("reviews_rank_type", str2);
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("poi_id", str4);
            linkedHashMap.put("has_service", String.valueOf(num2));
            linkedHashMap.put("review_cnt", String.valueOf(num));
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("local_service_key_category", str5);
            C1189060h32.LIZ(str6, linkedHashMap);
            linkedHashMap.put("duration", String.valueOf(lValueOf));
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("exit_poi_reviews_tab", linkedHashMap, c1185050gwZ);
        }
    }

    public final void wQ2(InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2) {
        String str3;
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLJJJJJIL = str2;
        this.LLJJJJLIIL = 0L;
        this.LLJJL = System.currentTimeMillis();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str4 = this.LLJJJJJIL;
        Integer num = null;
        if (Intrinsics.LJFF(str, "tiktok")) {
            str3 = this.LLJJIJIL;
        } else {
            str3 = null;
        }
        String str5 = this.LL;
        Integer num2 = this.LLJJJ;
        if (Intrinsics.LJFF(str, "tiktok")) {
            num = this.LLJJIII;
        }
        String str6 = this.LLJJJIL;
        String str7 = this.LLJJI;
        PageFinder pageFinder = this.LLJL;
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("tab_name", str);
        linkedHashMap.put("enter_from", "poi_reviews");
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("enter_method", str4);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("reviews_rank_type", str3);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("poi_id", str5);
        linkedHashMap.put("has_service", String.valueOf(num2));
        linkedHashMap.put("review_cnt", String.valueOf(num));
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("local_service_key_category", str6);
        C1189060h32.LIZ(str7, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_poi_reviews_tab", linkedHashMap, c1185050gwZ);
    }
}
