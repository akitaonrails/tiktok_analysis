package com.ss.android.ugc.aweme.newselector.template.publicgroup.factory;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1227090i2N;
import X.C1227480i30;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class PublicGroupInviteFallbackFactory implements IContentTabDataSourceFallbackFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory
    public final C1227480i30 Q41(AbstractC1225770i0F abstractC1225770i0F, String str, C1223510hwb c1223510hwb) {
        C1227090i2N c1227090i2N;
        if (!(c1223510hwb instanceof C1227090i2N) || (c1227090i2N = (C1227090i2N) c1223510hwb) == null) {
            return null;
        }
        return new C1227480i30(str, abstractC1225770i0F, c1227090i2N);
    }
}
