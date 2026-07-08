package com.ss.android.ugc.asve.recorder.camera;

import X.C01GW;
import X.C0BJ1;
import X.C0CNO;
import X.C1286570jaJ;
import X.C1448340nnE;
import X.C1622880sKk;
import X.C1649180t1A;
import X.C1660560tJW;
import X.C1664790tQL;
import X.C1780540wR2;
import X.C1954807lC;
import X.C1A84;
import X.C1AIY;
import X.C1AL1;
import X.C1DHQ;
import X.C1DHX;
import X.C1DI4;
import X.C1DI5;
import X.C1DI6;
import X.C1DIC;
import X.C1DIE;
import X.C1DIF;
import X.C1DIK;
import X.C1DIN;
import X.C1DIP;
import X.C1DIQ;
import X.C1DIT;
import X.C1DIU;
import X.C1DIW;
import X.C1DIX;
import X.C1DL8;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2216241Boc;
import X.C2219091BtD;
import X.C2249701D3o;
import X.C2253301DHk;
import X.C2253341DHo;
import X.C2253511DIf;
import X.C257320A6o;
import X.C257330A6p;
import X.C257340A6q;
import X.C257350A6r;
import X.C386801es;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1641610sox;
import X.EnumC1778340wNU;
import X.EnumC19366110pf;
import X.EnumC2244671CtN;
import X.EnumC2249691D3n;
import X.InterfaceC1283620jVY;
import X.InterfaceC1463990oCT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1660900tK4;
import X.InterfaceC1673870tez;
import X.InterfaceC1780680wRG;
import X.InterfaceC19771312Xf;
import X.InterfaceC2186211AhH;
import X.InterfaceC2240011Clr;
import X.InterfaceC2253251DHf;
import X.InterfaceC2253331DHn;
import X.InterfaceC2253351DHp;
import X.InterfaceC2253451DHz;
import X.InterfaceC2253521DIg;
import X.InterfaceC2253861DJo;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS613S0100000_34;
import zmj.j;

