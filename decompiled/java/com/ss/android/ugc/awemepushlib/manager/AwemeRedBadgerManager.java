package com.ss.android.ugc.awemepushlib.manager;

import X.C0C64;
import X.C0VFK;
import X.C0VFP;
import X.C14EU;
import X.C1619080sEc;
import X.C1903780zdo;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C809340Voy;
import X.C809350Voz;
import X.C810560Vqw;
import X.C814730Vxf;
import X.C814840Vxq;
import X.C827070WcT;
import X.C844470XAv;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwemeRedBadgerManager implements GenericLifecycleObserver {
    public static final AwemeRedBadgerManager LLILLL = new AwemeRedBadgerManager();
    public static String LLILZ;
    public boolean LL;
    public final C0VFK LLILLJJLI = C0VFK.LIZJ();

    public final void LJI() {
        int i;
        int iLJIIIIZZ = C1903780zdo.LJIIIIZZ();
        int i2 = 0;
        if (iLJIIIIZZ > 0) {
            i = iLJIIIIZZ;
            if (iLJIIIIZZ > 99) {
                i = 99;
            }
        } else {
            i = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeRedBadgerManager");
        sbLIZ.append(", inboxNum: ");
        sbLIZ.append(iLJIIIIZZ);
        sbLIZ.append(", redBadgeCount: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            C844470XAv.LIZ.getClass();
            this.LLILLJJLI.LIZIZ(i, C844470XAv.LIZ());
            i2 = 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AwemeRedBadgerManager");
            sbLIZ2.append(" applyCountOrThrow error ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("badge_number", i);
            jSONObject.put("success", i2);
            String strLIZ = LLILZ;
            if (strLIZ == null) {
                C844470XAv.LIZ.getClass();
                strLIZ = LIZ(C844470XAv.LIZ());
            }
            if (strLIZ == null) {
                strLIZ = "";
            }
            jSONObject.put("launcher_package", strLIZ);
            jSONObject.put("show_type", "client_update");
            C20684815ws.LJIJ("red_badge_client_update_show", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static String LIZ(Context context) {
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        String str = LLILZ;
        if (str != null) {
            return str;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            resolveInfoResolveActivity = null;
        }
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            LLILZ = activityInfo.packageName;
        } else {
            LLILZ = "";
        }
        return LLILZ;
    }

    public static void LIZIZ(Context context) {
        try {
            C827070WcT.LIZ.getClass();
            if (!C2093608Ic.LJ(AppLog.getClientId()) && !C2093608Ic.LJ(C827070WcT.LIZJ())) {
                C809350Voz c809350VozLIZ = C809350Voz.LIZ(context);
                String strU2 = C786410Ut5.u2();
                C809340Voy c809340VoyLIZ = c809350VozLIZ.LIZ.LIZ();
                c809340VoyLIZ.LIZIZ.put("rom", strU2);
                c809340VoyLIZ.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.BACKGROUND)
    public void onNoticeCountChangedEvent(C1619080sEc c1619080sEc) {
        boolean zLIZJ = c1619080sEc.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeRedBadgerManager");
        sbLIZ.append(", onNoticeCountChangedEvent hasCountChange: ");
        sbLIZ.append(zLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLIZJ) {
            LJI();
        }
    }

    public static boolean LJFF(Context context, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean zLIZIZ = C809350Voz.LIZ(context).LIZ.LIZIZ("is_desktop_red_badge_show", false);
        if (jSONObject != null && jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "red_badge_local_pull_exp", true) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDesktopBadgeShow: ");
        sbLIZ.append(z);
        sbLIZ.append(", redBadgeExpShow: ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z3 = z | z2;
        try {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
                z3 = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setDesktopBadgeShow, isDesktopBadgeShow: ");
        sbLIZ2.append(z3);
        sbLIZ2.append(", oldShowEnable: ");
        sbLIZ2.append(zLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (z3 == zLIZIZ) {
            return false;
        }
        C809340Voy c809340VoyLIZ = C809350Voz.LIZ(context).LIZ.LIZ();
        c809340VoyLIZ.LIZIZ.put("is_desktop_red_badge_show", Boolean.valueOf(z3));
        c809340VoyLIZ.LIZ();
        return true;
    }

    public final boolean LIZJ(Context context, C814730Vxf c814730Vxf) {
        C814840Vxq c814840Vxq;
        String stackTraceString;
        boolean z;
        int i;
        boolean z2;
        try {
            c814840Vxq = c814730Vxf.extra;
            stackTraceString = "";
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (c814840Vxq != null) {
            if (1 == c814840Vxq.redBadgeOnly && (i = c814840Vxq.badgeCount) >= 0) {
                try {
                    this.LLILLJJLI.LIZIZ(i, context);
                    z2 = true;
                } catch (C0VFP e) {
                    TryCatchGuardChecker.doCheck(e);
                    stackTraceString = Log.getStackTraceString(e);
                    z2 = false;
                }
                LIZLLL(context, z2, stackTraceString, c814730Vxf);
                LJ(context, c814730Vxf.extra.badgeCount, z2, stackTraceString, c814730Vxf);
                return true;
            }
            int i2 = c814840Vxq.badgeCount;
            if (i2 >= 0) {
                try {
                    this.LLILLJJLI.LIZIZ(i2, context);
                } catch (C0VFP e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stackTraceString = Log.getStackTraceString(e2);
                    z = false;
                }
                LIZLLL(context, z, stackTraceString, c814730Vxf);
                LJ(context, c814730Vxf.extra.badgeCount, z, stackTraceString, c814730Vxf);
                return false;
            }
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            C810560Vqw.LJ(new Runnable() { // from class: X.0VqY
                public final void LIZ() {
                    if (C19212010Ec.LIZJ.LJJLL()) {
                        return;
                    }
                    AwemeRedBadgerManager awemeRedBadgerManager = this.LL;
                    Application application = C460020I2e.LIZ;
                    awemeRedBadgerManager.getClass();
                    if (C810360Vqc.LIZ == 0 || C810360Vqc.LIZ == 2) {
                        awemeRedBadgerManager.LLILLJJLI.LIZ(0, application);
                    }
                    AwemeRedBadgerManager awemeRedBadgerManager2 = this.LL;
                    awemeRedBadgerManager2.getClass();
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "sync_inbox_num_to_desktop_enable", true, false)) {
                        if (!awemeRedBadgerManager2.LL) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("AwemeRedBadgerManager");
                            sbLIZ.append(", register inbox num change observer");
                            C2188811AlT.LIZIZ(sbLIZ);
                            EventBus.LIZLLL().LJIJJ(awemeRedBadgerManager2);
                            awemeRedBadgerManager2.LL = true;
                        }
                        awemeRedBadgerManager2.LJI();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AwemeRedBadgerManager@2d9b.onStateChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AwemeRedBadgerManager@2d9b.onStateChanged$1");
                }
            });
        }
    }

    public static void LIZLLL(Context context, boolean z, String str, C814730Vxf c814730Vxf) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = "";
            }
            C786410Ut5.LJJJI("stack_info", str, bundle);
        }
        String strLIZ = LIZ(context);
        if (strLIZ != null) {
            str3 = strLIZ;
        }
        C786410Ut5.LJJJI("launcher_package", str3, bundle);
        bundle.putLong("rule_id", c814730Vxf.id);
        C814840Vxq c814840Vxq = c814730Vxf.extra;
        if (c814840Vxq != null) {
            if (1 == c814840Vxq.redBadgeOnly) {
                str2 = "receive";
            } else {
                str2 = "with_artical";
            }
            C786410Ut5.LJJJI("show_type", str2, bundle);
        }
        C20684815ws.LJIILL("red_badge_receive", bundle);
    }

    public static void LJ(Context context, int i, boolean z, String str, C814730Vxf c814730Vxf) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i);
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = "";
            }
            C786410Ut5.LJJJI("stack_info", str, bundle);
        }
        String strLIZ = LIZ(context);
        if (strLIZ != null) {
            str3 = strLIZ;
        }
        C786410Ut5.LJJJI("launcher_package", str3, bundle);
        C814840Vxq c814840Vxq = c814730Vxf.extra;
        if (c814840Vxq != null) {
            if (1 == c814840Vxq.redBadgeOnly) {
                str2 = "receive";
            } else {
                str2 = "with_artical";
            }
            C786410Ut5.LJJJI("show_type", str2, bundle);
        }
        bundle.putLong("rule_id", c814730Vxf.id);
        C20684815ws.LJIILL("red_badge_show", bundle);
    }
}
