package com.bytedance.pipo.ocr.view;

import X.ActivityC2186501Ahk;
import X.C1300690jx5;
import X.C1339170kx9;
import X.C1602160rnK;
import X.C19MB;
import X.C2186421Ahc;
import X.C2186511Ahl;
import X.C2186521Ahm;
import X.C416780GVw;
import X.C786410Ut5;
import X.C838130WuJ;
import X.RunnableC2186431Ahd;
import Y.ARunnableS37S1100000_33;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co5.g;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import eo5.b;

/* JADX INFO: loaded from: classes34.dex */
public final class CardOcrActivity extends ActivityC2186501Ahk {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZiovO2HELIOSElISA7ZwwyOiEDKj0SKzElPyYnMQ==";
    public AppCompatImageView LLJJIJI;
    public C416780GVw LLJJIJIIJIL;
    public AppCompatImageView LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public final double LLJJJJ = 0.229d;
    public final double LLJJJJJIL = 0.075d;
    public final long LLJJJJLIIL = 40000;
    public final long LLJJL = 500;
    public PthreadTimer LLJJLIIIJLLLLLLLZ = new PthreadTimer("CardOcrActivity");
    public String LLJL;
    public C2186421Ahc LLJLIL;

    @Override // X.ActivityC2186501Ahk, android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // X.ActivityC2186501Ahk
    public final void LJ() {
        try {
            View view = this.LLJJJIL;
            if (view != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dfi);
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                if (constraintLayout.indexOfChild(view) != -1) {
                    C786410Ut5.LJJLI(view, constraintLayout);
                }
                constraintLayout.addView(view);
                c19mb.LJIILL(view.getId(), -2);
                c19mb.LJIIJJI(view.getId(), -2);
                c19mb.LJIIIIZZ(view.getId(), 6, 0, 6);
                c19mb.LJIIIIZZ(view.getId(), 7, 0, 7);
                c19mb.LJIIIIZZ(view.getId(), 3, 0, 3);
                c19mb.LJIIIIZZ(view.getId(), 4, 0, 4);
                c19mb.LIZIZ(constraintLayout);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.ActivityC2186501Ahk
    public final void LJIIL() {
        View view = this.LLJJJIL;
        if (view != null) {
            C786410Ut5.LJJLI(view, (ConstraintLayout) findViewById(R.id.dfi));
        }
    }

    @Override // X.ActivityC2186501Ahk
    public final void LLZ() {
        try {
            this.LLJJLIIIJLLLLLLLZ.cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        super.LLZ();
    }

    @Override // X.ActivityC2186501Ahk, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        this.LLJI.LIZ();
        C2186511Ahl c2186511Ahl = this.LLJIJIL.LIZIZ;
        if (c2186511Ahl.LLILLJJLI != null) {
            try {
                C1300690jx5.LJ(c2186511Ahl.LL, c2186511Ahl, CertProviderManagerKt.findCert("bpea-ocr_sensor_accelerater", 1476415500));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            this.LLJJLIIIJLLLLLLLZ.cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        super.onPause();
    }

    @Override // X.ActivityC2186501Ahk
    public final void LLZLI() {
        super.LLZLI();
        C2186521Ahm c2186521Ahm = this.LLJI;
        int visibility = c2186521Ahm.getVisibility();
        c2186521Ahm.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c2186521Ahm);
        try {
            this.LLJJLIIIJLLLLLLLZ.cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        PthreadTimer pthreadTimer = new PthreadTimer("CardOcrActivity");
        pthreadTimer.schedule(new C1339170kx9(this, 2), this.LLJJJJLIIL);
        this.LLJJLIIIJLLLLLLLZ = pthreadTimer;
    }

    @Override // X.ActivityC2186501Ahk, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
        LLLZLZ();
        try {
            this.LLJJLIIIJLLLLLLLZ.cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        PthreadTimer pthreadTimer = new PthreadTimer("CardOcrActivity");
        pthreadTimer.schedule(new C1339170kx9(this, 2), this.LLJJJJLIIL);
        this.LLJJLIIIJLLLLLLLZ = pthreadTimer;
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

    @Override // X.ActivityC2186501Ahk
    public final void LLZZLLIL(String str) {
        runOnUiThread(new ARunnableS37S1100000_33(this, str, 0));
    }

    public final int b(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final Activity f(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x033e  */
    @Override // X.ActivityC2186501Ahk, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ocr.view.CardOcrActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC2186501Ahk, android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            float f = fArr[0];
            if (!this.LLJJ) {
                if (f > DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) {
                    View view = this.LLJJJ;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(4, view);
                    }
                    C786410Ut5.LLILIL(this.LLJJIJIL, 4);
                    return;
                }
                View view2 = this.LLJJJ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                C786410Ut5.LLILIL(this.LLJJIJIL, 0);
                return;
            }
            View view3 = this.LLJJJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            C786410Ut5.LLILIL(this.LLJJIJIL, 0);
        }
    }

    @Override // X.ActivityC2186501Ahk
    public final void LLLZ(int i, int i2, String str, g gVar, String str2) {
        g gVar2 = gVar;
        if (i == 1) {
            if (gVar2 == null) {
                gVar2 = new g(null, 511);
            }
            b bVar = new b() { // from class: X.1Ahi
                @Override // eo5.b
                public final void LIZ(int i3, int i4, String str3, g gVar3, String str4) {
                    super/*X.1Ahk*/.LLLZ(i3, i4, str3, gVar3, str4);
                }
            };
            oo5.b.LJIJJLI.getClass();
            oo5.b.LJIJ = 0;
            long j = this.LLJJL;
            Object objF2 = C786410Ut5.F2(this, "vibrator");
            if (objF2 != null) {
                ((Vibrator) objF2).vibrate(j);
                runOnUiThread(new RunnableC2186431Ahd(this, gVar2, false, str2, bVar));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        super.LLLZ(i, i2, str, gVar2, str2);
    }
}
