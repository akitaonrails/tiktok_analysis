package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownConfig {

    @C09CT("duration")
    public long duration;

    @C09CT("loser_num")
    public int loserNum;

    @C09CT("winner_num")
    public int winnerNum;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.duration) * 31) + this.loserNum;
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
        if (!Intrinsics.LJFF(GuestShowdownConfig.class, cls)) {
            return false;
        }
        GuestShowdownConfig guestShowdownConfig = (GuestShowdownConfig) obj;
        if (this.duration == guestShowdownConfig.duration && this.loserNum == guestShowdownConfig.loserNum) {
            return true;
        }
        return false;
    }
}
