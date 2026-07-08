package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class Player {

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_id")
    public long uid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player player = (Player) obj;
        return this.roomId == player.roomId && this.uid == player.uid;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Player(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Player() {
        this(0L, 0L);
    }

    public Player(long j, long j2) {
        this.roomId = j;
        this.uid = j2;
    }
}
