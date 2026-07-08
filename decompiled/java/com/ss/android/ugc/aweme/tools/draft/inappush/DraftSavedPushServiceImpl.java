package com.ss.android.ugc.aweme.tools.draft.inappush;

import X.C05JA;
import X.C0C64;
import X.C0M21;
import X.C0M22;
import X.C0M2H;
import X.C0MAY;
import X.C201955140j;
import X.C2296808zG;
import X.C23250099c;
import X.C576120Mig;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.IDraftSavedPushService;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSavedPushServiceImpl implements IDraftSavedPushService {
    @Override // com.ss.android.ugc.aweme.tools.draft.IDraftSavedPushService
    public final void LIZ(AwemeDraft awemeDraft, Runnable runnable) {
        if (C0M21.LIZ() == 0) {
            runnable.run();
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_management_use_push", true, false)) {
            runnable.run();
            return;
        }
        C0M22 c0m22LIZIZ = C0M21.LIZIZ();
        if (c0m22LIZIZ != null && !new C05JA(c0m22LIZIZ).LIZIZ()) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftSavedPushManager", "handleDraftSaved: skip push — guardStore.shouldShow=false");
            runnable.run();
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZIZ), null, null, new C0M2H(awemeDraft, runnable, null), 3);
        }
    }
}
