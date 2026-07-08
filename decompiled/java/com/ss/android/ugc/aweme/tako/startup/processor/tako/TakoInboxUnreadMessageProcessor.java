package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C123100dR;
import X.C14FD;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C324800CoI;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInboxUnreadMessageProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 81;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        C324800CoI.LIZ.getClass();
        if (C324800CoI.LIZ()) {
            String str = takoEnterParams.enterFrom;
            if (str == null) {
                str = "";
            }
            if (Intrinsics.LJFF(str, "notification_page_tikbot")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        TakoSubConversationData takoSubConversationData = takoEnterParams.subConversationData;
        if (takoSubConversationData != null && C123100dR.LIZ(takoSubConversationData.unReadMsgId)) {
            if (takoSubConversationData.isPush()) {
                String str = takoSubConversationData.unReadMsgId;
                if (str == null) {
                    str = "";
                }
                Message messageDL1 = iMessageAbility.DL1(str);
                if (messageDL1 != null) {
                    iMessageAbility.QC1(messageDL1);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
