package com.ss.android.ugc.aweme.poi.album;

import X.C09HN;
import X.C09YA;
import X.C1182380gsG;
import X.C1185000gwU;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1186500gyu;
import X.C1188440h22;
import X.C1697810uHb;
import X.C2365509Or;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumViewModel extends AssemViewModel<C1186500gyu> {
    public String LLILLJJLI;
    public String LLILLL;
    public PoiCurrentSessionInfo LLILZ;
    public PoiInnerPageMobData LLILZIL;
    public PoiListApi.PoiDetailResponse LLIZ;
    public C1185410gx9 LLIZLLLIL;
    public C1188440h22 LLJ;
    public C1185490gxH LLJI;
    public boolean LLJIJIL;
    public final C09YA LL = new C09YA(this, AFwS206S0000000_18.get$arr$(246));
    public final String LLILZLL = String.valueOf(System.currentTimeMillis());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1186500gyu(0);
    }

    public final void wQ2(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        String str2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLILZIL;
        if (poiInnerPageMobData != null) {
            str2 = poiInnerPageMobData.enterFrom;
        } else {
            str2 = null;
        }
        C1185430gxB.LJJIJL(c1185430gxB, str2, str, interfaceC665370Q7z, "poi_secondary_gallery_page", "category_background_album", pageFinder);
    }

    public final void vQ2(SmartImageView smartImageView, int i, Integer num, InterfaceC665370Q7z interfaceC665370Q7z) {
        List<PoiAlbumPageApi.Category> categories;
        ArrayList arrayListLIZ;
        List<PoiAlbumPageApi.Category> categories2;
        UrlModel urlModel;
        UrlModel urlModel2;
        List<String> urlList;
        List<String> urlList2;
        List<String> urlList3;
        String strLJ;
        String str;
        String str2;
        String str3;
        String str4;
        PoiCurrentSessionInfo poiCurrentSessionInfoCopy;
        int[] iArr = new int[2];
        smartImageView.getLocationOnScreen(iArr);
        ArrayList arrayListLJ = C1697810uHb.LJ(new PoiGalleryAnchorData(smartImageView.getWidth(), smartImageView.getHeight(), iArr[0], iArr[1], 240));
        PoiAlbumPageApi.PoiAlbumResponse poiAlbumResponseLIZ = getState().LL.LIZ();
        String str5 = null;
        if (poiAlbumResponseLIZ != null) {
            categories = poiAlbumResponseLIZ.getCategories();
        } else {
            categories = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (categories != null) {
            Iterator<PoiAlbumPageApi.Category> it2 = categories.iterator();
            while (it2.hasNext()) {
                Pair<ArrayList<String>, ArrayList<String>> galleryImageData = it2.next().getGalleryImageData();
                ArrayList<String> first = galleryImageData.getFirst();
                ArrayList<String> second = galleryImageData.getSecond();
                arrayList.addAll(first);
                arrayList2.addAll(second);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(smartImageView.getContext(), "aweme://poi/gallery/v2");
        smartRouteBuildRoute.withParam("poi_gallery_images", arrayList);
        if (!C1185000gwU.LIZ()) {
            arrayListLIZ = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            PoiAlbumPageApi.PoiAlbumResponse poiAlbumResponseLIZ2 = getState().LL.LIZ();
            if (poiAlbumResponseLIZ2 != null && (categories2 = poiAlbumResponseLIZ2.getCategories()) != null) {
                Iterator<PoiAlbumPageApi.Category> it3 = categories2.iterator();
                while (it3.hasNext()) {
                    List<PoiPicture> list = it3.next().poiPictures;
                    if (list != null) {
                        for (PoiPicture poiPicture : list) {
                            UrlModel urlModel3 = poiPicture.urlModel;
                            if ((urlModel3 != null && (urlList3 = urlModel3.getUrlList()) != null && (!urlList3.isEmpty())) || (((urlModel = poiPicture.originUrlInfo) != null && (urlList2 = urlModel.getUrlList()) != null && (!urlList2.isEmpty())) || ((urlModel2 = poiPicture.compressedUrlInfo) != null && (urlList = urlModel2.getUrlList()) != null && (!urlList.isEmpty())))) {
                                arrayList3.add(poiPicture);
                            }
                        }
                    }
                }
            }
            arrayListLIZ = C09HN.LIZ(arrayList3);
        }
        smartRouteBuildRoute.withParam("poi_picture_infos", arrayListLIZ);
        if (arrayList2 != null) {
            smartRouteBuildRoute.withParam("thumbnail_urls", arrayList2);
        }
        smartRouteBuildRoute.withParam("poi_gallery_index", i);
        smartRouteBuildRoute.withParam("image_size", num);
        smartRouteBuildRoute.withParam("poi_gallery_anchor_data", arrayListLJ);
        smartRouteBuildRoute.withParam("enable_exit_anim", false);
        smartRouteBuildRoute.withParam("poi_detail_response", this.LLIZ);
        smartRouteBuildRoute.withParam("poi_anchor_data", this.LLJ);
        smartRouteBuildRoute.withParam("poi_detail_params", this.LLIZLLLIL);
        smartRouteBuildRoute.withParam("poi_anchor_mob_data", this.LLJI);
        PoiCurrentSessionInfo poiCurrentSessionInfo = this.LLILZ;
        if (poiCurrentSessionInfo == null || (poiCurrentSessionInfoCopy = poiCurrentSessionInfo.copy(poiCurrentSessionInfo.anchorModuleList, poiCurrentSessionInfo.enableBottomBar, poiCurrentSessionInfo.poiSessionId, poiCurrentSessionInfo.poiId, this.LLILZLL, poiCurrentSessionInfo.poiName, poiCurrentSessionInfo.poiAddress, poiCurrentSessionInfo.isCollected, poiCurrentSessionInfo.initialPoiFromGroupId, poiCurrentSessionInfo.initialPoiEnterFrom, poiCurrentSessionInfo.initialPoiEnterMethod, poiCurrentSessionInfo.collectInfo, poiCurrentSessionInfo.searchParams, "album_inner_page", poiCurrentSessionInfo.regionCode)) == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoCopy)) == null) {
            strLJ = "";
        }
        smartRouteBuildRoute.withParam("current_poi_session_info", strLJ);
        String str6 = this.LLILLJJLI;
        String str7 = this.LLILLL;
        PoiCurrentSessionInfo poiCurrentSessionInfo2 = this.LLILZ;
        if (poiCurrentSessionInfo2 != null) {
            str = poiCurrentSessionInfo2.regionCode;
        } else {
            str = null;
        }
        PoiInnerPageMobData poiInnerPageMobData = this.LLILZIL;
        if (poiInnerPageMobData != null) {
            str2 = poiInnerPageMobData.fromGroupId;
            str3 = poiInnerPageMobData.initialPoiEnterFrom;
            str4 = poiInnerPageMobData.initialPoiEnterMethod;
            str5 = poiInnerPageMobData.initialPoiFromGroupId;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        smartRouteBuildRoute.withParam("mob_data", new PoiInnerPageMobData("album_page", "header_image", str6, str7, str, str2, str3, str4, str5));
        smartRouteBuildRoute.withParam("poi_enter_gallery_scene", "album_gallery");
        PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7z);
        if (poiCommonMobParamsLJ != null) {
            smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
        }
        smartRouteBuildRoute.open();
    }
}
