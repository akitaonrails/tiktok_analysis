package com.ss.android.ugc.aweme.tako.startup.processor.aibot;

import X.C0DQF;
import X.C123100dR;
import X.C14FD;
import X.C1861940yYK;
import X.C1862610yZP;
import X.C1862660yZU;
import X.C19EG;
import X.C830490Whz;
import X.EnumC1858090yS7;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIBotAutoSendProcessor implements ITakoAiBotProcessorProtocol {
    public final int LL = 80;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        if (Intrinsics.LJFF(takoEnterParams.enterMethod, "click_bottom_bar_v2")) {
            return C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent());
        }
        if (C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent()) && !C1861940yYK.LIZJ(takoEnterParams.getCarriedRepeatKey())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862610yZP.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        String str;
        if (iMessageAbility.oj()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            String str2 = takoEnterParams.enterMethod;
            if (Intrinsics.LJFF(str2, "tab")) {
                str = "ask_more";
            } else if (Intrinsics.LJFF(str2, "click_recommend_word")) {
                str = "recommend_word";
            } else {
                str = "quick_reaction";
            }
            c830490Whz.put("interaction_type", str);
            iMessageAbility.Rl2(takoEnterParams.getAutoSendMsgContent(), true, EnumC1858090yS7.SEARCH_SUG, takoEnterParams.getCommonParams(), c830490Whz, new LinkedHashMap<>(), null, null, "", 0, null, 0, -1, null, null, UUID.randomUUID().toString(), null, null);
            String carriedRepeatKey = takoEnterParams.getCarriedRepeatKey();
            if (carriedRepeatKey != null) {
                C1861940yYK.LIZ.add(carriedRepeatKey);
                return true;
            }
            return true;
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return true;
        }
        C0DQF.LIZ.LJIIL(activity, fragment.getView(), takoEnterParams.getCommonParams(), takoEnterParams.botInfo);
        return true;
    }
}
