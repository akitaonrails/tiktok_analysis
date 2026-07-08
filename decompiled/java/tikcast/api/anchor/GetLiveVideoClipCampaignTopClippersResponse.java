package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveVideoClipCampaignClipper;

/* JADX INFO: loaded from: classes4.dex */
public final class GetLiveVideoClipCampaignTopClippersResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("clipper_list")
        public List<LiveVideoClipCampaignClipper> clipperList = new ArrayList();
    }
}
