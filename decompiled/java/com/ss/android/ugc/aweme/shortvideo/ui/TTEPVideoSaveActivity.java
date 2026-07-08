package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C01GW;
import X.C0CHQ;
import X.C0LGY;
import X.C1428470nHB;
import X.C1431870nMf;
import X.C19514711Wn;
import X.C19GS;
import X.C20748716Hd;
import X.C418880Gbe;
import X.C446980Hfs;
import X.C452501pT;
import X.C786410Ut5;
import Y.AObjectS245S0100000_22;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import com.zhiliaoapp.musically.R;
import joo.f;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TTEPVideoSaveActivity extends C19GS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nHELIOSPiwoLCB9PSxiHRsWGBMlLSo8GyQ6LA4wPCw6IDsq";
    public VideoPublishEditModel LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 336));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1053));

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final VideoPublishEditModel LJI() {
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        return null;
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f.LIZ.getClass();
        f.LIZ(this);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.kp);
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        C786410Ut5.LLLLIILLL((C418880Gbe) findViewById(R.id.s8t), 0);
        getWindow().setNavigationBarColor(C446980Hfs.LIZ(this, R.color.fw));
        this.LL = C1428470nHB.LJIILLIIL(getIntent());
        C0CHQ.LIZ().getPublishService().LJJJLL();
        AVUploadSaveModel aVUploadSaveModelLJIIJ = C1431870nMf.LJIIJ(LJI().getCreativeInfo(), LJI());
        if (aVUploadSaveModelLJIIJ != null) {
            aVUploadSaveModelLJIIJ.setWaterMark(false);
        }
        LJI().setSaveModel(aVUploadSaveModelLJIIJ);
        ((TTEPVideoSaveViewModel) this.LLILLL.getValue()).LLILLL.LIZ(this, new AObjectS245S0100000_22(this, 78));
        if (Build.VERSION.SDK_INT >= 29) {
            ((TTEPVideoSaveViewModel) this.LLILLL.getValue()).vQ2(true);
        } else {
            C0LGY c0lgy = C0LGY.LIZ;
            C19514711Wn c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-tools_request_storage_permission_ttep_video_save"));
            c0lgy.getClass();
            c19514711WnLIZIZ.LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
            c19514711WnLIZIZ.LIZJ(new C20748716Hd(this, 2));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onCreate", false);
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = f.LIZ;
        getIntent();
        fVar.getClass();
        f.LJII(this, bundle);
    }
}
