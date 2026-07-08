package com.ss.android.ugc.aweme.setting.page.security;

import X.C0XGR;
import X.C127A;
import X.C127K;
import X.C20334214hQ;
import X.C20334414hS;
import X.C20684815ws;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.ss.android.ugc.aweme.setting.page.base.SwitchCell;

/* JADX INFO: loaded from: classes32.dex */
public final class SecurityGSMACell extends SwitchCell<C20334414hS> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell
    public final void N5() {
        C127K c127k = this.LLILLJJLI;
        if (c127k != null) {
            c127k.setSubtitle(c127k.getContext().getString(2131835425));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20334214hQ c20334214hQ) {
        super.onBindItemView(c20334214hQ);
        boolean zIsGSMAEnabled = GSMAService.INSTANCE.isGSMAEnabled();
        C20334214hQ c20334214hQ2 = (C20334214hQ) getItem();
        if (c20334214hQ2 != null) {
            c20334214hQ2.LLILLL = zIsGSMAEnabled;
        }
        L5();
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            c127a.LJIIIZ(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView((C20334214hQ) interfaceC1891350zJl);
        boolean zIsGSMAEnabled = GSMAService.INSTANCE.isGSMAEnabled();
        C20334214hQ c20334214hQ = (C20334214hQ) getItem();
        if (c20334214hQ != null) {
            c20334214hQ.LLILLL = zIsGSMAEnabled;
        }
        L5();
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            c127a.LJIIIZ(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C20334214hQ c20334214hQ = (C20334214hQ) getItem();
        if (c20334214hQ != null && c20334214hQ.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C20334214hQ c20334214hQ2 = (C20334214hQ) getItem();
            if (c20334214hQ2 != null) {
                c20334214hQ2.LLILLL = false;
            }
            L5();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("action", "turn_off");
            C20684815ws.LJIILLIIL("ttacc_enable_gsma_toggle", c0xgr.LIZ);
            GSMAService.INSTANCE.updateGSMALocalCache(null, 2, null, null, null, null);
            return;
        }
        C20334214hQ c20334214hQ3 = (C20334214hQ) getItem();
        if (c20334214hQ3 != null) {
            c20334214hQ3.LLILLL = true;
        }
        L5();
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL("action", "turn_on");
        C20684815ws.LJIILLIIL("ttacc_enable_gsma_toggle", c0xgr2.LIZ);
        GSMAService.INSTANCE.updateGSMALocalCache(null, 1, null, null, null, null);
    }
}
