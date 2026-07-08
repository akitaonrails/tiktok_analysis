package com.ss.android.ugc.aweme.fakemsg;

import X.C1707806mS;
import X.C1747406sq;
import X.C1747606ss;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 27;
    public final int LLILLJJLI = 8;
    public final C1707806mS LLILLL = new InterfaceC1756706uL() { // from class: X.06mS
        public final Set<Integer> LIZ = Collections.singleton(6);

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
        }

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 6;
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
            return new FakeMsgContent() { // from class: X.06mV
                @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
                public final int getMsgType() {
                    return 1039;
                }
            };
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            C0Y8T c0y8tLJIL;
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            if (sessionInfoLIZ == null) {
                return true;
            }
            if ((sessionInfoLIZ.isPreviewMode() && !Intrinsics.LJFF(c1736606r6.LJI.LIZ(C1708006mU.LIZ), Boolean.TRUE)) || (c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(sessionInfoLIZ.getConversationId())) == null) {
                return true;
            }
            boolean z = !C1727806pg.LIZ.LIZ("group_chat_insert_qr_code_msg", c0y8tLJIL.getConversationId(), C461720I8s.LIZIZ(), false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check before insert group creation msg: ");
            sbLIZ.append(z);
            sbLIZ.append(", canShowCreationMsg: ");
            sbLIZ.append(z);
            sbLIZ.append(" sessionUUid:");
            sbLIZ.append(sessionInfoLIZ.getUuid());
            C2188811AlT.LIZIZ(sbLIZ);
            return !z;
        }
    };
    public final C1747406sq LLILZ = new C1747606ss() { // from class: X.06sq
        @Override // X.C1747606ss, X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            C869590Y9l c869590Y9lLIZ = super.LIZ(c0y8t, c1736606r6, fakeMsgContent);
            if (c869590Y9lLIZ != null) {
                c869590Y9lLIZ.setUuid("group_creation_fake_message_uuid");
                return c869590Y9lLIZ;
            }
            return null;
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
