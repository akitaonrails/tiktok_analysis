package webcast.api.smb;

import X.C09CT;
import webcast.data.SMBFormDetail;

/* JADX INFO: loaded from: classes27.dex */
public final class SMBFormDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("form")
        public SMBFormDetail form;
    }
}
