package com.ss.android.ugc.aweme.im.b2c.autoreply.fakemsg;

import X.C1746206se;
import X.C1746906sl;
import X.C1747206so;
import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CLocalAutoReplyMessageProtocol implements FakeMsgProtocol {
    public final int LL = 33;
    public final int LLILLJJLI = 4;
    public final C1746906sl LLILLL = new InterfaceC1756706uL() { // from class: X.06sl
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
            BusinessAutoMessage businessAutoMessage;
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof BusinessAutoMessage) || (businessAutoMessage = (BusinessAutoMessage) obj) == null) {
                return null;
            }
            return new C1746606si(businessAutoMessage);
        }
    };
    public final C1747206so LLILZ = new C1747206so();
    public final C1746206se LLILZIL = new InterfaceC1757106uP() { // from class: X.06se
        @Override // X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            SessionInfo sessionInfoLIZ;
            IMUser singleChatFromUser;
            long jLongValue;
            String strLIZLLL;
            BusinessAutoMessage businessAutoMessage;
            Long lLJIILIIL;
            ByteString byteStringLIZJ = null;
            if ((fakeMsgContent instanceof C1746606si) && (sessionInfoLIZ = C1685406iq.LIZ(c1736606r6)) != null && (singleChatFromUser = sessionInfoLIZ.getSingleChatFromUser()) != null) {
                String uid = singleChatFromUser.getUid();
                if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                if (c0y8t == null || (strLIZLLL = c0y8t.getConversationId()) == null) {
                    strLIZLLL = C0YNP.LIZLLL(Long.valueOf(jLongValue));
                }
                if (strLIZLLL.length() == 0) {
                    return null;
                }
                String secUid = singleChatFromUser.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                C1746606si c1746606si = (C1746606si) fakeMsgContent;
                if (c1746606si != null && (businessAutoMessage = c1746606si.LL) != null) {
                    String strLIZ = businessAutoMessage.clientMsgId;
                    if (strLIZ.length() == 0) {
                        strLIZ = C1017903yT.LIZ();
                    }
                    businessAutoMessage.clientMsgId = strLIZ;
                    Object objLJ = C2097608Jq.LJ();
                    try {
                        objLJ = C051M.LIZJ(businessAutoMessage.ext, new TypeToken<Map<String, ? extends String>>() { // from class: X.06sj
                        }.getType());
                        if (C123100dR.LIZ(businessAutoMessage.contentPB)) {
                            byteStringLIZJ = C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(businessAutoMessage.contentPB, 0));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C869680Y9u c869680Y9u = new C869680Y9u(jLongValue, secUid);
                    c869680Y9u.msgType(businessAutoMessage.msgType);
                    c869680Y9u.scene(businessAutoMessage.scene);
                    c869680Y9u.content(businessAutoMessage.content);
                    c869680Y9u.contentPB(byteStringLIZJ);
                    C869590Y9l c869590Y9lBuild = c869680Y9u.build();
                    c869590Y9lBuild.setMsgStatus(5);
                    c869590Y9lBuild.setConversationId(strLIZLLL);
                    c869590Y9lBuild.setUuid(strLIZ);
                    c869590Y9lBuild.setExt((Map) objLJ);
                    return c869590Y9lBuild;
                }
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
    public final InterfaceC1757106uP Ne2() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final int Sv1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
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
