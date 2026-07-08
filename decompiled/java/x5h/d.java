package x5h;

import X.AbstractC214814194y;
import X.AbstractC578660Mmm;
import X.C01GW;
import X.C05XL;
import X.C090F;
import X.C099F;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0LFI;
import X.C0VSJ;
import X.C13LE;
import X.C1631190sY9;
import X.C1664740tQG;
import X.C19EG;
import X.C1AO7;
import X.C1AO8;
import X.C1DRG;
import X.C2217381BqS;
import X.C2243608qg;
import X.C2254411DLr;
import X.C23250099c;
import X.C23260099m;
import X.C2477909nN;
import X.C373801cm;
import X.C443120HZe;
import X.C452501pT;
import X.C577920Mla;
import X.C578640Mmk;
import X.C578760Mmw;
import X.C578870Mn7;
import X.C579140MnY;
import X.EnumC1780180wQS;
import X.EnumC578750Mmv;
import X.EnumC578800Mn0;
import X.InterfaceC1364105Vn;
import X.InterfaceC1644770su3;
import X.InterfaceC1647420syK;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC2173471A4j;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import ln3.a;
import lnn.q;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends AbstractC578660Mmm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJ;
    public final C1DRG LJIILJJIL;
    public final C01GW LJIILL;
    public final C1631190sY9 LJIILLIIL;
    public final InterfaceC1648570t0B LJIIZILJ;
    public final C01GW LJIJ;
    public final C1664740tQG LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public boolean LJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(d.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJIJJLI.getValue()).booleanValue();
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext, Bitmap bitmap) {
        NowsShootModel nowsShootModel = shortVideoContext.creativeModel.nowsShootModel;
        if (nowsShootModel != null) {
            C579140MnY.LIZ(shortVideoContext.creativeInfo, nowsShootModel, bitmap, !this.LIZJ.invoke().Ue(), new C577920Mla(shortVideoContext, this));
        }
    }

    public static Object LJ(Bitmap bitmap, String str, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (bitmap == null) {
            C2243608qg.LIZ(null, c23260099m);
        } else {
            C2477909nN.LJI(bitmap, str, Bitmap.CompressFormat.JPEG, 0, 4);
            C2243608qg.LIZ(str, c23260099m);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC578770Mmx
    public final void LIZ(Function0<Unit> function0, Function1<? super Boolean, Unit> function1, C578760Mmw c578760Mmw) {
        String str;
        if (!this.LJII.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ((Handler) this.LJIIJ.getValue()).postDelayed((Runnable) this.LJIIL.getValue(), 600L);
        if (c578760Mmw != null && (str = c578760Mmw.LIZ) != null) {
            ((C0LFI) this.LJIJ.getValue()).LIZ = str;
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LJIILL.getValue(), null, null, new C578640Mmk(this, c578760Mmw, arrayList, function1, function0, jCurrentTimeMillis, null), 3);
    }

    public final void LJFF(int i, int i2, boolean z, final long j, final C05XL<C443120HZe<Bitmap, Long, Boolean>> c05xl, final C05XL<Pair<Bitmap, Long>> c05xl2) {
        this.LIZJ.invoke().u92().LIZIZ().LJJIJ(i, i2, new InterfaceC2173471A4j() { // from class: X.09oI
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i3, Bitmap bitmap) {
                Integer numValueOf;
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OptimizeTakePhotoProcessor shotScreen onResult ");
                sbLIZ.append(i3);
                sbLIZ.append(' ');
                Integer numValueOf2 = null;
                if (bitmap != null) {
                    numValueOf = Integer.valueOf(bitmap.getWidth());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(' ');
                if (bitmap != null) {
                    numValueOf2 = Integer.valueOf(bitmap.getHeight());
                }
                sbLIZ.append(numValueOf2);
                C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                if (!c05xl.isCompleted()) {
                    c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.FALSE));
                }
            }
        }, z, new VERecorder.IVEFrameShotScreenCallback() { // from class: X.0Mmn
            @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
            public final void onShotScreen(VEFrame vEFrame, int i3) {
                Bitmap bitmap;
                if (!c05xl2.isCompleted()) {
                    C05XL<Pair<Bitmap, Long>> c05xl3 = c05xl2;
                    if (vEFrame != null) {
                        bitmap = vEFrame.toBitmap();
                    } else {
                        bitmap = null;
                    }
                    c05xl3.LJIIZILJ(new Pair<>(bitmap, Long.valueOf(System.currentTimeMillis() - j)));
                }
            }
        });
    }

    public final void LJI(final int i, final int i2, final boolean z, final long j, final String str, final ShortVideoContext shortVideoContext, final C05XL<C443120HZe<Bitmap, Long, Boolean>> c05xl, final C05XL<Pair<Bitmap, Long>> c05xl2) {
        VESize vESize = new VESize(i, i2);
        final C099F c099fLIZIZ = C090F.LIZIZ();
        C578870Mn7 c578870Mn7 = new C578870Mn7();
        C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
        C2254411DLr c2254411DLr = c578870Mn7.LIZ;
        c2254411DLr.LIZ = c1ao8;
        c2254411DLr.LJ = EnumC578750Mmv.FULL_EFFECT;
        c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
        c2254411DLr.LIZIZ = vESize;
        c2254411DLr.LJII = new C1AO7() { // from class: X.0Mmt
            @Override // X.C1AO7
            public final /* synthetic */ void LIZ(int i3, int i4, int[] iArr) {
            }

            @Override // X.C1AO7
            public final void onResult(int i3) {
                boolean z2;
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OptimizeTakePhotoProcessor save bitmap onResult ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sbLIZ.append(i3);
                C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                ShortVideoContext shortVideoContext2 = shortVideoContext;
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C578720Mms.LIZ(shortVideoContext2, z2, i3);
                if (i3 != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("take photo save error: ");
                    sbLIZ2.append(i3);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                String str2 = str;
                if (str2 != null) {
                    c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                    C373801cm.LIZIZ(str2);
                }
            }

            @Override // X.C1AO7
            public final void LIZIZ(VEFrame vEFrame, int i3) {
                VEFrame.FrameBase frame;
                Bitmap bitmap;
                Integer numValueOf;
                boolean z2;
                Integer numValueOf2 = null;
                if (vEFrame != null) {
                    frame = vEFrame.getFrame();
                } else {
                    frame = null;
                }
                boolean z3 = frame instanceof VEFrame.TextureDescFrame;
                if (vEFrame != null) {
                    try {
                        bitmap = vEFrame.toBitmap();
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201967140v c201967140v = C201967140v.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("OptimizeTakePhotoProcessor failed to toBitmap ");
                        sbLIZ.append(e);
                        C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                C201967140v c201967140v2 = C201967140v.LIZIZ;
                StringBuilder sb = new StringBuilder("OptimizeTakePhotoProcessor take photo onResult ");
                sb.append(i3);
                sb.append(' ');
                sb.append(z3);
                sb.append(' ');
                if (bitmap != null) {
                    numValueOf = Integer.valueOf(bitmap.getWidth());
                } else {
                    numValueOf = null;
                }
                sb.append(numValueOf);
                sb.append(' ');
                if (bitmap != null) {
                    numValueOf2 = Integer.valueOf(bitmap.getHeight());
                }
                sb.append(numValueOf2);
                C201955140j.LJIILJJIL(c201967140v2, sb.toString());
                ShortVideoContext shortVideoContext2 = shortVideoContext;
                boolean z4 = true;
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bitmap == null) {
                    z4 = false;
                }
                C578720Mms.LIZJ(shortVideoContext2, z2, i3, z4);
                if (str != null) {
                    if (i3 == 0 && bitmap != null) {
                        if (!c05xl.isCompleted()) {
                            c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.TRUE));
                            return;
                        }
                        return;
                    } else {
                        C201955140j.LJII(c201967140v2, "OptimizeTakePhotoProcessor  Failed to share texture");
                        C373801cm.LIZIZ(str);
                        if (this.LIZJ()) {
                            this.LJI(i, i2, z, j, null, shortVideoContext, c05xl, c05xl2);
                            return;
                        } else {
                            this.LJFF(i, i2, z, j, c05xl, c05xl2);
                            return;
                        }
                    }
                }
                if (!c05xl.isCompleted()) {
                    c05xl.LJIIZILJ(new C443120HZe<>(bitmap, Long.valueOf(System.currentTimeMillis() - j), Boolean.FALSE));
                }
            }
        };
        if (str != null) {
            c2254411DLr.LJIILIIL = EnumC578800Mn0.TEXTURE;
            c2254411DLr.LJIILL = str;
            C373801cm.LIZ(str, c099fLIZIZ);
        }
        this.LIZJ.invoke().u92().LIZIZ().LJIIJJI(c578870Mn7.LIZ);
    }

    public d(C19EG c19eg, Function0<? extends q> function0, Function0<? extends InterfaceC1650230t2r> function02, Function0<? extends ShortVideoContext> function03, Function0<? extends InterfaceC1644770su3> function04, Function0<? extends a> function05, Function0<? extends InterfaceC1647420syK> function06, LifecycleOwner lifecycleOwner, boolean z, C1DRG c1drg) {
        super(c19eg, function0, function02, function03, function04, function05, function06, lifecycleOwner, z);
        this.LJIILJJIL = c1drg;
        this.LJIILL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(617));
        this.LJIILLIIL = (C1631190sY9) c1drg.LJIIL("lazyControlProgressConfig", C1631190sY9.class);
        this.LJIIZILJ = (InterfaceC1648570t0B) c1drg.LJIIL(null, InterfaceC1648570t0B.class);
        this.LJIJ = C452501pT.LIZIZ(new AwS552S0100000_8(function03, (Function0<Unit>) 1115));
        this.LJIJI = new C1664740tQG(c1drg.LJIILIIL(null, AbstractC214814194y.class), AbstractC214814194y.class);
        this.LJIJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1116));
        this.LJIJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(618));
    }
}
