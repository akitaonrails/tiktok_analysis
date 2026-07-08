package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ReserveResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ReserveExtra extra;

    public static final class ReserveExtra {

        @C09CT("log_pb")
        public LogPb logPb;

        public static final class LogPb {

            @C09CT("impr_id")
            public String imprId = "";
        }
    }

    public static final class ResponseData {

        @C09CT("created_timestamp")
        public long createdTimestamp;

        @C09CT("reservation_id")
        public long reservationId;
    }
}
