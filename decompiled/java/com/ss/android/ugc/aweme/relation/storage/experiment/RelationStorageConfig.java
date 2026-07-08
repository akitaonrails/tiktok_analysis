package com.ss.android.ugc.aweme.relation.storage.experiment;

import X.C09CT;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class RelationStorageConfig {

    @C09CT("enable")
    public final Integer enable;

    @C09CT("full_update_cycle")
    public final Long fullUpdateCycle;

    @C09CT("max_local_maf_display_count")
    public final Integer maxDisplayMaf;

    @C09CT("max_local_maf_storage_count")
    public final Integer maxLocalMaf;

    @C09CT("max_retry_count_for_paging")
    public final Integer maxRetryCount;

    @C09CT("max_validity_period_of_data")
    public final Long maxValidityPeriod;

    @C09CT("monitor_sampling")
    public final JSONObject monitorSampling;

    @C09CT("timeout")
    public final Integer timeout;

    public RelationStorageConfig(Integer num, Long l, Long l2, Integer num2, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        this.enable = num;
        this.fullUpdateCycle = l;
        this.maxValidityPeriod = l2;
        this.maxRetryCount = num2;
        this.monitorSampling = jSONObject;
        this.maxLocalMaf = num3;
        this.maxDisplayMaf = num4;
        this.timeout = num5;
    }
}
