package webcast.api.cohost;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class WebcastLinkmicCancelReserveResponse {

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
    }
}
