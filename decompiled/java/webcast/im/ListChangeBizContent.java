package webcast.im;

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
public final class ListChangeBizContent {

    @C09CT("gameplay_content")
    public GamePlayContent gameplayContent;

    @C09CT("user_infos")
    public Map<Long, CohostUserInfo> userInfos = C2097608Jq.LJ();

    @C09CT("waiting_users")
    public List<VirtualWaitingUser> waitingUsers = new ArrayList();

    @C09CT("ab_infos")
    public Map<Long, CohostABInfo> abInfos = new LinkedHashMap();

    @C09CT("guest_user_infos")
    public Map<Long, GuestUserInfo> guestUserInfos = new LinkedHashMap();
}
