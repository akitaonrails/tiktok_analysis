package com.ss.android.ugc.tiktok.tns.userrelation.block.api;

import X.C11NZ;
import X.C344660DfE;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface BlockManager {
    public static final C344660DfE LIZ = C344660DfE.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/guardian/platform/unblock_request/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("blocked_account_id") String str);

    @InterfaceC1501240pAY("/tiktok/v1/guardian/platform/child/block/manage/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501100pAK("sec_user_id") String str, @InterfaceC1501100pAK("action") int i, @InterfaceC1501100pAK("blocked_account_id") String str2);

    @InterfaceC1501240pAY("/tiktok/v1/user/batch/block/")
    @InterfaceC1485505rh
    C11NZ<UserBatchBlockResponse> userBatchBlock(@InterfaceC1501100pAK("to_user_id_list") String str, @InterfaceC1501100pAK("block_type") int i, @InterfaceC1501100pAK("source") int i2, @InterfaceC2177008fw Object obj);
}
