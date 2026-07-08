package com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C0Z3O;
import X.C1336205Ku;
import X.C13LE;
import X.C1865630yeH;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageInboxWidgetInjector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(MessageInboxWidget.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        MessageInboxWidget.LLJJJ.getClass();
        return !C1336205Ku.LIZJ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865990yer identity() {
        return C0Z3O.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865630yeH.LIZ;
    }
}
