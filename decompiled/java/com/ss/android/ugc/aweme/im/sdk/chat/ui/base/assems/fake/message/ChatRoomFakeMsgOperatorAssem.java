package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.fake.message;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06SA;
import X.C06Z6;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C13LE;
import X.C1509705vb;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1681306iB;
import X.C1684506ih;
import X.C1697810uHb;
import X.C1736606r6;
import X.C1736806r8;
import X.C1737606rG;
import X.C1737706rH;
import X.C1756306uH;
import X.C1758306ub;
import X.C1807670x8n;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1554640qYg;
import X.InterfaceC1737306rD;
import X.InterfaceC1757506uT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC876950Yaj;
import X.InterfaceC904740ZeS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomFakeMsgOperatorAssem extends AbstractC738140SxQ implements ChatRoomFakeMsgOperatorAbility, IMessageEventProtocol, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 520));
    public final C1737706rH LLILLL = new Object() { // from class: X.06rH
    };
    public final C06Z6 LLILZ = C06Z6.WORKER;
    public volatile C1756306uH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomFakeMsgOperatorAssem.class, "commonFakeMsgTrigger", "getCommonFakeMsgTrigger()Lcom/ss/android/ugc/aweme/im/messagelist/api/fake/message/CommonFakeMsgOperator;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC1737306rD bo() {
        C1756306uH c1756306uH = this.LLILZIL;
        if (c1756306uH == null) {
            synchronized (this) {
                c1756306uH = this.LLILZIL;
                if (c1756306uH == null) {
                    C1756306uH c1756306uH2 = (C1756306uH) C1807670x8n.LLLLLL();
                    this.LLILZIL = c1756306uH2;
                    return c1756306uH2;
                }
            }
        }
        return c1756306uH;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 977498122) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final SessionInfo m238do() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.fake.message.ChatRoomFakeMsgOperatorAssem$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, this);
                    }
                }
            });
        }
        Context context = getContext();
        if (context != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C1737606rG(this, context, 6, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        Integer num;
        if (interfaceC904740ZeS instanceof C06SA) {
            if (((C06SA) interfaceC904740ZeS).LIZJ.getMsgStatus() == 2) {
                num = 7;
            } else {
                return;
            }
        } else if (interfaceC904740ZeS instanceof C1758306ub) {
            num = 5;
        } else if (!(interfaceC904740ZeS instanceof C1509705vb)) {
            return;
        } else {
            num = 3;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = getContext();
            if (context != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C1737606rG(this, context, iIntValue, null), 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility
    public final void y52(C1684506ih c1684506ih, InterfaceC1757506uT interfaceC1757506uT) {
        int i;
        Object next;
        C1736606r6 c1736606r6LIZIZ = c1684506ih.LIZIZ();
        C1737706rH c1737706rH = this.LLILLL;
        SessionInfo sessionInfoM238do = m238do();
        c1737706rH.getClass();
        int chatType = sessionInfoM238do.getChatType();
        if (chatType != 0) {
            if (chatType != 3) {
                i = 2;
            } else {
                i = 8;
            }
        } else {
            i = 4;
        }
        Iterator it2 = ((List) C1681306iB.LIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                FakeMsgProtocol fakeMsgProtocol = (FakeMsgProtocol) next;
                if (fakeMsgProtocol.Sv1() == c1736606r6LIZIZ.LIZ && (fakeMsgProtocol.j40() & i) == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String conversationId = m238do().getConversationId();
        String uuid = m238do().getUuid();
        ((C1756306uH) bo()).LIZ(conversationId, uuid, c1736606r6LIZIZ, (FakeMsgProtocol) next, interfaceC1757506uT);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility
    public final C1736806r8 yl2(C1684506ih c1684506ih, InterfaceC1757506uT interfaceC1757506uT) {
        int i;
        Object next;
        long lastMessageOrderIndex;
        long lastMessageIndex;
        C1736606r6 c1736606r6LIZIZ = c1684506ih.LIZIZ();
        C1737706rH c1737706rH = this.LLILLL;
        SessionInfo sessionInfoM238do = m238do();
        c1737706rH.getClass();
        int chatType = sessionInfoM238do.getChatType();
        if (chatType != 0) {
            if (chatType != 3) {
                i = 2;
            } else {
                i = 8;
            }
        } else {
            i = 4;
        }
        Iterator it2 = ((List) C1681306iB.LIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                FakeMsgProtocol fakeMsgProtocol = (FakeMsgProtocol) next;
                if (fakeMsgProtocol.Sv1() == c1736606r6LIZIZ.LIZ && (fakeMsgProtocol.j40() & i) == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FakeMsgProtocol fakeMsgProtocol2 = (FakeMsgProtocol) next;
        String conversationId = m238do().getConversationId();
        String uuid = m238do().getUuid();
        InterfaceC1737306rD interfaceC1737306rDBo = bo();
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(conversationId);
        if (c0y8tLJIL != null) {
            lastMessageOrderIndex = c0y8tLJIL.getLastMessageOrderIndex();
        } else {
            lastMessageOrderIndex = 0;
        }
        long jMax = Math.max(lastMessageOrderIndex, 10000L);
        if (c0y8tLJIL != null) {
            lastMessageIndex = c0y8tLJIL.getLastMessageIndex();
        } else {
            lastMessageIndex = 1;
        }
        return interfaceC1737306rDBo.LIZIZ(conversationId, uuid, c1736606r6LIZIZ, fakeMsgProtocol2, c0y8tLJIL, jMax, lastMessageIndex, interfaceC1757506uT);
    }
}
