package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;

/* JADX INFO: loaded from: classes14.dex */
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion();
    public static final C01GW<ApiMonitorService> instance$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new ApiMonitorService$Companion$instance$2());

    public static final class Companion {
        public final ApiMonitorService getInstance() {
            return ApiMonitorService.instance$delegate.getValue();
        }
    }
}
