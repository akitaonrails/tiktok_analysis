package com.ss.android.ugc.aweme.commercialize.chatagent.startup.processor.tako;

import X.C01OL;
import X.C1077000e8I;
import X.C123100dR;
import X.C1697810uHb;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C830490Whz;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.AIBotInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentEnterAction;
import com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentNormalProcessorProtocol;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentAutoSendProcessor implements ICommerceAgentNormalProcessorProtocol, ICommerceAgentEnterAction {
    public final int LL = 98;
    public final List<String> LLILLJJLI = C1697810uHb.LJIIJJI("send_text_msg", "send_text_and_image_msg");

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    public final boolean LIZ(CommerceAgentEnterParams commerceAgentEnterParams) {
        String str = commerceAgentEnterParams.autoSendMsgContent;
        if (str != null && C123100dR.LIZ(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol
    public final boolean jI(CommerceAgentEnterParams commerceAgentEnterParams, IMessageAbility iMessageAbility) {
        AIBotInfo aIBotInfo = commerceAgentEnterParams.botInfo;
        if ((aIBotInfo.botSource != 2 || aIBotInfo.botId == 1) && LIZ(commerceAgentEnterParams)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol
    public final void N01(Fragment fragment, CommerceAgentEnterParams commerceAgentEnterParams, C1077000e8I c1077000e8I, IMessageAbility iMessageAbility) {
        if (iMessageAbility.oj()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("group_id", commerceAgentEnterParams.gid);
            c830490Whz.put("message_type", "text");
            String str = commerceAgentEnterParams.autoSendMsgContent;
            boolean z = !c1077000e8I.LIZ;
            commerceAgentEnterParams.getCommonParams();
            iMessageAbility.xZ0(str, z, new LinkedHashMap(), null, null, "", 0, -1, null);
            return;
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        commerceAgentEnterParams.getCommonParams();
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C01OL(1000L, activity, fragment, null), 3);
    }
}
