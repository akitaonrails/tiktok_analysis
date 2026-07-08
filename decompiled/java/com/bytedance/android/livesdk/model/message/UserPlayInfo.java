package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserPlayInfo {

    @C09CT("play_id")
    public long playId;

    @C09CT("play_scene")
    public int playScene;

    @C09CT("rank")
    public int rank;

    @C09CT("score")
    public long score;

    @C09CT("target_score")
    public long targetScore;

    @C09CT("user_tag")
    public int userTag;

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.playId) * 31) + this.playScene) * 31) + C786410Ut5.Y2(this.score)) * 31) + this.rank) * 31) + C786410Ut5.Y2(this.targetScore)) * 31) + this.userTag;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPlayInfo(playId=");
        sbLIZ.append(this.playId);
        sbLIZ.append(", playScene=");
        sbLIZ.append(this.playScene);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(", targetScore=");
        sbLIZ.append(this.targetScore);
        sbLIZ.append(", userTag=");
        sbLIZ.append(this.userTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
        if (!Intrinsics.LJFF(UserPlayInfo.class, cls)) {
            return false;
        }
        UserPlayInfo userPlayInfo = (UserPlayInfo) obj;
        if (this.playId == userPlayInfo.playId && this.playScene == userPlayInfo.playScene && this.score == userPlayInfo.score && this.rank == userPlayInfo.rank && this.targetScore == userPlayInfo.targetScore && this.userTag == userPlayInfo.userTag) {
            return true;
        }
        return false;
    }
}
