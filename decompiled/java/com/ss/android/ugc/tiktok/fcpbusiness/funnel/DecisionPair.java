package com.ss.android.ugc.tiktok.fcpbusiness.funnel;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC707820Rpc;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DecisionPair implements Serializable {

    @C09CT("decisionMakerKey")
    public final String decisionMakerKey;

    @C09CT("failedKey")
    public final String failedKey;
    public final long roundId;

    @C09CT("scope")
    public final EnumC707820Rpc scope;

    @C09CT("successKey")
    public final String successKey;

    public DecisionPair() {
        this("", "", EnumC707820Rpc.CONTAINER, -1L, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionPair)) {
            return false;
        }
        DecisionPair decisionPair = (DecisionPair) obj;
        return Intrinsics.LJFF(this.successKey, decisionPair.successKey) && Intrinsics.LJFF(this.failedKey, decisionPair.failedKey) && this.scope == decisionPair.scope && this.roundId == decisionPair.roundId && Intrinsics.LJFF(this.decisionMakerKey, decisionPair.decisionMakerKey);
    }

    public int hashCode() {
        String str = this.successKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.failedKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC707820Rpc enumC707820Rpc = this.scope;
        int iHashCode3 = (((iHashCode2 + (enumC707820Rpc == null ? 0 : enumC707820Rpc.hashCode())) * 31) + C786410Ut5.Y2(this.roundId)) * 31;
        String str3 = this.decisionMakerKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecisionPair(successKey=");
        sbLIZ.append(this.successKey);
        sbLIZ.append(", failedKey=");
        sbLIZ.append(this.failedKey);
        sbLIZ.append(", scope=");
        sbLIZ.append(this.scope);
        sbLIZ.append(", roundId=");
        sbLIZ.append(this.roundId);
        sbLIZ.append(", decisionMakerKey=");
        sbLIZ.append(this.decisionMakerKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DecisionPair(String str, String str2, EnumC707820Rpc enumC707820Rpc, long j, String str3) {
        this.successKey = str;
        this.failedKey = str2;
        this.scope = enumC707820Rpc;
        this.roundId = j;
        this.decisionMakerKey = str3;
    }
}
