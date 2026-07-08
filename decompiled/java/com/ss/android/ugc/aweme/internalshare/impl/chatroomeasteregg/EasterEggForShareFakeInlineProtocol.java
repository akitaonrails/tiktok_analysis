package com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg;

import X.C1686606j2;
import X.C1686706j3;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class EasterEggForShareFakeInlineProtocol implements FakeMsgProtocol {
    public final int LL = 45;
    public final int LLILLJJLI = 4;
    public final C1686706j3 LLILLL = new InterfaceC1756706uL() { // from class: X.06j3
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
            Context context;
            C1687106j7 c1687106j7;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference == null || (context = weakReference.get()) == null || (c1687106j7 = (C1687106j7) c1736606r6.LJI.LIZ(C1687006j6.LIZ)) == null) {
                return null;
            }
            int i = C1686806j4.LIZ[c1687106j7.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (c1687106j7.LIZIZ) {
                        return new FakeInlineMsgContent(4073, C786410Ut5.j4(context.getString(2131832524), Arrays.copyOf(new Object[]{"{{checkout}}"}, 1)), Collections.singletonList(new FakeInlineMsgTemplate("checkout", context.getString(2131832527), null, 44, null)), C786410Ut5.j4(context.getString(2131832524), Arrays.copyOf(new Object[]{context.getString(2131832527)}, 1)));
                    }
                    return new FakeInlineMsgContent(4073, context.getString(2131832525), null, context.getString(2131832525), 4, null);
                }
                throw new C1954807lC();
            }
            String string = context.getString(2131832522);
            return new FakeInlineMsgContent(4072, string, null, string, 4, null);
        }
    };
    public final C1686606j2 LLILZ = new InterfaceC1681206iA() { // from class: X.06j2
        public final Set<Integer> LIZ = Collections.singleton(44);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            if (!this.LIZ.contains(Integer.valueOf(i))) {
                return null;
            }
            return new InterfaceC1681906iH() { // from class: X.06j1
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                    if (sessionInfo == null || context == null) {
                        return;
                    }
                    IAwemeOpenHelper.LIZ.getClass();
                    IAwemeOpenHelper iAwemeOpenHelperLIZ = C1720706oX.LIZ();
                    if (iAwemeOpenHelperLIZ != null) {
                        iAwemeOpenHelperLIZ.LJFF(context, sessionInfo);
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
    public final InterfaceC1757006uO h80() {
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
    public final int j40() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1756706uL xf1() {
        return this.LLILLL;
    }
}
