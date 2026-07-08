package com.bytedance.vcloud.strategy.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class LiveStreamData {

    @C09CT("common")
    public StreamDataCommon common;

    @C09CT("data")
    public Map<String, LiveGear> gears;

    @C09CT("node_infos")
    public Map<String, List<DomainInfo>> nodeInfos;

    public static class Auto {

        @C09CT("default")
        public String defaultGear;

        @C09CT("enable")
        public int enable;

        @C09CT("enable_origin_resolution")
        public int enableOriginResolution;

        @C09CT("list")
        public List<String> list;

        @C09CT("strategy")
        public String strategy;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class DomainInfo {

        @C09CT("DomainParseType")
        public int domainParseType;

        @C09CT("IP")
        public String ip;

        @C09CT("ProtocolType")
        public int protocolType;
    }

    public static class PortInfo {

        @C09CT("main")
        public PortNum main;
    }

    public static class PortNum {

        @C09CT("h2q")
        public String portNum;
    }

    public static class RecommendResolution {

        @C09CT("main")
        public String mainGear;
    }

    public static class StreamDataCommon {

        @C09CT("app_id")
        public String appId;

        @C09CT("auto")
        public Auto autoInfo;

        @C09CT("common_sdk_params")
        public Map<String, String> commonSdkParams;

        @C09CT("http_ports")
        public PortInfo portInfo;

        @C09CT("query")
        public Map<String, String> query;

        @C09CT("recommend_resolution")
        public RecommendResolution recommendResolution;

        @C09CT("rule_ids")
        public String ruleIds;

        @C09CT("session_id")
        public String sessionId;

        @C09CT("vqscore_info")
        public String vqscoreInfo;
    }

    public boolean isValid() {
        Map<String, LiveGear> map;
        return (this.common == null || (map = this.gears) == null || map.isEmpty()) ? false : true;
    }
}
