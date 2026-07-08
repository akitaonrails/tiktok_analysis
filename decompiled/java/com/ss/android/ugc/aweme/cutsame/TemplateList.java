package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateList extends BaseResponse {

    @C09CT("resp_json")
    public final String respJson;

    @C09CT("template_list")
    public List<CutsameDataItem> templateList;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;
}
