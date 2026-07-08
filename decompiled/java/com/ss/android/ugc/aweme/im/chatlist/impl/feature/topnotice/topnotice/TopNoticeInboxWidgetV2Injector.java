package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C0ZAP;
import X.C1336205Ku;
import X.C13LE;
import X.C1865630yeH;
import X.C19719912Dl;
import X.C296840BkI;
import X.C296850BkJ;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class TopNoticeInboxWidgetV2Injector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(TopNoticeInboxWidgetV2.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        MessageInboxWidget.LLJJJ.getClass();
        if (C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        if (!C296850BkJ.LIZ()) {
            return true;
        }
        C296840BkI.LIZ.getClass();
        return !C296840BkI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865990yer identity() {
        return C0ZAP.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865630yeH.LIZ;
    }
}
