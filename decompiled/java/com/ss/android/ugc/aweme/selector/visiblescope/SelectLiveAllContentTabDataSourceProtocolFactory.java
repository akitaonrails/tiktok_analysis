package com.ss.android.ugc.aweme.selector.visiblescope;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225890i0R;
import X.C1225970i0Z;
import X.C1226860i20;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectLiveAllContentTabDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_ALL_FOR_LIVE;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225890i0R c1225890i0R;
        if (!(c1223510hwb instanceof C1225890i0R) || (c1225890i0R = (C1225890i0R) c1223510hwb) == null) {
            return null;
        }
        return new C1226860i20(abstractC1225770i0F, c1225890i0R);
    }
}
