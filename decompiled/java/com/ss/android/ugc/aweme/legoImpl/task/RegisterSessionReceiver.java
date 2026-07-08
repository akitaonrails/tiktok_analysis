package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C838410Wul;
import X.C846810XJv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.loginlog.LoginLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.LogManager;

/* JADX INFO: loaded from: classes14.dex */
public class RegisterSessionReceiver implements C0CCZ {
    public final C846810XJv LL = new BroadcastReceiver() { // from class: X.0XJv
        public static void LIZ() {
            C0XQ7.LIZJ().logout("expired_logout", "sdk_expired_logout");
            if (C846820XJw.LIZIZ == null) {
                synchronized (LogManager.class) {
                    try {
                        if (C846820XJw.LIZIZ == null) {
                            C846820XJw.LIZIZ = new C846820XJw();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C846820XJw c846820XJw = C846820XJw.LIZIZ;
            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            c846820XJw.getClass();
            LoginLog loginLog = new LoginLog();
            loginLog.errorDesc = "session_expire";
            loginLog.errorUrl = "";
            loginLog.isSuccess = false;
            loginLog.isLogin = zIsLogin;
            loginLog.platform = "user_login_out";
            loginLog.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
            ArrayList<LoginLog> arrayList = c846820XJw.LIZ;
            if (arrayList != null) {
                arrayList.add(loginLog);
            }
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errorDesc", "session_expire");
            C794420VEi.LIZIZ("aweme_user_logout", "", c2241008qG.LJ());
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                LIZ();
            } else {
                C2408409cA.LIZ();
                LIZ();
            }
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RegisterSessionReceiver";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C0CD2.LJIIZILJ.getValue()).booleanValue() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                C838410Wul.LJFF(context, this.LL, new IntentFilter(), 4);
            } else {
                C838410Wul.LJI(context, this.LL, new IntentFilter(), null, null, 0);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
