package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C019F;
import X.C01D1;
import X.C09R3;
import X.C1180470gpB;
import X.C1182380gsG;
import X.C1184530gvj;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1188440h22;
import X.C1188560h2E;
import X.C1188590h2H;
import X.C1189060h32;
import X.C1226204qy;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1849470yED;
import X.C18JG;
import X.C197039127h;
import X.C19719912Dl;
import X.C1ER1;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2365509Or;
import X.C337180DJs;
import X.C418440Gaw;
import X.C621450OZb;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemeReviewSummary;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.ProductGuidanceInfo;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedBottomAssem extends UISlotAssem implements PoiFeedBottomAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final AssemVMLazy LLJJI;
    public C1188440h22 LLJJIII;
    public TuxTextView LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public ViewGroup LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public PoiDataStruct LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public final Set<String> LLJZ;
    public C1849470yED LLJZIJLIL;
    public ProductGuidanceInfo LLL;
    public String LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiFeedBottomAssem.class, "bottomBarViewModel", "getBottomBarViewModel()Lcom/ss/android/ugc/aweme/poi/collect/detailfeed/PoiCollectBottomBarViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiFeedBottomAssem.class, "poiCollectStatusViewModel", "getPoiCollectStatusViewModel()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectStatusViewModel;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiFeedBottomAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectBottomBarViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 936), AFwS256S0000000_18.get$arr$(299), null, true);
        this.LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C1184530gvj.class, "PoiCollectHierarchyData"), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiCollectStatusViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 937), AFwS256S0000000_18.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), null, true);
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, C1188560h2E.class, "PoiFeedBottomHierarchyData"), checkSupervisorPrepared());
        this.LLJZ = new LinkedHashSet();
        this.LLLF = "";
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e61;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomAbility
    public final HashMap<String, String> Yg1() {
        String str;
        HashMap<String, String> map = new HashMap<>();
        C1188560h2E c1188560h2EKp = kp();
        C1182380gsG.LIZJ(new PoiCommonMobParams(c1188560h2EKp != null ? c1188560h2EKp.LLJI : null, null, null, "PoiCommonMobParams"), map, true);
        map.put("enter_from", "poi_post_feed_page");
        map.put("current_page", "post_inner_page");
        PoiDataStruct poiDataStruct = this.LLJLLIL;
        if (poiDataStruct == null || (str = poiDataStruct.poiId) == null) {
            str = "";
        }
        map.put("poi_id", str);
        PoiDataStruct poiDataStruct2 = this.LLJLLIL;
        C1189060h32.LIZ(poiDataStruct2 != null ? poiDataStruct2.collectInfo : null, map);
        return map;
    }

    public final PoiCollectBottomBarViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (PoiCollectBottomBarViewModel) assemVMLazy.getValue();
    }

    public final C1184530gvj ip() {
        return (C1184530gvj) this.LLJLILLLLZIIL.getValue();
    }

    public final C1188560h2E kp() {
        return (C1188560h2E) this.LLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(this, this, PoiFeedBottomAbility.class, null, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(this, PoiFeedBottomAbility.class, null);
    }

    public final long lp(boolean z) {
        Boolean boolValueOf;
        Long l;
        Long l2;
        Long l3;
        PoiDataStruct poiDataStruct = this.LLJLLIL;
        if (poiDataStruct == null || (boolValueOf = poiDataStruct.isCollected()) == null) {
            C1188440h22 c1188440h22 = this.LLJJIII;
            if (c1188440h22 != null) {
                boolValueOf = Boolean.valueOf(c1188440h22.isCollected());
            } else {
                boolValueOf = null;
            }
        }
        long jLongValue = 0;
        if (Intrinsics.LJFF(boolValueOf, Boolean.valueOf(z))) {
            PoiDataStruct poiDataStruct2 = this.LLJLLIL;
            if (poiDataStruct2 == null || (l3 = poiDataStruct2.favCnt) == null) {
                return 0L;
            }
            return l3.longValue();
        }
        if (z) {
            PoiDataStruct poiDataStruct3 = this.LLJLLIL;
            if (poiDataStruct3 != null && (l2 = poiDataStruct3.favCnt) != null) {
                jLongValue = l2.longValue();
            }
            return jLongValue + 1;
        }
        PoiDataStruct poiDataStruct4 = this.LLJLLIL;
        if (poiDataStruct4 != null && (l = poiDataStruct4.favCnt) != null) {
            jLongValue = l.longValue();
        }
        return jLongValue - 1;
    }

    public final void mp(View view) {
        String str;
        Object obj;
        String str2;
        String str3;
        String aid;
        String str4;
        boolean zLJFF;
        Object obj2;
        Object obj3;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String groupId;
        String strLJ;
        String str10;
        String str11;
        PoiGeneralCommonParams poiGeneralCommonParams;
        String str12;
        String str13;
        Map<String, String> map;
        Map<String, String> map2;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        C1185410gx9 c1185410gx93;
        C1185410gx9 c1185410gx94;
        ProductGuidanceInfo productGuidanceInfo = this.LLL;
        if (productGuidanceInfo != null) {
            String str14 = productGuidanceInfo.shelfLynxLink;
            boolean z = false;
            if (str14 != null && str14.length() != 0) {
                C1188560h2E c1188560h2EKp = kp();
                if (c1188560h2EKp != null) {
                    str = c1188560h2EKp.LLILLL;
                } else {
                    str = null;
                }
                Map mapLIZ = C1180470gpB.LIZ(str);
                if (mapLIZ != null) {
                    obj = mapLIZ.get("poi_shelf_filter_info");
                } else {
                    obj = null;
                }
                Pair[] pairArr = new Pair[8];
                PoiDataStruct poiDataStruct = this.LLJLLIL;
                if (poiDataStruct != null) {
                    str2 = poiDataStruct.poiId;
                } else {
                    str2 = null;
                }
                String str15 = "";
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[0] = new Pair("poi_id", str2);
                C1188560h2E c1188560h2EKp2 = kp();
                if (c1188560h2EKp2 == null || (str3 = c1188560h2EKp2.LLILZ) == null) {
                    str3 = "";
                }
                pairArr[1] = new Pair("poi_enter_from", str3);
                pairArr[2] = new Pair("enter_from", "poi_in_feed");
                Aweme aweme = hp().getState().LL;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                pairArr[3] = new Pair("group_id", aid);
                C1188560h2E c1188560h2EKp3 = kp();
                if (c1188560h2EKp3 == null || (str4 = c1188560h2EKp3.LLILZIL) == null) {
                    str4 = "";
                }
                pairArr[4] = new Pair("ad_click_id", str4);
                C1188560h2E c1188560h2EKp4 = kp();
                if (c1188560h2EKp4 != null) {
                    zLJFF = Intrinsics.LJFF(c1188560h2EKp4.LLILZLL, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                pairArr[5] = new Pair("privacy_auth_status_query_required", Boolean.valueOf(zLJFF));
                C1188560h2E c1188560h2EKp5 = kp();
                if (c1188560h2EKp5 == null || (obj2 = c1188560h2EKp5.LLIZ) == null) {
                    obj2 = C13BV.INSTANCE;
                }
                pairArr[6] = new Pair("source_merchant_ids", obj2);
                C1188560h2E c1188560h2EKp6 = kp();
                if (c1188560h2EKp6 == null || (obj3 = c1188560h2EKp6.LLIZLLLIL) == null) {
                    obj3 = C13BV.INSTANCE;
                }
                pairArr[7] = new Pair("source_product_ids", obj3);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(null);
                String str16 = mapLJJIJIIJIL.get("search_id");
                if (str16 != null) {
                    mapLJIIJ.put("search_id", str16);
                }
                String str17 = mapLJJIJIIJIL.get("search_result_id");
                if (str17 != null) {
                    mapLJIIJ.put("search_result_id", str17);
                }
                C1184530gvj c1184530gvjIp = ip();
                if (c1184530gvjIp != null && (c1185410gx94 = c1184530gvjIp.LLIZLLLIL) != null) {
                    initialEnterFrom = c1185410gx94.getInitialEnterFrom();
                } else {
                    initialEnterFrom = null;
                }
                C1189060h32.LJIJI(mapLJIIJ, "initial_poi_enter_from", initialEnterFrom);
                C1184530gvj c1184530gvjIp2 = ip();
                if (c1184530gvjIp2 != null && (c1185410gx93 = c1184530gvjIp2.LLIZLLLIL) != null) {
                    initialEnterMethod = c1185410gx93.getInitialEnterMethod();
                } else {
                    initialEnterMethod = null;
                }
                C1189060h32.LJIJI(mapLJIIJ, "initial_poi_enter_method", initialEnterMethod);
                C1184530gvj c1184530gvjIp3 = ip();
                if (c1184530gvjIp3 != null && (c1185410gx92 = c1184530gvjIp3.LLIZLLLIL) != null) {
                    initialPoiFromGroupId = c1185410gx92.getInitialPoiFromGroupId();
                } else {
                    initialPoiFromGroupId = null;
                }
                C1189060h32.LJIJI(mapLJIIJ, "initial_poi_from_group_id", initialPoiFromGroupId);
                C1184530gvj c1184530gvjIp4 = ip();
                if (c1184530gvjIp4 != null && (c1185410gx9 = c1184530gvjIp4.LLIZLLLIL) != null) {
                    initialPoiId = c1185410gx9.getInitialPoiId();
                } else {
                    initialPoiId = null;
                }
                C1189060h32.LJIJI(mapLJIIJ, "initial_poi_id", initialPoiId);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ProductGuidanceInfo productGuidanceInfo2 = this.LLL;
                if (productGuidanceInfo2 != null) {
                    str5 = productGuidanceInfo2.shelfLynxLink;
                } else {
                    str5 = null;
                }
                Pair[] pairArr2 = new Pair[7];
                pairArr2[0] = new Pair("page_start_ts", Long.valueOf(jCurrentTimeMillis));
                C1188560h2E c1188560h2EKp7 = kp();
                if (c1188560h2EKp7 == null || (str6 = c1188560h2EKp7.LLILLL) == null) {
                    str6 = "";
                }
                pairArr2[1] = new Pair("poi_session_id", str6);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                PoiDataStruct poiDataStruct2 = this.LLJLLIL;
                if (poiDataStruct2 == null || (str7 = poiDataStruct2.collectInfo) == null) {
                    str7 = "";
                }
                C1189060h32.LJIJI(linkedHashMap, "collect_info", str7);
                pairArr2[2] = new Pair("poi_meta_data", linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                C1188560h2E c1188560h2EKp8 = kp();
                if (c1188560h2EKp8 != null && (map2 = c1188560h2EKp8.LLJIJIL) != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        C1189060h32.LJIJI(linkedHashMap2, entry.getKey(), entry.getValue());
                    }
                }
                pairArr2[3] = new Pair("poi_router_params", linkedHashMap2);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                C1189060h32.LJIJI(linkedHashMap3, "slash_biz", "poi_post_feed_page");
                C1189060h32.LJIJI(linkedHashMap3, "url", str5);
                pairArr2[4] = new Pair("poi_tech_params", linkedHashMap3);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                C1188560h2E c1188560h2EKp9 = kp();
                if (c1188560h2EKp9 != null && (map = c1188560h2EKp9.LLJILJIL) != null) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        C1189060h32.LJIJI(linkedHashMap4, entry2.getKey(), entry2.getValue());
                    }
                }
                pairArr2[5] = new Pair("poi_general_track_params", linkedHashMap4);
                pairArr2[6] = new Pair("previous_page", "poi_post_feed_page");
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
                StringBuilder sb = new StringBuilder();
                ProductGuidanceInfo productGuidanceInfo3 = this.LLL;
                if (productGuidanceInfo3 != null) {
                    str8 = productGuidanceInfo3.shelfLynxLink;
                } else {
                    str8 = null;
                }
                sb.append(str8);
                ProductGuidanceInfo productGuidanceInfo4 = this.LLL;
                if (productGuidanceInfo4 != null && (str13 = productGuidanceInfo4.shelfLynxLink) != null && !a0.LJJIIZI(str13, "?", false)) {
                    z = true;
                }
                if (z) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_session_id=");
                C1188560h2E c1188560h2EKp10 = kp();
                if (c1188560h2EKp10 == null || (str9 = c1188560h2EKp10.LLILLL) == null) {
                    str9 = "";
                }
                sbLIZ.append(str9);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                sb.append("&");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("page_start_time=");
                sbLIZ2.append(jCurrentTimeMillis);
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                sb.append("&");
                StringBuilder sb2 = new StringBuilder("source_btm_token=");
                PageFinder pageFinderVia = PageFinder.via(view);
                BcmParams bcmParams = new BcmParams();
                Aweme aweme2 = hp().getState().LL;
                if (aweme2 != null) {
                    groupId = aweme2.getGroupId();
                } else {
                    groupId = null;
                }
                bcmParams.put("group_id", groupId);
                sb2.append(C18JG.LIZ("c7294.d68530", pageFinderVia, bcmParams));
                sb.append(sb2.toString());
                sb.append("&poi_shelf_filter_info=");
                if (obj == null || (strLJ = C2365509Or.LJ(obj)) == null) {
                    strLJ = "";
                }
                sb.append(URLEncoder.encode(strLJ, StandardCharsets.UTF_8.name()));
                sb.append("&poi_shelf_page_request_params=");
                sb.append(URLEncoder.encode(C2365509Or.LJ(mapLJIIJ), StandardCharsets.UTF_8.name()));
                sb.append("&poi_extra=");
                sb.append(URLEncoder.encode(C2365509Or.LJ(mapLJIIJ2), StandardCharsets.UTF_8.name()));
                String string = sb.toString();
                C1188590h2H c1188590h2H = C1188590h2H.LIZ;
                PoiDataStruct poiDataStruct3 = this.LLJLLIL;
                if (poiDataStruct3 != null) {
                    str10 = poiDataStruct3.poiId;
                    str11 = poiDataStruct3.collectInfo;
                } else {
                    str10 = null;
                    str11 = null;
                }
                C1188560h2E c1188560h2EKp11 = kp();
                if (c1188560h2EKp11 != null) {
                    poiGeneralCommonParams = c1188560h2EKp11.LLJI;
                } else {
                    poiGeneralCommonParams = null;
                }
                PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
                c1188590h2H.getClass();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                PoiGeneralCommonParams poiGeneralCommonParams2 = null;
                C1182380gsG.LIZJ(new PoiCommonMobParams(poiGeneralCommonParams, null, null, "PoiCommonMobParams"), linkedHashMap5, true);
                linkedHashMap5.put("enter_from", "poi_post_feed_page");
                linkedHashMap5.put("current_page", "post_inner_page");
                if (str10 == null) {
                    str10 = "";
                }
                linkedHashMap5.put("poi_id", str10);
                C1189060h32.LIZ(str11, linkedHashMap5);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia2);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("ttls_video_shelf_click", linkedHashMap5, c1185050gwZ);
                PoiDataStruct poiDataStruct4 = this.LLJLLIL;
                if (poiDataStruct4 != null) {
                    str12 = poiDataStruct4.poiId;
                } else {
                    str12 = null;
                }
                C1188560h2E c1188560h2EKp12 = kp();
                if (c1188560h2EKp12 != null) {
                    poiGeneralCommonParams2 = c1188560h2EKp12.LLJI;
                }
                PageFinder pageFinderVia3 = PageFinder.via(C724240Sb0.LJI(this));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                C1182380gsG.LIZJ(new PoiCommonMobParams(poiGeneralCommonParams2, null, null, "PoiCommonMobParams"), linkedHashMap6, true);
                linkedHashMap6.put("enter_from", "poi_post_feed_page");
                linkedHashMap6.put("current_page", "post_inner_page");
                if (str12 != null) {
                    str15 = str12;
                }
                linkedHashMap6.put("poi_id", str15);
                linkedHashMap6.put("ttls_module_name", "poi_feed_bottom_bar");
                linkedHashMap6.put("ttls_component_name", "poi_feed_product_shelf");
                linkedHashMap6.put("operation_type", "click");
                C1185040gwY.LIZIZ("ttls_operation_on_poi", linkedHashMap6, new C1185050gwZ(pageFinderVia3));
                SmartRouter.buildRoute(getContentView().getContext(), string).open();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.r53);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(tuxTextView.getContext(), R.style.y0));
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        this.LLJJIJI = tuxTextView;
        this.LLJJIJIIJIL = (SmartImageView) view.findViewById(R.id.jhu);
        this.LLJJIJIL = view.findViewById(R.id.jhw);
        this.LLJJJ = view.findViewById(R.id.jhx);
        this.LLJJJIL = view.findViewById(R.id.r9h);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.r9j);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.r9i);
        this.LLJJJJLIIL = view.findViewById(R.id.r9g);
        this.LLJJL = view.findViewById(R.id.rdi);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.qzg);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, new ContextThemeWrapper(tuxTextView2.getContext(), R.style.y0));
        if (numLIZJ2 != null) {
            tuxTextView2.setTextColor(numLIZJ2.intValue());
        }
        this.LLJJLIIIJLLLLLLLZ = tuxTextView2;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.view_deals_btn);
        this.LLJL = c197039127h;
        if (c197039127h != null) {
            c197039127h.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        }
        C197039127h c197039127h2 = this.LLJL;
        if (c197039127h2 != null) {
            c197039127h2.setTuxFont(52);
        }
        C197039127h c197039127h3 = this.LLJL;
        if (c197039127h3 != null) {
            c197039127h3.setMaxLines(1);
        }
        this.LLJLIL = (ViewGroup) view.findViewById(R.id.e6f);
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        View view2 = this.LLJJL;
        if (tuxTextView3 != null && view2 != null) {
            this.LLJZIJLIL = new C1849470yED(tuxTextView3, this.LLJJJJLIIL, view2, this.LLJJJIL, this.LLJLIL, new AwS562S0100000_18(this, 935));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0h2D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158240gFK) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 96), 6);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 48), view.findViewById(R.id.view_deals_click_area));
        C197039127h c197039127h4 = this.LLJL;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, new ACListenerS153S0100000_18(this, 49));
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 50), view.findViewById(R.id.view_poi_click_area));
    }

    public final void sp(PoiDataStruct poiDataStruct) {
        PoiAwemeReviewSummary poiAwemeReviewSummary;
        if (poiDataStruct != null) {
            poiAwemeReviewSummary = poiDataStruct.reviewSummary;
        } else {
            poiAwemeReviewSummary = null;
        }
        C1188560h2E c1188560h2EKp = kp();
        if (c1188560h2EKp != null && c1188560h2EKp.LLJ == 3 && poiAwemeReviewSummary != null && poiAwemeReviewSummary.score != null && !Intrinsics.LJFF(poiAwemeReviewSummary.noRating, Boolean.TRUE)) {
            View view = this.LLJJJIL;
            if (view != null) {
                C337180DJs.LIZJ(view);
            }
            TuxIconView tuxIconView = this.LLJJJJ;
            if (tuxIconView != null) {
                C337180DJs.LIZJ(tuxIconView);
            }
            String strK4 = C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{poiAwemeReviewSummary.score}, 1));
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(strK4);
                return;
            }
            return;
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C337180DJs.LIZ(view2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c A[PHI: r5
      0x004c: PHI (r5v1 java.lang.Double) = (r5v0 java.lang.Double), (r5v3 java.lang.Double) binds: [B:32:0x0049, B:20:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(com.ss.android.ugc.aweme.poi.PoiDataStruct r15, long r16) {
        /*
            r14 = this;
            X.0yED r1 = r14.LLJZIJLIL
            if (r1 != 0) goto L5
            return
        L5:
            android.view.View r2 = r14.LLJJJIL
            if (r2 != 0) goto La
            return
        La:
            com.bytedance.tux.icon.TuxIconView r3 = r14.LLJJJJ
            if (r3 != 0) goto Lf
            return
        Lf:
            com.bytedance.tux.input.TuxTextView r4 = r14.LLJJJJJIL
            if (r4 != 0) goto L14
            return
        L14:
            r8 = 0
            if (r15 == 0) goto L48
            com.ss.android.ugc.aweme.poi.PoiAwemeReviewSummary r0 = r15.reviewSummary
            if (r0 == 0) goto L48
            java.lang.Double r5 = r0.score
        L1d:
            com.ss.android.ugc.aweme.poi.PoiAwemeReviewSummary r0 = r15.reviewSummary
            if (r0 == 0) goto L4c
            java.lang.Boolean r6 = r0.noRating
        L23:
            X.0h2E r0 = r14.kp()
            if (r0 == 0) goto L46
            int r7 = r0.LLJ
        L2b:
            if (r15 == 0) goto L44
            java.lang.String r8 = r15.locationDesc
            java.lang.String r9 = r15.categoryName
        L31:
            android.view.View r0 = r14.LJJIJL()
            android.content.res.Resources r12 = r0.getResources()
            X.0h2F r13 = new X.0h2F
            r13.<init>(r14)
            r10 = r16
            X.C621450OZb.LJ(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return
        L44:
            r9 = r8
            goto L31
        L46:
            r7 = 0
            goto L2b
        L48:
            r5 = r8
            if (r15 == 0) goto L4c
            goto L1d
        L4c:
            r6 = r8
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomAssem.op(com.ss.android.ugc.aweme.poi.PoiDataStruct, long):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomAbility
    public final void pI2(String str, boolean z) {
        String poiId;
        String str2;
        int i;
        C1188440h22 c1188440h22 = this.LLJJIII;
        String str3 = null;
        if (c1188440h22 != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        if (!Intrinsics.LJFF(str, poiId)) {
            return;
        }
        if (C1226204qy.LIZ()) {
            op(this.LLJLLIL, lp(z));
            return;
        }
        sp(this.LLJLLIL);
        C1849470yED c1849470yED = this.LLJZIJLIL;
        if (c1849470yED == null) {
            return;
        }
        Long lValueOf = Long.valueOf(lp(z));
        PoiDataStruct poiDataStruct = this.LLJLLIL;
        if (poiDataStruct != null) {
            str2 = poiDataStruct.locationDesc;
            str3 = poiDataStruct.categoryName;
        } else {
            str2 = null;
        }
        C1188560h2E c1188560h2EKp = kp();
        if (c1188560h2EKp != null) {
            i = c1188560h2EKp.LLJ;
        } else {
            i = 0;
        }
        C621450OZb.LIZIZ(c1849470yED, lValueOf, str2, str3, i, LJJIJL().getResources());
    }
}
