package com.ss.android.ugc.profile.business.ur.school.utils;

import X.C061R;
import X.C1559260qg8;
import X.C2005407tM;
import X.C723600SZy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public final class YearPickerViewModel extends AssemViewModel<C2005407tM> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C061R.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    public final C2005407tM defaultState() {
        C061R c061r = (C061R) this.LL.getValue();
        Integer numValueOf = null;
        if (c061r == null || c061r.LLILLJJLI == null) {
            C061R c061r2 = (C061R) this.LL.getValue();
            if (c061r2 == null || c061r2.LL == null) {
                numValueOf = Integer.valueOf(Calendar.getInstance().get(1));
            }
        } else {
            C061R c061r3 = (C061R) this.LL.getValue();
            if (c061r3 != null) {
                numValueOf = c061r3.LLILLJJLI;
            }
        }
        return new C2005407tM(numValueOf);
    }
}
