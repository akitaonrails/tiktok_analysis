package com.ss.android.ugc.aweme.toptab.repo;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveFeedApi {
    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    C11NZ<LiveAwemeData> fetchLiveAwemeList(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    ListenableFuture<LiveAwemeData> fetchLiveFeedList(@InterfaceC1501070pAH("req_from") String str);
}
