package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.EnumC1477205qM;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchStrangerUnlimitRequestBody {

    @C09CT("enable_filtered_request")
    public final Boolean enableFilteredRequest;

    @C09CT("set_category")
    public final Integer setCategory;

    @C09CT("trigger")
    public final int trigger;

    @C09CT("unlimit_requests")
    public final List<StrangerUnlimitRequest> unlimitRequest;

    public BatchStrangerUnlimitRequestBody() {
        this(null, null, EnumC1477205qM.DEFAULT.getValue(), null);
    }

    public BatchStrangerUnlimitRequestBody(List<StrangerUnlimitRequest> list, Integer num, int i, Boolean bool) {
        this.unlimitRequest = list;
        this.setCategory = num;
        this.trigger = i;
        this.enableFilteredRequest = bool;
    }
}
