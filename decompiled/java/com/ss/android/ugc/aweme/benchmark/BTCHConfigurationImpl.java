package com.ss.android.ugc.aweme.benchmark;

import X.C04TD;
import X.C0VSJ;
import X.C0XDN;
import X.C1305230k4P;
import X.C1449640npK;
import X.C1655580tBU;
import X.C1AF0;
import X.C21309418aK;
import X.C21309818aO;
import X.C21309918aP;
import X.C21310018aQ;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1457290o1f;
import X.InterfaceC21309518aL;
import X.InterfaceC21310318aT;
import android.os.Build;
import com.benchmark.IBTCHConfiguration;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.io.File;
import java.util.LinkedHashMap;
import lth.o;

/* JADX INFO: loaded from: classes33.dex */
public final class BTCHConfigurationImpl implements IBTCHConfiguration {
    private final String getWordSpace() {
        String path;
        if (C1655580tBU.LIZ()) {
            C844470XAv.LIZ.getClass();
            path = null;
            File fileY2 = C786410Ut5.y2(C844470XAv.LIZ(), null);
            if (fileY2 != null) {
                path = fileY2.getPath();
            }
        } else {
            path = C1449640npK.LIZ;
        }
        return new C0VSJ(path, "bytebench").getAbsolutePath();
    }

    @Override // com.benchmark.IBTCHConfiguration
    public C21309818aO getByteBenchConfig() {
        String currentUserID;
        if (VmSdkMonitor.LIZ == null) {
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            C844470XAv.LIZ.getClass();
            VmSdkMonitor.LIZLLL(C844470XAv.LIZ(), new C1305230k4P(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, C844470XAv.LJIILL, String.valueOf(C844470XAv.LJIIJ), C844470XAv.LIZJ(), String.valueOf(C844470XAv.LIZLLL())));
        }
        C21309418aK.LIZJ(new InterfaceC21309518aL() { // from class: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl.getByteBenchConfig.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
            @Override // X.InterfaceC21309518aL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onEvent(java.lang.String r3, org.json.JSONObject r4) {
                /*
                    r2 = this;
                    boolean r0 = dtj.u7.LIZ()
                    if (r0 == 0) goto Ld
                    int r0 = r3.hashCode()
                    switch(r0) {
                        case -1784441047: goto L42;
                        case -828897669: goto L39;
                        case -642369578: goto L29;
                        case 984743495: goto L20;
                        case 2008870842: goto L17;
                        default: goto Ld;
                    }
                Ld:
                    kotlin.jvm.internal.AwS181S1100000_32 r1 = new kotlin.jvm.internal.AwS181S1100000_32
                    r0 = 2
                    r1.<init>(r3, r4, r0)
                    X.C0CNO.LIZIZ(r1)
                    return
                L17:
                    java.lang.String r0 = "bytebench_strategy_class_obtain_v2"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L32
                    goto Ld
                L20:
                    java.lang.String r0 = "bytebench_df_install_result"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L4a
                    goto Ld
                L29:
                    java.lang.String r0 = "bytebench_get_strategy_value_v2"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L32
                    goto Ld
                L32:
                    boolean r0 = dtj.u7.LIZJ()
                    if (r0 != 0) goto Ld
                    return
                L39:
                    java.lang.String r0 = "bytebench_df_download_information"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L4a
                    goto Ld
                L42:
                    java.lang.String r0 = "bytebench_strategy_get_operation_cost_time"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto Ld
                L4a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl.AnonymousClass1.onEvent(java.lang.String, org.json.JSONObject):void");
            }
        });
        AnonymousClass2 anonymousClass2 = new InterfaceC21310318aT() { // from class: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl.getByteBenchConfig.2
            @Override // X.InterfaceC21310318aT
            public final void onException(Throwable th) {
                C1AF0.LJFF(th, "benchmark test");
            }
        };
        synchronized (C21310018aQ.class) {
            C21310018aQ.LIZ = anonymousClass2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0XDN.LIZJ(linkedHashMap, true);
        IFoundationAVServiceProxy iFoundationAVServiceProxy = (IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class);
        InterfaceC1457290o1f accountService = iFoundationAVServiceProxy != null ? iFoundationAVServiceProxy.getAccountService() : null;
        linkedHashMap.put("mode", ((accountService == null || !accountService.isLogin()) ? BTCHMode.NOT_LOGIN : accountService.LIZ() ? BTCHMode.KIDS : BTCHMode.NORMAL).getValue());
        C21309918aP c21309918aP = new C21309918aP();
        C844470XAv.LIZ.getClass();
        c21309918aP.LIZ = C844470XAv.LIZ();
        c21309918aP.LIZJ = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
        c21309918aP.LIZLLL = Build.MODEL;
        c21309918aP.LJ = C844470XAv.LJIIJ;
        String str = C844470XAv.LJ;
        c21309918aP.LJFF = str != null ? str : null;
        c21309918aP.LJI = C844470XAv.LJFF();
        c21309918aP.LJII = C844470XAv.LJ();
        InterfaceC1457290o1f interfaceC1457290o1f = o.LJIIZILJ;
        if (interfaceC1457290o1f == null || (currentUserID = interfaceC1457290o1f.getCurrentUserID()) == null) {
            currentUserID = CardStruct.IStatusCode.DEFAULT;
        }
        c21309918aP.LJIIIZ = currentUserID;
        c21309918aP.LJIIIIZZ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() == null ? CardStruct.IStatusCode.DEFAULT : AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        c21309918aP.LJIIJJI = true;
        c21309918aP.LIZIZ = getWordSpace();
        c21309918aP.LJIIL = linkedHashMap;
        c21309918aP.LJIIJ = (byte) 31;
        return new C21309818aO(c21309918aP);
    }

    public static IBTCHConfiguration createIBTCHConfigurationbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBTCHConfiguration.class, z);
        if (objLIZ != null) {
            return (IBTCHConfiguration) objLIZ;
        }
        if (C04TD.LLILII == null) {
            synchronized (IBTCHConfiguration.class) {
                if (C04TD.LLILII == null) {
                    C04TD.LLILII = new BTCHConfigurationImpl();
                }
            }
        }
        return C04TD.LLILII;
    }
}
