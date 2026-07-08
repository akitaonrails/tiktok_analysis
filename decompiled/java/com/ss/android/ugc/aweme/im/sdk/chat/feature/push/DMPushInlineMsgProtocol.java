package com.ss.android.ugc.aweme.im.sdk.chat.feature.push;

import X.C1679406hs;
import X.C1679606hu;
import X.C1680506i3;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.push.DMPushInlineMsgManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DMPushInlineMsgProtocol implements FakeMsgProtocol {
    public final int LL = 25;
    public final int LLILLJJLI = 4;
    public final C1679406hs LLILLL = new InterfaceC1756706uL() { // from class: X.06hs
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
            IMUser singleChatFromUser;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            String nickName = null;
            if (weakReference == null || (context = weakReference.get()) == null) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getString(2131845551));
            sbLIZ.append(" %s");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String string = context.getString(2131845552);
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            if (sessionInfoLIZ != null && (singleChatFromUser = sessionInfoLIZ.getSingleChatFromUser()) != null) {
                nickName = singleChatFromUser.getNickName();
            }
            return new FakeInlineMsgContent(4008, C786410Ut5.j4(strLIZIZ, Arrays.copyOf(new Object[]{nickName, "{{s_turnOnNotification}}"}, 2)), Collections.singletonList(new FakeInlineMsgTemplate("s_turnOnNotification", string, null, 14, null)), null, 8, null);
        }

        @Override // X.InterfaceC1756706uL
        public final boolean LJII(C1736606r6 c1736606r6) {
            Context context;
            SessionInfo sessionInfoLIZ;
            SessionInfo sessionInfoLIZ2;
            IMUser singleChatFromUser;
            WeakReference<Context> weakReference = c1736606r6.LIZIZ;
            if (weakReference == null || (context = weakReference.get()) == null) {
                return true;
            }
            boolean zLIZJ = C824390WVp.LIZJ(context);
            boolean zLIZJ2 = C19328310jZ.LIZIZ.LIZJ();
            if (!zLIZJ) {
                if (C19212010Ec.LIZJ.LJIIL(context)) {
                    return true;
                }
            } else if (zLIZJ2) {
                return true;
            }
            SessionInfo sessionInfoLIZ3 = C1685406iq.LIZ(c1736606r6);
            if ((sessionInfoLIZ3 != null && sessionInfoLIZ3.isQuickChat()) || (sessionInfoLIZ = C1685406iq.LIZ(c1736606r6)) == null || !sessionInfoLIZ.isFriendChat() || (sessionInfoLIZ2 = C1685406iq.LIZ(c1736606r6)) == null || (singleChatFromUser = sessionInfoLIZ2.getSingleChatFromUser()) == null || singleChatFromUser.getFollowStatus() != 2 || !DMPushInlineMsgManager.LIZ.checkUnifiedFreCtl()) {
                return true;
            }
            C1679506ht c1679506ht = C1679506ht.LIZ;
            if (System.currentTimeMillis() - c1679506ht.LIZLLL().getLong(C1679506ht.LJIIIIZZ("key_last_dm_push_popup_display_timestamp"), 1L) <= 1296000000 || !c1679506ht.LIZJ() || !C06NU.LIZ()) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            String conversationId;
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            if (sessionInfoLIZ != null && (conversationId = sessionInfoLIZ.getConversationId()) != null) {
                String uuid = c869590Y9l.getUuid();
                DMPushInlineMsgManager.LIZ().storeLong(conversationId, System.currentTimeMillis());
                DMPushInlineMsgManager.LIZ().storeString("key_last_conversation_id", conversationId);
                DMPushInlineMsgManager.LIZ().storeString("key_last_msg_uuid", uuid);
                DMPushInlineMsgManager.LIZIZ().storeLong("key_inline_msg_close_time", System.currentTimeMillis());
                C1679506ht.LIZ.LIZLLL().storeLong(C1679506ht.LJIIIIZZ("key_last_dm_push_inline_display_timestamp"), System.currentTimeMillis());
            }
        }
    };
    public final C1679606hu LLILZ = new InterfaceC1757006uO() { // from class: X.06hu
        @Override // X.InterfaceC1757006uO
        public final Set<Integer> LIZ() {
            return Collections.singleton(6);
        }

        @Override // X.InterfaceC1757006uO
        public final String LIZIZ(C1736606r6 c1736606r6) {
            String string = DMPushInlineMsgManager.LIZ().getString("key_last_msg_uuid", "");
            if (string.length() == 0) {
                return null;
            }
            return string;
        }

        @Override // X.InterfaceC1757006uO
        public final void LIZJ(C1736606r6 c1736606r6) {
            DMPushInlineMsgManager.LIZIZ().storeLong("key_inline_msg_close_time", System.currentTimeMillis());
            DMPushInlineMsgManager.LIZ().clear();
        }

        @Override // X.InterfaceC1757006uO
        public final boolean LIZLLL(C1736606r6 c1736606r6) {
            Boolean bool;
            Object obj = c1736606r6.LJFF;
            String conversationId = null;
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            } else {
                bool = null;
            }
            boolean z = false;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            if (sessionInfoLIZ != null) {
                conversationId = sessionInfoLIZ.getConversationId();
            }
            if (Intrinsics.LJFF(conversationId, DMPushInlineMsgManager.LIZ().getString("key_last_conversation_id", CardStruct.IStatusCode.DEFAULT))) {
                if (System.currentTimeMillis() - DMPushInlineMsgManager.LIZ().getLong(conversationId, 1L) >= 86400000) {
                    z = true;
                }
            }
            return !z;
        }
    };
    public final C1680506i3 LLILZIL = new InterfaceC1681206iA() { // from class: X.06i3
        @Override // X.InterfaceC1681206iA
        public final Set<Integer> LIZIZ() {
            return Collections.singleton(14);
        }

        @Override // X.InterfaceC1681206iA
        public final InterfaceC1681906iH LIZ(int i) {
            return new InterfaceC1681906iH() { // from class: X.06iy
                @Override // X.InterfaceC1681906iH
                public final void LIZ(FakeInlineMsgContent fakeInlineMsgContent, Context context, String str, C1708206mW c1708206mW) {
                    SessionInfo sessionInfo;
                    FragmentManager supportFragmentManager;
                    C1680506i3 c1680506i3 = this.LIZ;
                    C0I0B.LJFF.LIZIZ();
                    c1680506i3.getClass();
                    C830490Whz c830490Whz = new C830490Whz();
                    c830490Whz.put(Scene.SCENE_SERVICE, "enable_push_dm_permission");
                    c830490Whz.put("chat_type", "private");
                    c830490Whz.put("enter_from", "chat");
                    c830490Whz.put("platform", "internal");
                    c830490Whz.put("action", "click");
                    C20684815ws.LJIILLIIL("click_inline_dm_option", c830490Whz);
                    if (str != null && (sessionInfo = (SessionInfo) c1708206mW.LIZ(C1685406iq.LIZ)) != null) {
                        C1680506i3 c1680506i32 = this.LIZ;
                        if (!C824390WVp.LIZJ(context)) {
                            C1440005kM.LIZ(new C1686406j0());
                        } else if (C06NU.LIZ()) {
                            c1680506i32.getClass();
                            if (context != null) {
                                C127K c127k = new C127K(context, null, 6);
                                c127k.setTitle(C1383370m6R.LJIIJ(2131831702));
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1c);
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c127k.setBackground(c384050F3z.LIZ(context));
                                C127A c127a = new C127A(context);
                                c127a.LJIILJJIL(true);
                                c127k.setAccessory(c127a);
                                C770750ULh c770750ULh = new C770750ULh();
                                C0HTI c0hti = new C0HTI();
                                c0hti.LIZ = R.drawable.o8;
                                c770750ULh.LIZ = c0hti.LIZ(context);
                                c770750ULh.LIZLLL = 1;
                                c770750ULh.LJ = C1383370m6R.LJIIJ(2131831701);
                                c770750ULh.LJFF = C1383370m6R.LJIIJ(2131831699);
                                c770750ULh.LJIILIIL = c127k;
                                c770750ULh.LJIILJJIL = false;
                                c770750ULh.LJI(C1383370m6R.LJIIJ(2131831700), new AwS211S0300000_2(c127k, context, 5));
                                c770750ULh.LJIILLIIL = false;
                                c770750ULh.LJIJ = true;
                                TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
                                tuxSheet.LLILLL = false;
                                tuxSheet.LLJLLIL = false;
                                tuxSheet.LLJLLL = false;
                                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                                    tuxSheet.show(supportFragmentManager, "DMPushInlineMsg");
                                }
                            }
                        } else {
                            C19296410eQ.LIZIZ.showDMSettingSheet(C1640706bd.LIZ);
                        }
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) ServiceManager.get().getService(FakeMsgOperatorService.class);
                        String conversationId = sessionInfo.getConversationId();
                        C1684506ih c1684506ih = new C1684506ih();
                        c1684506ih.LIZLLL(25);
                        c1684506ih.LIZ(sessionInfo);
                        c1684506ih.LIZJ = str;
                        c1684506ih.LJFF = Boolean.TRUE;
                        fakeMsgOperatorService.LIZ(conversationId, c1684506ih, sessionInfo.getUuid(), null);
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
