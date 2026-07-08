package com.ss.android.ugc.tools.chat.message.onboarding;

import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.tools.chat.message.onboarding.FakeVisualPoetOnboardingContent;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final class AiChatOnboardingFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL;
    public final int LLILLJJLI;
    public final InterfaceC1756706uL LLILLL;
    public final InterfaceC1757006uO LLILZ;
    public final InterfaceC1757106uP LLILZIL;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    public AiChatOnboardingFakeMsgProtocol() {
        InterfaceC1756706uL interfaceC1756706uL = new InterfaceC1756706uL() { // from class: X.0YZ3
            @Override // X.InterfaceC1756706uL
            public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            }

            @Override // X.InterfaceC1756706uL
            public final int LIZIZ() {
                return 2;
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
                Object obj = c1736606r6.LJFF;
                if (obj instanceof FakeMsgContent) {
                    return (FakeMsgContent) obj;
                }
                return null;
            }
        };
        InterfaceC1757006uO interfaceC1757006uO = new InterfaceC1757006uO() { // from class: X.0ZT7
            public final Set<Integer> LIZ = Collections.singleton(2);

            @Override // X.InterfaceC1757006uO
            public final void LIZJ(C1736606r6 c1736606r6) {
            }

            @Override // X.InterfaceC1757006uO
            public final boolean LIZLLL(C1736606r6 c1736606r6) {
                return false;
            }

            @Override // X.InterfaceC1757006uO
            public final Set<Integer> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1757006uO
            public final String LIZIZ(C1736606r6 c1736606r6) {
                return c1736606r6.LIZJ;
            }
        };
        InterfaceC1757106uP interfaceC1757106uP = new InterfaceC1757106uP() { // from class: X.0YVI
            @Override // X.InterfaceC1757106uP
            public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
                if (c0y8t == null || !(fakeMsgContent instanceof FakeVisualPoetOnboardingContent) || fakeMsgContent == null) {
                    return null;
                }
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZ();
                C883250Ykt c883250Ykt = C883250Ykt.LL;
                long jLIZJ = C461720I8s.LIZJ();
                C882400YjW.LIZ();
                C869680Y9u c869680Y9u = new C869680Y9u(jLIZJ, C461720I8s.LIZ());
                c869680Y9u.msgType(4065);
                c869680Y9u.content(C541100LKa.LIZIZ(fakeMsgContent));
                C869590Y9l c869590Y9lBuild = c869680Y9u.build();
                c869590Y9lBuild.setUuid(String.valueOf(c1736606r6.LIZJ));
                c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
                c869590Y9lBuild.setSender(C0YNP.LJII(c869590Y9lBuild.getConversationId()));
                return c869590Y9lBuild;
            }
        };
        this.LL = 1281;
        this.LLILLJJLI = 4;
        this.LLILLL = interfaceC1756706uL;
        this.LLILZ = interfaceC1757006uO;
        this.LLILZIL = interfaceC1757106uP;
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
