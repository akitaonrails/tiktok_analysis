package com.ss.android.ugc.aweme.im.sdk.chat.feature.push;

import X.C1679706hv;
import X.C1679806hw;
import X.C1680806i6;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StreaksPushRemindFakeInlineProtocol implements FakeMsgProtocol {
    public final int LL = 23;
    public final int LLILLJJLI = 4;
    public final C1679806hw LLILLL = new InterfaceC1756706uL() { // from class: X.06hw
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
            IMUser singleChatFromUser;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            String nickName = null;
            if (weakReference == null || (context = weakReference.get()) == null) {
                return null;
            }
            String string = context.getString(2131849176);
            String string2 = context.getString(2131849175);
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            if (sessionInfoLIZ != null && (singleChatFromUser = sessionInfoLIZ.getSingleChatFromUser()) != null) {
                nickName = singleChatFromUser.getNickName();
            }
            return new FakeInlineMsgContent(4055, C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{nickName, "{{s_turnOnNotifications}}", "{{s_fireIcon}}"}, 3)), C1697810uHb.LJIIJJI(new FakeInlineMsgTemplate("s_turnOnNotifications", string, null, 200004, C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "enable_streak_notification"))), new FakeInlineMsgTemplate("s_fireIcon", "{{s_fireIcon}}", null, 200002, null)), null, 8, null);
        }
    };
    public final C1680806i6 LLILZ = new InterfaceC1681206iA() { // from class: X.06i6
        public final Set<Integer> LIZ = Collections.singleton(0);

        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            return new InterfaceC1681906iH() { // from class: X.06i4
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    C1680806i6 c1680806i6 = this.LIZ;
                    C0I0B.LJFF.LIZIZ();
                    c1680806i6.getClass();
                    C830490Whz c830490Whz = new C830490Whz();
                    c830490Whz.put(Scene.SCENE_SERVICE, "enable_streak_notification");
                    c830490Whz.put("chat_type", "private");
                    c830490Whz.put("enter_from", "chat");
                    c830490Whz.put("platform", "internal");
                    c830490Whz.put("action", "click");
                    C20684815ws.LJIILLIIL("click_inline_dm_option", c830490Whz);
                    if (str == null) {
                        return;
                    }
                    C1679506ht.LIZ.LIZLLL().storeBoolean(C1679506ht.LJIIIIZZ("key_clicked_dismiss"), true);
                    SessionInfo sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ);
                    if (sessionInfo != null) {
                        C1684506ih c1684506ih = new C1684506ih();
                        c1684506ih.LIZLLL(23);
                        c1684506ih.LIZ(sessionInfo);
                        c1684506ih.LIZJ = str;
                        ((FakeMsgOperatorService) ServiceManager.get().getService(FakeMsgOperatorService.class)).LIZ(sessionInfo.getConversationId(), c1684506ih, sessionInfo.getUuid(), null);
                    }
                    if (!C824390WVp.LIZJ(context)) {
                        C1440005kM.LIZ(new C1634906ah(true));
                    } else {
                        C1440005kM.LIZ(new C1634906ah(false));
                    }
                }
            };
        }
    };
    public final C1679706hv LLILZIL = new InterfaceC1757006uO() { // from class: X.06hv
        @Override // X.InterfaceC1757006uO
        public final Set<Integer> LIZ() {
            return Collections.singleton(6);
        }

        @Override // X.InterfaceC1757006uO
        public final void LIZJ(C1736606r6 c1736606r6) {
        }

        @Override // X.InterfaceC1757006uO
        public final String LIZIZ(C1736606r6 c1736606r6) {
            String singleChatFromUserId;
            C1679506ht c1679506ht = C1679506ht.LIZ;
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            String strLIZIZ = null;
            if (sessionInfoLIZ != null) {
                singleChatFromUserId = sessionInfoLIZ.getSingleChatFromUserId();
            } else {
                singleChatFromUserId = null;
            }
            Keva kevaLIZLLL = c1679506ht.LIZLLL();
            String strLJIIIIZZ = C1679506ht.LJIIIIZZ("key_last_inline_msg_uuid");
            if (strLJIIIIZZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJIIIIZZ);
                sbLIZ.append('_');
                sbLIZ.append(singleChatFromUserId);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            return kevaLIZLLL.getString(strLIZIZ, "");
        }

        @Override // X.InterfaceC1757006uO
        public final boolean LIZLLL(C1736606r6 c1736606r6) {
            C1679506ht c1679506ht = C1679506ht.LIZ;
            boolean z = c1679506ht.LIZLLL().getBoolean(C1679506ht.LJIIIIZZ("key_clicked_dismiss"), false);
            c1679506ht.LIZLLL().storeBoolean(C1679506ht.LJIIIIZZ("key_clicked_dismiss"), false);
            if (z) {
                return false;
            }
            if (System.currentTimeMillis() - c1679506ht.LJ() >= 86400000) {
                return false;
            }
            return true;
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
