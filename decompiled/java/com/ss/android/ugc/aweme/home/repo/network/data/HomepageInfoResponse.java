package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class HomepageInfoResponse {

    @C09CT("welcome_info")
    public final NewUserGuideInfoResponse newUserGuideInfo;

    @C09CT("service_info")
    public final ServiceInfoResponse serviceInfo;

    public HomepageInfoResponse() {
        this(null, null);
    }

    public HomepageInfoResponse(NewUserGuideInfoResponse newUserGuideInfoResponse, ServiceInfoResponse serviceInfoResponse) {
        this.newUserGuideInfo = newUserGuideInfoResponse;
        this.serviceInfo = serviceInfoResponse;
    }
}
