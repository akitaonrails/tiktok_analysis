package com.ss.android.ugc.aweme.feed.api;

import X.C09S2;
import X.C0CQT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class BackUpApi {
    public static final IBackUpApi LIZ = (IBackUpApi) C09S2.LIZJ(IBackUpApi.class, C0CQT.LIZJ);

    public interface IBackUpApi {
        @InterfaceC1501160pAQ("aweme/v1/aweme/statistics/")
        ListenableFuture<AwemeStatisticsResponse> queryAwemeStatistics(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("type") int i);
    }
}
