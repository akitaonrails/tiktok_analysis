package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.AnonymousClass0956;
import X.C1069890dwp;
import X.C1069900dwq;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.ffp.FfpSearchApiImpl;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchFriendListVM extends AssemViewModel<C1069890dwp> {
    public AnonymousClass0956 LLILLJJLI;
    public final FfpSearchApiImpl LL = new FfpSearchApiImpl();
    public final Map<String, String> LLILLL = C2097608Jq.LJIIJ(new Pair("enter_from", "find_friends"));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1069890dwp(0);
    }

    public final void LJJZZIII(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search keyword: ");
        sbLIZ.append(str);
        C1720106oR.LJI("[ffp]_Search", C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() == 0) {
            setState(AFwS252S0000000_16.get$arr$(320));
            return;
        }
        setState(AFwS252S0000000_16.get$arr$(321));
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1069900dwq(this, str, null), 3);
    }
}
