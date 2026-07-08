package com.ss.android.ugc.aweme.influencer.ecommercelive.common.api;

import X.C612290Nzv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface LivePreviewECIconInfoApi {
    public static final C612290Nzv LIZ = C612290Nzv.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/ec_icon/info")
    Object getLivePreviewECIconInfo(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super BaseResponse<LivePreviewECIconInfoResponse>> interfaceC1364105Vn);
}
