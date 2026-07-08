package dn3;

import X.C01GW;
import X.C11NJ;
import X.C11RK;
import X.C19475711Hn;
import X.C1DGI;
import X.C1DGK;
import X.C1DGU;
import X.C1DHA;
import X.C1DHB;
import X.C1DHC;
import X.C1DHG;
import X.C1DHH;
import X.C1DHK;
import X.C1DHN;
import X.C1DHP;
import X.C1DHU;
import X.C1DHW;
import X.C1DHX;
import X.C1DHZ;
import X.C1DKA;
import X.C2185991Agv;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C2253261DHg;
import X.C2253271DHh;
import X.C452501pT;
import X.EnumC1403300mca;
import X.InterfaceC1463990oCT;
import X.InterfaceC1645720sva;
import X.InterfaceC1660820tJw;
import X.InterfaceC2252981DGe;
import X.InterfaceC2253331DHn;
import X.InterfaceC2253811DJj;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254011DKd;
import X.InterfaceC2254211DKx;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class k<KEY extends Enum<KEY>> implements C1DHW<KEY> {
    public final C1DGK<KEY> LIZ;
    public final C1DGU<KEY> LIZIZ;
    public final C1DGI<KEY> LIZJ;
    public final C1DHH LIZLLL;
    public final Function0<C1DHP> LJ;
    public InterfaceC2252981DGe<KEY> LJI;
    public C1DHA LJII;
    public final Map<C1DGK<KEY>, InterfaceC2252981DGe<KEY>> LJFF = new LinkedHashMap();
    public final C11NJ LJIIIIZZ = new C11NJ();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, (k<Enum<Object>>) 243));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, (k<Enum<Object>>) 244));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(360));
    public final C11RK<C1DHG> LJIIL = new C11RK<>();
    public final C11RK<C1DHN> LJIILIIL = new C11RK<>();
    public final C11RK<InterfaceC2252981DGe<KEY>> LJIILJJIL = new C11RK<>();
    public final C11RK<C1DHK> LJIILL = new C11RK<>();

    @Override // X.C1DH9
    public final int LJLJJLL() {
        return LJIIJJI(false);
    }

    public final C19475711Hn LIZJ() {
        C11RK<Unit> c11rk = ((C1DHC) this.LJIIJJI.getValue()).LIZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final InterfaceC2252981DGe<KEY> LIZLLL() {
        InterfaceC2252981DGe<KEY> interfaceC2252981DGe = this.LJI;
        if (interfaceC2252981DGe != null) {
            return interfaceC2252981DGe;
        }
        "no active session found, make sure are not accessing session before init or during switch".toString();
        throw new IllegalArgumentException("no active session found, make sure are not accessing session before init or during switch");
    }

    public final C1DHP LJIILJJIL() {
        return (C1DHP) this.LJIIIZ.getValue();
    }

    public final C1DHA LJIILL() {
        C1DHA c1dha = this.LJII;
        if (c1dha != null) {
            return c1dha;
        }
        "recorder not initialized yet, make sure you access recorder after init".toString();
        throw new IllegalArgumentException("recorder not initialized yet, make sure you access recorder after init");
    }

    public final C19475711Hn LJIIZILJ() {
        C11RK<Unit> c11rk = ((C1DHC) this.LJIIJJI.getValue()).LIZIZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC2254021DKe
    public final C1DHU ep() {
        return (C1DHU) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC2254211DKx LIZ() {
        return LJIILL().LIZ();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC2253811DJj LJ() {
        return LJIILL().LJ();
    }

    @Override // X.C1DH9
    public final void LJIIIZ() {
        LIZLLL().LJIIIZ();
    }

    @Override // X.InterfaceC2254021DKe
    public final C1DHA LJIIJ() {
        return LJIILL();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC2254011DKd LJIILIIL() {
        return LJIILL().LJFF();
    }

    @Override // X.C1DH9
    public final void Lo() {
        LIZLLL().Lo();
    }

    @Override // X.C1DH9
    public final InterfaceC2253331DHn Pk() {
        return LIZLLL().Pk();
    }

    @Override // X.C1DH9
    public final boolean Ue() {
        return LIZLLL().Ue();
    }

    @Override // X.C1DH9
    public final boolean Uq() {
        return LIZLLL().Uq();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC1660820tJw getAudioController() {
        return LJIILL().getAudioController();
    }

    @Override // X.InterfaceC2254021DKe
    public final C1DHX getCameraController() {
        return LJIILL().getCameraController();
    }

    @Override // X.C1DH9
    public final int getCameraType() {
        return LIZLLL().getCameraType();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC1645720sva getEffectController() {
        return LJIILL().getEffectController();
    }

    @Override // X.InterfaceC2254021DKe
    public final InterfaceC2254001DKc getMediaController() {
        return LJIILL().getMediaController();
    }

    @Override // X.C1DH9
    public final void h0() {
        LIZLLL().h0();
    }

    @Override // X.C1DH9
    public final void j8() {
        LIZLLL().j8();
    }

    @Override // X.C1DH9
    public final void ls() {
        LIZLLL().ls();
    }

    @Override // X.InterfaceC2254021DKe
    public final void release() {
        C2219091BtD.LIZLLL().i("CaptureLog release");
        InterfaceC2252981DGe<KEY> interfaceC2252981DGe = this.LJI;
        if (interfaceC2252981DGe != null) {
            interfaceC2252981DGe.LJI();
            interfaceC2252981DGe.release();
        }
        C1DHA c1dha = this.LJII;
        if (c1dha != null) {
            c1dha.release();
        }
        this.LJIIIIZZ.dispose();
    }

    @Override // X.C1DH9
    public final void LIZIZ(float f) {
        LIZLLL().LIZIZ(f);
    }

    @Override // X.C1DH9
    public final int LJIIJJI(boolean z) {
        return LIZLLL().LJIIJJI(false);
    }

    public final void LJIILLIIL(C2253271DHh c2253271DHh) {
        C1DGK<KEY> key;
        Pair pair;
        C1DKA c1dka;
        Pair pair2;
        C1DKA c1dka2;
        if (this.LJI != null) {
            return;
        }
        C2219091BtD.LIZLLL().i("CaptureLog init");
        C1DGK<KEY> c1dgk = this.LIZ;
        final InterfaceC2252981DGe<KEY> interfaceC2252981DGe = this.LJI;
        if (interfaceC2252981DGe != null) {
            interfaceC2252981DGe.LJI();
            this.LJIIL.onNext(new C1DHG(interfaceC2252981DGe) { // from class: X.1DHE
                public final InterfaceC2252981DGe<?> LIZ;

                {
                    this.LIZ = interfaceC2252981DGe;
                }
            });
        }
        C1DGI<KEY> c1dgi = this.LIZJ;
        C1DGK<KEY> key2 = null;
        if (interfaceC2252981DGe != null) {
            key = interfaceC2252981DGe.getKey();
        } else {
            key = null;
        }
        C1DKA c1dkaLIZ = c1dgi.LIZ(key, c1dgk);
        if (interfaceC2252981DGe != null) {
            pair = new Pair(interfaceC2252981DGe.getKey(), interfaceC2252981DGe.getSessionContext());
        } else {
            pair = null;
        }
        Pair pair3 = new Pair(c1dgk, c1dkaLIZ);
        this.LJIILIIL.onNext(new C1DHN() { // from class: X.1DHO
        });
        if (pair != null) {
            c1dka = (C1DKA) pair.getSecond();
        } else {
            c1dka = null;
        }
        LJIJI(c1dka, (C1DKA) pair3.getSecond(), true);
        RecorderImpl recorderImplLIZ = this.LIZLLL.LIZ(c1dkaLIZ, c2253271DHh);
        this.LJII = recorderImplLIZ;
        C1DHB c1dhb = new C1DHB(LJIILJJIL(), recorderImplLIZ, ep(), (C1DHC) this.LJIIJJI.getValue(), new AwS436S0200000_35((k) this, (k<Enum<Object>>) c1dgk, (C1DGK<Enum<Object>>) 52));
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJFF;
        InterfaceC2252981DGe<KEY> interfaceC2252981DGeLIZ = (InterfaceC2252981DGe<KEY>) linkedHashMap.get(c1dgk);
        if (interfaceC2252981DGeLIZ == null) {
            interfaceC2252981DGeLIZ = this.LIZIZ.LIZ(c1dgk, c1dhb);
            linkedHashMap.put(c1dgk, interfaceC2252981DGeLIZ);
        }
        final InterfaceC2252981DGe<KEY> interfaceC2252981DGe2 = interfaceC2252981DGeLIZ;
        this.LJI = interfaceC2252981DGe2;
        if (interfaceC2252981DGe != null) {
            this.LJIIL.onNext(new C1DHG(interfaceC2252981DGe, interfaceC2252981DGe2) { // from class: X.1DHF
                public final InterfaceC2252981DGe<?> LIZ;
                public final InterfaceC2252981DGe<?> LIZIZ;

                {
                    this.LIZ = interfaceC2252981DGe;
                    this.LIZIZ = interfaceC2252981DGe2;
                }
            });
        }
        interfaceC2252981DGe2.LJFF();
        if (interfaceC2252981DGe != null) {
            pair2 = new Pair(interfaceC2252981DGe.getKey(), interfaceC2252981DGe.getSessionContext());
        } else {
            pair2 = null;
        }
        Pair pair4 = new Pair(c1dgk, interfaceC2252981DGe2.getSessionContext());
        this.LJIILIIL.onNext(new C1DHN() { // from class: X.1DHM
        });
        if (pair2 != null) {
            c1dka2 = (C1DKA) pair2.getSecond();
        } else {
            c1dka2 = null;
        }
        LJIJI(c1dka2, (C1DKA) pair4.getSecond(), false);
        if (interfaceC2252981DGe != null) {
            this.LJIIL.onNext(new C1DHG(interfaceC2252981DGe, interfaceC2252981DGe2) { // from class: X.1DHD
                public final InterfaceC2252981DGe<?> LIZ;
                public final InterfaceC2252981DGe<?> LIZIZ;

                {
                    this.LIZ = interfaceC2252981DGe;
                    this.LIZIZ = interfaceC2252981DGe2;
                }
            });
        } else {
            this.LJIILJJIL.onNext(interfaceC2252981DGe2);
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptureLog switchSessionActual [oldSessionKey, newSessionKey] | [");
        if (interfaceC2252981DGe != null) {
            key2 = interfaceC2252981DGe.getKey();
        }
        sbLIZ.append(key2);
        sbLIZ.append(", ");
        sbLIZ.append(interfaceC2252981DGe2.getKey());
        sbLIZ.append(']');
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJ(C1DHZ c1dhz) {
        ((C1DHC) this.LJIIJJI.getValue()).LIZJ = c1dhz;
    }

    @Override // X.C1DH9
    public final UUID Th(int[] iArr) {
        return LIZLLL().Th(iArr);
    }

    @Override // X.C1DH9
    public final void Uj(boolean z) {
        LIZLLL().Uj(z);
    }

    @Override // X.C1DH9
    public final C2185991Agv wr(int[] iArr) {
        return LIZLLL().wr(iArr);
    }

    @Override // X.C1DH9
    public final boolean K3(float f, float f2) {
        return LIZLLL().K3(f, f2);
    }

    @Override // X.C1DH9
    public final void LJII(Cert cert, boolean z) {
        LIZLLL().LJII(cert, z);
    }

    @Override // X.C1DH9
    public final int Cd(boolean z, Cert cert, String str) {
        return LIZLLL().Cd(z, cert, str);
    }

    @Override // X.C1DH9
    public final void LJIIIIZZ(boolean z, Cert cert, boolean z2) {
        LIZLLL().LJIIIIZZ(z, cert, z2);
    }

    @Override // X.C1DH9
    public final void LJIIL(Cert cert, boolean z, float f) {
        LIZLLL().LJIIL(cert, z, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1DHL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1DHL, java.lang.Object] */
    public final void LJIJI(C1DKA c1dka, C1DKA c1dka2, boolean z) {
        Float fValueOf;
        C1DHK c1dhk;
        EnumC1403300mca enumC1403300mca;
        if (c1dka != null && (enumC1403300mca = c1dka.LJ) != null) {
            fValueOf = Float.valueOf(enumC1403300mca.getRatio());
        } else {
            fValueOf = null;
        }
        if (!Intrinsics.LIZLLL(fValueOf, c1dka2.LJ.getRatio()) && c1dka != null) {
            final EnumC1403300mca enumC1403300mca2 = c1dka.LJ;
            final ?? r4 = new Object(enumC1403300mca2) { // from class: X.1DHL
            };
            final EnumC1403300mca enumC1403300mca3 = c1dka2.LJ;
            final ?? r3 = new Object(enumC1403300mca3) { // from class: X.1DHL
            };
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CaptureLog tryEmitRatioChangeEvent isWillChange:");
            sbLIZ.append(z);
            sbLIZ.append(", [fromStrategy, toStrategy] | [");
            sbLIZ.append((Object) r4);
            sbLIZ.append(", ");
            sbLIZ.append((Object) r3);
            sbLIZ.append(']');
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                c1dhk = new C1DHK(r4, r3) { // from class: X.1DHJ
                };
            } else {
                c1dhk = new C1DHK(r4, r3) { // from class: X.1DHI
                };
            }
            this.LJIILL.onNext(c1dhk);
            return;
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CaptureLog tryEmitRatioChangeEvent preview ratio not change, isWillChange:");
        sbLIZ2.append(z);
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public k(C1DGK c1dgk, C1DGU c1dgu, C1DGI c1dgi, C2253261DHg c2253261DHg, Function0 function0) {
        this.LIZ = c1dgk;
        this.LIZIZ = c1dgu;
        this.LIZJ = c1dgi;
        this.LIZLLL = c2253261DHg;
        this.LJ = function0;
    }
}
