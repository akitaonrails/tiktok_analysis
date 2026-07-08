package y5o;

import X.AbstractC1664490tPr;
import X.AnonymousClass0951;
import X.C01GW;
import X.C05NP;
import X.C05NQ;
import X.C05NR;
import X.C05P0;
import X.C05P1;
import X.C05VA;
import X.C09IC;
import X.C0C64;
import X.C0MXE;
import X.C0PEM;
import X.C1296870jqv;
import X.C1350305Qf;
import X.C1351210lGZ;
import X.C1359305Tr;
import X.C13D2;
import X.C13ZC;
import X.C1450005ly;
import X.C1450105lz;
import X.C1627490sSB;
import X.C1627820sSi;
import X.C1627850sSl;
import X.C1665370tRH;
import X.C1665380tRI;
import X.C1665430tRN;
import X.C1665710tRp;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1666200tSc;
import X.C1668040tVa;
import X.C1668490tWJ;
import X.C1668650tWZ;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1672220tcK;
import X.C1679720toQ;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1690080u58;
import X.C19719212De;
import X.C19990113Jj;
import X.C19990313Jl;
import X.C1BNE;
import X.C1DFH;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23271099x;
import X.C452501pT;
import X.C786410Ut5;
import X.C861640Xr8;
import X.EnumC1427810nG7;
import X.EnumC19990213Jk;
import X.InterfaceC1627880sSo;
import X.InterfaceC1627890sSp;
import X.InterfaceC1665500tRU;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC2217451BqZ;
import X.InterfaceC497601wk;
import X.ViewOnLayoutChangeListenerC1698100uI4;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0721000_25;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS20S0111000_25;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS5S0311000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class n0 extends AbstractC1664490tPr<C1627850sSl, C1627820sSi> {
    public static final long LLJLILLLLZIIL = C19990313Jl.LJII(100, EnumC19990213Jk.MILLISECONDS);
    public static final /* synthetic */ int LLJLL = 0;
    public final C2252321DDq LLJJJIL;
    public final AnonymousClass0951 LLJJJJ;
    public final C2252321DDq LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C2252321DDq LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public long LLJLIL;

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        this.LLJJJJJIL.setValue(Boolean.TRUE);
    }

    public n0() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1668650tWZ(0));
        this.LLJJJIL = c2252321DDqLIZ;
        this.LLJJJJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJJJJJIL = C1BNE.LIZ(Boolean.TRUE);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1156));
        this.LLJJL = C1BNE.LIZ(null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1157));
        this.LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(589));
        this.LLJLIL = C19990313Jl.LJIIIIZZ(System.currentTimeMillis(), EnumC19990213Jk.MILLISECONDS);
    }

    public final void LLLLLLZZ() {
        long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(System.currentTimeMillis(), EnumC19990213Jk.MILLISECONDS);
        if (C19990113Jj.LJI(C19990113Jj.LJIIZILJ(jLJIIIIZZ, this.LLJLIL), LLJLILLLLZIIL) > 0) {
            this.LLJLIL = jLJIIIIZZ;
            ((C1351210lGZ) this.LLJJJJLIIL.getValue()).LIZ();
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLJJJJJIL.setValue(Boolean.TRUE);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View view;
        float f;
        super.onActivityCreated(bundle);
        boolean z = !C1627490sSB.LIZ().recordAboveWhenEmpty;
        Scene scene = this.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            if (z) {
                f = -1.0f;
            } else {
                f = -3.0f;
            }
            view.setElevation(f);
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1627850sSl) obj).LIZJ;
            }
        }, new AwS604S0100000_25(this, 938));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1627850sSl) obj).LIZLLL;
            }
        }, new AwS604S0100000_25(this, 939));
        C861640Xr8 c861640Xr8 = new C861640Xr8(new C05VA(this, null), LLLLILI().LIZ.LJFF);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C09IC.LJJI(C2296808zG.LJII(lifecycleScope, C2107308Nj.LIZ.LLIILII()), c861640Xr8);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1669670tYD.LJ((ComposeView) view, EnumC1427810nG7.Auto, new C19719212De(-32802747, new AwS639S0100000_25(this, 165), true));
        View view2 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view2 != null) {
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1698100uI4(this, 7));
        }
        Rect rect = new Rect();
        View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view3 != null && view3.getGlobalVisibleRect(rect)) {
            this.LLJJL.setValue(rect);
        }
    }

    public final void LLLLLLZ(boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1082305425);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (z) {
            C1665790tRx.LIZ(C1679720toQ.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), Unit.LIZ, C1359305Tr.LL), c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS20S0111000_25(this, z, i, 7);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireSceneContext(), null, 6);
        C786410Ut5.k6(composeView, new ViewGroup.LayoutParams(-1, -1));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLL(boolean r33, X.InterfaceC1627870sSn r34, X.InterfaceC1680500tpg r35, int r36) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5o.n0.LLLLLL(boolean, X.0sSn, X.0tpg, int):void");
    }

    public final void LLLLLLLLLL(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1665500tRU interfaceC1665500tRU) {
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1939821822);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1665500tRU);
            }
            if (zLJII) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = LLLLIL().LIZIZ;
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1666200tSc.LIZ(interfaceC1665500tRU, i, 74, 56, c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), (Function1) objLJJ, LLLLIL().LJIIJ, c13zcLJIIJ, (i3 & 14) | 224640 | (i3 & 112));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(this, (n0) interfaceC1665500tRU, (InterfaceC1665500tRU<? extends InterfaceC1627880sSo>) i, i2, 19);
        }
    }

    public final void LLLLLLIL(C05NR<Unit> c05nr, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(766196394);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c05nr);
            } else {
                zLJII = c13zcLJIIJ.LJII(c05nr);
            }
            if (zLJII) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (z) {
            c13zcLJIIJ.LJJIIJZLJL(-1994239261);
            c13zcLJIIJ.LJJJJL(false);
        } else if (c05nr instanceof C05NQ) {
            c13zcLJIIJ.LJJIIJZLJL(-1994153608);
            C1665710tRp.LIZ(100 - ((C05NQ) c05nr).LIZ, C1670400tZO.LIZIZ(c13zcLJIIJ).x2(), interfaceC1685750ty9, c13zcLJIIJ, i2 & 896, 0);
            c13zcLJIIJ.LJJJJL(false);
        } else if (c05nr instanceof C05NP) {
            c13zcLJIIJ.LJJIIJZLJL(-1993843856);
            c13zcLJIIJ = c13zcLJIIJ;
            C1665430tRN.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).w2(), interfaceC1685750ty9, LLLLIL().LJIIIZ, c13zcLJIIJ, (i2 >> 3) & 112);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-1993610984);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS5S0311000_25(this, (n0) c05nr, (C05NR<Unit>) z, (boolean) interfaceC1685750ty9, (InterfaceC1685750ty9) i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLJ(X.C05P1<? extends X.C05NR<kotlin.Unit>> r17, boolean r18, X.InterfaceC1685750ty9 r19, X.InterfaceC1680500tpg r20, int r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5o.n0.LLLLLLJ(X.05P1, boolean, X.0ty9, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLZIL(android.graphics.Rect r17, boolean r18, X.InterfaceC1685750ty9 r19, X.InterfaceC1680500tpg r20, int r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5o.n0.LLLLLLLZIL(android.graphics.Rect, boolean, X.0ty9, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLL(X.InterfaceC1665500tRU<? extends X.InterfaceC1627890sSp> r25, boolean r26, X.C1350305Qf r27, X.C05NR<kotlin.Unit> r28, boolean r29, X.InterfaceC1680500tpg r30, int r31) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5o.n0.LLLLLLL(X.0tRU, boolean, X.05Qf, X.05NR, boolean, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL(X.InterfaceC1665500tRU<? extends X.InterfaceC1627890sSp> r25, boolean r26, X.C1350305Qf r27, X.C05P1<? extends X.C05NR<kotlin.Unit>> r28, boolean r29, X.InterfaceC1680500tpg r30, int r31) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5o.n0.LLLLLLLLL(X.0tRU, boolean, X.05Qf, X.05P1, boolean, X.0tpg, int):void");
    }

    public final void LLLLLJIL(InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1690080u58 c1690080u58, C1350305Qf c1350305Qf, Function1<? super Integer, Unit> function1, C05NR<Unit> c05nr, boolean z2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z3;
        C13ZC c13zc;
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean zLJII2;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1427759457);
        InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU2 = interfaceC1665500tRU;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU2);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(interfaceC1665500tRU2);
            }
            if (zLJII2) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690080u58)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1350305Qf)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        Function1<? super Integer, Unit> function12 = function1;
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if ((262144 & i) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c05nr);
            } else {
                zLJII = c13zcLJIIJ.LJII(c05nr);
            }
            if (zLJII) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        boolean z4 = z2;
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(this.LLJJJJJIL, c13zcLJIIJ, 0);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Boolean.valueOf(z4), c13zcLJIIJ);
            Function1<Integer, Unit> function13 = ((C1627820sSi) LLLLIL()).LJ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i2 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function13) | z3 | c13zcLJIIJ.LJJIIJ(interfaceC497601wk);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS101S0400000_2(interfaceC497601wk, c05p0LJIIIIZZ, c1690080u58, this, 16);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function1 function14 = (Function1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                float f = 56;
                float f2 = 74;
                float fLJIILL = C0C64.LJIILLIIL().LJIILL(31744, "fling_config", true, 0.5f);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv);
                boolean zBooleanValue = ((Boolean) c05p0LIZIZ.getValue()).booleanValue();
                Function2<Integer, Float, Unit> function2 = ((C1627820sSi) LLLLIL()).LJI;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII3 = c13zcLJIIJ.LJII(this);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJII3 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C1665370tRH(this);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                InterfaceC2217451BqZ interfaceC2217451BqZ = (InterfaceC2217451BqZ) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII4 = c13zcLJIIJ.LJII(this);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJII4 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new C1450005ly(this);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                int i12 = i2 << 12;
                function12 = function12;
                z4 = z4;
                interfaceC1665500tRU2 = interfaceC1665500tRU2;
                C1668490tWJ.LJII(interfaceC1665500tRU2, z, f, f2, fLJIILL, c1350305Qf, c1690080u58, interfaceC1685750ty9LIZIZ, function12, (Function1) interfaceC2217451BqZ, function14, zBooleanValue, function2, z4, (Function1) ((InterfaceC2217451BqZ) objLJJ4), ((C1627820sSi) LLLLIL()).LJII, ((C1627820sSi) LLLLIL()).LJIIIIZZ, ((C1627820sSi) LLLLIL()).LJIIL, c13zcLJIIJ, (i2 & 14) | 3456 | (i2 & 112) | (458752 & (i2 << 6)) | (3670016 & i12) | (i12 & 234881024), (i2 >> 9) & 7168, 0);
                boolean zLIZIZ = c1690080u58.LIZIZ();
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), f2);
                int i13 = i2 >> 15;
                c13zc = c13zcLJIIJ;
                LLLLLLIL(c05nr, zLIZIZ, interfaceC1685750ty9LJIILIIL, c13zcLJIIJ, (i13 & 14) | (i13 & 7168));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0721000_25(this, (n0) interfaceC1665500tRU2, (InterfaceC1665500tRU<? extends InterfaceC1627890sSp>) z, (boolean) c1690080u58, (C1690080u58) c1350305Qf, (C1350305Qf) function12, (Function1<? super Integer, Unit>) c05nr, (C05NR<Unit>) z4, (boolean) interfaceC1685750ty9, (InterfaceC1685750ty9) i, 0);
        }
    }

    public final void LLLLLJLJLL(InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1690080u58 c1690080u58, C1350305Qf c1350305Qf, Function1<? super Integer, Unit> function1, C05P1<? extends C05NR<Unit>> c05p1, boolean z2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean zLJII;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-652762497);
        InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU2 = interfaceC1665500tRU;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU2);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1665500tRU2);
            }
            if (zLJII) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690080u58)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1350305Qf)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        Function1<? super Integer, Unit> function12 = function1;
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        boolean z4 = z2;
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(this.LLJJJJJIL, c13zcLJIIJ, 0);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Boolean.valueOf(z4), c13zcLJIIJ);
            Function1<Integer, Unit> function13 = ((C1627820sSi) LLLLIL()).LJ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i2 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function13) | z3 | c13zcLJIIJ.LJJIIJ(interfaceC497601wk);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS101S0400000_2(interfaceC497601wk, c05p0LJIIIIZZ, c1690080u58, this, 17);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function1 function14 = (Function1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                float f = 56;
                float f2 = 74;
                float fLJIILL = C0C64.LJIILLIIL().LJIILL(31744, "fling_config", true, 0.5f);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv);
                boolean zBooleanValue = ((Boolean) c05p0LIZIZ.getValue()).booleanValue();
                Function2<Integer, Float, Unit> function2 = ((C1627820sSi) LLLLIL()).LJI;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII2 = c13zcLJIIJ.LJII(this);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJII2 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C1665380tRI(this);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                InterfaceC2217451BqZ interfaceC2217451BqZ = (InterfaceC2217451BqZ) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII3 = c13zcLJIIJ.LJII(this);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJII3 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new C1450105lz(this);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                int i12 = i2 << 12;
                function12 = function12;
                z4 = z4;
                interfaceC1665500tRU2 = interfaceC1665500tRU2;
                C1668490tWJ.LJII(interfaceC1665500tRU2, z, f, f2, fLJIILL, c1350305Qf, c1690080u58, interfaceC1685750ty9LIZIZ, function12, (Function1) interfaceC2217451BqZ, function14, zBooleanValue, function2, z4, (Function1) ((InterfaceC2217451BqZ) objLJJ4), ((C1627820sSi) LLLLIL()).LJII, ((C1627820sSi) LLLLIL()).LJIIIIZZ, ((C1627820sSi) LLLLIL()).LJIIL, c13zcLJIIJ, (i2 & 14) | 3456 | (i2 & 112) | (458752 & (i2 << 6)) | (3670016 & i12) | (i12 & 234881024), (i2 >> 9) & 7168, 0);
                int i13 = i2 >> 15;
                LLLLLLJ(c05p1, c1690080u58.LIZIZ(), c.LJIILIIL(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), f2), c13zcLJIIJ, (i13 & 14) | (i13 & 7168));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0721000_25(this, (n0) interfaceC1665500tRU2, (InterfaceC1665500tRU<? extends InterfaceC1627890sSp>) z, (boolean) c1690080u58, (C1690080u58) c1350305Qf, (C1350305Qf) function12, (Function1<? super Integer, Unit>) c05p1, (C05P1<? extends C05NR<Unit>>) z4, (boolean) interfaceC1685750ty9, (InterfaceC1685750ty9) i, 1);
        }
    }
}
