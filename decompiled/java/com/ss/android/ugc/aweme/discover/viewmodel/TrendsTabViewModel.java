package com.ss.android.ugc.aweme.discover.viewmodel;

import X.C004I;
import X.C01GW;
import X.C11NZ;
import X.C1641780spE;
import X.C1761680vwc;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendsTabViewModel extends CommonListViewModel<DiscoverSectionItem, TrendsTabState> {
    public final C01GW LLIZLLLIL;
    public final C1641780spE LLJ;
    public final List<Aweme> LLJI;
    public final Map<String, Aweme> LLJIJIL;

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final Function1<TrendsTabState, C11NZ<Pair<List<DiscoverSectionItem>, C1761680vwc>>> oR2() {
        return new AwS608S0100000_29(this, 84);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final Function1<TrendsTabState, C11NZ<Pair<List<DiscoverSectionItem>, C1761680vwc>>> pR2() {
        return new AwS608S0100000_29(this, 85);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new TrendsTabState(false, new ListState(new C1761680vwc(2), null, null, null, null, 30, null), false, "", false);
    }

    public TrendsTabViewModel() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS218S0000000_29.get$arr$(54));
        this.LLIZLLLIL = c01gwLIZ;
        c01gwLIZ.getValue();
        this.LLJ = new C1641780spE();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new LinkedHashMap();
    }

    public final void qR2(boolean z) {
        setState(new AwS41S0010000_29(z, 2));
        refresh();
    }
}
