package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel;

import X.C0QPW;
import X.C0QPX;
import X.C0QRC;
import X.C0R4M;
import X.C15O7;
import X.C681730Qod;
import X.C7740030o;
import X.InterfaceC1294060jmO;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class MusicTrendingViewModel extends ViewModel {
    public final NextLiveData<C0QRC<SuggestWordResponse>> LL = new NextLiveData<>();

    public final void vQ2() {
        List<MusicSearchHistory> listLJFF = C681730Qod.LJIILIIL().LJFF();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            String str = ((MusicSearchHistory) it2.next()).keyword;
            str.toString();
            arrayList.add(str);
        }
        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList);
        C0QPW.LIZ.getClass();
        C0QPX.LIZIZ.LIZ(1, "music_create", json, "100011", ComplianceServiceProvider.LJI().LJJII() ? 1 : null).LJ(new C0R4M(this, 0), C15O7.LJIIIIZZ, null);
    }
}
