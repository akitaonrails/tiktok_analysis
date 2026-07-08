package com.ss.android.ugc.aweme.search.common.viewmodel;

import X.C0QER;
import X.C2188811AlT;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInfoViewModel extends ViewModel {
    public C0QER LL;
    public String LLILLJJLI = "";
    public boolean LLILLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedSearchInfoViewModel(recentEnterSearchWay='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("', isSearched=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
