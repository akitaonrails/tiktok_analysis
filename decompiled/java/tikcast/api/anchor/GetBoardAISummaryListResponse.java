package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetBoardAISummaryListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("board_list")
        public List<Board> boardList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("total")
        public long total;

        @C09CT("type")
        public int type;
    }
}
