package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.retry;

import X.C123100dR;
import X.C320800Chq;
import X.C321710CjJ;
import X.C321720CjK;
import X.C321730CjL;
import X.InterfaceC1467705op;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardPostProcessProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentAnswerRetryInsertProtocol implements ICommerceAgentCardPostProcessProtocol {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardPostProcessProtocol
    public final List<InterfaceC1467705op> wO0(List<? extends InterfaceC1467705op> list, C321710CjJ c321710CjJ) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1467705op interfaceC1467705op : list) {
            arrayList.add(interfaceC1467705op);
            Message messageLIZ = C320800Chq.LIZ(interfaceC1467705op);
            if (messageLIZ != null && C321730CjL.LIZ(messageLIZ) && C123100dR.LIZ(messageLIZ.replyMsgId) && !Intrinsics.LJFF(messageLIZ.replyMsgId, CardStruct.IStatusCode.DEFAULT)) {
                arrayList.add(new C321720CjK(messageLIZ));
            }
        }
        return arrayList;
    }
}
