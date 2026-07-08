package tikcast.api.anchor;

import X.C09CT;
import webcast.data.AnchorLiveJourneyExpXFoldCardDetail;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorLiveJourneyExpXFoldCardUseResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("card_detail")
        public AnchorLiveJourneyExpXFoldCardDetail cardDetail;

        @C09CT("has_using_card")
        public boolean hasUsingCard;
    }
}
