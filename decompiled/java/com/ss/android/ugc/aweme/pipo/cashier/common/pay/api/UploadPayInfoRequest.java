package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2097608Jq;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class UploadPayInfoRequest {

    @C09CT("action_infos")
    public final Map<String, String> actionInfos;

    @C09CT("action_types")
    public final List<String> actionTypes;

    @C09CT("commute_type")
    public final Integer commuteType;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("merchant_id")
    public final String mid;

    @C09CT("merchant_user_id")
    public final String muid;

    @C09CT("pay_id")
    public final String payId;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    public UploadPayInfoRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public UploadPayInfoRequest(String str, List<String> list, Map<String, String> map, String str2, String str3, Integer num, Configuration configuration, String str4) {
        this.payId = str;
        this.actionTypes = list;
        this.actionInfos = map;
        this.muid = str2;
        this.mid = str3;
        this.commuteType = num;
        this.configuration = configuration;
        this.pipoErrorCodeParams = str4;
    }

    public UploadPayInfoRequest(String str, List list, Map map, String str2, String str3, Integer num, Configuration configuration, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Collections.singletonList("risk_review") : list, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? new Configuration(null, null, null, null, null, null, null, null, null, null, 1023, null) : configuration, (i & 128) == 0 ? str4 : null);
    }
}
