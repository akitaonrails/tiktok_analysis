package com.ss.android.ugc.aweme.newselector.template.groupmanage.transferowner;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225460hzk;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class TransferOwnerTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "transfer_group_owner_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1225460hzk c1225460hzk;
        if (!(abstractC1225780i0G instanceof C1225460hzk) || (c1225460hzk = (C1225460hzk) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1225460hzk) { // from class: X.0hze
            public final C1225460hzk LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1224980hyy(this, this.LLJIJIL.LLJJIJIIJIL);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJIJIL);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1225460hzk);
                this.LLJIJIL = c1225460hzk;
            }
        };
    }
}
