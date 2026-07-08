package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0YUT;
import X.C0ZDR;
import X.C0ZDX;
import X.C13LP;
import X.C869590Y9l;
import X.C882340YjQ;
import X.InterfaceC876950Yaj;
import X.InterfaceC881630YiH;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageStatusDataKt {
    public static final boolean isEligibleForRecall(C869590Y9l c869590Y9l) {
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            if ((C0ZDR.LIZ(c869590Y9l) || c869590Y9l.getMessageStatus() == C0YUT.RECALLED) && c869590Y9l.getIndex() > 0 && c869590Y9l.isSuccessStatus() && !Intrinsics.LJFF("1", c869590Y9l.getLocalExt().get("s:message_index_is_local"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean isUnacceptedOrReceiverIsFiltered(SessionInfo sessionInfo) {
        C0Y8T c0y8tLIZ;
        if (sessionInfo == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId())) == null) {
            return false;
        }
        if (!C882340YjQ.LJI(c0y8tLIZ) && !C882340YjQ.LJII(c0y8tLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean receiverIsFilteredOrMessageRequest(SessionInfo sessionInfo) {
        C0Y8T c0y8tLIZ;
        if (sessionInfo == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId())) == null) {
            return false;
        }
        if (!C882340YjQ.LJIIIIZZ(c0y8tLIZ) && !C882340YjQ.LJII(c0y8tLIZ)) {
            return false;
        }
        return true;
    }

    public static final C869590Y9l findMaxLessOrEqualsThan(long j, List<? extends C869590Y9l> list) {
        if (!list.isEmpty() && j <= ((C869590Y9l) C13LP.LJJJJZI(list)).getIndex()) {
            int size = list.size() - 1;
            int i = 0;
            C869590Y9l c869590Y9l = null;
            while (i <= size) {
                int i2 = ((size - i) / 2) + i;
                if (((C869590Y9l) ListProtector.get(list, i2)).getIndex() > j) {
                    i = i2 + 1;
                } else {
                    c869590Y9l = (C869590Y9l) ListProtector.get(list, i2);
                    size = i2 - 1;
                }
            }
            return c869590Y9l;
        }
        return (C869590Y9l) C13LP.LJJJLL(list);
    }

    public static final String binarySearchReadMessage(List<? extends C869590Y9l> list, SessionInfo sessionInfo, InterfaceC881630YiH interfaceC881630YiH) {
        Long lLIZLLL;
        C869590Y9l c869590Y9lFindMaxLessOrEqualsThan;
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (isEligibleForRecall(c869590Y9l)) {
                arrayList.add(c869590Y9l);
            }
        }
        long jLJII = C0YNP.LJII(sessionInfo.getConversationId());
        if (interfaceC881630YiH != null && (lLIZLLL = interfaceC881630YiH.LIZLLL(jLJII, sessionInfo.getConversationId())) != null && (c869590Y9lFindMaxLessOrEqualsThan = findMaxLessOrEqualsThan(lLIZLLL.longValue(), arrayList)) != null) {
            return c869590Y9lFindMaxLessOrEqualsThan.getUuid();
        }
        return null;
    }
}
