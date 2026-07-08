package com.ss.android.ugc.aweme.explore.api;

import X.C09CT;
import X.C1515820pY4;
import X.C15O7;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface ExploreFeedRetrofitService {
        @InterfaceC1501170pAR("/tiktok/feed/explore/v1")
        C15O7<ExploreAwemeList> queryExploreAwemeList(@InterfaceC1485405rg ExploreFeedRequestParams exploreFeedRequestParams);

        @InterfaceC2174608fY
        @InterfaceC1501170pAR("/tiktok/feed/explore/v1")
        C15O7<C1515820pY4<ExploreAwemeList>> queryExploreAwemeListByChunk(@InterfaceC1485405rg ExploreFeedRequestParams exploreFeedRequestParams);

        @InterfaceC1501170pAR("/tiktok/feed/explore/related/v1")
        C15O7<ExploreRelatedAwemeList> queryRelatedExploreAwemeList(@InterfaceC1485405rg ExploreFeedRequestRelatedParams exploreFeedRequestRelatedParams);
    }

    public static final class ExploreAwemeReqestParam {

        @C09CT("aweme_id")
        public final String aid;

        @C09CT("aweme_type")
        public final int awemeType;

        @C09CT("count")
        public final int count;

        public ExploreAwemeReqestParam(String str, int i, int i2) {
            this.aid = str;
            this.awemeType = i;
            this.count = i2;
        }
    }
}
