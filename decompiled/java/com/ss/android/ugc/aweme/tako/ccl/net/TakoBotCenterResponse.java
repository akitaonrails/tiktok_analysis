package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotCenterResponse extends TakoBaseResponse {

    @C09CT("bot_detail_infos")
    public final TreeMap<Long, TakoBotInfo> botDetailInfos;

    @C09CT("is_accepted")
    public final boolean botDisclaimerIsAccepted;

    @C09CT("category_bots")
    public final List<CategoryBot> categoryBots;

    @C09CT("user_interacted_bots")
    public final CategoryBot userInteractedBots;

    public TakoBotCenterResponse() {
        this(new TreeMap(), null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoBotCenterResponse)) {
            return false;
        }
        TakoBotCenterResponse takoBotCenterResponse = (TakoBotCenterResponse) obj;
        return Intrinsics.LJFF(this.botDetailInfos, takoBotCenterResponse.botDetailInfos) && Intrinsics.LJFF(this.userInteractedBots, takoBotCenterResponse.userInteractedBots) && Intrinsics.LJFF(this.categoryBots, takoBotCenterResponse.categoryBots) && this.botDisclaimerIsAccepted == takoBotCenterResponse.botDisclaimerIsAccepted;
    }

    public final int hashCode() {
        int iHashCode = this.botDetailInfos.hashCode() * 31;
        CategoryBot categoryBot = this.userInteractedBots;
        int iHashCode2 = (iHashCode + (categoryBot == null ? 0 : categoryBot.hashCode())) * 31;
        List<CategoryBot> list = this.categoryBots;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.botDisclaimerIsAccepted);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBotCenterResponse(botDetailInfos=");
        sbLIZ.append(this.botDetailInfos);
        sbLIZ.append(", userInteractedBots=");
        sbLIZ.append(this.userInteractedBots);
        sbLIZ.append(", categoryBots=");
        sbLIZ.append(this.categoryBots);
        sbLIZ.append(", botDisclaimerIsAccepted=");
        sbLIZ.append(this.botDisclaimerIsAccepted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoBotCenterResponse(TreeMap<Long, TakoBotInfo> treeMap, CategoryBot categoryBot, List<CategoryBot> list, boolean z) {
        super(null, 0, "");
        this.botDetailInfos = treeMap;
        this.userInteractedBots = categoryBot;
        this.categoryBots = list;
        this.botDisclaimerIsAccepted = z;
    }
}
