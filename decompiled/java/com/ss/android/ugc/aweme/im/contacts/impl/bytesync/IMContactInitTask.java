package com.ss.android.ugc.aweme.im.contacts.impl.bytesync;

import X.C09JN;
import X.C0CCZ;
import X.C0VZ0;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1419705h5;
import X.C1701940uOG;
import X.C21287318Sh;
import X.C2201761BFe;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1478005qU;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class IMContactInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "IMContactInitTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jCurrentTimeMillis;
        Keva kevaLIZ = C21287318Sh.LIZ();
        if (kevaLIZ != null) {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                jCurrentTimeMillis = iMHostApiLIZ.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            kevaLIZ.storeLong("key_cold_start_timestamp", jCurrentTimeMillis);
        }
        C2201761BFe.LIZ.getClass();
        C2201761BFe.LJ = 0L;
        C2201761BFe.LJFF = 0;
        C2201761BFe.LJII = (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.1AJ6
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Object> c09aj) {
                C1C7U.LIZ("IMContactByteSyncManager@a519.initByteSync$1");
                C2201761BFe.LJI = c09aj;
                C1C7U.LIZIZ("IMContactByteSyncManager@a519.initByteSync$1");
            }
        }).LJIL(((Number) C2201761BFe.LIZJ.getValue()).longValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.1BFd
            @Override // X.C09JN
            public final void accept(Object obj) {
                long jCurrentTimeMillis2;
                C1C7U.LIZ("IMContactByteSyncManager@a519.initByteSync$2");
                if (C2201761BFe.LJ > 0) {
                    C1243290iSV c1243290iSV = C1243290iSV.LIZ;
                    IMHostApi.LIZ.getClass();
                    IMHostApi iMHostApiLIZ2 = C1419705h5.LIZ();
                    if (iMHostApiLIZ2 != null) {
                        jCurrentTimeMillis2 = iMHostApiLIZ2.LIZIZ();
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    long j = jCurrentTimeMillis2 - C2201761BFe.LJ;
                    C2201761BFe.LIZ.getClass();
                    C1243290iSV.LIZ(c1243290iSV, j - (((Number) C2201761BFe.LIZJ.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 0, C2201761BFe.LJFF);
                    C2201761BFe.LJ = 0L;
                }
                C1C7U.LIZIZ("IMContactByteSyncManager@a519.initByteSync$2");
            }
        }, new C09JN() { // from class: X.1BFc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMContactByteSyncManager@a519.initByteSync$3");
                C2201761BFe.LJ = 0L;
                C2201761BFe.LJFF = 0;
                C1C7U.LIZIZ("IMContactByteSyncManager@a519.initByteSync$3");
            }
        });
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ != null) {
            contactFeatureLIZ.LJIIL(AFwS281S0000000_34.get$arr$(17));
        }
    }
}
