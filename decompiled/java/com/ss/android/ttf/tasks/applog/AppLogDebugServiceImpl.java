package com.ss.android.ttf.tasks.applog;

import X.C01GW;
import X.C2213981Bky;
import X.C2407009bw;
import X.C452501pT;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.debug.IDebugOptService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.tiktok.ttf.applog.init.IAppLogDebugService;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AppLogDebugServiceImpl implements IAppLogDebugService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(129));

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZ() {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService == null) {
            return false;
        }
        iEtDebugService.LIZ();
        return true;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LIZIZ() {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService != null) {
            iEtDebugService.LIZIZ();
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZJ() {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService == null) {
            return false;
        }
        iEtDebugService.LIZJ();
        return true;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final String getMockChannel() {
        ITtmockService iTtmockService = (ITtmockService) PluggableExtentionKt.pluggableSpi$default(ITtmockService.class, false, false, false, 14, null);
        if (iTtmockService != null) {
            return iTtmockService.getMockChannel();
        }
        return null;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final String getPPELane() {
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) PluggableExtentionKt.pluggableSpi$default(INetworkDebugService.class, false, false, false, 14, null);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
        return null;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZLLL() {
        C2407009bw.LIZ();
        return false;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LJFF(Context context) {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService != null) {
            C2213981Bky.LIZIZ.getApplicationContext();
            iEtDebugService.LIZLLL();
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void addDebugInfo(Map<String, String> map) {
        IDebugOptService iDebugOptService = (IDebugOptService) this.LIZ.getValue();
        if (iDebugOptService != null) {
            iDebugOptService.addDebugInfo(map);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void injectViewListener(View view) {
        ITtmockService iTtmockService = (ITtmockService) PluggableExtentionKt.pluggableSpi$default(ITtmockService.class, false, false, false, 14, null);
        if (iTtmockService != null) {
            iTtmockService.injectViewListener(view);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void addDebugInfo(JSONObject jSONObject) {
        IDebugOptService iDebugOptService = (IDebugOptService) this.LIZ.getValue();
        if (iDebugOptService != null) {
            iDebugOptService.addDebugInfo(jSONObject);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LJ(String str, String str2, String str3) {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService != null) {
            iEtDebugService.LJ();
        }
    }
}
