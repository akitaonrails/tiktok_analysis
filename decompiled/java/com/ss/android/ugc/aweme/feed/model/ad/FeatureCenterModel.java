package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class FeatureCenterModel implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("attribution_statistic_type")
    public final Long attributionStatisticType;

    @C09CT("boc_jump_rule_type_allow_list")
    public final List<String> bocJumpRuleTypeAllowList;

    @C09CT("click_cnt")
    public final Long clickCnt;

    @C09CT("connection_type")
    public final Integer connectionType;

    @C09CT("convert_cnt")
    public final Long convertCnt;

    @C09CT("ctr")
    public final Double ctr;

    @C09CT("cvr")
    public final Double cvr;

    @C09CT("device_overall_score_layer")
    public final Long deviceOverallScoreLayer;

    @C09CT("ecpm")
    public final Long ecpm;

    @C09CT("landing_page_iab_reuse_type")
    public final Integer enableIabReuse;

    @C09CT("enable_prefetch_html")
    public final Boolean enablePrefetchHtml;

    @C09CT("external_action")
    public final Long externalAction;

    @C09CT("landing_page_iframe_has_input")
    public final Integer firstPageHasInputIframe;

    @C09CT("iab_recording_js_event")
    public final Boolean iabRecordingJsEvent;

    @C09CT("iab_recording_js_settings")
    public final String iabRecordingJsSettings;

    @C09CT("iab_recording_notice")
    public final Boolean iabRecordingNotice;

    @C09CT("iab_recording_type")
    public final Integer iabRecordingType;

    @C09CT("iframe_features")
    public final List<String> iframeFeatures;

    @C09CT("is_arbitrage")
    public final Integer isArbitrage;

    @C09CT("landing_page_prewarm_type")
    public final Integer landingPagePrewarmType;

    @C09CT("landing_page_redirect_type")
    public final Integer landingPageRedirectType;

    @C09CT("landing_page_ssp_opt_type")
    public final Integer landingPageSSPOptType;

    @C09CT("pctr")
    public final Double pctr;

    @C09CT("pcvr")
    public final Double pcvr;

    @C09CT("pixel_code")
    public final String pixelCode;

    @C09CT("pixel_id")
    public final Long pixelId;

    @C09CT("prefetch_html_timing")
    public final Integer prefetchHtmlTiming;

    @C09CT("pricing_type")
    public final Long pricingType;

    @C09CT("recording_rules")
    public final Map<String, List<Rule>> recordingRules;

    @C09CT("ssp_network_resource")
    @C09CS(JsonToStringAdapter.class)
    public final String sspNetworkResource;

    @C09CT("vod_strategies")
    public final VodStrategies vodStrategies;

    public static final class Companion {
    }

    public FeatureCenterModel() {
        this(null, Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "FeatureCenterModel(pctr=" + this.pctr + ", ctr=" + this.ctr + ", cvr=" + this.cvr + ", pcvr=" + this.pcvr + ", ecpm=" + this.ecpm + ", externalAction=" + this.externalAction + ", pixelId=" + this.pixelId + ", pixelCode=" + this.pixelCode + ", connectionType=" + this.connectionType + ", isArbitrage=" + this.isArbitrage + ", pricingType=" + this.pricingType + ", clickCnt=" + this.clickCnt + ", convertCnt=" + this.convertCnt + ", attributionStatisticType=" + this.attributionStatisticType + ", deviceOverallScoreLayer=" + this.deviceOverallScoreLayer + ", prefetchHtmlTiming=" + this.prefetchHtmlTiming + ", enablePrefetchHtml=" + this.enablePrefetchHtml + ", landingPagePrewarmType=" + this.landingPagePrewarmType + ", landingPageRedirectType=" + this.landingPageRedirectType + ", enableIabReuse=" + this.enableIabReuse + ", landingPageSSPOptType=" + this.landingPageSSPOptType + ", vodStrategies=" + this.vodStrategies + ", sspNetworkResource=" + this.sspNetworkResource + ", firstPageHasInputIframe=" + this.firstPageHasInputIframe + ", iabRecordingType=" + this.iabRecordingType + ", recordingRules=" + this.recordingRules + ", iabRecordingJsEvent=" + this.iabRecordingJsEvent + ", bocJumpRuleTypeAllowList=" + this.bocJumpRuleTypeAllowList + ", iabRecordingJsSettings=" + this.iabRecordingJsSettings + ", iframeFeatures=" + this.iframeFeatures + ", iabRecordingNotice=" + this.iabRecordingNotice + ')';
    }

    public final Integer isArbitrage() {
        return this.isArbitrage;
    }

    public static final class Rule implements Serializable {

        @C09CT("name")
        public String name;

        @C09CT("regex")
        public String regex;

        @C09CT("type")
        public String type;

        public Rule() {
            this(null, null, null);
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setRegex(String str) {
            this.regex = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public Rule(String str, String str2, String str3) {
            this.name = str;
            this.type = str2;
            this.regex = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureCenterModel(Double d, Double d2, Double d3, Double d4, Long l, Long l2, Long l3, String str, Integer num, Integer num2, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num3, Boolean bool, Integer num4, Integer num5, Integer num6, Integer num7, VodStrategies vodStrategies, String str2, Integer num8, Integer num9, Map<String, ? extends List<Rule>> map, Boolean bool2, List<String> list, String str3, List<String> list2, Boolean bool3) {
        this.pctr = d;
        this.ctr = d2;
        this.cvr = d3;
        this.pcvr = d4;
        this.ecpm = l;
        this.externalAction = l2;
        this.pixelId = l3;
        this.pixelCode = str;
        this.connectionType = num;
        this.isArbitrage = num2;
        this.pricingType = l4;
        this.clickCnt = l5;
        this.convertCnt = l6;
        this.attributionStatisticType = l7;
        this.deviceOverallScoreLayer = l8;
        this.prefetchHtmlTiming = num3;
        this.enablePrefetchHtml = bool;
        this.landingPagePrewarmType = num4;
        this.landingPageRedirectType = num5;
        this.enableIabReuse = num6;
        this.landingPageSSPOptType = num7;
        this.vodStrategies = vodStrategies;
        this.sspNetworkResource = str2;
        this.firstPageHasInputIframe = num8;
        this.iabRecordingType = num9;
        this.recordingRules = map;
        this.iabRecordingJsEvent = bool2;
        this.bocJumpRuleTypeAllowList = list;
        this.iabRecordingJsSettings = str3;
        this.iframeFeatures = list2;
        this.iabRecordingNotice = bool3;
    }
}
