package com.ss.android.ugc.aweme.miniapp.impl;

import X.C01GW;
import X.C04TD;
import X.C452501pT;
import X.C844470XAv;
import X.InterfaceC1030600cvS;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniAppDependServiceImpl implements IMiniAppDependService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(205));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(204));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(202));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(200));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(207));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(203));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(201));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(206));

    public static IMiniAppDependService LIZ() {
        Object objLIZ = C04TD.LIZ(IMiniAppDependService.class, false);
        if (objLIZ != null) {
            return (IMiniAppDependService) objLIZ;
        }
        if (C04TD.k2 == null) {
            synchronized (IMiniAppDependService.class) {
                if (C04TD.k2 == null) {
                    C04TD.k2 = new MiniAppDependServiceImpl();
                }
            }
        }
        return C04TD.k2;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService
    public final InterfaceC1030600cvS LJJII() {
        return (InterfaceC1030600cvS) this.LIZJ.getValue();
    }

    public MiniAppDependServiceImpl() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            if (i18nManagerServiceApiLIZ.LJIJJLI(C844470XAv.LIZ()) != null) {
                return;
            }
        }
        Locale.getDefault();
    }
}
