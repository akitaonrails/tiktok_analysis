package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel;

import X.C0BYD;
import X.C0PEM;
import X.C23250099c;
import X.C681730Qod;
import X.C681760Qog;
import X.C681790Qoj;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchTrendingVM extends AssemViewModel<C681760Qog> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C681760Qog(null);
    }

    public final void vQ2(String str) {
        boolean zBooleanValue = ((Boolean) C0BYD.LIZIZ.getValue()).booleanValue();
        List<MusicSearchHistory> listLJFF = C681730Qod.LJIILIIL().LJFF();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            String str2 = ((MusicSearchHistory) it2.next()).keyword;
            str2.toString();
            arrayList.add(str2);
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C681790Qoj(zBooleanValue, arrayList, str, this, null), 2);
    }
}
