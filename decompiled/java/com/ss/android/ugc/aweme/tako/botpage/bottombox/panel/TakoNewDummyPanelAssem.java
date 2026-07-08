package com.ss.android.ugc.aweme.tako.botpage.bottombox.panel;

import X.C0H22;
import X.C0H23;
import X.C19EG;
import X.C724240Sb0;
import android.view.View;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNewDummyPanelAssem extends TakoDummyPanelAssem {
    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.panel.TakoDummyPanelAssem
    public final void Go() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            View decorView = c19egLIZ.getWindow().getDecorView();
            C0H23 c0h23 = new C0H23() { // from class: X.0yZm
                @Override // X.C0H23
                public final void LIZIZ() {
                }

                @Override // X.C0H23
                public final void LIZ() {
                    this.LIZ.LLILII();
                }

                @Override // X.C0H23
                public final void LJJIIJ(int i) {
                    this.LIZ.LLLLZI(i);
                }
            };
            C0H22 c0h22 = new C0H22(c19egLIZ, decorView);
            c0h22.LIZ(c0h23);
            this.LLIZLLLIL = c0h22;
        }
    }
}
