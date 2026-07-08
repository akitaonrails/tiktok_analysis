package com.ss.android.ugc.aweme.newselector.template.streak;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225430hzh;
import X.C1225970i0Z;
import X.C1226380i1E;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class IMSelectConvContentTabDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_SELECT_CONVERSATION;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225430hzh c1225430hzh;
        if (!(c1223510hwb instanceof C1225430hzh) || (c1225430hzh = (C1225430hzh) c1223510hwb) == null) {
            return null;
        }
        return new C1226380i1E(abstractC1225770i0F, c1225430hzh);
    }
}
