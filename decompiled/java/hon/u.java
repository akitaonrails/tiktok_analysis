package hon;

import X.AbstractC1651430t4n;
import X.C09R3;
import X.C1390380mHk;
import X.C13LE;
import X.C1624200sMs;
import X.C1624570sNT;
import X.C1645630svR;
import X.C1654400t9a;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19A3;
import X.C19EG;
import X.C1DPV;
import X.C1DPW;
import X.C1DRG;
import X.C2217381BqS;
import X.C297890Blz;
import X.EnumC1651310t4b;
import X.EnumC1651770t5L;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625000sOA;
import X.InterfaceC1650230t2r;
import X.InterfaceC2217461Bqa;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS117S0100000_17;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class u extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final LifecycleOwner LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664750tQH LLJ;
    public boolean LLJI;
    public final EnumC1651770t5L LLJIJIL;
    public final EnumC1651310t4b LLJILJIL;
    public final AwS569S0100000_25 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(u.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(u.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(u.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final InterfaceC1650230t2r LJIJJLI() {
        return (InterfaceC1650230t2r) this.LLIZ.getValue(this, LLJILLL[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        LJIJJLI().ok0().LIZ(this.LLILZLL, new AObjectS246S0100000_25(this, 693));
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651310t4b LJII() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1651430t4n
    public final void LJIILLIIL(View view) {
        if (!C297890Blz.LIZ()) {
            view.animate().rotationBy(180.0f).setDuration(200L).withStartAction(new ARunnableS117S0100000_17(view, 176)).withEndAction(new ARunnableS117S0100000_17(view, 177));
        }
    }

    @Override // X.AbstractC1651430t4n
    public final void LJIJI(C1654400t9a c1654400t9a) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if (!this.LLJI) {
            return;
        }
        C1664740tQG c1664740tQG = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1625000sOA != null && (interfaceC1624480sNKC0 = interfaceC1625000sOA.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        if (C1624570sNT.LJIJ(effectLLILIL)) {
            return;
        }
        Activity activity = (Activity) this.LLJ.getValue(this, interfaceC2217461BqaArr[2]);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131845839);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZ(activity, 1071, creativeToastBuilder);
    }

    public u(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = c19a3;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLJIJIL = EnumC1651770t5L.REVERSE_CAMERA;
        this.LLJILJIL = EnumC1651310t4b.FIXED;
        this.LLJILJILJ = new AwS569S0100000_25(this, 811);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZLLL(C1654400t9a c1654400t9a, Object obj) {
        LJIJI(c1654400t9a);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        super.LIZ(c1654400t9a, i3Var);
        if (C1645630svR.LIZ) {
            return;
        }
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) this.LLIZLLLIL.getValue(this, LLJILLL[1]);
        if (interfaceC1625000sOA != null && (interfaceC1624480sNKC0 = interfaceC1625000sOA.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        if (C1624200sMs.LJIIJJI(effectLLILIL)) {
            LJIJJLI().yZ0();
        } else {
            LJIJJLI().AF2(false);
            LJIJJLI().Cd(false, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_TOOL_BAR_DEFAULT, null), "shoot_icon");
        }
    }
}
