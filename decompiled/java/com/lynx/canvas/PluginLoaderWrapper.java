package com.lynx.canvas;

import X.AbstractC1303850k2B;
import X.AbstractC1303880k2E;
import X.C1288370jdD;
import X.C2188811AlT;
import a17.l;

/* JADX INFO: loaded from: classes21.dex */
public class PluginLoaderWrapper {
    public static native void nativeOnFinishCallback(long j, String str, boolean z, String str2, String str3);

    public static boolean loadModuleService(KryptonApp kryptonApp, String str) {
        if (l.moduleName().equals(str)) {
            l lVar = (l) kryptonApp.LIZLLL(l.class);
            if (lVar != null) {
                return lVar.loadAudioModule();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no audio module found for ");
            sbLIZ.append(str);
            C1288370jdD.LIZLLL("PluginLoaderWrapper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if ("rtc".equals(str)) {
            AbstractC1303880k2E abstractC1303880k2E = (AbstractC1303880k2E) kryptonApp.LIZLLL(AbstractC1303880k2E.class);
            if (abstractC1303880k2E != null) {
                return abstractC1303880k2E.LIZ();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("no rtc module found for ");
            sbLIZ2.append(str);
            C1288370jdD.LIZLLL("PluginLoaderWrapper", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if ("vecamera".equals(str)) {
            AbstractC1303850k2B abstractC1303850k2B = (AbstractC1303850k2B) kryptonApp.LIZLLL(AbstractC1303850k2B.class);
            if (abstractC1303850k2B != null) {
                return abstractC1303850k2B.LIZ();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("no ve-camera module found for ");
            sbLIZ3.append(str);
            C1288370jdD.LIZLLL("PluginLoaderWrapper", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("no module for ");
        sbLIZ4.append(str);
        C1288370jdD.LIZLLL("PluginLoaderWrapper", C2188811AlT.LIZIZ(sbLIZ4));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void preloadPlugin(com.lynx.canvas.KryptonApp r7, long r8, java.lang.String r10) {
        /*
            java.lang.Class<X.0k2F> r0 = X.AbstractC1303890k2F.class
            a17.a0 r3 = r7.LJ(r0)
            X.0k2F r3 = (X.AbstractC1303890k2F) r3
            java.lang.String r2 = "PluginLoaderWrapper"
            r4 = r10
            if (r3 != 0) goto L59
            java.lang.String r0 = "rtc"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L34
            java.lang.Class<X.0k2E> r0 = X.AbstractC1303880k2E.class
            a17.u r0 = r7.LIZLLL(r0)
            X.0k2E r0 = (X.AbstractC1303880k2E) r0
            if (r0 == 0) goto L55
            boolean r5 = r0.LIZ()
        L23:
            if (r5 == 0) goto L31
            java.lang.String r6 = "plugin loader service not exits, default return success"
        L27:
            X.C1288370jdD.LIZLLL(r2, r6)
            java.lang.String r7 = ""
            r2 = r8
            nativeOnFinishCallback(r2, r4, r5, r6, r7)
            return
        L31:
            java.lang.String r6 = "post load plugin failed"
            goto L27
        L34:
            java.lang.String r0 = a17.l.moduleName()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L55
            java.lang.Class<a17.l> r0 = a17.l.class
            a17.u r1 = r7.LIZLLL(r0)
            a17.l r1 = (a17.l) r1
            if (r1 == 0) goto L55
            boolean r0 = r1.loadAudioModule()
            if (r0 == 0) goto L57
            r0 = 0
            boolean r0 = r1.loadAudioEffectModule(r0)
            if (r0 == 0) goto L57
        L55:
            r5 = 1
            goto L23
        L57:
            r5 = 0
            goto L23
        L59:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loading plugin "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " async ..."
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1288370jdD.LIZJ(r2, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r3.LIZJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.PluginLoaderWrapper.preloadPlugin(com.lynx.canvas.KryptonApp, long, java.lang.String):void");
    }
}
