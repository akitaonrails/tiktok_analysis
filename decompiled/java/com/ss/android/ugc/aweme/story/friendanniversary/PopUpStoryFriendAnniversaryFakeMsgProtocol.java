package com.ss.android.ugc.aweme.story.friendanniversary;

import X.InterfaceC1681206iA;
import X.InterfaceC1756706uL;
import X.InterfaceC1757006uO;
import X.InterfaceC1757106uP;
import X.InterfaceC1757306uR;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class PopUpStoryFriendAnniversaryFakeMsgProtocol implements FakeMsgProtocol {
    public final int LL;
    public final int LLILLJJLI;
    public final InterfaceC1756706uL LLILLL;
    public final InterfaceC1757006uO LLILZ;
    public final InterfaceC1757106uP LLILZIL;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1681206iA DA() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol
    public final InterfaceC1757306uR j31() {
        return null;
    }

    public PopUpStoryFriendAnniversaryFakeMsgProtocol() {
        InterfaceC1756706uL interfaceC1756706uL = new InterfaceC1756706uL() { // from class: X.06jd
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
                return 1;
            }

            @Override // X.InterfaceC1756706uL
            public final int LJI() {
                return 1;
            }

            @Override // X.InterfaceC1756706uL
            public final FakeMsgContent LJFF(C1736606r6 c1736606r6) {
                return new FakeMsgContent() { // from class: X.06je
                    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
                    public final int getMsgType() {
                        return 4068;
                    }
                };
            }

            @Override // X.InterfaceC1756706uL
            public final boolean LJII(C1736606r6 c1736606r6) {
                SessionInfo sessionInfoLIZ = C1685406iq.LIZ(c1736606r6);
                boolean z = false;
                if (sessionInfoLIZ == null) {
                    return false;
                }
                if (sessionInfoLIZ.isSingleChat()) {
                    StoryFriendAnniversaryService.LIZ.getClass();
                    StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
                    if (storyFriendAnniversaryServiceLIZ != null && storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ()) != null) {
                        new C902320ZaY();
                        if (C902320ZaY.LIZ(2, sessionInfoLIZ.getConversationId())) {
                            z = true;
                        }
                    }
                }
                return !z;
            }

            @Override // X.InterfaceC1756706uL
            public final void LIZ(C1736606r6 c1736606r6, C869590Y9l c869590Y9l) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1736606r6);
                sbLIZ.append(' ');
                sbLIZ.append(c869590Y9l);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        InterfaceC1757006uO interfaceC1757006uO = new InterfaceC1757006uO() { // from class: X.06tr
            public final C08CX LIZ = C08CX.INSTANCE;

            @Override // X.InterfaceC1757006uO
            public final boolean LIZLLL(C1736606r6 c1736606r6) {
                return false;
            }

            @Override // X.InterfaceC1757006uO
            public final Set<Integer> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1757006uO
            public final String LIZIZ(C1736606r6 c1736606r6) {
                String str = c1736606r6.LIZJ;
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.InterfaceC1757006uO
            public final void LIZJ(C1736606r6 c1736606r6) {
                C902380Zae c902380ZaeLIZ;
                SessionInfo sessionInfoLIZ;
                String conversationId;
                StoryFriendAnniversaryService.LIZ.getClass();
                StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
                if (storyFriendAnniversaryServiceLIZ != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) != null && (sessionInfoLIZ = C1685406iq.LIZ(c1736606r6)) != null && (conversationId = sessionInfoLIZ.getConversationId()) != null) {
                    new C902320ZaY();
                    C902320ZaY.LIZJ(conversationId, c902380ZaeLIZ.LIZJ(conversationId));
                }
            }
        };
        InterfaceC1757106uP interfaceC1757106uP = new InterfaceC1757106uP() { // from class: X.06tq
            @Override // X.InterfaceC1757106uP
            public final C869590Y9l LIZ(C0Y8T c0y8t, C1736606r6 c1736606r6, FakeMsgContent fakeMsgContent) {
                Long lValueOf;
                if (c0y8t != null) {
                    try {
                        C869680Y9u c869680Y9u = new C869680Y9u(CastLongProtector.parseLong(C461720I8s.LIZIZ()), C461720I8s.LIZ());
                        c869680Y9u.msgType(fakeMsgContent.getMsgType());
                        C1227904rF.LIZ.getClass();
                        c869680Y9u.content(C1227904rF.LJI(fakeMsgContent));
                        C869590Y9l c869590Y9lBuild = c869680Y9u.build();
                        c869590Y9lBuild.setMsgStatus(5);
                        c869590Y9lBuild.setConversationId(c0y8t.getConversationId());
                        c869590Y9lBuild.setConversationShortId(c0y8t.getConversationShortId());
                        c869590Y9lBuild.setConversationType(c0y8t.getConversationType());
                        c869590Y9lBuild.setIndexInConversationV2(-1L);
                        c869590Y9lBuild.setCreatedAt(System.currentTimeMillis());
                        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                        if (lastShowMessage != null) {
                            lValueOf = Long.valueOf(lastShowMessage.getOrderIndex());
                        } else {
                            lValueOf = null;
                        }
                        c869590Y9lBuild.setOrderIndex(C1527905yX.LIZIZ(lValueOf) + 1);
                        c869590Y9lBuild.addLocalExt("s:message_index_is_local", "1");
                        return c869590Y9lBuild;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                return null;
            }
        };
        this.LL = 41;
        this.LLILLJJLI = 4;
        this.LLILLL = interfaceC1756706uL;
        this.LLILZ = interfaceC1757006uO;
        this.LLILZIL = interfaceC1757106uP;
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
