package com.ss.android.ugc.aweme.tars.resource;

import X.C1514040pVC;
import X.InterfaceC882520Yji;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.resource.TarsResourceDownloadSpi;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface TarsResourceDownloadSpi {
    public static final C1514040pVC LIZ = new Object() { // from class: X.0pVC
        public static final TarsResourceDownloadSpi LIZIZ = (TarsResourceDownloadSpi) PluggableExtentionKt.pluggableSpi$default(TarsResourceDownloadSpi.class, false, false, false, 14, null);
    };

    void LIZ(String str);

    void LIZIZ(long j, Map map);

    String LIZJ(TarsConfig.ResourceNewConfig resourceNewConfig);

    void LIZLLL(TarsConfig.Engine engine, InterfaceC882520Yji interfaceC882520Yji);
}
