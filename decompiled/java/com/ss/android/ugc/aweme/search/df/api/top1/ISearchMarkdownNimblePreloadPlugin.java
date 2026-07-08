package com.ss.android.ugc.aweme.search.df.api.top1;

import X.C342090Db5;
import X.InterfaceC682670Qq9;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchMarkdownNimblePreloadPlugin {
    void LIZ(SearchMixFeed searchMixFeed, InterfaceC682670Qq9 interfaceC682670Qq9);

    boolean LIZIZ(SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, SearchMixFeed searchMixFeed, Fragment fragment, C342090Db5 c342090Db5);

    boolean LIZJ(SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, SearchMixFeed searchMixFeed, InterfaceC682670Qq9 interfaceC682670Qq9, List list, int i, Fragment fragment, C342090Db5 c342090Db5);
}
