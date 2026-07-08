package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VSJ;
import X.C0VZ0;
import X.C0X9F;
import X.C1383350m6P;
import X.C1552050qUV;
import X.C1554460qYO;
import X.C2214201BlK;
import X.C2456009jq;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoCheckInRequest implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoCheckInRequest";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final void LIZ() {
        try {
            C786410Ut5.LJLIIL(60000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0dUW
                public static void LIZ() {
                    if (TextUtils.isEmpty(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId())) {
                        return;
                    }
                    Context context = C1552050qUV.LIZ;
                    synchronized (C1552050qUV.class) {
                        C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(C1553670qX7.LIZ());
                        if (c1551950qULLJIIIZ != null) {
                            c1551950qULLJIIIZ.LIZIZ("normal", null, null, new C1024460clY());
                        }
                    }
                    HashMap map = new HashMap();
                    map.put("gecko_version", BuildConfig.VERSION_NAME);
                    Npth.addTags(map);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GeckoCheckInRequest@abd6.runReal$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GeckoCheckInRequest@abd6.runReal$1");
                }
            });
            Context context = C1552050qUV.LIZ;
            C844470XAv.LIZ.getClass();
            try {
                C0X9F.LJ(new C0VSJ(C1552050qUV.LIZ(C844470XAv.LIZ()), "offline"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1383350m6P.LIZ(e);
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C1552050qUV.LJ) {
            return;
        }
        if (C2456009jq.LIZ()) {
            C2214201BlK.LIZLLL().LIZIZ(new C1554460qYO(this, context, 0));
        } else {
            LIZ();
        }
    }
}
