package com.ss.android.ugc.aweme.protocol.channel;

import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.protocol.channel.CoinWebReferralChannelShareProtocol;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinWebReferralChannelShareProtocol extends TTShareChannelProtocol {
    public final Context LLILLL;
    public final WebSharePackage LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Drawable DC() {
        if (this.LLILZ == null || !C621180OYa.LIZIZ.LJJJJLI(this.LLILZIL)) {
            return null;
        }
        return C621180OYa.LIZIZ.LJJIJIL(this.LLILLL);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lvf
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
                if (C621180OYa.LIZIZ.LJJJJLI(this.LIZ.LLILZIL)) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                    C1895800zQw.LJIILL();
                }
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                if (C621180OYa.LIZIZ.LJJJJLI(this.LIZ.LLILZIL) && interfaceC1369790lkX.LJJIII()) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                    CoinWebReferralChannelShareProtocol coinWebReferralChannelShareProtocol = this.LIZ;
                    C1895800zQw.LJIIIIZZ(coinWebReferralChannelShareProtocol.LLIZLLLIL, coinWebReferralChannelShareProtocol.LLILZLL, coinWebReferralChannelShareProtocol.LLIZ, interfaceC1369790lkX.key());
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final String jv0() {
        if (this.LLILZ == null || !C621180OYa.LIZIZ.LJJJJLI(this.LLILZIL)) {
            return null;
        }
        C786410Ut5.LJJJI("scenario", "incentive", this.LL.extras);
        C786410Ut5.LJJJI("is_referral", "1", this.LL.extras);
        return C621180OYa.LIZIZ.LJJIFFI();
    }

    public CoinWebReferralChannelShareProtocol(Context context, BaseSharePackage baseSharePackage) {
        WebSharePackage webSharePackage;
        Bundle bundle;
        String string;
        Bundle bundle2;
        String string2;
        Bundle bundle3;
        String string3;
        Bundle bundle4;
        super(baseSharePackage);
        this.LLILLL = context;
        String string4 = null;
        if (baseSharePackage instanceof WebSharePackage) {
            webSharePackage = (WebSharePackage) baseSharePackage;
        } else {
            webSharePackage = null;
        }
        this.LLILZ = webSharePackage;
        if (webSharePackage != null && (bundle4 = webSharePackage.extras) != null) {
            string4 = bundle4.getString("enter_from");
        }
        String str = "";
        this.LLILZIL = string4 == null ? "" : string4;
        this.LLILZLL = (webSharePackage == null || (bundle3 = webSharePackage.extras) == null || (string3 = bundle3.getString("referral_enter_from")) == null) ? "" : string3;
        this.LLIZ = (webSharePackage == null || (bundle2 = webSharePackage.extras) == null || (string2 = bundle2.getString("referral_page_enter_from")) == null) ? "" : string2;
        if (webSharePackage != null && (bundle = webSharePackage.extras) != null && (string = bundle.getString("share_item_id")) != null) {
            str = string;
        }
        this.LLIZLLLIL = str;
    }
}
