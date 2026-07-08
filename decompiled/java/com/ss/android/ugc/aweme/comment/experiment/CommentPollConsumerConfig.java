package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentPollConsumerConfig {

    @C09CT("badge_enable")
    public final boolean badgeEnable;

    @C09CT("enable")
    public final boolean enable;

    public CommentPollConsumerConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPollConsumerConfig)) {
            return false;
        }
        CommentPollConsumerConfig commentPollConsumerConfig = (CommentPollConsumerConfig) obj;
        return this.enable == commentPollConsumerConfig.enable && this.badgeEnable == commentPollConsumerConfig.badgeEnable;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.badgeEnable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollConsumerConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", badgeEnable=");
        sbLIZ.append(this.badgeEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentPollConsumerConfig(boolean z, boolean z2) {
        this.enable = z;
        this.badgeEnable = z2;
    }
}
