package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ServerPerfStruct {

    @C09CT("common_info")
    public final Map<String, Long> commonInfoMap;

    @C09CT("latency_timestamp_data")
    public final Map<String, Long> latencyTsData;

    @C09CT("module_info")
    public final Map<String, Long> moduleInfoMap;

    @C09CT("performance_info_server")
    public final String performanceInfoServer;

    @C09CT("server_inner_cost")
    public final List<Object> serverInnerCost;

    @C09CT("server_search_perf_detail")
    public final String serverPerfDetail;

    @C09CT("server_search_receive_timestamp")
    public final String serverReceiveTs;

    @C09CT("server_search_response_timestamp")
    public final String serverResponseTs;

    public ServerPerfStruct() {
        this(null, null, null, null, null, null, null, null);
    }

    public ServerPerfStruct(List<Object> list, String str, String str2, String str3, String str4, Map<String, Long> map, Map<String, Long> map2, Map<String, Long> map3) {
        this.serverInnerCost = list;
        this.serverReceiveTs = str;
        this.serverResponseTs = str2;
        this.serverPerfDetail = str3;
        this.performanceInfoServer = str4;
        this.latencyTsData = map;
        this.commonInfoMap = map2;
        this.moduleInfoMap = map3;
    }
}
