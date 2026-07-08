package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C10TH;
import X.C10U0;
import X.C1735430vGH;
import X.C1911410zq7;
import X.C19247010Ro;
import X.C19253210Ty;
import X.EnumC19253310Tz;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NujRevampViewModel extends ViewModel {
    public final MutableLiveData<C19253210Ty> LL = new MutableLiveData<>();
    public C1735430vGH LLILLJJLI;

    public final void vQ2(EnumC19253310Tz enumC19253310Tz, boolean z) {
        String strLIZIZ;
        long jLJIIJ;
        C1911410zq7.LIZ("NujRevampSwipeUp", "Init swipe screen");
        C10TH c10thLIZ = C19247010Ro.LIZ();
        boolean zLJFF = false;
        if (c10thLIZ != null && c10thLIZ.LJIIIZ()) {
            MutableLiveData<C19253210Ty> mutableLiveData = this.LL;
            C10TH c10thLIZ2 = C19247010Ro.LIZ();
            if (c10thLIZ2 == null || (strLIZIZ = c10thLIZ2.LIZIZ()) == null) {
                strLIZIZ = "";
            }
            C10TH c10thLIZ3 = C19247010Ro.LIZ();
            if (c10thLIZ3 != null) {
                zLJFF = c10thLIZ3.LJFF();
            }
            mutableLiveData.setValue(new C19253210Ty(strLIZIZ, enumC19253310Tz, true, false, true, zLJFF, false, z, true, false, false, 1608));
            C10TH c10thLIZ4 = C19247010Ro.LIZ();
            if (c10thLIZ4 != null) {
                jLJIIJ = c10thLIZ4.LJIIJ();
            } else {
                jLJIIJ = 0;
            }
            long j = jLJIIJ + 0;
            C1735430vGH c1735430vGH = new C1735430vGH(j, 100L, new C10U0(j, this, new AwS572S0100000_28(this, 282)));
            c1735430vGH.LJFF();
            this.LLILLJJLI = c1735430vGH;
            return;
        }
        this.LL.setValue(new C19253210Ty(null, null, false, true, false, false, false, false, false, false, false, 2039));
    }
}
