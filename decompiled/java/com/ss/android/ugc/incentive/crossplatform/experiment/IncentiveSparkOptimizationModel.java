package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveSparkOptimizationModel {

    @C09CT("allow_schema_list")
    public final List<String> allowSchemaList;

    @C09CT("biz")
    public final String biz;

    @C09CT("deny_schema_list")
    public final List<String> denySchemaList;

    @C09CT("dynamic_schema_params")
    public final HashMap<String, String> dynamicSchemaParams;

    @C09CT("dynamic_url_params")
    public final HashMap<String, String> dynamicUrlParams;

    @C09CT("enable_base_info_jsb_opt")
    public final boolean enableBaseInfoJsbOpt;

    @C09CT("enable_gecko_preload")
    public final boolean enableGeckoPreload;

    @C09CT("enable_precreate_webview")
    public final boolean enablePreCreateWebView;

    @C09CT("enable_prerender_webview")
    public final boolean enablePreRenderWebView;

    @C09CT("fe_webview_gone_disable_auto_reload")
    public final boolean feWebViewGoneDisableAutoReload;

    @C09CT("precreate_delay_in_seconds")
    public final int preCreateDelayInSeconds;

    @C09CT("pre_create_touchpoint_ids")
    public final List<Integer> preCreateWebTouchPointIds;

    @C09CT("register_reuse_config_when_first_click")
    public final boolean registerReuseConfigWhenFirstClick;

    @C09CT("reuse_matcher_opt_config")
    public final ReuseMatcherOptConfig reuseMatcherOptConfig;

    public IncentiveSparkOptimizationModel() {
        this(false, false, false, false, null, null, null, null, 0, false, null, false, null, null, 16383, null);
    }

    public IncentiveSparkOptimizationModel(boolean z, boolean z2, boolean z3, boolean z4, String str, List<Integer> list, List<String> list2, List<String> list3, int i, boolean z5, ReuseMatcherOptConfig reuseMatcherOptConfig, boolean z6, HashMap<String, String> map, HashMap<String, String> map2) {
        this.enablePreCreateWebView = z;
        this.enablePreRenderWebView = z2;
        this.enableGeckoPreload = z3;
        this.enableBaseInfoJsbOpt = z4;
        this.biz = str;
        this.preCreateWebTouchPointIds = list;
        this.allowSchemaList = list2;
        this.denySchemaList = list3;
        this.preCreateDelayInSeconds = i;
        this.registerReuseConfigWhenFirstClick = z5;
        this.reuseMatcherOptConfig = reuseMatcherOptConfig;
        this.feWebViewGoneDisableAutoReload = z6;
        this.dynamicUrlParams = map;
        this.dynamicSchemaParams = map2;
    }

    public IncentiveSparkOptimizationModel(boolean z, boolean z2, boolean z3, boolean z4, String str, List list, List list2, List list3, int i, boolean z5, ReuseMatcherOptConfig reuseMatcherOptConfig, boolean z6, HashMap map, HashMap map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? "referral" : str, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) != 0 ? C13BV.INSTANCE : list2, (i2 & 128) != 0 ? C13BV.INSTANCE : list3, (i2 & 256) != 0 ? 4 : i, (i2 & 512) != 0 ? false : z5, (i2 & 1024) != 0 ? new ReuseMatcherOptConfig(false, null, 3, null) : reuseMatcherOptConfig, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? z6 : false, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new HashMap() : map, (i2 & 8192) != 0 ? new HashMap() : map2);
    }
}
