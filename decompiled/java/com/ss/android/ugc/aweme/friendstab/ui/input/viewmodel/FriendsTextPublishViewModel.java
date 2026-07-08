package com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel;

import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C1244080iTm;
import X.C1395390mPp;
import X.C1395430mPt;
import X.C2296808zG;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsTextPublishViewModel extends AssemViewModel<C1395390mPp> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(273));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(272));
    public final C054G LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1395390mPp(0);
    }

    public final C1395430mPt vQ2() {
        return (C1395430mPt) this.LL.getValue();
    }

    public static boolean wQ2(String str) {
        String strReplace;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!C1244080iTm.LJ(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string == null || (strReplace = new Regex("\\s").replace(string, "")) == null || strReplace.length() <= 0) {
            return false;
        }
        return true;
    }
}
