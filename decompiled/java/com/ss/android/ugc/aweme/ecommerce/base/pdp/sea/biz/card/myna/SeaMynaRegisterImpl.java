package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna;

import X.AbstractC1764430w13;
import X.C04DH;
import X.C1764370w0x;
import X.C1764490w19;
import X.C1765110w29;
import X.InterfaceC665370Q7z;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.myna.SeaPdpBodyMynaVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaMynaRegisterImpl implements ICardRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService
    public final C1765110w29 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z) {
        return new C1765110w29("sea_pdp_list_body_myna", new AbstractC1764430w13<C04DH, C1764370w0x, C1764490w19>(interfaceC665370Q7z) { // from class: X.0w16
            @Override // X.AbstractC1764430w13
            public final AbsCardVH LIZIZ(ViewGroup viewGroup) {
                return new SeaPdpBodyMynaVH(viewGroup);
            }

            @Override // X.AbstractC1764430w13
            public final C1764410w11 LIZ(InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, C04FN c04fn) {
                return new C1764490w19(interfaceC665370Q7z2, (C04DH) abstractC1066304Ez, c04fn);
            }

            @Override // X.AbstractC1764430w13
            public final AbstractC1764350w0v LIZJ(InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, C04FN c04fn) {
                return new C1764370w0x(interfaceC665370Q7z2, (C04DH) abstractC1066304Ez, c04fn);
            }
        });
    }
}
