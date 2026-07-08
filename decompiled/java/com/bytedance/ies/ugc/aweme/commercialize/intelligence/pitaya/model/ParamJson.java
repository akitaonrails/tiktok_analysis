package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ParamJson implements Serializable {

    @C09CT("extra_ad_request_json")
    public final ExtraAdRequestJson extra_ad_request_json;

    @C09CT("last_ad_end_show_time")
    public final Long last_ad_end_show_time;

    @C09CT("last_ad_show_time")
    public final Long last_ad_show_time;

    @C09CT("post_roll_ad_request_json")
    public final PostRollAdRequestJson post_roll_ad_request_json;

    @C09CT("recent_feed_list")
    public final List<BaseRankModel> recent_feed_list;

    @C09CT("sati_param_for_pitaya")
    public final String sati_param_for_pitaya;

    @C09CT("trigger_source")
    public final Integer trigger_source;

    public ParamJson() {
        this(null, null, null, null, null, null, new ArrayList());
    }

    public final ExtraAdRequestJson getExtra_ad_request_json() {
        return this.extra_ad_request_json;
    }

    public final Long getLast_ad_end_show_time() {
        return this.last_ad_end_show_time;
    }

    public final Long getLast_ad_show_time() {
        return this.last_ad_show_time;
    }

    public final PostRollAdRequestJson getPost_roll_ad_request_json() {
        return this.post_roll_ad_request_json;
    }

    public final List<BaseRankModel> getRecent_feed_list() {
        return this.recent_feed_list;
    }

    public final String getSati_param_for_pitaya() {
        return this.sati_param_for_pitaya;
    }

    public final Integer getTrigger_source() {
        return this.trigger_source;
    }

    public ParamJson(Integer num, Long l, Long l2, String str, ExtraAdRequestJson extraAdRequestJson, PostRollAdRequestJson postRollAdRequestJson, List<BaseRankModel> list) {
        this.trigger_source = num;
        this.last_ad_show_time = l;
        this.last_ad_end_show_time = l2;
        this.sati_param_for_pitaya = str;
        this.extra_ad_request_json = extraAdRequestJson;
        this.post_roll_ad_request_json = postRollAdRequestJson;
        this.recent_feed_list = list;
    }
}
