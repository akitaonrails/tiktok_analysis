package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C1747606ss;
import X.C1762906vL;
import X.C1763106vN;
import X.C1763206vO;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.b2c.landing.ChatIntro;
import com.ss.android.ugc.aweme.im.message.content.ChatIntroCardMsgContent;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CCreatorChatIntroCardFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 46;
    public final int LLILLJJLI = 4;
    public final C1763206vO LLILLL = new InterfaceC1756706uL() { // from class: X.06vO
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
            ChatIntro chatIntro;
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof ChatIntro) || (chatIntro = (ChatIntro) obj) == null) {
                return null;
            }
            UrlModel urlModel = chatIntro.icon;
            String str = chatIntro.content;
            if (str == null) {
                str = "";
            }
            return new C1763006vM(new ChatIntroCardMsgContent(urlModel, str));
        }
    };
    public final C1763106vN LLILZ = new InterfaceC1757006uO() { // from class: X.06vN
        @Override // X.InterfaceC1757006uO
        public final Set<Integer> LIZ() {
            return null;
        }

        @Override // X.InterfaceC1757006uO
        public final String LIZIZ(C1736606r6 c1736606r6) {
            return "dm_b2c_creator_chat_intro_msg_uuid";
        }

        @Override // X.InterfaceC1757006uO
        public final void LIZJ(C1736606r6 c1736606r6) {
        }

        @Override // X.InterfaceC1757006uO
        public final boolean LIZLLL(C1736606r6 c1736606r6) {
            return false;
        }
    };
    public final C1762906vL LLILZIL = new C1747606ss() { // from class: X.06vL
        @Override // X.C1747606ss, X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            C1763006vM c1763006vM;
            ChatIntroCardMsgContent chatIntroCardMsgContent = null;
            if (c0y8t == null) {
                return null;
            }
            if ((fakeMsgContent instanceof C1763006vM) && (c1763006vM = (C1763006vM) fakeMsgContent) != null) {
                chatIntroCardMsgContent = c1763006vM.LL;
            }
            FakeMessage.Builder builder = new FakeMessage.Builder();
            builder.msgType(fakeMsgContent.getMsgType());
            builder.content(C051M.LJ(chatIntroCardMsgContent, false));
            C869590Y9l c869590Y9lBuild = builder.build();
            c869590Y9lBuild.setUuid("dm_b2c_creator_chat_intro_msg_uuid");
            c869590Y9lBuild.setMsgStatus(5);
            c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
            c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
            c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
            c869590Y9lBuild.setIndexInConversationV2(-1L);
            c869590Y9lBuild.addLocalExt("s:message_index_is_local", "1");
            return c869590Y9lBuild;
        }
    };

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final /* bridge */ /* synthetic */ InterfaceC1757106uP Ne2() {
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
