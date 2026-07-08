package com.ss.android.ugc.aweme.component.searchcomponent.appadscard;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdAppAdsCardModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("app_info")
    public final AppInfoModel appInfo;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("jump_data")
    public final CRouterCoreModel jump_data;

    public final AppInfoModel getAppInfo() {
        return this.appInfo;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final CRouterCoreModel getJump_data() {
        return this.jump_data;
    }

    public SearchAdAppAdsCardModel(CRouterCoreModel cRouterCoreModel, AppInfoModel appInfoModel, String str) {
        this.jump_data = cRouterCoreModel;
        this.appInfo = appInfoModel;
        this.buttonText = str;
    }
}
