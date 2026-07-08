package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C0ZAV;
import X.C1251110if7;
import X.C1263590izF;
import X.C13LE;
import X.C1865630yeH;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;

/* JADX INFO: loaded from: classes29.dex */
public final class RecommendUserWidgetV2Injector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(UserCardWidgetV2.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        return !C1251110if7.LIZIZ() || C1263590izF.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865990yer identity() {
        return C0ZAV.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865630yeH.LIZ;
    }
}
