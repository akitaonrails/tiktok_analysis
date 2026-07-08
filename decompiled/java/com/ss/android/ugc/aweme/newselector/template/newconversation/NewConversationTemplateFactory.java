package com.ss.android.ugc.aweme.newselector.template.newconversation;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226980i2C;
import X.C1227040i2I;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class NewConversationTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "NewConversationTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        C1226980i2C c1226980i2C;
        if (!(abstractC1225780i0G instanceof C1226980i2C) || (c1226980i2C = (C1226980i2C) abstractC1225780i0G) == null) {
            return null;
        }
        return new C1227040i2I(c1226980i2C);
    }
}
