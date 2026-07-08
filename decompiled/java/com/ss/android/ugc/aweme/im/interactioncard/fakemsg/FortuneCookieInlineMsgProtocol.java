package com.ss.android.ugc.aweme.im.interactioncard.fakemsg;

import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class FortuneCookieInlineMsgProtocol implements FakeMsgProtocol {
    public final int LL;
    public final int LLILLJJLI;
    public final InterfaceC1756706uL LLILLL;
    public final InterfaceC1757006uO LLILZ;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    public FortuneCookieInlineMsgProtocol() {
        InterfaceC1756706uL interfaceC1756706uL = new InterfaceC1756706uL() { // from class: X.06j8
            @Override // X.InterfaceC1756706uL
            public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            }

            @Override // X.InterfaceC1756706uL
            public final int LIZIZ() {
                return 4;
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
                String str;
                Object obj = c1736606r6.LJFF;
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    return null;
                }
                return new FakeInlineMsgContent(4054, str, null, null, 12, null);
            }
        };
        InterfaceC1757006uO interfaceC1757006uO = new InterfaceC1757006uO() { // from class: X.06j9
            @Override // X.InterfaceC1757006uO
            public final Set<Integer> LIZ() {
                return null;
            }

            @Override // X.InterfaceC1757006uO
            public final void LIZJ(C1736606r6 c1736606r6) {
            }

            @Override // X.InterfaceC1757006uO
            public final boolean LIZLLL(C1736606r6 c1736606r6) {
                return false;
            }

            @Override // X.InterfaceC1757006uO
            public final String LIZIZ(C1736606r6 c1736606r6) {
                return c1736606r6.LIZJ;
            }
        };
        this.LL = 22;
        this.LLILLJJLI = 4;
        this.LLILLL = interfaceC1756706uL;
        this.LLILZ = interfaceC1757006uO;
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
