package com.ss.android.ugc.aweme.search.pages.result.nimble.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class GetSearchSettingsResponse extends BaseResponse {

    @C09CT("layout_conf")
    public final SearchLayoutConfigStruct layoutConfigStruct;

    public GetSearchSettingsResponse() {
        this(null);
    }

    public GetSearchSettingsResponse(SearchLayoutConfigStruct searchLayoutConfigStruct) {
        this.layoutConfigStruct = searchLayoutConfigStruct;
    }
}
