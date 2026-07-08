package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RefreshTaskRequest {

    @C09CT("data")
    public RequestData data;

    public static final class RequestData {

        @C09CT("type_list")
        public List<Integer> typeList = new ArrayList();

        @C09CT("room_id")
        public String roomId = "";
    }
}
