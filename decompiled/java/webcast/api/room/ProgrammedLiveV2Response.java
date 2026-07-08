package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ProgrammedLiveV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("top_frame")
        public TopFrameV2 topFrame;

        @C09CT("unix_timestamp_ms")
        public long unixTimestampMs;
    }
}
