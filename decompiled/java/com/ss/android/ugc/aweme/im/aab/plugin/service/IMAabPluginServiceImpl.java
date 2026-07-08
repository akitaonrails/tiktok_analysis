package com.ss.android.ugc.aweme.im.aab.plugin.service;

import X.AbstractC1387200mCc;
import X.C0CCZ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1906580ziK;
import X.C20191913zZ;
import X.C20192213zc;
import X.C20192313zd;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.aab.plugin.IMAabPluginDownloadTask;
import com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService;
import com.ss.android.ugc.aweme.service.IIMMediaService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.concurrent.Future;
import jv6.a;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class IMAabPluginServiceImpl implements IIMAabPluginService {
    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final C0CCZ LIZLLL() {
        return new IMAabPluginDownloadTask();
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final Future LJ() {
        C20191913zZ.LIZ.getClass();
        return C20191913zZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LJFF(boolean z) {
        if (!LIZJ(z, false) || PluggableExtentionKt.pluggableSpiForReal(IIMMediaService.class) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final void LJI(Activity activity) {
        a.LIZLLL(activity);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final void LIZ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("plugin_name", (String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL("com.ss.android.ugc.aweme.df_im_bootfinish", new String[]{e3.d}, 0, 6)));
        c2344009Gk.LJIIIIZZ("plugin_trigger_scene", str);
        c2344009Gk.LIZJ(1, "plugin_entry_click");
        c2344009Gk.LIZJ(z ? 1 : 0, "plugin_download_status");
        C20684815ws.LJIILLIIL("install_package_business_plugin", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LIZJ(boolean z, boolean z2) {
        boolean zCheckPluginInstalled;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C20191913zZ.LIZ.getClass();
        synchronized (C20191913zZ.LIZLLL) {
            C20192313zd c20192313zdLIZ = C20192213zc.LIZ("com.ss.android.ugc.aweme.df_im_bootfinish");
            if (c20192313zdLIZ.LIZJ == 0) {
                c20192313zdLIZ.LIZJ = SystemClock.elapsedRealtime();
                c20192313zdLIZ.LIZLLL = 2;
            }
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null) {
            zCheckPluginInstalled = iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_im_bootfinish");
            if (!zCheckPluginInstalled) {
            }
            return zCheckPluginInstalled;
        }
        zCheckPluginInstalled = false;
        if (z) {
            C20191913zZ.LIZIZ();
            if (z2 && (abstractC1387200mCcLJFF = C1906580ziK.LJFF()) != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131831924);
                c1389890mGx.LJIIJJI();
            }
        }
        return zCheckPluginInstalled;
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LIZIZ(Context context, String str, boolean z) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(context, str, z)) {
            return false;
        }
        return true;
    }
}
