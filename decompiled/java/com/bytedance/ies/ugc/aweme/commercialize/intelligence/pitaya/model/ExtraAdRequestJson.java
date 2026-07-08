package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ExtraAdRequestJson implements Serializable {

    @C09CT("drop_extra_ad_cnt")
    public final Integer drop_extra_ad_cnt;

    @C09CT("extra_ad_list")
    public final List<CandidateAdData> extra_ad_list;

    @C09CT("last_async_req_time")
    public final Long last_async_req_time;

    @C09CT("last_req_time")
    public final Long last_req_time;

    @C09CT("last_state_list")
    public final List<ExtraLastState> last_state_list;

    @C09CT("sati_param_for_pitaya")
    public final String sati_param_for_pitaya;

    public ExtraAdRequestJson() {
        this(null, null, null, null, new ArrayList(), new ArrayList());
    }

    public final Integer getDrop_extra_ad_cnt() {
        return this.drop_extra_ad_cnt;
    }

    public final List<CandidateAdData> getExtra_ad_list() {
        return this.extra_ad_list;
    }

    public final Long getLast_async_req_time() {
        return this.last_async_req_time;
    }

    public final Long getLast_req_time() {
        return this.last_req_time;
    }

    public final List<ExtraLastState> getLast_state_list() {
        return this.last_state_list;
    }

    public final String getSati_param_for_pitaya() {
        return this.sati_param_for_pitaya;
    }

    public ExtraAdRequestJson(Long l, Long l2, String str, Integer num, List<CandidateAdData> list, List<ExtraLastState> list2) {
        this.last_req_time = l;
        this.last_async_req_time = l2;
        this.sati_param_for_pitaya = str;
        this.drop_extra_ad_cnt = num;
        this.extra_ad_list = list;
        this.last_state_list = list2;
    }
}
