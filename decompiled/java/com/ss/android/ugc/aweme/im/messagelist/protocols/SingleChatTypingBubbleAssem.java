package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PEM;
import X.C1504005ug;
import X.C1517905wv;
import X.C1559260qg8;
import X.C1684506ih;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.EnumC1504205ui;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleChatTypingBubbleAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 364));
    public C1684506ih LLILLL;

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        C1504005ug c1504005ug = C1504005ug.LL;
        String conversationId = ((SessionInfo) this.LLILLJJLI.getValue()).getConversationId();
        EnumC1504205ui enumC1504205ui = EnumC1504205ui.SINGLE;
        c1504005ug.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1517905wv(C1504005ug.LIZIZ(conversationId, enumC1504205ui), this, null), 2);
    }
}
