package com.ss.android.ugc.aweme.tools.integration.plugin.integration.impl;

import X.C1388190mED;
import X.C20192713zh;
import X.C201955140j;
import X.C202068144s;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C2228808oI;
import X.C2344009Gk;
import X.C264790AZh;
import X.C421570Gfz;
import X.C554740LpI;
import X.C844020X9c;
import X.InterfaceC842850X4p;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginState;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes31.dex */
public final class CreativeToolsBizPluginServiceImpl implements CreativeToolsBizPluginService {
    public final Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService
    public final boolean LIZ() {
        C20192713zh.LIZ.getClass();
        return C20192713zh.LJFF.get() instanceof CreativeToolsBizPluginState.Installed;
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService
    public final void LIZJ() {
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginServiceImpl", "requestInstall enter");
        C20192713zh.LIZ.getClass();
        CreativeToolsBizPluginState creativeToolsBizPluginState = C20192713zh.LJFF.get();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestInstall enter, state=");
        sbLIZ.append(creativeToolsBizPluginState);
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ));
        if (creativeToolsBizPluginState instanceof CreativeToolsBizPluginState.Installed) {
            C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", "requestInstall skip: already INSTALLED");
            return;
        }
        if (creativeToolsBizPluginState instanceof CreativeToolsBizPluginState.Downloading) {
            C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", "requestInstall skip: in DOWNLOADING");
            return;
        }
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", "requestInstall trigger IPluginService.install");
        int iIntValue = ((Number) C264790AZh.LIZ.getValue()).intValue();
        AtomicInteger atomicInteger = C20192713zh.LIZJ;
        int i = atomicInteger.get();
        if (i >= iIntValue) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("internalRequestInstall skip: attempt=");
            sbLIZ2.append(i);
            sbLIZ2.append(" reached max=");
            sbLIZ2.append(iIntValue);
            C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (C20192713zh.LIZJ(CreativeToolsBizPluginState.Downloading.INSTANCE)) {
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("internalRequestInstall, packageName=com.ss.android.ugc.aweme.df_camera_biz, attempt=");
            sbLIZ3.append(iIncrementAndGet);
            sbLIZ3.append(", max=");
            sbLIZ3.append(iIntValue);
            C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ3));
            C844020X9c c844020X9c = new C844020X9c();
            c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_camera_biz";
            c844020X9c.LIZIZ = true;
            c844020X9c.LIZJ = false;
            c844020X9c.LJI = -10;
            c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zj
                @Override // X.InterfaceC842850X4p
                public final void LIZJ(String str, boolean z) {
                    C20192713zh.LIZ.getClass();
                    C20192713zh.LIZIZ("listener onSuccess");
                }

                @Override // X.InterfaceC842850X4p
                public final void LIZ(int i2, String str, boolean z) {
                    C20192713zh.LIZ.getClass();
                    C20192713zh.LIZ(i2, "listener onFailed");
                }
            };
            ((IPluginService) C20192713zh.LIZIZ.getValue()).LJJI(new C202068144s(c844020X9c));
        }
    }

    public final void LJ(Context context) {
        Activity currentActivity;
        boolean z;
        if (context == null || (currentActivity = C1388190mED.LIZ(context)) == null) {
            currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
        }
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPluginUnReadyTip, hasActivity=");
        if (currentActivity != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (currentActivity == null) {
            return;
        }
        C421570Gfz.LIZ(new C2228808oI(currentActivity, currentActivity.getString(2131826240)));
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService
    public final void LIZLLL(String str, boolean z) {
        int i;
        if (!this.LIZIZ.add(str)) {
            C554740LpI c554740LpI = C554740LpI.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportIfPluginNotReady skipped, already reported, scene=");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C20192713zh.LIZ.getClass();
        CreativeToolsBizPluginState creativeToolsBizPluginState = C20192713zh.LJFF.get();
        C554740LpI c554740LpI2 = C554740LpI.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("reportIfPluginNotReady, state=");
        sbLIZ2.append(creativeToolsBizPluginState);
        sbLIZ2.append(", scene=");
        sbLIZ2.append(str);
        C201955140j.LIZLLL(c554740LpI2, "CreativeToolsBizPluginServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (creativeToolsBizPluginState instanceof CreativeToolsBizPluginState.Installed) {
            i = 1;
        } else if (creativeToolsBizPluginState instanceof CreativeToolsBizPluginState.Downloading) {
            i = 2;
        } else {
            i = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("plugin_name", "df_camera_biz");
        c2344009Gk.LJIIIIZZ("plugin_trigger_scene", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "plugin_entry_click");
        c2344009Gk.LIZJ(i, "plugin_download_status");
        C20684815ws.LJIILLIIL("install_package_business_plugin", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService
    public final void LIZIZ(Context context, String str, boolean z) {
        LIZLLL(str, z);
        LJ(context);
        LIZJ();
    }
}
