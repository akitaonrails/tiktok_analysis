package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBFormInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBFormInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("enable_form_v2")
        public boolean enableFormV2;

        @C09CT("form_info")
        public SMBFormInfo formInfo;

        @C09CT("is_ba")
        public boolean isBa;

        @C09CT("is_ba_from_upsell")
        public boolean isBaFromUpsell;

        @C09CT("recommended_form_info")
        public SMBFormInfo recommendedFormInfo;

        @C09CT("opt_in_schema")
        public String optInSchema = "";

        @C09CT("add_form_schema")
        public String addFormSchema = "";
    }
}
