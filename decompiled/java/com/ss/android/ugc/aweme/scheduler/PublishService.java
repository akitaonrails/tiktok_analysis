package com.ss.android.ugc.aweme.scheduler;

import X.AbstractC1433570nPP;
import X.C0CHQ;
import X.C0EMD;
import X.C0LAB;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1206004ni;
import X.C1433650nPX;
import X.C1433730nPf;
import X.C1437510nVl;
import X.C1439040nYE;
import X.C1444780nhU;
import X.C15O7;
import X.C20684815ws;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C260580AJc;
import X.C294840Bh4;
import X.C788530UwV;
import X.C790050Uyx;
import X.C813610Vvr;
import X.C817700W5w;
import X.C991190btt;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS76S0301000_22;
import kotlin.jvm.internal.AwS85S1300000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishService extends Service {
    public static final List<Integer> LLILLJJLI = new ArrayList();
    public int LL = -1;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1444780nhU.LIZLLL("onCreate");
        C1444780nhU.LIZJ(this);
        try {
            if (((Boolean) C260580AJc.LIZ.getValue()).booleanValue() || Build.VERSION.SDK_INT < 34) {
                Notification notificationLIZLLL = LIZLLL(this, null, 0.0f);
                if (C294840Bh4.LIZ()) {
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("service info---->:");
                    sbLIZ.append(PublishService.class.getCanonicalName());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                startForeground(10001, notificationLIZLLL);
            } else {
                startForeground(10001, LIZLLL(this, null, 0.0f), 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1444780nhU.LIZLLL("onCreate startForeground done");
        C1439040nYE.LIZ.getClass();
        C1439040nYE.LIZIZ = this;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(81, "publish_step");
        c0lab.LJ("network_available", C790050Uyx.LIZ(C0CHQ.LIZ) ? "1" : CardStruct.IStatusCode.DEFAULT);
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("parallel_publish_result", c0lab.LIZ);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1439040nYE.LIZ.getClass();
        C1439040nYE.LIZIZ = null;
        C1444780nhU.LIZLLL("PublishService onDestroy");
    }

    public final void LIZ(final String str) {
        final PublishModel publishModelLJIILJJIL = C1433730nPf.LJIILJJIL(str);
        final Bitmap bitmapLJIIIIZZ = null;
        if (publishModelLJIILJJIL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishForegroundService ");
            sbLIZ.append("PublishService onStartCommand findPublishModel null");
            C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
            LJ(str, null, 1);
            return;
        }
        if (str != null) {
            final String str2 = publishModelLJIILJJIL.creationId;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStartCommand findCreationId:");
            sbLIZ2.append(str2);
            C1444780nhU.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            try {
                bitmapLJIIIIZZ = C1433730nPf.LJIIIIZZ(publishModelLJIILJJIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bitmapLJIIIIZZ == null) {
                String str3 = "null cover creationId:" + publishModelLJIILJJIL.creationId;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("PublishForegroundService ");
                sbLIZ3.append(str3);
                C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ3));
            }
            C991190btt.LIZ.put(str, 0);
            C1433730nPf.LIZ(str, new AbstractC1433570nPP() { // from class: X.0nhT
                @Override // X.AbstractC1433570nPP
                public final void onProgress(int i, Object obj) {
                    C1434900nRY c1434900nRY;
                    int i2 = i;
                    String str4 = str;
                    Map<String, Integer> map = C991190btt.LIZ;
                    Integer num = (Integer) ((LinkedHashMap) map).get(str4);
                    if (num != null) {
                        map.put(str4, Integer.valueOf(num.intValue() + 1));
                    }
                    try {
                        if ((obj instanceof C1434900nRY) && (c1434900nRY = (C1434900nRY) obj) != null && c1434900nRY.LJ) {
                            i2 = ((C1434900nRY) obj).LJFF;
                        }
                        PublishService publishService = this;
                        publishService.LJFF(10001, new AwS76S0301000_22(publishService, i2, bitmapLJIIIIZZ, publishModelLJIILJJIL, 0));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C201955140j.LJI("PublishForegroundService", e2);
                    }
                }

                @Override // X.AbstractC1433570nPP
                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onFinish result:");
                    sbLIZ4.append(abstractC1433460nPE);
                    C1444780nhU.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
                    int iLJIILL = C1433730nPf.LJIILL();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("remain task count: ");
                    sbLIZ5.append(iLJIILL);
                    C1444780nhU.LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                    if (iLJIILL <= 0) {
                        PublishService publishService = this;
                        publishService.stopSelf(publishService.LL);
                    }
                    C1433730nPf.LJJ(str, this);
                    if (abstractC1433460nPE instanceof C492390JSr) {
                        int iHashCode = str2.hashCode();
                        PublishService publishService2 = this;
                        publishService2.LJFF(iHashCode, new AwS266S0300000_22(publishService2, bitmapLJIIIIZZ, publishModelLJIILJJIL, 3));
                        ((ArrayList) PublishService.LLILLJJLI).add(Integer.valueOf(iHashCode));
                        return;
                    }
                    if (!(abstractC1433460nPE instanceof C1433450nPD)) {
                        return;
                    }
                    if (!ComplianceServiceProvider.LJFF().LIZJ(1)) {
                        int iHashCode2 = str2.hashCode();
                        PublishService publishService3 = this;
                        publishService3.LJFF(iHashCode2, new AwS85S1300000_22(publishService3, str2, bitmapLJIIIIZZ, publishModelLJIILJJIL, 0));
                        ((ArrayList) PublishService.LLILLJJLI).add(Integer.valueOf(iHashCode2));
                        return;
                    }
                    new C815520Vyw(this).LIZIZ(10001, null);
                }
            });
            LJ(str, publishModelLJIILJJIL, 2);
            return;
        }
        throw new IllegalArgumentException("publish id is null while starting publish service");
    }

    @Override // android.app.Service, android.content.ContextWrapper
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

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/scheduler/PublishService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmra5rKyT4H/VlLXJwK47x9HKwR8nCR8A==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static final Bitmap LIZIZ(Bitmap bitmap, PublishModel publishModel) {
        if (bitmap == null && C1206004ni.LIZ(16)) {
            try {
                return C1433730nPf.LJIIIIZZ(publishModel);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return bitmap;
    }

    public final void LJFF(final int i, final Function0 function0) {
        C15O7.LIZJ(new Callable() { // from class: X.0nhW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PublishService@53fa.showNotificationAsync$1");
                new C815520Vyw(this).LIZJ(i, function0.invoke());
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PublishService@53fa.showNotificationAsync$1");
                return unit;
            }
        });
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZLLL("PublishForegroundService", new AwS566S0100000_22(this, 1050));
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("PublishService", "publish service timeout, stop self: true");
        stopSelf();
    }

    public static void LJ(String str, PublishModel publishModel, int i) {
        BaseShortVideoContext baseShortVideoContext;
        String str2;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        }
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel);
        c0labLJFF.LIZ(80, "publish_step");
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("network_available", str2);
        c0labLJFF.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (videoPublishEditModel != null) {
            c0labLJFF.LJ("retry_publish", publishModel.LIZ());
            c0labLJFF.LJ("creation_id", videoPublishEditModel.getCreationId());
        }
        c0labLJFF.LJ("publish_id", str);
        C20684815ws.LJIILLIIL("parallel_publish_result", c0labLJFF.LIZ);
    }

    public final Notification LIZLLL(Context context, Bitmap bitmap, float f) {
        boolean z;
        int i = (int) (100 * f);
        String string = context.getString(2131857961);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        C813610Vvr c813610VvrLIZJ = LIZJ(this, context, string, C2188811AlT.LIZIZ(sbLIZ), bitmap);
        int iMin = Math.min(100, i);
        c813610VvrLIZJ.LJIILJJIL = 100;
        c813610VvrLIZJ.LJIILL = iMin;
        boolean z2 = false;
        c813610VvrLIZJ.LJIILLIIL = false;
        Notification notificationLIZIZ = c813610VvrLIZJ.LIZIZ();
        if (!C1433650nPX.LIZ() && Build.VERSION.SDK_INT < 31) {
            z = false;
        } else {
            z = true;
        }
        if (z && Build.VERSION.SDK_INT >= 31) {
            try {
                Reflect.on(notificationLIZIZ).set("mFgsDeferBehavior", 1);
                z2 = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("forceImmediate=");
        sbLIZ2.append(z2);
        c1437510nVlLJJLIIIJ.LIZJ("PublishForegroundService", C2188811AlT.LIZIZ(sbLIZ2));
        return notificationLIZIZ;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        super.onStartCommand(intent, i, i2);
        C1444780nhU.LIZLLL("onStartCommand");
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("PUBLISH_ID");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        LIZ(stringExtra);
        this.LL = i2;
        return 2;
    }

    public static C813610Vvr LIZJ(PublishService publishService, Context context, String str, String str2, Bitmap bitmap) {
        publishService.getClass();
        C813610Vvr c813610Vvr = new C813610Vvr(context, "com.ss.android.ugc.trill.publish");
        c813610Vvr.LJFF(str);
        c813610Vvr.LJ(str2);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJI = PendingIntent.getActivity(publishService, 5, context.getPackageManager().getLaunchIntentForPackage(publishService.getPackageName()), 67108864);
        c813610Vvr.LJJIIZI.icon = 2130971827;
        c813610Vvr.LJIIIIZZ(bitmap);
        return c813610Vvr;
    }
}
