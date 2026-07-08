package com.ss.android.ugc.aweme.audiomode.vopclone.instantclone;

import X.C05HM;
import X.C098200Yq;
import X.C11XR;
import X.C11XT;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097608Jq;
import X.C299020Bno;
import X.C335910DEv;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import Y.ACallableS74S1100000_29;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS129S0100000_29;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.gamora.editor.audioservice.service.vopinstantclone.VopInstantCloneCameraServiceImpl;
import com.ss.android.ugc.gamora.recorder.vopclone.VopCameraClientService;
import com.zhiliaoapp.musically.R;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneVoiceActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5LSY8JSooLGElJzUvJSA9HELIOSLWslJzwnKSs4KiM8JiBiACEgPCQiPQw/JyspHyA6KyANKjs6Piw4MA==";
    public FrameLayout LL;
    public DialogC1389620mGW LLILLJJLI;
    public final String LLILLL = UUID.randomUUID().toString();
    public String LLILZ = "";
    public boolean LLILZIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        try {
            runOnUiThread(new ARunnableS108S0100000_8(this, 8));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LLLLZI() {
        try {
            runOnUiThread(new ARunnableS129S0100000_29(this, 17));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onResume", true);
        super.onResume();
        this.LLILZIL = false;
        VopInstantCloneCameraServiceImpl.LIZ().showInstantClone(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        VopInstantCloneCameraServiceImpl.LIZ().onDestroyInstantClone();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.LLILZIL) {
            return;
        }
        VopInstantCloneCameraServiceImpl.LIZ().onStopInstantClone();
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

    /* JADX WARN: Type inference failed for: r5v0, types: [X.11XQ] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dxk);
        this.LL = (FrameLayout) findViewById(R.id.evm);
        FrameLayout frameLayout = null;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        if (extras == null || (string = extras.getString("enter_from", "web_h5")) == null) {
            string = "";
        }
        this.LLILZ = string;
        setTheme(R.style.y0);
        IVopInstantCloneCameraService iVopInstantCloneCameraServiceLIZ = VopInstantCloneCameraServiceImpl.LIZ();
        FrameLayout frameLayout2 = this.LL;
        if (frameLayout2 != null) {
            frameLayout = frameLayout2;
        }
        iVopInstantCloneCameraServiceLIZ.initInstantVoiceCloneView(this, frameLayout, "full_screen", this.LLILZ);
        LLLLZI();
        C11XR c11xr = new Object() { // from class: X.11XR
        };
        final String strLJJIZ = C05HM.LIZIZ.LJJIZ();
        final ?? r5 = new C11XT() { // from class: X.11XQ
            @Override // X.C11XT
            public final void onFailure() {
            }

            @Override // X.C11XT
            public final void onSuccess(String str) {
                C15O7.LIZJ(new ACallableS74S1100000_29(str, this.LIZ, 0));
            }
        };
        c11xr.getClass();
        Map<String, List<String>> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("", C1697810uHb.LJIILJJIL(strLJJIZ)));
        VopCameraClientService.LIZ().initDownloadableModel();
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{""}, mapLJIIJ, new IFetchResourceListener() { // from class: X.13Tz
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                C11XT c11xt = r5;
                if (c11xt != null) {
                    c11xt.onFailure();
                }
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                String strFindResourceUri;
                try {
                    if (C13Q5.LIZJ()) {
                        strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, strLJJIZ);
                    } else {
                        strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, strLJJIZ);
                    }
                    if (C123100dR.LIZ(strFindResourceUri)) {
                        String path = URI.create(strFindResourceUri).getPath();
                        C11XT c11xt = r5;
                        if (c11xt != null) {
                            c11xt.onSuccess(path);
                            return;
                        }
                        return;
                    }
                    C11XT c11xt2 = r5;
                    if (c11xt2 != null) {
                        c11xt2.onFailure();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C11XT c11xt3 = r5;
                    if (c11xt3 != null) {
                        c11xt3.onFailure();
                    }
                    System.out.print(e2.getStackTrace());
                }
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity", "onCreate", false);
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
