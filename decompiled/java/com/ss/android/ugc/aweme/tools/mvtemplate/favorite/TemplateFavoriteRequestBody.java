package com.ss.android.ugc.aweme.tools.mvtemplate.favorite;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateFavoriteRequestBody {

    @C09CT("asset_resource_id")
    public final String asset_resource_id;

    @C09CT("resource_id")
    public final Long resource_id;

    public TemplateFavoriteRequestBody() {
        this(null, null);
    }

    public TemplateFavoriteRequestBody(String str, Long l) {
        this.asset_resource_id = str;
        this.resource_id = l;
    }
}
