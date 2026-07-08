package tikcast.api.anchor;

import X.C09CT;
import webcast.data.LiveJourneyInRoomBannerInfo;
import webcast.data.LiveJourneySeasonInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnchorLiveJourneyInRoomBannerInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("info")
        public LiveJourneyInRoomBannerInfo info;

        @C09CT("season_info")
        public LiveJourneySeasonInfo seasonInfo;
    }
}
