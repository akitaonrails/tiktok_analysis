package com.ss.android.ugc.aweme.im.messagelist;

import X.C1685106in;
import X.C1685206io;
import X.C1687406jA;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GuideSetPublicActivityStatusProtocol implements FakeMsgProtocol {
    public final int LL = 38;
    public final int LLILLJJLI = 4;
    public final C1685106in LLILLL = new InterfaceC1756706uL() { // from class: X.06in
        public final Set<Integer> LIZ = Collections.singleton(7);

        @Override // X.InterfaceC1756706uL
        public final int LIZIZ() {
            return 1;
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
            return 1;
        }

        @Override // X.InterfaceC1756706uL
        public final Set<Integer> LIZLLL() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1756706uL
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            Context context;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference != null && (context = weakReference.get()) != null) {
                return new FakeInlineMsgContent(4065, context.getString(2131827438, "{{s_setPublic}}"), Collections.singletonList(new FakeInlineMsgTemplate("s_setPublic", context.getString(2131827439), null, 41, null)), null, 8, null);
            }
            return null;
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            String conversationId;
            InterfaceC1712506nD interfaceC1712506nDLJFF;
            C061D c061dLJIILIIL;
            InterfaceC897380ZIi.LIZIZ.getClass();
            C1687506jB c1687506jBLJIJI = C897370ZIh.LIZ().LJIJI();
            EnumC1685906iv enumC1685906iv = EnumC1685906iv.GUIDE_SET_PUBLIC;
            SessionInfo sessionInfo = (SessionInfo) c1736606r6.LJI.LIZ(C1685406iq.LIZ);
            if (sessionInfo != null) {
                conversationId = sessionInfo.getConversationId();
            } else {
                conversationId = null;
            }
            if (!c1687506jBLJIJI.LIZIZ(enumC1685906iv, conversationId)) {
                return true;
            }
            if (AnonymousClass0610.LIZ()) {
                IIMBusinessChatService.LIZ.getClass();
                IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                if (iIMBusinessChatService == null || (c061dLJIILIIL = iIMBusinessChatService.LJIILIIL()) == null || !c061dLJIILIIL.LIZ(C061C.ACTIVITY_STATUS_TO_PUBLIC_GUIDE)) {
                    return true;
                }
            } else {
                IIMBusinessChatService.LIZ.getClass();
                IIMBusinessChatService iIMBusinessChatService2 = C1668706g9.LIZIZ;
                if (iIMBusinessChatService2 == null || (interfaceC1712506nDLJFF = iIMBusinessChatService2.LJFF()) == null) {
                    return true;
                }
                InterfaceC1712506nD.LIZ.getClass();
                if (!interfaceC1712506nDLJFF.LJI(AnonymousClass0613.LIZ())) {
                    return true;
                }
            }
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            String conversationId;
            SessionInfo sessionInfo = (SessionInfo) c1736606r6.LJI.LIZ(C1685406iq.LIZ);
            if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJIJI().LJI(EnumC1685906iv.GUIDE_SET_PUBLIC, conversationId);
            }
        }
    };
    public final C1685206io LLILZ = new InterfaceC1681206iA() { // from class: X.06io
        public final Set<Integer> LIZ = Collections.singleton(41);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            return new InterfaceC1681906iH() { // from class: X.06ip
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    Activity activityLIZIZ;
                    SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                    if (sessionInfo != null && str != null && context != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                        if (fakeMsgOperatorService != null) {
                            String conversationId = sessionInfo.getConversationId();
                            C1684506ih c1684506ih = new C1684506ih();
                            c1684506ih.LIZLLL(38);
                            c1684506ih.LIZJ = str;
                            c1684506ih.LIZ(sessionInfo);
                            fakeMsgOperatorService.LIZ(conversationId, c1684506ih, sessionInfo.getUuid(), null);
                        }
                        InterfaceC897380ZIi.LIZIZ.getClass();
                        C897370ZIh.LIZ().LJ().LJIIIZ(EnumC1643306c3.PUBLIC, new AwS546S0100000_2(activityLIZIZ, 356));
                        C897370ZIh.LIZ().LJIJI().LJIIIIZZ(EnumC1685906iv.GUIDE_SET_PUBLIC, sessionInfo.getConversationId());
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
