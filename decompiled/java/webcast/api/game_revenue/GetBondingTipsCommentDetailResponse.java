package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class GetBondingTipsCommentDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("comment_list")
        public List<BondingTipsCommentData> commentList = new ArrayList();
    }
}
