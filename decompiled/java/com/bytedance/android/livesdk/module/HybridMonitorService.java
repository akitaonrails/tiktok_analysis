package com.bytedance.android.livesdk.module;

import X.C1107610evf;
import X.C505501y1;
import com.bytedance.android.live.browser.IHybridMonitorService;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class HybridMonitorService implements IHybridMonitorService {
    @Override // com.bytedance.android.live.browser.IHybridMonitorService
    public final void Ig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("open_count", Integer.valueOf(C1107610evf.LIZIZ));
        linkedHashMap.put("max_instance_count", Integer.valueOf(C1107610evf.LIZJ));
        C505501y1.LIZ("spark_hybrid_container_info", new LinkedHashMap(), linkedHashMap);
        C1107610evf.LIZ = 0;
        C1107610evf.LIZIZ = 0;
    }

    @Override // com.bytedance.android.live.browser.IHybridMonitorService
    public final void iC2() {
        C1107610evf.LIZ();
    }
}
