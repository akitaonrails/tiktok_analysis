package com.ss.android.ugc.aweme.featureeffectvideo.repo;

import X.C11NZ;
import X.C615410OBv;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;

/* JADX INFO: loaded from: classes10.dex */
public interface FeatureVideoApi {
    public static final C615410OBv LIZ = C615410OBv.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/sticker/featured_video/candidates/")
    C11NZ<StickerPropAwemeList> LIZ(@InterfaceC1501120pAM("effect_id") String str);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/sticker/featured_video/unbind/")
    C11NZ<BaseResponse> deleteFeatureVideo(@InterfaceC1501050pAF("effect_id") String str);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/sticker/featured_video/bind/")
    C11NZ<BaseResponse> saveFeatureVideo(@InterfaceC1501050pAF("effect_id") String str, @InterfaceC1501050pAF("aweme_id") String str2);
}
