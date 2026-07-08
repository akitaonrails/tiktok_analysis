package com.ss.android.ugc.aweme.im.viewmodel;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C1231704rr;
import X.C1240260iNc;
import X.C1240300iNg;
import X.C13BV;
import X.C2188811AlT;
import X.C23250099c;
import X.C626380OhY;
import X.EnumC1240620iOC;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class IMSearchDetailVM extends AssemViewModel<C626380OhY> {
    public final C1231704rr LL = new C1231704rr("search_detail", null, 6);
    public AnonymousClass0956 LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C626380OhY(C13BV.INSTANCE, true, "");
    }

    public final void vQ2(String str, EnumC1240620iOC enumC1240620iOC, String str2, IMUser iMUser, List<C1240300iNg> list) {
        C1231704rr c1231704rr = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("match count ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        setStateImmediate(new AwS70S1000000_19(str, 4));
        this.LLILLJJLI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1240260iNc(this, list, iMUser, str2, enumC1240620iOC, null), 2);
    }
}
