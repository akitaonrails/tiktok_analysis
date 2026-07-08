package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC813050Vux;
import X.C0CCZ;
import X.C0VZ0;
import X.C813060Vuy;
import X.C829530WgR;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.trill.abtest.impl.NotificationBroadcastReceiver;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class InitAbTest implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAbTest";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C813060Vuy c813060VuyLIZ = C813060Vuy.LIZ();
        ((HashMap) c813060VuyLIZ.LIZ).put("attract_user_without_login_back", new C829530WgR());
        C813060Vuy c813060VuyLIZ2 = C813060Vuy.LIZ();
        ((HashMap) c813060VuyLIZ2.LIZ).put("attract_user_without_login_home", new AbstractC813050Vux<Boolean>() { // from class: X.0Vw6
            @Override // X.AbstractC813050Vux
            public final Boolean LIZIZ() {
                return Boolean.FALSE;
            }

            @Override // X.AbstractC813050Vux
            public final boolean LIZ(Boolean bool) {
                Bitmap bitmap;
                Boolean bool2 = bool;
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    C844470XAv.LIZ.getClass();
                    NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(C844470XAv.LIZ(), "notification");
                    if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                        notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
                    }
                }
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    return false;
                }
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                if (c19259110Wf.LJJIFFI == null) {
                    c19259110Wf.LJJIFFI = new C2230608oa<>("attract_user_without_notification", Boolean.FALSE);
                }
                if (c19259110Wf.LJJIFFI.LIZ().booleanValue() || !bool2.booleanValue()) {
                    return false;
                }
                C844470XAv.LIZ.getClass();
                NotificationManager notificationManager2 = (NotificationManager) C786410Ut5.H2(C844470XAv.LIZ(), "notification");
                Intent intent = new Intent(C844470XAv.LIZ(), (Class<?>) NotificationBroadcastReceiver.class);
                intent.setAction("notification_clicked");
                intent.putExtra("type", 1);
                PendingIntent broadcast = PendingIntent.getBroadcast(C844470XAv.LIZ(), 0, intent, 1140850688);
                if (i >= 26) {
                    String string = C844470XAv.LIZ().getString(2131847795);
                    if (notificationManager2 != null && notificationManager2.getNotificationChannel("other_channel") == null) {
                        NotificationChannel notificationChannel = new NotificationChannel("other_channel", string, 4);
                        notificationChannel.enableLights(true);
                        notificationChannel.enableVibration(true);
                        notificationChannel.setLockscreenVisibility(1);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.setLightColor(-16711936);
                        notificationManager2.createNotificationChannel(notificationChannel);
                    }
                }
                C813610Vvr c813610Vvr = new C813610Vvr(C844470XAv.LIZ(), "other_channel");
                c813610Vvr.LJJIIZI.icon = R.drawable.status_icon_l;
                Drawable drawable = C844470XAv.LIZ().getResources().getDrawable(R.drawable.dgk);
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    bitmap = null;
                }
                c813610Vvr.LJIIIIZZ(bitmap);
                c813610Vvr.LJFF(C844470XAv.LIZ().getString(R.string.dri));
                c813610Vvr.LJ(C844470XAv.LIZ().getString(2131826721));
                c813610Vvr.LJI = broadcast;
                if (notificationManager2 != null) {
                    notificationManager2.notify(1, c813610Vvr.LIZIZ());
                }
                if (c19259110Wf.LJJIFFI == null) {
                    c19259110Wf.LJJIFFI = new C2230608oa<>("attract_user_without_notification", Boolean.FALSE);
                }
                c19259110Wf.LJJIFFI.LJ(Boolean.TRUE);
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setLabelName("show");
                mobClickObtain.setEventName("recall_push");
                C20684815ws.onEvent(mobClickObtain);
                return true;
            }
        });
    }
}
