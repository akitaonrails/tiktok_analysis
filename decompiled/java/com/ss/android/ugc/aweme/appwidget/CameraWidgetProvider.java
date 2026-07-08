package com.ss.android.ugc.aweme.appwidget;

import X.C08RN;
import X.C0LAB;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2341909Fp;
import X.C2408409cA;
import X.C573740Meq;
import X.C788530UwV;
import X.InterfaceC2342209Fs;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CameraWidgetProvider extends AppWidgetProvider {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider.LIZIZ(android.content.Context):void");
    }

    public final void LIZ(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        super.onReceive(context, intent);
        C08RN.LIZ(context);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 452171151) {
                    if (iHashCode == 1619576947 && action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                        LIZIZ(context);
                        return;
                    }
                    return;
                }
                if (!action.equals("android.appwidget.action.APPWIDGET_DELETED")) {
                    return;
                }
                C573740Meq.LIZ().storeBoolean("widget_current_install", false);
                return;
            }
            String str = "";
            if (!action.equals("")) {
                return;
            }
            LIZIZ(context);
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            try {
                stringExtra2 = intent.getStringExtra("shoot_way");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            try {
                stringExtra3 = intent.getStringExtra("creation_id");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            try {
                String stringExtra4 = intent.getStringExtra(Scene.SCENE_SERVICE);
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", stringExtra);
            c0lab.LJ("shoot_way", stringExtra2);
            c0lab.LJ("creation_id", stringExtra3);
            c0lab.LJ(Scene.SCENE_SERVICE, str);
            c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "add");
            C2341909Fp.LIZ("click_add_camera_popup_system", c0lab.LIZ);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
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
