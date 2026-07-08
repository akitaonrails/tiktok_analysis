package com.ss.android.ugc.aweme.selector.selecinvitegroup;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225960i0Y;
import X.C1225970i0Z;
import X.C1226440i1K;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveSelectInviteGroupDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_END_LIVE_INVITE_GROUPS;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225960i0Y c1225960i0Y;
        if (!(c1223510hwb instanceof C1225960i0Y) || (c1225960i0Y = (C1225960i0Y) c1223510hwb) == null) {
            return null;
        }
        return new C1226440i1K(abstractC1225770i0F, c1225960i0Y);
    }
}
