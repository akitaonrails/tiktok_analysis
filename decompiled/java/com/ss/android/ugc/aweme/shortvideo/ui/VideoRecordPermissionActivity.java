package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C04TD;
import X.C0C64;
import X.C0LAB;
import X.C1308910kAL;
import X.C1390380mHk;
import X.C1448790nnx;
import X.C1637890six;
import X.C1688680u2s;
import X.C1697810uHb;
import X.C201955140j;
import X.C201967140v;
import X.C2188811AlT;
import X.C2216131BoR;
import X.C2341909Fp;
import X.C2474509mp;
import X.C299020Bno;
import X.C335910DEv;
import X.C524780Ki4;
import X.C535670Kzd;
import X.C543670LTx;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1457290o1f;
import X.InterfaceC2342209Fs;
import Y.AObjectS111S0000000_8;
import Y.AObjectS351S0100000_8;
import Y.ARunnableS87S0000000_8;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.util.StitchDownloadServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.tools.IStitchDownloadService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import joo.f;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class VideoRecordPermissionActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCHELIOSB9PSxiHyY3LSoeLCw8OiEcLD0+ITY/ICA9CSY4IDk6PDw=";
    public final ToolSafeHandler LL = new ToolSafeHandler(this);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0LFG, X.0LH5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity.LLLLZI():void");
    }

    public final void LLLLZLL() {
        C524780Ki4.LIZ.step("av_video_record_init", "startVideoRecordActivity");
        if (isFinishing() || isDestroyed() || isDestroyed()) {
            C1448790nnx.LIZIZ("camera_error", "2", null, 12);
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "record_permission_vesdk_plugin_ready_guard", true, true)) {
            String strLLLLLZL = LLLLLZL(getIntent(), "shoot_way");
            if (strLLLLLZL == null) {
                strLLLLLZL = "";
            }
            if (!C535670Kzd.LIZ().LIZJ(this, strLLLLLZL, true)) {
                finish();
                return;
            }
        }
        C2474509mp.LIZ.execute(new ARunnableS87S0000000_8(1));
        o.LJFF(C2216131BoR.LIZ());
        C1688680u2s.LJI(this, getIntent(), new AObjectS351S0100000_8(this, 4));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C786410Ut5.je(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f.LIZ.getClass();
        f.LIZ(this);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    public static boolean LLLLZIL(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        IStitchDownloadService iStitchDownloadService;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        Intent intent2 = getIntent();
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) intent2.getParcelableExtra("duet_and_stitch_router_config");
        String str = "";
        if (duetAndStitchRouterConfig != null) {
            str = duetAndStitchRouterConfig.enterMethod;
        }
        boolean zEquals = "duet_and_stitch_jsb".equals(str);
        if (zEquals) {
            activityConfiguration(new AObjectS111S0000000_8(2));
        }
        super.onCreate(bundle);
        if (Boolean.valueOf(zEquals).booleanValue() && duetAndStitchRouterConfig != null) {
            String str2 = duetAndStitchRouterConfig.type;
            if ("use_duet".equals(str2)) {
                ((IDuetDownloadService) ServiceManager.get().getService(IDuetDownloadService.class)).LIZ(this, duetAndStitchRouterConfig);
            } else if ("use_stitch".equals(str2)) {
                Object objLIZ = C04TD.LIZ(IStitchDownloadService.class, false);
                if (objLIZ != null) {
                    iStitchDownloadService = (IStitchDownloadService) objLIZ;
                } else {
                    if (C04TD.n5 == null) {
                        synchronized (IStitchDownloadService.class) {
                            if (C04TD.n5 == null) {
                                C04TD.n5 = new StitchDownloadServiceImpl();
                            }
                        }
                    }
                    iStitchDownloadService = C04TD.n5;
                }
                iStitchDownloadService.LIZ(this, duetAndStitchRouterConfig);
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
            return;
        }
        C524780Ki4.LIZ.start("av_video_record_init", "startToolPermissionActivity");
        f fVar = f.LIZ;
        Intent intent3 = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent3, bundle);
        String strLLLLLZL = LLLLLZL(intent2, "shoot_way");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "permission_enter");
        c0lab.LJ("shoot_way", strLLLLLZL);
        C2341909Fp.LIZ("tools_performance_permission", c0lab.LIZ);
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            C1448790nnx.LIZ("camera_error", "2", "recording");
            finish();
        } else if (LLLLZIL(getIntent()) && o.LJI()) {
            C1448790nnx.LIZ("camera_error", "2", "recording");
            finish();
        } else {
            Intent intent4 = getIntent();
            if ((intent4 != null && "main".equals(LLLLLZL(intent4, "from"))) || LLLLZIL(getIntent()) || (((intent = getIntent()) != null && TextUtils.equals(LLLLLZL(intent, "shoot_way"), "ec_photo_search")) || !o.LJI() || booleanExtra2)) {
                LLLLZI();
            } else {
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Recording status:");
                sbLIZ.append(o.LIZ());
                sbLIZ.append(" recreatedSupport: ");
                sbLIZ.append(booleanExtra2);
                C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("event", "isRecording");
                c543670LTx.LIZ.put("user_info", o.LIZ());
                C1637890six.LIZIZ("record", c543670LTx.LJ());
                InterfaceC1457290o1f interfaceC1457290o1f = o.LJIIZILJ;
                if (interfaceC1457290o1f != null && interfaceC1457290o1f.getCurrentUser() != null && interfaceC1457290o1f.getCurrentUser().LJIIJ()) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131845920);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(this, 3078, creativeToastBuilder);
                    C1448790nnx.LIZ("camera_error", "2", "recording");
                } else {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131834867);
                    creativeToastBuilder2.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(this, 2042, creativeToastBuilder2);
                    C1448790nnx.LIZ("camera_error", "2", "recording");
                }
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        f.LIZ.getClass();
        f.LIZJ(this, intent, null);
        if (LLLLZIL(intent)) {
            LLLLZI();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = f.LIZ;
        getIntent();
        fVar.getClass();
        f.LJII(this, bundle);
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

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
