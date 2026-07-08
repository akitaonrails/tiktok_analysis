package com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry;

import X.C123100dR;
import X.C1857530yRD;
import X.C1858390ySb;
import X.C1858670yT3;
import X.C321970Cjj;
import X.C326900Crg;
import X.InterfaceC1858000yRy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerRetryInsertProtocol implements ITakoCardPostProcessProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol
    public final List<InterfaceC1858000yRy> IM1(List<? extends InterfaceC1858000yRy> list, C1857530yRD c1857530yRD) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1858000yRy interfaceC1858000yRy : list) {
            arrayList.add(interfaceC1858000yRy);
            Message messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy);
            if (messageLIZ != null && C1858670yT3.LJ(messageLIZ) && C123100dR.LIZ(messageLIZ.replyMsgId) && !Intrinsics.LJFF(messageLIZ.replyMsgId, CardStruct.IStatusCode.DEFAULT)) {
                C1858390ySb.LIZ.getClass();
                if (!C1858390ySb.LIZ() || messageLIZ.versionSeq <= 1) {
                    arrayList.add(new C326900Crg(messageLIZ));
                }
            }
        }
        return arrayList;
    }
}
