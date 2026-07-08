package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class SMBBookingInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("booking_schema")
        public String bookingSchema = "";

        @C09CT("is_authorized")
        public boolean isAuthorized;
    }
}
