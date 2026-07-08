package com.bytedance.android.livesdk.commonactionpanel;

import X.C01GW;
import X.C16F5;
import X.C16FZ;
import X.C485950J3x;
import X.C755130Tjj;
import X.C755150Tjl;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveLoadActionPanel extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohJCHELIOSA9KSY4ICA9OCQiLCN9BCw6LAM8KSENKjs6JyscKCE2JA==";
    public C16F5 LLJLLL;
    public C16FZ LLJZ;
    public C755130Tjj LLJZIJLIL;
    public final C755150Tjl LLL = new C755150Tjl();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.commonactionpanel.LiveLoadActionPanel.uS():void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLL.detachView();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup != null) {
            C01GW c01gw = C485950J3x.LIZ;
            View viewLIZIZ = C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.fx_, viewGroup, false);
            if (viewLIZIZ != null) {
                this.LLJLLL = (C16F5) viewLIZIZ.findViewById(R.id.tec);
                this.LLJZ = (C16FZ) viewLIZIZ.findViewById(R.id.s8j);
                C16F5 c16f5 = this.LLJLLL;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 8);
                }
                C16FZ c16fz = this.LLJZ;
                if (c16fz != null) {
                    C786410Ut5.LLLIZZ(c16fz, 0);
                }
                C16F5 c16f52 = this.LLJLLL;
                if (c16f52 != null) {
                    C786410Ut5.l8(c16f52, new ACListenerS147S0100000_12(this, 180));
                }
                uS();
                return viewLIZIZ;
            }
            return null;
        }
        return null;
    }
}
