package com.ss.android.ugc.aweme.newselector.template.groupmanage.removemember;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225440hzi;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class RemoveMemberTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "RemoveMemberTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1225440hzi c1225440hzi;
        if (!(abstractC1225780i0G instanceof C1225440hzi) || (c1225440hzi = (C1225440hzi) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1225440hzi) { // from class: X.0hzd
            public final C1225440hzi LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1225010hz1(this.LLJIJIL.LLJJIII, this);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJIJI);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1225440hzi);
                this.LLJIJIL = c1225440hzi;
            }
        };
    }
}
