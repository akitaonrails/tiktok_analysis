package tikcast.api.persona;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class QueryGuardianAutographResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("autograph_url")
        public ImageModel autographUrl;

        @C09CT("creator_user")
        public User creatorUser;

        @C09CT("guardian_user")
        public User guardianUser;

        @C09CT("image_x_uploaded_token")
        public PrivilegeImageXUploadedToken imageXUploadedToken;

        @C09CT("tns_status")
        public int tnsStatus;
    }
}
