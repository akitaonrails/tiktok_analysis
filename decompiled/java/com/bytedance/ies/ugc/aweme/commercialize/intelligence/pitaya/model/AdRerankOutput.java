package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class AdRerankOutput implements Serializable {

    @C09CT("function_name")
    public final String function_name;

    @C09CT("request_candidate_ads_item_id")
    public final String request_candidate_ads_item_id;

    @C09CT("result_json")
    public final List<ResultItem> result_json;

    @C09CT("should_request_candidate_ads")
    public final boolean should_request_candidate_ads;

    @C09CT("steps")
    public final List<StepItem> steps;

    public AdRerankOutput() {
        this("adjust_items", false, "", new ArrayList(), new ArrayList());
    }

    public final String getFunction_name() {
        return this.function_name;
    }

    public final String getRequest_candidate_ads_item_id() {
        return this.request_candidate_ads_item_id;
    }

    public final List<ResultItem> getResult_json() {
        return this.result_json;
    }

    public final boolean getShould_request_candidate_ads() {
        return this.should_request_candidate_ads;
    }

    public final List<StepItem> getSteps() {
        return this.steps;
    }

    public AdRerankOutput(String str, boolean z, String str2, List<ResultItem> list, List<StepItem> list2) {
        this.function_name = str;
        this.should_request_candidate_ads = z;
        this.request_candidate_ads_item_id = str2;
        this.result_json = list;
        this.steps = list2;
    }
}
