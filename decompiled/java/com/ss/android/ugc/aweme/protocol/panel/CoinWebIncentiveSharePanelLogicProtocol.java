package com.ss.android.ugc.aweme.protocol.panel;

import X.C1377280lwc;
import X.InterfaceC1366490lfD;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.protocol.panel.CoinWebIncentiveSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinWebIncentiveSharePanelLogicProtocol extends TTSharePanelLogicProtocol {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1377280lwc LLILZLL;

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        return this.LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0lwc] */
    public CoinWebIncentiveSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        Bundle bundle;
        String string;
        Bundle bundle2;
        String string2;
        Bundle bundle3;
        String string3;
        Bundle bundle4;
        super(baseSharePackage);
        String string4 = null;
        if (baseSharePackage instanceof WebSharePackage) {
            if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null) {
                string4 = bundle4.getString("enter_from");
            }
        } else {
            baseSharePackage = null;
        }
        String str = "";
        this.LLILLJJLI = string4 == null ? "" : string4;
        this.LLILLL = (baseSharePackage == null || (bundle3 = baseSharePackage.extras) == null || (string3 = bundle3.getString("referral_enter_from")) == null) ? "" : string3;
        this.LLILZ = (baseSharePackage == null || (bundle2 = baseSharePackage.extras) == null || (string2 = bundle2.getString("referral_page_enter_from")) == null) ? "" : string2;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("share_item_id")) != null) {
            str = string;
        }
        this.LLILZIL = str;
        this.LLILZLL = new InterfaceC1366490lfD() { // from class: X.0lwc
            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage2, InterfaceC1370310llN interfaceC1370310llN) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage2) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage2) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage2, List list) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                if (C621180OYa.LIZIZ.LJJJJLI(this.LIZ.LLILLJJLI)) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                    CoinWebIncentiveSharePanelLogicProtocol coinWebIncentiveSharePanelLogicProtocol = this.LIZ;
                    C1895800zQw.LJIIIZ(coinWebIncentiveSharePanelLogicProtocol.LLILZIL, coinWebIncentiveSharePanelLogicProtocol.LLILLL, coinWebIncentiveSharePanelLogicProtocol.LLILZ);
                }
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C099R.LJFF();
                return unit;
            }
        };
    }
}
