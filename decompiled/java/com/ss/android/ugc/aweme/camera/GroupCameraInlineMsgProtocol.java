package com.ss.android.ugc.aweme.camera;

import X.C1654806du;
import X.C1682906iR;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCameraInlineMsgProtocol implements FakeMsgProtocol {
    public final int LL = 29;
    public final int LLILLJJLI = 8;
    public final C1654806du LLILLL = new InterfaceC1756706uL() { // from class: X.06du
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
            Context context;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference != null && (context = weakReference.get()) != null) {
                return new FakeInlineMsgContent(4058, C1710306mr.LIZIZ(2131831007, "{{s_report}}"), Collections.singletonList(new FakeInlineMsgTemplate("s_report", context.getString(2131831008), null, 3, null)), null, 8, null);
            }
            return null;
        }
    };
    public final C1682906iR LLILZ = new InterfaceC1681206iA() { // from class: X.06iR
        public final Set<Integer> LIZ = Collections.singleton(3);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            if (i != 3) {
                return null;
            }
            return new InterfaceC1681906iH() { // from class: X.06iS
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    Activity activityLIZ;
                    String strLJJJJZ;
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && str != null && (strLJJJJZ = a0.LJJJJZ("group_camera_inline_msg_uuid_", str)) != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1683106iT(CastLongProtector.parseLong(strLJJJJZ), activityLIZ, null), 3);
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
