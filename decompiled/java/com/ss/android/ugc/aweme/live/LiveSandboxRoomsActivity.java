package com.ss.android.ugc.aweme.live;

import X.C0IJR;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C20684815ws;
import X.C2409809cO;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC1100810ekh;
import X.EnumC335920DEw;
import X.InterfaceC1125460fOS;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class LiveSandboxRoomsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklHELIOSPyp9BCw6LBwyJiEuJjcBJyohOg4wPCw6IDsq";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dba);
        try {
            Constructor<?> constructor = Class.forName("com.bytedance.android.livesdk.gift.debugservice.DebugToolInitServiceManager").getConstructor(Context.class, EnumC1100810ekh.class);
            Object[] objArr = new Object[2];
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            objArr[0] = applicationContext;
            objArr[1] = EnumC1100810ekh.AUDIENCE;
            InterfaceC1125460fOS interfaceC1125460fOS = (InterfaceC1125460fOS) constructor.newInstance(objArr);
            if (interfaceC1125460fOS != null) {
                IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
                Context applicationContext2 = getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext2 == null) {
                    applicationContext2 = C2409809cO.LIZ;
                }
                iDebugService.PP2(interfaceC1125460fOS, applicationContext2, C0IJR.LIZ(ViewModelProviders.of(this), this));
                C20684815ws.LJIILLIIL("livesdk_gift_debug_tools_launch", new HashMap<String, String>() { // from class: X.0hTp
                    {
                        put("page", "tools");
                    }
                });
                C20684815ws.LJIILLIIL("livesdk_gift_debug_tools_fun_click", new HashMap<String, String>() { // from class: X.0hU5
                    {
                        put("func", "sandbox_rooms");
                    }
                });
                Fragment fragmentLJIJJ = interfaceC1125460fOS.LJIJJ();
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentLJIJJ);
                c19ehLJIIJ.LJIIIZ();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onCreate", false);
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
