package com.ss.android.ugc.aweme.selector.creategroup;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226970i2B;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveCreateGroupTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_end_live_create_group_chat";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1226970i2B c1226970i2B;
        if (!(abstractC1225780i0G instanceof C1226970i2B) || (c1226970i2B = (C1226970i2B) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1226970i2B) { // from class: X.0i2c
            public final C1226970i2B LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1227560i38(this, this.LLJIJIL.LLJJJJJIL);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJJJLIIL);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1226970i2B);
                this.LLJIJIL = c1226970i2B;
            }
        };
    }
}
