package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetBoardListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("board_list")
        public List<Board> boardList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("max_limit_count")
        public int maxLimitCount;

        @C09CT("next_offset")
        public int nextOffset;

        @C09CT("total_count")
        public int totalCount;
    }
}
