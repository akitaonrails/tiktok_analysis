package com.ss.android.ugc.aweme.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class MergedTemplateListResponseWrapper {

    @C09CT("data")
    public final MergedTemplateListResponse data;

    @C09CT("message")
    public final String message;

    @C09CT("code")
    public final int status;

    public MergedTemplateListResponseWrapper(int i, String str, MergedTemplateListResponse mergedTemplateListResponse) {
        this.status = i;
        this.message = str;
        this.data = mergedTemplateListResponse;
    }
}
