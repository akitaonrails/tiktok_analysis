package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.AnonymousClass1426;
import X.C07Q3;
import X.C123100dR;
import X.C13LC;
import X.C14FD;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1860520yW2;
import X.C1861940yYK;
import X.C1862280yYs;
import X.C1862330yYx;
import X.C1862470yZB;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C1863850ybP;
import X.C201992141u;
import X.C2097608Jq;
import X.C747440TTq;
import X.EnumC1858090yS7;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS4S0700000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDisclaimerDialogProcessor implements ITakoNormalProcessorProtocol {
    public static final /* synthetic */ int LLILZIL = 0;
    public boolean LL;
    public ITakoChatPageAbility LLILLJJLI;
    public ITakoContextAbility LLILLL;
    public final int LLILZ = -99;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LLILZ;
    }

    public static void LJ(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        EnumC1858090yS7 enumC1858090yS7;
        String autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
        if (!C123100dR.LIZ(autoSendMsgContent) || autoSendMsgContent == null) {
            autoSendMsgContent = C747440TTq.LIZJ().confirmQuery;
        }
        boolean zLIZ = C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent());
        if (C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent())) {
            enumC1858090yS7 = EnumC1858090yS7.SEARCH_SUG;
        } else {
            enumC1858090yS7 = EnumC1858090yS7.DIALOG_SUG;
        }
        iMessageAbility.Rl2(autoSendMsgContent, zLIZ, enumC1858090yS7, takoEnterParams.getCommonParams(), C1862470yZB.LIZ(takoEnterParams), new LinkedHashMap(), null, null, "", 0, null, 0, -1, null, null, UUID.randomUUID().toString(), null, null);
    }

    public final void LIZ(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        int i;
        if (C1862280yYs.LIZ(takoEnterParams)) {
            i = 2;
        } else {
            i = 1;
        }
        iMessageAbility.U61(2, i, "", "");
        C1860520yW2.LJJI(C1860520yW2.LIZ, true);
        this.LL = false;
        iMessageAbility.ru2(R.attr.zm);
        C201992141u.LIZ.getClass();
        AnonymousClass1426.LIZ.getClass();
        if (AnonymousClass1426.LIZ()) {
            C201992141u.LIZIZ = new WeakReference<>(iMessageAbility);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    public static void LIZJ(boolean z, TakoEnterParams takoEnterParams, String str, int i) {
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("interaction_name", str), new Pair("rank", String.valueOf(i)), new Pair("source", "6"));
        takoEnterParams.getCommonParams();
        if (z) {
            C1862330yYx.LIZ.mobTikbotQuickInteractionClick(mapLJIIIIZZ, takoEnterParams.getCommonParams(), null);
        } else {
            C1862330yYx.LIZ.mobTikbotQuickInteractionShow(mapLJIIIIZZ, takoEnterParams.getCommonParams());
        }
    }

    public final void LIZLLL(TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJJIFFI(false);
        c1862660yZU.LIZ = false;
        LIZ(iMessageAbility, takoEnterParams);
        iMessageAbility.U61(1, 2, "", "");
        c1862660yZU.LIZIZ = true;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
        Map<String, String> commonParams = takoEnterParams.getCommonParams();
        c1862330yYx.getClass();
        C1862330yYx.LJFF(autoSendMsgContent, commonParams);
        C1862330yYx.LJJL(c1862330yYx, takoEnterParams.getCommonParams());
        ITakoContextAbility iTakoContextAbility = this.LLILLL;
        if (iTakoContextAbility == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLILZLL) == null) {
            str = "";
        }
        C1862330yYx.LJII(c1862330yYx, takoEnterParams, str, takoEnterParams.takoChatId);
        iMessageAbility.Le2();
        iMessageAbility.YJ0();
        c14fd.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP = null;
        if (C07Q3.LIZ()) {
            this.LLILLJJLI = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ITakoChatPageAbility.class, null);
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ITakoContextAbility.class, null);
        this.LLILLL = iTakoContextAbility;
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
            c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
        }
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJJIFFI(false);
        AIBotInfo aIBotInfo = takoEnterParams.botInfo;
        C1861940yYK.LIZ(iMessageAbility, aIBotInfo.botId, aIBotInfo.botSource, new AwS4S0700000_27(this, fragment, takoEnterParams, c1862660yZU, iMessageAbility, c14fd, c1863850ybP, 2));
        return true;
    }
}
