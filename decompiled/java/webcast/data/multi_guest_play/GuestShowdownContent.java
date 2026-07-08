package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("party_start_time")
    public long partyStartTime;

    @C09CT("play_config")
    public GuestShowdownConfig playConfig;

    @C09CT("play_id")
    public long playId;

    @C09CT("play_status")
    public int playStatus;

    @C09CT("punishment_start_time")
    public long punishmentStartTime;

    @C09CT("room_id")
    public long roomId;

    @C09CT("running_step")
    public int runningStep;

    @C09CT("version")
    public long version;

    @C09CT("running_play_users")
    public List<GuestShowdownUser> runningPlayUsers = new ArrayList();

    @C09CT("leave_play_users")
    public List<GuestShowdownUser> leavePlayUsers = new ArrayList();

    @C09CT("stream_id")
    public String streamId = "";

    @C09CT("contributors")
    public List<Long> contributors = new ArrayList();

    public final int hashCode() {
        int iY2 = ((((((((((((C786410Ut5.Y2(this.roomId) * 31) + C786410Ut5.Y2(this.channelId)) * 31) + C786410Ut5.Y2(this.playId)) * 31) + this.playStatus) * 31) + C786410Ut5.Y2(this.version)) * 31) + C786410Ut5.Y2(this.partyStartTime)) * 31) + C786410Ut5.Y2(this.punishmentStartTime)) * 31;
        GuestShowdownConfig guestShowdownConfig = this.playConfig;
        return ((((((((iY2 + (guestShowdownConfig != null ? guestShowdownConfig.hashCode() : 0)) * 31) + this.runningPlayUsers.hashCode()) * 31) + this.leavePlayUsers.hashCode()) * 31) + this.streamId.hashCode()) * 31) + this.runningStep;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(GuestShowdownContent.class, cls)) {
            return false;
        }
        GuestShowdownContent guestShowdownContent = (GuestShowdownContent) obj;
        if (this.roomId == guestShowdownContent.roomId && this.channelId == guestShowdownContent.channelId && this.playId == guestShowdownContent.playId && this.playStatus == guestShowdownContent.playStatus && this.version == guestShowdownContent.version && this.partyStartTime == guestShowdownContent.partyStartTime && this.punishmentStartTime == guestShowdownContent.punishmentStartTime && Intrinsics.LJFF(this.playConfig, guestShowdownContent.playConfig) && Intrinsics.LJFF(this.runningPlayUsers, guestShowdownContent.runningPlayUsers) && Intrinsics.LJFF(this.leavePlayUsers, guestShowdownContent.leavePlayUsers) && Intrinsics.LJFF(this.streamId, guestShowdownContent.streamId) && this.runningStep == guestShowdownContent.runningStep) {
            return true;
        }
        return false;
    }
}
