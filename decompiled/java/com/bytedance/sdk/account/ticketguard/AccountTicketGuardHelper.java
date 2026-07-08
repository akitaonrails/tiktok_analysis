package com.bytedance.sdk.account.ticketguard;

import X.C0XNL;
import X.C847410XMd;
import android.content.Context;
import com.bytedance.android.sdk.ticketguard.ILogger;
import com.bytedance.android.sdk.ticketguard.IMonitor;
import com.bytedance.android.sdk.ticketguard.TicketGuardFramework;
import com.bytedance.android.sdk.ticketguard.TicketGuardInitParam;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AccountTicketGuardHelper {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0XMr] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0XMq] */
    public static void initTicketGuard(final Context context, final long j, Function1<Boolean, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(72064);
        final ?? r4 = new ILogger() { // from class: X.0XMr
            @Override // com.bytedance.android.sdk.ticketguard.ILogger
            public final void log(String str, String str2) {
                C847400XMc.LJIIIZ(str, str2);
            }
        };
        final ?? r5 = new IMonitor() { // from class: X.0XMq
            @Override // com.bytedance.android.sdk.ticketguard.IMonitor
            public final void onEvent(String str, JSONObject jSONObject) {
                C0XMZ.LJIIJ(str, jSONObject);
            }
        };
        TicketGuardFramework.tryInit(new TicketGuardInitParam() { // from class: X.0XMn
            @Override // com.bytedance.android.sdk.ticketguard.TicketGuardInitParam
            public final Context getApplicationContext() {
                return C786410Ut5.N3(context);
            }

            @Override // com.bytedance.android.sdk.ticketguard.TicketGuardInitParam
            public final long getAppStartTimeMs() {
                return j;
            }

            @Override // com.bytedance.android.sdk.ticketguard.TicketGuardInitParam
            public final ILogger getLogger() {
                return r4;
            }

            @Override // com.bytedance.android.sdk.ticketguard.TicketGuardInitParam
            public final IMonitor getMonitor() {
                return r5;
            }
        }, function1, C847410XMd.LJI);
        C847410XMd.LIZ();
        C0XNL.LIZ = C847410XMd.LIZJ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
