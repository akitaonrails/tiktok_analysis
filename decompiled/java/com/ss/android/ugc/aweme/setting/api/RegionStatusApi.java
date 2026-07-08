package com.ss.android.ugc.aweme.setting.api;

import X.C0CQI;
import X.C11NZ;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.setting.model.RegionStatus;

/* JADX INFO: loaded from: classes5.dex */
public interface RegionStatusApi {
    public static final C0CQI LIZ = C0CQI.LIZ;

    @InterfaceC1501160pAQ("/tiktok/region/change/status/get/v1")
    C11NZ<RegionStatus> getRegionStatus();
}
