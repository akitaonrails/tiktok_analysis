package webcast.data.cohost_biz;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BizRechargeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("gameplay_content")
        public GamePlayContent gameplayContent;

        @C09CT("user_infos")
        public Map<Long, CohostUserInfo> userInfos = C2097608Jq.LJ();

        @C09CT("virtual_waiting_users")
        public List<VirtualWaitingUser> virtualWaitingUsers = new ArrayList();

        @C09CT("ab_infos")
        public Map<Long, CohostABInfo> abInfos = new LinkedHashMap();

        @C09CT("guest_infos")
        public Map<Long, GuestUserInfo> guestInfos = new LinkedHashMap();
    }
}
