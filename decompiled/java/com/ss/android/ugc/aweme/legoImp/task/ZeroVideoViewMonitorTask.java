package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C15O7;
import X.C1602860roS;
import X.C1DS1;
import X.C798410VTr;
import X.C798440VTu;
import X.C798460VTw;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC2385309Wh;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class ZeroVideoViewMonitorTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ZeroVideoViewMonitorTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C798410VTr.LJ()) {
            return;
        }
        if (C798410VTr.LJ()) {
            try {
                int i = C798460VTw.LIZ().getInt("last_boot_group", -1);
                if (i != 1) {
                    if (i != 2) {
                        C798440VTu.LIZ = -1;
                        C798440VTu.LIZIZ = 1;
                    } else {
                        C798440VTu.LIZ = 2;
                        C798440VTu.LIZIZ = 1;
                    }
                } else {
                    C798440VTu.LIZ = 1;
                    C798440VTu.LIZIZ = 2;
                }
                C798460VTw.LIZ().storeInt("last_boot_group", C798440VTu.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C1DS1.LIZJ) {
                C798410VTr.LJ.LIZ(AppLog.getSessionId(), "session_id");
            }
            C798410VTr.LIZLLL = true;
        }
        if (!C798440VTu.LIZ(C798440VTu.LIZ).isEmpty()) {
            C15O7.LJIIIIZZ(3000L).LJ(new InterfaceC2385309Wh() { // from class: X.0CPC
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<Void> c15o7) {
                    C1C7U.LIZ("ZeroVideoViewMonitorTask@b8b4.run$1");
                    Map<Integer, String> map = C798410VTr.LIZ;
                    C798410VTr.LJI(C0CBG.LAST.getCode(), null);
                    C1C7U.LIZIZ("ZeroVideoViewMonitorTask@b8b4.run$1");
                    return null;
                }
            }, C823050WQl.LIZLLL(), null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("monitor_scene", "scene_start");
        linkedHashMap.put("event_version", 11);
        linkedHashMap.put("boot_time", Long.valueOf(SystemClock.uptimeMillis()));
        linkedHashMap.put("vv_code", Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
        C1602860roS.LIZ.getClass();
        linkedHashMap.put("is_new_user", String.valueOf(C1602860roS.LJI()));
        C798410VTr.LJFF(linkedHashMap);
    }
}
