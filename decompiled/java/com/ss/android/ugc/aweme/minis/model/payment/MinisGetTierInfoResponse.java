package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisGetTierInfoResponse extends BaseResponse {

    @C09CT("tier_infos")
    public final HashMap<String, MinisTierInfo> tierInfos = new HashMap<>();

    static {
        new MinisGetTierInfoResponse();
    }
}
