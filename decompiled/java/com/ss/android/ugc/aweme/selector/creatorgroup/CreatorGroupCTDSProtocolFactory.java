package com.ss.android.ugc.aweme.selector.creatorgroup;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225530hzr;
import X.C1225970i0Z;
import X.C1226500i1Q;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorGroupCTDSProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_LIVE_CREATOR_GROUP;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225530hzr c1225530hzr;
        if (!(c1223510hwb instanceof C1225530hzr) || (c1225530hzr = (C1225530hzr) c1223510hwb) == null) {
            return null;
        }
        return new C1226500i1Q(EnumC1226540i1U.TAB_KEY_LIVE_CREATOR_GROUP, abstractC1225770i0F, c1225530hzr);
    }
}
