package com.google.android.gms.common;

import X.AbstractDialogInterfaceOnClickListenerC829200Wfu;
import X.C829090Wfj;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes14.dex */
public final class GooglePlayServicesUtil extends C829090Wfj {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C829090Wfj.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static String getErrorString(int i) {
        return C829090Wfj.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C829090Wfj.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C829090Wfj.getRemoteResource(context);
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        return C829090Wfj.isGooglePlayServicesAvailable(context);
    }

    public static boolean isUserRecoverableError(int i) {
        return C829090Wfj.isUserRecoverableError(i);
    }

    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C829090Wfj.isGooglePlayServicesAvailable(context, i);
    }

    public static void showErrorNotification(int i, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (!C829090Wfj.isPlayServicesPossiblyUpdating(context, i) && !C829090Wfj.isPlayStorePossiblyUpdating(context, i)) {
            googleApiAvailability.showErrorNotification(context, i);
        } else {
            googleApiAvailability.zaf(context);
        }
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C829090Wfj.getErrorPendingIntent(i, context, i2);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (true == C829090Wfj.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, final Fragment fragment, final int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (true == C829090Wfj.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i, i2, onCancelListener);
        }
        final Intent errorResolutionIntent = GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i, "d");
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i, new AbstractDialogInterfaceOnClickListenerC829200Wfu() { // from class: X.0Wfn
            @Override // X.AbstractDialogInterfaceOnClickListenerC829200Wfu
            public final void LIZ() throws Throwable {
                Intent intent = errorResolutionIntent;
                if (intent != null) {
                    Fragment fragment2 = fragment;
                    int i3 = i2;
                    C1701330uNH.LIZ(intent, fragment2);
                    C2204961BRm.LLJL(fragment2, intent, i3, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCOLFl82r4DBRtwsla", new String[]{"016a9"}));
                }
            }
        }, onCancelListener);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
