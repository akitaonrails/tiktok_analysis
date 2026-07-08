package com.bytedance.android.livesdk.game.broadcast.mirror.activity;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C817700W5w;
import X.EnumC785640Urq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.byted.cast.usbsource.usbdisplaysource.UsbSourceActivity;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes8.dex */
public final class UsbSourceProxyActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiJCYhOio+Zy4wPCw6IDsqZhA/Kxw8PTcvLB8hJz01CCwnITMlPTY=";

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        super.onCreate(bundle);
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other")) {
            finish();
            return;
        }
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, (Class<?>) UsbSourceActivity.class);
        intent2.setAction(intent.getAction());
        Parcelable parcelableExtra = intent.getParcelableExtra("accessory");
        if (!(parcelableExtra instanceof UsbAccessory)) {
            parcelableExtra = null;
        }
        intent2.putExtra("accessory", parcelableExtra);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, this);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5JdF18j+J2v0y6NDgrSB09Cwd0g7uBk7BsWT64lzpta3yGqsUKCU=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/android/livesdk/game/broadcast/mirror/activity/UsbSourceProxyActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/android/livesdk/game/broadcast/mirror/activity/UsbSourceProxyActivity", "startActivity", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                }
            } else {
                activity = this;
            }
            activity.startActivity(intent2);
            c0wst.LIZ(11098, "com/bytedance/android/livesdk/game/broadcast/mirror/activity/UsbSourceProxyActivity", "startActivity", null, objArr, activity, c0wzw, true);
        }
        finish();
    }
}
