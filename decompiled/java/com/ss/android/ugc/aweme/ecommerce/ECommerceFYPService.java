package com.ss.android.ugc.aweme.ecommerce;

import X.C06KX;
import X.C0C64;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.banner.EcIdVerifyBottomBannerProtocol;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonTrigger;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class ECommerceFYPService implements IECommerceFYPService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService
    public final C06KX LIZIZ() {
        return new EcIdVerifyBottomBannerProtocol(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService
    public final PriorityProtocol LIZ() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_show_add_product_bottom_button", true, false)) {
            return new EcProductAddButtonTrigger();
        }
        return null;
    }
}
