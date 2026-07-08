package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBServiceOptFormResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("service_id")
        public long serviceId;

        @C09CT("service_id_str")
        public String serviceIdStr = "";
    }
}
