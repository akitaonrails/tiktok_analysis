package com.bytedance.vmsdk.jsbridge;

import X.C1531570pxT;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class JSModuleManager {
    public final ConcurrentHashMap<String, C1531570pxT> LIZ = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, JSModuleWrapper> LIZIZ;
    public Context LIZJ;

    public void destroy() {
        this.LIZJ = null;
        ConcurrentHashMap<String, JSModuleWrapper> concurrentHashMap = this.LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.LIZIZ = null;
        }
        this.LIZ.clear();
    }

    public JSModuleManager(Context context) {
        this.LIZJ = context;
    }

    private JSModuleWrapper moduleWrapperForName(String str) {
        return LIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.vmsdk.jsbridge.JSModuleWrapper LIZ(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.vmsdk.jsbridge.JSModuleManager.LIZ(java.lang.String):com.bytedance.vmsdk.jsbridge.JSModuleWrapper");
    }

    public final void LIZIZ(String str, Class<? extends JSModule> cls, Object obj) {
        C1531570pxT c1531570pxT = new C1531570pxT();
        c1531570pxT.LIZ = str;
        c1531570pxT.LIZIZ = cls;
        c1531570pxT.LIZJ = obj;
        this.LIZ.get(str);
        this.LIZ.put(str, c1531570pxT);
    }
}
