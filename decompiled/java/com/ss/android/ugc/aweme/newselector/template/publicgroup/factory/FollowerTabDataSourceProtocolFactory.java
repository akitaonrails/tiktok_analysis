package com.ss.android.ugc.aweme.newselector.template.publicgroup.factory;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225970i0Z;
import X.C1227090i2N;
import X.C1227480i30;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowerTabDataSourceProtocolFactory<T extends C1223510hwb> implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_FOLLOWERS;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1227090i2N c1227090i2N;
        if (!(c1223510hwb instanceof C1227090i2N) || (c1227090i2N = (C1227090i2N) c1223510hwb) == null) {
            return null;
        }
        return new C1227480i30(EnumC1226540i1U.TAB_KEY_FOLLOWERS.getValue(), abstractC1225770i0F, c1227090i2N);
    }
}
