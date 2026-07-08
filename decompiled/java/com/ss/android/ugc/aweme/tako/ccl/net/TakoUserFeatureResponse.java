package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoUserFeatureResponse {

    @C09CT("extra")
    public Extra extra;

    @C09CT("full_nimble_conf")
    public String fullNimbleConf;

    @C09CT("lang_style")
    public TakoLanguageStyleSetting langStyleSetting;

    @C09CT("nimble_conf")
    public String nimbleConf;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("switch_status")
    public String switchStatus;

    public TakoUserFeatureResponse() {
        this(null, 0, "", "", "", null);
    }

    public TakoUserFeatureResponse(Extra extra, int i, String str, String str2, String str3, TakoLanguageStyleSetting takoLanguageStyleSetting) {
        this.extra = extra;
        this.statusCode = i;
        this.switchStatus = str;
        this.nimbleConf = str2;
        this.fullNimbleConf = str3;
        this.langStyleSetting = takoLanguageStyleSetting;
    }
}
