package com.tiktok.json.gson;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes4.dex */
public class GsonOptUtil {
    public static final Gson sGson = new Gson();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:17:0x0037, B:19:0x0041, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:26:0x0053), top: B:34:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:17:0x0037, B:19:0x0041, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:26:0x0053), top: B:34:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toJsonWithElementSize(com.google.gson.k r7, X.C08JU r8, int r9) throws java.lang.Throwable {
        /*
            r5 = 0
            X.08JU r0 = X.C08JU.OPT_BUILDER     // Catch: java.lang.Throwable -> L50
            if (r8 != r0) goto Lc
            X.08JZ r4 = new X.08JZ     // Catch: java.lang.Throwable -> L50
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L50
            goto L2d
        Lc:
            X.08JU r0 = X.C08JU.CHAR_ARRAY     // Catch: java.lang.Throwable -> L50
            if (r8 != r0) goto L16
            X.08JW r4 = new X.08JW     // Catch: java.lang.Throwable -> L50
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L50
            goto L2d
        L16:
            X.08JU r0 = X.C08JU.OPT_NATIVE     // Catch: java.lang.Throwable -> L50
            if (r8 != r0) goto L28
            long r2 = X.C08JY.LIZ(r9)     // Catch: java.lang.Throwable -> L50
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L30
            X.08JZ r4 = new X.08JZ     // Catch: java.lang.Throwable -> L57
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L57
            goto L37
        L28:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L50
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L50
        L2d:
            r2 = 0
            goto L37
        L30:
            X.08JX r4 = new X.08JX     // Catch: java.lang.Throwable -> L57
            r0 = 2048(0x800, float:2.87E-42)
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L57
        L37:
            com.google.gson.Gson r0 = com.tiktok.json.gson.GsonOptUtil.sGson     // Catch: java.lang.Throwable -> L57
            r0.LJIJ(r7, r4)     // Catch: java.lang.Throwable -> L57
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L46
        L41:
            java.lang.String r0 = com.tiktok.json.gson.cpp.GsonNative.readString(r2)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L46:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L57
        L4a:
            if (r1 == 0) goto L4f
            X.C08JY.LIZJ(r2)
        L4f:
            return r0
        L50:
            r1 = move-exception
            r2 = 0
        L53:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r1 = move-exception
            goto L53
        L59:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L60
            X.C08JY.LIZJ(r2)
        L60:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.json.gson.GsonOptUtil.toJsonWithElementSize(com.google.gson.k, X.08JU, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x0037, B:19:0x003e, B:23:0x0050, B:24:0x0055, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:30:0x0062), top: B:37:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x0037, B:19:0x003e, B:23:0x0050, B:24:0x0055, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:30:0x0062), top: B:37:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x0037, B:19:0x003e, B:23:0x0050, B:24:0x0055, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:30:0x0062), top: B:37:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x0037, B:19:0x003e, B:23:0x0050, B:24:0x0055, B:20:0x0046, B:13:0x0022, B:16:0x0030, B:30:0x0062), top: B:37:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toJsonWithSize(java.lang.Object r7, X.C08JU r8, int r9) throws java.lang.Throwable {
        /*
            r5 = 0
            X.08JU r0 = X.C08JU.OPT_BUILDER     // Catch: java.lang.Throwable -> L5f
            if (r8 != r0) goto Lc
            X.08JZ r4 = new X.08JZ     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            goto L2d
        Lc:
            X.08JU r0 = X.C08JU.CHAR_ARRAY     // Catch: java.lang.Throwable -> L5f
            if (r8 != r0) goto L16
            X.08JW r4 = new X.08JW     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            goto L2d
        L16:
            X.08JU r0 = X.C08JU.OPT_NATIVE     // Catch: java.lang.Throwable -> L5f
            if (r8 != r0) goto L28
            long r2 = X.C08JY.LIZ(r9)     // Catch: java.lang.Throwable -> L5f
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L30
            X.08JZ r4 = new X.08JZ     // Catch: java.lang.Throwable -> L66
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L66
            goto L37
        L28:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L5f
        L2d:
            r2 = 0
            goto L37
        L30:
            X.08JX r4 = new X.08JX     // Catch: java.lang.Throwable -> L66
            r0 = 2048(0x800, float:2.87E-42)
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L66
        L37:
            com.google.gson.Gson r1 = com.tiktok.json.gson.GsonOptUtil.sGson     // Catch: java.lang.Throwable -> L66
            r1.getClass()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L46
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L66
            r1.LJIJJ(r7, r0, r4)     // Catch: java.lang.Throwable -> L66
            goto L4b
        L46:
            com.google.gson.m r0 = com.google.gson.m.LL     // Catch: java.lang.Throwable -> L66
            r1.LJIJ(r0, r4)     // Catch: java.lang.Throwable -> L66
        L4b:
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
        L50:
            java.lang.String r0 = com.tiktok.json.gson.cpp.GsonNative.readString(r2)     // Catch: java.lang.Throwable -> L66
            goto L59
        L55:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L66
        L59:
            if (r1 == 0) goto L5e
            X.C08JY.LIZJ(r2)
        L5e:
            return r0
        L5f:
            r1 = move-exception
            r2 = 0
        L62:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r1 = move-exception
            goto L62
        L68:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L6f
            X.C08JY.LIZJ(r2)
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.json.gson.GsonOptUtil.toJsonWithSize(java.lang.Object, X.08JU, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: IOException -> 0x0056, all -> 0x0068, TryCatch #0 {IOException -> 0x0056, blocks: (B:17:0x0037, B:19:0x0047, B:20:0x004c, B:13:0x0022, B:16:0x0030), top: B:37:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[Catch: IOException -> 0x0056, all -> 0x0068, TryCatch #0 {IOException -> 0x0056, blocks: (B:17:0x0037, B:19:0x0047, B:20:0x004c, B:13:0x0022, B:16:0x0030), top: B:37:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toStringWithSize(com.google.gson.k r7, X.C08JU r8, int r9) {
        /*
            r5 = 0
            X.08JU r0 = X.C08JU.OPT_BUILDER     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            if (r8 != r0) goto Lc
            X.08JZ r4 = new X.08JZ     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            goto L2d
        Lc:
            X.08JU r0 = X.C08JU.CHAR_ARRAY     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            if (r8 != r0) goto L16
            X.08JW r4 = new X.08JW     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            goto L2d
        L16:
            X.08JU r0 = X.C08JU.OPT_NATIVE     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            if (r8 != r0) goto L28
            long r1 = X.C08JY.LIZ(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L30
            X.08JZ r4 = new X.08JZ     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            r4.<init>(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            goto L37
        L28:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
        L2d:
            r1 = 0
            goto L37
        L30:
            X.08JX r4 = new X.08JX     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            r0 = 2048(0x800, float:2.87E-42)
            r4.<init>(r1, r0)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
        L37:
            X.09DL r3 = new X.09DL     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            r3.<init>(r4)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            r0 = 1
            r3.LLILZLL = r0     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            com.google.gson.internal.w.LIZIZ(r7, r3)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L4c
        L47:
            java.lang.String r0 = com.tiktok.json.gson.cpp.GsonNative.readString(r1)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
            goto L50
        L4c:
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L68
        L50:
            if (r3 == 0) goto L55
            X.C08JY.LIZJ(r1)
        L55:
            return r0
        L56:
            r3 = move-exception
            goto L5f
        L58:
            r3 = move-exception
            r1 = 0
            goto L69
        L5c:
            r3 = move-exception
            r1 = 0
        L5f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L68
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r3 = move-exception
        L69:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L68
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L73
            X.C08JY.LIZJ(r1)
        L73:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.json.gson.GsonOptUtil.toStringWithSize(com.google.gson.k, X.08JU, int):java.lang.String");
    }
}
