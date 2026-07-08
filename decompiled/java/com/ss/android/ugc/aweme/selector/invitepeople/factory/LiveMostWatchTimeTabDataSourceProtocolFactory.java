package com.ss.android.ugc.aweme.selector.invitepeople.factory;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225970i0Z;
import X.C1227100i2O;
import X.C1227470i2z;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveMostWatchTimeTabDataSourceProtocolFactory<T extends C1223510hwb> implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1227100i2O c1227100i2O;
        if (!(c1223510hwb instanceof C1227100i2O) || (c1227100i2O = (C1227100i2O) c1223510hwb) == null) {
            return null;
        }
        return new C1227470i2z(EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME, abstractC1225770i0F, c1227100i2O);
    }
}
