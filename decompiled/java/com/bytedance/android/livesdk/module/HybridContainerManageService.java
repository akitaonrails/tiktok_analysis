package com.bytedance.android.livesdk.module;

import X.C473940IiG;
import X.C520710KbV;
import X.InterfaceC1059280dfi;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class HybridContainerManageService implements IHybridContainerManageService {
    @Override // com.bytedance.android.live.browser.IHybridContainerManageService
    public final void S82(boolean z) {
        for (Map.Entry<String, WeakReference<SparkContext>> entry : C473940IiG.LIZIZ.entrySet()) {
            String key = entry.getKey();
            SparkContext sparkContext = entry.getValue().get();
            if (sparkContext != null && (!z || C520710KbV.LIZ(sparkContext))) {
                InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
                if (interfaceC1059280dfiLJJIJLIJ != null) {
                    interfaceC1059280dfiLJJIJLIJ.close();
                }
                C473940IiG.LIZIZ.remove(key);
            }
        }
        C473940IiG.LIZIZ.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // com.bytedance.android.live.browser.IHybridContainerManageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZP(boolean r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.bytedance.hybrid.spark.SparkContext>> r0 = X.C473940IiG.LIZIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        La:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r2 = r0.get()
            com.bytedance.hybrid.spark.SparkContext r2 = (com.bytedance.hybrid.spark.SparkContext) r2
            if (r2 == 0) goto La
            r1 = -1
            if (r6 == 0) goto L4a
            X.0puk r0 = com.bytedance.hybrid.spark.SparkContext.Companion
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r2.LJJJI(r1)
            boolean r0 = r0 instanceof com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam
            if (r0 == 0) goto La
            boolean r0 = X.C520710KbV.LIZ(r2)
            if (r0 == 0) goto La
        L3b:
            X.0dfi r0 = r2.LJJIJLIJ()
            if (r0 == 0) goto L44
            r0.close()
        L44:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.bytedance.hybrid.spark.SparkContext>> r0 = X.C473940IiG.LIZIZ
            r0.remove(r3)
            goto La
        L4a:
            X.0puk r0 = com.bytedance.hybrid.spark.SparkContext.Companion
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r2.LJJJI(r1)
            boolean r0 = r0 instanceof com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam
            if (r0 == 0) goto La
            goto L3b
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.module.HybridContainerManageService.ZP(boolean):void");
    }
}
