package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ClickAttributionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_report")
        public boolean isReport;

        @C09CT("referrer")
        public String referrer = "";
    }
}
