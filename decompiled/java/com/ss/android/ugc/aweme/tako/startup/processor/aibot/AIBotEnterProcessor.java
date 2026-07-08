package com.ss.android.ugc.aweme.tako.startup.processor.aibot;

import X.C123100dR;
import X.C14FD;
import X.C14FK;
import X.C1860520yW2;
import X.C1861630yXp;
import X.C1862610yZP;
import X.C1862660yZU;
import X.C1862710yZZ;
import X.C20227614Cs;
import X.C298860BnY;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol;
import kotlin.jvm.internal.AwS6S1500000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIBotEnterProcessor implements ITakoAiBotProcessorProtocol {
    public final int LL = 7;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862610yZP.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        TakoActiveBotItem takoActiveBotItem = new TakoActiveBotItem(C1862710yZZ.LIZ(takoEnterParams.botInfo), "", takoEnterParams.getSubProcessId(), "click_enter_tako", System.currentTimeMillis());
        iMessageAbility.QB0(takoActiveBotItem);
        if (!takoActiveBotItem.bot.disableHistory && C298860BnY.LIZ() && !takoEnterParams.botInfo.isCsiBot()) {
            C1860520yW2.LIZ.getClass();
            TakoActiveBotHistory takoActiveBotHistoryLIZJ = C1860520yW2.LIZJ();
            takoActiveBotHistoryLIZJ.items.add(takoActiveBotItem);
            C1860520yW2.LJIL(takoActiveBotHistoryLIZJ);
        }
        if (!takoEnterParams.botInfo.isNovelBot()) {
            if (C20227614Cs.LIZLLL(takoEnterParams) && Intrinsics.LJFF(takoEnterParams.enterMethod, "click_bottom_bar_v2") && C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent())) {
                return false;
            }
            if (C298860BnY.LIZ() && C20227614Cs.LIZLLL(takoEnterParams) && (!iMessageAbility.iP().isEmpty())) {
                iMessageAbility.DB();
                return false;
            }
            iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS6S1500000_27(this, takoEnterParams, c1862660yZU, takoActiveBotItem, takoActiveBotItem.bot.botDescripton, iMessageAbility, 4)));
            String carriedRepeatKey = takoEnterParams.getCarriedRepeatKey();
            String subProcessId = takoEnterParams.getSubProcessId();
            if (carriedRepeatKey == null) {
                return false;
            }
            C14FK.LIZ.put(carriedRepeatKey, subProcessId);
            return false;
        }
        return false;
    }
}
