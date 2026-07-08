package com.ss.android.message;

import X.C20684815ws;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MessageReceiver extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" MessageReceiver...");
        sbLIZ.append(intent.getAction());
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", "sys_broadcast");
            jSONObject.put("name", "MessageReceiver");
            if (intent.getAction() != null) {
                jSONObject.put("intent_action", intent.getAction());
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIJ("message_receiver_push_process", jSONObject);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
