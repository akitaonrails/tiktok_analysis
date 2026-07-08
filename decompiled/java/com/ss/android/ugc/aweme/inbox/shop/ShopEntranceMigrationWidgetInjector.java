package com.ss.android.ugc.aweme.inbox.shop;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C13LE;
import X.C1865650yeJ;
import X.C1866020yeu;
import X.C19719912Dl;
import X.C296840BkI;
import X.C296850BkJ;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopEntranceMigrationWidgetInjector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(ShopFullMigrationWidget.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        if (!C296850BkJ.LIZ()) {
            return true;
        }
        C296840BkI.LIZ.getClass();
        return !C296840BkI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865990yer identity() {
        return C1866020yeu.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865650yeJ.LIZ;
    }
}
