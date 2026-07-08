package com.ss.android.ugc.aweme.im.streaming.sugar.internal;

import X.C1747606ss;
import X.C1747706st;
import X.C1747806su;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamingPlaceholderFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 53;
    public final int LLILLJJLI = 255;
    public final C1747806su LLILLL = new InterfaceC1756706uL() { // from class: X.06su
        public final Set<Integer> LIZ = Collections.singleton(1);

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
        public final int LJ() {
            return 2;
        }

        @Override // X.InterfaceC1756706uL
        public final int LJI() {
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final Set<Integer> LIZLLL() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            return new FakeMsgContent() { // from class: X.06sx
                @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
                public final int getMsgType() {
                    return 4081;
                }
            };
        }
    };
    public final C1747706st LLILZ = new C1747606ss() { // from class: X.06st
        @Override // X.C1747606ss, X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            C869590Y9l c869590Y9lLIZ = super.LIZ(c0y8t, c1736606r6, fakeMsgContent);
            if (c869590Y9lLIZ != null) {
                String str = (String) c1736606r6.LJI.LIZ(C1748006sw.LIZ);
                if (str != null) {
                    c869590Y9lLIZ.addLocalExt("send_server_msg_uuid", str);
                }
                String str2 = (String) c1736606r6.LJI.LIZ(C1747906sv.LIZ);
                if (str2 != null) {
                    c869590Y9lLIZ.addLocalExt("send_client_msg_uuid", str2);
                }
            }
            return c869590Y9lLIZ;
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
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
