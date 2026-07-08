package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C05P1;
import X.C09IC;
import X.C0C64;
import X.C0HM9;
import X.C0JEX;
import X.C0JEY;
import X.C0MBB;
import X.C0MXE;
import X.C0TVI;
import X.C0ZDN;
import X.C13D2;
import X.C13FE;
import X.C13LE;
import X.C13ZC;
import X.C14K9;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668170tVn;
import X.C1669430tXp;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1672220tcK;
import X.C1675980tiO;
import X.C1680190tpB;
import X.C1680510tph;
import X.C1682430tsn;
import X.C1684420tw0;
import X.C1684430tw1;
import X.C1684490tw7;
import X.C1684510tw9;
import X.C1684810twd;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685910tyP;
import X.C1693430uAX;
import X.C1698030uHx;
import X.C19719212De;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20088213iq;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2344009Gk;
import X.C566110MIf;
import X.EnumC1427810nG7;
import X.EnumC1684470tw5;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1916320zy2;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS120S0201000_8;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class AimeCameraScene extends AIGCBaseCameraScene {
    public static final /* synthetic */ int LLLF = 0;
    public final C0JEX LLJZ = C0JEY.LIZ(this, C13LE.LIZ(AimeCameraViewModel.class), new AwS552S0100000_8(new AwS569S0100000_25((Scene) this, 289), (Function0<Unit>) 192), new AwS552S0100000_8(this, 193));
    public final IComplianceBusinessService LLJZIJLIL = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);
    public final boolean LLL = true;

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLLJIL() {
        C566110MIf c566110MIf = C566110MIf.LIZ;
        boolean z = this.LLJLIL;
        c566110MIf.getClass();
        C566110MIf.LIZJ = z ? 1 : 0;
        if (this.LLJLIL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "aime_face_verify_page");
            C20684815ws.LJIILLIIL("aime_beauty_cam_pullup", c2344009Gk.LIZ);
        }
    }

    public final AimeCameraViewModel LLLLLZ() {
        return (AimeCameraViewModel) this.LLJZ.getValue();
    }

    public final void LLLLLZL() {
        if (!this.LLJLLIL) {
            LLLLLLIL();
        }
        C1684810twd c1684810twd = this.LLJJIJIL;
        if (c1684810twd != null) {
            AimeCameraViewModel aimeCameraViewModelLLLLLZ = LLLLLZ();
            int i = C1684490tw7.LIZ[((C1684510tw9) aimeCameraViewModelLLLLLZ.LLIZ.getValue()).LIZ.ordinal()];
            if (i == 1 || i == 2) {
                aimeCameraViewModelLLLLLZ.LLJILJIL = 0;
                aimeCameraViewModelLLLLLZ.LLILZLL.setValue(new C1684510tw9(EnumC1684470tw5.INIT, null));
                aimeCameraViewModelLLLLLZ.vQ2(c1684810twd);
            }
        }
        C566110MIf.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "aime_face_verify_page");
        C20684815ws.LJIILLIIL("face_verify_retake", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        LLLLLLJ(true);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 288);
        if (C0HM9.LIZ) {
            getLifecycle().addObserver(this.LLJZIJLIL.LJJJJLI(requireContext(), 2131833819, "", "", "", new InterfaceC1916320zy2() { // from class: X.0twO
                @Override // X.InterfaceC1916320zy2
                public final boolean goBack() {
                    return false;
                }

                @Override // X.InterfaceC1916320zy2
                public final void LIZ() {
                    awS569S0100000_25.invoke();
                }
            }));
        } else {
            awS569S0100000_25.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final boolean LLLLJI() {
        return this.LLL;
    }

    public static final C1684510tw9 LLLLLLLLL(C05P1<C1684510tw9> c05p1) {
        return c05p1.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLL(boolean z) {
        Object value;
        AimeCameraViewModel aimeCameraViewModelLLLLLZ = LLLLLZ();
        if (!z) {
            C2252321DDq c2252321DDq = aimeCameraViewModelLLLLLZ.LLILZLL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1684510tw9.LIZ((C1684510tw9) value, EnumC1684470tw5.NO_CAMERA_PERMISSION, null, 2)));
            return;
        }
        aimeCameraViewModelLLLLLZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLLILLIL(C1684810twd c1684810twd) {
        Object value;
        AimeCameraViewModel aimeCameraViewModelLLLLLZ = LLLLLZ();
        if (aimeCameraViewModelLLLLLZ.LL) {
            aimeCameraViewModelLLLLLZ.vQ2(c1684810twd);
            return;
        }
        C2252321DDq c2252321DDq = aimeCameraViewModelLLLLLZ.LLILZLL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1684510tw9.LIZ((C1684510tw9) value, EnumC1684470tw5.TAP_TO_START, null, 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLL(X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene.LLLLLLL(X.0tpg, int):void");
    }

    public final void LLLLLLLLLL(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1805025841);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aime_camera_debug_preview", true) == 1) {
            C1684420tw0.LIZ((C1684430tw1) C20028913Yh.LIZ(C09IC.LJJIIZ(LLLLLZ().LLJ, 400L), new C1684430tw1(0), null, c13zcLJIIJ, 0, 2).getValue(), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 26);
        }
    }

    public final void LLLLLLZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-669707503);
        if ((i & 1) == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            k.LIZ(C1675980tiO.LIZIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).D2).getValue()).LIZ, C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 27);
        }
    }

    public final void LLLLLLZZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1910374139);
        if ((i & 1) == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                FillElement fillElement = c.LIZJ;
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS266S0000000_25.get$arr$(145);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1668170tVn.LIZ(fillElement, (Function1) objLJJ, c13zcLJIIJ, 54);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131825879, c13zcLJIIJ), c.LJIJJ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), null, 3), 0L, new C1693430uAX(((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).LJJIIJ).getValue()).LIZ, C1682430tsn.LIZLLL(32.0f), C1680190tpB.LLJ, null, null, 0L, null, 0, 0L, 16777208), 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2036);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 28);
        }
    }

    public final void LLLLLLLZIL(C1684510tw9 c1684510tw9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-156843998);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1684510tw9)) {
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
        } else {
            String str = c1684510tw9.LIZIZ;
            if (str != null) {
                C1684420tw0.LJIIIZ(6, c13zcLJIIJ, c.LIZLLL(InterfaceC1685750ty9.LIZ), str);
                Context context = getContext();
                if (context != null) {
                    new C0ZDN(context).LIZ(0);
                }
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS120S0201000_8(this, c1684510tw9, i, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroupOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        composeView.setBackgroundColor(0);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(-634123020, new AwS639S0100000_25(this, 44), true));
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(composeView, new C0TVI() { // from class: X.0tw8
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        viewGroupOnCreateView.addView(composeView);
        requireFragmentActivity().getOnBackPressedDispatcher().LIZ(this, new C1698030uHx(this, 0));
        return viewGroupOnCreateView;
    }
}
