package com.ss.android.ugc.aweme.notification.v2.widget.container;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C13LE;
import X.C1865630yeH;
import X.C1866170yf9;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol;

/* JADX INFO: loaded from: classes29.dex */
public final class UserCardWidgetContainerInjector implements NotificationFragmentInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(NotificationUserCardWidgetContainer.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol
    public final AbstractC1865990yer identity() {
        return C1866170yf9.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationFragmentInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865630yeH.LIZ;
    }
}
