package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.C09CT;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class ListOrderComponentReq {

    @C09CT("component_type")
    public final int componentType;

    @C09CT("list_order_prompt")
    public final ListOrderPromptReq listOrderPrompt;

    @C09CT("list_order_req")
    public final LinkedHashMap<String, Object> listOrderReq;

    public ListOrderComponentReq(int i, LinkedHashMap<String, Object> linkedHashMap, ListOrderPromptReq listOrderPromptReq) {
        this.componentType = i;
        this.listOrderReq = linkedHashMap;
        this.listOrderPrompt = listOrderPromptReq;
    }
}
