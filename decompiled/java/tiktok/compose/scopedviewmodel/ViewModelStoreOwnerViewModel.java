package tiktok.compose.scopedviewmodel;

import X.C2097608Jq;
import X.C2183008gu;
import X.C2192208iO;
import X.C2192408iQ;
import X.C23118094a;
import X.C23250099c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewModelStoreOwnerViewModel extends ViewModel {
    public Map<String, C2192208iO> LL = C2097608Jq.LJ();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        Iterator<T> it2 = this.LL.keySet().iterator();
        while (it2.hasNext()) {
            wQ2((String) it2.next());
        }
        super.onCleared();
    }

    public final void vQ2(String str) {
        C2192208iO c2192208iO = this.LL.get(str);
        if (c2192208iO != null) {
            C2192408iQ c2192408iQ = c2192208iO.LIZLLL;
            c2192408iQ.LL.setCurrentState(Lifecycle.State.DESTROYED);
            C23250099c.LIZLLL(c2192208iO.LJFF, null, null, new C2183008gu(c2192208iO, null), 3);
        }
    }

    public final void wQ2(String str) {
        C2192208iO c2192208iO = this.LL.get(str);
        if (c2192208iO != null) {
            C23118094a.LJFF(c2192208iO.LJ);
            c2192208iO.LIZJ.LL.clear();
            this.LL = C2097608Jq.LJIIIZ(str, this.LL);
        }
    }
}
