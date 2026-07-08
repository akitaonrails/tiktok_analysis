package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class IABRecordingInterceptJsLogModel {

    @C09CT("recording_js_log_intercept_enable")
    public final boolean recordingJsLogInterceptEnable;

    @C09CT("recording_js_log_intercept_rule_list")
    public final List<JsLogInterceptRule> recordingJsLogInterceptRuleList;

    public IABRecordingInterceptJsLogModel() {
        this(false, null);
    }

    public IABRecordingInterceptJsLogModel(boolean z, List<JsLogInterceptRule> list) {
        this.recordingJsLogInterceptEnable = z;
        this.recordingJsLogInterceptRuleList = list;
    }
}
