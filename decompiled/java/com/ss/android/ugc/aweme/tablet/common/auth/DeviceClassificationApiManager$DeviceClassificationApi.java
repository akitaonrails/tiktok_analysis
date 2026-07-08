package com.ss.android.ugc.aweme.tablet.common.auth;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceClassificationApiManager$DeviceClassificationApi {
    @InterfaceC1501160pAQ("/tiktok/device/is_pad/v1")
    C11NZ<Object> fetchIsPad(@InterfaceC1501070pAH("device_model") String str);
}
