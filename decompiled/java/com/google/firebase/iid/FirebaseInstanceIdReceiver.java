package com.google.firebase.iid;

import X.C089N;
import X.C13WZ;
import X.C809750Vpd;
import X.C810890VrT;
import X.C811600Vsc;
import X.C814140Vwi;
import X.C818260W8a;
import X.C835460Wq0;
import X.EnumC809870Vpp;
import X.EnumC818290W8d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes14.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    public static int LIZ(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) C835460Wq0.LIZ(new C811600Vsc(context).LIZLLL(cloudMessage.zza))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        C13WZ c13wz = C089N.LIZ;
        if (c13wz.LJFF && c13wz.LIZLLL("FirebaseInstanceIdReceiver#onMessageReceive")) {
            HashMap map = new HashMap();
            map.put("FirebaseInstanceIdReceiver", "onMessageReceive");
            c13wz.LJIIL(map);
        }
        if (C809750Vpd.LIZ()) {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJIJ("from_cloud_to_firebase", "", false);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            C818260W8a.LJI("FirebaseInstanceIdReceiver.onMessageReceive() lancet hook", EnumC809870Vpp.FIREBASE, EnumC818290W8d.INFO);
            c810890VrT.LJ("FirebaseInstanceIdReceiver_onMessageReceive", true);
            int iLIZ = LIZ(context, cloudMessage);
            c810890VrT.LJIJ("FirebaseInstanceIdReceiver_onMessageReceive", "", false);
            c810890VrT.LJ("from_firebase_to_fcm", false);
            return iLIZ;
        }
        return LIZ(context, cloudMessage);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C814140Vwi.LIZJ(intentPutExtras)) {
            C814140Vwi.LIZIZ(C814140Vwi.LIZ(intentPutExtras), "_nd");
        }
    }
}
