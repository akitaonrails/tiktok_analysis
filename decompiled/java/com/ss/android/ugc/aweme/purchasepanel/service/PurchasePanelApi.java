package com.ss.android.ugc.aweme.purchasepanel.service;

import X.C058U;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasePanelApi {
    public static final C058U LIZ = new C058U();
    public static final String LIZIZ;
    public static final LruCache<String, PurchasePanelResponse> LIZJ;

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi$PurchasePanelApi, reason: collision with other inner class name */
    public interface InterfaceC0018PurchasePanelApi {
        @InterfaceC1501160pAQ("/tiktok/v1/pgc/marketplace/purchase_panel")
        Object getPurchasePanel(@InterfaceC1501070pAH("spu_id") String str, @InterfaceC1501070pAH("iap_country") String str2, InterfaceC1364105Vn<? super PurchasePanelResponse> interfaceC1364105Vn);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = new LruCache<>(3);
    }
}
