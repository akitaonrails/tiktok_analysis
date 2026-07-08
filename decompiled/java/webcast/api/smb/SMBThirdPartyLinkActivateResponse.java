package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBThirdPartyLinkActivateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("link_info")
        public ThirdPartyLinkInfo linkInfo;

        @C09CT("sku_id")
        public long skuId;

        @C09CT("success")
        public boolean success;
    }
}
