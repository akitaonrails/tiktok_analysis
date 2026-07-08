package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class PostRollAdRequestJson implements Serializable {

    @C09CT("last_async_req_time")
    public final Long last_async_req_time;

    @C09CT("post_roll_ad")
    public final PostRollAdData post_roll_ad;

    @C09CT("sati_param_for_pitaya")
    public final String sati_param_for_pitaya;

    public PostRollAdRequestJson() {
        this(null, null, null);
    }

    public final Long getLast_async_req_time() {
        return this.last_async_req_time;
    }

    public final PostRollAdData getPost_roll_ad() {
        return this.post_roll_ad;
    }

    public final String getSati_param_for_pitaya() {
        return this.sati_param_for_pitaya;
    }

    public PostRollAdRequestJson(Long l, String str, PostRollAdData postRollAdData) {
        this.last_async_req_time = l;
        this.sati_param_for_pitaya = str;
        this.post_roll_ad = postRollAdData;
    }
}
