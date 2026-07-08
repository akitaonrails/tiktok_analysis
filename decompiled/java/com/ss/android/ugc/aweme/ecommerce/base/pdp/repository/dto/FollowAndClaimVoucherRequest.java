package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class FollowAndClaimVoucherRequest {

    @C09CT("author_id")
    public final Integer authorId;

    @C09CT("claim_scene")
    public final Integer claimScene;

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("source")
    public final Integer source;

    @C09CT("user_task_id")
    public final String userTaskId;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public FollowAndClaimVoucherRequest() {
        this(null, null, null, null, null, null, null);
    }

    public FollowAndClaimVoucherRequest(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4) {
        this.voucherTypeId = str;
        this.userTaskId = str2;
        this.authorId = num;
        this.roomId = str3;
        this.source = num2;
        this.claimScene = num3;
        this.instanceKey = str4;
    }
}
