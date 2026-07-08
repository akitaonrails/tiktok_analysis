package com.ss.android.ugc.aweme.im.push.impl.alerttone.settings;

import X.AbstractC891400Yy2;
import X.C05P0;
import X.C05P1;
import X.C09A1;
import X.C09IC;
import X.C0PEM;
import X.C13FE;
import X.C1DFH;
import X.C20028913Yh;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C861640Xr8;
import X.C891310Yxt;
import X.C891320Yxu;
import X.C891410Yy3;
import X.C891420Yy4;
import X.EnumC2198508jP;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;

/* JADX INFO: loaded from: classes15.dex */
public final class AlertToneViewModel extends ViewModel {
    public final C05P0<AbstractC891400Yy2> LL;
    public final C05P1<AbstractC891400Yy2> LLILLJJLI;

    public final void vQ2() {
        ((C13FE) this.LL).setValue(C891420Yy4.LIZ);
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ == null) {
            ((C13FE) this.LL).setValue(C891410Yy3.LIZ);
        } else {
            C861640Xr8 c861640Xr8 = new C861640Xr8(new C891320Yxu(this, null), iMessageAlertToneServiceLIZ.LJIJ(EnumC2198508jP.USER));
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            C09IC.LJJI(C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ)), c861640Xr8);
        }
    }

    public AlertToneViewModel() {
        C05P0<AbstractC891400Yy2> c05p0LJI = C20028913Yh.LJI(C891420Yy4.LIZ);
        this.LL = c05p0LJI;
        this.LLILLJJLI = c05p0LJI;
    }
}
