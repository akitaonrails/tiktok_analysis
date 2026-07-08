package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BattleUserArmy {
    public static final BattleUserArmy LIZ = new BattleUserArmy();
    public static final BattleUserArmy LIZIZ = new BattleUserArmy();

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("diamond_score")
    public Long diamondScore;

    @C09CT("enigma_score")
    public long enigmaScore;

    @C09CT("is_enigma")
    public boolean isEnigma;

    @C09CT("nickname")
    public String nickname;

    @C09CT("score")
    public long score;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_id_str")
    public String userIdStr = "";

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.userId), Long.valueOf(this.score), this.nickname, this.avatarThumb, this.diamondScore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleUserArmy{userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", nickname='");
        sbLIZ.append(this.nickname);
        sbLIZ.append("', avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BattleUserArmy)) {
            return false;
        }
        BattleUserArmy battleUserArmy = (BattleUserArmy) obj;
        if (this.userId == battleUserArmy.userId && this.score == battleUserArmy.score && Intrinsics.LJFF(this.nickname, battleUserArmy.nickname) && Intrinsics.LJFF(this.avatarThumb, battleUserArmy.avatarThumb) && Intrinsics.LJFF(this.diamondScore, battleUserArmy.diamondScore)) {
            return true;
        }
        return false;
    }
}
