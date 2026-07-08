package com.ss.android.ugc.aweme.im.service.impl.selectmsg;

import X.C1680906i7;
import X.C1681006i8;
import X.C1687406jA;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.util.IImApiUtil;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class BlockUserInlineMsgProtocol implements FakeMsgProtocol {
    public final int LL = 10;
    public final int LLILLJJLI = 255;
    public final C1681006i8 LLILLL = new InterfaceC1756706uL() { // from class: X.06i8
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
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            return new FakeInlineMsgContent(4007, C1710306mr.LIZIZ(2131831093, "{{s_blockUser}}"), Collections.singletonList(new FakeInlineMsgTemplate("s_blockUser", C1383370m6R.LJIIJ(2131831094), null, 1, null)), C1710306mr.LIZIZ(2131831093, C1383370m6R.LJIIJ(2131831094)));
        }
    };
    public final C1687406jA LLILZ = new C1687406jA();
    public final C1680906i7 LLILZIL = new InterfaceC1681206iA() { // from class: X.06i7
        public final Set<Integer> LIZ = Collections.singleton(1);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            if (i != 1) {
                return null;
            }
            return new InterfaceC1681906iH() { // from class: X.06i5
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    Activity activityLIZ;
                    String conversationId;
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        IMUser iMUser = (IMUser) c1708206mW.LIZ(C1681506iD.LIZ);
                        IImApiUtil iImApiUtil = (IImApiUtil) PluggableExtentionKt.pluggableSpiForReal(IImApiUtil.class);
                        if (iImApiUtil != null) {
                            SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                            if (sessionInfo != null) {
                                conversationId = sessionInfo.getConversationId();
                            } else {
                                conversationId = null;
                            }
                            iImApiUtil.LIZIZ(activityLIZ, iMUser, "chat", conversationId);
                        }
                    }
                }
            };
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757106uP Ne2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
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
