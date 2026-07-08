package com.google.android.gms.common.api;

import X.C0W3J;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C817700W5w;
import X.C831040Wis;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmEwJyHELIOSghJiF9KTUlZwg8JyIgLA4jIQQvPSYlITE1";
    public int LL;

    @Override // android.app.Activity
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) throws Throwable {
        Activity activity;
        int iIntValue = 0;
        this.LL = 0;
        C0WZX c0wzx = new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCMK+rT1ppB9MgFYtoXOF2duEG7JhK", new String[]{"016a9"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    iIntValue = ((Integer) obj2).intValue();
                }
            } else {
                activity = this;
            }
            activity.setResult(iIntValue);
            c0wst.LIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        super.onCreate(bundle);
        if (bundle != null) {
            this.LL = bundle.getInt("resolution");
        }
        if (this.LL != 1) {
            try {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    try {
                        obj = extras.get("pending_intent");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    PendingIntent pendingIntent = (PendingIntent) obj;
                    try {
                        obj2 = extras.get("error_code");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        obj2 = null;
                    } catch (OutOfMemoryError e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        obj2 = null;
                    }
                    Integer num = (Integer) obj2;
                    if (pendingIntent == null) {
                        if (num != null) {
                            C0W3J.LJIIIIZZ(num);
                            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                            this.LL = 1;
                            return;
                        }
                        finish();
                        return;
                    }
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.LL = 1;
                        return;
                    } catch (ActivityNotFoundException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        if (extras.getBoolean("notify_manager", true)) {
                            C831040Wis.LJI(this).LJIIIIZZ(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String string = pendingIntent.toString();
                            StringBuilder sb = new StringBuilder(string.length() + 36);
                            sb.append("Activity not found while launching ");
                            sb.append(string);
                            sb.append(e3.d);
                            String string2 = sb.toString();
                            if (Build.FINGERPRINT.contains("generic")) {
                                string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                        }
                        this.LL = 1;
                        finish();
                        return;
                    } catch (IntentSender.SendIntentException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        finish();
                        return;
                    }
                }
            } catch (Exception e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.LL);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.LL = 0;
            C2204961BRm.LLLLLLJ(this, i2, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCMK+rT1ppB9MgFYtoXOF2duEG7JhK", new String[]{"016a9"}));
            if (booleanExtra) {
                C831040Wis c831040WisLJI = C831040Wis.LJI(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        c831040WisLJI.LJIIIIZZ(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    zaq zaqVar = c831040WisLJI.LLJILLL;
                    C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.LL = 0;
            C2204961BRm.LLLLLLJ(this, i2, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCMK+rT1ppB9MgFYtoXOF2duEG7JhK", new String[]{"016a9"}));
        }
        finish();
    }
}
