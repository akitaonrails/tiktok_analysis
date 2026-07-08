package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.AbstractC1764430w13;
import X.C1765060w24;
import X.C1765080w26;
import X.C1765110w29;
import X.InterfaceC665370Q7z;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer.SeaPdpRichTextContainerBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer.SeaPdpRichTextContainerBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpRichTextContainerCardRegisterImpl implements ICardRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService
    public final C1765110w29 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z) {
        return new C1765110w29("pdp_sea_rich_text_style_1", new AbstractC1764430w13<SeaPdpRichTextContainerBffVO, C1765060w24, C1765080w26>(interfaceC665370Q7z) { // from class: X.0w21
            @Override // X.AbstractC1764430w13
            public final AbsCardVH LIZIZ(ViewGroup viewGroup) {
                return new SeaPdpRichTextContainerBffVH(viewGroup);
            }

            @Override // X.AbstractC1764430w13
            public final C1764410w11 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, final C04FN c04fn) {
                final SeaPdpRichTextContainerBffVO seaPdpRichTextContainerBffVO = (SeaPdpRichTextContainerBffVO) abstractC1066304Ez;
                return new C1764410w11<SeaPdpRichTextContainerBffVO>(interfaceC665370Q7z2, seaPdpRichTextContainerBffVO, c04fn) { // from class: X.0w26
                };
            }

            @Override // X.AbstractC1764430w13
            public final AbstractC1764350w0v LIZJ(final InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, final C04FN c04fn) {
                final SeaPdpRichTextContainerBffVO seaPdpRichTextContainerBffVO = (SeaPdpRichTextContainerBffVO) abstractC1066304Ez;
                return new AbstractC1764350w0v<SeaPdpRichTextContainerBffVO, C1765080w26>(interfaceC665370Q7z2, seaPdpRichTextContainerBffVO, c04fn) { // from class: X.0w24
                };
            }
        });
    }
}
