package com.ss.android.ugc.aweme.feed.suggestfollowing;

import X.C01GW;
import X.C0PEM;
import X.C1ECA;
import X.C2188811AlT;
import X.C23250099c;
import X.C2444609i0;
import X.C2444809i2;
import X.C2445109i5;
import X.C291001Au;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class FYPFollowingSuggestViewModel extends AbsFollowingSuggestViewModel<C2444609i0> {
    public final C01GW LLILLJJLI = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS189S0000000_3.get$arr$(493));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2444609i0(new C291001Au(new C2444809i2(0)));
    }

    public final void wQ2(Aweme aweme, String str) {
        C1ECA.LIZ.getClass();
        if (!C1ECA.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try show button, aweme ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C2445109i5(this, aweme, null), 2);
    }
}
