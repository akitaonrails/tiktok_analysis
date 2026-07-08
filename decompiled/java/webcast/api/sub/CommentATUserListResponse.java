package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentATUserListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("user_list")
        public List<User> userList = new ArrayList();
    }
}
