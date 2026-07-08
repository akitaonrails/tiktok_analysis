package com.ss.android.ugc.aweme.simkit.model;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class FeedCacheStrategyConfig {

    @C09CT("tier3_expire_time_mapping")
    public Map<Integer, Integer> tier3ExpireTimeMapping = new HashMap();

    @C09CT("timeliness_expire_time_mapping")
    public Map<Integer, Integer> timelinessExpireTimeMapping = new HashMap();

    @C09CT("activeness_expire_time_mapping")
    public Map<Integer, Integer> activenessExpireTimeMapping = new HashMap();

    @C09CT("createtime_expire_time_mapping")
    public Map<Integer, Integer> createtimeExpireTimeMapping = new HashMap();

    @C09CT("net_speed_label_expire_time_mapping")
    public Map<Integer, Integer> netSpeedLabelExpireTimeMapping = new HashMap();

    @C09CT("expire_time_mapping_coefficient")
    public Map<String, Integer> expireTimeMappingCoefficient = new HashMap();
}
