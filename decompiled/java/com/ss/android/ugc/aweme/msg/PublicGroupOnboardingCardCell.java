package com.ss.android.ugc.aweme.msg;

import X.C0PEM;
import X.C0Z2N;
import X.C1528305yb;
import X.C2296808zG;
import X.C23250099c;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: loaded from: classes30.dex */
public final class PublicGroupOnboardingCardCell extends AssemPowerCell<PublicGroupOnboardingCardAssem, C0Z2N> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PublicGroupOnboardingCardAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem = (PublicGroupOnboardingCardAssem) NG1();
        if (publicGroupOnboardingCardAssem.LLL.LIZJ != null) {
            SessionInfo sessionInfoSp = publicGroupOnboardingCardAssem.sp();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528305yb("ttsocial_chat_guide_card_show", "group_onboarding_card", sessionInfoSp != null ? sessionInfoSp.getConversationId() : null, publicGroupOnboardingCardAssem.LLL.LIZ(), null, null), 3);
        }
    }
}
