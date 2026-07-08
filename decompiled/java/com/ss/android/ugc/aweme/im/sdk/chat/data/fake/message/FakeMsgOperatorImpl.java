package com.ss.android.ugc.aweme.im.sdk.chat.data.fake.message;

import X.C0Y8T;
import X.C0YSQ;
import X.C13LE;
import X.C1554610qYd;
import X.C1684506ih;
import X.C1736606r6;
import X.C1736706r7;
import X.C1736806r8;
import X.C1756306uH;
import X.C1807670x8n;
import X.C2217381BqS;
import X.InterfaceC1737306rD;
import X.InterfaceC1757506uT;
import X.InterfaceC1757606uU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeMsgOperatorImpl implements FakeMsgOperatorService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C1756306uH LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FakeMsgOperatorImpl.class, "commonFakeMsgOperator", "getCommonFakeMsgOperator()Lcom/ss/android/ugc/aweme/im/messagelist/api/fake/message/CommonFakeMsgOperator;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC1737306rD LJ() {
        C1756306uH c1756306uH = this.LIZ;
        if (c1756306uH == null) {
            synchronized (this) {
                c1756306uH = this.LIZ;
                if (c1756306uH == null) {
                    C1756306uH c1756306uH2 = (C1756306uH) C1807670x8n.LLLLLL();
                    this.LIZ = c1756306uH2;
                    return c1756306uH2;
                }
            }
        }
        return c1756306uH;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService
    public final void LIZ(String str, C1684506ih c1684506ih, String str2, InterfaceC1757506uT interfaceC1757506uT) {
        C1736606r6 c1736606r6LIZIZ = c1684506ih.LIZIZ();
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
        FakeMsgProtocol fakeMsgProtocol = null;
        Object obj = null;
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((FakeMsgProtocol) next).Sv1() == c1736606r6LIZIZ.LIZ) {
                    obj = next;
                    break;
                }
            }
            fakeMsgProtocol = (FakeMsgProtocol) obj;
        }
        LJ().LIZ(str, str2, c1736606r6LIZIZ, fakeMsgProtocol, interfaceC1757506uT);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService
    public final void LIZJ(C1736706r7 c1736706r7, String str, String str2, List list) {
        LJ();
        C1756306uH.LIZLLL(c1736706r7, str, str2, list);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService
    public final List LIZLLL(InterfaceC1757606uU interfaceC1757606uU, String str, String str2, List list) {
        return ((C1756306uH) LJ()).LIZJ(str, str2, list, C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str), interfaceC1757606uU);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService
    public final C1736806r8 LIZIZ(String str, C1684506ih c1684506ih, String str2, InterfaceC1757506uT interfaceC1757506uT, Long l) {
        long lastMessageOrderIndex;
        long lastMessageOrderIndex2;
        long lastMessageIndex;
        C1736606r6 c1736606r6LIZIZ = c1684506ih.LIZIZ();
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
        FakeMsgProtocol fakeMsgProtocol = null;
        Object obj = null;
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((FakeMsgProtocol) next).Sv1() == c1736606r6LIZIZ.LIZ) {
                    obj = next;
                    break;
                }
            }
            fakeMsgProtocol = (FakeMsgProtocol) obj;
        }
        if (l == null) {
            InterfaceC1737306rD interfaceC1737306rDLJ = LJ();
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
            if (c0y8tLJIL != null) {
                lastMessageOrderIndex2 = c0y8tLJIL.getLastMessageOrderIndex();
            } else {
                lastMessageOrderIndex2 = 0;
            }
            long jMax = Math.max(lastMessageOrderIndex2, 10000L);
            if (c0y8tLJIL != null) {
                lastMessageIndex = c0y8tLJIL.getLastMessageIndex();
            } else {
                lastMessageIndex = 1;
            }
            return interfaceC1737306rDLJ.LIZIZ(str, str2, c1736606r6LIZIZ, fakeMsgProtocol, c0y8tLJIL, jMax, lastMessageIndex, interfaceC1757506uT);
        }
        InterfaceC1737306rD interfaceC1737306rDLJ2 = LJ();
        long jLongValue = l.longValue();
        C0Y8T c0y8tLJIL2 = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
        if (c0y8tLJIL2 != null) {
            lastMessageOrderIndex = c0y8tLJIL2.getLastMessageOrderIndex();
        } else {
            lastMessageOrderIndex = 0;
        }
        return interfaceC1737306rDLJ2.LIZIZ(str, str2, c1736606r6LIZIZ, fakeMsgProtocol, c0y8tLJIL2, Math.max(lastMessageOrderIndex, 10000L), jLongValue, interfaceC1757506uT);
    }
}
