package com.ss.android.ugc.aweme;

import X.C20113813my;
import X.InterfaceC20114613n6;
import X.InterfaceC20114913n9;
import android.app.Application;
import com.ss.android.ugc.aweme.journey.INujPerformanceService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
public final class NujPerformanceService implements INujPerformanceService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.13n7] */
    @Override // com.ss.android.ugc.aweme.journey.INujPerformanceService
    public final void LIZ(Application application) {
        final ?? r0 = new Object() { // from class: X.13n7
            {
                new Object() { // from class: X.13n8
                    {
                        new ConcurrentHashMap();
                    }
                };
            }
        };
        new InterfaceC20114913n9(r0) { // from class: X.13n4
            public final C20114513n5 LIZ = new C20114513n5((InterfaceC20115413nE) C20113813my.LIZIZ().LIZ(InterfaceC20115413nE.class, "default_bid"), "Token");

            @Override // X.InterfaceC20115013nA
            public final C20114513n5 getLoggerWrapper() {
                return this.LIZ;
            }

            @Override // X.InterfaceC20115013nA
            public final void printLog(String str, EnumC20115313nD enumC20115313nD, String str2) {
                C20115113nB.LIZ(this, str, enumC20115313nD, str2);
            }
        };
        InterfaceC20114613n6 interfaceC20114613n6 = (InterfaceC20114613n6) C20113813my.LIZIZ().LIZ(InterfaceC20114613n6.class, "default_bid");
        if (interfaceC20114613n6 != null) {
            interfaceC20114613n6.LIZLLL();
        }
    }
}
