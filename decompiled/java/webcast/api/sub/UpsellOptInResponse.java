package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.IndustrySelection;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class UpsellOptInResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_previously_set_up")
        public boolean hasPreviouslySetUp;

        @C09CT("industry_selection")
        public IndustrySelection industrySelection;

        @C09CT("pass")
        public boolean pass;

        @C09CT("revoke_info")
        public UpsellRevokeInfo revokeInfo;
    }
}