/* JADX INFO: loaded from: classes36.dex */
public final class VECameraController implements C1DHX, InterfaceC2253861DJo, GenericLifecycleObserver {
    public static int LLLLIIIILLL;
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final VERecorder LLILLL;
    public final InterfaceC2253521DIg LLILZ;
    public final C2253301DHk LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final InterfaceC2253451DHz LLIZ;
    public C1DIK LLJI;
    public Function0<Unit> LLJILJILJ;
    public C1DIF LLJILLL;
    public InterfaceC2240011Clr LLJJ;
    public InterfaceC1660900tK4 LLJJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final VECameraCapture LLJJJJLIIL;
    public final C01GW LLJJL;
    public VECameraSettings LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final C01GW LLJLIL;
    public C1DIT LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final boolean LLJZ;
    public final List<Integer> LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public float LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public long LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public int LLLIILIL;
    public boolean LLLIL;
    public final List<InterfaceC1780680wRG> LLLILZ;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super String, Unit> LLLILZJ;
    public final Set<InterfaceC2253351DHp> LLLILZLLLI;
    public Function0<Boolean> LLLIZZ;
    public Function0<Boolean> LLLJ;
    public int LLLJIL;
    public SparseIntArray LLLJL;
    public volatile C1780540wR2 LLLL;
    public int LLLLII;
    public final List<Function0<Unit>> LLIZLLLIL = new ArrayList();
    public final CopyOnWriteArrayList<C1DIK> LLJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC2253251DHf> LLJIJIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC2253331DHn> LLJILJIL = new CopyOnWriteArrayList<>();
    public final int LLJJIII = 720;
    public final int LLJJIJI = 1280;
    public int LLJJIJIL = -1;
    public final Object LLJJJ = new Object();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C1DHX
    public final Bundle A4() {
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        Context context = this.LL;
        vECameraCapture.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("device_support_wide_angle_mode", VEConfigCenter.getInstance().getValue("ve_camera_wide_angle", -1));
        bundle.putInt("device_support_antishake_mode", VEConfigCenter.getInstance().getValue("ve_camera_stablization", -1));
        bundle.putInt("device_support_ai_night_video", VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0));
        bundle.putBoolean("device_support_multicamera_zoom", VECameraCapture.LJJIJIL());
        vECameraCapture.LLJILJIL.getCameraAllFeatures(context, bundle);
        return bundle;
    }

    @Override // X.C1DHX
    public final void G4() {
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZOOM [");
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append("] scaleEnd");
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLL = 0.0f;
    }

    @Override // X.InterfaceC2253861DJo
    public final void LIZJ() {
        synchronized (this.LLJJJ) {
            boolean z = true;
            try {
                this.LLJJJIL = true;
                if (this.LLLIIL) {
                    if (!this.LLJJJJJIL || this.LLJJJJ) {
                        z = this.LLJJJJ;
                    } else {
                        this.LLILLL.LJJIIJ(this.LLJLILLLLZIIL);
                        this.LLILLL.LJJIL(this.LLJJJJLIIL, true);
                        InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
                        if (interfaceC2240011Clr != null) {
                            interfaceC2240011Clr.LJIJJLI();
                        }
                    }
                } else if (!this.LLJJJJJIL) {
                    z = false;
                } else if (!this.LLJJJJ) {
                    this.LLILLL.LJJIIJ(this.LLJLILLLLZIIL);
                    this.LLILLL.LJJIL(this.LLJJJJLIIL, true);
                    InterfaceC2240011Clr interfaceC2240011Clr2 = this.LLJJ;
                    if (interfaceC2240011Clr2 != null) {
                        interfaceC2240011Clr2.LJIJJLI();
                    }
                }
                this.LLJJJJ = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DHX
    public final boolean LIZLLL() {
        return this.LLJJJJLIIL.LJJJJIZL();
    }

    @Override // X.InterfaceC2253861DJo
    public final void LJ() {
        synchronized (this.LLJJJ) {
            try {
                this.LLJJJIL = false;
                if (this.LLJJJJ) {
                    this.LLILLL.LJJJJ();
                    this.LLJJJJ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        if (this.LLJJJJ) {
            this.LLJJJJLIIL.LJJJLZIJ();
            return;
        }
        if (this.LLLIIL) {
            this.LLJJJJJIL = false;
        }
        this.LLILLL.LJJIIJ(this.LLJLILLLLZIIL);
        this.LLILLL.LJJIL(this.LLJJJJLIIL, this.LLJJJIL);
        InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LJIJJLI();
        }
        this.LLJJJJ = true;
    }

    public final C1DIQ LJII() {
        return (C1DIQ) this.LLJJL.getValue();
    }

    public final boolean LJIIIIZZ() {
        Object objH2 = C786410Ut5.H2(this.LL, "power");
        PowerManager powerManager = objH2 instanceof PowerManager ? (PowerManager) objH2 : null;
        return powerManager != null && powerManager.isPowerSaveMode();
    }

    public final boolean LJIIIZ() {
        return this.LLJJLIIIJLLLLLLLZ.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_CamKit;
    }

    public final void LJIIJJI() {
        boolean z;
        int i;
        C1780540wR2 c1780540wR2 = this.LLLL;
        if (this.LLJLLIL && this.LLJJIJIIJIL && (i = this.LLJJIJIL) > 0 && c1780540wR2 != null && c1780540wR2.LIZ == i && c1780540wR2.LIZIZ == getCameraPosition() && c1780540wR2.LIZJ == LJIIJ() && c1780540wR2.LIZLLL == LJIIIZ() && c1780540wR2.LJI > 0.0f) {
            z = true;
            C2216241Boc c2216241Boc = C2216241Boc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZOOM queryZoomAbility cache hit, type=");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append(" position=");
            sbLIZ.append(getCameraPosition());
            sbLIZ.append(" maxZoom=");
            sbLIZ.append(c1780540wR2.LJI);
            c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ));
            C0CNO.LIZLLL(0L, new AwS428S0200000_27(this, c1780540wR2, 6));
        } else {
            z = false;
        }
        if (LJIIIZ()) {
            VECameraCapture vECameraCapture = this.LLJJJJLIIL;
            vECameraCapture.LLJILJIL.queryShaderZoomAbility(vECameraCapture);
        }
        if (z) {
            return;
        }
        VECameraCapture vECameraCapture2 = this.LLJJJJLIIL;
        vECameraCapture2.LLJILJIL.queryZoomAbility(vECameraCapture2, LJIIJ());
    }

    @Override // X.C1DHX
    public final int M3() {
        return this.LLJJJJLIIL.LJJIJIIJI();
    }

    @Override // X.C1DHX
    public final VESize N2() {
        return this.LLJJJJLIIL.LLILZIL;
    }

    @Override // X.C1DHX
    public final void Q3() {
        this.LLILLL.LIZIZ.getClass();
    }

    @Override // X.C1DHX
    public final long S3() {
        return this.LLJJJJLIIL.S3();
    }

    @Override // X.C1DHX
    public final void T3() {
        InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.T3();
        }
    }

    @Override // X.C1DHX
    public final C1DIN X3() {
        return (C1DIN) this.LLJLIL.getValue();
    }

    @Override // X.C1DHX
    public final boolean a4() {
        return (this.LLJL == -1.0f || ((ArrayList) this.LLJZIJLIL).isEmpty()) ? false : true;
    }

    @Override // X.C1DHX
    public final C1286570jaJ getCameraECInfo() {
        return this.LLJJJJLIIL.LJJIIZ();
    }

    @Override // X.C1DHX
    public final int getCameraPosition() {
        return this.LLJJLIIIJLLLLLLLZ.getCameraFacing().ordinal();
    }

    @Override // X.C1DHX
    public final String getCameraTypeString() {
        return this.LLJJJJLIIL.LJJIJIIJIL(this.LLJJIJIL);
    }

    @Override // X.C1DHX
    public final int getNextFlashMode() {
        return this.LLLJL.get(this.LLLJIL);
    }

    @Override // X.C1DHX
    public final void h0() {
        LJIILL(1.0f);
        this.LLLF = 1.0f;
    }

    @Override // X.C1DHX
    public final boolean isSupportedExposureCompensation() {
        return this.LLJJJJLIIL.LJJJJI();
    }

    @Override // X.C1DHX
    public final void j4() {
        this.LLJJJJLIIL.LJJJJJ();
    }

    @Override // X.C1DHX
    public final boolean l4() {
        if (!this.LLJLL) {
            return false;
        }
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        Context context = this.LL;
        VECameraSettings vECameraSettings = this.LLJJLIIIJLLLLLLLZ;
        vECameraCapture.getClass();
        if (vECameraSettings.getCameraType() != VECameraSettings.CAMERA_TYPE.TYPE2) {
            return false;
        }
        boolean zIsARCoreSupported = vECameraCapture.LLJILJIL.isARCoreSupported(context);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isARCoreSupported : ");
        sbLIZ.append(zIsARCoreSupported);
        C2183341Ace.LIZLLL("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        return zIsARCoreSupported;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        boolean zLJIJ = this.LLILZ.LJIJ();
        C1DI4 c1di4 = C1DI4.LIZ;
        c4(C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_CONTROLLER_ON_DESTROY, EnumC1641610sox.PAGE_INVISIBLE), zLJIJ);
        if (this.LLJLLL) {
            this.LLJJJJLIIL.LJJJLIIL(null);
            this.LLJJJJLIIL.getClass();
        }
        this.LLJJJJLIIL.LJJIII();
    }

    @Override // X.C1DHX
    public final float B4() {
        return LJIIJ() ? this.LLLFF : this.LLLF;
    }

    public final boolean LJIIJ() {
        return !LJIIIZ();
    }

    public final void LJIILJJIL() {
        if (LJIIJ()) {
            VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
            builder.setCameraZoomLimitFactor(1.0f);
            C2216241Boc.LIZ.LIZ("ZOOM enableMaxZoomOptimized");
            this.LLJJLIIIJLLLLLLLZ = builder.build();
        }
    }

    @Override // X.C1DHX
    public final boolean f4() {
        if (!a4()) {
            return false;
        }
        if (this.LLJZ) {
            if (X3().LJIIIIZZ(getCameraPosition() == 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1DHX
    public final boolean getHasSetFocusAreas() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLLII;
        return jCurrentTimeMillis - j <= ((long) this.LLLIIIIL) && j != 0;
    }

    @Override // X.C1DHX
    public final float LJFF() {
        return this.LLJL;
    }

    @Override // X.C1DHX
    public final int N4() {
        return this.LLLIILIL;
    }

    @Override // X.C1DHX
    public final boolean e4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C1DHX
    public final int getCameraPreviewHeight() {
        return this.LLJJIJI;
    }

    @Override // X.C1DHX
    public final int getCameraPreviewWidth() {
        return this.LLJJIII;
    }

    @Override // X.C1DHX
    public final List<Integer> getCameraZoomList() {
        return this.LLJZIJLIL;
    }

    @Override // X.C1DHX
    public final int getCurrentCameraType() {
        return this.LLJJIJIL;
    }

    @Override // X.C1DHX
    public final int getFlashMode() {
        return this.LLLJIL;
    }

    @Override // X.C1DHX
    public final int getLastFlashMode() {
        return LLLLIIIILLL;
    }

    @Override // X.C1DHX
    public final C1DIC s4() {
        return this.LLJJJJLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DIL] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C1DHX
    public final void C4(final C1DL8 c1dl8) {
        this.LLJJJJLIIL.LJJIJL(new InterfaceC1283620jVY() { // from class: X.1DIL
            @Override // X.InterfaceC1283620jVY
            public final void LIZ(int i) {
                c1dl8.invoke(Integer.valueOf(i), Integer.valueOf(this.LLLFZ), Integer.valueOf(this.LLLI));
            }
        });
    }

    @Override // X.C1DHX
    public final void E4(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    @Override // X.C1DHX
    public final void H4(boolean z) {
        this.LLLL = null;
        this.LLJJJJLIIL.LJJJJLL(z);
    }

    @Override // X.C1DHX
    public final void J4(InterfaceC2253251DHf interfaceC2253251DHf) {
        if (interfaceC2253251DHf != null) {
            this.LLJIJIL.add(interfaceC2253251DHf);
        }
    }

    @Override // X.C1DHX
    public final void K4(int i) {
        if (i != -1) {
            this.LLILLL.LIZIZ.LJJIZ.removeTrackFilter(i);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" => VEBlur # , removeVeBlurTrackWithIndex, ratioIndex is ");
            sbLIZ.append(i);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C1DHX
    public final void L3(final AwS613S0100000_34 awS613S0100000_34) {
        this.LLJJJJLIIL.LJIIIZ(new InterfaceC2186211AhH() { // from class: X.1DID
            @Override // X.InterfaceC2186211AhH
            public final /* synthetic */ void LIZ(float[] fArr) {
                awS613S0100000_34.invoke(fArr);
            }
        });
    }

    @Override // X.C1DHX
    public final void L4(int i) {
        this.LLLIILIL = i;
    }

    @Override // X.C1DHX
    public final void LIZ(int i) {
        VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode;
        InterfaceC2240011Clr interfaceC2240011Clr;
        if (this.LLILZ.LJII() && this.LLLIIII == i) {
            return;
        }
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Flash:switchFlashMode,mode:");
        sbLIZ.append(i);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_EXTERNAL;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE;
                        }
                    } else {
                        camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO;
                    }
                } else {
                    camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
                }
            } else {
                camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON;
            }
        } else {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
        }
        if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            this.LLJJJJLIIL.LJJLIIIIJ(camera_flash_mode);
        } else {
            this.LLJJJJLIIL.LJJLIIIIJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF);
        }
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            InterfaceC2240011Clr interfaceC2240011Clr2 = this.LLJJ;
            if (interfaceC2240011Clr2 != null) {
                interfaceC2240011Clr2.LJIIJJI();
            }
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF && (interfaceC2240011Clr = this.LLJJ) != null) {
            interfaceC2240011Clr.LJIILL();
        }
        this.LLLJIL = i;
        this.LLLIIII = i;
    }

    @Override // X.C1DHX
    public final boolean LIZIZ(float f) {
        if (!a4() || !f4()) {
            return false;
        }
        if (LJIIJ()) {
            float f2 = 1;
            float f3 = this.LLJL - f2;
            if (this.LLLFF <= 0.0f) {
                this.LLLFF = 1.0f;
            }
            if (f > 0.0f) {
                float f4 = f2 + (((f - this.LLL) * f3) / this.LLLFF);
                this.LLL = f;
                C2216241Boc c2216241Boc = C2216241Boc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ZOOM scaleCamera factor = ");
                sbLIZ.append(f4);
                c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ZOOM scaleCamera zoomV2CurrentZoom = ");
                sbLIZ2.append(this.LLLFF);
                c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                float f5 = this.LLLFF * f4;
                if (f5 < this.LLJL && (this.LLLFFI || f4 > 1.0f)) {
                    this.LLLFF = f5;
                    if (a4()) {
                        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
                        vECameraCapture.LLJILJIL.zoomV2(f4, vECameraCapture);
                        return true;
                    }
                }
            }
            return false;
        }
        C2216241Boc c2216241Boc2 = C2216241Boc.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ZOOM [");
        sbLIZ3.append(System.identityHashCode(this));
        sbLIZ3.append("] scaleCameraByRatio ratio = ");
        sbLIZ3.append(f);
        c2216241Boc2.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        if (f <= 0.05d) {
            f /= 4.0f;
        }
        float fMax = Math.max(0.0f, ((f - this.LLL) * this.LLJL) + this.LLLF);
        this.LLL = f;
        return N3(fMax);
    }

    public final void LJIIL(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        EnumC2244671CtN enumC2244671CtN;
        int i = C1DIU.LIZ[camera_facing_id.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            int rearCameraStabilizationStrategy = this.LLILZ.getRearCameraStabilizationStrategy();
            if (rearCameraStabilizationStrategy != 1) {
                if (rearCameraStabilizationStrategy != 2) {
                    if (rearCameraStabilizationStrategy != 3) {
                        enumC2244671CtN = EnumC2244671CtN.OFF;
                    } else {
                        enumC2244671CtN = EnumC2244671CtN.EIS_OIS;
                    }
                } else {
                    enumC2244671CtN = EnumC2244671CtN.OIS;
                }
            } else {
                enumC2244671CtN = EnumC2244671CtN.EIS;
            }
        } else {
            int frontCameraStabilizationStrategy = this.LLILZ.getFrontCameraStabilizationStrategy();
            if (frontCameraStabilizationStrategy != 1) {
                if (frontCameraStabilizationStrategy != 2) {
                    if (frontCameraStabilizationStrategy != 3) {
                        enumC2244671CtN = EnumC2244671CtN.OFF;
                    } else {
                        enumC2244671CtN = EnumC2244671CtN.EIS_OIS;
                    }
                } else {
                    enumC2244671CtN = EnumC2244671CtN.OIS;
                }
            } else {
                enumC2244671CtN = EnumC2244671CtN.EIS;
            }
        }
        if (((Boolean) C257320A6o.LIZ.getValue()).booleanValue() & ((Boolean) C257340A6q.LIZ.getValue()).booleanValue() & LJIIIIZZ()) {
            enumC2244671CtN = EnumC2244671CtN.OFF;
        }
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.enableStabilization(enumC2244671CtN);
        this.LLJJLIIIJLLLLLLLZ = builder.build();
    }

    public final void LJIILL(float f) {
        if (LJIIIZ() && this.LLLIL) {
            C2216241Boc c2216241Boc = C2216241Boc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZOOM veStartShaderZoom zoom:");
            sbLIZ.append(f);
            c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLL.LIZIZ.LJJJ.LJJII("setShaderZoom", f);
            return;
        }
        C2216241Boc c2216241Boc2 = C2216241Boc.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ZOOM veStartZoom zoom:");
        sbLIZ2.append(f);
        c2216241Boc2.uu(C2188811AlT.LIZIZ(sbLIZ2));
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        vECameraCapture.LLJILJIL.startZoom(f, vECameraCapture);
    }

    @Override // X.C1DHX
    public final void M2(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z);
        this.LLJJJJLIIL.LJJJJZI(bundle);
    }

    @Override // X.C1DHX
    public final boolean N3(float f) {
        float f2;
        if (!a4()) {
            return false;
        }
        boolean zLJIIIZ = LJIIIZ();
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZOOM startZoom newZoom = ");
        sbLIZ.append(f);
        sbLIZ.append(", currentZoom = ");
        sbLIZ.append(this.LLLF);
        sbLIZ.append(", shouldUseShaderZoom:");
        sbLIZ.append(zLJIIIZ);
        sbLIZ.append(", isFrontCamera:");
        sbLIZ.append(this.LLLIL);
        c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ));
        C1DIN c1dinX3 = X3();
        float f3 = this.LLJL;
        getCameraPosition();
        c1dinX3.LJFF(f3);
        C1DIN c1dinX32 = X3();
        getCameraPosition();
        c1dinX32.LJ();
        float fMax = Math.max(Math.min(this.LLJL, f), 0.0f);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ZOOM startZoom zoomUpperLimit:");
        sbLIZ2.append(f3);
        sbLIZ2.append(", zoomBottomLimit:");
        sbLIZ2.append(0.0f);
        sbLIZ2.append(", maxZoom:");
        sbLIZ2.append(this.LLJL);
        sbLIZ2.append(", zoomTemp:");
        sbLIZ2.append(fMax);
        c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ2));
        if (0.0f > fMax || fMax > f3) {
            return false;
        }
        if (LJIIIZ() && this.LLLIL) {
            float f4 = this.LLJL;
            float f5 = 1;
            f2 = ((fMax / f4) * (f4 - f5)) + f5;
        } else {
            f2 = fMax;
        }
        LJIILL(f2);
        this.LLLF = fMax;
        return true;
    }

    @Override // X.C1DHX
    public final void O2(float f) {
        this.LLILLL.LJIIL().LJJIJIL(f);
    }

    @Override // X.C1DHX
    public final void O3(int i) {
        this.LLLJIL = i;
    }

    @Override // X.C1DHX
    public final void R3(int i) {
        LLLLIIIILLL = i;
    }

    @Override // X.C1DHX
    public final int U3(Cert cert) {
        int iLIZIZ;
        if (getCameraPosition() == 1) {
            iLIZIZ = X3().LJI();
        } else {
            iLIZIZ = X3().LIZIZ();
        }
        I4(iLIZIZ, null, cert);
        return iLIZIZ;
    }

    @Override // X.C1DHX
    public final void W3(C1448340nnE c1448340nnE) {
        synchronized (this.LLJ) {
            try {
                C1DIK c1dik = this.LLJI;
                if (c1dik != null) {
                    this.LLJ.remove(c1dik);
                }
                this.LLJ.add(c1448340nnE);
                this.LLJI = c1448340nnE;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DHX
    public final void Y3(InterfaceC2253351DHp interfaceC2253351DHp) {
        if (interfaceC2253351DHp == null) {
            return;
        }
        this.LLLILZLLLI.remove(interfaceC2253351DHp);
    }

    @Override // X.C1DHX
    public final void Z3(InterfaceC1780680wRG interfaceC1780680wRG) {
        C0CNO.LIZLLL(0L, new AwS436S0200000_35(this, interfaceC1780680wRG, 34));
    }

    @Override // X.C1DHX
    public final void b4(Cert cert) {
        this.LLLL = null;
        this.LLJJJJLIIL.LJJLIIIJILLIZJL(cert);
        InterfaceC1660900tK4 interfaceC1660900tK4 = this.LLJJI;
        if (interfaceC1660900tK4 != null) {
            ((j) interfaceC1660900tK4).LIZJ(EnumC1778340wNU.OPEN_CAMERA, cert);
        }
    }

    @Override // X.C1DHX
    public final void d4(boolean z) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.setCameraAntiShake(z);
        builder.setRetryCnt(this.LLILZ.LJIJI());
        this.LLJJLIIIJLLLLLLLZ = builder.build();
        this.LLLL = null;
    }

    @Override // X.C1DHX
    public final void g4(C1649180t1A c1649180t1A) {
        this.LLJJJJLIIL.LJJJLIIL(c1649180t1A);
    }

    @Override // X.C1DHX
    public final void h4(C1DIT c1dit) {
        this.LLJLILLLLZIIL = c1dit;
        this.LLLL = null;
        this.LLILLL.LJJIIJ(c1dit);
    }

    @Override // X.C1DHX
    public final boolean i4(VESize vESize) {
        return this.LLJJJJLIIL.LJIL(vESize);
    }

    @Override // X.C1DHX
    public final void k4(int[] iArr) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.setFpsRange(iArr);
        this.LLJJLIIIJLLLLLLLZ = builder.build();
        this.LLLL = null;
    }

    @Override // X.C1DHX
    public final void m4(InterfaceC2253331DHn interfaceC2253331DHn) {
        this.LLJILJIL.add(interfaceC2253331DHn);
    }

    @Override // X.C1DHX
    public final void o4(InterfaceC2253351DHp interfaceC2253351DHp) {
        if (interfaceC2253351DHp == null) {
            return;
        }
        this.LLLILZLLLI.add(interfaceC2253351DHp);
    }

    @Override // X.C1DHX
    public final void p4(InterfaceC1780680wRG interfaceC1780680wRG) {
        C0CNO.LIZLLL(0L, new AwS436S0200000_35(this, interfaceC1780680wRG, 35));
    }

    @Override // X.C1DHX
    public final boolean q4(VEFocusSettings vEFocusSettings) {
        if (this.LLLIIIL) {
            this.LLLII = System.currentTimeMillis();
        }
        if (this.LLJJJJLIIL.LJJIIJ(vEFocusSettings) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C1DHX
    public final int r4(Cert cert) {
        int iLJJL;
        synchronized (this.LLJJJ) {
            try {
                if (this.LLJJJIL) {
                    this.LLILLL.LJJIZ(this.LLJJJJLIIL);
                    InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
                    if (interfaceC2240011Clr != null) {
                        interfaceC2240011Clr.LJIJJLI();
                    }
                    this.LLJJLIIIJLLLLLLLZ.setCameraFacing(VECameraSettings.CAMERA_FACING_ID.FACING_FRONT);
                    iLJJL = this.LLJJJJLIIL.LJJL(this.LLJJLIIIJLLLLLLLZ.getCameraFacing(), cert);
                    this.LLLIILIL = getCameraPosition();
                } else {
                    iLJJL = 0;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJL;
    }

    @Override // X.C1DHX
    public final void setBodyBeautyLevel(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i);
        this.LLJJJJLIIL.LJJJJZI(bundle);
    }

    @Override // X.C1DHX
    public final void setCameraPreviewSizeInterface(C1DIF c1dif) {
        this.LLJILLL = c1dif;
    }

    @Override // X.C1DHX
    public final void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr) {
        this.LLJJ = interfaceC2240011Clr;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LJIIJ(new InterfaceC19771312Xf() { // from class: X.1DIR
                @Override // X.InterfaceC19771312Xf
                public final void onAppBackground() {
                    this.LIZ.LLJJJJLIIL.LJJJJJL();
                }

                @Override // X.InterfaceC19771312Xf
                public final void onAppForeground() {
                    this.LIZ.LLJJJJLIIL.LJJJJL();
                }
            });
        }
    }

    @Override // X.C1DHX
    public final void setExposureCompensation(int i) {
        this.LLJJJJLIIL.LJJJJZ(i);
    }

    @Override // X.C1DHX
    public final void setRecordMode(EnumC2249691D3n enumC2249691D3n) {
        int i;
        this.LLLL = null;
        VERecorder vERecorder = this.LLILLL;
        switch (C2249701D3o.LIZ[enumC2249691D3n.ordinal()]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = -1;
                break;
            case 7:
                i = -2;
                break;
            case 8:
                i = C386801es.DEFAULT;
                break;
            default:
                throw new C1954807lC();
        }
        vERecorder.LIZIZ.LJJJ.LJJIII("RecordMode", i);
    }

    @Override // X.C1DHX
    public final void setSATZoomListener(InterfaceC1673870tez interfaceC1673870tez) {
        this.LLJJJJLIIL.LJJJLL(interfaceC1673870tez);
    }

    @Override // X.C1DHX
    public final void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4) {
        this.LLJJI = interfaceC1660900tK4;
    }

    @Override // X.C1DHX
    public final void t4(InterfaceC2253331DHn interfaceC2253331DHn) {
        this.LLJILJIL.remove(interfaceC2253331DHn);
    }

    @Override // X.C1DHX
    public final void u4(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        this.LLLILZJ = interfaceC1631620sYq;
    }

    @Override // X.C1DHX
    public final void v4(InterfaceC2253251DHf interfaceC2253251DHf) {
        if (interfaceC2253251DHf != null) {
            this.LLJIJIL.remove(interfaceC2253251DHf);
        }
    }

    @Override // X.C1DHX
    public final void w4(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_ai_night_video", z);
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.setCameraAiNightVideo(z);
        this.LLJJLIIIJLLLLLLLZ = builder.build();
        this.LLJJJJLIIL.LJJJJZI(bundle);
    }

    @Override // X.C1DHX
    public final void x4(Function1<? super VECameraSettings.Builder, Unit> function1) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        function1.invoke(builder);
        VECameraSettings vECameraSettingsBuild = builder.build();
        boolean z = true;
        if (vECameraSettingsBuild.getCameraFacing().ordinal() != 1) {
            z = false;
        }
        this.LLLIL = z;
        this.LLJJLIIIJLLLLLLLZ = vECameraSettingsBuild;
        this.LLLL = null;
    }

    @Override // X.C1DHX
    public final boolean K3(float f, float f2) {
        if (!a4() || !f4()) {
            return false;
        }
        if (LJIIJ()) {
            if (!a4()) {
                return false;
            }
            VECameraCapture vECameraCapture = this.LLJJJJLIIL;
            vECameraCapture.LLJILJIL.zoomV2(f2, vECameraCapture);
            return true;
        }
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZOOM scaleCamera distanceDelta = ");
        sbLIZ.append(f);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return N3(Math.max(0.0f, ((this.LLJL / LSPassThroughRecordSizeConfig.DEFAULT) * f) + this.LLLF));
    }

    @Override // X.C1DHX
    public final void P3(float[] fArr, double d) {
        this.LLILLL.LJIIL().LJIL(fArr, d);
    }

    @Override // X.C1DHX
    public final void c4(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("async: ");
        sbLIZ.append(z);
        sbLIZ.append(", policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_CLOSE_CAMERA", C2188811AlT.LIZIZ(sbLIZ));
        C2219091BtD.LIZLLL().i("CameraCapturePreOpener: realClose");
        synchronized (this.LLJJJ) {
            try {
                this.LLJJJJJIL = false;
                this.LLJJJJLIIL.LIZ();
                InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
                if (interfaceC2240011Clr != null) {
                    interfaceC2240011Clr.LJIJI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJJJJLIIL.LJJI(z, cert);
        InterfaceC2240011Clr interfaceC2240011Clr2 = this.LLJJ;
        if (interfaceC2240011Clr2 != null) {
            interfaceC2240011Clr2.LJI();
        }
        if (!((Boolean) C0BJ1.LIZ.getValue()).booleanValue()) {
            this.LLJJJJLIIL.LLIZLLLIL = null;
        }
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        vECameraCapture.LLIZ = null;
        vECameraCapture.LJJJLL(null);
        this.LLJILJIL.clear();
        this.LLJJJJJIL = false;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = -1;
        C2253341DHo.LIZ = -1;
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    @Override // X.C1DHX
    public final void n4(C1AIY c1aiy, Cert cert) {
        this.LLLL = null;
        this.LLJJJJLIIL.LJJLIIIJ(c1aiy, cert);
        InterfaceC1660900tK4 interfaceC1660900tK4 = this.LLJJI;
        if (interfaceC1660900tK4 != null) {
            ((j) interfaceC1660900tK4).LIZJ(EnumC1778340wNU.OPEN_CAMERA, cert);
        }
    }

    @Override // X.C1DHX
    public final void y4(C1660560tJW c1660560tJW, Function1 function1) {
        VECameraSettings.CAMERA_FACING_ID cameraFacing = this.LLJJLIIIJLLLLLLLZ.getCameraFacing();
        VECameraSettings vECameraSettingsLIZ = C2253511DIf.LIZ(c1660560tJW, function1);
        vECameraSettingsLIZ.setCameraFacing(cameraFacing);
        this.LLJJLIIIJLLLLLLLZ = vECameraSettingsLIZ;
        this.LLLL = null;
        LJIIL(cameraFacing);
        J4(new InterfaceC2253251DHf() { // from class: X.1DIG
            @Override // X.InterfaceC2253251DHf
            public final void LIZJ() {
                this.LIZ.LJIIJJI();
                this.LIZ.v4(this);
                VECameraController vECameraController = this.LIZ;
                VECameraSettings vECameraSettings = vECameraController.LLJJLIIIJLLLLLLLZ;
                float f = vECameraSettings.mDefaultZoomRatio;
                vECameraController.LLLF = f;
                vECameraController.LLLFF = f;
                vECameraSettings.mDefaultZoomRatio = 1.0f;
            }
        });
        this.LLJJJJLIIL.LJIJJLI(this.LLJJLIIIJLLLLLLLZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // X.C1DHX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F4(boolean r5, java.lang.Boolean r6, com.bytedance.bpea.basics.Cert r7) {
        /*
            r4 = this;
            X.1DIF r2 = r4.LLJILLL
            if (r2 == 0) goto Lb
            int r1 = r4.LLJJIII
            int r0 = r4.LLJJIJI
            r2.LIZ(r1, r0)
        Lb:
            java.lang.Object r3 = r4.LLJJJ
            monitor-enter(r3)
            boolean r0 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5d
            if (r5 == 0) goto L22
            com.ss.android.vesdk.VERecorder r1 = r4.LLILLL     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraCapture r0 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L60
            r1.LJJIZ(r0)     // Catch: java.lang.Throwable -> L60
            X.1Clr r0 = r4.LLJJ     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L22
            r0.LJIJJLI()     // Catch: java.lang.Throwable -> L60
        L22:
            int r0 = r4.getCameraPosition()     // Catch: java.lang.Throwable -> L60
            r4.LLLIILIL = r0     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraCapture r0 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraSettings r0 = r0.LL     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID r0 = r0.getCameraFacing()     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID r1 = com.ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5d
            com.ss.android.vesdk.VECameraSettings r0 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L60
            r0.setCameraFacing(r1)     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraCapture r1 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraSettings r0 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L60
            com.ss.android.vesdk.VECameraSettings$CAMERA_FACING_ID r0 = r0.getCameraFacing()     // Catch: java.lang.Throwable -> L60
            int r2 = r1.LJJL(r0, r7)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L5e
            boolean r0 = r6.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L55
            com.ss.android.vesdk.VERecorder r1 = r4.LLILLL     // Catch: java.lang.Throwable -> L60
            X.1DIT r0 = X.C1DIT.FRONT_PRIMARY     // Catch: java.lang.Throwable -> L60
            r1.LJJIIJ(r0)     // Catch: java.lang.Throwable -> L60
            goto L5e
        L55:
            com.ss.android.vesdk.VERecorder r1 = r4.LLILLL     // Catch: java.lang.Throwable -> L60
            X.1DIT r0 = X.C1DIT.BACK_PRIMARY     // Catch: java.lang.Throwable -> L60
            r1.LJJIIJ(r0)     // Catch: java.lang.Throwable -> L60
            goto L5e
        L5d:
            r2 = 0
        L5e:
            monitor-exit(r3)
            return r2
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.camera.VECameraController.F4(boolean, java.lang.Boolean, com.bytedance.bpea.basics.Cert):int");
    }

    @Override // X.C1DHX
    public final void I4(int i, final InterfaceC2253331DHn interfaceC2253331DHn, Cert cert) {
        if (LJIIIZ() && this.LLLIL) {
            LJIILL(1.0f);
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLLIL = z;
        m4(new InterfaceC2253331DHn() { // from class: X.1DHt
            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i2) {
                this.t4(this);
                VECameraController vECameraController = this;
                vECameraController.LLL = 0.0f;
                vECameraController.LLLF = 0.0f;
                InterfaceC2253331DHn interfaceC2253331DHn2 = interfaceC2253331DHn;
                if (interfaceC2253331DHn2 != null) {
                    interfaceC2253331DHn2.LIZIZ(i2);
                }
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i2, int i3, String str) {
                this.t4(this);
                VECameraController vECameraController = this;
                vECameraController.LLL = 0.0f;
                vECameraController.LLLF = 0.0f;
                InterfaceC2253331DHn interfaceC2253331DHn2 = interfaceC2253331DHn;
                if (interfaceC2253331DHn2 != null) {
                    interfaceC2253331DHn2.LIZ(i2, i3, str);
                }
            }
        });
        VECameraSettings.CAMERA_FACING_ID camera_facing_idLIZ = C1A84.LIZ(i);
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.setCameraFacing(camera_facing_idLIZ);
        builder.setRetryCnt(this.LLILZ.LJIJI());
        builder.setDefaultZoomRatio(1.0f);
        this.LLJJLIIIJLLLLLLLZ = builder.build();
        this.LLLL = null;
        LJIIL(camera_facing_idLIZ);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("camera_switch VECameraController changeCamera cameraIndex:");
        sbLIZ.append(i);
        sbLIZ.append(", facingId:");
        sbLIZ.append(camera_facing_idLIZ);
        sbLIZ.append(", cameraSettings.cameraFacing:");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ.getCameraFacing());
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJLIIL.LJJLI(this.LLJJLIIIJLLLLLLLZ, cert);
        InterfaceC1660900tK4 interfaceC1660900tK4 = this.LLJJI;
        if (interfaceC1660900tK4 != null) {
            ((j) interfaceC1660900tK4).LIZJ(EnumC1778340wNU.OPEN_CAMERA, cert);
        }
    }

    public final void LJIILIIL(C1DIX c1dix, EnumC19366110pf enumC19366110pf, EnumC2244671CtN enumC2244671CtN) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
        builder.setFpsMode(c1dix);
        builder.setFaceAEStrategy(enumC19366110pf);
        builder.enableStabilization(enumC2244671CtN);
        this.LLJJLIIIJLLLLLLLZ = builder.build();
        this.LLLL = null;
    }

    @Override // X.C1DHX
    public final void M4(final C1DHQ c1dhq, Cert cert, float f) {
        LJIILJJIL();
        this.LLJJLIIIJLLLLLLLZ.mDefaultZoomRatio = f;
        this.LLLL = null;
        m4(new InterfaceC2253331DHn() { // from class: X.1DHq
            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i) {
                InterfaceC2253331DHn interfaceC2253331DHn = c1dhq;
                if (interfaceC2253331DHn != null) {
                    interfaceC2253331DHn.LIZIZ(i);
                }
                this.t4(this);
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i, int i2, String str) {
                InterfaceC2253331DHn interfaceC2253331DHn = c1dhq;
                if (interfaceC2253331DHn != null) {
                    interfaceC2253331DHn.LIZ(i, i2, str);
                }
                this.t4(this);
            }
        });
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        vECameraCapture.LLIZ = new C1DIP(this);
        vECameraCapture.LLIZLLLIL = new C1DIE(this, true);
        vECameraCapture.LJJLI(this.LLJJLIIIJLLLLLLLZ, cert);
    }

    @Override // X.C1DHX
    public final void D4(int i, final InterfaceC2253331DHn interfaceC2253331DHn, Cert cert, float f) {
        LJII().LIZ();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLLIL = z;
        this.LLJJLIIIJLLLLLLLZ.setCameraFacing(C1A84.LIZ(i));
        LJIILJJIL();
        this.LLJJLIIIJLLLLLLLZ.mDefaultZoomRatio = f;
        this.LLLL = null;
        LJIIL(this.LLJJLIIIJLLLLLLLZ.getCameraFacing());
        if ((((Boolean) C257340A6q.LIZ.getValue()).booleanValue() && LJIIIIZZ()) || ((Boolean) C257330A6p.LIZ.getValue()).booleanValue()) {
            LJIILIIL(C1DIX.LOW_POWER, EnumC19366110pf.DISABLE_FACEAE, EnumC2244671CtN.OFF);
        } else if (((Boolean) C257320A6o.LIZ.getValue()).booleanValue()) {
            LJIILIIL(C1DIX.HIGH_FPS, EnumC19366110pf.ENABLE_FACEAE_FOR_ALL, EnumC2244671CtN.EIS_OIS);
        }
        if (((Boolean) C257350A6r.LIZ.getValue()).booleanValue()) {
            VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LLJJLIIIJLLLLLLLZ);
            builder.setFaceAEStrategy(EnumC19366110pf.DISABLE_FACEAE);
            this.LLJJLIIIJLLLLLLLZ = builder.build();
            this.LLLL = null;
        }
        LJII().LIZJ(C786410Ut5.N3(this.LL), this.LLJJLIIIJLLLLLLLZ);
        m4(new InterfaceC2253331DHn() { // from class: X.1DI2
            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i2) {
                InterfaceC2253451DHz interfaceC2253451DHz = this.LLIZ;
                if (interfaceC2253451DHz != null) {
                    interfaceC2253451DHz.LIZ("camera_open");
                }
                InterfaceC2253331DHn interfaceC2253331DHn2 = interfaceC2253331DHn;
                if (interfaceC2253331DHn2 != null) {
                    interfaceC2253331DHn2.LIZIZ(i2);
                }
                this.t4(this);
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i2, int i3, String str) {
                InterfaceC2253331DHn interfaceC2253331DHn2 = interfaceC2253331DHn;
                if (interfaceC2253331DHn2 != null) {
                    interfaceC2253331DHn2.LIZ(i2, i3, str);
                }
                this.t4(this);
            }
        });
        LJII().LJI(new C1DIP(this));
        LJII().LJFF(new C1DIE(this, false));
        LJII().openCamera(cert);
        LJII().LIZIZ();
        InterfaceC2240011Clr interfaceC2240011Clr = this.LLJJ;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LIZLLL();
        }
        InterfaceC1660900tK4 interfaceC1660900tK4 = this.LLJJI;
        if (interfaceC1660900tK4 != null) {
            ((j) interfaceC1660900tK4).LIZJ(EnumC1778340wNU.OPEN_CAMERA, cert);
        }
    }

    @Override // X.C1DHX
    public final int V3(int i, int i2, Integer num, final Function0 function0) {
        int i3 = this.LLLLII;
        if (i3 != -1) {
            this.LLILLL.LIZIZ.LJJIZ.removeTrackFilter(i3);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" => VEBlur # , remove blur, ratioIndex is ");
            sbLIZ.append(this.LLLLII);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            this.LLLLII = -1;
        }
        VEBlurFilterParam vEBlurFilterParam = new VEBlurFilterParam();
        vEBlurFilterParam.intensity = 3.0f;
        vEBlurFilterParam.height = i2;
        vEBlurFilterParam.width = i;
        if (num != null) {
            vEBlurFilterParam.lastFacing = num.intValue();
        }
        vEBlurFilterParam.callback = new C1DIW() { // from class: X.1DIS
            @Override // X.C1DIW
            public final void LIZ() {
                C0CNO.LIZLLL(0L, new AwS579S0100000_35(function0, (Function0<Unit>) 410));
            }
        };
        int iAddTrackFilter = this.LLILLL.LIZIZ.LJJIZ.addTrackFilter(0, 0, vEBlurFilterParam, 0, LSPassThroughRecordSizeConfig.DEFAULT);
        this.LLLLII = iAddTrackFilter;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" => VEBlur # , add blur, ratioIndex is ");
        sbLIZ2.append(this.LLLLII);
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
        return iAddTrackFilter;
    }

    @Override // X.C1DHX
    public final boolean z4(int i, float f, float[] fArr, int i2) {
        if (fArr.length < 2) {
            return false;
        }
        if (this.LLLIIIL) {
            this.LLLII = System.currentTimeMillis();
        }
        VECameraCapture vECameraCapture = this.LLJJJJLIIL;
        if (vECameraCapture.LLJILJIL.focusAtPoint(i, i2, f, (int) fArr[0], (int) fArr[1]) != 0) {
            return false;
        }
        return true;
    }

    public VECameraController(Context context, LifecycleOwner lifecycleOwner, VERecorder vERecorder, InterfaceC2253521DIg interfaceC2253521DIg, C2253301DHk c2253301DHk, Function0<Boolean> function0, InterfaceC2253451DHz interfaceC2253451DHz) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = vERecorder;
        this.LLILZ = interfaceC2253521DIg;
        this.LLILZIL = c2253301DHk;
        this.LLILZLL = function0;
        this.LLIZ = interfaceC2253451DHz;
        synchronized (C1622880sKk.LIZ) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CameraCapturePreOpener:popCameraCapture ");
            sbLIZ.append((Object) null);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJJJJLIIL = new VECameraCapture();
        this.LLJJL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 117));
        this.LLJJLIIIJLLLLLLLZ = C2253511DIf.LIZ(interfaceC2253521DIg, AFwS283S0000000_35.get$arr$(15));
        this.LLJL = -1.0f;
        this.LLJLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 118));
        this.LLJLILLLLZIIL = C1DIT.NONE;
        this.LLJZ = true;
        this.LLJZIJLIL = new ArrayList();
        this.LLLFF = 1.0f;
        this.LLLFFI = true;
        this.LLLFZ = -1;
        this.LLLI = 1;
        this.LLLIIIIL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLLIILIL = getCameraPosition();
        this.LLLILZ = new ArrayList();
        this.LLLILZLLLI = C1664790tQL.LIZJ();
        this.LLLIZZ = AFwS226S0000000_35.get$arr$(104);
        this.LLLJ = AFwS226S0000000_35.get$arr$(105);
        C0CNO.LIZLLL(0L, new AwS579S0100000_35(this, 116));
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.LLLJL = sparseIntArray;
        this.LLLLII = -1;
    }
}
