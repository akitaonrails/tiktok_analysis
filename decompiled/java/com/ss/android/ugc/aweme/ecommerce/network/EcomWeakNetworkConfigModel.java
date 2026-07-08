package com.ss.android.ugc.aweme.ecommerce.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class EcomWeakNetworkConfigModel {

    @C09CT("enable_detect")
    public final int enableDetect;

    @C09CT("intercept_apis")
    public final List<String> interceptApis;

    @C09CT("throughput_filter_list")
    public final List<Integer> throughputFilterList;

    @C09CT("throughput_sample_size")
    public final int throughputSampleSize;

    @C09CT("weak_network_levels")
    public final List<Integer> weakNetworkLevels;

    @C09CT("weak_throughput_threshold")
    public final int weakThroughputThreshold;

    public EcomWeakNetworkConfigModel(List<Integer> list, int i, List<Integer> list2, int i2, List<String> list3, int i3) {
        this.throughputFilterList = list;
        this.throughputSampleSize = i;
        this.weakNetworkLevels = list2;
        this.weakThroughputThreshold = i2;
        this.interceptApis = list3;
        this.enableDetect = i3;
    }
}
