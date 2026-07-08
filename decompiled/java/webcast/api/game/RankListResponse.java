package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.game_rank.RankView;

/* JADX INFO: loaded from: classes.dex */
public final class RankListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("rank_view")
        public List<RankView> rankView = new ArrayList();
    }
}
