package com.coloros.service;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C809400Vp4;
import X.C817700W5w;
import android.content.Context;
import android.util.Log;
import com.heytap.msp.push.mode.RemoteMessage;
import com.heytap.msp.push.service.DataMessageCallbackService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class OppoMessageHandleService extends DataMessageCallbackService {
    @Override // com.heytap.msp.push.service.DataMessageCallbackService, android.app.Service, android.content.ContextWrapper
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

    @Override // com.heytap.msp.push.service.DataMessageCallbackService, com.heytap.msp.push.callback.IDataMessageCallBackService
    public final boolean verifyMessage(RemoteMessage remoteMessage) {
        return C809400Vp4.LIZJ("OppoMessageHandleService", remoteMessage.getExtraData());
    }
}
