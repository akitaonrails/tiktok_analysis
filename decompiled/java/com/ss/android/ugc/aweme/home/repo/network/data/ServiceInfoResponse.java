package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ServiceInfoResponse {

    @C09CT("service_element_info_list")
    public final List<ServiceComponentResponse> components;

    @C09CT("title")
    public final String title;

    public ServiceInfoResponse() {
        this(null, null);
    }

    public ServiceInfoResponse(String str, List<ServiceComponentResponse> list) {
        this.title = str;
        this.components = list;
    }
}
