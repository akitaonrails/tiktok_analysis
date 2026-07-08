package webcast.api.partnership;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class OpenAuthCheckResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_auth")
        public boolean isAuth;

        @C09CT("open_id")
        public String openId = "";

        @C09CT("scopes")
        public List<String> scopes = new ArrayList();
    }
}
