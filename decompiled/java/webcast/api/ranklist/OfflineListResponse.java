package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("lynx_rank_view")
        public LynxRankView lynxRankView;

        @C09CT("rank_view")
        public RankListV2Response.RankView rankView;

        @C09CT("tab_infos")
        public List<TabInfo> tabInfos = new ArrayList();
    }

    public static final class TabInfo {

        @C09CT("rank_type")
        public int rankType;

        @C09CT("title_text")
        public Text titleText;
    }
}
