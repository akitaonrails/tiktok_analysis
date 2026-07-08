package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CT;
import X.C594200NSg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ClaimInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface VoucherApi {
    public static final C594200NSg LIZ = C594200NSg.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/live/voucher/claim")
    Object claimVoucher(@InterfaceC1485405rg ClaimVoucherRequest claimVoucherRequest, InterfaceC1364105Vn<? super BaseResponse<ClaimInfo>> interfaceC1364105Vn);

    public static final class ClaimVoucherRequest {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("claim_scene")
        public final int claimScene;

        @C09CT("is_owner")
        public final boolean isOwner;

        @C09CT("reload_product")
        public final int reloadProduct;

        @C09CT("room_id")
        public final long roomId;

        @C09CT("source")
        public final int source;

        @C09CT("user_task_id")
        public final String userTaskId;

        @C09CT("voucher_type_id")
        public final String voucherTypeId;

        public ClaimVoucherRequest(String str, long j, int i, boolean z, int i2, int i3, String str2, String str3) {
            this.voucherTypeId = str;
            this.roomId = j;
            this.reloadProduct = i;
            this.isOwner = z;
            this.source = i2;
            this.claimScene = i3;
            this.userTaskId = str2;
            this.authorId = str3;
        }
    }
}
