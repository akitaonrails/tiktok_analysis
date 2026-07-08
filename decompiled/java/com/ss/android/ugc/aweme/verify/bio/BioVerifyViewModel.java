package com.ss.android.ugc.aweme.verify.bio;

import X.C01GW;
import X.C0PEM;
import X.C0T8W;
import X.C13LP;
import X.C1713530ugx;
import X.C1713570uh1;
import X.C1714170uhz;
import X.C1714660uim;
import X.C1714850uj5;
import X.C1714950ujF;
import X.C1714980ujI;
import X.C1715000ujK;
import X.C1715060ujQ;
import X.C1715110ujV;
import X.C1715230ujh;
import X.C1715250ujj;
import X.C1715260ujk;
import X.C1715280ujm;
import X.C1715520ukA;
import X.C1715640ukM;
import X.C1948507kB;
import X.C1BNE;
import X.C20121713oF;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.C989690brT;
import X.C991350bu9;
import X.C991740bum;
import X.InterfaceC1715120ujW;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.verify.ab.PipoBioVerifyFallbackConfigSettings;
import java.security.KeyPair;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BioVerifyViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public C1715250ujj LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL;
    public C1714950ujF LLILZLL;
    public String LLIZ;
    public C1714660uim LLIZLLLIL;
    public C1713570uh1 LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public volatile boolean LLJILJIL;

    public final void vQ2() {
        Object value;
        Object value2;
        if (this.LLILZ) {
            C1715520ukA.LIZLLL("bio_vf_authenticate", "skip", null, null);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioVerifyViewModel", "[authenticate] skip already");
            return;
        }
        C1715520ukA.LIZLLL("bio_vf_authenticate", "1", null, null);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioVerifyViewModel", "[authenticate] start");
        this.LLILZ = true;
        KeyPair keyPairLIZ = ((C20121713oF) this.LLILZIL.getValue()).LIZ();
        if (keyPairLIZ != null) {
            C1715520ukA.LIZLLL("bio_vf_auth_start", "1", null, null);
            C2252321DDq c2252321DDq = this.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1715060ujQ.LIZ((C1715060ujQ) value, null, new C1715110ujV(new C1715230ujh(keyPairLIZ, this.LLILLL.LIZIZ)), null, null, false, null, 61)));
            return;
        }
        C1715520ukA.LIZLLL("bio_vf_auth_start", "no_kp", null, null);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BioVerifyViewModel", "authenticate no key");
        C2252321DDq c2252321DDq2 = this.LL;
        do {
            value2 = c2252321DDq2.getValue();
        } while (!c2252321DDq2.compareAndSet(value2, C1715060ujQ.LIZ((C1715060ujQ) value2, new C1715110ujV(Boolean.TRUE), null, null, null, false, null, 62)));
    }

    public final void wQ2() {
        String str;
        C1713530ugx c1713530ugxLJ;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyDetail verifyDetailLJIIIIZZ2;
        C1713570uh1 c1713570uh1 = this.LLJ;
        String str2 = (c1713570uh1 == null || (verifyDetailLJIIIIZZ2 = c1713570uh1.LJIIIIZZ()) == null) ? null : verifyDetailLJIIIIZZ2.verifyCenterHost;
        C1713570uh1 c1713570uh12 = this.LLJ;
        if (c1713570uh12 == null || (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) == null || (str = verifyDetailLJIIIIZZ.pipoProductCat) == null) {
            str = "";
        }
        C1713570uh1 c1713570uh13 = this.LLJ;
        String strLIZIZ = (c1713570uh13 == null || (c1713530ugxLJ = c1713570uh13.LJ()) == null) ? null : c1713530ugxLJ.LIZIZ();
        ((C20121713oF) this.LLILZIL.getValue()).LIZIZ();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1715640ukM(str2, strLIZIZ, str, null), 2);
    }

    public final void zQ2() {
        Object value;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715060ujQ.LIZ((C1715060ujQ) value, new C1715110ujV(Boolean.TRUE), null, null, null, false, null, 62)));
    }

    public BioVerifyViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1715060ujQ(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = new C1715250ujj("", "", "");
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1137));
    }

    public final boolean yQ2() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoBioVerifyFallbackConfigSettings.PipoBioVerifyFallbackConfigModel pipoBioVerifyFallbackConfigModel = PipoBioVerifyFallbackConfigSettings.LIZ;
        PipoBioVerifyFallbackConfigSettings.PipoBioVerifyFallbackConfigModel pipoBioVerifyFallbackConfigModel2 = (PipoBioVerifyFallbackConfigSettings.PipoBioVerifyFallbackConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_bio_verify_fallback_config", PipoBioVerifyFallbackConfigSettings.PipoBioVerifyFallbackConfigModel.class, pipoBioVerifyFallbackConfigModel);
        if (pipoBioVerifyFallbackConfigModel2 != null) {
            pipoBioVerifyFallbackConfigModel = pipoBioVerifyFallbackConfigModel2;
        }
        List<String> list = pipoBioVerifyFallbackConfigModel.reasonList;
        return C1948507kB.LIZ(this.LLJI) && list != null && C13LP.LJJJJ(this.LLJI, list);
    }

    public final void AQ2(String str) {
        Object value;
        this.LLIZ = str;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1715060ujQ.LIZ((C1715060ujQ) value, null, null, null, null, true, null, 47)));
        C1713570uh1 c1713570uh1 = this.LLJ;
        if (c1713570uh1 != null) {
            C1714170uhz.LIZ(c1713570uh1);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1714850uj5(this, str, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ujV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ujV] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0ujV, X.0ujW] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.0ujV, X.0ujW] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void xQ2(InterfaceC1715120ujW interfaceC1715120ujW) {
        Object value;
        ?? r5;
        Object value2;
        ?? r52;
        Object value3;
        C1715110ujV c1715110ujV;
        C1715110ujV c1715110ujV2;
        Object value4;
        Object value5;
        C1715110ujV c1715110ujV3;
        C1715110ujV c1715110ujV4;
        Object value6;
        Object value7;
        ?? r6 = 0;
        C1715110ujV c1715110ujV5 = null;
        C1715110ujV c1715110ujV6 = null;
        ?? r62 = 0;
        if (interfaceC1715120ujW instanceof C991350bu9) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apiError:");
            C991350bu9 c991350bu9 = (C991350bu9) interfaceC1715120ujW;
            sbLIZ.append(c991350bu9.LIZIZ);
            sbLIZ.append(':');
            sbLIZ.append(c991350bu9.LIZJ);
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", C2188811AlT.LIZIZ(sbLIZ), null, null);
            C2252321DDq c2252321DDq = this.LL;
            do {
                value7 = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value7, C1715060ujQ.LIZ((C1715060ujQ) value7, null, null, new C1715110ujV(new C1715260ujk(c991350bu9.LIZJ, 1)), null, false, null, 43)));
            return;
        }
        if (interfaceC1715120ujW instanceof C989690brT) {
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", C0T8W.LIZ(((C989690brT) interfaceC1715120ujW).LIZ), null, null);
            C2252321DDq c2252321DDq2 = this.LL;
            do {
                value6 = c2252321DDq2.getValue();
            } while (!c2252321DDq2.compareAndSet(value6, C1715060ujQ.LIZ((C1715060ujQ) value6, null, null, new C1715110ujV(new C1715260ujk(null, 3)), null, false, null, 43)));
            return;
        }
        if (interfaceC1715120ujW instanceof C1715000ujK) {
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", "pending", null, null);
            C2252321DDq c2252321DDq3 = this.LL;
            do {
                value5 = c2252321DDq3.getValue();
                c1715110ujV3 = c1715110ujV5;
                c1715110ujV4 = c1715110ujV5;
                c1715110ujV5 = c1715110ujV5;
            } while (!c2252321DDq3.compareAndSet(value5, C1715060ujQ.LIZ((C1715060ujQ) value5, c1715110ujV3, c1715110ujV4, c1715110ujV5, c1715110ujV5, false, interfaceC1715120ujW, 15)));
            return;
        }
        if (interfaceC1715120ujW instanceof C991740bum) {
            C991740bum c991740bum = (C991740bum) interfaceC1715120ujW;
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", "success", String.valueOf(C1948507kB.LIZ(c991740bum.LIZ)), null);
            C2252321DDq c2252321DDq4 = this.LL;
            do {
                value4 = c2252321DDq4.getValue();
            } while (!c2252321DDq4.compareAndSet(value4, C1715060ujQ.LIZ((C1715060ujQ) value4, null, null, null, null, false, c991740bum, 15)));
            return;
        }
        if (interfaceC1715120ujW instanceof C1714980ujI) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reject:");
            C1714980ujI c1714980ujI = (C1714980ujI) interfaceC1715120ujW;
            sbLIZ2.append(c1714980ujI.LIZJ);
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", C2188811AlT.LIZIZ(sbLIZ2), null, null);
            C2252321DDq c2252321DDq5 = this.LL;
            do {
                value3 = c2252321DDq5.getValue();
                c1715110ujV = c1715110ujV6;
                c1715110ujV2 = c1715110ujV6;
                c1715110ujV6 = c1715110ujV6;
            } while (!c2252321DDq5.compareAndSet(value3, C1715060ujQ.LIZ((C1715060ujQ) value3, c1715110ujV, c1715110ujV2, c1715110ujV6, c1715110ujV6, false, c1714980ujI, 15)));
            return;
        }
        if (Intrinsics.LJFF(interfaceC1715120ujW, C1715280ujm.LIZ)) {
            C1715520ukA.LIZLLL("bio_vf_vrf_rsp", "session_expired", null, null);
            C2252321DDq c2252321DDq6 = this.LL;
            do {
                value2 = c2252321DDq6.getValue();
                r52 = r62;
                r62 = r62;
            } while (!c2252321DDq6.compareAndSet(value2, C1715060ujQ.LIZ((C1715060ujQ) value2, r52, r62, r62, new C1715110ujV(Boolean.TRUE), false, r62, 39)));
            return;
        }
        C1715520ukA.LIZLLL("bio_vf_vrf_rsp", "unknown", null, null);
        C2252321DDq c2252321DDq7 = this.LL;
        do {
            value = c2252321DDq7.getValue();
            r5 = r6;
            r6 = r6;
        } while (!c2252321DDq7.compareAndSet(value, C1715060ujQ.LIZ((C1715060ujQ) value, new C1715110ujV(Boolean.TRUE), r5, r6, r6, false, r6, 46)));
    }
}
