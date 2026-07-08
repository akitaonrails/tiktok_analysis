package com.ss.android.ugc.aweme.changeregion.sdk.data.network;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class NewUserEntranceInfoAPIResponse {

    @C09CT("data")
    public final NewUserEntranceMetaData data;

    @C09CT("message")
    public final String message;

    public NewUserEntranceInfoAPIResponse() {
        this(null, null);
    }

    public NewUserEntranceInfoAPIResponse(NewUserEntranceMetaData newUserEntranceMetaData, String str) {
        this.data = newUserEntranceMetaData;
        this.message = str;
    }
}
