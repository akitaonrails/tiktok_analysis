package com.ss.android.ugc.aweme.im.sdk.chat.feature.story.inline;

import X.C1654706dt;
import X.C1682206iK;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryReactionsSendUnlimitedRemindInlineMsgProtocol implements FakeMsgProtocol {
    public final int LL = 42;
    public final int LLILLJJLI = 4;
    public final C1654706dt LLILLL = new InterfaceC1756706uL() { // from class: X.06dt
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
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference != null && (context = weakReference.get()) != null) {
                return new FakeInlineMsgContent(4069, C786410Ut5.j4(context.getString(2131832324), Arrays.copyOf(new Object[]{"{{s_manage}}"}, 1)), Collections.singletonList(new FakeInlineMsgTemplate("s_manage", context.getString(2131832325), null, 42, null)), null, 8, null);
            }
            return null;
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            C1654606ds.LIZ().storeInt("current_show_times", C1654606ds.LIZ().getInt("current_show_times", 0) + 1);
            String conversationId = c869590Y9l.getConversationId();
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("display_dm_message_request_settings_notice", C2097908Jt.LIZJ(new Pair("conversation_id", conversationId)));
        }
    };
    public final C1682206iK LLILZ = new InterfaceC1681206iA() { // from class: X.06iK
        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return Collections.singleton(42);
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            return new InterfaceC1681906iH() { // from class: X.06iL
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    if (str == null) {
                        return;
                    }
                    SmartRouter.buildRoute(context, "aweme://privacy/setting/page?page_tag=direct_message_permission&enter_from=story_message_request_chat").open();
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
