package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.api;

import X.C1851100yGq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LogTaskEventRequest;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LogTaskEventResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface LogTaskEventApi {
    public static final C1851100yGq LIZ = C1851100yGq.LIZ;

    @InterfaceC1501170pAR("/api/v1/oec/affiliate/creator_activity/log_task_event")
    Object reportFeedTaskCardUserAction(@InterfaceC1485405rg LogTaskEventRequest logTaskEventRequest, InterfaceC1364105Vn<? super LogTaskEventResponse> interfaceC1364105Vn);
}
