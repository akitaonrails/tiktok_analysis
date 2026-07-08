package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetBusinessOverviewResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("business_overview")
        public SMBBusinessOverview businessOverview;
    }
}
