package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterQuickActionModel implements Serializable {

    @C09CT("auto_popup_action_model")
    public final CRouterAiPdpActionModel aiPdpActionModel;

    @C09CT("enable_prefetch")
    public final Boolean enablePrefetch;

    @C09CT("web_url")
    public final String pdpUrl;

    @C09CT("quick_action_type")
    public final Integer quickActionType;

    @C09CT("shopify_pid")
    public final String shopifyPid;

    public CRouterQuickActionModel() {
        this(0, null, Boolean.FALSE, null, null);
    }

    public final CRouterAiPdpActionModel getAiPdpActionModel() {
        return this.aiPdpActionModel;
    }

    public final Boolean getEnablePrefetch() {
        return this.enablePrefetch;
    }

    public final String getPdpUrl() {
        return this.pdpUrl;
    }

    public final Integer getQuickActionType() {
        return this.quickActionType;
    }

    public final String getShopifyPid() {
        return this.shopifyPid;
    }

    public CRouterQuickActionModel(Integer num, String str, Boolean bool, String str2, CRouterAiPdpActionModel cRouterAiPdpActionModel) {
        this.quickActionType = num;
        this.shopifyPid = str;
        this.enablePrefetch = bool;
        this.pdpUrl = str2;
        this.aiPdpActionModel = cRouterAiPdpActionModel;
    }
}
