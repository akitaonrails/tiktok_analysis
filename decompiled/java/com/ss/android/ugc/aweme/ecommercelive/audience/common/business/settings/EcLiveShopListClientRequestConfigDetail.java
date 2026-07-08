package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcLiveShopListClientRequestConfigDetail {

    @C09CT("config")
    public final EcLiveShopListFullDataConfigBean config;

    @C09CT("enable")
    public final Boolean enable;

    public EcLiveShopListClientRequestConfigDetail() {
        this(Boolean.FALSE, null);
    }

    public EcLiveShopListClientRequestConfigDetail(Boolean bool, EcLiveShopListFullDataConfigBean ecLiveShopListFullDataConfigBean) {
        this.enable = bool;
        this.config = ecLiveShopListFullDataConfigBean;
    }
}
