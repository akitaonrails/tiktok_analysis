package com.ss.android.ugc.aweme.search;

import X.InterfaceC2753014t;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchContextService {
    ISearchContextAbility A();

    ISearchContextAbility A0(LifecycleOwner lifecycleOwner);

    ISearchContextAbility D(Aweme aweme);

    Boolean LJIILLIIL();

    ISearchContextAbility LJJI();

    ISearchContextAbility LLJJI(Object obj);

    IMusicSearchContextAbility LLLLII(LifecycleOwner lifecycleOwner);

    ISearchContextAbility P0();

    ISearchContextAbility d0(View view);

    ISearchContextAbility l(InterfaceC2753014t interfaceC2753014t);

    ISearchContextAbility p0(SearchResultParam searchResultParam);

    IMusicSearchContextAbility r();
}
