package tikcast.api.anchor;

import X.C09CT;
import webcast.data.AnchorLiveJourneyExpXFoldCardDetail;
import webcast.data.LiveJourneyInfo;
import webcast.data.LiveJourneySeasonInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnchorLiveJourneyOverviewResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("guide_type")
        public int guideType;

        @C09CT("info")
        public LiveJourneyInfo info;

        @C09CT("season_info")
        public LiveJourneySeasonInfo seasonInfo;

        @C09CT("using_exp_xfold_card_detail")
        public AnchorLiveJourneyExpXFoldCardDetail usingExpXfoldCardDetail;
    }
}
