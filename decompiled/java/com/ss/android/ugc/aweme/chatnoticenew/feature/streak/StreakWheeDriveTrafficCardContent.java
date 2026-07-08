package com.ss.android.ugc.aweme.chatnoticenew.feature.streak;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: loaded from: classes15.dex */
public final class StreakWheeDriveTrafficCardContent implements FakeMsgContent {

    @C09CT("msgType")
    public final int msgType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreakWheeDriveTrafficCardContent) && this.msgType == ((StreakWheeDriveTrafficCardContent) obj).msgType;
    }

    public final int hashCode() {
        return this.msgType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakWheeDriveTrafficCardContent(msgType=");
        sbLIZ.append(this.msgType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakWheeDriveTrafficCardContent() {
        this(4083);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.msgType;
    }

    public StreakWheeDriveTrafficCardContent(int i) {
        this.msgType = i;
    }
}
