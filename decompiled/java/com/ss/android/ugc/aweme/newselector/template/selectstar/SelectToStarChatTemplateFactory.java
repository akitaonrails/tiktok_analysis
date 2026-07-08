package com.ss.android.ugc.aweme.newselector.template.selectstar;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226190i0v;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectToStarChatTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "select_to_star_chat_page_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1226190i0v c1226190i0v;
        if (!(abstractC1225780i0G instanceof C1226190i0v) || (c1226190i0v = (C1226190i0v) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1226190i0v) { // from class: X.0i0x
            public final C1226190i0v LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1226310i17(this, this.LLJIJIL.LLJJ);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJI);
            }

            @Override // X.AbstractC1225770i0F
            public final C1224950hyv LJJJJLI() {
                return new C1225250hzP(this, this.LLJIJIL.LLJILJILJ.LIZIZ);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1226190i0v);
                this.LLJIJIL = c1226190i0v;
            }
        };
    }
}
