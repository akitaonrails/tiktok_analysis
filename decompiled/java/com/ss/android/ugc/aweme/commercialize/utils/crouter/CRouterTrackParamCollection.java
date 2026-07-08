package com.ss.android.ugc.aweme.commercialize.utils.crouter;

import X.C04TD;
import X.C1009740cNo;
import X.C1010120cOQ;
import X.C1017070cZd;
import X.C1017160cZm;
import X.C1019030ccn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterTrackParamCollection implements ICRouterTrackParamCollection {
    public static ICRouterTrackParamCollection LJ() {
        Object objLIZ = C04TD.LIZ(ICRouterTrackParamCollection.class, false);
        if (objLIZ != null) {
            return (ICRouterTrackParamCollection) objLIZ;
        }
        if (C04TD.LLLL == null) {
            synchronized (ICRouterTrackParamCollection.class) {
                if (C04TD.LLLL == null) {
                    C04TD.LLLL = new CRouterTrackParamCollection();
                }
            }
        }
        return C04TD.LLLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection
    public final boolean isChattingMessageUri(String str) {
        return OpenChatExt.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection
    public final void LIZLLL(Aweme aweme, Map<String, Object> map) {
        C1019030ccn.LJJJJL(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection
    public final void LIZJ(Aweme aweme, Map<String, Object> map, long j) {
        String creativeIdStr;
        if (aweme != null && aweme.isAd() && !C1017070cZd.LLIZLLLIL(aweme) && !C1010120cOQ.LJIJI(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getRollType() == 1) {
                return;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                creativeIdStr = awemeRawAd2.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            C1019030ccn.LJJJJLI(j, creativeIdStr, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection
    public final void LIZ(Aweme aweme, Map<String, Object> map, long j, String str) {
        String str2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
        if (C1017070cZd.LLIIL(aweme)) {
            if (TextUtils.equals(str, "button") || TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo") || TextUtils.equals(str, "slide")) {
                int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
                if (C1009740cNo.LJIIL(aweme)) {
                    str2 = "page_location";
                } else {
                    str2 = "image_location";
                }
                map.put(str2, Integer.valueOf(iLJJIJIIJIL + 1));
                map.putAll(iAdPhotoModeService.LIZLLL(aweme));
                if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    map.put("image_cnt", Integer.valueOf(imageList.size()));
                }
                map.put("image_show_count", iAdPhotoModeService.LJIJJ(iLJJIJIIJIL, aweme));
                map.put("enter_method", iAdPhotoModeService.getEnterMethod());
                map.put("first_slide_duration", Long.valueOf(j - iAdPhotoModeService.LJJII()));
                if ((Intrinsics.LJFF(str, "button") && C1017070cZd.LJLLLL(aweme)) || C1017070cZd.LJI(aweme)) {
                    map.putAll(iAdPhotoModeService.LJJIIJ(aweme));
                }
                String productId = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).getProductId();
                if (productId != null) {
                    if (TextUtils.equals(str, "button") || TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo")) {
                        map.put("product_id", productId);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterTrackParamCollection
    public final void LIZIZ(Aweme aweme, Map<String, Object> map, String str, String str2, boolean z) {
        C1017160cZm.LIZ(aweme, map, str, z);
    }
}
