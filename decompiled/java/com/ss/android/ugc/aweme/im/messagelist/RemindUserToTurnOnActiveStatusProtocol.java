package com.ss.android.ugc.aweme.im.messagelist;

import X.C1685706it;
import X.C1685806iu;
import X.C1687406jA;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class RemindUserToTurnOnActiveStatusProtocol implements FakeMsgProtocol {
    public final int LL = 4;
    public final int LLILLJJLI = 4;
    public final C1685706it LLILLL = new InterfaceC1756706uL() { // from class: X.06it
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
            Context context;
            String string;
            FakeInlineMsgTemplate fakeInlineMsgTemplate;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference != null && (context = weakReference.get()) != null) {
                if (C1689706jX.LIZ()) {
                    string = context.getString(2131827436, "{{s_setFriends}}");
                } else {
                    string = context.getString(2131830839, "{{1}}");
                }
                if (C1689706jX.LIZ()) {
                    fakeInlineMsgTemplate = new FakeInlineMsgTemplate("s_setFriends", context.getString(2131827437), null, 29, null);
                } else {
                    fakeInlineMsgTemplate = new FakeInlineMsgTemplate("1", context.getString(2131830840), null, 29, null);
                }
                return new FakeInlineMsgContent(4043, string, Collections.singletonList(fakeInlineMsgTemplate), null, 8, null);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIJI().LJII(c869590Y9l.getConversationId());
        }
    };
    public final C1685806iu LLILZ = new InterfaceC1681206iA() { // from class: X.06iu
        public final Set<Integer> LIZ = Collections.singleton(29);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            return new InterfaceC1681906iH() { // from class: X.06is
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    C19EG c19egLIZIZ;
                    SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                    if (sessionInfo != null && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("active_status_inline_notice_");
                        sbLIZ.append(sessionInfo.getConversationId());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C1684506ih c1684506ih = new C1684506ih();
                        c1684506ih.LIZLLL(4);
                        c1684506ih.LIZJ = strLIZIZ;
                        c1684506ih.LIZ(sessionInfo);
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                        if (fakeMsgOperatorService != null) {
                            fakeMsgOperatorService.LIZ(sessionInfo.getConversationId(), c1684506ih, sessionInfo.getUuid(), null);
                        }
                        InterfaceC897380ZIi.LIZIZ.getClass();
                        C897370ZIh.LIZ().LJIJI().LJIIIIZZ(EnumC1685906iv.PERMISSION, sessionInfo.getConversationId());
                        if (C1689706jX.LIZ()) {
                            C897370ZIh.LIZ().LJ().LJIIIZ(EnumC1643306c3.FRIENDS, new AwS546S0100000_2(context, 357));
                        } else {
                            C897370ZIh.LIZ().LJ().LJ(c19egLIZIZ, AFwS229S0000000_2.get$arr$(258));
                        }
                    }
                }
            };
        }
    };
    public final C1687406jA LLILZIL = new C1687406jA();

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
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757006uO h80() {
        return this.LLILZIL;
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
