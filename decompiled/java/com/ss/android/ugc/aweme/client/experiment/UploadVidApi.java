package com.ss.android.ugc.aweme.client.experiment;

import X.C040I;
import X.C09CT;
import X.C11NZ;
import X.InterfaceC1501240pAY;

/* JADX INFO: loaded from: classes29.dex */
public interface UploadVidApi {
    @InterfaceC1501240pAY("/tiktok/v1/upload/vid/")
    C11NZ<UploadVidResponse> LIZ(@C040I UploadVidRequest uploadVidRequest);

    public static final class UploadVidRequest {

        @C09CT("vids")
        public final String vids;

        public UploadVidRequest(String str) {
            this.vids = str;
        }
    }

    public static final class UploadVidResponse {

        @C09CT("status_code")
        public final int statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        @C09CT("vid")
        public final String vid;

        public UploadVidResponse() {
            this(null, 0, null);
        }

        public UploadVidResponse(String str, int i, String str2) {
            this.vid = str;
            this.statusCode = i;
            this.statusMsg = str2;
        }
    }
}
