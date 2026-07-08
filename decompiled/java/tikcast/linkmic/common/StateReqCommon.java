package tikcast.linkmic.common;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class StateReqCommon {

    @C09CT("app_id")
    public long appId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("live_id")
    public long liveId;

    @C09CT("myself")
    public Player myself;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
