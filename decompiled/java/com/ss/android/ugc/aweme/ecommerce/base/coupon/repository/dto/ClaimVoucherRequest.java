package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimVoucherRequest {
    public final transient BCMStandardTrack LIZ;

    @C09CT("btm")
    public final String btm;

    @C09CT("claim_type")
    public final Integer claimType;

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("request_source")
    public final int requestSource;

    @C09CT("source")
    public final Integer trafficSource;

    @C09CT("transparent_fields")
    public final Map<String, String> transparentFields;

    @C09CT("voucher_type_id")
    public final String voucherTypeID;

    public ClaimVoucherRequest(String str, int i, Integer num, String str2, Integer num2, BCMStandardTrack bCMStandardTrack, Map<String, String> map, String str3) {
        this.voucherTypeID = str;
        this.requestSource = i;
        this.trafficSource = num;
        this.btm = str2;
        this.claimType = num2;
        this.LIZ = bCMStandardTrack;
        this.transparentFields = map;
        this.instanceKey = str3;
    }
}
