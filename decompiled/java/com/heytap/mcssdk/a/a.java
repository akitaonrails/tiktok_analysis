package com.heytap.mcssdk.a;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.g;
import com.heytap.mcssdk.utils.i;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, String str, String str2, int i) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification")) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, i));
        return true;
    }

    public void a(final Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        i.a(new Runnable() { // from class: com.heytap.mcssdk.a.a.1
            public void com_heytap_mcssdk_a_a$1__run$___twin___() {
                if (g.f().a()) {
                    return;
                }
                String string = context.getString(2131849519);
                if (TextUtils.isEmpty(string)) {
                    string = "System Default Channel";
                }
                g.f().a(a.this.a(context, "Heytap PUSH", string, 3));
            }

            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("a@2c4f.a$1");
                com_heytap_mcssdk_a_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("a@2c4f.a$1");
            }

            public static void com_heytap_mcssdk_a_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_heytap_mcssdk_a_a$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
