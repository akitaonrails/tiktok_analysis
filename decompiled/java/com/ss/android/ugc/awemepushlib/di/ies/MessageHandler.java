package com.ss.android.ugc.awemepushlib.di.ies;

import X.C20684815ws;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808570Vnj;
import X.C808590Vnl;
import X.C817700W5w;
import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class MessageHandler extends MessageReceiverService {
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
    public final void onHandleMessage(Context context, int i, String str, int i2, String str2) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("context = [");
        sbLIZ.append(context);
        sbLIZ.append("], type = [");
        sbLIZ.append(i);
        sbLIZ.append("], obj = [");
        sbLIZ.append(str);
        sbLIZ.append("], from = [");
        sbLIZ.append(i2);
        sbLIZ.append("], extra = [");
        sbLIZ.append(str2);
        sbLIZ.append(e3.f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append("");
            jSONObject.put("receive_time", C2188811AlT.LIZIZ(sbLIZ2));
            jSONObject.put("message", strLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIJ("push_receive_in_mt", jSONObject);
        C808590Vnl.LIZ.LIZ(2);
        C808570Vnj.LIZ.getClass();
        MessageShowHandler.LIZJ(context, i, str, i2);
    }
}
