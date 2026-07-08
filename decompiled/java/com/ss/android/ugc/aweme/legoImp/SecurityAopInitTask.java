package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import X.C0VJP;
import X.C0VSK;
import X.C0VSM;
import X.C0VSS;
import X.C0VZ0;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityAopInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SecurityAopInitTask";
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0VSS] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0VSM c0vsm = C0VSM.LIZ;
        ?? r3 = new Object() { // from class: X.0VSS
            public static final String LIZ() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIILL;
            }

            public static final String LIZIZ() {
                C844470XAv.LIZ.getClass();
                return String.valueOf(C844470XAv.LJIIJ);
            }

            public static final String LIZJ() {
                C844470XAv.LIZ.getClass();
                return String.valueOf(C844470XAv.LIZLLL());
            }
        };
        synchronized (c0vsm) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = C0VSM.LIZIZ;
            jSONObject.put("aid", "333807");
            jSONObject.put("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
            jSONObject.put("host_aid", C0VSS.LIZIZ());
            jSONObject.put("channel", C0VSS.LIZ());
            jSONObject.put("update_version_code", C0VSS.LIZJ());
            C844470XAv c844470XAv = C844470XAv.LIZ;
            c844470XAv.getClass();
            jSONObject.put("app_version", C844470XAv.LJFF());
            c844470XAv.getClass();
            jSONObject.put("appVersion", C844470XAv.LJFF());
            jSONObject.put("aop_check_sdk_version", "1.0.1-alpha.5-tiktok");
            C0VJP.LIZ().execute(new ARunnableS92S0000000_13(context, 3));
            C0VSK.LIZ(System.currentTimeMillis() - jCurrentTimeMillis);
            C0VJP.LIZ().execute(new ARunnableS113S0100000_13(context, (C0VSS) r3, 17));
        }
    }
}
