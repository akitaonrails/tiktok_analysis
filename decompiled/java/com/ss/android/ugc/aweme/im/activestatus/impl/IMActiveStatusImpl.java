package com.ss.android.ugc.aweme.im.activestatus.impl;

import X.AbstractC595720NYc;
import X.C01GW;
import X.C0I0B;
import X.C0NXK;
import X.C0PEM;
import X.C0ZE8;
import X.C0ZHL;
import X.C0ZJ9;
import X.C0ZJT;
import X.C0ZJX;
import X.C0ZJY;
import X.C1231704rr;
import X.C1419705h5;
import X.C1687506jB;
import X.C2104408Mg;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C595220NWe;
import X.C595660NXw;
import X.C595710NYb;
import X.C595800NYk;
import X.C595830NYn;
import X.C595850NYp;
import X.C894660Z7w;
import X.C897320ZIc;
import X.C897520ZIw;
import X.C897550ZIz;
import X.EnumC1910450zoZ;
import X.EnumC898380ZMe;
import X.InterfaceC882030Yiv;
import X.InterfaceC894140Z5w;
import X.InterfaceC897380ZIi;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActivityStatusConfigProducer;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMActiveStatusImpl implements InterfaceC897380ZIi {
    public final C01GW LIZJ;
    public C0ZHL LIZLLL;
    public final InterfaceC894140Z5w LJ;

    @Override // X.InterfaceC897380ZIi
    public final void LJIILL() {
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJIIZILJ() {
        C0ZJX.LIZ(true);
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJIJ() {
        C0ZJX.LIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    public final C0ZJT LJ() {
        return (C0ZJT) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJIIL() {
        ISaasUserUpdateMonitor iSaasUserUpdateMonitor = (ISaasUserUpdateMonitor) C0ZJX.LJII.getValue();
        if (iSaasUserUpdateMonitor != null) {
            iSaasUserUpdateMonitor.LIZIZ();
        }
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJIILIIL() {
        ISaasUserUpdateMonitor iSaasUserUpdateMonitor = (ISaasUserUpdateMonitor) C0ZJX.LJII.getValue();
        if (iSaasUserUpdateMonitor != null) {
            iSaasUserUpdateMonitor.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    public final void LJIILLIIL() {
        if (this.LIZLLL == null) {
            IActivityStatusConfigProducer.LIZ.getClass();
            IActivityStatusConfigProducer value = C897550ZIz.LIZIZ.getValue();
            this.LIZLLL = value != null ? value.LIZJ() : null;
        }
        if (C0ZJX.LJ.getAndSet(true)) {
            return;
        }
        C0I0B.LJFF.LIZJ();
        if (C2104408Mg.LIZJ(C894660Z7w.LIZ())) {
            C0ZJX.LIZ.LIZIZ();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0ZJY(null), 3);
        }
    }

    @Override // X.InterfaceC897380ZIi
    public final C1687506jB LJIJI() {
        return new C1687506jB();
    }

    public IMActiveStatusImpl() {
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            iMHostApiLIZ.LJII();
        }
        this.LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(85));
        IMHostApi iMHostApiLIZ2 = C1419705h5.LIZ();
        this.LJ = iMHostApiLIZ2 != null ? iMHostApiLIZ2.LIZLLL() : null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    public final void LJIIIIZZ() {
        if (C595800NYk.LIZ().preloadActivityStatusModuleInPreInboxTask) {
            C1231704rr c1231704rr = C0ZJX.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    public final C0ZHL LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC897380ZIi
    public final InterfaceC894140Z5w LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC897380ZIi
    public final C0ZJ9 LJFF() {
        return C0ZJ9.LIZ;
    }

    @Override // X.InterfaceC897380ZIi
    public final C0ZE8 LJIIJJI() {
        return C0ZE8.LIZ;
    }

    @Override // X.InterfaceC897380ZIi
    public final C595660NXw LIZIZ(AbstractC595720NYc abstractC595720NYc) {
        ActivityStatusService.LIZ.getClass();
        return C595830NYn.LIZ().LIZIZ(abstractC595720NYc);
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJII(C595710NYb c595710NYb) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C595850NYp(this, c595710NYb, null), 3);
    }

    @Override // X.InterfaceC897380ZIi
    public final void LJIIIZ(EnumC898380ZMe enumC898380ZMe) {
        ActivityStatusService.LIZ.getClass();
        C595830NYn.LIZ().LJIIIIZZ(enumC898380ZMe.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZIc] */
    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    public final C897320ZIc LJIIJ(EnumC1910450zoZ enumC1910450zoZ) {
        return new InterfaceC882030Yiv(enumC1910450zoZ) { // from class: X.0ZIc
            public final EnumC1910450zoZ LIZ;
            public final InterfaceC897380ZIi LIZIZ;
            public InterfaceC897330ZId LIZJ;

            @Override // X.InterfaceC882030Yiv
            public final InterfaceC897330ZId get() {
                InterfaceC461710I8r interfaceC461710I8rLIZ = C0I0B.LJFF.LIZ();
                InterfaceC897330ZId interfaceC897330ZId = this.LIZJ;
                if (!((C1400340mXo) interfaceC461710I8rLIZ).LIZJ(interfaceC897330ZId != null ? interfaceC897330ZId.LIZ() : null)) {
                    this.LIZJ = this.LIZIZ.LJI(this.LIZ, false);
                }
                return this.LIZJ;
            }

            {
                InterfaceC897380ZIi.LIZIZ.getClass();
                InterfaceC897380ZIi interfaceC897380ZIiLIZ = C897370ZIh.LIZ();
                this.LIZ = enumC1910450zoZ;
                this.LIZIZ = interfaceC897380ZIiLIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi
    /* JADX INFO: renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public final C897520ZIw LJI(EnumC1910450zoZ enumC1910450zoZ, boolean z) {
        System.nanoTime();
        C897520ZIw c897520ZIw = new C897520ZIw(enumC1910450zoZ, z);
        System.nanoTime();
        return c897520ZIw;
    }

    @Override // X.InterfaceC897380ZIi
    public final void LIZ(Map<String, C0NXK> map, C595220NWe c595220NWe, String str) {
        if (LJ().LIZ()) {
            ActivityStatusService.LIZ.getClass();
            C595830NYn.LIZ().LIZ(map, c595220NWe, str);
        }
    }
}
