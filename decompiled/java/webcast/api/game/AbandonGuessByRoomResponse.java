package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AbandonGuessByRoomResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("round_id_str")
        public List<String> roundIdStr = new ArrayList();
    }
}
