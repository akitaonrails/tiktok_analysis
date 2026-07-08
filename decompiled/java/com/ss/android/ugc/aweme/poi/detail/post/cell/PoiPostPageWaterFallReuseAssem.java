package com.ss.android.ugc.aweme.poi.detail.post.cell;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1180060goW;
import X.C1180320gow;
import X.C1185410gx9;
import X.C1185450gxD;
import X.C1185490gxH;
import X.C1185500gxI;
import X.C1186790gzN;
import X.C1187240h06;
import X.C1187600h0g;
import X.C1187610h0h;
import X.C1187620h0i;
import X.C1187650h0l;
import X.C1187790h0z;
import X.C1187970h1H;
import X.C1188410h1z;
import X.C1188440h22;
import X.C1188460h24;
import X.C1188480h26;
import X.C1188510h29;
import X.C1188530h2B;
import X.C1188730h2V;
import X.C1189060h32;
import X.C1192440h8U;
import X.C1200940hMC;
import X.C123100dR;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C166X;
import X.C18JG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C631370Opb;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.IPoiPostPageAbility;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageWaterFallReuseAssem extends ReusedUISlotAssem<PoiPostPageWaterFallReuseAssem> implements InterfaceC712990Rxx<C1187600h0g> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public static TuxIconDrawable LLJLL;
    public static TuxIconDrawable LLJLLIL;
    public final C166X LLJJLIIIJLLLLLLLZ = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 345));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1185));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiPostPageWaterFallReuseAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailPostPageWaterFallCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e0v;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiPostPageShareVM sp() {
        return (PoiPostPageShareVM) this.LLJL.getValue();
    }

    public final C1187620h0i tp() {
        C166X c166x = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (C1187620h0i) c166x.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS597S0100000_18(this, 344));
        C1180060goW.LJIIJJI(tp().LLILLJJLI.LLILLL, LLJLILLLLZIIL);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 102));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    public final void op(C1187600h0g c1187600h0g) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        Object obj;
        Object obj2;
        Object obj3;
        PoiListApi.PoiDetailResponse poiDetailResponse2;
        Map map;
        String groupId;
        Object obj4;
        String enterFrom;
        String previousPage;
        C1187610h0h c1187610h0h;
        C1185410gx9 c1185410gx9;
        String name;
        boolean zBooleanValue;
        String address;
        String collectInfo;
        ?? LIZIZ;
        PoiListApi.PoiDetailResponse poiDetailResponse3;
        C1185410gx9 c1185410gx92;
        C1188440h22 c1188440h22;
        String collectInfo2;
        C1185490gxH c1185490gxHLJ;
        String previousPage2;
        String enterFrom2;
        String enterMethod;
        String poiId;
        String poiInfoSource;
        String poiCityCode;
        String poiRegionCode;
        String strLIZLLL;
        String strLIZJ;
        String collectInfo3;
        String fromGroupId;
        String poiId2;
        String poiInfoSource2;
        String poiCityCode2;
        String poiRegionCode2;
        String strLIZLLL2;
        String strLIZJ2;
        String groupId2;
        String authorId;
        String poiId3;
        Map<String, String> searchParams;
        Long lValueOf;
        String strOf2;
        String strXP0;
        Object obj5;
        C1185410gx9 c1185410gx93;
        String sessionId;
        String enterFrom3;
        String adClickId;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj6;
        Serializable serializable;
        Object obj7;
        Serializable serializable2;
        String collectInfo4;
        String fromGroupId2;
        C1185490gxH c1185490gxH;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        C1187970h1H c1187970h1H;
        PoiListApi.PostTag postTag;
        C1187610h0h c1187610h0h2;
        C1187610h0h c1187610h0h3;
        C1185410gx9 c1185410gx94;
        C1187610h0h c1187610h0h4;
        PoiListApi.PoiDetailResponse poiDetailResponse4;
        C1187610h0h c1187610h0h5;
        C1185410gx9 c1185410gx95;
        List<String> sourceMerchantIds;
        C1187610h0h c1187610h0h6;
        C1185410gx9 c1185410gx96;
        List<String> sourceProductIds;
        C1187610h0h c1187610h0h7;
        C1185410gx9 c1185410gx97;
        C1187610h0h c1187610h0h8;
        C1185410gx9 c1185410gx98;
        C1187610h0h c1187610h0h9;
        C1185450gxD c1185450gxD;
        C1187610h0h c1187610h0h10;
        IPoiPostPageAbility iPoiPostPageAbility;
        IPoiPostPageAbility iPoiPostPageAbility2;
        C1187610h0h c1187610h0h11;
        C1187610h0h c1187610h0h12;
        PoiListApi.PoiDetailResponse poiDetailResponse5;
        C1187610h0h c1187610h0h13;
        C1187610h0h c1187610h0h14;
        C1187610h0h c1187610h0h15;
        Boolean boolIsCollected;
        C1187610h0h c1187610h0h16;
        C1185410gx9 c1185410gx99;
        C1187610h0h c1187610h0h17;
        C1185490gxH c1185490gxH2;
        C1187610h0h c1187610h0h18;
        C1187610h0h c1187610h0h19;
        C1187610h0h c1187610h0h20;
        Context context = getContext();
        PoiPostPageShareVM poiPostPageShareVMSp = sp();
        C1185410gx9 c1185410gx910 = null;
        if (poiPostPageShareVMSp != null && (c1187610h0h20 = poiPostPageShareVMSp.LLILZIL) != null) {
            poiDetailResponse = c1187610h0h20.poiDetailResponse;
        } else {
            poiDetailResponse = null;
        }
        Aweme aweme = c1187600h0g.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c91835.d85409_i");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        String strLIZ = C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) tp().LLJILJIL), null);
        String aid = c1187600h0g.LLILLJJLI.getAid();
        int i = c1187600h0g.LLILZIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str = ((C1187600h0g) obj).LL;
        if (str != null) {
            C1187240h06.LIZ.put(str, Integer.valueOf(C631370Opb.LIZIZ(this)));
        }
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(tp().LLJILJIL, tp().LLJILJIL.getWidth(), tp().LLJILJIL.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String aid2 = ((C1187600h0g) obj2).LLILLJJLI.getAid();
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        C1180320gow.LIZIZ(aid2, ((C1187600h0g) obj3).LL);
        C1187650h0l c1187650h0l = C1187650h0l.LIZ;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1187790h0z c1187790h0z = new C1187790h0z();
        PoiPostPageShareVM poiPostPageShareVMSp2 = sp();
        if (poiPostPageShareVMSp2 != null && (c1187610h0h19 = poiPostPageShareVMSp2.LLILZIL) != null) {
            c1185410gx910 = c1187610h0h19.poiDetailParams;
        }
        PoiPostPageShareVM poiPostPageShareVMSp3 = sp();
        if (poiPostPageShareVMSp3 != null && (c1187610h0h18 = poiPostPageShareVMSp3.LLILZIL) != null) {
            poiDetailResponse2 = c1187610h0h18.cachedBasicInfoForCollect;
        } else {
            poiDetailResponse2 = null;
        }
        c1187650h0l.getClass();
        Object obj8 = ((LinkedHashMap) C1187650h0l.LIZ(fragmentLJIIJ, null, null, c1187790h0z, c1185410gx910, poiDetailResponse2, null)).get("poi_extra");
        if (obj8 instanceof Map) {
            map = (Map) obj8;
        } else {
            map = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        if (!C123100dR.LIZ(aid) || aid == null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
        }
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aid, bundle);
        C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        bundle.putInt("video_type", 51);
        C786410Ut5.LJJJI("enter_from", "poi_detail", bundle);
        C786410Ut5.LJJJI("enter_method", "post_card", bundle);
        PoiPostPageShareVM poiPostPageShareVMSp4 = sp();
        String str2 = "";
        if (poiPostPageShareVMSp4 == null || (c1187610h0h17 = poiPostPageShareVMSp4.LLILZIL) == null || (c1185490gxH2 = c1187610h0h17.poiAnchorMobData) == null || (groupId = c1185490gxH2.getGroupId()) == null) {
            groupId = "";
        }
        C786410Ut5.LJJJI("from_group_id", groupId, bundle);
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        C786410Ut5.LJJJI("page_poi_id", ((C1187600h0g) obj4).LL, bundle);
        bundle.putBoolean("poi_collect_bottom_bar", true);
        bundle.putBoolean("hide_poi_anchor", true);
        C786410Ut5.LJJJI("video_from", "POI_POST_PAGE_ENTRANCE", bundle);
        PoiPostPageShareVM poiPostPageShareVMSp5 = sp();
        if (poiPostPageShareVMSp5 != null && (c1187610h0h16 = poiPostPageShareVMSp5.LLILZIL) != null && (c1185410gx99 = c1187610h0h16.poiDetailParams) != null) {
            enterFrom = c1185410gx99.getEnterFrom();
        } else {
            enterFrom = null;
        }
        if (Intrinsics.LJFF(enterFrom, "collection_places")) {
            C786410Ut5.LJJJI("previous_page", "collection_places", bundle);
        } else {
            PoiPostPageShareVM poiPostPageShareVMSp6 = sp();
            if (poiPostPageShareVMSp6 != null && (c1187610h0h = poiPostPageShareVMSp6.LLILZIL) != null && (c1185410gx9 = c1187610h0h.poiDetailParams) != null) {
                previousPage = c1185410gx9.getPreviousPage();
            } else {
                previousPage = null;
            }
            C786410Ut5.LJJJI("previous_page", previousPage, bundle);
        }
        if (poiDetailResponse != null) {
            name = poiDetailResponse.getName();
        } else {
            name = null;
        }
        C786410Ut5.LJJJI("poi_name", name, bundle);
        if (poiDetailResponse != null && (boolIsCollected = poiDetailResponse.isCollected()) != null) {
            zBooleanValue = boolIsCollected.booleanValue();
        } else {
            zBooleanValue = false;
        }
        bundle.putBoolean("is_collected", zBooleanValue);
        if (poiDetailResponse != null) {
            address = poiDetailResponse.getAddress();
        } else {
            address = null;
        }
        C786410Ut5.LJJJI("poi_address", address, bundle);
        C786410Ut5.LJJJI("poi_fullscreen", "1", bundle);
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C786410Ut5.LJJJI("page_collect_info", collectInfo, bundle);
        C1186790gzN.LJ(bundle, "poi_extras", C2097608Jq.LJI(new Pair("page_model", "detail")));
        Context context2 = getContext();
        if (context2 != null) {
            C1200940hMC.LIZ.getClass();
            LIZIZ = C1200940hMC.LIZIZ(context2);
        } else {
            LIZIZ = 0;
        }
        PoiPostPageShareVM poiPostPageShareVMSp7 = sp();
        if (poiPostPageShareVMSp7 != null && (c1187610h0h15 = poiPostPageShareVMSp7.LLILZIL) != null) {
            poiDetailResponse3 = c1187610h0h15.poiDetailResponse;
        } else {
            poiDetailResponse3 = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp8 = sp();
        if (poiPostPageShareVMSp8 != null && (c1187610h0h14 = poiPostPageShareVMSp8.LLILZIL) != null) {
            c1185410gx92 = c1187610h0h14.poiDetailParams;
        } else {
            c1185410gx92 = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp9 = sp();
        if (poiPostPageShareVMSp9 != null && (c1187610h0h13 = poiPostPageShareVMSp9.LLILZIL) != null) {
            c1188440h22 = c1187610h0h13.poiAnchorData;
        } else {
            c1188440h22 = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp10 = sp();
        if (poiPostPageShareVMSp10 != null && (c1187610h0h12 = poiPostPageShareVMSp10.LLILZIL) != null && (poiDetailResponse5 = c1187610h0h12.cachedBasicInfoForCollect) != null) {
            collectInfo2 = poiDetailResponse5.getCollectInfo();
        } else {
            collectInfo2 = null;
        }
        if (aweme != null) {
            C1185490gxH.Companion.getClass();
            c1185490gxHLJ = C1188730h2V.LJ(aweme);
        } else {
            c1185490gxHLJ = null;
        }
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "detail_mob_data", null);
        if (c1185410gx92 != null) {
            previousPage2 = c1185410gx92.getPreviousPage();
            enterFrom2 = c1185410gx92.getEnterFrom();
            enterMethod = c1185410gx92.getEnterMethod();
        } else {
            previousPage2 = null;
            enterFrom2 = null;
            enterMethod = null;
        }
        if (c1188440h22 != null) {
            poiId = c1188440h22.getPoiId();
            poiInfoSource = c1188440h22.getPoiInfoSource();
            poiCityCode = c1188440h22.getPoiCityCode();
            poiRegionCode = c1188440h22.getPoiRegionCode();
            strLIZLLL = C1188460h24.LIZLLL(c1188440h22);
            strLIZJ = C1188460h24.LIZJ(c1188440h22);
            collectInfo3 = c1188440h22.getCollectInfo();
            fromGroupId = c1188440h22.getFromGroupId();
        } else {
            poiId = null;
            poiInfoSource = null;
            poiCityCode = null;
            poiRegionCode = null;
            strLIZLLL = null;
            strLIZJ = null;
            collectInfo3 = null;
            fromGroupId = null;
        }
        if (c1188440h22LJ != null) {
            poiId2 = c1188440h22LJ.getPoiId();
            poiInfoSource2 = c1188440h22LJ.getPoiInfoSource();
            poiCityCode2 = c1188440h22LJ.getPoiCityCode();
            poiRegionCode2 = c1188440h22LJ.getPoiRegionCode();
            strLIZLLL2 = C1188460h24.LIZLLL(c1188440h22LJ);
            strLIZJ2 = C1188460h24.LIZJ(c1188440h22LJ);
            String collectInfo5 = c1188440h22LJ.getCollectInfo();
            if (collectInfo5 != null) {
                collectInfo2 = collectInfo5;
            }
        } else {
            poiId2 = null;
            poiInfoSource2 = null;
            poiCityCode2 = null;
            poiRegionCode2 = null;
            strLIZLLL2 = null;
            strLIZJ2 = null;
        }
        if (c1185490gxHLJ != null) {
            groupId2 = c1185490gxHLJ.getGroupId();
            authorId = c1185490gxHLJ.getAuthorId();
        } else {
            groupId2 = null;
            authorId = null;
        }
        C1185500gxI c1185500gxI = C1188530h2B.Companion;
        C1188480h26 c1188480h26 = C1188510h29.Companion;
        if (c1188440h22 != null) {
            poiId3 = c1188440h22.getPoiId();
        } else {
            poiId3 = null;
        }
        c1188480h26.getClass();
        C1188510h29 c1188510h29LIZ = C1188480h26.LIZ(poiId3);
        if (c1188510h29LIZ != null) {
            searchParams = c1188510h29LIZ.getSearchParams();
        } else {
            searchParams = null;
        }
        c1185500gxI.getClass();
        String str3 = null;
        C786410Ut5.LJJIZ(bundle, "poi_collect_mob_data", new C1188530h2B("poi_detail", "click_button_video", previousPage2, LIZIZ, "detail", enterFrom2, enterMethod, null, null, null, null, poiId, poiInfoSource, poiCityCode, poiRegionCode, strLIZLLL, strLIZJ, collectInfo3, poiId2, poiInfoSource2, poiCityCode2, poiRegionCode2, null, strLIZLLL2, strLIZJ2, collectInfo2, C1185500gxI.LIZ(poiDetailResponse3, c1185410gx92, searchParams), fromGroupId, groupId2, authorId, null, new LinkedHashMap()));
        HashMap map2 = new HashMap();
        PoiPostPageShareVM poiPostPageShareVMSp11 = sp();
        if (poiPostPageShareVMSp11 != null && (c1187610h0h11 = poiPostPageShareVMSp11.LLILZIL) != null) {
            lValueOf = Long.valueOf(c1187610h0h11.fragmentId);
        } else {
            lValueOf = null;
        }
        map2.put("fragment_id", String.valueOf(lValueOf));
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ2 == null || (iPoiPostPageAbility2 = (IPoiPostPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ2, null), IPoiPostPageAbility.class, null)) == null || (strOf2 = iPoiPostPageAbility2.Of2()) == null) {
            strOf2 = "";
        }
        map2.put("poi_session_id", strOf2);
        Fragment fragmentLJIIJ3 = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ3 == null || (iPoiPostPageAbility = (IPoiPostPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ3, null), IPoiPostPageAbility.class, null)) == null || (strXP0 = iPoiPostPageAbility.XP0()) == null) {
            strXP0 = "";
        }
        map2.put("source_instance_id", strXP0);
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map2);
        Pair[] pairArr = new Pair[1];
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        pairArr[0] = new Pair("poi_id", ((C1187600h0g) obj5).LL);
        C786410Ut5.LJJIZ(bundle, "screen_shot_param", C2097608Jq.LJI(pairArr));
        PoiPostPageShareVM poiPostPageShareVMSp12 = sp();
        if (poiPostPageShareVMSp12 != null && (c1187610h0h10 = poiPostPageShareVMSp12.LLILZIL) != null) {
            c1185410gx93 = c1187610h0h10.poiDetailParams;
        } else {
            c1185410gx93 = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_detail_params", c1185410gx93);
        C786410Ut5.LJJJI("source_btm_token", strLIZ, bundle);
        bundle.putInt("post_bottom_bar_style", i);
        PoiPostPageShareVM poiPostPageShareVMSp13 = sp();
        if (poiPostPageShareVMSp13 != null && (c1187610h0h9 = poiPostPageShareVMSp13.LLILZIL) != null && (c1185450gxD = c1187610h0h9.poiDetailSessionModel) != null) {
            sessionId = c1185450gxD.getSessionId();
        } else {
            sessionId = null;
        }
        C786410Ut5.LJJJI("poi_session_id", sessionId, bundle);
        PoiPostPageShareVM poiPostPageShareVMSp14 = sp();
        if (poiPostPageShareVMSp14 != null && (c1187610h0h8 = poiPostPageShareVMSp14.LLILZIL) != null && (c1185410gx98 = c1187610h0h8.poiDetailParams) != null) {
            enterFrom3 = c1185410gx98.getEnterFrom();
        } else {
            enterFrom3 = null;
        }
        C786410Ut5.LJJJI("poi_enter_from", enterFrom3, bundle);
        PoiPostPageShareVM poiPostPageShareVMSp15 = sp();
        if (poiPostPageShareVMSp15 != null && (c1187610h0h7 = poiPostPageShareVMSp15.LLILZIL) != null && (c1185410gx97 = c1187610h0h7.poiDetailParams) != null) {
            adClickId = c1185410gx97.getAdClickId();
        } else {
            adClickId = null;
        }
        C786410Ut5.LJJJI("ad_click_id", adClickId, bundle);
        C1192440h8U.LIZ.getClass();
        bundle.putBoolean("privacy_auth_status_query_required", C1192440h8U.LIZIZ());
        PoiPostPageShareVM poiPostPageShareVMSp16 = sp();
        if (poiPostPageShareVMSp16 != null && (c1187610h0h6 = poiPostPageShareVMSp16.LLILZIL) != null && (c1185410gx96 = c1187610h0h6.poiDetailParams) != null && (sourceProductIds = c1185410gx96.getSourceProductIds()) != null) {
            arrayList = new ArrayList(sourceProductIds);
        } else {
            arrayList = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_product_ids", arrayList);
        PoiPostPageShareVM poiPostPageShareVMSp17 = sp();
        if (poiPostPageShareVMSp17 != null && (c1187610h0h5 = poiPostPageShareVMSp17.LLILZIL) != null && (c1185410gx95 = c1187610h0h5.poiDetailParams) != null && (sourceMerchantIds = c1185410gx95.getSourceMerchantIds()) != null) {
            arrayList2 = new ArrayList(sourceMerchantIds);
        } else {
            arrayList2 = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_merchant_ids", arrayList2);
        if (map != null) {
            obj6 = map.get("poi_router_params");
        } else {
            obj6 = null;
        }
        if (obj6 instanceof Serializable) {
            serializable = (Serializable) obj6;
        } else {
            serializable = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_router_params", serializable);
        if (map != null) {
            obj7 = map.get("poi_general_track_params");
        } else {
            obj7 = null;
        }
        if (obj7 instanceof Serializable) {
            serializable2 = (Serializable) obj7;
        } else {
            serializable2 = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_general_track_params", serializable2);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ.LJFF());
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
        Aweme aweme2 = c1187600h0g.LLILLJJLI;
        String str4 = c1187600h0g.LL;
        if (str4 != null) {
            str2 = str4;
        }
        int iLIZIZ = C631370Opb.LIZIZ(this);
        PoiPostPageShareVM poiPostPageShareVMSp18 = sp();
        if (poiPostPageShareVMSp18 != null && (c1187610h0h4 = poiPostPageShareVMSp18.LLILZIL) != null && (poiDetailResponse4 = c1187610h0h4.poiDetailResponse) != null) {
            collectInfo4 = poiDetailResponse4.getCollectInfo();
        } else {
            collectInfo4 = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp19 = sp();
        if (poiPostPageShareVMSp19 != null && (c1187610h0h3 = poiPostPageShareVMSp19.LLILZIL) != null && (c1185410gx94 = c1187610h0h3.poiDetailParams) != null) {
            fromGroupId2 = c1185410gx94.getFromGroupId();
        } else {
            fromGroupId2 = null;
        }
        Boolean bool = Boolean.FALSE;
        PoiPostPageShareVM poiPostPageShareVMSp20 = sp();
        if (poiPostPageShareVMSp20 != null && (c1187610h0h2 = poiPostPageShareVMSp20.LLILZIL) != null) {
            c1185490gxH = c1187610h0h2.poiAnchorMobData;
        } else {
            c1185490gxH = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp21 = sp();
        if (poiPostPageShareVMSp21 != null && (c1187970h1H = (C1187970h1H) poiPostPageShareVMSp21.getState()) != null && (postTag = c1187970h1H.LL) != null) {
            str3 = postTag.tagCode;
        }
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        Fragment fragmentLJIIJ4 = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ4 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ4, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        C1188410h1z.LIZIZ(aweme2, str2, iLIZIZ, collectInfo4, fromGroupId2, bool, c1185490gxH, "post_card", null, str3, null, pageFinderVia, interfaceC665370Q7zLJFF, 64);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1187600h0g r25) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.cell.PoiPostPageWaterFallReuseAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1187600h0g c1187600h0g) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1187600h0g c1187600h0g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
