package tikcast.linkmic.common;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class LinkUserIdentity {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("link_mic_id")
    public String linkMicId = "";

    @C09CT("player")
    public Player player;
}
