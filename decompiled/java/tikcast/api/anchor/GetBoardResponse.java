package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;

/* JADX INFO: loaded from: classes.dex */
public final class GetBoardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("board")
        public Board board;
    }
}
