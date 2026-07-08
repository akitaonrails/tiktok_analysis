package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC20597215ik;
import X.C0UF5;
import X.C128Y;
import X.C1308910kAL;
import X.C14EU;
import X.C1697810uHb;
import X.C20050213ci;
import X.C299020Bno;
import X.C335910DEv;
import X.C484240Iys;
import X.ComponentCallbacks2C20050113ch;
import X.EnumC335920DEw;
import X.InterfaceC214902198i;
import X.InterfaceC21500319Cf;
import X.InterfaceC773120UUk;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.performance.LiveLowMemoryMonitorSettings;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_live_broadcast")
public final class LiveBroadcastSceneWrapperActivity extends AbstractActivityC20597215ik {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9BCHELIOSw6LA0hJyQoKi4gPBYvLCE2HzctOT82OgQvPSYlITE1";
    public final Class<? extends InterfaceC214902198i> LL = LiveBroadcastRootFragment.class;
    public ComponentCallbacks2C20050113ch LLILLJJLI;

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onResume", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        InterfaceC773120UUk interfaceC773120UUk;
        super.onAttachedToWindow();
        C0UF5.LJIIIIZZ(System.currentTimeMillis());
        C128Y powerAttachRootFragment = getPowerAttachRootFragment();
        if (!(powerAttachRootFragment instanceof InterfaceC773120UUk) || (interfaceC773120UUk = (InterfaceC773120UUk) powerAttachRootFragment) == null) {
            return;
        }
        interfaceC773120UUk.kE();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C20050213ci.LIZIZ(this, this.LLILLJJLI);
        this.LLILLJJLI = null;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LL;
    }

    @Override // X.AbstractActivityC20597215ik, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onCreate", true);
        activityConfiguration(AFwS274S0000000_30.get$arr$(66));
        super.onCreate(bundle);
        if (LiveLowMemoryMonitorSettings.enable() && this.LLILLJJLI == null) {
            this.LLILLJJLI = new ComponentCallbacks2C20050113ch();
        }
        C20050213ci.LIZ(this, this.LLILLJJLI);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "onCreate", false);
    }

    @C14EU
    public final void onEvent(C484240Iys c484240Iys) {
        if (Live.getService() != null) {
            Live.getService().LJJIL();
        }
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
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
