package com.ss.android.ugc.aweme.tako.botpage.cards.ability;

import X.C01GW;
import X.C1858660yT2;
import X.C2097608Jq;
import X.C452501pT;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class NimbleLynxDependAbilityImpl<T extends C1858660yT2> implements INimbleLynxDependAbility {
    public final TakoAnswerBaseAssem<T> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 694));

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility
    public final Map<String, Object> pT0() {
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoPassExt takoPassExt;
        TakoMixFeed takoMixFeedLJIIIZ2;
        Map<String, String> map;
        Pair[] pairArr = new Pair[7];
        Message messageYy1 = this.LL.Yy1();
        String str = null;
        pairArr[0] = new Pair("messageId", messageYy1 != null ? messageYy1.uuid : null);
        Message messageYy12 = this.LL.Yy1();
        pairArr[1] = new Pair("serverMessageId", messageYy12 != null ? messageYy12.msgId : null);
        Message messageYy13 = this.LL.Yy1();
        pairArr[2] = new Pair("logId", (messageYy13 == null || (takoMixFeedLJIIIZ2 = messageYy13.LJIIIZ()) == null || (map = takoMixFeedLJIIIZ2.msgExt) == null) ? null : map.get("log_id"));
        Message messageYy14 = this.LL.Yy1();
        pairArr[3] = new Pair("actionItemId", messageYy14 != null ? Long.valueOf(messageYy14.actionId) : null);
        Message messageYy15 = this.LL.Yy1();
        pairArr[4] = new Pair("subProcessId", messageYy15 != null ? messageYy15.subSessionId : null);
        Message messageYy16 = this.LL.Yy1();
        if (messageYy16 != null && (takoMixFeedLJIIIZ = messageYy16.LJIIIZ()) != null && (takoPassExt = takoMixFeedLJIIIZ.ext) != null) {
            str = takoPassExt.pluginType;
        }
        pairArr[5] = new Pair("pluginType", str);
        pairArr[6] = new Pair("takoCellBubble", 1);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility
    public final Map<String, Object> G5() {
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility != null) {
            return iTakoContextAbility.G5();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility
    public final Map<String, String> getCommonParams() {
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILLJJLI.getValue();
        if (iTakoContextAbility != null) {
            return iTakoContextAbility.getCommonParams();
        }
        return null;
    }

    public NimbleLynxDependAbilityImpl(TakoAnswerBaseAssem<T> takoAnswerBaseAssem) {
        this.LL = takoAnswerBaseAssem;
    }
}
