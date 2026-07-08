package com.ss.android.ugc.aweme.changeregion.sdk.data.network;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ExistingUserEntranceInfoAPIResponse {

    @C09CT("is_change_region_enabled")
    public final boolean enable;

    @C09CT("localized_country")
    public final String localizedCountry;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("status_event")
    public final String statusEvent;

    public ExistingUserEntranceInfoAPIResponse() {
        this("", false, "", "");
    }

    public ExistingUserEntranceInfoAPIResponse(String str, boolean z, String str2, String str3) {
        this.localizedCountry = str;
        this.enable = z;
        this.statusEvent = str2;
        this.redirectUrl = str3;
    }
}
