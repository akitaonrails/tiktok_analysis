package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol;

import X.C06N1;
import X.C1687406jA;
import X.C1746306sf;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.message.content.SuggestedReplyData;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartReplySuggestedReplyFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 48;
    public final int LLILLJJLI = 4;
    public final C06N1 LLILLL = new InterfaceC1756706uL() { // from class: X.06N1
        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
        }

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1756706uL
        public final Set<Integer> LIZLLL() {
            return null;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJ() {
            return 3;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJI() {
            return 2;
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            C1507705vH c1507705vH;
            Object c098200Yq;
            Object obj = c1736606r6.LJFF;
            Object obj2 = null;
            if (!(obj instanceof C1507705vH) || (c1507705vH = (C1507705vH) obj) == null) {
                return null;
            }
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                SuggestedReplyData suggestedReplyData = c1507705vH.LIZ;
                c1227904rF.getClass();
                String strLJI = C1227904rF.LJI(suggestedReplyData);
                if (strLJI == null) {
                    strLJI = "";
                }
                c098200Yq = new C06N3(strLJI, c1507705vH.LIZIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            return (C06N3) obj2;
        }
    };
    public final C1687406jA LLILZ = new C1687406jA();
    public final C1746306sf LLILZIL = new InterfaceC1757106uP() { // from class: X.06sf
        @Override // X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            if (!(fakeMsgContent instanceof C06N3)) {
                return null;
            }
            C06N3 c06n3 = (C06N3) fakeMsgContent;
            if (c06n3.LLILLJJLI.length() == 0 || c0y8t == null) {
                return null;
            }
            long jLongValue = 0;
            C869680Y9u c869680Y9u = new C869680Y9u(0L, "");
            c869680Y9u.msgType(c06n3.LL);
            c869680Y9u.scene(c06n3.LLILLL);
            String str = c06n3.LLILLJJLI;
            str.toString();
            c869680Y9u.content(str);
            c869680Y9u.createdAt(System.currentTimeMillis());
            C869590Y9l c869590Y9lBuild = c869680Y9u.build();
            String string = c1736606r6.LIZJ;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            c869590Y9lBuild.setUuid(string);
            c869590Y9lBuild.setMsgStatus(5);
            c869590Y9lBuild.setSvrStatus(0);
            c869590Y9lBuild.setReadStatus(1);
            c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
            c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
            c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
            C869590Y9l c869590Y9l = c1736606r6.LJ;
            if (c869590Y9l != null) {
                jLongValue = Long.valueOf(c869590Y9l.getIndex() + 1).longValue();
            }
            c869590Y9lBuild.setIndex(jLongValue);
            c869590Y9lBuild.setIndexInConversationV2(-1L);
            c869590Y9lBuild.addLocalExt("s:message_index_is_local", "1");
            return c869590Y9lBuild;
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int j40() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1756706uL xf1() {
        return this.LLILLL;
    }
}
