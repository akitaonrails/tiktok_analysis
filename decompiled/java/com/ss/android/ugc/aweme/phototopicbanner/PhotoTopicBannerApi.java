package com.ss.android.ugc.aweme.phototopicbanner;

import X.C0X9Q;
import X.C1260590iuP;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerResponse;
import com.ss.android.ugc.aweme.model.PhotoTopicBannersResponse;
import com.ss.android.ugc.aweme.model.UpdatePhotoTopicBannerRequest;

/* JADX INFO: loaded from: classes20.dex */
public interface PhotoTopicBannerApi {
    public static final C1260590iuP LIZ = C1260590iuP.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/photo/banner")
    Object getPhotoTopicBanner(InterfaceC1364105Vn<? super PhotoTopicBannerResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/photo/banners")
    Object getPhotoTopicBanners(InterfaceC1364105Vn<? super PhotoTopicBannersResponse> interfaceC1364105Vn);

    @C0X9Q("/tiktok/v1/photo/banner/interaction")
    Object updatePhotoTopicBanner(@InterfaceC1485405rg UpdatePhotoTopicBannerRequest updatePhotoTopicBannerRequest, InterfaceC1364105Vn<? super PhotoTopicBannerResponse> interfaceC1364105Vn);
}
