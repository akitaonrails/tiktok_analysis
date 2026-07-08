package webcast.api.battle;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BattleLeaveLinkmicRequest {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("leave_anchor_id")
    public long leaveAnchorId;

    @C09CT("leave_cur_bitrate")
    public long leaveCurBitrate;

    @C09CT("leave_is_background")
    public long leaveIsBackground;

    @C09CT("leave_network_quality")
    public long leaveNetworkQuality;

    @C09CT("leave_scene")
    public int leaveScene;

    @C09CT("leave_source")
    public String leaveSource = "";
}
