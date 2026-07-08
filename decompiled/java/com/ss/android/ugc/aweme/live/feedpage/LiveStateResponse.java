package com.ss.android.ugc.aweme.live.feedpage;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class LiveStateResponse extends BaseResponse implements C0X12 {
    public String LL;

    @C09CT("data")
    public MapUserIdRoomId mapUserIdRoomId;

    public static class MapUserIdRoomId {

        @C09CT("room_id")
        public Map<Long, Long> userRoomIdMap;

        public final Map<Long, Long> LIZ() {
            Map<Long, Long> map = this.userRoomIdMap;
            return map == null ? new HashMap(0) : map;
        }
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LL;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LL = str;
    }
}
