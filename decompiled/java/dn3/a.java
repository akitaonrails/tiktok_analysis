package dn3;

import X.C01GW;
import X.C11PQ;
import X.C138P;
import X.C1638280sja;
import X.C1AL1;
import X.C1DGK;
import X.C1DHB;
import X.C1DHQ;
import X.C1DHU;
import X.C1DHV;
import X.C1DHX;
import X.C1DHY;
import X.C1DI5;
import X.C1DI6;
import X.C1DIF;
import X.C1DKA;
import X.C21366318jV;
import X.C2185991Agv;
import X.C2188811AlT;
import X.C2206701BYe;
import X.C2219091BtD;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1641610sox;
import X.EnumC452301pR;
import X.InterfaceC1463990oCT;
import X.InterfaceC1660820tJw;
import X.InterfaceC1780680wRG;
import X.InterfaceC2252981DGe;
import X.InterfaceC2253251DHf;
import X.InterfaceC2253331DHn;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import dn3.a;
import java.lang.Enum;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class a<KEY extends Enum<KEY>> implements InterfaceC2252981DGe<KEY>, InterfaceC1780680wRG {
    public final C1DGK<KEY> LIZ;
    public final C1DHB LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final String LJIILL;
    public int LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public final C11PQ<Boolean> LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;

    @Override // X.C1DH9
    public final int LJLJJLL() {
        return LJIIJJI(false);
    }

    @Override // X.C1DH9
    public final void Lo() {
        LJIILLIIL().LIZJ(LJIIJJI(false) != 1 ? 1 : 0);
    }

    @Override // X.C1DH9
    public final boolean Ue() {
        return LJIIJJI(false) == 1;
    }

    @Override // X.C1DH9
    public final void j8() {
        this.LJIIJJI = false;
        this.LJIIJ = false;
        getCameraController().G4();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1DHQ] */
    public final C1DHQ LJIILL() {
        ?? r3 = new InterfaceC2253331DHn(this) { // from class: X.1DHQ
            public final /* synthetic */ a<Enum<Object>> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i) {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJIILL);
                sbLIZ.append(" CameraOpenListener => onOpenSuccess");
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                a<Enum<Object>> aVar = this.LIZ;
                aVar.LJIJ = i;
                int iLJIIJJI = aVar.LJIIJJI(true);
                this.LIZ.LJIILLIIL().LIZJ(iLJIIJJI);
                this.LIZ.LJIIZILJ().LIZLLL(iLJIIJJI);
                if (!this.LIZ.LIZIZ.LIZIZ.LIZIZ()) {
                    InterfaceC2254001DKc interfaceC2254001DKc = (InterfaceC2254001DKc) this.LIZ.LJI.getValue();
                    this.LIZ.LIZIZ.LIZ.LIZIZ();
                    interfaceC2254001DKc.n5();
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZ.LJIILL);
                    sbLIZ2.append(" CameraOpenListener => setSharedTextureStatus status: ");
                    sbLIZ2.append(false);
                    interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1DHY c1dhyLJIIZILJ = this.LIZ.LJIIZILJ();
                c1dhyLJIIZILJ.getClass();
                new AwS579S0100000_35(c1dhyLJIIZILJ, 246).invoke();
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i, int i2, String str) {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJIILL);
                sbLIZ.append(" CameraOpenListener => onOpenFail [cameraType, errorCode, info] | [");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(str);
                sbLIZ.append(']');
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJIIZILJ().LIZIZ(i, i2, str);
                C1DHY c1dhyLJIIZILJ = this.LIZ.LJIIZILJ();
                c1dhyLJIIZILJ.getClass();
                new AwS579S0100000_35(c1dhyLJIIZILJ, 246).invoke();
            }
        };
        this.LJIJJLI = true;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" generateOpenCameraListener => curIsOpenCameraListenersFirstGenerated:");
        sbLIZ.append(this.LJIJJLI);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        return r3;
    }

    public final C1DHV LJIILLIIL() {
        return (C1DHV) this.LJII.getValue();
    }

    public final C1DHY LJIIZILJ() {
        return (C1DHY) this.LJIIIZ.getValue();
    }

    public final void LJIJI() {
        int i = this.LJIJ;
        if (i == 0) {
            if (getCameraController().a4() || this.LJIILIIL) {
                return;
            }
            this.LJIILIIL = true;
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Context contextM3 = C786410Ut5.M3(C2219091BtD.LIZ());
            c1638280sja.getClass();
            C1638280sja.LIZ(2131828290, 1, contextM3).LIZ();
            return;
        }
        if (i != 1 || getCameraController().a4() || this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        C1638280sja c1638280sja2 = C21366318jV.LIZLLL;
        Context contextM32 = C786410Ut5.M3(C2219091BtD.LIZ());
        c1638280sja2.getClass();
        C1638280sja.LIZ(2131828290, 1, contextM32).LIZ();
    }

    @Override // X.C1DH9
    public final InterfaceC2253331DHn Pk() {
        if (this.LJIJJLI) {
            return null;
        }
        return LJIILL();
    }

    public final C1DHX getCameraController() {
        return (C1DHX) this.LJ.getValue();
    }

    @Override // X.InterfaceC2252981DGe
    public final C1DKA getSessionContext() {
        return this.LIZIZ.LJ.invoke();
    }

    @Override // X.InterfaceC2252981DGe
    public final void LJFF() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" => active");
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIJI.onNext(Boolean.TRUE);
    }

    @Override // X.InterfaceC2252981DGe
    public final void LJI() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" => inactive");
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIJI.onNext(Boolean.FALSE);
    }

    @Override // X.C1DH9
    public final void LJIIIZ() {
        int iLIZ = LJIILLIIL().LIZ();
        int i = iLIZ == 1 ? 0 : 1;
        LJIILLIIL().LIZJ(i);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" => camera_switch CameraModule switchFrontRearCameraOnlyStore originFacing: ");
        sbLIZ.append(iLIZ);
        sbLIZ.append(", newFacing: ");
        sbLIZ.append(i);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJIJJ() {
        if (getCameraController().f4()) {
            return false;
        }
        if (!this.LJIIJJI) {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Context contextM3 = C786410Ut5.M3(C2219091BtD.LIZ());
            c1638280sja.getClass();
            C1638280sja.LIZ(2131858536, 1, contextM3).LIZ();
            this.LJIIJJI = true;
        }
        return true;
    }

    @Override // X.C1DH9
    public final boolean Uq() {
        VECameraSettings.CAMERA_TYPE cameraType;
        VECameraSettings vECameraSettingsLIZIZ = getCameraController().s4().LIZIZ();
        if (vECameraSettingsLIZIZ == null || (cameraType = vECameraSettingsLIZIZ.getCameraType()) == null) {
            cameraType = VECameraSettings.CAMERA_TYPE.NULL;
        }
        return cameraType == VECameraSettings.CAMERA_TYPE.TYPE1;
    }

    @Override // X.C1DH9
    public final void h0() {
        getCameraController().h0();
        j8();
    }

    @Override // X.C1DH9
    public final void ls() {
        getCameraController().N3(0.0f);
        j8();
    }

    @Override // X.InterfaceC2252981DGe
    public final void release() {
        LJIIZILJ().getClass();
    }

    @Override // X.C1DH9
    public final int getCameraType() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC2252981DGe
    public final C1DGK<KEY> getKey() {
        return this.LIZ;
    }

    @Override // X.C1DH9
    public final void LIZIZ(float f) {
        this.LJIIJ = true;
        LJIJI();
        if (LJIJJ()) {
            return;
        }
        getCameraController().LIZIZ(f);
    }

    @Override // X.C1DH9
    public final int LJIIJJI(boolean z) {
        Integer num = getSessionContext().LIZ;
        if (num != null && this.LJIILJJIL) {
            this.LJIILJJIL = false;
            int iLIZIZ = LJIILLIIL().LIZIZ(num.intValue());
            LJIILLIIL().LIZJ(iLIZIZ);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("=> camera_switch CameraModule getCameraFacing incomeFacing: ");
            sbLIZ.append(num);
            sbLIZ.append(", fromInit:");
            sbLIZ.append(z);
            sbLIZ.append(", facing:");
            sbLIZ.append(iLIZIZ);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            return iLIZIZ;
        }
        return LJIILLIIL().LIZ();
    }

    public final void LJIILJJIL(boolean z) {
        boolean z2;
        getCameraController().setCameraPreviewSizeInterface((C1DIF) this.LJIIIIZZ.getValue());
        getCameraController().Z3(this);
        C1DHU c1dhu = this.LIZIZ.LIZJ;
        c1dhu.getClass();
        C2219091BtD.LIZLLL().d("CameraAntiShakeV1 -> initShakeFreeMode");
        boolean z3 = false;
        if (c1dhu.LIZIZ()) {
            boolean zLIZ = C1DHU.LIZ(c1dhu.LIZIZ);
            C1DHU.LJ = zLIZ;
            C1DHU.LJFF = zLIZ;
            C1DHX c1dhx = c1dhu.LIZJ;
            if (zLIZ && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1dhx.d4(z2);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CameraAntiShakeV1 -> initShakeFreeMode: currentMode = ");
            sbLIZ.append(zLIZ);
            sbLIZ.append("; isBackCamera = ");
            sbLIZ.append(z);
            interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CameraAntiShakeV1 -> initShakeFreeMode: setEnableAntiShake(");
            if (zLIZ && z) {
                z3 = true;
            }
            sbLIZ2.append(z3);
            sbLIZ2.append(")");
            interfaceC1463990oCTLIZLLL2.d(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C2206701BYe.LIZ(c1dhu.LIZIZ).LIZIZ(2);
            C1DHU.LJ = false;
            C1DHU.LJFF = false;
        }
        this.LJIJJ = true;
    }

    public final void LJIJ(String str) {
        if (this.LJIILLIIL != -1) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" => VEBlur # onCameraSwitched, enterFrom: ");
            sbLIZ.append(str);
            sbLIZ.append(" , actual remove blur, ratioIndex is ");
            sbLIZ.append(this.LJIILLIIL);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            getCameraController().K4(this.LJIILLIIL);
            this.LJIILLIIL = -1;
        }
    }

    @Override // X.C1DH9
    public final UUID Th(int[] iArr) {
        boolean z;
        UUID uuid;
        if (iArr != null && iArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C2185991Agv c2185991AgvLJIIIIZZ = getCameraController().s4().LJIIIIZZ(new VESize(Math.max(iArr[0], iArr[1]), Math.min(iArr[0], iArr[1])), false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseCameraCaptureSession getRecorderCameraSettingsUUID -> ");
        if (c2185991AgvLJIIIIZZ != null) {
            uuid = c2185991AgvLJIIIIZZ.LJII;
        } else {
            uuid = null;
        }
        sbLIZ.append(uuid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c2185991AgvLJIIIIZZ == null) {
            return null;
        }
        return c2185991AgvLJIIIIZZ.LJII;
    }

    @Override // X.C1DH9
    public final void Uj(boolean z) {
        if (this.LJIJJ) {
            return;
        }
        LJIILJJIL(z);
    }

    @Override // X.C1DH9
    public final C2185991Agv wr(int[] iArr) {
        boolean z;
        if (iArr != null && iArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        UUID uuid = null;
        if (!z) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseCameraCaptureSession lastLiveResolution-> ");
        sbLIZ.append(iArr[0]);
        sbLIZ.append(", ");
        sbLIZ.append(iArr[1]);
        C2188811AlT.LIZIZ(sbLIZ);
        C2185991Agv c2185991AgvLJIIIIZZ = getCameraController().s4().LJIIIIZZ(new VESize(Math.max(iArr[0], iArr[1]), Math.min(iArr[0], iArr[1])), true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BaseCameraCaptureSession getLiveCameraPipeline UUID-> ");
        if (c2185991AgvLJIIIIZZ != null) {
            uuid = c2185991AgvLJIIIIZZ.LJII;
        }
        sbLIZ2.append(uuid);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c2185991AgvLJIIIIZZ;
    }

    public a(C1DGK<KEY> c1dgk, C1DHB c1dhb) {
        this.LIZ = c1dgk;
        this.LIZIZ = c1dhb;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 241));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 234));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 235));
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 233));
        this.LJI = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 238));
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 236));
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(this, 237));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 239));
        this.LJIILJJIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseCaptureSession ");
        sbLIZ.append(c1dgk);
        this.LJIILL = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIILLIIL = -1;
        this.LJIJI = new C11PQ<>();
    }

    @Override // X.C1DH9
    public final boolean K3(float f, float f2) {
        LJIIZILJ().LJIIIIZZ(getCameraController().getCameraZoomList(), this.LJIIJ, getCameraController().LJFF());
        if (this.LJIIJ) {
            return true;
        }
        LJIJI();
        if (LJIJJ()) {
            return true;
        }
        getCameraController().K3(f, f2);
        return true;
    }

    @Override // X.C1DH9
    public final void LJII(Cert cert, boolean z) {
        if (z) {
            int iLJI = getCameraController().X3().LJI();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" => VEBlur # SwitchWideMode, start add blur, ratioIndex is ");
            sbLIZ.append(this.LJIILLIIL);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            this.LJIILLIIL = getCameraController().V3(360, 640, Integer.valueOf(iLJI), new AwS579S0100000_35(this, 240));
        }
        getCameraController().X3().LIZJ(cert);
    }

    @Override // X.C1DH9
    public final int Cd(boolean z, Cert cert, final String str) {
        int i;
        boolean z2;
        int iLIZIZ;
        this.LJIIZILJ = System.currentTimeMillis();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" => VEBlurDuration # startCameraSwitch, withBlur: ");
        sbLIZ.append(z);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        int iLIZ = LJIILLIIL().LIZ();
        if (iLIZ == 1) {
            i = 0;
        } else {
            i = 1;
        }
        LJIILLIIL().LIZJ(i);
        if (LJIIJJI(false) == 0) {
            z2 = true;
            iLIZIZ = getCameraController().X3().LJI();
        } else {
            z2 = false;
            iLIZIZ = getCameraController().X3().LIZIZ();
        }
        C1DHU c1dhu = this.LIZIZ.LIZJ;
        boolean z3 = !z2;
        if (c1dhu.LIZLLL.LIZIZ() && c1dhu.LIZIZ()) {
            if (z3) {
                c1dhu.LIZJ.d4(false);
                C2219091BtD.LIZLLL().d("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(false)");
            } else {
                c1dhu.LIZJ.d4(true);
                C2219091BtD.LIZLLL().d("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(true)");
            }
        } else if (c1dhu.LIZIZ()) {
            if (z3) {
                c1dhu.LIZJ.d4(false);
            } else {
                c1dhu.LIZJ.d4(C1DHU.LIZ(c1dhu.LIZIZ));
            }
        }
        if (z) {
            if (iLIZ != 1) {
                iLIZ = getCameraController().X3().LJI();
            }
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LJIILL);
            sbLIZ2.append(" => VEBlur # onCameraSwitched, start add blur, ratioIndex is ");
            sbLIZ2.append(this.LJIILLIIL);
            interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIILLIIL = getCameraController().V3(360, 640, Integer.valueOf(iLIZ), new AwS579S0100000_35(this, 242));
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LJIILL);
        sbLIZ3.append(" => camera_switch CameraModule switchFrontRearCamera originFacing: originFacing, newFacing:");
        sbLIZ3.append(i);
        sbLIZ3.append(", isBackCamera:");
        sbLIZ3.append(z2);
        sbLIZ3.append(", cameraIndex:");
        sbLIZ3.append(iLIZIZ);
        sbLIZ3.append(", enterMethod:");
        sbLIZ3.append(str);
        interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ3));
        final C138P c138pLIZ = C138P.LIZ();
        try {
            getCameraController().I4(iLIZIZ, new InterfaceC2253331DHn(c138pLIZ, str) { // from class: X.1DHR
                public final /* synthetic */ C138P LIZIZ;

                @Override // X.InterfaceC2253331DHn
                public final void LIZIZ(int i2) {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LIZ.LJIILL);
                    sbLIZ4.append(" => onOpenSuccess, cameraType: ");
                    sbLIZ4.append(i2);
                    interfaceC1463990oCTLIZLLL4.i(C2188811AlT.LIZIZ(sbLIZ4));
                    int iLJIIJJI = this.LIZ.LJIIJJI(false);
                    a<Enum<Object>> aVar = this.LIZ;
                    aVar.LJIJ = i2;
                    aVar.LJIILLIIL().LIZJ(iLJIIJJI);
                    this.LIZ.LJIIZILJ().LJIIJ(iLJIIJJI);
                    C1DHY c1dhyLJIIZILJ = this.LIZ.LJIIZILJ();
                    c1dhyLJIIZILJ.getClass();
                    new AwS579S0100000_35(c1dhyLJIIZILJ, 246).invoke();
                }

                @Override // X.InterfaceC2253331DHn
                public final void LIZ(int i2, int i3, String str2) {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LIZ.LJIILL);
                    sbLIZ4.append(" => onOpenFail [cameraType, errorCode, info] | [");
                    sbLIZ4.append(i2);
                    sbLIZ4.append(", ");
                    sbLIZ4.append(i3);
                    sbLIZ4.append(", ");
                    sbLIZ4.append(str2);
                    sbLIZ4.append(']');
                    interfaceC1463990oCTLIZLLL4.i(C2188811AlT.LIZIZ(sbLIZ4));
                    this.LIZIZ.LIZJ();
                    this.LIZ.LJIJ("openCameraFailed");
                    C1DHY c1dhyLJIIZILJ = this.LIZ.LJIIZILJ();
                    c1dhyLJIIZILJ.getClass();
                    new AwS579S0100000_35(c1dhyLJIIZILJ, 246).invoke();
                    this.LIZ.LJIIZILJ().LJII(i2, i3, str2);
                }
            }, cert);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(e);
        }
        getCameraController().J4(new InterfaceC2253251DHf(this) { // from class: X.1DHT
            public final /* synthetic */ a<Enum<Object>> LIZIZ;

            @Override // X.InterfaceC2253251DHf
            public final void LIZJ() {
                C138P c138p = c138pLIZ;
                if (c138p.LIZIZ) {
                    c138p.LJ();
                }
                this.LIZIZ.LJIJ("changeCameraFirstFrame");
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(this.LIZIZ.LJIILL);
                sbLIZ4.append(" => VEBlurDuration # onCameraSwitchedSuccessFirstFrame, duration: ");
                sbLIZ4.append(System.currentTimeMillis() - this.LIZIZ.LJIIZILJ);
                interfaceC1463990oCTLIZLLL4.i(C2188811AlT.LIZIZ(sbLIZ4));
                this.LIZIZ.LJIIZILJ().LJ(c138pLIZ.LIZIZ(TimeUnit.MILLISECONDS), this.LIZIZ.getCameraController().getCameraTypeString(), this.LIZIZ.LJIIJJI(false) == 0 ? "front" : "back", str);
                this.LIZIZ.LJIIZILJ().LJI();
                this.LIZIZ.getCameraController().v4(this);
            }

            {
                this.LIZIZ = this;
            }
        });
        return iLIZIZ;
    }

    @Override // X.InterfaceC1780680wRG
    public final void LIZLLL(float f, int i, boolean z) {
        LJIIZILJ().LJFF(f, i, z);
    }

    @Override // X.C1DH9
    public final void LJIIIIZZ(boolean z, Cert cert, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("async: ");
        sbLIZ.append(z);
        sbLIZ.append(", policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_RELEASE_CAMERA", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJIILL);
        sbLIZ2.append(" => camera release");
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ2));
        getCameraController().LIZ(0);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LJIILL);
        sbLIZ3.append(" => closeCamera");
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
        C1DHY c1dhyLJIIZILJ = LJIIZILJ();
        c1dhyLJIIZILJ.getClass();
        new AwS579S0100000_35(c1dhyLJIIZILJ, 245).invoke();
        getCameraController().c4(cert, z);
        getCameraController().setCameraPreviewSizeInterface(null);
        getCameraController().p4(this);
        ((InterfaceC1660820tJw) this.LJFF.getValue()).LJIIIZ(C1DI6.LIZ.LIZIZ(C1DI5.STOP_AUDIO_CAMERA_CLOSE, EnumC1641610sox.PAGE_INVISIBLE), z2);
    }

    @Override // X.C1DH9
    public final void LJIIL(Cert cert, boolean z, float f) {
        boolean z2;
        int iLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_INIT_CAMERA", C2188811AlT.LIZIZ(sbLIZ));
        boolean z3 = false;
        if (getCameraController().M3() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJIILL);
        sbLIZ2.append(" => initCamera cameraAlreadyOpened:");
        sbLIZ2.append(z2);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ2));
        if (LJIIJJI(!z2) == 0) {
            z3 = true;
            iLIZIZ = getCameraController().X3().LJI();
        } else {
            iLIZIZ = getCameraController().X3().LIZIZ();
        }
        LJIILJJIL(z3);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LJIILL);
        sbLIZ3.append(" => open camera");
        interfaceC1463990oCTLIZLLL2.d(C2188811AlT.LIZIZ(sbLIZ3));
        C1DHQ c1dhqLJIILL = LJIILL();
        LJIIZILJ().LJIIIZ();
        if (this.LIZIZ.LIZ.LIZJ().invoke().booleanValue()) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LJIILL);
            sbLIZ4.append(" => forbid open camera in background");
            interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (z) {
            getCameraController().M4(c1dhqLJIILL, cert, f);
        } else {
            getCameraController().D4(iLIZIZ, c1dhqLJIILL, cert, f);
        }
    }

    @Override // X.InterfaceC1780680wRG
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        LJIIZILJ().LIZJ(i, z, z2, f, list);
    }
}
