package com.ss.android.ugc.aweme.push.downgrade;

import X.C0CCZ;
import X.C0VZ0;
import X.C0WZX;
import X.C2104108Md;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NotifyPushStatusTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NotifyPushStatusTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 34;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String strLIZ = C2104108Md.LIZ(context);
        if (!TextUtils.isEmpty(strLIZ)) {
            if (strLIZ.endsWith(":push") || strLIZ.endsWith(":pushservice")) {
                try {
                    List<ActivityManager.RunningAppProcessInfo> listLJII = C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9cJeA2D2KX4OBVCB8cclZ5NdK4VnKbwpttj6Xj3ACneAR", null));
                    if (listLJII != null) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
                            if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName) && TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName())) {
                                try {
                                    C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://" + context.getPackageName() + ".push.status"), "", strLIZ, new Bundle(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9cJeA2D2KX4OBVCB8cclZ5NdK4VnKbwpttj6Xj3ACneAR", null));
                                    return;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    return;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }
}
