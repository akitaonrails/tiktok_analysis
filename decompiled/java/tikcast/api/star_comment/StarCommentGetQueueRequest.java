package tikcast.api.star_comment;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentGetQueueRequest {

    @C09CT("client_cur_msg_start_time_ms")
    public long clientCurMsgStartTimeMs;

    @C09CT("current_version")
    public int currentVersion;

    @C09CT("role")
    public int role;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("client_reserve")
    public String clientReserve = "";
}
