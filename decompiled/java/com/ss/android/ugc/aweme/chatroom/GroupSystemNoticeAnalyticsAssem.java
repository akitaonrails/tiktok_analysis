package com.ss.android.ugc.aweme.chatroom;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C054G;
import X.C05LR;
import X.C06KF;
import X.C0PEM;
import X.C0ZDX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C869590Y9l;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.ability.SystemNoticeBindAbility;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupSystemNoticeAnalyticsAssem extends AbstractC738140SxQ implements SystemNoticeBindAbility, InterfaceC1554640qYg {
    public final Set<String> LL = new LinkedHashSet();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS546S0100000_2(this, 120));
    public final C054G LLILZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 111378981) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.common.ability.SystemNoticeBindAbility
    public final void cH1(C869590Y9l c869590Y9l) {
        String conversationId;
        if (c869590Y9l.getMsgType() == 4084) {
            SessionInfo sessionInfo = (SessionInfo) this.LLILLL.getValue();
            if (sessionInfo != null) {
                Set<String> set = C06KF.LIZ;
                if (C06KF.LIZ.add(sessionInfo.getUuid())) {
                    C06KF.LIZIZ("ttsocial_group_preview_guide_inline_show", C06KF.LIZ(sessionInfo));
                    return;
                }
                return;
            }
            return;
        }
        String strLJII = C0ZDX.LJII(c869590Y9l);
        if (strLJII != null && strLJII.length() != 0) {
            String uuid = c869590Y9l.getUuid();
            if (this.LL.contains(uuid)) {
                return;
            }
            SessionInfo sessionInfo2 = (SessionInfo) this.LLILLL.getValue();
            if (sessionInfo2 == null || (conversationId = sessionInfo2.getConversationId()) == null) {
                conversationId = "";
            }
            C23250099c.LIZLLL(this.LLILZ, null, null, new C05LR(uuid, conversationId, this, c869590Y9l, null), 3);
            this.LL.add(uuid);
        }
    }
}
