package com.ss.android.ugc.aweme.search.pages.result.topsearch.common.logic;

import X.AbstractC738140SxQ;
import X.C0P5H;
import X.C0Q3E;
import X.C642950PJt;
import X.C642960PJu;
import X.C687700QyG;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentSource;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes11.dex */
public final class GeneralSearchLogicAssem extends AbstractC738140SxQ implements C0P5H, InterfaceC737790Swr {
    public final GeneralSearchLogicAssem LL = this;

    @Override // X.C0P5H
    public final void Xo() {
        C642950PJt c642950PJt = C642950PJt.LIZ;
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        c642950PJt.getClass();
        iSearchContextAbilityLJI.fe(new C642960PJu(0));
    }

    @Override // X.C0P5H
    public final void Wo(SearchMixFeedList searchMixFeedList) {
        C642950PJt.LIZ(C642950PJt.LIZ, searchMixFeedList.getDisableReorder());
    }

    @Override // X.C0P5H
    public final void Yo(SearchApiResult searchApiResult) {
        int disableReorder;
        C642950PJt c642950PJt = C642950PJt.LIZ;
        if (searchApiResult != null) {
            disableReorder = searchApiResult.getDisableReorder();
        } else {
            disableReorder = 0;
        }
        C642950PJt.LIZ(c642950PJt, disableReorder);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchTopFragmentSource.class}).unbindAbility(this.LL, C0P5H.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchTopFragmentSource.class}).bindAbility(this.LL, C0P5H.class);
    }
}
