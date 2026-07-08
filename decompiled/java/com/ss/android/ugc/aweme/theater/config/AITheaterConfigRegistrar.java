package com.ss.android.ugc.aweme.theater.config;

import com.ss.android.ugc.aweme.aikit.api.config.IAIGCConfigDfAiTheaterRegistrar;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterConfigRegistrar implements IAIGCConfigDfAiTheaterRegistrar {
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    @Override // X.InterfaceC547540Ldg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C547360LdO r5) {
        /*
            r4 = this;
            X.0LOV r0 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService r0 = X.C0LOV.LIZ()
            if (r0 == 0) goto L8e
            boolean r0 = r0.LIZ()
            r3 = 1
            if (r0 != r3) goto L8e
        L12:
            X.0Ld2 r2 = X.C537540L6i.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "register: pluginInstalled="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AITheaterConfigRegistrar"
            r2.LIZ(r0, r1)
            if (r3 == 0) goto L8d
            com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService r1 = X.C547360LdO.LIZJ()
            java.util.Map<com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam> r0 = X.C547550Ldh.LIZ
            r1.LJI(r0)
            com.ss.android.ugc.aweme.aikit.api.common.AIConfigService r1 = X.C547360LdO.LIZIZ()
            X.0LbZ r0 = X.C546110LbN.LIZ
            r1.LIZIZ(r0)
            com.ss.android.ugc.aweme.aikit.api.common.AIResourceService r2 = X.C547360LdO.LIZLLL()
            X.0LOK r1 = X.C0LOK.LIZ
            X.01GW r0 = X.C00J0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r2.LJFF(r1, r0)
            java.util.concurrent.CopyOnWriteArrayList<X.0Ldd> r0 = X.C547450LdX.LIZ
            X.0LdW r1 = new X.InterfaceC547510Ldd() { // from class: X.0LdW
                static {
                    /*
                        X.0LdW r0 = new X.0LdW
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0LdW) X.0LdW.LIZ X.0LdW
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547440LdW.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547440LdW.<init>():void");
                }

                @Override // X.InterfaceC547510Ldd
                public final java.lang.String LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r2) {
                    /*
                        r1 = this;
                        com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r2.aigcBusinessModel
                        com.ss.android.ugc.aweme.theater.model.AITheaterModel r0 = r0.aiTheaterModel
                        if (r0 == 0) goto L9
                        java.lang.String r0 = "ai_theater"
                        return r0
                    L9:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547440LdW.LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel):java.lang.String");
                }
            }
            java.util.concurrent.CopyOnWriteArrayList<X.0Ldd> r0 = X.C547450LdX.LIZ
            r0.add(r1)
            java.util.concurrent.CopyOnWriteArrayList<X.0LdS> r0 = X.C547460LdY.LIZ
            X.0Lcb r1 = new X.InterfaceC547400LdS() { // from class: X.0Lcb
                static {
                    /*
                        X.0Lcb r0 = new X.0Lcb
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Lcb) X.0Lcb.LIZ X.0Lcb
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C546870Lcb.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C546870Lcb.<init>():void");
                }

                @Override // X.InterfaceC547400LdS
                public final java.util.Map<java.lang.String, java.lang.Object> LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r6.aigcBusinessModel
                        com.ss.android.ugc.aweme.theater.model.AITheaterModel r4 = r0.aiTheaterModel
                        if (r4 != 0) goto Lb
                        java.util.Map r0 = X.C2097608Jq.LJ()
                        return r0
                    Lb:
                        com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r4.getCreationModel()
                        com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel r3 = r0.generationModel
                        X.13DA r2 = new X.13DA
                        r2.<init>()
                        java.lang.String r1 = r3.getClientTaskId()
                        if (r1 == 0) goto L27
                        int r0 = r1.length()
                        if (r0 <= 0) goto L27
                        java.lang.String r0 = "client_task_id"
                        r2.put(r0, r1)
                    L27:
                        java.lang.String r1 = r3.getServerTaskId()
                        if (r1 == 0) goto L38
                        int r0 = r1.length()
                        if (r0 <= 0) goto L38
                        java.lang.String r0 = "server_task_id"
                        r2.put(r0, r1)
                    L38:
                        com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r4.getCreationModel()
                        com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel r0 = r0.sessionModel
                        java.lang.String r1 = r0.traceId
                        int r0 = r1.length()
                        if (r0 <= 0) goto L4b
                        java.lang.String r0 = "trace_id"
                        r2.put(r0, r1)
                    L4b:
                        com.ss.android.ugc.aweme.creative.model.common.UsageStatus r0 = r3.getStatus()
                        if (r0 == 0) goto L5a
                        java.lang.String r1 = "aigc_status"
                        java.lang.String r0 = r0.toString()
                        r2.put(r1, r0)
                    L5a:
                        java.util.Map r0 = r2.build()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C546870Lcb.LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel):java.util.Map");
                }
            }
            java.util.concurrent.CopyOnWriteArrayList<X.0LdS> r0 = X.C547460LdY.LIZ
            r0.add(r1)
            java.util.concurrent.CopyOnWriteArrayList<X.0Lde> r0 = X.C547480Lda.LIZ
            X.0LdQ r1 = new X.InterfaceC547520Lde() { // from class: X.0LdQ
                static {
                    /*
                        X.0LdQ r0 = new X.0LdQ
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0LdQ) X.0LdQ.LIZ X.0LdQ
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547380LdQ.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547380LdQ.<init>():void");
                }

                @Override // X.InterfaceC547520Lde
                public final java.lang.String LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r4) {
                    /*
                        r3 = this;
                        com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r4.aigcBusinessModel
                        com.ss.android.ugc.aweme.theater.model.AITheaterModel r0 = r0.aiTheaterModel
                        r2 = 0
                        if (r0 == 0) goto L18
                        com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r0.getCreationModel()
                        com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel r0 = r0.sessionModel
                        java.lang.String r1 = r0.traceId
                        if (r1 == 0) goto L18
                        int r0 = r1.length()
                        if (r0 <= 0) goto L18
                        return r1
                    L18:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547380LdQ.LIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel):java.lang.String");
                }
            }
            java.util.concurrent.CopyOnWriteArrayList<X.0Lde> r0 = X.C547480Lda.LIZ
            r0.add(r1)
            X.0LTe r1 = X.EnumC543480LTe.SAVE
            X.07zh r0 = X.EnumC548240Leo.getEntries()
            X.C547410LdT.LIZIZ(r1, r0)
            X.0LTe r1 = X.EnumC543480LTe.RESTORE
            X.07zh r0 = X.EnumC546550Lc5.getEntries()
            X.C547410LdT.LIZIZ(r1, r0)
            X.0LTe r1 = X.EnumC543480LTe.RECONCILE
            X.07zh r0 = X.C0LQ4.getEntries()
            X.C547410LdT.LIZIZ(r1, r0)
            X.0LdT r1 = X.C547410LdT.LIZ
            X.0Ldb r0 = new X.InterfaceC547470LdZ() { // from class: X.0Ldb
                static {
                    /*
                        X.0Ldb r0 = new X.0Ldb
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Ldb) X.0Ldb.LIZIZ X.0Ldb
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547490Ldb.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547490Ldb.<init>():void");
                }

                @Override // X.InterfaceC547470LdZ
                public final void LIZ(java.lang.String r3) {
                    /*
                        r2 = this;
                        X.0Ld2 r1 = X.C537540L6i.LIZ
                        java.lang.String r0 = "draft_pipeline"
                        r1.LIZJ(r0, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C547490Ldb.LIZ(java.lang.String):void");
                }
            }
            r1.getClass()
            X.C547410LdT.LIZJ = r0
        L8d:
            return
        L8e:
            r3 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.config.AITheaterConfigRegistrar.LIZ(X.0LdO):void");
    }
}
