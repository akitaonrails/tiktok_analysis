package com.google.android.gms.common;

import X.AbstractC2420509e7;
import X.AbstractC835450Wpz;
import X.AbstractDialogInterfaceOnClickListenerC829200Wfu;
import X.C0W3J;
import X.C19EG;
import X.C2420409e6;
import X.C786410Ut5;
import X.C800310VaP;
import X.C811660Vsi;
import X.C812470Vu1;
import X.C813610Vvr;
import X.C813730Vw3;
import X.C829090Wfj;
import X.C829100Wfk;
import X.C829120Wfm;
import X.C829210Wfv;
import X.C829290Wg3;
import X.C831040Wis;
import X.C831420WjU;
import X.DialogFragmentC829220Wfw;
import X.InterfaceC829320Wg6;
import X.InterfaceC831130Wj1;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleApiAvailability extends C829100Wfk {
    public String zac;
    public static final Object zaa = new Object();
    public static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C829100Wfk.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @Override // X.C829100Wfk
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // X.C829100Wfk
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // X.C829100Wfk
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public final void zaf(Context context) {
        C786410Ut5.LJLJJI(1, 120000L, new zac(this, context));
    }

    public static final AbstractC835450Wpz<Map<C831420WjU<?>, String>> zai(InterfaceC829320Wg6<?> interfaceC829320Wg6, InterfaceC829320Wg6<?>... interfaceC829320Wg6Arr) {
        C831040Wis c831040Wis;
        C0W3J.LJIIIZ(interfaceC829320Wg6, "Requested API must not be null.");
        for (InterfaceC829320Wg6<?> interfaceC829320Wg62 : interfaceC829320Wg6Arr) {
            C0W3J.LJIIIZ(interfaceC829320Wg62, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC829320Wg6Arr.length + 1);
        arrayList.add(interfaceC829320Wg6);
        arrayList.addAll(Arrays.asList(interfaceC829320Wg6Arr));
        synchronized (C831040Wis.LLJJIJI) {
            try {
                C0W3J.LJIIIZ(C831040Wis.LLJJIJIIJIL, "Must guarantee manager is non-null before using getInstance");
                c831040Wis = C831040Wis.LLJJIJIIJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c831040Wis.getClass();
        C829290Wg3 c829290Wg3 = new C829290Wg3(arrayList);
        zaq zaqVar = c831040Wis.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(2, c829290Wg3));
        return c829290Wg3.LIZJ.LIZ;
    }

    public AbstractC835450Wpz<Void> checkApiAvailability(InterfaceC829320Wg6<?> interfaceC829320Wg6, InterfaceC829320Wg6<?>... interfaceC829320Wg6Arr) {
        return zai(interfaceC829320Wg6, interfaceC829320Wg6Arr).LJIILL();
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.LJLZ()) {
            return connectionResult.zzc;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.zzb, 0);
    }

    @Override // X.C829100Wfk
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public void showErrorNotification(Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        C786410Ut5.LLIIJLIL(progressBar, 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C829210Wfv.LIZJ(18, activity));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C2420409e6 zac(Context context, AbstractC2420509e7 abstractC2420509e7) throws Exception {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2420409e6 c2420409e6 = new C2420409e6(abstractC2420509e7);
        C786410Ut5.LJIJJ(context, c2420409e6, intentFilter);
        c2420409e6.LIZ = context;
        if (!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            abstractC2420509e7.LIZ();
            synchronized (c2420409e6) {
                Context context2 = c2420409e6.LIZ;
                if (context2 != null) {
                    C786410Ut5.LJJIFFI(context2, c2420409e6);
                }
                c2420409e6.LIZ = null;
            }
            return null;
        }
        return c2420409e6;
    }

    @Override // X.C829100Wfk
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // X.C829100Wfk
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (C812470Vu1.LIZ(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        int i2 = connectionResult.zzb;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", errorResolutionPendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        zae(context, i2, null, PendingIntent.getActivity(context, 0, intent, C800310VaP.LIZ | 134217728));
        return true;
    }

    public Dialog getErrorDialog(final Activity activity, int i, final int i2, DialogInterface.OnCancelListener onCancelListener) {
        final Intent errorResolutionIntent = getErrorResolutionIntent(activity, i, "d");
        return zaa(activity, i, new AbstractDialogInterfaceOnClickListenerC829200Wfu() { // from class: X.0Wft
            @Override // X.AbstractDialogInterfaceOnClickListenerC829200Wfu
            public final void LIZ() throws Throwable {
                Intent intent = errorResolutionIntent;
                if (intent != null) {
                    Activity activity2 = activity;
                    int i3 = i2;
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                    C1701330uNH.LIZ(intent, activity2);
                    C2204961BRm.LJIIZILJ(i3, activity2, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCOLFl82r4DBRtwslb", new String[]{"016a9"}));
                }
            }
        }, onCancelListener);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog zaa(Context context, int i, AbstractDialogInterfaceOnClickListenerC829200Wfu abstractDialogInterfaceOnClickListenerC829200Wfu, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C829210Wfv.LIZJ(i, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strLIZIZ = C829210Wfv.LIZIZ(i, context);
        if (strLIZIZ != null) {
            builder.setPositiveButton(strLIZIZ, abstractDialogInterfaceOnClickListenerC829200Wfu);
        }
        String strLIZLLL = C829210Wfv.LIZLLL(i, context);
        if (strLIZLLL != null) {
            builder.setTitle(strLIZLLL);
        }
        C786410Ut5.j4("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C19EG) {
                FragmentManager supportFragmentManager = ((C19EG) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                C0W3J.LJIIIZ(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                supportErrorDialogFragment.LL = dialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.LLILLJJLI = onCancelListener;
                }
                supportErrorDialogFragment.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC829220Wfw dialogFragmentC829220Wfw = new DialogFragmentC829220Wfw();
        C0W3J.LJIIIZ(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragmentC829220Wfw.LL = dialog;
        if (onCancelListener != null) {
            dialogFragmentC829220Wfw.LLILLJJLI = onCancelListener;
        }
        dialogFragmentC829220Wfw.show(fragmentManager, str);
    }

    public final void zae(Context context, int i, String str, PendingIntent pendingIntent) {
        String strLIZLLL;
        String strLJ;
        int i2;
        String str2;
        C786410Ut5.j4("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        if (i == 6) {
            strLIZLLL = C829210Wfv.LJFF(context, "common_google_play_services_resolution_required_title");
        } else {
            strLIZLLL = C829210Wfv.LIZLLL(i, context);
        }
        if (strLIZLLL == null) {
            strLIZLLL = context.getResources().getString(com.zhiliaoapp.musically.R.string.fq1);
        }
        if (i != 6 && i != 19) {
            strLJ = C829210Wfv.LIZJ(i, context);
        } else {
            strLJ = C829210Wfv.LJ(context, "common_google_play_services_resolution_required_text", C829210Wfv.LIZ(context));
        }
        Resources resources = context.getResources();
        Object objH2 = C786410Ut5.H2(context, "notification");
        C0W3J.LJIIIIZZ(objH2);
        NotificationManager notificationManager = (NotificationManager) objH2;
        C813610Vvr c813610Vvr = new C813610Vvr(context, null);
        c813610Vvr.LJIJI = true;
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJFF(strLIZLLL);
        C813730Vw3 c813730Vw3 = new C813730Vw3();
        c813730Vw3.LJ = C813610Vvr.LIZJ(strLJ);
        c813610Vvr.LJIIJ(c813730Vw3);
        PackageManager packageManager = context.getPackageManager();
        if (C829120Wfm.LIZ == null) {
            C829120Wfm.LIZ = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (C829120Wfm.LIZ.booleanValue()) {
            c813610Vvr.LJJIIZI.icon = context.getApplicationInfo().icon;
            c813610Vvr.LJIIJ = 2;
            if (C829120Wfm.LIZ(context)) {
                c813610Vvr.LIZ(2130970927, resources.getString(2131829330), pendingIntent);
            } else {
                c813610Vvr.LJI = pendingIntent;
            }
        } else {
            c813610Vvr.LJJIIZI.icon = R.drawable.stat_sys_warning;
            c813610Vvr.LJJIIZI.tickerText = C813610Vvr.LIZJ(resources.getString(com.zhiliaoapp.musically.R.string.fq1));
            c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
            c813610Vvr.LJI = pendingIntent;
            c813610Vvr.LJ(strLJ);
        }
        if (C811660Vsi.LIZ()) {
            C0W3J.LJIIJJI(C811660Vsi.LIZ());
            synchronized (zaa) {
                try {
                    str2 = this.zac;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(com.zhiliaoapp.musically.R.string.fq0);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c813610Vvr.LJJII = str2;
        }
        Notification notificationLIZIZ = c813610Vvr.LIZIZ();
        if (i != 1 && i != 2 && i != 3) {
            i2 = 39789;
        } else {
            C829090Wfj.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        }
        notificationManager.notify(i2, notificationLIZIZ);
    }

    public final boolean zag(Activity activity, final InterfaceC831130Wj1 interfaceC831130Wj1, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        final Intent errorResolutionIntent = getErrorResolutionIntent(activity, i, "d");
        Dialog dialogZaa = zaa(activity, i, new AbstractDialogInterfaceOnClickListenerC829200Wfu() { // from class: X.0Wfx
            @Override // X.AbstractDialogInterfaceOnClickListenerC829200Wfu
            public final void LIZ() {
                Intent intent = errorResolutionIntent;
                if (intent != null) {
                    interfaceC831130Wj1.startActivityForResult(intent, 2);
                }
            }
        }, onCancelListener);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
