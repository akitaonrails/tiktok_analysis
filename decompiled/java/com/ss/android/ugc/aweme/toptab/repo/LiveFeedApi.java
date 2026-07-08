package com.ss.android.ugc.aweme.toptab.repo;

import X.C11NZ;
import X.C2222691Bz1;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedApi implements ILiveFeedApi {
    public static final LiveFeedApi LIZIZ = new LiveFeedApi();
    public final /* synthetic */ ILiveFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.toptab.repo.ILiveFeedApi
    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    public C11NZ<LiveAwemeData> fetchLiveAwemeList(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501130pAN Map<String, String> map) {
        return this.LIZ.fetchLiveAwemeList(str, map);
    }

    @Override // com.ss.android.ugc.aweme.toptab.repo.ILiveFeedApi
    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<LiveAwemeData> fetchLiveFeedList(@InterfaceC1501070pAH("req_from") String str) {
        return this.LIZ.fetchLiveFeedList(str);
    }

    public LiveFeedApi() {
        this.LIZ = (ILiveFeedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C2222691Bz1.LJIIIIZZ() ? "https://webcast.tiktokv.com" : "https://webcast-va.tiktokv.com").create(ILiveFeedApi.class);
    }
}
