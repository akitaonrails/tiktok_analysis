package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class CheckRoomIdResponse {

    @C09CT("data")
    public List<ResponseData> data = new ArrayList();

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class FilterInfoData {

        @C09CT("is_filtered")
        public boolean isFiltered;

        @C09CT("reason")
        public String reason = "";
    }

    public static final class ResponseData {

        @C09CT("filter_info")
        public FilterInfoData filterInfo;

        @C09CT("room_id")
        public long roomId;

        @C09CT("room_id_str")
        public String roomIdStr = "";
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
