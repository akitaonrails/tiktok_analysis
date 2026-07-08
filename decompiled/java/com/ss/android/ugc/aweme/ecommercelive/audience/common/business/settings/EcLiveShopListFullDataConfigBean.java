package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class EcLiveShopListFullDataConfigBean implements Serializable {

    @C09CT("config_trans_to_request")
    public final String configTransToRequest;

    @C09CT("max_time_out")
    public final Long maxTimeOut;

    @C09CT("origin_request_body")
    public final String originRequestBody;

    public EcLiveShopListFullDataConfigBean() {
        this(null, null, null);
    }

    public EcLiveShopListFullDataConfigBean(String str, Long l, String str2) {
        this.originRequestBody = str;
        this.maxTimeOut = l;
        this.configTransToRequest = str2;
    }
}
