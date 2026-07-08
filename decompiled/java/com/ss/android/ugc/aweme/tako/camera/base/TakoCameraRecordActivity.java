package com.ss.android.ugc.aweme.tako.camera.base;

import X.C01GW;
import X.C0OGR;
import X.C1232310iAn;
import X.C1232360iAs;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C13LE;
import X.C14K9;
import X.C1697810uHb;
import X.C19EH;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TakoCameraRecordActivity extends BaseActivity {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9KyQhHELIOSLD0yZictOip9HCQnJgwyJSA+KB02Kyo+LQ4wPCw6IDsq";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(322), "current_pic_display_item_count", Integer.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(323), "hide_gallery_entrance", Boolean.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(324), "mob_params", C0OGR.class);
    public volatile C1232310iAn LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoCameraRecordActivity.class, "recordEntryFragment", "getRecordEntryFragment()Lcom/ss/android/ugc/aweme/tako/camera/record/pageui/TakoRecordEntryFragment;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.ma;
        overridePendingTransition(0, i);
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

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0iAn] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onCreate", true);
        super.onCreate(bundle);
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, true, 7);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZLLL();
        setContentView(R.layout.fmd);
        C14K9.LJIJJ(findViewById(R.id.d_d), C1232360iAs.LL);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (this.LLILZ == null) {
            synchronized (this) {
                if (this.LLILZ == null) {
                    this.LLILZ = new Object() { // from class: X.0iAn
                    };
                }
            }
        }
        Integer num = (Integer) this.LL.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.getValue(), Boolean.TRUE);
        C0OGR c0ogr = (C0OGR) this.LLILLL.getValue();
        if (c0ogr == null) {
            c0ogr = new C0OGR("", "", "", "", "");
        }
        TakoRecordFragment.LLJILJILJ.getClass();
        TakoRecordFragment takoRecordFragment = new TakoRecordFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("currentPicDisplayItemCount", iIntValue);
        bundle2.putBoolean("hideGalleryEntrance", zLJFF);
        C786410Ut5.LJJIZ(bundle2, "mobParams", c0ogr);
        takoRecordFragment.setArguments(bundle2);
        c19ehLJIIJ.LJIJ(R.id.d_d, takoRecordFragment, null);
        c19ehLJIIJ.LJIIIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.camera.base.TakoCameraRecordActivity", "onCreate", false);
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
