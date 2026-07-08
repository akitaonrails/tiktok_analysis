package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomLinkMicExtra {

    @C09CT("bubble_text_connecting")
    public String bubbleTextConnecting;

    @C09CT("bubble_text_first_round")
    public String bubbleTextFirstRound;

    @C09CT("bubble_text_second_round")
    public String bubbleTextSecondRound;

    @C09CT("except_match_time")
    public int expectMatchTime;

    @C09CT("round_time")
    public int roundTime;

    @C09CT("timeout_time")
    public int timeoutTime;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RandomLinkMicExtra(expectMatchTime=");
        sbLIZ.append(this.expectMatchTime);
        sbLIZ.append(", timeoutTime=");
        sbLIZ.append(this.timeoutTime);
        sbLIZ.append(", roundTime=");
        sbLIZ.append(this.roundTime);
        sbLIZ.append(", bubbleTextFirstRound=");
        sbLIZ.append(this.bubbleTextFirstRound);
        sbLIZ.append(", bubbleTextSecondRound=");
        sbLIZ.append(this.bubbleTextSecondRound);
        sbLIZ.append(", bubbleTextConnecting=");
        sbLIZ.append(this.bubbleTextConnecting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
