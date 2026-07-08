package com.ss.android.ugc.aweme.component.bio.biometric.enroll;

import X.C01GW;
import X.C0PEM;
import X.C1715110ujV;
import X.C1715260ujk;
import X.C1715520ukA;
import X.C1715770ukZ;
import X.C1715810ukd;
import X.C1715820uke;
import X.C1715830ukf;
import X.C1715840ukg;
import X.C1715910ukn;
import X.C1716300ulQ;
import X.C19EG;
import X.C1BNE;
import X.C20121713oF;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import android.util.Base64;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;
import java.security.KeyPair;
import java.security.SignatureException;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes27.dex */
public final class BioEnrollViewModel extends ViewModel {
    public C1715820uke LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public C1715910ukn LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public final void EQ2() {
        AQ2(1, false);
    }

    public final void BQ2() {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, new C1715110ujV(new C1715260ujk(null, 3)), null, null, null, false, null, null, 2029)));
    }

    public final void CQ2() {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, new C1715110ujV(Boolean.TRUE), null, null, null, null, false, null, null, 2037)));
    }

    public final void DQ2() {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, new C1715110ujV(new C1715260ujk(null, 3)), null, null, null, null, null, false, null, null, 2041)));
    }

    public BioEnrollViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1715830ukf(0));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = new C1715910ukn(null, null, null, null, null, null, C1716300ulQ.LIZ(), 8127);
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 131));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 130));
    }

    public final void FQ2(C1715810ukd c1715810ukd) {
        try {
            c1715810ukd.LIZLLL.update(c1715810ukd.LIZJ.getBytes(Charsets.UTF_8));
            String strEncodeToString = Base64.encodeToString(c1715810ukd.LIZLLL.sign(), 2);
            C1715520ukA.LIZLLL("bio_ef_sign_chlg", "1", null, null);
            GQ2(new C1715820uke(c1715810ukd.LIZ, c1715810ukd.LIZIZ, strEncodeToString));
        } catch (SignatureException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SignatureException:");
            sbLIZ.append(e.getMessage());
            C1715520ukA.LIZLLL("bio_ef_sign_chlg", C2188811AlT.LIZIZ(sbLIZ), null, null);
        }
    }

    public final void GQ2(C1715820uke c1715820uke) {
        BiometricBEApi biometricBEApi = (BiometricBEApi) this.LLILZLL.getValue();
        if (biometricBEApi == null) {
            return;
        }
        this.LL = c1715820uke;
        setLoading(true);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1715770ukZ(c1715820uke, biometricBEApi, this, null), 2);
    }

    public final void setLoading(boolean z) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, z, null, null, null, null, null, null, false, null, null, 2045)));
    }

    public final void vQ2(C19EG c19eg) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, true, false, null, null, null, null, null, null, false, null, null, 2046)));
        wQ2(c19eg);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(X.C19EG r7) throws org.json.JSONException {
        /*
            r6 = this;
            X.0ukn r5 = r6.LLILZ
            java.lang.String r0 = r5.LIZLLL
            int r0 = r0.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L4d
            r0 = 1
        Ld:
            r1 = 14
            r4 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = "bio_enroll_host_empty"
            X.C1715520ukA.LIZJ(r0, r4, r4, r1)
            java.lang.String r0 = "host empty"
            r6.zQ2(r0)
        L1c:
            r3 = 1
        L1d:
            java.lang.String r1 = "bio_ef_param_chk"
            if (r3 == 0) goto L4f
            java.lang.String r0 = "0"
            X.C1715520ukA.LIZLLL(r1, r0, r4, r4)
            return
        L27:
            java.lang.String r0 = r5.LIZJ
            int r0 = r0.length()
            if (r0 != 0) goto L3a
            java.lang.String r0 = "bio_enroll_wuid_empty"
            X.C1715520ukA.LIZJ(r0, r4, r4, r1)
            java.lang.String r0 = "wuid empty"
            r6.zQ2(r0)
            goto L1c
        L3a:
            java.lang.String r0 = r5.LJ
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            java.lang.String r0 = "bio_enroll_session_empty"
            X.C1715520ukA.LIZJ(r0, r4, r4, r1)
            java.lang.String r0 = "session empty"
            r6.zQ2(r0)
            goto L1c
        L4d:
            r0 = 0
            goto Ld
        L4f:
            java.lang.String r0 = "1"
            X.C1715520ukA.LIZLLL(r1, r0, r4, r4)
            X.01GW r0 = r6.LLILZLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi r0 = (com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi) r0
            if (r0 != 0) goto L5f
            return
        L5f:
            r6.setLoading(r2)
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0uka r1 = new X.0uka
            r1.<init>(r6, r0, r7, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollViewModel.wQ2(X.19EG):void");
    }

    public final void yQ2(C19EG c19eg) {
        Object value;
        C1715820uke c1715820uke = this.LL;
        if (c1715820uke != null) {
            GQ2(c1715820uke);
            return;
        }
        C1715840ukg c1715840ukg = ((C1715830ukf) this.LLILLJJLI.getValue()).LJI.LIZ;
        if (c1715840ukg != null) {
            C2252321DDq c2252321DDq = this.LLILLJJLI;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, null, new C1715110ujV(c1715840ukg), null, false, null, null, 1983)));
            return;
        }
        wQ2(c19eg);
    }

    public final void zQ2(String str) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, new C1715110ujV(str), null, null, false, null, null, 2013)));
    }

    public final void AQ2(int i, boolean z) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, null, null, new C1715110ujV(Integer.valueOf(i)), z, null, null, 1661)));
    }

    public final void xQ2(String str, String str2) {
        Object value;
        KeyPair keyPairLIZ = ((C20121713oF) this.LLILZIL.getValue()).LIZ();
        if (keyPairLIZ == null) {
            C1715520ukA.LIZLLL("bio_ef_keypair", "unable_to_generate", null, null);
            zQ2("unable to generate key");
        } else {
            C1715520ukA.LIZLLL("bio_ef_keypair", "1", null, null);
            C2252321DDq c2252321DDq = this.LLILLJJLI;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1715830ukf.LIZ((C1715830ukf) value, false, false, null, null, null, null, new C1715110ujV(new C1715840ukg(str, keyPairLIZ, str2)), null, false, null, null, 1983)));
        }
    }
}
