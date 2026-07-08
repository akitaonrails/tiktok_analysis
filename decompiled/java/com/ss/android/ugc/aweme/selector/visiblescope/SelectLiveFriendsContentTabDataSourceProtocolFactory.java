package com.ss.android.ugc.aweme.selector.visiblescope;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225910i0T;
import X.C1225970i0Z;
import X.C1228280i4I;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectLiveFriendsContentTabDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_FRIENDS_FOR_LIVE;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225910i0T c1225910i0T;
        if (!(c1223510hwb instanceof C1225910i0T) || (c1225910i0T = (C1225910i0T) c1223510hwb) == null) {
            return null;
        }
        return new C1228280i4I(c1225910i0T);
    }
}
