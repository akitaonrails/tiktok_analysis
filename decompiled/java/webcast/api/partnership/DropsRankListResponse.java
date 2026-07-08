package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRankItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DropsRankListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("rank_list")
        public List<PartnershipDropsRankItem> rankList;
    }
}
