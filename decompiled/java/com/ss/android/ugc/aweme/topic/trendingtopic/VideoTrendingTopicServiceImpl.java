package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C04TD;
import X.C0C64;
import X.C11NZ;
import X.C159Q;
import X.C15J4;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicServiceImpl implements IVideoTrendingTopicService {
    public static IVideoTrendingTopicService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IVideoTrendingTopicService.class, false);
        if (objLIZ != null) {
            return (IVideoTrendingTopicService) objLIZ;
        }
        if (C04TD.N5 == null) {
            synchronized (IVideoTrendingTopicService.class) {
                if (C04TD.N5 == null) {
                    C04TD.N5 = new VideoTrendingTopicServiceImpl();
                }
            }
        }
        return C04TD.N5;
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final C11NZ<TrendingTopicSettingResponse> LIZ() {
        C159Q.LIZ.getClass();
        VideoTrendingTopicApi.LIZ.getClass();
        return C15J4.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_link_trending_topic_mode", true) == 2;
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_link_trending_topic_mode", true) == 1;
    }
}
