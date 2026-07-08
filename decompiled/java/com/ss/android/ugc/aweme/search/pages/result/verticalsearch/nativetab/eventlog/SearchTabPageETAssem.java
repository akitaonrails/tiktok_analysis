package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.eventlog;

import X.AbstractC738140SxQ;
import X.C0Q3E;
import X.C1558520qew;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageETAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchTabPageETAssem extends AbstractC738140SxQ implements ISearchPageETAbility, InterfaceC1554640qYg {
    public ISearchContextAbility LL = C0Q3E.LJI();

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -509400198) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }
}
