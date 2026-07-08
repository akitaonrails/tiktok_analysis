package com.ss.android.ugc.aweme.newselector.template.publicgroup;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226950i29;
import X.C1227010i2F;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class PublicGroupInviteTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "public_group_invite_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        C1226950i29 c1226950i29;
        if (!(abstractC1225780i0G instanceof C1226950i29) || (c1226950i29 = (C1226950i29) abstractC1225780i0G) == null) {
            return null;
        }
        return new C1227010i2F(c1226950i29);
    }
}
