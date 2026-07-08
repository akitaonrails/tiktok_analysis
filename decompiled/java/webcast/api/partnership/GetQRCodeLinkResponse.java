package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetQRCodeLinkResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("qr_code_url")
        public String qrCodeUrl = "";

        @C09CT("qr_code_short_url")
        public String qrCodeShortUrl = "";
    }
}
