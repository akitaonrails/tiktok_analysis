package com.ss.android.ugc.aweme.creatortools.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShowCaseRespModel {

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final ShowCaseModel data;

    @C09CT("message")
    public final String message;

    public ShowCaseRespModel(int i, String str, ShowCaseModel showCaseModel) {
        this.code = i;
        this.message = str;
        this.data = showCaseModel;
    }
}
