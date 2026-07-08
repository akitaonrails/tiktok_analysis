package com.ss.android.ugc.aweme.services.performance;

import X.C04TD;

/* JADX INFO: loaded from: classes35.dex */
public final class CameraConfigPreloadServiceImpl implements ICameraConfigPreloadService {
    public static ICameraConfigPreloadService createICameraConfigPreloadServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICameraConfigPreloadService.class, z);
        if (objLIZ != null) {
            return (ICameraConfigPreloadService) objLIZ;
        }
        if (C04TD.J4 == null) {
            synchronized (ICameraConfigPreloadService.class) {
                if (C04TD.J4 == null) {
                    C04TD.J4 = new CameraConfigPreloadServiceImpl();
                }
            }
        }
        return C04TD.J4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    @Override // com.ss.android.ugc.aweme.services.performance.ICameraConfigPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void preloadVECameraConfigIfNecessary(android.content.Context r10) {
        /*
            r9 = this;
            X.0nlB r0 = lth.o.LJJ
            X.0LH7 r0 = r0.LJ()
            int r0 = r0.LJFF(r10)
            if (r0 != 0) goto La4
            if (r10 == 0) goto La4
            java.lang.System.currentTimeMillis()
            com.ss.android.vesdk.VEConfigCenter r3 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r2 = "ve_camera_type"
            com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.INTEGER
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.vesdk.VEConfigCenter$ValuePkt r1 = r3.getValue(r2, r1, r0)
            r6 = 8
            r5 = 11
            r4 = 10
            r3 = 1
            r2 = 2
            if (r1 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L77
            com.ss.android.vesdk.VEConfigCenter r8 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r7 = "ve_is_in_camera2_blocklist"
            com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.BOOLEAN
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.ss.android.vesdk.VEConfigCenter$ValuePkt r1 = r8.getValue(r7, r1, r0)
            if (r1 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            r0 = 1
        L71:
            java.lang.Class<X.1BrJ> r1 = X.C2217911BrJ.class
            monitor-enter(r1)
            if (r0 != r2) goto L90
            goto L8c
        L77:
            if (r0 == r2) goto L8a
            switch(r0) {
                case 6: goto L87;
                case 7: goto L84;
                case 8: goto L81;
                case 9: goto L7e;
                default: goto L7c;
            }
        L7c:
            r0 = 2
            goto L71
        L7e:
            r0 = 8
            goto L71
        L81:
            r0 = 11
            goto L71
        L84:
            r0 = 10
            goto L71
        L87:
            r0 = 9
            goto L71
        L8a:
            r0 = 4
            goto L71
        L8c:
            X.C2217911BrJ.LJIIIZ(r10)     // Catch: java.lang.Throwable -> La1
            goto L9f
        L90:
            if (r0 != r3) goto L96
            X.C2217911BrJ.LJIIIIZZ(r10)     // Catch: java.lang.Throwable -> La1
            goto L9f
        L96:
            if (r0 == r4) goto L9c
            if (r0 == r5) goto L9c
            if (r0 != r6) goto L9f
        L9c:
            X.C2217911BrJ.LJIIJ(r0, r10)     // Catch: java.lang.Throwable -> La1
        L9f:
            monitor-exit(r1)
            return
        La1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.performance.CameraConfigPreloadServiceImpl.preloadVECameraConfigIfNecessary(android.content.Context):void");
    }
}
