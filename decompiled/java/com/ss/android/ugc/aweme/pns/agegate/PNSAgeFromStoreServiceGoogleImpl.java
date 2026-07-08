package com.ss.android.ugc.aweme.pns.agegate;

import X.C01GW;
import X.C0TU0;
import X.C10W3;
import X.C10W5;
import X.C10W8;
import X.C19251710Tj;
import X.C19252310Tp;
import X.C19258310Vx;
import X.C19258510Vz;
import X.C2042707zN;
import X.C23250099c;
import X.C2460409kY;
import X.C2460609ka;
import X.C2462509kt;
import X.C452501pT;
import X.C817503Hh;
import X.C835460Wq0;
import X.C835490Wq3;
import X.C835510Wq5;
import X.InterfaceC1519050pdH;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSAgeFromStoreServiceGoogleImpl implements IPNSAgeFromStoreService {
    public NativeStoreVariables LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ = 15;
    public int LJFF = 18;
    public final String LJI = "pns_age_gate_store_sdk_storage";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 490));
    public final String LJIIIIZZ = "NativeStoreVariables";

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final NativeStoreVariables LJII() {
        if (this.LIZIZ == null) {
            Gson gson = new Gson();
            InterfaceC1519050pdH interfaceC1519050pdH = (InterfaceC1519050pdH) this.LJII.getValue();
            this.LIZIZ = (NativeStoreVariables) GsonProtectorUtils.fromJson(gson, interfaceC1519050pdH != null ? interfaceC1519050pdH.getString(this.LJIIIIZZ) : null, NativeStoreVariables.class);
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final C19258510Vz LJFF() {
        return C19252310Tp.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r11, X.InterfaceC1364105Vn<? super X.C19258510Vz> r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.agegate.PNSAgeFromStoreServiceGoogleImpl.LJ(android.content.Context, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final void LJI(Context context, final C2042707zN c2042707zN) {
        if (this.LIZJ == 1) {
            int i = this.LIZLLL;
            int i2 = this.LJ;
            int i3 = this.LJFF;
            try {
                C2462509kt c2462509kt = new C2462509kt();
                c2462509kt.LIZ = Integer.valueOf(i);
                c2462509kt.LIZIZ = Integer.valueOf(i2);
                c2462509kt.LIZJ = Integer.valueOf(i3);
                C10W8 c10w8LIZ = c2462509kt.LIZ();
                new C10W5();
                C835510Wq5 c835510Wq5LJ = C835460Wq0.LJ(c10w8LIZ);
                InterfaceC835710WqP interfaceC835710WqP = new InterfaceC835710WqP() { // from class: X.10WB
                    @Override // X.InterfaceC835710WqP
                    public final void onSuccess(Object obj) {
                        String string;
                        Integer numLJ;
                        C10WA c10wa = (C10WA) obj;
                        C10W6 c10w6 = c2042707zN;
                        if (c10wa != null && (numLJ = c10wa.LJ()) != null) {
                            string = numLJ.toString();
                        } else {
                            string = null;
                        }
                        c10w6.onSuccess(string);
                    }
                };
                C0TU0 c0tu0 = C835490Wq3.LIZ;
                c835510Wq5LJ.LJI(c0tu0, interfaceC835710WqP);
                c835510Wq5LJ.LJ(c0tu0, new InterfaceC835730WqR() { // from class: X.10W1
                    @Override // X.InterfaceC835730WqR
                    public final void onFailure(Exception exc) {
                        c2042707zN.onFailure();
                    }
                });
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            C835510Wq5 c835510Wq5LIZ = new C2460609ka(new C2460409kY(context)).LIZ(new C10W3());
            c835510Wq5LIZ.LJFF(new InterfaceC835710WqP() { // from class: X.10W7
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    String string;
                    C10WA c10wa = (C10WA) obj;
                    c10wa.LIZJ();
                    Integer numLJ = c10wa.LJ();
                    if (numLJ != null) {
                        numLJ.intValue();
                    }
                    C10W6 c10w6 = c2042707zN;
                    Integer numLJ2 = c10wa.LJ();
                    if (numLJ2 != null) {
                        string = numLJ2.toString();
                    } else {
                        string = null;
                    }
                    c10w6.onSuccess(string);
                }
            });
            c835510Wq5LIZ.LIZLLL(new InterfaceC835730WqR() { // from class: X.10W2
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    c2042707zN.onFailure();
                }
            });
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final void LIZ(Context context, int i, C19251710Tj c19251710Tj) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C19258310Vx(this, context, i, c19251710Tj, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
    public final void LIZLLL(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.LIZIZ = new NativeStoreVariables(num, num2, new AgeThreshold(num3, num4), num5, num6);
        InterfaceC1519050pdH interfaceC1519050pdH = (InterfaceC1519050pdH) this.LJII.getValue();
        if (interfaceC1519050pdH != null) {
            interfaceC1519050pdH.putString(this.LJIIIIZZ, GsonProtectorUtils.toJson(new Gson(), this.LIZIZ));
        }
    }
}
