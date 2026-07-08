package webcast.api.gift;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GalleryDuelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("duel_status")
        public int duelStatus;

        @C09CT("opponent_info")
        public GalleryAnchorInfo opponentInfo;

        @C09CT("opt_out_all_time")
        public boolean optOutAllTime;

        @C09CT("self_info")
        public GalleryAnchorInfo selfInfo;

        @C09CT("sponsor_list")
        public List<GalleryDuelSponsor> sponsorList = new ArrayList();
    }
}
