package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C0Z5K;
import X.C2097608Jq;
import X.C452501pT;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class DMLowEndDevicesConfig {
    public final C01GW LIZ;

    @C09CT("default_sample_rate")
    public final int defaultSampleRate;

    @C09CT("min_multi_relation_interval")
    public final int minMultiRelationUpdateInterval;

    @C09CT("min_pull_msg_interval")
    public final int minPullMsgInterval;

    @C09CT("min_pull_msg_success_interval")
    public final int minPullMsgSuccessInterval;

    @C09CT("min_relation_diff_interval")
    public final int minRelationDiffUpdateInterval;

    @C09CT("min_relation_full_interval")
    public final int minRelationFullUpdateInterval;

    @C09CT("min_request_maf_interval")
    public final int minRequestMafInterval;

    @C09CT("sample_rate_config")
    public final Map<String, Integer> sampleRateConfig;

    public DMLowEndDevicesConfig() {
        this(1, C2097608Jq.LJ(), 10000, 30000, 3600000, 172800, 86400, 172800000);
    }

    public DMLowEndDevicesConfig(int i, Map<String, Integer> map, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.defaultSampleRate = i;
        this.sampleRateConfig = map;
        this.minPullMsgInterval = i2;
        this.minPullMsgSuccessInterval = i3;
        this.minMultiRelationUpdateInterval = i4;
        this.minRelationFullUpdateInterval = i5;
        this.minRelationDiffUpdateInterval = i6;
        this.minRequestMafInterval = i7;
        this.LIZ = C452501pT.LIZIZ(new C0Z5K());
    }
}
