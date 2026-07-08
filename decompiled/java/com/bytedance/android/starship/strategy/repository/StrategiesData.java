package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1307160k7W;
import com.bytedance.android.starship.engine.graph.config.GlobalTraceConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class StrategiesData implements Serializable {

    @C09CT("containers")
    public final Map<String, GraphList> containers;

    @C09CT("extra")
    public Extra extra;

    @C09CT("trace_config")
    public final GlobalTraceConfig globalTraceConfig;

    @C09CT("nodes")
    public final Map<String, NodeConfig> nodes;

    @C09CT("server_version")
    public final String serverVersion;

    @C09CT("status_code")
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    @C09CT("strategies")
    public final Map<String, StrategyModel> strategies;

    @C09CT("timestamp")
    public final Long timestamp;
    public transient InterfaceC1307160k7W tracer;

    public final StrategiesData copy(Map<String, StrategyModel> map, Map<String, NodeConfig> map2, Map<String, GraphList> map3, Long l, String str, GlobalTraceConfig globalTraceConfig, Extra extra, int i, String str2) {
        return new StrategiesData(map, map2, map3, l, str, globalTraceConfig, extra, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategiesData)) {
            return false;
        }
        StrategiesData strategiesData = (StrategiesData) obj;
        return Intrinsics.LJFF(this.strategies, strategiesData.strategies) && Intrinsics.LJFF(this.nodes, strategiesData.nodes) && Intrinsics.LJFF(this.containers, strategiesData.containers) && Intrinsics.LJFF(this.timestamp, strategiesData.timestamp) && Intrinsics.LJFF(this.serverVersion, strategiesData.serverVersion) && Intrinsics.LJFF(this.globalTraceConfig, strategiesData.globalTraceConfig) && Intrinsics.LJFF(this.extra, strategiesData.extra) && this.status_code == strategiesData.status_code && Intrinsics.LJFF(this.status_msg, strategiesData.status_msg);
    }

    public int hashCode() {
        Map<String, StrategyModel> map = this.strategies;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, NodeConfig> map2 = this.nodes;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, GraphList> map3 = this.containers;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Long l = this.timestamp;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.serverVersion;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        GlobalTraceConfig globalTraceConfig = this.globalTraceConfig;
        int iHashCode6 = (iHashCode5 + (globalTraceConfig == null ? 0 : globalTraceConfig.hashCode())) * 31;
        Extra extra = this.extra;
        int iHashCode7 = (((iHashCode6 + (extra == null ? 0 : extra.hashCode())) * 31) + this.status_code) * 31;
        String str2 = this.status_msg;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategiesData(strategies=");
        sbLIZ.append(this.strategies);
        sbLIZ.append(", nodes=");
        Map<String, NodeConfig> map = this.nodes;
        sbLIZ.append(map != null ? map.keySet() : null);
        sbLIZ.append(", containers=");
        sbLIZ.append(this.containers);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setTracer(InterfaceC1307160k7W interfaceC1307160k7W) {
        this.tracer = interfaceC1307160k7W;
    }

    public StrategiesData(Map<String, StrategyModel> map, Map<String, NodeConfig> map2, Map<String, GraphList> map3, Long l, String str, GlobalTraceConfig globalTraceConfig, Extra extra, int i, String str2) {
        this.strategies = map;
        this.nodes = map2;
        this.containers = map3;
        this.timestamp = l;
        this.serverVersion = str;
        this.globalTraceConfig = globalTraceConfig;
        this.extra = extra;
        this.status_code = i;
        this.status_msg = str2;
    }
}
