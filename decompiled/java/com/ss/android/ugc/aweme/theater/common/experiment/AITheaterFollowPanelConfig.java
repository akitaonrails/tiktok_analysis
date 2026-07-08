package com.ss.android.ugc.aweme.theater.common.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterFollowPanelConfig {

    @C09CT("ai_theater_detail_page_enable")
    public final boolean aiTheaterDetailPageEnable;

    @C09CT("ai_theater_friend_page_enable")
    public final boolean aiTheaterFriendPageEnable;

    @C09CT("ai_theater_page_enable")
    public final boolean aiTheaterPageEnable;

    public AITheaterFollowPanelConfig() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterFollowPanelConfig)) {
            return false;
        }
        AITheaterFollowPanelConfig aITheaterFollowPanelConfig = (AITheaterFollowPanelConfig) obj;
        return this.aiTheaterPageEnable == aITheaterFollowPanelConfig.aiTheaterPageEnable && this.aiTheaterDetailPageEnable == aITheaterFollowPanelConfig.aiTheaterDetailPageEnable && this.aiTheaterFriendPageEnable == aITheaterFollowPanelConfig.aiTheaterFriendPageEnable;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.aiTheaterPageEnable) * 31) + C786410Ut5.Z2(this.aiTheaterDetailPageEnable)) * 31) + C786410Ut5.Z2(this.aiTheaterFriendPageEnable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterFollowPanelConfig(aiTheaterPageEnable=");
        sbLIZ.append(this.aiTheaterPageEnable);
        sbLIZ.append(", aiTheaterDetailPageEnable=");
        sbLIZ.append(this.aiTheaterDetailPageEnable);
        sbLIZ.append(", aiTheaterFriendPageEnable=");
        sbLIZ.append(this.aiTheaterFriendPageEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AITheaterFollowPanelConfig(boolean z, boolean z2, boolean z3) {
        this.aiTheaterPageEnable = z;
        this.aiTheaterDetailPageEnable = z2;
        this.aiTheaterFriendPageEnable = z3;
    }
}
