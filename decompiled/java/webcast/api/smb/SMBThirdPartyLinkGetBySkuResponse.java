package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBThirdPartyLinkGetBySkuResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("found")
        public boolean found;

        @C09CT("link_info")
        public ThirdPartyLinkInfo linkInfo;
    }
}
