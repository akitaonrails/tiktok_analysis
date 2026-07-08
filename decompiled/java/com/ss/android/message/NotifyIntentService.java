package com.ss.android.message;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes4.dex */
public class NotifyIntentService extends IntentService {
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
