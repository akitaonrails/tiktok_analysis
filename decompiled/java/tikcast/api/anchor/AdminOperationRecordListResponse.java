package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AdminOperationRecordListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("room_records")
        public List<RoomRecord> roomRecords = new ArrayList();

        public static final class RoomRecord {

            @C09CT("records")
            public List<AdminOperationRecordItem> records = new ArrayList();

            @C09CT("room_id")
            public long roomId;

            @C09CT("start_time")
            public long startTime;
        }
    }
}
