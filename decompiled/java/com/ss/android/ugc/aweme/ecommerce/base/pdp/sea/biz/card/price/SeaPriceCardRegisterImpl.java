package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price;

import X.AbstractC1764430w13;
import X.C1764380w0y;
import X.C1764420w12;
import X.C1765110w29;
import X.InterfaceC665370Q7z;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPriceCardRegisterImpl implements ICardRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.ICardRegisterService
    public final C1765110w29 LIZ(final InterfaceC665370Q7z interfaceC665370Q7z) {
        return new C1765110w29("pdp_sea_lockup_v2_price_style_1", new AbstractC1764430w13<SeaPriceBffVO, C1764380w0y, C1764420w12>(interfaceC665370Q7z) { // from class: X.0w15
            @Override // X.AbstractC1764430w13
            public final AbsCardVH LIZIZ(ViewGroup viewGroup) {
                return new SeaPriceBffVH(viewGroup);
            }

            @Override // X.AbstractC1764430w13
            public final C1764410w11 LIZ(InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, C04FN c04fn) {
                return new C1764410w11<SeaPriceBffVO>(interfaceC665370Q7z2, (SeaPriceBffVO) abstractC1066304Ez, c04fn) { // from class: X.0w12
                    public boolean LLJIJIL;
                    public String LLJILJIL = "";

                    @Override // X.AbstractC1764440w14
                    public final void LJII() {
                        PageStateContext pageStateContext = (PageStateContext) this.LLIZ.getValue();
                        Object objLIZ = pageStateContext != null ? PageStateContext.LIZ(pageStateContext, "sku_id") : null;
                        if (!(objLIZ instanceof String)) {
                            objLIZ = null;
                        }
                        String str = ((SeaPriceBffVO) this.LLILZ).skuId;
                        String str2 = (str == null || !a0.LJJJIL(str)) ? ((SeaPriceBffVO) this.LLILZ).skuId : null;
                        if (!Intrinsics.LJFF(str2, objLIZ) || Intrinsics.LJFF(str2, this.LLJILJIL)) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!this.LLJIJIL) {
                            linkedHashMap.put("rd_module_first_show", 1);
                        }
                        if (LJIIIIZZ("module_show", null, null, linkedHashMap)) {
                            this.LLJIJIL = true;
                            String str3 = ((SeaPriceBffVO) this.LLILZ).skuId;
                            this.LLJILJIL = (str3 == null || !a0.LJJJIL(str3)) ? ((SeaPriceBffVO) this.LLILZ).skuId : null;
                        }
                    }
                };
            }

            @Override // X.AbstractC1764430w13
            public final AbstractC1764350w0v LIZJ(InterfaceC665370Q7z interfaceC665370Q7z2, AbstractC1066304Ez abstractC1066304Ez, C04FN c04fn) {
                return new C1764380w0y(interfaceC665370Q7z2, (SeaPriceBffVO) abstractC1066304Ez, c04fn);
            }
        });
    }
}
