package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BrowserConfig implements Serializable {

    @C09CT("act_internal_time")
    public final Long actInternalTime;

    @C09CT("click_id")
    public final String clickId;

    @C09CT("enable_replace_web_url")
    public final Integer enableReplaceWebUrl;

    @C09CT("target_url_prefix")
    public final String targetUrlPrefix;

    @C09CT("use_android_custom_tab")
    public final Integer useAndroidCustomTab;

    public BrowserConfig() {
        this(0, 0, null, null, 0L);
    }

    public BrowserConfig(Integer num, Integer num2, String str, String str2, Long l) {
        this.useAndroidCustomTab = num;
        this.enableReplaceWebUrl = num2;
        this.targetUrlPrefix = str;
        this.clickId = str2;
        this.actInternalTime = l;
    }
}
