package com.ss.android.ugc.aweme.newselector.template.groupmanage;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225500hzo;
import X.C1225970i0Z;
import X.C1226810i1v;
import X.EnumC1226540i1U;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupMemberTabDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_GROUP_MEMBER;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        C1225500hzo c1225500hzo;
        if (!(c1223510hwb instanceof C1225500hzo) || (c1225500hzo = (C1225500hzo) c1223510hwb) == null) {
            return null;
        }
        return new C1226810i1v(abstractC1225770i0F, c1225500hzo);
    }
}
