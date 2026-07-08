package com.ss.android.ugc.aweme.newselector.template.groupmanage.setadmin;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225450hzj;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class SetAdminTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "SetAdminTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1225450hzj c1225450hzj;
        if (!(abstractC1225780i0G instanceof C1225450hzj) || (c1225450hzj = (C1225450hzj) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1225450hzj) { // from class: X.0hzf
            public final C1225450hzj LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1225080hz8(this, this.LLJIJIL.LLJILLL);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224330hxv LJJJJJL() {
                final C1224340hxw c1224340hxw = this.LLJIJIL.LLJIJIL;
                return new C1225800i0I(this, c1224340hxw) { // from class: X.0i0K
                    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
                    public final void LJI(C1224840hyk c1224840hyk) {
                        super.LJI(c1224840hyk);
                        if (c1224840hyk.LLJILJILJ && !c1224840hyk.LLJILJIL) {
                            AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
                            C1226680i1i.LIZLLL(abstractC1225770i0F, abstractC1225770i0F.LJJJJLL().LIZIZ().getString(2131830134));
                        }
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJ);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1225450hzj);
                this.LLJIJIL = c1225450hzj;
            }
        };
    }
}
