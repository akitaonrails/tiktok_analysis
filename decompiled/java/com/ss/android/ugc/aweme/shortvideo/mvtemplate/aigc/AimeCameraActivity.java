package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C01GW;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C20684815ws;
import X.C214873197f;
import X.C2344009Gk;
import X.C299020Bno;
import X.C330830Cy1;
import X.C335910DEv;
import X.C452501pT;
import X.C535390KzB;
import X.C566110MIf;
import X.C580810MqF;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aime.MobModule;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AimeCameraActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9HELIOSJTM4LCIjJCQ4LGEyISIvZw46JSAPKCI2OiQNKjs6Piw4MA==";
    public final C01GW LL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(136));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onWindowFocusChanged", true);
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

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        boolean z;
        boolean z2;
        String string4;
        int iHashCode;
        Bundle bundleLLLLLZL;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onCreate", true);
        super.onCreate(bundle);
        String str = "";
        Integer numValueOf = null;
        if (C330830Cy1.LIZ() && (bundleLLLLLZL = LLLLLZL(getIntent())) != null && bundleLLLLLZL.getInt("ai_self_is_from_album_ai_tab") == 0) {
            ((MobModule) this.LL.getValue()).LIZJ("notification");
            C566110MIf.LIZ.getClass();
            C566110MIf.LIZJ("notification", null, "", false, false);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("aime_notification", new C580810MqF(this, 1));
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onCreate", false);
            return;
        }
        Bundle bundleLLLLLZL2 = LLLLLZL(getIntent());
        if (bundleLLLLLZL2 != null) {
            string = bundleLLLLLZL2.getString("enter_from");
        } else {
            string = null;
        }
        Bundle bundleLLLLLZL3 = LLLLLZL(getIntent());
        if (bundleLLLLLZL3 != null) {
            string2 = bundleLLLLLZL3.getString("styleId");
        } else {
            string2 = null;
        }
        Bundle bundleLLLLLZL4 = LLLLLZL(getIntent());
        if (bundleLLLLLZL4 != null) {
            string3 = bundleLLLLLZL4.getString("shoot_way");
        } else {
            string3 = null;
        }
        Bundle bundleLLLLLZL5 = LLLLLZL(getIntent());
        if (bundleLLLLLZL5 != null) {
            numValueOf = Integer.valueOf(bundleLLLLLZL5.getInt("is_regenerate"));
        }
        Bundle bundleLLLLLZL6 = LLLLLZL(getIntent());
        if (bundleLLLLLZL6 != null) {
            z = bundleLLLLLZL6.getBoolean("is_from_editor_tab");
        } else {
            z = false;
        }
        Bundle bundleLLLLLZL7 = LLLLLZL(getIntent());
        if (bundleLLLLLZL7 != null) {
            z2 = bundleLLLLLZL7.getBoolean("arg_is_editor_pro_outlinker");
        } else {
            z2 = false;
        }
        Bundle bundleLLLLLZL8 = LLLLLZL(getIntent());
        if (bundleLLLLLZL8 == null || (string4 = bundleLLLLLZL8.getString("arg_editor_pro_outlinker")) == null) {
            string4 = "";
        }
        C566110MIf c566110MIf = C566110MIf.LIZ;
        if (string3 != null) {
            str = string3;
        }
        c566110MIf.getClass();
        C566110MIf.LIZIZ = str;
        if (!C535390KzB.LIZ()) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onCreate", false);
            return;
        }
        if (string != null && ((iHashCode = string.hashCode()) == 18452537 ? string.equals("aime_push") : iHashCode == 565338525 ? string.equals("aime_inapp") : !(iHashCode != 565339463 || !string.equals("aime_inbox")))) {
            ((MobModule) this.LL.getValue()).LIZJ("notification");
        }
        C566110MIf.LIZJ(string, string2, string4, z, z2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LJIIIIZZ("shoot_way", string3);
        c2344009Gk.LJ(numValueOf, "is_regenerate");
        c2344009Gk.LJIIIIZZ("source_style_id", string2);
        C20684815ws.LJIILLIIL("aime_create", c2344009Gk.LIZ);
        setContentView(R.layout.ok);
        C214873197f c214873197f = new C214873197f(this, AimeCameraScene.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "AimeCameraActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0MI2
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str2, Bundle bundle2) {
                if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene", str2)) {
                    return new AimeCameraScene();
                }
                return null;
            }
        };
        c214873197f.LIZ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            getWindow().setStatusBarColor(iIntValue);
            getWindow().setNavigationBarColor(iIntValue);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity", "onCreate", false);
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
