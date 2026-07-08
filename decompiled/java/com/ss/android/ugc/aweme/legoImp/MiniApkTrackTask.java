package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MiniApkTrackTask implements C0CCZ {
    public final int LL = 33;
    public final int LLILLJJLI = 6;
    public final String LLILLL = "MiniApkRepo";
    public final String LLILZ = "mini_apk_attribution";
    public final String LLILZIL = "media_source_sp";
    public final String LLILZLL = "media_source_df";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MiniApkTrackTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Le
            return
        Le:
            int r4 = r11.LLILLJJLI
            r6 = 0
            r1 = 0
        L12:
            if (r4 <= 0) goto L42
            java.lang.Class<com.bytedance.ies.ugc.aweme.plugin.service.IPluginService> r5 = com.bytedance.ies.ugc.aweme.plugin.service.IPluginService.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.bytedance.ies.ugc.aweme.plugin.service.IPluginService r3 = (com.bytedance.ies.ugc.aweme.plugin.service.IPluginService) r3
            if (r3 == 0) goto L40
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "df_preload_"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            boolean r2 = r3.checkPluginInstalled(r0)
            r0 = 1
            if (r2 != r0) goto L40
        L3a:
            int r1 = r1 * 2
            int r1 = r1 + r0
            int r4 = r4 + (-1)
            goto L12
        L40:
            r0 = 0
            goto L3a
        L42:
            int r0 = r11.LL
            java.lang.String r4 = ""
            if (r1 != r0) goto L72
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L4c:
            java.lang.String r0 = r11.LLILLL
            android.content.SharedPreferences r1 = X.C810670Vr7.LIZJ(r12, r6, r0)
            java.lang.String r0 = r11.LLILZIL
            java.lang.String r0 = r1.getString(r0, r4)
            if (r0 == 0) goto L5b
            r4 = r0
        L5b:
            java.lang.String r2 = r11.LLILZ
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = r11.LLILZLL
            r1.LJIIIIZZ(r0, r3)
            java.lang.String r0 = r11.LLILZIL
            r1.LJIIIIZZ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
            return
        L72:
            r3 = r4
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.MiniApkTrackTask.run(android.content.Context):void");
    }
}
