package com.ss.android.ugc.aweme.newselector.template.addmember;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226990i2D;
import X.C1227020i2G;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class AddMemberTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "AddMemberTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        C1226990i2D c1226990i2D;
        if (!(abstractC1225780i0G instanceof C1226990i2D) || (c1226990i2D = (C1226990i2D) abstractC1225780i0G) == null) {
            return null;
        }
        return new C1227020i2G(c1226990i2D);
    }
}
