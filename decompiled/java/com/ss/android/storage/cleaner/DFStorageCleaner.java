package com.ss.android.storage.cleaner;

import X.C0VSJ;
import X.C13VI;
import X.C1BLW;
import X.C844470XAv;
import X.EnumC1335420kr6;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class DFStorageCleaner extends C13VI {
    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        C844470XAv.LIZ.getClass();
        return new C0VSJ(C844470XAv.LIZ().getApplicationInfo().nativeLibraryDir);
    }

    @Override // X.C13VI
    public final long LJIILIIL() {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.benchmark");
        }
        IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService2 != null && iPluginService2.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.df_ccdc_impl_ocr");
        }
        IPluginService iPluginService3 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService3 != null && iPluginService3.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.cast");
        }
        IPluginService iPluginService4 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService4 != null && iPluginService4.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.i18n.cmaf");
        }
        IPluginService iPluginService5 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService5 != null && iPluginService5.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.dflivep2p");
        }
        IPluginService iPluginService6 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService6 != null && iPluginService6.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.i18n.quic");
        }
        IPluginService iPluginService7 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService7 != null && iPluginService7.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.dflivertmglobal");
        }
        IPluginService iPluginService8 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService8 != null && iPluginService8.LIZLLL() != null) {
            C1BLW.LIZ("com.ss.android.ugc.aweme.pitaya");
        }
        IPluginService iPluginService9 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService9 != null && iPluginService9.LIZLLL() != null) {
            C1BLW.LIZ("com.bytedance.tiktok.ship");
        }
        IPluginService iPluginService10 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService10 != null && iPluginService10.LIZLLL() != null) {
            C1BLW.LIZ("com.bytedance.tiktok.vmsdk");
        }
        IPluginService iPluginService11 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService11 == null || iPluginService11.LIZLLL() == null) {
            return 0L;
        }
        C1BLW.LIZ("com.ss.android.ugc.aweme.df_ttwebview");
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }
}
