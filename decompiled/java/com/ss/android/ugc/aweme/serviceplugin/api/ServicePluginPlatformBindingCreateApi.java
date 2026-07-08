package com.ss.android.ugc.aweme.serviceplugin.api;

import X.AbstractC19484711Kz;
import X.C040I;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginBindingCreateResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface ServicePluginPlatformBindingCreateApi {
    @InterfaceC1501240pAY("/tiktok/service/plugin/binding/create/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    AbstractC19484711Kz<ServicePluginBindingCreateResponse> create(@C040I ServicePluginPlatformBindingCreateApiRequest servicePluginPlatformBindingCreateApiRequest);
}
