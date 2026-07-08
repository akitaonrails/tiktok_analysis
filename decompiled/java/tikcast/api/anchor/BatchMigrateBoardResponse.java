package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BatchMigrateBoardResponse {

    @C09CT("data")
    public List<ResponseData> data = new ArrayList();

    public static final class ResponseData {

        @C09CT("board_id")
        public long boardId;

        @C09CT("board_status")
        public int boardStatus;
    }
}
