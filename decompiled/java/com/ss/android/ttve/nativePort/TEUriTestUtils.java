package com.ss.android.ttve.nativePort;

/* JADX INFO: loaded from: classes4.dex */
public class TEUriTestUtils {
    public static native int checkVideo(String str);

    public static native int decodeImageFile(String str);

    public static native int getColorGamut(String str);

    public static native int getImageInfo(String str);

    public static native boolean isFileExistCompat(String str);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3 == null) goto L53;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0082: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:33554562), block:B:55:0x0082 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r7)
            r5 = -1
            r4 = 0
            if (r0 != 0) goto L13
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch: java.io.IOException -> Le
            r3.<init>(r7)     // Catch: java.io.IOException -> Le
            goto L45
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        L13:
            if (r6 != 0) goto L1d
            java.lang.String r1 = "TEUriTestUtils"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.C2484209oO.LIZJ(r1, r0)
            return r5
        L1d:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = X.C09NT.LIZLLL(r6, r1, r0)     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L71 java.lang.Throwable -> L87
            if (r2 != 0) goto L2a
            return r5
        L2a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L65 java.io.FileNotFoundException -> L67 java.lang.Throwable -> L81
            r0 = 24
            if (r1 < r0) goto L3a
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch: java.io.IOException -> L65 java.io.FileNotFoundException -> L67 java.lang.Throwable -> L81
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.io.IOException -> L65 java.io.FileNotFoundException -> L67 java.lang.Throwable -> L81
            r3.<init>(r0)     // Catch: java.io.IOException -> L65 java.io.FileNotFoundException -> L67 java.lang.Throwable -> L81
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L43
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L43:
            if (r3 == 0) goto L80
        L45:
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKcpY6ijp4THEeUSrkZ0cDL+sqqTSyfjwOqZ6tRNH3"
            r1.<init>(r0, r4)
            r2 = 0
            int r1 = X.C2204961BRm.LJLILLLLZI(r3, r2, r1)
            r0 = 3
            if (r1 == r0) goto L62
            r0 = 6
            if (r1 == r0) goto L5f
            r0 = 8
            if (r1 == r0) goto L5c
            return r2
        L5c:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L5f:
            r0 = 90
            return r0
        L62:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r0 = move-exception
            goto L73
        L69:
            r0 = move-exception
            r2 = r4
        L6b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L80
            goto L78
        L71:
            r0 = move-exception
            r2 = r4
        L73:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L80
        L78:
            r2.close()     // Catch: java.io.IOException -> L7c
            return r5
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            return r5
        L81:
            r1 = move-exception
            r4 = r2
        L83:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r1 = move-exception
            goto L83
        L89:
            if (r4 == 0) goto L93
            r4.close()     // Catch: java.io.IOException -> L8f
            throw r1
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L93:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEUriTestUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }
}
