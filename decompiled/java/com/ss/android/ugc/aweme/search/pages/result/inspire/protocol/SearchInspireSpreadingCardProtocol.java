package com.ss.android.ugc.aweme.search.pages.result.inspire.protocol;

import X.C0PHI;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C643010PJz;
import X.InterfaceC594520NTm;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInspireSpreadingCardProtocol extends SearchTransitionalCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C643010PJz LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PJz
        public final C0PHM LIZIZ = C0PHM.ALL_COLUMNS;
        public final C642240PHa LIZJ = new C642240PHa(true, false, 0, true, true, false, false, false, false, false, new C0PJP() { // from class: X.0PJx
            @Override // X.C0PJP
            public final boolean LIZIZ(C0PHX c0phx) {
                C0DYF c0dyfVQ2;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null) {
                    return false;
                }
                getClass();
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLIZ = C0PK2.LIZ();
                if (searchLynxAwemeListRepoViewModelLIZ == null || (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLIZ.vQ2(searchMixFeed)) == null) {
                    return false;
                }
                return c0dyfVQ2.LJ;
            }

            @Override // X.C0PJP
            public final void LIZ(C0PHX c0phx, AwS589S0100000_10 awS589S0100000_10, AwS589S0100000_10 awS589S0100000_102) {
                C0DYF c0dyfVQ2;
                LifecycleOwner lifecycleOwnerLJFF;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null) {
                    awS589S0100000_102.invoke(new IllegalStateException("no search mix feed found"));
                    return;
                }
                getClass();
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLIZ = C0PK2.LIZ();
                if (searchLynxAwemeListRepoViewModelLIZ != null && (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLIZ.vQ2(searchMixFeed)) != null) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLJ.LJFF()) != null) {
                        C948503nH.LJ(lifecycleOwnerLJFF, C23271099x.INSTANCE, new C0DY7(c0dyfVQ2, c0phx, awS589S0100000_10, awS589S0100000_102, null));
                        return;
                    }
                    return;
                }
                awS589S0100000_102.invoke(new IllegalStateException("no repo found"));
            }
        }, null, 11286);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZJ;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            List<Aweme> list;
            SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
            SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLIZ = C0PK2.LIZ();
            if (searchLynxAwemeListRepoViewModelLIZ == null || (list = searchLynxAwemeListRepoViewModelLIZ.vQ2(searchMixFeed).LIZLLL) == null) {
                return null;
            }
            int i = 0;
            for (Object obj : (ArrayList) list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) obj;
                    if (C1839507Ij.LIZ()) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", searchMixFeed.getProviderDocIdStr());
                    }
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", "tt_inspire_gallery");
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "fullscreen_actual_rank", String.valueOf(i));
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "is_page", CardStruct.IStatusCode.DEFAULT);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return list;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        DynamicPatch dynamicPatch = ((SearchMixFeed) interfaceC594520NTm).getDynamicPatch();
        if (dynamicPatch != null && dynamicPatch.getOriginType() == 51) {
            return true;
        }
        return false;
    }
}
