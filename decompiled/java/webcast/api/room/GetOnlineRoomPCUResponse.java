package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class GetOnlineRoomPCUResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anonymous_user_count")
        public long anonymousUserCount;

        @C09CT("total_user_count")
        public long totalUserCount;
    }
}
