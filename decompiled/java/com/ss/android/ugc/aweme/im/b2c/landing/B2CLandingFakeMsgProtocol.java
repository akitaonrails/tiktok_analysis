package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C1745606sY;
import X.C1746106sd;
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
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CLandingFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL = 1;
    public final int LLILLJJLI = 48;
    public final C1745606sY LLILLL = new InterfaceC1756706uL() { // from class: X.06sY
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
        public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
            BusinessAutoMessage businessAutoMessage;
            Object obj = c1736606r6.LJFF;
            if (!(obj instanceof BusinessAutoMessage) || (businessAutoMessage = (BusinessAutoMessage) obj) == null) {
                return null;
            }
            return new C1745806sa(businessAutoMessage);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
        @Override // X.InterfaceC1756706uL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LJII(X.C1736606r6 r6) {
            /*
                r5 = this;
                java.lang.Object r1 = r6.LJFF
                boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage
                if (r0 == 0) goto Lc
                com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage r1 = (com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage) r1
            L8:
                r4 = 1
                if (r1 != 0) goto Le
                return r4
            Lc:
                r1 = 0
                goto L8
            Le:
                com.ss.android.ugc.aweme.im.b2c.landing.LandingMsgStrategy r1 = r1.messageStrategy
                X.0I0B r0 = X.C0I0B.LJFF
                X.0I8r r0 = r0.LIZ()
                X.0mXo r0 = (X.C1400340mXo) r0
                java.lang.String r0 = r0.getCurUserId()
                if (r0 == 0) goto L3c
                java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
                if (r0 == 0) goto L3c
                long r2 = r0.longValue()
                if (r1 == 0) goto L3c
                java.util.List<java.lang.Long> r1 = r1.visibleUIDS
                if (r1 == 0) goto L3c
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                boolean r0 = r1.contains(r0)
                if (r0 != r4) goto L3c
                r0 = 1
            L39:
                r0 = r0 ^ 1
                return r0
            L3c:
                r0 = 0
                goto L39
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1745606sY.LJII(X.06r6):boolean");
        }

        @Override // X.InterfaceC1756706uL
        public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
            C909290Zln c909290Zln;
            String trafficType;
            int iIntValue;
            String str;
            String str2;
            IMUserBizInfo imUserBizInfo;
            IMUserB2CAccountInfo userB2CAccountInfo;
            IMUserBizInfo imUserBizInfo2;
            IMUserB2CAccountInfo userB2CAccountInfo2;
            SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
            String str3 = null;
            if ((sessionInfoLIZ instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfoLIZ) != null) {
                new C1745506sX(c909290Zln.getEnterFromForMob(), c909290Zln.getEnterMethod());
                if (c909290Zln.isFromLeadDmAdEntrance()) {
                    trafficType = "ads_traffic";
                } else {
                    trafficType = c909290Zln.getTrafficType();
                }
                Integer numLIZ = C1745506sX.LIZ(c869590Y9l);
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = -1;
                }
                EnumC1745406sW enumC1745406sWLIZJ = C1745506sX.LIZJ(iIntValue);
                if (enumC1745406sWLIZJ != EnumC1745406sW.DEFAULT) {
                    if (C896250ZDz.LIZ(c869590Y9l.getPersistentExtra())) {
                        str = "script_conv";
                    } else {
                        str = "normal_welcome_message";
                    }
                    String singleChatFromUserId = c909290Zln.getSingleChatFromUserId();
                    IMContactApi.LIZ.getClass();
                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(singleChatFromUserId, null, "im_local_db");
                    String enterFromForMob = c909290Zln.getEnterFromForMob();
                    String enterMethod = c909290Zln.getEnterMethod();
                    int iLIZIZ = C1745506sX.LIZIZ(c909290Zln, iMUserLJIIL);
                    String strLJIILIIL = C0ZDX.LJIILIIL(c869590Y9l);
                    if (trafficType == null) {
                        trafficType = "";
                    }
                    IMUser iMUserLJIIL2 = C069P.LIZ().LJ().LJIIL(C461720I8s.LIZIZ(), null, "im_local_db");
                    if (iMUserLJIIL2 != null && (imUserBizInfo2 = iMUserLJIIL2.getImUserBizInfo()) != null && (userB2CAccountInfo2 = imUserBizInfo2.getUserB2CAccountInfo()) != null) {
                        str2 = userB2CAccountInfo2.userTags;
                    } else {
                        str2 = null;
                    }
                    if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
                        str3 = userB2CAccountInfo.userTags;
                    }
                    C1745306sV.LIZIZ(enterFromForMob, enterMethod, enumC1745406sWLIZJ, str, iLIZIZ, strLJIILIIL, trafficType, str2, str3, singleChatFromUserId, c909290Zln.getConversationId(), c909290Zln.getExtrasInfoMobParams());
                }
            }
        }
    };
    public final C1747206so LLILZ = new C1747206so();
    public final C1746106sd LLILZIL = new InterfaceC1757106uP() { // from class: X.06sd
        @Override // X.InterfaceC1757106uP
        public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
            SessionInfo sessionInfoLIZ;
            IMUser singleChatFromUser;
            long jLongValue;
            String strLIZLLL;
            BusinessAutoMessage businessAutoMessage;
            ByteString byteStringLIZJ;
            Long lLJIILIIL;
            ByteString byteStringLIZJ2 = null;
            if ((fakeMsgContent instanceof C1745806sa) && (sessionInfoLIZ = C1685406iq.LIZ(c1736606r6)) != null && (singleChatFromUser = sessionInfoLIZ.getSingleChatFromUser()) != null) {
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
                C1745806sa c1745806sa = (C1745806sa) fakeMsgContent;
                if (c1745806sa != null && (businessAutoMessage = c1745806sa.LL) != null) {
                    String strLIZ = businessAutoMessage.clientMsgId;
                    if (strLIZ.length() == 0) {
                        strLIZ = C1017903yT.LIZ();
                    }
                    businessAutoMessage.clientMsgId = strLIZ;
                    Object objLJ = C2097608Jq.LJ();
                    try {
                        objLJ = C051M.LIZJ(businessAutoMessage.ext, new TypeToken<Map<String, ? extends String>>() { // from class: X.06sk
                        }.getType());
                        if (C123100dR.LIZ(businessAutoMessage.contentPB)) {
                            byteStringLIZJ = C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(businessAutoMessage.contentPB, 0));
                        } else {
                            byteStringLIZJ = null;
                        }
                        try {
                            byteStringLIZJ2 = C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(businessAutoMessage.persistentExtra, 0));
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        byteStringLIZJ = null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("local_fake_b2c_landing_msg", "1");
                    C869680Y9u c869680Y9u = new C869680Y9u(jLongValue, secUid);
                    c869680Y9u.msgType(businessAutoMessage.msgType);
                    c869680Y9u.scene(businessAutoMessage.scene);
                    c869680Y9u.content(businessAutoMessage.content);
                    c869680Y9u.contentPB(byteStringLIZJ);
                    c869680Y9u.persistentExt(byteStringLIZJ2);
                    c869680Y9u.localExt(linkedHashMap);
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
