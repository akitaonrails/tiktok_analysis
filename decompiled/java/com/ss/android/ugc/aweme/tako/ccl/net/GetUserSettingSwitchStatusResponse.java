package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;

/* JADX INFO: loaded from: classes31.dex */
public final class GetUserSettingSwitchStatusResponse extends TakoBaseResponse {

    @C09CT("lang_style")
    public final TakoLanguageStyleSetting langStyle;

    @C09CT("switch_status")
    public final String switchStatus;

    @C09CT("update_result")
    public final TakoUpdateResult updateResult;

    public GetUserSettingSwitchStatusResponse() {
        super(null, 0, "");
    }
}
