package com.ss.android.ugc.feed.platform.panel.base;

import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC1565640qqQ;
import Y.ARunnableS11S1300000_11;
import android.os.Looper;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;

/* JADX INFO: loaded from: classes12.dex */
public final class EventCenter extends DataCenter {
    public static final /* synthetic */ int LLIZ = 0;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter
    @InterfaceC1294060jmO
    public final DataCenter zQ2(Object obj, String str) {
        return null;
    }

    public final void CQ2(InterfaceC1565640qqQ interfaceC1565640qqQ, String str, Object obj) {
        if (this.LLILZ == null) {
            this.LLILZ = Looper.getMainLooper().getThread();
        }
        if (C786410Ut5.u3() == this.LLILZ) {
            super.zQ2(obj, str);
        } else {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS11S1300000_11(this, interfaceC1565640qqQ, str, obj, 1));
        }
    }
}
