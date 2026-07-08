package com.ss.android.ugc.aweme.tako.startup.processor.aibot;

import X.AbstractC848400XPy;
import X.C0PEM;
import X.C0XQ7;
import X.C123100dR;
import X.C14FD;
import X.C1860520yW2;
import X.C1861630yXp;
import X.C1862330yYx;
import X.C1862610yZP;
import X.C1862660yZU;
import X.C1862710yZZ;
import X.C1DFH;
import X.C20232614Eq;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS113S1200000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class AIBotDisclaimerDialogProcessor implements ITakoAiBotProcessorProtocol {
    public final String LL = UUID.randomUUID().toString();
    public final int LLILLJJLI = -99;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862610yZP.LIZ(this, takoEnterParams, iMessageAbility);
    }

    public static void LIZ(boolean z, TakoEnterParams takoEnterParams, String str) {
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("interaction_name", str), new Pair("source", "6"));
        takoEnterParams.getCommonParams();
        if (z) {
            C1862330yYx.LIZ.mobTikbotQuickInteractionClick(mapLJIIIIZZ, takoEnterParams.getCommonParams(), null);
        } else {
            C1862330yYx.LIZ.mobTikbotQuickInteractionShow(mapLJIIIIZZ, takoEnterParams.getCommonParams());
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_agreed_bot_disclaimer_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        iMessageAbility.B30();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C20232614Eq(fragment, takoEnterParams, this, c1862660yZU, c14fd, null), 3);
        String str = C1862710yZZ.LIZ(takoEnterParams.botInfo).botDescripton;
        if (C123100dR.LIZ(str)) {
            iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS113S1200000_30(takoEnterParams, this, str, 1)));
        }
        iMessageAbility.Le2();
        return true;
    }
}
