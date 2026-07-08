package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CT;
import X.C603650Nlz;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ClaimResponseInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface VouchersApi {
    public static final C603650Nlz LIZ = C603650Nlz.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/live/vouchers/claim")
    Object claimVouchers(@InterfaceC1485405rg ClaimVouchersRequest claimVouchersRequest, InterfaceC1364105Vn<? super BaseResponse<ClaimResponseInfo>> interfaceC1364105Vn);

    public static final class ClaimVouchersRequest {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("claim_scene")
        public final Integer claimScene;

        @C09CT("is_owner")
        public final Boolean isOwner;

        @C09CT("qcpx_cache_key")
        public final String qcpxCacheKey;

        @C09CT("room_id")
        public final Long roomId;

        @C09CT("source")
        public final Integer source;

        public ClaimVouchersRequest(String str, Long l, Boolean bool, Integer num, Integer num2, String str2) {
            this.qcpxCacheKey = str;
            this.roomId = l;
            this.isOwner = bool;
            this.source = num;
            this.claimScene = num2;
            this.authorId = str2;
        }
    }
}
