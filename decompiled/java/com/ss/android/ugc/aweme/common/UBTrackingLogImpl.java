package com.ss.android.ugc.aweme.common;

import X.C04TD;
import X.C2188811AlT;
import X.C806950Vl7;
import X.C807170VlT;
import X.C807250Vlb;
import X.C807260Vlc;
import X.C807280Vle;
import com.bytedance.ies.ugc.statisticloggerapi.ILogTraceInterceptor;
import com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper;
import com.ss.android.ugc.aweme.legoImp.task.ubtrace.LogTraceInterceptorImpl;

/* JADX INFO: loaded from: classes14.dex */
public final class UBTrackingLogImpl implements IUBTrackingLogWrapper {
    public final ILogTraceInterceptor LIZ;

    public UBTrackingLogImpl() {
        ILogTraceInterceptor iLogTraceInterceptor;
        Object objLIZ = C04TD.LIZ(ILogTraceInterceptor.class, false);
        if (objLIZ != null) {
            iLogTraceInterceptor = (ILogTraceInterceptor) objLIZ;
        } else {
            if (C04TD.V1 == null) {
                synchronized (ILogTraceInterceptor.class) {
                    if (C04TD.V1 == null) {
                        C04TD.V1 = new LogTraceInterceptorImpl();
                    }
                }
            }
            iLogTraceInterceptor = C04TD.V1;
        }
        this.LIZ = iLogTraceInterceptor;
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZIZ(C807250Vlb c807250Vlb, String str, String str2) {
        LJI(3, c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZJ(C807250Vlb c807250Vlb, String str, String str2) {
        LJI(6, c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZLLL(C807250Vlb c807250Vlb, String str, String str2) {
        LJI(4, c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LJ(C807250Vlb c807250Vlb, String str, String str2) {
        LJI(2, c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LJFF(C807250Vlb c807250Vlb, String str, String str2) {
        LJI(5, c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZ(C807250Vlb c807250Vlb, String str, String str2, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(C807260Vlc.LIZ(th));
        LJI(6, c807250Vlb, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(int i, C807250Vlb c807250Vlb, String str, String str2) {
        ILogTraceInterceptor iLogTraceInterceptor;
        String str3;
        if (C806950Vl7.LIZIZ.LJIIIZ() && (iLogTraceInterceptor = this.LIZ) != null) {
            iLogTraceInterceptor.LIZ();
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                str3 = "unknown";
                            } else {
                                str3 = "error";
                            }
                        } else {
                            str3 = "warn";
                        }
                    } else {
                        str3 = "info";
                    }
                } else {
                    str3 = "debug";
                }
            } else {
                str3 = "verbose";
            }
            C807280Vle c807280Vle = C807280Vle.LIZIZ;
            C807170VlT c807170VlT = new C807170VlT(c807250Vlb.LIZ);
            c807170VlT.LJI = "CrashlyticsWrapper";
            c807170VlT.LJIIIIZZ = c807250Vlb.LIZIZ;
            c807170VlT.LJIIIZ = str;
            c807170VlT.LJIIJJI = str2;
            c807170VlT.LJIIJ = str3;
            c807280Vle.LIZ(c807170VlT);
        }
    }
}
