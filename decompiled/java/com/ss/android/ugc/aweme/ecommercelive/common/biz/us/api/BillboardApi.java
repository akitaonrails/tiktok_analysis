package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api;

import X.C0X9S;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.GetBillboardResp;

/* JADX INFO: loaded from: classes10.dex */
public interface BillboardApi {
    @InterfaceC1501160pAQ("{api_path}")
    C0X9S<BaseResponse<GetBillboardResp>> getBillboards(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1501070pAH("author_id") long j, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("is_retry") boolean z, @InterfaceC1501070pAH("room_id") String str2);
}
