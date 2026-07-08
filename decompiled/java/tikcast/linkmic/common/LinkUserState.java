package tikcast.linkmic.common;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class LinkUserState {

    @C09CT("audio_muted")
    public int audioMuted;

    @C09CT("avatar")
    public AvatarState avatar;

    @C09CT("linked_time_nano")
    public long linkedTimeNano;

    @C09CT("network_state")
    public int networkState;

    @C09CT("online_user_state")
    public int onlineUserState;

    @C09CT("pos")
    public MicPositionData pos;

    @C09CT("rtc_connection")
    public int rtcConnection;

    @C09CT("user")
    public Player user;

    @C09CT("video_muted")
    public int videoMuted;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("linker_session_id")
    public String linkerSessionId = "";
}
