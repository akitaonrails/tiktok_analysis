package com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel;

import X.C09YA;
import X.C09YE;
import X.C0PEM;
import X.C2252708s9;
import X.C23250099c;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileIdentifierViewModel extends AssemViewModel<C09YE> {
    public final C09YA LL = new C09YA(this, AFwS189S0000000_3.get$arr$(600));
    public String LLILLJJLI = "";
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C09YE(0);
    }

    public final void wQ2(Integer num, String str, String str2) {
        if (str != null && num != null) {
            int iIntValue = num.intValue();
            setState(AFwS231S0000000_3.get$arr$(285));
            if (C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C2252708s9(this, str, str2, iIntValue, null), 2) != null) {
                return;
            }
        }
        setState(AFwS231S0000000_3.get$arr$(286));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(long r20, int r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn r25) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel.vQ2(long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
