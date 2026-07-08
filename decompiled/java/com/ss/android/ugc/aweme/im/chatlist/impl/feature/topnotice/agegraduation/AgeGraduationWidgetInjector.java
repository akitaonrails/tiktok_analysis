package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation;

import X.AbstractC1865640yeI;
import X.AbstractC1865990yer;
import X.C0ZAO;
import X.C13LE;
import X.C1865630yeH;
import X.C19719912Dl;
import X.C287790BPt;
import X.C296840BkI;
import X.C296850BkJ;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class AgeGraduationWidgetInjector implements InboxFragmentWidgetInjectProtocol {
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final C19719912Dl j0() {
        return C13LE.LIZ(AgeGraduationWidgetV2.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final boolean enable() {
        if (!C287790BPt.LIZ()) {
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
        return C0ZAO.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol
    public final AbstractC1865640yeI z0() {
        return C1865630yeH.LIZ;
    }
}
