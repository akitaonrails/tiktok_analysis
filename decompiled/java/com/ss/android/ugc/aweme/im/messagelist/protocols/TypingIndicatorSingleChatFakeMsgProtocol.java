package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C0YVG;
import X.C0ZT2;
import X.C1687406jA;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final class TypingIndicatorSingleChatFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 8;
    public final int LLILLJJLI = 4;
    public final C0ZT2 LLILLL = new InterfaceC1756706uL() { // from class: X.0ZT2
        public final Set<Integer> LIZ = Collections.singleton(1);

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
        public final int LJ() {
            return 3;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJI() {
            return 2;
        }

        @Override // X.InterfaceC1756706uL
        public final Set<Integer> LIZLLL() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            return new FakeMsgContent() { // from class: X.0ZT6
                @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
                public final int getMsgType() {
                    return 4046;
                }
            };
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            return !C1661506ez.LIZIZ();
        }
    };
    public final C1687406jA LLILZ = new C1687406jA();
    public final C0YVG LLILZIL = new InterfaceC1757106uP() { // from class: X.0YVG
        @Override // X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            C0YM0 c0ym0 = null;
            if (c0y8t == null) {
                return null;
            }
            Object obj = c1736606r6.LJFF;
            if (obj instanceof C0YM0) {
                c0ym0 = (C0YM0) obj;
            }
            C0YVH c0yvh = new C0YVH(c0ym0);
            c0yvh.setSender(CastLongProtector.parseLong(C461720I8s.LIZIZ()));
            c0yvh.setSecSender(C461720I8s.LIZ());
            c0yvh.setMsgType(fakeMsgContent.getMsgType());
            c0yvh.setMsgStatus(5);
            c0yvh.setConversationId(c0y8t.getConversationId());
            c0yvh.setConversationShortId(c0y8t.getConversationShortId());
            c0yvh.setConversationType(c0y8t.getConversationType());
            c0yvh.setIndexInConversationV2(-1L);
            return c0yvh;
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
