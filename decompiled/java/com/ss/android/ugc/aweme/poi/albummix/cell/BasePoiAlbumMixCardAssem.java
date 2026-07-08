package com.ss.android.ugc.aweme.poi.albummix.cell;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1180320gow;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1183810guZ;
import X.C1185410gx9;
import X.C1185450gxD;
import X.C1185490gxH;
import X.C1185500gxI;
import X.C1186790gzN;
import X.C1187230h05;
import X.C1187240h06;
import X.C1187650h0l;
import X.C1187790h0z;
import X.C1188440h22;
import X.C1188460h24;
import X.C1188480h26;
import X.C1188510h29;
import X.C1188530h2B;
import X.C1188730h2V;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1192440h8U;
import X.C1200940hMC;
import X.C123100dR;
import X.C13LP;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1893310zMv;
import X.C18JG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2365509Or;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C631370Opb;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC1177490gkN;
import X.InterfaceC1587906Jp;
import X.InterfaceC658750Psf;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.albummix.cell.BasePoiAlbumMixCardAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BasePoiAlbumMixCardAssem<T extends BasePoiAlbumMixCardAssem<T>> extends ReusedUISlotAssem<T> implements InterfaceC712990Rxx<C1183810guZ> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18((BasePoiAlbumMixCardAssem) this, 864));
    public String LLJL;
    public String LLJLIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiHeaderTopVideosSharedViewModel up() {
        return (PoiHeaderTopVideosSharedViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void op(C1183810guZ c1183810guZ) {
        boolean z;
        String aid;
        String str;
        String string;
        String str2;
        String str3;
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        Integer num;
        String string2;
        PoiDataStruct poiDataStruct2;
        PoiAwemePictureInfo poiAwemePictureInfo2;
        PoiDataStruct poiDataStruct3;
        PoiAwemePictureInfo poiAwemePictureInfo3;
        Integer num2;
        PoiDataStruct poiDataStruct4;
        PoiAwemePictureInfo poiAwemePictureInfo4;
        PoiDataStruct poiDataStruct5;
        PoiAwemePictureInfo poiAwemePictureInfo5;
        Aweme aweme;
        PoiListApi.PoiMergedListItem poiMergedListItem = c1183810guZ.LLILLJJLI;
        JSONObject jSONObject = new JSONObject();
        Aweme aweme2 = poiMergedListItem.getAweme();
        if (aweme2 != null && aweme2.getAwemeType() == 240) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        if (z || (aweme = poiMergedListItem.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_initial_group_id", aid);
        Aweme aweme3 = poiMergedListItem.getAweme();
        if (aweme3 == null || aweme3.getAwemeType() != 240 || (poiDataStruct5 = poiMergedListItem.getAweme().getPoiDataStruct()) == null || (poiAwemePictureInfo5 = poiDataStruct5.poiAwemePictureInfo) == null || (str = poiAwemePictureInfo5.picId) == null) {
            str = "";
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_initial_picture_id", str);
        Aweme aweme4 = poiMergedListItem.getAweme();
        if (aweme4 == null || (string = Integer.valueOf(aweme4.getAwemeType()).toString()) == null) {
            string = "";
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_initial_aweme_type", string);
        Aweme aweme5 = poiMergedListItem.getAweme();
        if (aweme5 == null || (poiDataStruct3 = aweme5.getPoiDataStruct()) == null || (poiAwemePictureInfo3 = poiDataStruct3.poiAwemePictureInfo) == null || (num2 = poiAwemePictureInfo3.entityType) == null || num2.intValue() != 5 || (poiDataStruct4 = poiMergedListItem.getAweme().getPoiDataStruct()) == null || (poiAwemePictureInfo4 = poiDataStruct4.poiAwemePictureInfo) == null || (str2 = poiAwemePictureInfo4.entityId) == null) {
            str2 = "";
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_initial_review_id", str2);
        Aweme aweme6 = poiMergedListItem.getAweme();
        if (aweme6 == null || (poiDataStruct2 = aweme6.getPoiDataStruct()) == null || (poiAwemePictureInfo2 = poiDataStruct2.poiAwemePictureInfo) == null || (str3 = poiAwemePictureInfo2.source) == null) {
            str3 = "";
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_pic_source", str3);
        Aweme aweme7 = poiMergedListItem.getAweme();
        if (aweme7 != null && (poiDataStruct = aweme7.getPoiDataStruct()) != null && (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) != null && (num = poiAwemePictureInfo.entityType) != null && (string2 = num.toString()) != null) {
            str4 = string2;
        }
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_entity_type", str4);
        C1893310zMv.LIZIZ.LJIILIIL(PageFinder.via(C1189060h32.LJIIJ(this)), jSONObject, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    public final void tp(C1183810guZ c1183810guZ) {
        String str;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String aid;
        Object obj;
        Object obj2;
        String aid2;
        C1185410gx9 c1185410gx9;
        PoiListApi.PoiDetailResponse poiDetailResponse2;
        Map map;
        String groupId;
        Object obj3;
        String enterFrom;
        String previousPage;
        C1187230h05 c1187230h05;
        C1185410gx9 c1185410gx92;
        String name;
        boolean zBooleanValue;
        String address;
        String collectInfo;
        String strLJ;
        ?? LIZIZ;
        C1185410gx9 c1185410gx93;
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
        PoiListApi.PoiDetailResponse poiDetailResponse3;
        String poiId3;
        Map<String, String> searchParams;
        Long lValueOf;
        Object obj4;
        C1185410gx9 c1185410gx94;
        int iIntValue;
        String sessionId;
        String enterFrom3;
        String adClickId;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj5;
        Serializable serializable;
        Object obj6;
        Serializable serializable2;
        C1187230h05 c1187230h052;
        C1185410gx9 c1185410gx95;
        List<String> sourceMerchantIds;
        C1187230h05 c1187230h053;
        C1185410gx9 c1185410gx96;
        List<String> sourceProductIds;
        C1187230h05 c1187230h054;
        C1185410gx9 c1185410gx97;
        C1187230h05 c1187230h055;
        C1185410gx9 c1185410gx98;
        C1187230h05 c1187230h056;
        C1185450gxD c1185450gxD;
        C1187230h05 c1187230h057;
        C1187230h05 c1187230h058;
        C1187230h05 c1187230h059;
        C1187230h05 c1187230h0510;
        PoiListApi.PoiDetailResponse poiDetailResponse4;
        C1187230h05 c1187230h0511;
        C1187230h05 c1187230h0512;
        PoiInnerPageMobData poiInnerPageMobData;
        Boolean boolIsCollected;
        C1187230h05 c1187230h0513;
        C1185410gx9 c1185410gx99;
        C1187230h05 c1187230h0514;
        C1185490gxH c1185490gxH;
        C1187230h05 c1187230h0515;
        C1187230h05 c1187230h0516;
        C1187230h05 c1187230h0517;
        switch (c1183810guZ.LLILLL) {
            case 52601:
            case 52701:
                str = "multi_media_small";
                break;
            case 52700:
                str = "multi_media_big";
                break;
            default:
                Aweme aweme = c1183810guZ.LLILLJJLI.getAweme();
                if (aweme == null || aweme.getAwemeType() != 240) {
                    str = "";
                } else {
                    str = "multi_media_vertical";
                }
                break;
        }
        C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "poi_inner_page_pic_size", str);
        c1893310zMv.LJIILIIL(pageFinderVia, jSONObject, true);
        Context context = getContext();
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp = up();
        Object obj7 = null;
        if (poiHeaderTopVideosSharedViewModelUp != null && (c1187230h0517 = poiHeaderTopVideosSharedViewModelUp.LLILZIL) != null) {
            poiDetailResponse = c1187230h0517.poiDetailResponse;
        } else {
            poiDetailResponse = null;
        }
        Aweme aweme2 = c1183810guZ.LLILLJJLI.getAweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c91835.d85409_i");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        String strLIZ = C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(getContentView()), null);
        Aweme aweme3 = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        Integer num = c1183810guZ.LLILZLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str2 = ((C1183810guZ) obj).LL;
        if (str2 != null) {
            C1187240h06.LIZ.put(str2, Integer.valueOf(C631370Opb.LIZIZ(this)));
        }
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(getContentView(), getContentView().getWidth(), getContentView().getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        Aweme aweme4 = ((C1183810guZ) obj2).LLILLJJLI.getAweme();
        if (aweme4 != null) {
            aid2 = aweme4.getAid();
        } else {
            aid2 = null;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj7 = c724270Sb33.LL;
        }
        C1180320gow.LIZIZ(aid2, ((C1183810guZ) obj7).LL);
        C1187650h0l c1187650h0l = C1187650h0l.LIZ;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1187790h0z c1187790h0z = new C1187790h0z();
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp2 = up();
        if (poiHeaderTopVideosSharedViewModelUp2 != null && (c1187230h0516 = poiHeaderTopVideosSharedViewModelUp2.LLILZIL) != null) {
            c1185410gx9 = c1187230h0516.poiDetailParams;
        } else {
            c1185410gx9 = null;
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp3 = up();
        if (poiHeaderTopVideosSharedViewModelUp3 != null && (c1187230h0515 = poiHeaderTopVideosSharedViewModelUp3.LLILZIL) != null) {
            poiDetailResponse2 = c1187230h0515.cachedBasicInfoForCollect;
        } else {
            poiDetailResponse2 = null;
        }
        c1187650h0l.getClass();
        Object obj8 = ((LinkedHashMap) C1187650h0l.LIZ(fragmentLJIIJ, null, null, c1187790h0z, c1185410gx9, poiDetailResponse2, null)).get("poi_extra");
        if (obj8 instanceof Map) {
            map = (Map) obj8;
        } else {
            map = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        if (!C123100dR.LIZ(aid) || aid == null) {
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
        }
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aid, bundle);
        C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        bundle.putInt("video_type", 53);
        C786410Ut5.LJJJI("enter_from", "poi_detail", bundle);
        C786410Ut5.LJJJI("enter_method", "background_feed", bundle);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp4 = up();
        if (poiHeaderTopVideosSharedViewModelUp4 == null || (c1187230h0514 = poiHeaderTopVideosSharedViewModelUp4.LLILZIL) == null || (c1185490gxH = c1187230h0514.poiAnchorMobData) == null || (groupId = c1185490gxH.getGroupId()) == null) {
            groupId = "";
        }
        C786410Ut5.LJJJI("from_group_id", groupId, bundle);
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj3 = c724270Sb34.LL;
        } else {
            obj3 = null;
        }
        C786410Ut5.LJJJI("page_poi_id", ((C1183810guZ) obj3).LL, bundle);
        bundle.putBoolean("poi_collect_bottom_bar", true);
        bundle.putBoolean("hide_poi_anchor", true);
        C786410Ut5.LJJJI("video_from", "POI_TOP_VIDEOS_PAGE_ENTRANCE", bundle);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp5 = up();
        if (poiHeaderTopVideosSharedViewModelUp5 != null && (c1187230h0513 = poiHeaderTopVideosSharedViewModelUp5.LLILZIL) != null && (c1185410gx99 = c1187230h0513.poiDetailParams) != null) {
            enterFrom = c1185410gx99.getEnterFrom();
        } else {
            enterFrom = null;
        }
        if (Intrinsics.LJFF(enterFrom, "collection_places")) {
            C786410Ut5.LJJJI("previous_page", "collection_places", bundle);
        } else {
            PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp6 = up();
            if (poiHeaderTopVideosSharedViewModelUp6 != null && (c1187230h05 = poiHeaderTopVideosSharedViewModelUp6.LLILZIL) != null && (c1185410gx92 = c1187230h05.poiDetailParams) != null) {
                previousPage = c1185410gx92.getPreviousPage();
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
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("page_model", "detail");
        pairArr[1] = new Pair("current_page", "post_inner_page");
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp7 = up();
        if (poiHeaderTopVideosSharedViewModelUp7 == null || (poiInnerPageMobData = poiHeaderTopVideosSharedViewModelUp7.LLILZLL) == null || (strLJ = C2365509Or.LJ(poiInnerPageMobData)) == null) {
            strLJ = "";
        }
        pairArr[2] = new Pair("mob_data", strLJ);
        pairArr[3] = new Pair("enter_method", "background_feed");
        pairArr[4] = new Pair("poi_inner_page_pic_size", str);
        C1186790gzN.LJ(bundle, "poi_extras", C2097608Jq.LJI(pairArr));
        Context context2 = getContext();
        if (context2 != null) {
            C1200940hMC.LIZ.getClass();
            LIZIZ = C1200940hMC.LIZIZ(context2);
        } else {
            LIZIZ = 0;
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp8 = up();
        if (poiHeaderTopVideosSharedViewModelUp8 != null && (c1187230h0512 = poiHeaderTopVideosSharedViewModelUp8.LLILZIL) != null) {
            c1185410gx93 = c1187230h0512.poiDetailParams;
        } else {
            c1185410gx93 = null;
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp9 = up();
        if (poiHeaderTopVideosSharedViewModelUp9 != null && (c1187230h0511 = poiHeaderTopVideosSharedViewModelUp9.LLILZIL) != null) {
            c1188440h22 = c1187230h0511.poiAnchorData;
        } else {
            c1188440h22 = null;
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp10 = up();
        if (poiHeaderTopVideosSharedViewModelUp10 != null && (c1187230h0510 = poiHeaderTopVideosSharedViewModelUp10.LLILZIL) != null && (poiDetailResponse4 = c1187230h0510.cachedBasicInfoForCollect) != null) {
            collectInfo2 = poiDetailResponse4.getCollectInfo();
        } else {
            collectInfo2 = null;
        }
        if (aweme2 != null) {
            C1185490gxH.Companion.getClass();
            c1185490gxHLJ = C1188730h2V.LJ(aweme2);
        } else {
            c1185490gxHLJ = null;
        }
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme2, "detail_mob_data", null);
        if (c1185410gx93 != null) {
            previousPage2 = c1185410gx93.getPreviousPage();
            enterFrom2 = c1185410gx93.getEnterFrom();
            enterMethod = c1185410gx93.getEnterMethod();
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
            String collectInfo4 = c1188440h22LJ.getCollectInfo();
            if (collectInfo4 != null) {
                collectInfo2 = collectInfo4;
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
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp11 = up();
        if (poiHeaderTopVideosSharedViewModelUp11 != null && (c1187230h059 = poiHeaderTopVideosSharedViewModelUp11.LLILZIL) != null) {
            poiDetailResponse3 = c1187230h059.poiDetailResponse;
        } else {
            poiDetailResponse3 = null;
        }
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
        C786410Ut5.LJJIZ(bundle, "poi_collect_mob_data", new C1188530h2B("poi_detail", "click_button_video", previousPage2, LIZIZ, "detail", enterFrom2, enterMethod, null, null, null, null, poiId, poiInfoSource, poiCityCode, poiRegionCode, strLIZLLL, strLIZJ, collectInfo3, poiId2, poiInfoSource2, poiCityCode2, poiRegionCode2, null, strLIZLLL2, strLIZJ2, collectInfo2, C1185500gxI.LIZ(poiDetailResponse3, c1185410gx93, searchParams), fromGroupId, groupId2, authorId, null, new LinkedHashMap()));
        HashMap map2 = new HashMap();
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp12 = up();
        if (poiHeaderTopVideosSharedViewModelUp12 != null && (c1187230h058 = poiHeaderTopVideosSharedViewModelUp12.LLILZIL) != null) {
            lValueOf = Long.valueOf(c1187230h058.fragmentId);
        } else {
            lValueOf = null;
        }
        map2.put("fragment_id", String.valueOf(lValueOf));
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map2);
        Pair[] pairArr2 = new Pair[1];
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj4 = c724270Sb35.LL;
        } else {
            obj4 = null;
        }
        pairArr2[0] = new Pair("poi_id", ((C1183810guZ) obj4).LL);
        C786410Ut5.LJJIZ(bundle, "screen_shot_param", C2097608Jq.LJI(pairArr2));
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp13 = up();
        if (poiHeaderTopVideosSharedViewModelUp13 != null && (c1187230h057 = poiHeaderTopVideosSharedViewModelUp13.LLILZIL) != null) {
            c1185410gx94 = c1187230h057.poiDetailParams;
        } else {
            c1185410gx94 = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_detail_params", c1185410gx94);
        C786410Ut5.LJJJI("source_btm_token", strLIZ, bundle);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        bundle.putInt("post_bottom_bar_style", iIntValue);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp14 = up();
        if (poiHeaderTopVideosSharedViewModelUp14 != null && (c1187230h056 = poiHeaderTopVideosSharedViewModelUp14.LLILZIL) != null && (c1185450gxD = c1187230h056.poiDetailSessionModel) != null) {
            sessionId = c1185450gxD.getSessionId();
        } else {
            sessionId = null;
        }
        C786410Ut5.LJJJI("poi_session_id", sessionId, bundle);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp15 = up();
        if (poiHeaderTopVideosSharedViewModelUp15 != null && (c1187230h055 = poiHeaderTopVideosSharedViewModelUp15.LLILZIL) != null && (c1185410gx98 = c1187230h055.poiDetailParams) != null) {
            enterFrom3 = c1185410gx98.getEnterFrom();
        } else {
            enterFrom3 = null;
        }
        C786410Ut5.LJJJI("poi_enter_from", enterFrom3, bundle);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp16 = up();
        if (poiHeaderTopVideosSharedViewModelUp16 != null && (c1187230h054 = poiHeaderTopVideosSharedViewModelUp16.LLILZIL) != null && (c1185410gx97 = c1187230h054.poiDetailParams) != null) {
            adClickId = c1185410gx97.getAdClickId();
        } else {
            adClickId = null;
        }
        C786410Ut5.LJJJI("ad_click_id", adClickId, bundle);
        C1192440h8U.LIZ.getClass();
        bundle.putBoolean("privacy_auth_status_query_required", C1192440h8U.LIZIZ());
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp17 = up();
        if (poiHeaderTopVideosSharedViewModelUp17 != null && (c1187230h053 = poiHeaderTopVideosSharedViewModelUp17.LLILZIL) != null && (c1185410gx96 = c1187230h053.poiDetailParams) != null && (sourceProductIds = c1185410gx96.getSourceProductIds()) != null) {
            arrayList = new ArrayList(sourceProductIds);
        } else {
            arrayList = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_product_ids", arrayList);
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelUp18 = up();
        if (poiHeaderTopVideosSharedViewModelUp18 != null && (c1187230h052 = poiHeaderTopVideosSharedViewModelUp18.LLILZIL) != null && (c1185410gx95 = c1187230h052.poiDetailParams) != null && (sourceMerchantIds = c1185410gx95.getSourceMerchantIds()) != null) {
            arrayList2 = new ArrayList(sourceMerchantIds);
        } else {
            arrayList2 = null;
        }
        C786410Ut5.LJJJIL(bundle, "source_merchant_ids", arrayList2);
        if (map != null) {
            obj5 = map.get("poi_router_params");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof Serializable) {
            serializable = (Serializable) obj5;
        } else {
            serializable = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_router_params", serializable);
        if (map != null) {
            obj6 = map.get("poi_general_track_params");
        } else {
            obj6 = null;
        }
        if (obj6 instanceof Serializable) {
            serializable2 = (Serializable) obj6;
        } else {
            serializable2 = null;
        }
        C786410Ut5.LJJIZ(bundle, "poi_general_track_params", serializable2);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ.LJFF());
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1183810guZ c1183810guZ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1183810guZ c1183810guZ) {
    }

    public final void sp(SmartImageView smartImageView, UrlModel urlModel) {
        final String str;
        List<String> urlList;
        if (smartImageView == null) {
            return;
        }
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
            if (str != null && Intrinsics.LJFF(str, this.LLJL)) {
                return;
            }
        } else {
            str = null;
        }
        this.LLJLIL = str;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_album", "mix_page_item", new C1180560gpK(smartImageView.getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
        c1180600gpO.LJ = new InterfaceC658750Psf() { // from class: X.0h04
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                if (z && Intrinsics.LJFF(str, this.LLJLIL)) {
                    this.LLJL = str;
                }
            }
        };
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZIZ();
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
