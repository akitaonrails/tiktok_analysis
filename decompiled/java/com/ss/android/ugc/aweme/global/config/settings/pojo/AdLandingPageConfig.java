package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class AdLandingPageConfig {

    @C09CT("ad_landing_page_auto_jump_control_enabled")
    public Boolean adLandingPageAutoJumpControlEnabled;

    @C09CT("ad_landing_page_click_jump_control_enabled")
    public Boolean adLandingPageClickJumpControlEnabled;

    @C09CT("ad_landing_page_click_jump_interval")
    public Integer adLandingPageClickJumpInterval;

    @C09CT("ad_landing_page_click_jump_interval_tips")
    public String adLandingPageClickJumpIntervalTips;

    @C09CT("ad_landing_page_preload_cache_count")
    public Integer adLandingPagePreloadCacheCount;

    @C09CT("ad_landing_page_preload_enabled")
    public Boolean adLandingPagePreloadEnabled;

    @C09CT("ad_landing_page_report_limit_times")
    public Integer adLandingPageReportLimitTimes;

    @C09CT("ad_landing_page_report_packet_key")
    public String adLandingPageReportPacketKey;

    @C09CT("ad_landing_page_report_page_count")
    public Integer adLandingPageReportPageCount;

    @C09CT("ad_landing_page_report_url")
    public String adLandingPageReportUrl;

    @C09CT("ad_landing_page_report_wifi_only_enable")
    public Boolean adLandingPageReportWifiOnlyEnable;

    @C09CT("ad_lynx_page_preload_cache_count")
    public Integer adLynxPagePreloadCacheCount;

    @C09CT("ad_splash_page_preload_cache_count")
    public Integer adSplashPagePreloadCacheCount;

    @C09CT("analytics")
    public String analytics;

    @C09CT("enable_dynamic_navbar")
    public Boolean enableDynamicNavbar;

    @C09CT("ad_landing_page_resource_count_blacklist_regex")
    public List<String> parsePathRegex;

    @C09CT("premem_analytics")
    public String prememAnalytics;

    @C09CT("ad_landing_page_resource_count_blacklist_string")
    public List<String> resourceExcludeUrl;

    @C09CT("ad_landing_page_auto_jump_allow_list")
    public List<String> adLandingPageAutoJumpAllowList = new ArrayList();

    @C09CT("ad_landing_page_auto_jump_intercept_list")
    public List<String> adLandingPageAutoJumpInterceptList = new ArrayList();

    @C09CT("ad_landing_page_pause_list")
    public List<String> adLandingPagePauseList = new ArrayList();

    @C09CT("ad_landing_page_preload_common_channel")
    public List<String> adLandingPagePreloadCommonChannel = new ArrayList();

    @C09CT("ad_landing_page_preload_common_prefix")
    public List<String> adLandingPagePreloadCommonPrefix = new ArrayList();

    @C09CT("ad_card_preload_common_channel")
    public List<String> adCardPreloadCommonChannel = new ArrayList();

    @C09CT("ad_card_preload_common_prefix")
    public List<String> adCardPreloadCommonPrefix = new ArrayList();

    @C09CT("allow_jump_list")
    public List<String> allowJumpList = new ArrayList();

    @C09CT("allow_jump_control_enable")
    public Boolean allowJumpControlEnable = Boolean.FALSE;

    @C09CT("ad_landing_page_report_delay")
    public int adLandingPageReportDelay = 2000;

    @C09CT("enable_referer")
    public Boolean enableReferer = Boolean.TRUE;

    @C09CT("modify_xrw")
    public boolean modifyXrw = true;

    @C09CT("premem_cache_max_age_in_days")
    public int prememCacheMaxAgeInDays = 1;

    @C09CT("premem_cache_js_enable")
    public boolean prememCacheJsEnable = false;

    @C09CT("ad_hybrid_monitor_sample_rate")
    public int hybridMonitorSampleRate = 3;

    @C09CT("ad_hybrid_monitor_res_perf_enable")
    public boolean hybridMonitorResPerfEnable = false;

    public int getPrememCacheMaxAgeInDays() {
        return Math.max(0, this.prememCacheMaxAgeInDays);
    }

    public Boolean getAdLandingPageAutoJumpControlEnabled() throws C316660CbA {
        Boolean bool = this.adLandingPageAutoJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getAdLandingPageClickJumpControlEnabled() throws C316660CbA {
        Boolean bool = this.adLandingPageClickJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getAdLandingPageClickJumpInterval() throws C316660CbA {
        Integer num = this.adLandingPageClickJumpInterval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getAdLandingPageClickJumpIntervalTips() throws C316660CbA {
        String str = this.adLandingPageClickJumpIntervalTips;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getAdLandingPagePreloadCacheCount() throws C316660CbA {
        Integer num = this.adLandingPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getAdLandingPagePreloadEnabled() throws C316660CbA {
        Boolean bool = this.adLandingPagePreloadEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getAdLandingPageReportLimitTimes() throws C316660CbA {
        Integer num = this.adLandingPageReportLimitTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getAdLandingPageReportPacketKey() throws C316660CbA {
        String str = this.adLandingPageReportPacketKey;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getAdLandingPageReportPageCount() throws C316660CbA {
        Integer num = this.adLandingPageReportPageCount;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getAdLandingPageReportUrl() throws C316660CbA {
        String str = this.adLandingPageReportUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getAdLandingPageReportWifiOnlyEnable() throws C316660CbA {
        Boolean bool = this.adLandingPageReportWifiOnlyEnable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getAdLynxPagePreloadCacheCount() throws C316660CbA {
        Integer num = this.adLynxPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getAdSplashPagePreloadCacheCount() throws C316660CbA {
        Integer num = this.adSplashPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getAnalytics() throws C316660CbA {
        String str = this.analytics;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableDynamicNavbar() throws C316660CbA {
        Boolean bool = this.enableDynamicNavbar;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public List<String> getAdCardPreloadCommonChannel() {
        return this.adCardPreloadCommonChannel;
    }

    public List<String> getAdCardPreloadCommonPrefix() {
        return this.adCardPreloadCommonPrefix;
    }

    public List<String> getAdLandingPageAutoJumpAllowList() {
        return this.adLandingPageAutoJumpAllowList;
    }

    public List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.adLandingPageAutoJumpInterceptList;
    }

    public List<String> getAdLandingPagePauseList() {
        return this.adLandingPagePauseList;
    }

    public List<String> getAdLandingPagePreloadCommonChannel() {
        return this.adLandingPagePreloadCommonChannel;
    }

    public List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.adLandingPagePreloadCommonPrefix;
    }

    public int getAdLandingPageReportDelay() {
        return this.adLandingPageReportDelay;
    }

    public Boolean getAllowJumpControlEnable() {
        return this.allowJumpControlEnable;
    }

    public List<String> getAllowJumpList() {
        return this.allowJumpList;
    }

    public Boolean getEnableReferer() {
        return this.enableReferer;
    }

    public int getHybridMonitorSampleRate() {
        return this.hybridMonitorSampleRate;
    }

    public List<String> getParsePathRegex() {
        return this.parsePathRegex;
    }

    public String getPrememAnalytics() {
        return this.prememAnalytics;
    }

    public List<String> getResourceExcludeUrl() {
        return this.resourceExcludeUrl;
    }

    public boolean isHybridMonitorResPerfEnable() {
        return this.hybridMonitorResPerfEnable;
    }

    public boolean isModifyXrw() {
        return this.modifyXrw;
    }

    public boolean isPrememCacheJsEnable() {
        return this.prememCacheJsEnable;
    }
}
