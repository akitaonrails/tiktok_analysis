package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewTimeReportResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("max_preview_time_ms")
        public long maxPreviewTimeMs;

        @C09CT("remain_preview_time_ms")
        public long remainPreviewTimeMs;
    }
}
