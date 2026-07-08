package com.ss.android.ugc.aweme.im.b2c.golive;

import X.C1687406jA;
import X.C1747606ss;
import X.C1754206tw;
import X.C1754406ty;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class GoLiveFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 54;
    public final int LLILLJJLI = 8;
    public final C1754406ty LLILLL = new InterfaceC1756706uL() { // from class: X.06ty
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
            return new C1754306tx(0);
        }
    };
    public final C1687406jA LLILZ = new C1687406jA();
    public final C1754206tw LLILZIL = new C1747606ss() { // from class: X.06tw
        @Override // X.C1747606ss, X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            if (!(fakeMsgContent instanceof C1754306tx) || c0y8t == null) {
                return null;
            }
            C869680Y9u c869680Y9u = new C869680Y9u(0L, "");
            c869680Y9u.msgType(((C1754306tx) fakeMsgContent).LL);
            c869680Y9u.createdAt(System.currentTimeMillis());
            C869590Y9l c869590Y9lBuild = c869680Y9u.build();
            c869590Y9lBuild.setUuid("turn_on_go_live_notification_guide_card_fake_msg_uuid");
            c869590Y9lBuild.setMsgStatus(5);
            c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
            c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
            c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
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
