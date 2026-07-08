package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils;

import X.C01GW;
import X.C0P70;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTopResultRequestObserverUtils {
    public static final /* synthetic */ int LIZ = 0;

    public static final class RequestObserversVM extends ViewModel implements C0P70 {
        public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(330));

        @Override // X.C0P70
        public final void RZ1(SearchMixFeedList searchMixFeedList) {
            Iterator it2 = ((ArrayList) this.LL.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0P70) it2.next()).RZ1(searchMixFeedList);
            }
        }

        @Override // X.C0P70
        public final void ip0(SearchResultParam searchResultParam, SearchMixFeedList searchMixFeedList) {
            Iterator it2 = ((ArrayList) this.LL.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0P70) it2.next()).ip0(searchResultParam, searchMixFeedList);
            }
        }
    }
}
