package com.ss.android.ugc.aweme.detail.component.bottom;

import X.C1603960rqE;
import X.C19EG;
import X.C289540BWm;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;

/* JADX INFO: loaded from: classes25.dex */
public final class ChatDetailComponent extends BasePanelComponent {
    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C289540BWm.LIZ()) {
            if (C1603960rqE.LIZLLL != null) {
                C1603960rqE.LIZLLL = null;
            }
        } else {
            C19EG c19egLIZ = getPanelContext().LIZ();
            if (c19egLIZ == null || !c19egLIZ.isFinishing() || C1603960rqE.LIZLLL == null) {
                return;
            }
            C1603960rqE.LIZLLL = null;
        }
    }
}
