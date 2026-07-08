package com.ss.android.ugc.aweme.main.replace;

import X.C0L91;
import X.C0LGY;
import X.C0LGZ;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C523790KgT;
import X.C523800KgU;
import X.EnumC335920DEw;
import X.InterfaceC540100LGe;
import android.content.Intent;
import android.os.Build;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public final class OpenEditPageHandlerActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZigtICF9OiA8HELIOSJS4wLWsDOSo9DSElPR8yLyAEKCE3JCA+CCwnITMlPTY=";

    public void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    private final void handleFromTTS() {
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZJ = "bpea-tools_request_album_permission_for_tts";
        c523800KgU.LIZIZ = "bpea-tools_request_album_permission_for_tts_target33";
        c523800KgU.LIZ = "bpea-tools_request_album_permission_for_tts_target34";
        C523790KgT c523790KgTLIZ = c523800KgU.LIZ();
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.VIDEO;
        C0LGZ c0lgz = new C0LGZ() { // from class: X.13zC
            @Override // X.C0LGZ
            public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                if (Build.VERSION.SDK_INT >= 34) {
                    C0LGY.LIZ.getClass();
                    if (!C0LGY.LIZLLL("android.permission.READ_MEDIA_VIDEO") && C0LGY.LIZLLL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                        C19514711Wn.LIZIZ.LIZIZ(this.LIZ, new TokenCert("bpea-tools_request_album_permission_for_tts_target34")).LIZIZ((String[]) Arrays.copyOf(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO"}, 2)).LIZJ(new C20308314dF(this.LIZ, 1));
                        return;
                    }
                }
                this.LIZ.openVideoEdit();
            }
        };
        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.13zD
            @Override // X.InterfaceC540100LGe
            public final void LIZ(int[] iArr, String[] strArr) {
                OpenEditPageHandlerActivity.handleFromTTS$openRecord(this.LIZ);
            }
        };
        c0lgy.getClass();
        C0LGY.LJIIJ(this, c523790KgTLIZ.LIZ(), c0l91, interfaceC540100LGe, c0lgz);
    }

    public final void openVideoEdit() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//openVideoEdit");
        smartRouteBuildRoute.withParam("media_path", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "media_path"));
        smartRouteBuildRoute.withParam("upload_type", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "upload_type"));
        smartRouteBuildRoute.withParam("assets", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "assets"));
        smartRouteBuildRoute.withParam("shoot_way", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "shoot_way"));
        smartRouteBuildRoute.withParam("anchors", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "anchors"));
        smartRouteBuildRoute.withParam("challenge_id", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "challenge_id"));
        smartRouteBuildRoute.withParam("challenge_name", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "challenge_name"));
        smartRouteBuildRoute.withParam("creation_id", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "creation_id"));
        smartRouteBuildRoute.withParam("extra", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra"));
        smartRouteBuildRoute.withParam("from_deeplink", getIntent().getBooleanExtra("from_deeplink", false));
        smartRouteBuildRoute.withParam("creative_initial_model", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "creative_initial_model"));
        smartRouteBuildRoute.open();
    }

    public static void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(OpenEditPageHandlerActivity openEditPageHandlerActivity) {
        openEditPageHandlerActivity.com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                openEditPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(OpenEditPageHandlerActivity openEditPageHandlerActivity) {
        com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(openEditPageHandlerActivity);
        try {
            openEditPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void handleFromTTS$openRecord(OpenEditPageHandlerActivity openEditPageHandlerActivity) {
        SmartRouter.buildRoute(openEditPageHandlerActivity, "//openRecord?enter_from=tiktokseller&source_params=%7B%22request_from%22%3A%22tiktokseller%22%2C%22enter_from%22%3A%22tiktokseller%22%7D").open();
        openEditPageHandlerActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(OpenEditPageHandlerActivity openEditPageHandlerActivity, int i) {
        boolean z;
        openEditPageHandlerActivity.com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, openEditPageHandlerActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, openEditPageHandlerActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            openEditPageHandlerActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
