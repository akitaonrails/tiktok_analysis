package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickActionModel implements Serializable {

    @C09CT("auto_popup_action_model")
    public final AiPdpActionModel aiPdpActionModel;

    @C09CT("enable_prefetch")
    public final Boolean enablePrefetch;

    @C09CT("web_url")
    public final String pdpUrl;

    @C09CT("quick_action_type")
    public final Integer quickActionType;

    @C09CT("shopify_pid")
    public final String shopifyPid;

    public QuickActionModel() {
        this(0, null, Boolean.FALSE, null, null);
    }

    public final AiPdpActionModel getAiPdpActionModel() {
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

    public QuickActionModel(Integer num, String str, Boolean bool, String str2, AiPdpActionModel aiPdpActionModel) {
        this.quickActionType = num;
        this.shopifyPid = str;
        this.enablePrefetch = bool;
        this.pdpUrl = str2;
        this.aiPdpActionModel = aiPdpActionModel;
    }
}
