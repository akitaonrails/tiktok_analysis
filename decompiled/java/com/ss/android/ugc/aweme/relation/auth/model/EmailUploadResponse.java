package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EmailUploadResponse extends BaseResponse {

    @C09CT("data")
    public final Data data;

    public EmailUploadResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailUploadResponse) && Intrinsics.LJFF(this.data, ((EmailUploadResponse) obj).data);
    }

    public final int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmailUploadResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EmailUploadResponse(Data data) {
        this.data = data;
    }

    public static final class Data {

        @C09CT("captcha")
        public final String captcha;

        @C09CT("desc_url")
        public final String desc_url;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("description")
        public final String errorDescription;

        public Data(String str, String str2, Integer num, String str3) {
            this.captcha = str;
            this.desc_url = str2;
            this.errorCode = num;
            this.errorDescription = str3;
        }
    }
}
