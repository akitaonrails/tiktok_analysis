package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.protocol;

import X.C0PZ9;
import X.C19EG;
import android.os.Bundle;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.fragment.SearchDefaultDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class DefaultSearchDynamicTabProtocol implements BaseSearchDynamicTabProtocol {
    public final Class<? extends AbsSearchBaseFragment> LL = SearchDefaultDynamicTabFragment.class;

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final String vP2() {
        return "dynamic_config";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Class<? extends AbsSearchBaseFragment> LLJIJIL() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[PHI: r11
      0x0139: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:34:0x00a5, B:39:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C646870PYv Ij0(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.protocol.DefaultSearchDynamicTabProtocol.Ij0(java.lang.String):X.0PYv");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol
    public final Bundle bB1(C19EG c19eg, SearchResultParam searchResultParam, String str) {
        return C0PZ9.LIZ(this, searchResultParam, str);
    }
}
