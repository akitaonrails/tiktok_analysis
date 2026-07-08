package kotlin.jvm.internal;

import X.C080U;
import X.C09AY;
import X.C0PSG;
import X.C0QER;
import X.C0QXR;
import X.C650500PfM;
import X.C674800QdS;
import X.C674830QdV;
import X.C675840Qf8;
import X.C676920Qgs;
import X.EnumC676230Qfl;
import X.InterfaceC1541990qEH;
import com.bytedance.android.btm.api.model.PageFinder;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.search.EComModelSearchDependencyService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS32S2200000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S2200000_10 awS32S2200000_10) throws JSONException {
        String str = awS32S2200000_10.s0;
        C675840Qf8.LJFF((PageFinder) awS32S2200000_10.l2, Integer.valueOf(C0QXR.GENERAL_VISUAL_SEARCH.getValue()), str, "search_blankpage", "general_search_blankpage", "general_search_blankpage", awS32S2200000_10.s1, "c3886.d7767", (Map) awS32S2200000_10.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS32S2200000_10 awS32S2200000_10) {
        boolean zIsDefaultOption;
        int filterBy;
        int sortType;
        LinkedHashMap<String, Integer> linkedHashMap;
        C674830QdV c674830QdV = new C674830QdV();
        C674800QdS c674800QdS = (C674800QdS) awS32S2200000_10.l2;
        String str = c674800QdS.searchChannel;
        if (str == null) {
            str = "tiktok_ecom";
        }
        long j = c674800QdS.cursor;
        String str2 = c674800QdS.keyword;
        String str3 = c674800QdS.enterFrom;
        int i = c674800QdS.count;
        int i2 = c674800QdS.hotSearch;
        String str4 = c674800QdS.searchId;
        String str5 = c674800QdS.lastSearchId;
        String str6 = c674800QdS.source;
        String str7 = c674800QdS.searchSource;
        int i3 = c674800QdS.correctType;
        C0PSG c0psg = c674800QdS.filterOption;
        if (c0psg != null) {
            zIsDefaultOption = c0psg.isDefaultOption();
        } else {
            zIsDefaultOption = 1;
        }
        int i4 = !zIsDefaultOption;
        C0PSG c0psg2 = ((C674800QdS) awS32S2200000_10.l2).filterOption;
        if (c0psg2 != null) {
            filterBy = c0psg2.getFilterBy();
        } else {
            filterBy = 0;
        }
        C0PSG c0psg3 = ((C674800QdS) awS32S2200000_10.l2).filterOption;
        if (c0psg3 != null) {
            sortType = c0psg3.getSortType();
        } else {
            sortType = 0;
        }
        C0PSG c0psg4 = ((C674800QdS) awS32S2200000_10.l2).filterOption;
        if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C674800QdS c674800QdS2 = (C674800QdS) awS32S2200000_10.l2;
        String str8 = c674800QdS2.searchContext;
        String str9 = c674800QdS2.sugTagText;
        String str10 = c674800QdS2.sugType;
        String str11 = c674800QdS2.sugQueryState;
        String str12 = c674800QdS2.sugCreatorId;
        String str13 = c674800QdS2.attachProducts;
        String str14 = c674800QdS2.mockAttachProducts;
        String str15 = c674800QdS2.trafficSourceList;
        String str16 = c674800QdS2.cmplEnc;
        String str17 = c674800QdS2.originIsMallTab;
        String str18 = c674800QdS2.ecSearchSessionId;
        String str19 = c674800QdS2.sugShopId;
        String str20 = c674800QdS2.userRtActs;
        String str21 = c674800QdS2.userActions;
        String str22 = c674800QdS2.searchSessionId;
        String str23 = c674800QdS2.apiVersion;
        String str24 = c674800QdS2.lastSearchPidList;
        String str25 = c674800QdS2.passThroughParams;
        Map<String, String> map = c674800QdS2.searchExtraRequestParams;
        Long l = c674800QdS2.endToEndSearchSessionId;
        String str26 = c674800QdS2.filtersData;
        Integer numIsLowDevice = c674800QdS2.isLowDevice();
        Integer numIsWeakNetwork = ((C674800QdS) awS32S2200000_10.l2).isWeakNetwork();
        C674800QdS c674800QdS3 = (C674800QdS) awS32S2200000_10.l2;
        Integer num = c674800QdS3.useNewFilterArch;
        String str27 = c674800QdS3.newUserExtraInfo;
        Integer numIsNonPersonalizedSearch = c674800QdS3.isNonPersonalizedSearch();
        C674800QdS c674800QdS4 = (C674800QdS) awS32S2200000_10.l2;
        Integer num2 = c674800QdS4.dmaConsentStatus;
        Integer num3 = c674800QdS4.edmConsentStatus;
        String str28 = c674800QdS4.nineSearchProductId;
        Integer num4 = c674800QdS4.searchKeywordStrategy;
        String str29 = c674800QdS4.enterFromSecond;
        String str30 = c674800QdS4.searchPromotionParams;
        String str31 = c674800QdS4.trafficDiversionInfo;
        String str32 = c674800QdS4.bcmChain;
        Map<String, String> map2 = c674800QdS4.apiParamsInCurrentSearch;
        int value = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST.getValue();
        C674800QdS c674800QdS5 = (C674800QdS) awS32S2200000_10.l2;
        return C674830QdV.LIZIZ(c674830QdV, (C674800QdS) awS32S2200000_10.l2, awS32S2200000_10.s0, awS32S2200000_10.s1, str, j, str2, str3, i, i2, str4, str5, str6, str7, i3, i4, filterBy, sortType, linkedHashMap, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str23, str22, str21, str24, str25, map, (List) awS32S2200000_10.l3, l, str26, numIsLowDevice, numIsWeakNetwork, num, numIsNonPersonalizedSearch, num2, num3, str27, str28, num4, str29, str30, str31, str32, map2, value, c674800QdS5.rootEnterFromType, c674800QdS5.clientRequestId, c674800QdS5.noNeedPageStyle, String.valueOf(c674800QdS5.hashCode()), 268435456);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS32S2200000_10 r11) throws org.json.JSONException {
        /*
            java.lang.Object r2 = r11.l2
            com.lynx.tasm.TemplateData r2 = (com.lynx.tasm.TemplateData) r2
            r10 = 1
            r9 = 0
            java.lang.String r6 = "isLogin"
            java.lang.String r8 = "hitPreload"
            java.lang.String r7 = "isPreload"
            if (r2 == 0) goto L5b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.LJIILIIL(r7, r0)
            r2.LJIILIIL(r8, r0)
            X.0PdR r0 = X.C649310PdR.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJIILIIL(r6, r0)
        L2c:
            X.0PdF r0 = X.C649190PdF.LIZ
            java.lang.String r1 = r11.s0
            r0.getClass()
            boolean r0 = X.C649190PdF.LIZ()
            if (r0 == 0) goto L4d
            X.0Pdh r0 = X.C649470Pdh.LIZ
            if (r1 != 0) goto L3f
            java.lang.String r1 = ""
        L3f:
            r0.getClass()
            boolean r0 = X.C649470Pdh.LJJI(r1)
            if (r0 == 0) goto L4d
        L48:
            java.lang.String r0 = "allSearchDataProcess"
            r2.LIZJ = r0
        L4c:
            return r2
        L4d:
            X.0Q6p r1 = X.C665010Q6p.LIZ
            java.lang.String r0 = r11.s0
            r1.getClass()
            boolean r0 = X.C665010Q6p.LIZIZ(r0)
            if (r0 == 0) goto L4c
            goto L48
        L5b:
            X.0PaK r5 = X.C647380PaK.LJIIIIZZ
            java.lang.String r4 = r11.s0
            java.lang.String r3 = r11.s1
            if (r3 != 0) goto L65
            java.lang.String r3 = "{}"
        L65:
            r0 = 3
            kotlin.Pair[] r2 = new kotlin.Pair[r0]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r1)
            r2[r9] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r1)
            r2[r10] = r0
            X.0PdR r0 = X.C649310PdR.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r6, r0)
            r0 = 2
            r2[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r2)
            java.lang.Object r0 = r11.l3
            X.0qEH r0 = (X.InterfaceC1541990qEH) r0
            if (r0 == 0) goto La9
            X.0q70 r0 = r0.getHybridContext()
        La1:
            r5.getClass()
            com.lynx.tasm.TemplateData r2 = X.C647380PaK.LIZJ(r4, r3, r1, r0)
            goto L2c
        La9:
            r0 = 0
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS32S2200000_10.invoke$2(kotlin.jvm.internal.AwS32S2200000_10):java.lang.Object");
    }

    public static final Object invoke$3(AwS32S2200000_10 awS32S2200000_10) {
        String str;
        String keyword;
        Integer numValueOf;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        StringBuilder sb = new StringBuilder("result=");
        if (((C676920Qgs) awS32S2200000_10.l2).LIZ) {
            str = "SupportCollapse";
        } else {
            str = "NotSupportCollapse";
        }
        sb.append(str);
        sb.append(" reason=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LIZIZ);
        sb.append(" source=");
        sb.append(awS32S2200000_10.s0);
        sb.append(" caller=");
        sb.append(awS32S2200000_10.s1);
        sb.append(" keyword=");
        SearchResultParam searchResultParam = (SearchResultParam) awS32S2200000_10.l3;
        String enterSearchFrom = null;
        if (searchResultParam != null) {
            keyword = searchResultParam.getKeyword();
        } else {
            keyword = null;
        }
        sb.append(keyword);
        sb.append(" rootEnterFromType=");
        SearchResultParam searchResultParam2 = (SearchResultParam) awS32S2200000_10.l3;
        if (searchResultParam2 != null && (searchEnterParam2 = searchResultParam2.getSearchEnterParam()) != null) {
            numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam2));
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(" enterFrom=");
        SearchResultParam searchResultParam3 = (SearchResultParam) awS32S2200000_10.l3;
        if (searchResultParam3 != null && (searchEnterParam = searchResultParam3.getSearchEnterParam()) != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        }
        sb.append(enterSearchFrom);
        sb.append(" isFromMall=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LIZJ);
        sb.append(" isSingleTab=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LIZLLL);
        sb.append(" topBarHide=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LJ);
        sb.append(" simpleTab=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LJFF);
        sb.append(" followFinger=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LJI);
        sb.append(" fixEnable=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LJII);
        sb.append(" canCollapse=");
        sb.append(((C676920Qgs) awS32S2200000_10.l2).LIZ);
        return sb.toString();
    }

    public static final Object invoke$4(AwS32S2200000_10 awS32S2200000_10) throws JSONException {
        String str = awS32S2200000_10.s0;
        Integer numValueOf = Integer.valueOf(C0QXR.GENERAL_VISUAL_SEARCH.getValue());
        PageFinder pageFinder = (PageFinder) awS32S2200000_10.l2;
        String str2 = awS32S2200000_10.s1;
        Map map = (Map) awS32S2200000_10.l3;
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_entrance", str);
        jSONObject.put("current_page", "search_blankpage");
        jSONObject.put("photo_search_module", "visual_search");
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_from_second", "general_search_blankpage");
        jSONObject.put("root_enter_from_type", numValueOf);
        jSONObject.put("fail_reason", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        iEComModelSearchDependencyServiceLJ.LIZIZ("photo_search_icon_show_fail", jSONObject, "c3886.d7767", pageFinder);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS32S2200000_10(com.bytedance.android.btm.api.model.PageFinder r3, java.lang.String r4, java.lang.String r5, java.util.Map r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.s0 = r4
            r1.l2 = r3
            r1.s1 = r5
            r1.l3 = r6
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.s0 = r4
            r1.s1 = r5
            r1.l2 = r3
            r1.l3 = r6
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS32S2200000_10.<init>(com.bytedance.android.btm.api.model.PageFinder, java.lang.String, java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S2200000_10(C674800QdS c674800QdS, C674800QdS c674800QdS2, String str, String str2, List<C080U> list) {
        super(0);
        this.$t = list;
        this.l2 = c674800QdS;
        this.s0 = c674800QdS2;
        this.s1 = str;
        this.l3 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S2200000_10(C676920Qgs c676920Qgs, String str, String str2, SearchResultParam searchResultParam, int i) {
        super(0);
        this.$t = i;
        this.l2 = c676920Qgs;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = searchResultParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S2200000_10(TemplateData templateData, String str, String str2, InterfaceC1541990qEH interfaceC1541990qEH, int i) {
        super(0);
        this.$t = i;
        this.l2 = templateData;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = interfaceC1541990qEH;
    }
}
