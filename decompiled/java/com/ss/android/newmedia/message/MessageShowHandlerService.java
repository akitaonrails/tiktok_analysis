package com.ss.android.newmedia.message;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MessageShowHandlerService extends MessageReceiverService {
    public static final WeakHandler LL = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() { // from class: X.0Vng
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    @Override // com.ss.android.newmedia.message.MessageReceiverService, android.app.Service, android.content.ContextWrapper
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

    @Override // com.ss.android.newmedia.message.MessageReceiverService
    public final void onHandleMessage(Context context, int i, final String str, final int i2, final String str2) {
        LL.post(new Runnable() { // from class: X.0Vnh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MessageShowHandlerService@da9a.onHandleMessage$1");
                try {
                    InterfaceC808560Vni interfaceC808560VniLJIILJJIL = C809030VoT.LJIILJJIL();
                    C808680Vnu c808680Vnu = (C808680Vnu) interfaceC808560VniLJIILJJIL;
                    c808680Vnu.LJ(i2, str, str2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MessageShowHandlerService@da9a.onHandleMessage$1");
            }
        });
    }
}
