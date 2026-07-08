package com.ss.android.ugc.awemepushlib;

import X.C093Y;
import X.C0C64;
import X.C0WZX;
import X.C19266210Yy;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C813990VwT;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class PushDirectReplyReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) throws Throwable {
        String stringExtra;
        if (intent != null && context != null) {
            C19266210Yy.LIZIZ.LIZIZ();
            String stringExtra2 = null;
            try {
                stringExtra = intent.getStringExtra("content_str");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                CharSequence charSequence = resultsFromIntent.getCharSequence("key_text_reply");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PushDirectReplyReceiver.onReceive(");
                sbLIZ.append(stringExtra);
                sbLIZ.append(", ");
                sbLIZ.append(resultsFromIntent);
                sbLIZ.append(", ");
                sbLIZ.append((Object) charSequence);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                if (charSequence != null && charSequence.length() != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(stringExtra);
                    sbLIZ2.append("&reply_text=");
                    sbLIZ2.append(Uri.encode(charSequence.toString()));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    Intent intent2 = new Intent();
                    intent2.putExtra("reply_content_str", strLIZIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(context.getPackageName());
                    sbLIZ3.append(".action.PUSH_DIRECT_REPLY_CONTENT_ACHIEVE");
                    intent2.setAction(C2188811AlT.LIZIZ(sbLIZ3));
                    intent2.setPackage(context.getPackageName());
                    C2204961BRm.LJJJJI(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxKgwRlWR35OfS4p9KCE3iDFlYb2khH3g==", null));
                }
            }
            if (intent.getIntExtra("need_clear_notification_push_id", -1) != -1) {
                int intExtra = intent.getIntExtra("need_clear_notification_push_id", -1);
                PushService pushService = new PushService();
                try {
                    stringExtra2 = intent.getStringExtra("cancel_TAG");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                pushService.clearNotificationId(stringExtra2, context, intExtra);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "push_clear_summary_if_reply", true, false)) {
                    try {
                        String stringExtra3 = intent.getStringExtra("push_groups_id");
                        if (stringExtra3 != null && stringExtra3.length() != 0) {
                            C813990VwT c813990VwT = C813990VwT.LIZ;
                            Set setLJ = C093Y.LJ(stringExtra3);
                            Set setLJ2 = C093Y.LJ(Integer.valueOf(intExtra));
                            c813990VwT.getClass();
                            C813990VwT.LIZ(context, setLJ, setLJ2);
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
