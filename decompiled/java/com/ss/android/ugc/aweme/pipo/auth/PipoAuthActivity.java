package com.ss.android.ugc.aweme.pipo.auth;

import X.C01GW;
import X.C098200Yq;
import X.C1227904rF;
import X.C1308910kAL;
import X.C1543490qGh;
import X.C1547610qNL;
import X.C1697810uHb;
import X.C1717770unn;
import X.C1723740uxQ;
import X.C189200o6;
import X.C2097608Jq;
import X.C299020Bno;
import X.C335910DEv;
import X.C723850SaN;
import X.C797990VSb;
import X.EnumC335920DEw;
import X.EnumC743970TGh;
import X.InterfaceC1063710dmr;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.constants.gecko.PIPOGeckoRegister;
import com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasService;
import com.zhiliaoapp.musically.R;
import defpackage.k3;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS390S0200000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAuthActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSUlOSB9KTA4IWEDITUjCDonIAQvPSYlITE1";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(387), "host", String.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(391), "path", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(389), "merchant_id", String.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(384), "auth_type", String.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(388), "login_scene", String.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(385), "country", String.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(386), "extra", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(392), "source_btm_token", String.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object c098200Yq;
        Map mapLJ;
        IPIPOVeritasService iPIPOVeritasService;
        String str = "";
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onCreate", true);
        activityConfiguration(AFwS268S0000000_26.get$arr$(390));
        setContentView(R.layout.dv8);
        super.onCreate(bundle);
        try {
            IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService != null && iPipoService.LJFF(EnumC743970TGh.BNPL) && (iPIPOVeritasService = (IPIPOVeritasService) PluggableExtentionKt.pluggableSpi$default(IPIPOVeritasService.class, false, false, false, 14, null)) != null) {
                iPIPOVeritasService.init();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        try {
            C1547610qNL.LIZ.getClass();
            if (C1547610qNL.LIZIZ.compareAndSet(false, true)) {
                C797990VSb.LIZ.LJIIJJI(new PIPOGeckoRegister());
            }
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Map<String, ArrayList<String>> map = k3.LIZ;
            Map<String, ArrayList<String>> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("pipo_auth_login_gecko_channel_map", Map.class, map);
            if (map2 != null) {
                map = map2;
            }
            ArrayList<String> arrayList = map.get((String) this.LLILZIL.getValue());
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                String str2 = (String) this.LLILZIL.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                C1547610qNL.LIZJ(str2, "h5", arrayList2);
            }
            C189200o6.m2constructorimpl(map);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            if (C1723740uxQ.LIZ()) {
                Iterator<Class<? extends InterfaceC1063710dmr>> it2 = ((IBNPLService) ServiceManager.get().getService(IBNPLService.class)).LIZJ().iterator();
                while (it2.hasNext()) {
                    C1543490qGh.LIZIZ(it2.next(), null, 6);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        try {
            Type type = new TypeToken<Map<String, String>>() { // from class: X.0r4X
            }.getType();
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String strDecode = Uri.decode((String) this.LLIZ.getValue());
            strDecode.toString();
            c1227904rF.getClass();
            mapLJ = (Map) C1227904rF.LIZJ(strDecode, type);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("app_id", String.valueOf(C1717770unn.LIZJ().getAppId()));
        pairArr[1] = new Pair("device_platform", "android");
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        if (deviceId != null) {
            str = deviceId;
        }
        pairArr[2] = new Pair("device_id", str);
        C723850SaN.LIZIZ(this, new AwS390S0200000_24(this, (PipoAuthActivity) C2097608Jq.LJIIL(mapLJ, C2097608Jq.LJIIIIZZ(pairArr)), (Map<String, String>) 20));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.auth.PipoAuthActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
