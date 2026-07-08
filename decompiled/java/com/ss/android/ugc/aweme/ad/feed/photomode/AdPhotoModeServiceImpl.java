package com.ss.android.ugc.aweme.ad.feed.photomode;

import X.AbstractC1010290cOh;
import X.C098200Yq;
import X.C0R12;
import X.C0WIY;
import X.C1005320cGg;
import X.C1007860cKm;
import X.C1009740cNo;
import X.C1010280cOg;
import X.C1010320cOk;
import X.C1011220cQC;
import X.C1017070cZd;
import X.C1017200cZq;
import X.C1017230cZt;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1026350cob;
import X.C1027410cqJ;
import X.C1027580cqa;
import X.C1264004x4;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C189200o6;
import X.C1904807d8;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2201691BEx;
import X.C2344009Gk;
import X.C303770BvT;
import X.C655610Pnb;
import X.C7740030o;
import X.C991890bv1;
import X.EnumC1002140cBY;
import X.EnumC1005330cGh;
import X.EnumC1008920cMU;
import X.EnumC1019010ccl;
import X.InterfaceC1008930cMV;
import X.InterfaceC657510Pqf;
import X.InterfaceC665370Q7z;
import X.InterfaceC719460SKa;
import android.content.Context;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ImageInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPhotoModeServiceImpl implements IAdPhotoModeService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final String LIZIZ() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final String LJI() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final long LJIILL() {
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        c1010280cOg.getClass();
        long jCurrentTimeMillis = C1010280cOg.LJIIJJI + System.currentTimeMillis();
        c1010280cOg.getClass();
        return jCurrentTimeMillis - C1010280cOg.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean LJIJI() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final long LJJII() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final int LJJIJIIJIL() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJI;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final String getEnterMethod() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJII;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void reset() {
        C1010280cOg.LIZ.getClass();
        C1010280cOg.LIZJ = null;
        C1010280cOg.LIZLLL = null;
        C1010280cOg.LJ = null;
        C1010280cOg.LJFF = 0;
        C1010280cOg.LJI = 0;
        C1010280cOg.LJII = "auto";
        C1010280cOg.LJIIJ = 0L;
        C1010280cOg.LJIIJJI = 0L;
        C1010280cOg.LJIIL = 0L;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        c1010280cOg.getClass();
        if (Intrinsics.LJFF(C1010280cOg.LIZIZ, interfaceC665370Q7z)) {
            c1010280cOg.getClass();
            C1010280cOg.LIZIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final Map<String, Object> LIZLLL(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        String uri;
        if (aweme == null) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        int iLJI = C1009740cNo.LJI(aweme);
        int iLJJIJIIJIL = LJJIJIIJIL() * iLJI;
        int i = iLJI + iLJJIJIIJIL;
        while (iLJJIJIIJIL < i) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C1904807d8.LIZ(iLJJIJIIJIL, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (uri = urlModel.getUri()) != null && uri.length() > 0) {
                arrayList.add(uri);
            }
            iLJJIJIIJIL++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (arrayList.size() > 1) {
            linkedHashMap.put("image_id_list", arrayList.toArray(new String[0]));
        } else if (arrayList.size() == 1) {
            Object objLIZ = C1904807d8.LIZ(0, arrayList);
            if (objLIZ == null) {
                objLIZ = "";
            }
            linkedHashMap.put("image_id", objLIZ);
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImage> photoModeImageList;
        boolean z = false;
        if (!C1017070cZd.LLIIL(aweme) || C1009740cNo.LJIIL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getPhotoCarouselInfo() == null) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && awemeRawAd2.getEnableJumpToProduct() == 3) {
            return true;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null && awemeRawAd3.getEnableJumpToProduct() == 2 && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (photoModeImageList = photoModeImageInfo.getPhotoModeImageList()) != null) {
            int size = photoModeImageList.size();
            C1010280cOg.LIZ.getClass();
            if (C1010280cOg.LJI == size - 1) {
                z = true;
            }
            return !z;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1010280cOg.LIZ.getClass();
        C1010280cOg.LIZIZ = interfaceC665370Q7z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final Pair<String, String> LJIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        NativeSiteConfig nativeSiteConfig;
        String str;
        String str2 = "";
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
            C1010280cOg.LIZ.getClass();
            PhotoCarouselProductStruct photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(C1010280cOg.LJI, productList);
            if (photoCarouselProductStruct != null) {
                String nativeSiteCustomData = photoCarouselProductStruct.getNativeSiteCustomData();
                if (nativeSiteCustomData != null && nativeSiteCustomData.length() != 0) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (nativeSiteConfig = photoCarouselInfo2.getNativeSiteConfig()) != null && (str = nativeSiteConfig.lynxScheme) != null) {
                        str2 = str;
                    }
                    return new Pair<>(str2, photoCarouselProductStruct.getNativeSiteCustomData());
                }
                return new Pair<>(photoCarouselProductStruct.getWebUrl(), null);
            }
        }
        return new Pair<>("", null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final List<ImageInfo> LJIILJJIL(Aweme aweme) {
        String uri;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iLJI = C1009740cNo.LJI(aweme);
        int iLJJIJIIJIL = LJJIJIIJIL() * iLJI;
        int i = iLJI + iLJJIJIIJIL;
        while (iLJJIJIIJIL < i) {
            String strLJJIZ = LJJIZ(iLJJIJIIJIL, aweme);
            if (strLJJIZ == null || strLJJIZ.length() <= 0) {
                strLJJIZ = null;
            }
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C1904807d8.LIZ(iLJJIJIIJIL, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (uri = urlModel.getUri()) == null || uri.length() <= 0) {
                uri = null;
            }
            if ((strLJJIZ != null && strLJJIZ.length() != 0) || (uri != null && uri.length() != 0)) {
                arrayList.add(new ImageInfo(strLJJIZ, uri));
            }
            iLJJIJIIJIL++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIJ(EnumC1019010ccl enumC1019010ccl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSlideArea: ");
        sbLIZ.append(enumC1019010ccl.getValue());
        C1022620cia.LIZ("AdPhotoModeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        String value = enumC1019010ccl.getValue();
        c1010280cOg.getClass();
        C1010280cOg.LJIIIIZZ = value;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJI(EnumC1002140cBY enumC1002140cBY) {
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        String value = enumC1002140cBY.getValue();
        c1010280cOg.getClass();
        C1010280cOg.LJIIIZ = value;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIII(long j) {
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        c1010280cOg.getClass();
        long j2 = C1010280cOg.LJIIJJI;
        c1010280cOg.getClass();
        long j3 = j2 + (j - C1010280cOg.LJIIL);
        c1010280cOg.getClass();
        C1010280cOg.LJIIJJI = j3;
        c1010280cOg.getClass();
        List<Long> list = C1010280cOg.LJ;
        if (list != null) {
            c1010280cOg.getClass();
            List<Long> list2 = C1010280cOg.LIZLLL;
            if (list2 != null) {
                c1010280cOg.getClass();
                int i = C1010280cOg.LJI;
                if (i >= 0 && i < list.size() && i < list2.size()) {
                    ListProtector.set(list, i, Long.valueOf(((Number) ListProtector.get(list, i)).longValue() + (j - ((Number) ListProtector.get(list2, i)).longValue())));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final Map<String, Object> LJJIIJ(Aweme aweme) {
        if (aweme == null) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        int iLJI = C1009740cNo.LJI(aweme);
        int iLJJIJIIJIL = LJJIJIIJIL() * iLJI;
        int i = iLJI + iLJJIJIIJIL;
        while (iLJJIJIIJIL < i) {
            String strLJJIZ = LJJIZ(iLJJIJIIJIL, aweme);
            if (strLJJIZ != null && strLJJIZ.length() > 0) {
                arrayList.add(strLJJIZ);
            }
            iLJJIJIIJIL++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (arrayList.size() > 1) {
            linkedHashMap.put("product_id_list", arrayList.toArray(new String[0]));
        } else if (arrayList.size() == 1) {
            Object objLIZ = C1904807d8.LIZ(0, arrayList);
            if (objLIZ == null) {
                objLIZ = "";
            }
            linkedHashMap.put("product_id", objLIZ);
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIIZ(Aweme aweme) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        boolean z;
        C1017200cZq c1017200cZqLJIL;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null) {
            return;
        }
        int iLJJIJIIJIL = LJJIJIIJIL();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(iLJJIJIIJIL, productList)) != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && iLJJIJIIJIL + 1 == imageList.size()) {
                z = true;
            } else {
                z = false;
            }
            C1017230cZt c1017230cZt = new C1017230cZt(photoCarouselProductStruct.getWebUrl(), photoCarouselProductStruct.getOpenUrl(), null, C2097608Jq.LJIIIIZZ(new Pair("productId", photoCarouselProductStruct.getProductId()), new Pair("productIndex", Integer.valueOf(iLJJIJIIJIL)), new Pair("isLastIndex", Boolean.valueOf(z))));
            InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
            if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null) {
                c1017200cZqLJIL.LIZJ(c1017230cZt, aweme.getAwemeRawAd());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIIZI(Aweme aweme) {
        Long creativeId;
        String logExtra;
        int size;
        String str;
        List<PhotoModeImageUrlModel> imageList;
        C1010280cOg.LIZ.getClass();
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeId = awemeRawAd.getCreativeId();
            } else {
                creativeId = null;
            }
            String strValueOf = String.valueOf(creativeId);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                logExtra = awemeRawAd2.getLogExtra();
            } else {
                logExtra = null;
            }
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "otherclick", strValueOf, logExtra, null);
            c1022820ciuLJ.LIZJ("sponsored", "refer");
            if (C1017070cZd.LLIIL(aweme)) {
                int i = C1010280cOg.LJI;
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    size = imageList.size();
                } else {
                    size = 0;
                }
                IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
                if (C1009740cNo.LJIIL(aweme)) {
                    str = "page_location";
                } else {
                    str = "image_location";
                }
                c1022820ciuLJ.LIZIZ(Integer.valueOf(i + 1), str);
                c1022820ciuLJ.LIZIZ(Integer.valueOf(size), "image_cnt");
                c1022820ciuLJ.LIZIZ(C1010280cOg.LJII, "enter_method");
                c1022820ciuLJ.LIZIZ(iAdPhotoModeService.LJIJJ(i, aweme), "image_show_count");
                c1022820ciuLJ.LIZIZ(Long.valueOf(System.currentTimeMillis() - C1010280cOg.LJIIJ), "first_slide_duration");
                c1022820ciuLJ.LIZ(iAdPhotoModeService.LIZLLL(aweme));
            }
            c1022820ciuLJ.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIJL(Aweme aweme) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && photoCarouselInfo.getDynamicCarouselFirstIndex() != null) {
            photoCarouselInfo.setDynamicCarouselLastIndex(Integer.valueOf(LJJIJIIJIL()));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final int LJJIJLIJ(Aweme aweme) {
        int iIntValue;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer dynamicCarouselLastIndex;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        Integer dynamicCarouselFirstIndex;
        C1007860cKm c1007860cKmLJIILIIL;
        Integer numValueOf;
        int iIntValue2 = 0;
        if (C0R12.LIZIZ.LJIL(aweme)) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null && (numValueOf = Integer.valueOf(c1007860cKmLJIILIIL.LJ)) != null) {
                iIntValue2 = numValueOf.intValue();
            }
            int iLJI = C1009740cNo.LJI(aweme);
            if (iLJI != 0) {
                return iIntValue2 / iLJI;
            }
            return iIntValue2;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo2 = awemeRawAd.getPhotoCarouselInfo()) != null && (dynamicCarouselFirstIndex = photoCarouselInfo2.getDynamicCarouselFirstIndex()) != null) {
            iIntValue = dynamicCarouselFirstIndex.intValue();
        } else {
            iIntValue = -1;
        }
        c2344009Gk.LIZJ(iIntValue, "first_index");
        C20684815ws.LJIILLIIL("dynamic_carousel_state", c2344009Gk.LIZ);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (photoCarouselInfo = awemeRawAd2.getPhotoCarouselInfo()) != null && photoCarouselInfo.getDynamicCarouselFirstIndex() != null) {
            if (photoCarouselInfo.getDynamicCarouselLastIndex() == null) {
                dynamicCarouselLastIndex = photoCarouselInfo.getDynamicCarouselFirstIndex();
            } else {
                dynamicCarouselLastIndex = photoCarouselInfo.getDynamicCarouselLastIndex();
            }
            if (dynamicCarouselLastIndex != null) {
                iIntValue2 = dynamicCarouselLastIndex.intValue();
            }
        }
        int iLJI2 = C1009740cNo.LJI(aweme);
        if (iLJI2 != 0) {
            return iIntValue2 / iLJI2;
        }
        return iIntValue2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIL(int i) {
        C1010280cOg.LIZ.getClass();
        C1010280cOg.LJI = i;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void setEnterMethod(String str) {
        C1010280cOg.LIZ.getClass();
        C1010280cOg.LJII = str;
    }

    public static String LJJIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
            List<PhotoCarouselProductStruct> productList = photoCarouselInfo.getProductList();
            if (productList != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList)) != null) {
                return photoCarouselProductStruct.getProductId();
            }
            return null;
        }
        return ((C1011220cQC) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJFF()).LIZ(i, aweme);
    }

    public static boolean LJJJ(int i, Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        LivePhotoStruct livePhotoStruct;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (livePhotoStruct = photoModeImageUrlModel.livePhotoStruct) != null && livePhotoStruct.isLivePhoto()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final Integer LJIJJ(int i, Aweme aweme) {
        int iLJI = i * C1009740cNo.LJI(aweme);
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LIZ(iLJI);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIJIL(int i, Aweme aweme) {
        int iLJI = C1009740cNo.LJI(aweme);
        int i2 = 0;
        while (i2 < iLJI) {
            i2++;
            LJIIJJI(aweme, LJJIJLIJ(aweme) + 1, "auto", i2, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean LJIIIIZZ(Context context, Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        long jLongValue;
        long jLongValue2;
        Long groupId;
        Long creativeId;
        Long adId;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList)) == null) {
            return false;
        }
        String openUrl = photoCarouselProductStruct.getOpenUrl();
        if (openUrl.length() > 0) {
            String logExtra = null;
            if (1 != 0) {
                IFeedAdShoppingService iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi$default(IFeedAdShoppingService.class, false, false, false, 14, null);
                if (iFeedAdShoppingService != null) {
                    openUrl = iFeedAdShoppingService.LIZIZ(aweme, openUrl, null, false);
                }
                C1027580cqa c1027580cqa = new C1027580cqa();
                c1027580cqa.LJJIII(openUrl);
                c1027580cqa.LJ(aweme.getAwemeRawAd());
                c1027580cqa.LIZLLL(aweme.getAid());
                c1027580cqa.LJJIJL("draw_ad");
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                long jLongValue3 = 0;
                if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
                    jLongValue = adId.longValue();
                } else {
                    jLongValue = 0;
                }
                c1027580cqa.LIZ(jLongValue);
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
                    jLongValue2 = creativeId.longValue();
                } else {
                    jLongValue2 = 0;
                }
                c1027580cqa.LJI(jLongValue2);
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null) {
                    logExtra = awemeRawAd4.getLogExtra();
                }
                c1027580cqa.LJIJJ(logExtra);
                AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                if (awemeRawAd5 != null && (groupId = awemeRawAd5.getGroupId()) != null) {
                    jLongValue3 = groupId.longValue();
                }
                c1027580cqa.LJIILIIL(jLongValue3);
                return C1027410cqJ.LIZLLL(context, c1027580cqa.LIZ).LIZ();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean LJIILIIL(Aweme aweme, IPhotoSlidesAbility iPhotoSlidesAbility, Object obj) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        Object next;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        RectF rectFLIZJ;
        C0WIY c0wiy;
        Float f;
        Float f2;
        Object obj2;
        Long lValueOf;
        AnoleModel anoleModel2;
        Map map2;
        boolean zContains = false;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Object c098200Yq = null;
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C13LQ.LJIILLIIL(((AnoleComponentModel) next).type, (Object[]) C303770BvT.LIZIZ.getValue())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnoleComponentModel anoleComponentModel = (AnoleComponentModel) next;
            if (anoleComponentModel != null) {
                if (iPhotoSlidesAbility != null && (interfaceC719460SKaLJLIL = iPhotoSlidesAbility.LJLIL()) != null && (rectFLIZJ = interfaceC719460SKaLJLIL.LIZJ()) != null) {
                    if (!(obj instanceof C0WIY) || (c0wiy = (C0WIY) obj) == null) {
                        return false;
                    }
                    F f3 = c0wiy.LIZ;
                    if ((f3 instanceof Float) && (f = (Float) f3) != null) {
                        float fFloatValue = f.floatValue();
                        S s = c0wiy.LIZIZ;
                        if ((s instanceof Float) && (f2 = (Float) s) != null && (zContains = rectFLIZJ.contains(fFloatValue, f2.floatValue()))) {
                            String aid = aweme.getAid();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put(EnumC1005330cGh.ENTER_FROM.getRName(), 2);
                            linkedHashMap.put(EnumC1005330cGh.REFER.getRName(), "image");
                            linkedHashMap.put(EnumC1005330cGh.TAG.getRName(), "draw_ad");
                            String rName = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Map<String, Object> eventInfos = anoleComponentModel.getEventInfos();
                            if (eventInfos != null) {
                                obj2 = eventInfos.get("realtime_click");
                            } else {
                                obj2 = null;
                            }
                            if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                                linkedHashMap2.putAll(map2);
                            }
                            linkedHashMap2.put("component_id", Long.valueOf(anoleComponentModel.getID()));
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null && (anoleModel2 = awemeRawAd2.getAnoleModel()) != null) {
                                lValueOf = Long.valueOf(anoleModel2.templateID);
                            } else {
                                lValueOf = null;
                            }
                            linkedHashMap2.put("template_id", lValueOf);
                            linkedHashMap2.put("component_type", anoleComponentModel.type);
                            linkedHashMap2.put("render_strategy", anoleComponentModel.getRenderStrategy());
                            linkedHashMap2.put("prerender_failed_strategy", anoleComponentModel.prerenderFailedStrategy);
                            linkedHashMap.put(rName, linkedHashMap2);
                            linkedHashMap.put(EnumC1005330cGh.C_ROUTER_ENABLE.getRName(), Boolean.TRUE);
                            if (!Intrinsics.LJFF(anoleComponentModel.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
                                try {
                                    Gson gson = C7740030o.LIZ().getGson();
                                    if (gson != null) {
                                        c098200Yq = (CRouterCoreModel) gson.LJII(String.valueOf(anoleComponentModel.getUgenJumpModel()), CRouterCoreModel.class);
                                    }
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                                    linkedHashMap.put(EnumC1005330cGh.CROUTER_JUMP_MODEL.getRName(), c098200Yq);
                                }
                            }
                            C1440005kM.LIZ(new C991890bv1(aid, new C1005320cGg(1, linkedHashMap)));
                            return zContains;
                        }
                    }
                }
                return zContains;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r16, long r17, com.ss.android.ugc.aweme.feed.model.Aweme r19) {
        /*
            r15 = this;
            X.0cOg r0 = X.C1010280cOg.LIZ
            r0.getClass()
            int r10 = X.C1010280cOg.LJI
            java.lang.String r12 = X.C1010280cOg.LJII
            X.0cOk r13 = X.C1010320cOk.LIZLLL
            r14 = r19
            r11 = r16
            r9 = r15
            r9.LJJJI(r10, r11, r12, r13, r14)
            long r7 = X.C1010280cOg.LJIIJJI
            long r7 = r7 + r17
            long r0 = X.C1010280cOg.LJIIL
            long r7 = r7 - r0
            if (r14 == 0) goto L9a
            boolean r1 = X.C1010120cOQ.LJJIFFI(r14)
            r0 = 1
            if (r1 != r0) goto L9a
        L23:
            r3 = 0
            if (r0 == 0) goto L47
            X.0Pnb r0 = X.C655610Pnb.LIZIZ
            X.0Pqf r0 = r0.LIZLLL()
            if (r0 == 0) goto L47
            X.0Puv r0 = r0.LJIJ(r14)
            if (r0 == 0) goto L47
            X.0cFU r6 = r0.getShareInfo()
            r4 = 0
            if (r6 == 0) goto L47
            long r1 = r6.LJFF
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L47
            long r7 = r7 + r1
            if (r6 == 0) goto L47
            r6.LJFF = r4
        L47:
            if (r14 == 0) goto L98
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r14.getAwemeRawAd()
        L4d:
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "stay_duration"
            X.0ciu r2 = X.C2184171Adz.LIZLLL(r1, r0, r2)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "image"
            r2.LIZJ(r0, r1)
            int r0 = r9.LJJIJIIJIL()
            java.lang.Integer r1 = r9.LJIJJ(r0, r14)
            java.lang.String r0 = "page_location"
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "duration"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.LIZIZ(r0, r1)
            java.lang.String r1 = "image_cnt"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2.LIZIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r14)
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct r0 = r0.getPhotoCarouselInfo()
            if (r0 == 0) goto L8f
            int r0 = r0.getProductCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L8f:
            java.lang.String r0 = "product_count"
            r2.LIZIZ(r3, r0)
            r2.LJII()
            return
        L98:
            r2 = r3
            goto L4d
        L9a:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl.LJIIZILJ(int, long, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIJJLI(boolean z, long j, Integer num) {
        if (z) {
            C1010280cOg.LIZ.getClass();
            C1010280cOg.LJIIJ = j;
        }
        C1010280cOg c1010280cOg = C1010280cOg.LIZ;
        c1010280cOg.getClass();
        C1010280cOg.LJIIL = j;
        if (num != null) {
            int iIntValue = num.intValue();
            c1010280cOg.getClass();
            C1010280cOg.LJFF = iIntValue;
            ArrayList arrayList = new ArrayList(iIntValue);
            for (int i = 0; i < iIntValue; i++) {
                arrayList.add(0);
            }
            c1010280cOg.getClass();
            C1010280cOg.LIZJ = arrayList;
            C1010280cOg c1010280cOg2 = C1010280cOg.LIZ;
            ArrayList arrayList2 = new ArrayList(iIntValue);
            for (int i2 = 0; i2 < iIntValue; i2++) {
                arrayList2.add(0L);
            }
            c1010280cOg2.getClass();
            C1010280cOg.LIZLLL = arrayList2;
            C1010280cOg c1010280cOg3 = C1010280cOg.LIZ;
            ArrayList arrayList3 = new ArrayList(iIntValue);
            for (int i3 = 0; i3 < iIntValue; i3++) {
                arrayList3.add(0L);
            }
            c1010280cOg3.getClass();
            C1010280cOg.LJ = arrayList3;
            C1010280cOg.LIZ.getClass();
            List<Long> list = C1010280cOg.LIZLLL;
            if (list != null && (!list.isEmpty())) {
                ListProtector.set(list, 0, Long.valueOf(j));
            }
        }
        C1010280cOg c1010280cOg4 = C1010280cOg.LIZ;
        c1010280cOg4.getClass();
        List<Long> list2 = C1010280cOg.LIZLLL;
        if (list2 != null) {
            c1010280cOg4.getClass();
            int i4 = C1010280cOg.LJI;
            if (i4 >= 0 && i4 < list2.size()) {
                ListProtector.set(list2, i4, Long.valueOf(j));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIL(int i, int i2, long j, Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        Object uri;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "pinch", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("image", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i + 1), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        C1010280cOg.LIZ.getClass();
        c1022820ciuLIZLLL.LIZIZ(C1010280cOg.LJII, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "pinch_duration");
        c1022820ciuLIZLLL.LIZIZ(C1010280cOg.LIZ(i), "image_show_count");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i, aweme) ? 1 : 0), "is_video");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i >= 0 && i < imageList.size()) {
            UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i)).displayImageNoWatermark;
            if (urlModel != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            c1022820ciuLIZLLL.LIZIZ(uri, "image_id");
        }
        Object objLJJIZ = LJJIZ(i, aweme);
        if (objLJJIZ != null) {
            c1022820ciuLIZLLL.LIZIZ(objLJJIZ, "product_id");
        }
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIJIIJI(int i, int i2, int i3, Aweme aweme) {
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        Object uri;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselFormatType;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("image", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2 + 1), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i + 1), "page_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "image_cnt");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (carouselFormatType = photoCarouselInfo.getCarouselFormatType()) != null) {
            iIntValue = carouselFormatType.intValue();
        } else {
            iIntValue = 0;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iIntValue), "carousel_format_type");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i2 >= 0 && i2 < imageList.size()) {
            UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i2)).displayImageNoWatermark;
            if (urlModel != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            c1022820ciuLIZLLL.LIZIZ(uri, "image_id");
        }
        Object objLJJIZ = LJJIZ(i2, aweme);
        if (objLJJIZ != null) {
            c1022820ciuLIZLLL.LIZIZ(objLJJIZ, "product_id");
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i2, aweme) ? 1 : 0), "is_video");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIIJJI(Aweme aweme, int i, String str, int i2, int i3) {
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        Object uri;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselFormatType;
        int i4 = i2 - 1;
        C1010280cOg.LIZ.getClass();
        List<Integer> list = C1010280cOg.LIZJ;
        if (list != null && i4 >= 0 && i4 < list.size()) {
            ListProtector.set(list, i4, Integer.valueOf(((Number) ListProtector.get(list, i4)).intValue() + 1));
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("image", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "page_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i4, aweme) ? 1 : 0), "is_video");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (carouselFormatType = photoCarouselInfo.getCarouselFormatType()) != null) {
            iIntValue = carouselFormatType.intValue();
        } else {
            iIntValue = 0;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iIntValue), "carousel_format_type");
        c1022820ciuLIZLLL.LIZIZ(C1010280cOg.LIZ(i4), "image_show_count");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i4 >= 0 && i4 < imageList.size()) {
            UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i4)).displayImageNoWatermark;
            if (urlModel != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            c1022820ciuLIZLLL.LIZIZ(uri, "image_id");
        }
        Object objLJJIZ = LJJIZ(i4, aweme);
        if (objLJJIZ != null) {
            c1022820ciuLIZLLL.LIZIZ(objLJJIZ, "product_id");
        }
        c1022820ciuLIZLLL.LJII();
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Long> list2 = C1010280cOg.LIZLLL;
        if (list2 != null && i4 >= 0 && i4 < list2.size()) {
            ListProtector.set(list2, i4, Long.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final boolean LJJIFFI(int i, Aweme aweme, Context context, Integer num, C1264004x4 c1264004x4) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        boolean z;
        String webUrl;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        NativeSiteConfig nativeSiteConfig;
        long jLongValue;
        long jLongValue2;
        String nativeSiteAdInfo;
        Long groupId;
        Long creativeId;
        Long adId;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList)) == null) {
            return false;
        }
        String nativeSiteCustomData = photoCarouselProductStruct.getNativeSiteCustomData();
        if (nativeSiteCustomData != null && nativeSiteCustomData.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String logExtra = null;
        if (z) {
            webUrl = photoCarouselProductStruct.getWebUrl();
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (nativeSiteConfig = photoCarouselInfo2.getNativeSiteConfig()) != null) {
                webUrl = nativeSiteConfig.lynxScheme;
            } else {
                webUrl = null;
            }
        }
        C1027580cqa c1027580cqa = new C1027580cqa();
        c1027580cqa.LJJJIL(webUrl);
        String strLIZLLL = C1026350cob.LIZLLL(num);
        c1027580cqa.LJ(aweme.getAwemeRawAd());
        c1027580cqa.LIZLLL(aweme.getAid());
        c1027580cqa.LJJIJL("draw_ad");
        c1027580cqa.LJJIJ(strLIZLLL);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        long jLongValue3 = 0;
        if (awemeRawAd3 != null && (adId = awemeRawAd3.getAdId()) != null) {
            jLongValue = adId.longValue();
        } else {
            jLongValue = 0;
        }
        c1027580cqa.LIZ(jLongValue);
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null && (creativeId = awemeRawAd4.getCreativeId()) != null) {
            jLongValue2 = creativeId.longValue();
        } else {
            jLongValue2 = 0;
        }
        c1027580cqa.LJI(jLongValue2);
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            logExtra = awemeRawAd5.getLogExtra();
        }
        c1027580cqa.LJIJJ(logExtra);
        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
        if (awemeRawAd6 != null && (groupId = awemeRawAd6.getGroupId()) != null) {
            jLongValue3 = groupId.longValue();
        }
        c1027580cqa.LJIILIIL(jLongValue3);
        c1027580cqa.LJIJ(0);
        c1027580cqa.LJIILJJIL(false);
        c1027580cqa.LJJJ(photoCarouselProductStruct.getAnchorTitle());
        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
        String str = "";
        if (awemeRawAd7 == null || (nativeSiteAdInfo = awemeRawAd7.getNativeSiteAdInfo()) == null) {
            nativeSiteAdInfo = "";
        }
        c1027580cqa.LJJ(nativeSiteAdInfo);
        String nativeSiteCustomData2 = photoCarouselProductStruct.getNativeSiteCustomData();
        if (nativeSiteCustomData2 != null) {
            str = nativeSiteCustomData2;
        }
        c1027580cqa.LJJIFFI(str);
        if (c1264004x4 != null && c1264004x4.disableWebUrlHandler) {
            c1027580cqa.LIZ.LIZIZ.LJJJJ = true;
        }
        return C1027410cqJ.LIZ(context, c1027580cqa.LIZ).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIIJZLJL(int i, int i2, Aweme aweme, String str, String str2) {
        AbstractC1010290cOh abstractC1010290cOh;
        String str3;
        if (Intrinsics.LJFF(str2, "left")) {
            abstractC1010290cOh = new AbstractC1010290cOh() { // from class: X.0cOi
                @Override // X.AbstractC1010290cOh
                public final boolean LIZ(int i3, int i4) {
                    return i3 >= 0 && i3 < i4 - 1;
                }
            };
        } else if (Intrinsics.LJFF(str2, "right")) {
            abstractC1010290cOh = new AbstractC1010290cOh() { // from class: X.0cOj
            };
        } else {
            abstractC1010290cOh = C1010320cOk.LIZLLL;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("slide_image", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "slide_index");
        if (C1009740cNo.LJIIL(aweme)) {
            str3 = "page_location";
        } else {
            str3 = "image_location";
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i + 1), str3);
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i, aweme) ? 1 : 0), "is_video");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(abstractC1010290cOh.LIZ, "action_type");
        c1022820ciuLIZLLL.LIZIZ(LJIJJ(i, aweme), "image_show_count");
        c1022820ciuLIZLLL.LIZ(LIZLLL(aweme));
        c1022820ciuLIZLLL.LJII();
        LJJJI(i, i2, str, abstractC1010290cOh, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJIJ(int i, int i2, int i3, Long l, AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("shop_anchor_second_line", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(l, "second_line_show_time");
        c1022820ciuLIZLLL.LJII();
    }

    public final void LJJJI(int i, int i2, String str, AbstractC1010290cOh abstractC1010290cOh, Aweme aweme) {
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        int iIntValue;
        List<Long> list;
        List<Long> list2;
        int i4;
        Integer numValueOf3;
        String str2;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Long lValueOf = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
            numValueOf = Integer.valueOf(photoCarouselInfo.getProductCount());
        } else {
            numValueOf = null;
        }
        C1010280cOg.LIZ.getClass();
        if (i >= 0 && i < (i3 = C1010280cOg.LJFF) && abstractC1010290cOh.LIZ(i, i3) && (numValueOf2 = Integer.valueOf(((i + i3) - abstractC1010290cOh.LIZIZ) % i3)) != null && (iIntValue = numValueOf2.intValue()) >= 0 && iIntValue < C1010280cOg.LJFF && (list = C1010280cOg.LJ) != null && (list2 = C1010280cOg.LIZLLL) != null) {
            if (((Number) ListProtector.get(list2, iIntValue)).longValue() != 0) {
                lValueOf = Long.valueOf((System.currentTimeMillis() - ((Number) ListProtector.get(list2, iIntValue)).longValue()) + ((Number) ListProtector.get(list, iIntValue)).longValue());
            }
            ListProtector.set(list, iIntValue, 0L);
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "stay_duration", C1017070cZd.LJJIJLIJ(aweme));
                c1022820ciuLIZLLL.LIZJ("single_image", "refer");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(jLongValue), "duration");
                int iLJI = C1009740cNo.LJI(aweme);
                if (iLJI != 0) {
                    i4 = i2 / iLJI;
                } else {
                    i4 = i2;
                }
                if (abstractC1010290cOh.LIZ(i, i4) && (numValueOf3 = Integer.valueOf(((i + i4) - abstractC1010290cOh.LIZIZ) % i4)) != null) {
                    int iIntValue2 = numValueOf3.intValue();
                    if (C1009740cNo.LJIIL(aweme)) {
                        str2 = "page_location";
                    } else {
                        str2 = "image_location";
                    }
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iIntValue2 + 1), str2);
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(iIntValue2, aweme) ? 1 : 0), "is_video");
                }
                c1022820ciuLIZLLL.LIZ(LIZLLL(aweme));
                c1022820ciuLIZLLL.LIZ(LJJIIJ(aweme));
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
                c1022820ciuLIZLLL.LIZIZ(numValueOf, "product_count");
                c1022820ciuLIZLLL.LIZIZ(str, "enter_method");
                c1022820ciuLIZLLL.LIZIZ(LJIJJ(i, aweme), "image_show_count");
                c1022820ciuLIZLLL.LJII();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJFF(int i, int i2, int i3, Aweme aweme, String str, String str2) {
        List<PhotoModeImageUrlModel> imageList;
        Object uri;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("carousel_label_product", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str2, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(str, "product_id");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        int i4 = i - 1;
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i4, aweme) ? 1 : 0), "is_video");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i4 >= 0 && i4 < imageList.size()) {
            UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i4)).displayImageNoWatermark;
            if (urlModel != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            c1022820ciuLIZLLL.LIZIZ(uri, "image_id");
        }
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIIIZ(int i, int i2, int i3, Aweme aweme, String str, String str2) {
        List<PhotoModeImageUrlModel> imageList;
        Object uri;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("carousel_label_product", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str2, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(str, "product_id");
        int i4 = i - 1;
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJJJ(i4, aweme) ? 1 : 0), "is_video");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && i4 >= 0 && i4 < imageList.size()) {
            UrlModel urlModel = ((PhotoModeImageUrlModel) ListProtector.get(imageList, i4)).displayImageNoWatermark;
            if (urlModel != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            c1022820ciuLIZLLL.LIZIZ(uri, "image_id");
        }
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJ(String str, int i, String str2, int i2, String str3, String str4, Integer num, Long l, AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("anchor", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "image_id");
        c1022820ciuLIZLLL.LIZIZ(1, "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str3, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        c1022820ciuLIZLLL.LIZIZ(str4, "anchor_tag");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "product_count");
        c1022820ciuLIZLLL.LIZIZ(num, "has_second_line");
        c1022820ciuLIZLLL.LIZIZ(l, "second_line_show_time");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJJ(int i, String str, int i2, String str2, int i3, String str3, String str4, Integer num, Long l, AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("anchor_product", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "image_id");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str3, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        c1022820ciuLIZLLL.LIZIZ(str4, "anchor_tag");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        c1022820ciuLIZLLL.LIZIZ(num, "has_second_line");
        c1022820ciuLIZLLL.LIZIZ(l, "second_line_show_time");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService
    public final void LJIILLIIL(int i, String str, int i2, String str2, int i3, String str3, boolean z, String str4, Integer num, Long l, AwemeRawAd awemeRawAd) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("anchor", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "image_id");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "image_location");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "image_cnt");
        c1022820ciuLIZLLL.LIZIZ(str3, "enter_method");
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i3), "product_count");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_video");
        c1022820ciuLIZLLL.LIZIZ(str4, "anchor_tag");
        c1022820ciuLIZLLL.LIZIZ(num, "has_second_line");
        c1022820ciuLIZLLL.LIZIZ(l, "second_line_show_time");
        c1022820ciuLIZLLL.LJII();
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AwS630S0100000_16(awemeRawAd, 9);
            C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }
}
