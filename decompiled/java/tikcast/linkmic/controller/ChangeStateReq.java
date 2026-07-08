package tikcast.linkmic.controller;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.StateReqCommon;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeStateReq {

    @C09CT("audio_muted")
    public int audioMuted;

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("client_time")
    public long clientTime;

    @C09CT("common")
    public StateReqCommon common;

    @C09CT("layout_state")
    public LayoutState layoutState;

    @C09CT("network_state")
    public int networkState;

    @C09CT("online_user_state")
    public int onlineUserState;

    @C09CT("state_type")
    public int stateType;

    @C09CT("video_muted")
    public int videoMuted;

    @C09CT("background_sticker_id")
    public String backgroundStickerId = "";

    @C09CT("audio_muted_remote_channels")
    public List<Long> audioMutedRemoteChannels = new ArrayList();
}
