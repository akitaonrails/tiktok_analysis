package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class HybridMonitorConfig {

    @C09CT("h5_static_resource_report_enabled")
    public Boolean h5StaticResourceReportEnabled;

    @C09CT("rn_timing_interval")
    public Integer rnTimingInterval;

    @C09CT("slardar_sdk_config")
    public String slardarSdkConfig;

    @C09CT("perf_monitor_regex_list")
    public List<String> perfMonitorRegexList = new ArrayList();

    @C09CT("h5_static_resource_report_allow_list")
    public List<String> h5StaticResourceReportAllowList = new ArrayList();

    @C09CT("jsb_host_allow_list")
    public List<String> jsbHostAllowList = new ArrayList();

    @C09CT("gecko_channel_monitor_allow_list")
    public List<String> geckoChannelMonitorAllowList = new ArrayList();

    public Boolean getH5StaticResourceReportEnabled() throws C316660CbA {
        Boolean bool = this.h5StaticResourceReportEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getRnTimingInterval() throws C316660CbA {
        Integer num = this.rnTimingInterval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getSlardarSdkConfig() throws C316660CbA {
        String str = this.slardarSdkConfig;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public List<String> getGeckoChannelMonitorAllowList() {
        return this.geckoChannelMonitorAllowList;
    }

    public List<String> getH5StaticResourceReportAllowList() {
        return this.h5StaticResourceReportAllowList;
    }

    public List<String> getJsbHostAllowList() {
        return this.jsbHostAllowList;
    }

    public List<String> getPerfMonitorRegexList() {
        return this.perfMonitorRegexList;
    }
}
