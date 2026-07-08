package com.ss.android.ugc.aweme.relation.monitor;

import X.C10LT;
import X.C1261270ivV;
import X.C1AJ2;
import X.C1AJ3;
import X.EnumC20621415me;
import X.InterfaceC1331910klR;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes34.dex */
public final class RecUserMonManagerImpl implements IRecUserMonManager {
    public static final RecUserMonManagerImpl LL = new RecUserMonManagerImpl();
    public static final MonitorSamplingConfig LLILLJJLI = MonitorSamplingConfig.LIZ;

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RelationPageMonitor hO1(Lifecycle lifecycle, C1261270ivV c1261270ivV) {
        LLILLJJLI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJIIIIZZ.getValue()).booleanValue()) {
            return null;
        }
        RelationPageMonitor relationPageMonitor = new RelationPageMonitor(c1261270ivV);
        lifecycle.addObserver(relationPageMonitor);
        return relationPageMonitor;
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RecUserPopupMonImpl t62(C1261270ivV c1261270ivV, EnumC20621415me enumC20621415me) {
        LLILLJJLI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJ.getValue()).booleanValue()) {
            return null;
        }
        return new RecUserPopupMonImpl(c1261270ivV, enumC20621415me);
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RecUserBehaviorMonImpl oK(Lifecycle lifecycle, C1261270ivV c1261270ivV, int i) {
        if (i <= 1000) {
            LLILLJJLI.getClass();
            if (((Boolean) MonitorSamplingConfig.LJFF.getValue()).booleanValue()) {
                RecUserBehaviorMonImpl recUserBehaviorMonImpl = new RecUserBehaviorMonImpl(c1261270ivV);
                lifecycle.addObserver(recUserBehaviorMonImpl);
                return recUserBehaviorMonImpl;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final C1AJ2 Ge0(String str, String str2, int i, C10LT c10lt) {
        LLILLJJLI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJI.getValue()).booleanValue()) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C1AJ2(str, str2, i, c10lt);
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final C1AJ3 J52(String str, String str2, C10LT c10lt, InterfaceC1331910klR interfaceC1331910klR) {
        LLILLJJLI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJI.getValue()).booleanValue()) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C1AJ3(str, str2, c10lt, interfaceC1331910klR);
    }
}
