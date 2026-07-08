package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.CommerceAgentBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceAgentActiveBotItem {

    @C09CT("bot_info")
    public final CommerceAgentBotInfo bot;

    @C09CT("bot_enter_method")
    public final String enterMethod;

    @C09CT("bot_enter_timestamp")
    public final long enterTimestamp;

    @C09CT("bot_process_id")
    public final String processId;

    @C09CT("bot_rank")
    public final String rank;

    public CommerceAgentActiveBotItem() {
        this(new CommerceAgentBotInfo(0L, 0, null, null, 0, 0, null, null, false, false, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 67108863, null), "", "", "", 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceAgentActiveBotItem)) {
            return false;
        }
        CommerceAgentActiveBotItem commerceAgentActiveBotItem = (CommerceAgentActiveBotItem) obj;
        return Intrinsics.LJFF(this.bot, commerceAgentActiveBotItem.bot) && Intrinsics.LJFF(this.rank, commerceAgentActiveBotItem.rank) && Intrinsics.LJFF(this.processId, commerceAgentActiveBotItem.processId) && Intrinsics.LJFF(this.enterMethod, commerceAgentActiveBotItem.enterMethod) && this.enterTimestamp == commerceAgentActiveBotItem.enterTimestamp;
    }

    public final int hashCode() {
        int iHashCode = this.bot.hashCode() * 31;
        String str = this.rank;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.processId.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + C786410Ut5.Y2(this.enterTimestamp);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentActiveBotItem(bot=");
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

    public CommerceAgentActiveBotItem(CommerceAgentBotInfo commerceAgentBotInfo, String str, String str2, String str3, long j) {
        this.bot = commerceAgentBotInfo;
        this.rank = str;
        this.processId = str2;
        this.enterMethod = str3;
        this.enterTimestamp = j;
    }
}
