package com.bytedance.realx.base;

/* JADX INFO: loaded from: classes21.dex */
public class GPUUtil {
    public static String glRenderer = "unknown";
    public static String glVendor = "unknown";
    public static boolean initialized;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Initialize() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.GPUUtil.Initialize():void");
    }

    public static String getGPURenderer() throws Throwable {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    public static String getGPURendererFallback() {
        return glRenderer;
    }
}
