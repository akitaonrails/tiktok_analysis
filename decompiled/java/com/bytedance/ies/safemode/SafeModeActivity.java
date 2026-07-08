package com.bytedance.ies.safemode;

import X.C0WT0;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C19GS;
import X.C2203541BMa;
import X.C2203571BMd;
import X.C786410Ut5;
import X.C805560Vis;
import X.C823670WSv;
import X.C823690WSx;
import X.InterfaceC803940VgG;
import Y.AObjectS129S0000000_34;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SafeModeActivity extends C19GS {
    public static String LL = "";
    public static String LLILLJJLI = "";
    public static int LLILLL = -1;
    public static InterfaceC803940VgG LLILZ = null;
    public static SafeModeActivity LLILZIL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyQqLCHELIOSI8LCBiGi41LQgjLSoSKzElPyYnMQ==";

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
        String stringExtra;
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.k5);
        LLILZIL = this;
        String stringExtra2 = null;
        try {
            stringExtra = getIntent().getStringExtra("crashType");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        LL = stringExtra;
        try {
            stringExtra2 = getIntent().getStringExtra("crashStack");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LLILLJJLI = stringExtra2;
        LLILLL = getIntent().getIntExtra("reachType", -1);
        C0WT0 c0wt0 = C2203571BMd.LJIILLIIL.LIZIZ;
        if (c0wt0 != null) {
            String str = LL;
            String str2 = LLILLJJLI;
            Context context = ((C823690WSx) c0wt0).LIZ;
            Thread threadU3 = C786410Ut5.u3();
            Throwable th = new Throwable(str2);
            C823670WSv.LIZ = context;
            C823670WSv.LIZJ = true;
            C823670WSv.LJIIIIZZ.uncaughtException(threadU3, th);
            C823690WSx.LJI(str, str2, "LaunchProtectShowDialog");
        }
        SafeModeReporter.CrashInfo crashInfoLIZIZ = SafeModeReporter.CrashInfo.LIZIZ(LL, LLILLJJLI);
        int i = LLILLL;
        Gson gson = SafeModeReporter.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfoLIZIZ.LIZLLL());
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        SafeModeReporter.LIZLLL("safemode_dialog_show_v2", jSONObject);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C805560Vis c805560Vis = C2203541BMa.LIZ;
        synchronized (C2203541BMa.class) {
            C2203541BMa.LIZ.LJII(jCurrentTimeMillis, "boot_protected_time_stamp");
        }
        if (LLILZ != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.xm);
            C1397580mTM c1397580mTM = new C1397580mTM(contextThemeWrapper);
            c1397580mTM.LJFF(2131826359);
            c1397580mTM.LIZ(2131826358);
            C1397620mTQ c1397620mTQ = new C1397620mTQ(contextThemeWrapper);
            c1397620mTQ.LJFF(2131826357, new AObjectS129S0000000_34(0));
            c1397620mTQ.LJII(2131826355, new AObjectS129S0000000_34(1));
            c1397580mTM.LJIIL = c1397620mTQ;
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final int i2 = 0;
        AlertDialog.Builder positiveButton = builder.setMessage(2131826358).setPositiveButton(2131826357, new DialogInterface.OnClickListener(i2) { // from class: X.1D0x
            public final int $t;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                switch (this.$t) {
                    case 0:
                        C1BMW.LIZIZ();
                        break;
                    case 1:
                        C1BMW.LIZ();
                        break;
                }
            }

            {
                this.$t = i2;
            }
        });
        final int i3 = 1;
        positiveButton.setNegativeButton(2131826355, new DialogInterface.OnClickListener(i3) { // from class: X.1D0x
            public final int $t;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i32) {
                switch (this.$t) {
                    case 0:
                        C1BMW.LIZIZ();
                        break;
                    case 1:
                        C1BMW.LIZ();
                        break;
                }
            }

            {
                this.$t = i3;
            }
        });
        C786410Ut5.A4(builder.create());
    }
}
