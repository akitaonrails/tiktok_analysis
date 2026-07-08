package webcast.data.multilive_biz;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BizInviteResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("friend_invitee_uids")
        public List<Long> friendInviteeUids = new ArrayList();

        @C09CT("host_perception_info")
        public PerceptionMessage hostPerceptionInfo;
    }
}
