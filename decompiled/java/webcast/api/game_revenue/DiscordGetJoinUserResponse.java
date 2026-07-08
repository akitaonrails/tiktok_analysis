package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordGetJoinUserResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("offset")
        public int offset;

        @C09CT("records")
        public List<JoinRecordItem> records = new ArrayList();

        @C09CT("total")
        public int total;
    }
}
