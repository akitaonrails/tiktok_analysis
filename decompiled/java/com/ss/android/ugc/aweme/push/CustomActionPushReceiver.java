package com.ss.android.ugc.aweme.push;

import X.C19266210Yy;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C815730VzH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS432S0200000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomActionPushReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Intent intent) {
        String stringExtra;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("message_extra");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            C19266210Yy.LIZIZ.LIZIZ();
            try {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String strOptString = jSONObject.optString("in_app_push", null);
                if (strOptString != null && TextUtils.equals("live", strOptString)) {
                    C815730VzH.LIZ(new AwS432S0200000_31(intent, jSONObject, 65));
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
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
