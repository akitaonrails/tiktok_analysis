package com.ss.android.ugc.aweme.tako.botpage.actionbar.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC21657319pL;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActiveBotItem implements InterfaceC21657319pL {

    @C09CT("bot_info")
    public final TakoBotInfo bot;

    @C09CT("bot_enter_method")
    public final String enterMethod;

    @C09CT("bot_enter_timestamp")
    public final long enterTimestamp;

    @C09CT("bot_process_id")
    public final String processId;

    @C09CT("bot_rank")
    public final String rank;

    public TakoActiveBotItem() {
        this(new TakoBotInfo(0L, 0, null, null, 0, 0, null, null, false, false, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 67108863, null), "", "", "", 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoActiveBotItem)) {
            return false;
        }
        TakoActiveBotItem takoActiveBotItem = (TakoActiveBotItem) obj;
        return Intrinsics.LJFF(this.bot, takoActiveBotItem.bot) && Intrinsics.LJFF(this.rank, takoActiveBotItem.rank) && Intrinsics.LJFF(this.processId, takoActiveBotItem.processId) && Intrinsics.LJFF(this.enterMethod, takoActiveBotItem.enterMethod) && this.enterTimestamp == takoActiveBotItem.enterTimestamp;
    }

    public final int hashCode() {
        int iHashCode = this.bot.hashCode() * 31;
        String str = this.rank;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.processId.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + C786410Ut5.Y2(this.enterTimestamp);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoActiveBotItem(bot=");
        sbLIZ.append(this.bot);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.processId);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", enterTimestamp=");
        sbLIZ.append(this.enterTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21657319pL
    public final long LIZ() {
        return this.bot.botId;
    }

    @Override // X.InterfaceC21657319pL
    public final boolean isActive() {
        long j = this.bot.botId;
        return j > 0 && j != 1;
    }

    public TakoActiveBotItem(TakoBotInfo takoBotInfo, String str, String str2, String str3, long j) {
        this.bot = takoBotInfo;
        this.rank = str;
        this.processId = str2;
        this.enterMethod = str3;
        this.enterTimestamp = j;
    }
}
