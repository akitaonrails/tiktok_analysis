package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotSettingResponse extends TakoBaseResponse {

    @C09CT("is_accepted")
    public final boolean botDisclaimerIsAccepted;

    @C09CT("bot_infos")
    public final List<TakoBotInfo> botInfos;

    public TakoBotSettingResponse() {
        this(null, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoBotSettingResponse)) {
            return false;
        }
        TakoBotSettingResponse takoBotSettingResponse = (TakoBotSettingResponse) obj;
        return Intrinsics.LJFF(this.botInfos, takoBotSettingResponse.botInfos) && this.botDisclaimerIsAccepted == takoBotSettingResponse.botDisclaimerIsAccepted;
    }

    public final int hashCode() {
        return (this.botInfos.hashCode() * 31) + C786410Ut5.Z2(this.botDisclaimerIsAccepted);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBotSettingResponse(botInfos=");
        sbLIZ.append(this.botInfos);
        sbLIZ.append(", botDisclaimerIsAccepted=");
        sbLIZ.append(this.botDisclaimerIsAccepted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoBotSettingResponse(List<TakoBotInfo> list, boolean z) {
        super(null, 0, "");
        this.botInfos = list;
        this.botDisclaimerIsAccepted = z;
    }

    public TakoBotSettingResponse(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
