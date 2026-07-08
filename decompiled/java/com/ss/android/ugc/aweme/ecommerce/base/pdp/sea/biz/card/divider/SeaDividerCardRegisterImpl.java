package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.divider;

import X.AbstractC1764430w13;
import X.C1765070w25;
import X.C1765090w27;
import X.C1765110w29;
import X.InterfaceC665370Q7z;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.divider.SeaDividerBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.divider.SeaDividerBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaDividerCardRegisterImpl implements ICardRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService
    public final C1765110w29 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z) {
        return new C1765110w29("pdp_sea_divider_style_1", new AbstractC1764430w13<SeaDividerBffVO, C1765070w25, C1765090w27>(interfaceC665370Q7z) { // from class: X.0w22
            @Override // X.AbstractC1764430w13
            public final AbsCardVH LIZIZ(ViewGroup viewGroup) {
                return new SeaDividerBffVH(viewGroup);
            }

            @Override // X.AbstractC1764430w13
            public final C1764410w11 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, final C04FN c04fn) {
                final SeaDividerBffVO seaDividerBffVO = (SeaDividerBffVO) abstractC1066304Ez;
                return new C1764410w11<SeaDividerBffVO>(interfaceC665370Q7z2, seaDividerBffVO, c04fn) { // from class: X.0w27
                };
            }

            @Override // X.AbstractC1764430w13
            public final AbstractC1764350w0v LIZJ(final InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, final C04FN c04fn) {
                final SeaDividerBffVO seaDividerBffVO = (SeaDividerBffVO) abstractC1066304Ez;
                return new AbstractC1764350w0v<SeaDividerBffVO, C1765090w27>(interfaceC665370Q7z2, seaDividerBffVO, c04fn) { // from class: X.0w25
                };
            }
        });
    }
}
